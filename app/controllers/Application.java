package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }
    public static Result hello() {
        return ok("<h1>Hello World!</h1>");
    }
    public static Result profile()  {
        return ok(profile.render());
    }

}
