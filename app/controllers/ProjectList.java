package controllers;
/**  * Created by nathakorn on 3/26/15 AD.  */
import play.mvc.*;
import models.*;
import views.html.*;

import java.util.List;

public class ProjectList extends Controller {

    @Security.Authenticated(Secured.class)
    public static Result index(Integer id){
        Project project = Project.find.byId(id);

        List userList = User.find.where().eq("projectId", id).findList();
        List rcList = RatingCriteria.getAllRatingCriteria();

        int currentUserID = Integer.parseInt(session().get("userID"));
        System.out.println("Current User ID: " + currentUserID);

        return ok(profile.render(project,userList,rcList, currentUserID));
    }

    public static Result sc1(Integer id){
        Project project = Project.find.byId(id);
        return ok(screenshot1.render(project));
    }

    public static Result sc2(Integer id){
        Project project = Project.find.byId(id);
        return ok(screenshot2.render(project));
    }

    public static Result sc3(Integer id){
        Project project = Project.find.byId(id);
        return ok(screenshot3.render(project));
    }


}