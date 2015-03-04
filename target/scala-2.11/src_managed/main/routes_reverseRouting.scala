// @SOURCE:/Users/nutkaewnak/Documents/SoftSpec/Team2Big2Slim/conf/routes
// @HASH:5c5e58cce6ebac4864647ea6b3018eebbe3a8fa1
// @DATE:Thu Mar 05 01:49:27 ICT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:18
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:18
class ReverseAssets {


// @LINE:18
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:15
def group1(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "group1")
}
                        

// @LINE:9
def addProject(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "create")
}
                        

// @LINE:13
def getVoteResult(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "voteResult")
}
                        

// @LINE:7
def profile(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "profile")
}
                        

// @LINE:8
def createProject(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "creater")
}
                        

// @LINE:12
def vote(id:String): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "toVote" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("id", id)))))
}
                        

// @LINE:11
def voting(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "vote")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:18
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:18
class ReverseAssets {


// @LINE:18
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:15
def group1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.group1",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "group1"})
      }
   """
)
                        

// @LINE:9
def addProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addProject",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "create"})
      }
   """
)
                        

// @LINE:13
def getVoteResult : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getVoteResult",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "voteResult"})
      }
   """
)
                        

// @LINE:7
def profile : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.profile",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
      }
   """
)
                        

// @LINE:8
def createProject : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.createProject",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "creater"})
      }
   """
)
                        

// @LINE:12
def vote : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.vote",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "toVote" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:11
def voting : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.voting",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "vote"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:18
// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:18
class ReverseAssets {


// @LINE:18
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:15
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:15
def group1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.group1(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "group1", Seq(), "GET", """""", _prefix + """group1""")
)
                      

// @LINE:9
def addProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addProject(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addProject", Seq(), "GET", """""", _prefix + """create""")
)
                      

// @LINE:13
def getVoteResult(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getVoteResult(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getVoteResult", Seq(), "GET", """""", _prefix + """voteResult""")
)
                      

// @LINE:7
def profile(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.profile(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "profile", Seq(), "GET", """""", _prefix + """profile""")
)
                      

// @LINE:8
def createProject(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.createProject(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "createProject", Seq(), "POST", """""", _prefix + """creater""")
)
                      

// @LINE:12
def vote(id:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.vote(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "vote", Seq(classOf[String]), "POST", """""", _prefix + """toVote""")
)
                      

// @LINE:11
def voting(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.voting(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "voting", Seq(), "GET", """""", _prefix + """vote""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    