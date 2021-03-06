package controllers;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;
import java.time.LocalDateTime;
import models.*;

public class Secured extends Security.Authenticator {
    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("userID");
    }

    @Override
    public Result onUnauthorized(Context ctx) {
        return redirect(routes.Login.login());
    }

}