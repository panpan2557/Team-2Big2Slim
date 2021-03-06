package controllers;

import models.Project;
import models.RatingCriteria;
import models.User;

import models.VotingCriteria;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import utils.Time;
import views.html.*;
import org.mindrot.jbcrypt.BCrypt;


public class Admin extends Controller {

    @Security.Authenticated(Secured.class)
    public static Result adminIndex() {
        int currentUserID = Integer.parseInt(session().get("userID"));
        User currentUser = User.find.byId( currentUserID );

        if( currentUser.projectId == 99) {
            return ok(adminMain.render());
        }
        else {
            return redirect(routes.Application.index() );
        }
    }

    @Security.Authenticated(Secured.class)
    public static Result addUserPage() {
        int currentUserID = Integer.parseInt(session().get("userID"));
        User currentUser = User.find.byId( currentUserID );
        int size = Project.getSizeOfProjectList();

        System.out.println("Current ProjectList Size = " + size + "\n=====");

        if( currentUser.projectId == 99) {
            return ok(addUser.render(size));
        }
        else {
            return redirect(routes.Application.index() );
        }
    }
    public static Result addUser() {
        User newUser = Form.form(User.class).bindFromRequest().get();
		newUser.password = BCrypt.hashpw(newUser.password, BCrypt.gensalt());
        System.out.println("Username: " + newUser.username);
        System.out.println("Password: " + newUser.password);
        System.out.println("Name: " + newUser.name);
        System.out.println("ProjectID: " + newUser.projectId);
        System.out.println("KuNo: " + newUser.kuNo);
        System.out.println("----------------------------");

        newUser.save();

        return redirect( routes.Admin.addUserPage() );
    }

    @Security.Authenticated(Secured.class)
    public static Result addRatingCriteriaPage() {
        int currentUserID = Integer.parseInt(session().get("userID"));
        User currentUser = User.find.byId( currentUserID );

        if( currentUser.projectId == 99) {

            return ok(addRateCriteria.render());
        }
        return redirect(routes.Application.index() );
    }
    public static Result addRatingCriteria() {
        RatingCriteria newRatingCriteria = Form.form(RatingCriteria.class).bindFromRequest().get();
        System.out.println("RateCriteriaName: " + newRatingCriteria.criteriaName);

        newRatingCriteria.save();

        return redirect( routes.Admin.addRatingCriteriaPage() );
    }

    @Security.Authenticated(Secured.class)
    public static Result addVotingCriteriaPage() {
        int currentUserID = Integer.parseInt(session().get("userID"));
        User currentUser = User.find.byId( currentUserID );

        if( currentUser.projectId == 99) {
            return ok(addVoteCriteria.render());
        }
        return redirect(routes.Application.index() );
    }
    public static Result addVotingCriteria() {
        VotingCriteria newVotingCriteria = Form.form(VotingCriteria.class).bindFromRequest().get();
        System.out.println("VoteCriteriaName: " + newVotingCriteria.criteriaName);

        newVotingCriteria.save();

        return redirect( routes.Admin.addVotingCriteriaPage() );
    }

    @Security.Authenticated(Secured.class)
    public static Result addProjectPage() {
        return ok(addProject.render());
    }

    public static Result addProject() {
        DynamicForm projectF = new DynamicForm().bindFromRequest();
        int amount = Integer.parseInt(projectF.get("amount"));
        System.out.println("got = " + amount);

        for(int i = 0; i < amount; i++) {
            Project.createTemplate();
        }

        return ok(addProject.render());
    }

    @Security.Authenticated(Secured.class)
    public static Result adminEditProjectPage() {
        int size = Project.getSizeOfProjectList();
        return ok(adminEditProject.render(size));
    }

    public static Result adminEditProject() {
        DynamicForm projectF = new DynamicForm().bindFromRequest();
        int projectID = Integer.parseInt(projectF.get("ID"));

        Project editedProject = Project.getProjectByID(projectID);
        editedProject.projectName = projectF.get("projectName");
        editedProject.description = projectF.get("description");

        editedProject.save();

        int size = Project.getSizeOfProjectList();
        return ok(adminEditProject.render(size));
    }



    @Security.Authenticated(Secured.class)
    public static Result setTimePage() {
        return ok(changeDueTime.render());
    }

    public static Result changeDueTime() {
        TimeBundle timeForm = Form.form(TimeBundle.class).bindFromRequest().get();

        Time.setTime(timeForm.hour, timeForm.minute, timeForm.second);

        System.out.println("SetHour = " + Time.limitHour);
        System.out.println("SetMinute = " + Time.limitMinute);
        System.out.println("SetSecond = " + Time.limitSecond);
        System.out.println("====================================");



        return ok(changeDueTime.render());
    }

    public static class TimeBundle {
        public int hour;
        public int minute;
        public int second;
    }

}
