
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object screenshot1 extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
    <title>Grand Theft Auto V</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

        <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
        <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <style>

    .Picture"""),format.raw/*16.13*/("""{"""),format.raw/*16.14*/("""
        """),format.raw/*17.9*/("""position:absolute;
        top:0px;
        left:0px;
    """),format.raw/*20.5*/("""}"""),format.raw/*20.6*/("""
    """),format.raw/*21.5*/(""".Button"""),format.raw/*21.12*/("""{"""),format.raw/*21.13*/("""
        """),format.raw/*22.9*/("""position:absolute;
        top:370px;
        left:250px;
    """),format.raw/*25.5*/("""}"""),format.raw/*25.6*/("""

    """),format.raw/*27.5*/("""</style>

    <head lang="en">
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <div class="row">
            <div class="col-sm-12">
                <div class = "Picture">
                    <p> <img src = "http://i.ytimg.com/vi/1gnbUusxRks/maxresdefault.jpg" style="width:600px;height:350px"> </p>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12">
                <div class = "Button">
                    <button type="button" class="btn btn-default -lg" onclick="location.href='http://localhost:9000/profile'">
                        <span class="glyphicon glyphicon-arrow-left" aria-hidden="true" ></span> Go Back</button>
                </div>
            </div>
        </div>
    </body>
</html>"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 25 21:42:15 ICT 2015
                  SOURCE: /Users/nathakorn/Documents/Team2Big2Slim/app/views/screenshot1.scala.html
                  HASH: e11c402b0698389b652079291e7f794bef4ea506
                  MATRIX: 804->0|1610->778|1639->779|1675->788|1760->846|1788->847|1820->852|1855->859|1884->860|1920->869|2009->931|2037->932|2070->938
                  LINES: 29->1|44->16|44->16|45->17|48->20|48->20|49->21|49->21|49->21|50->22|53->25|53->25|55->27
                  -- GENERATED --
              */
          