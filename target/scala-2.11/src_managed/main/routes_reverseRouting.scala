// @SOURCE:/Users/nathakorn/Documents/Team2Big2Slim/conf/routes
// @HASH:a372eb87cac72058c708843595eafa412b09ad1a
// @DATE:Wed Apr 01 20:18:36 ICT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
class ReverseProjectList {


// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
def index(id:Long): Call = {
   (id: @unchecked) match {
// @LINE:13
case (id)  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + "profile/" + implicitly[PathBindable[Long]].unbind("id", id))
                                         
   }
}
                                                

}
                          

// @LINE:9
class ReverseAssets {


// @LINE:9
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:23
// @LINE:21
// @LINE:11
// @LINE:6
class ReverseApplication {


// @LINE:11
def hello(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "hello")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:23
def mockDatabase(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "install")
}
                        

// @LINE:21
def test(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "test")
}
                        

}
                          
}
                  


// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
class ReverseProjectList {


// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.ProjectList.index",
   """
      function(id) {
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "screenshot1/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "screenshot2/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "screenshot3/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
      }
   """
)
                        

}
              

// @LINE:9
class ReverseAssets {


// @LINE:9
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:23
// @LINE:21
// @LINE:11
// @LINE:6
class ReverseApplication {


// @LINE:11
def hello : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.hello",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello"})
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
                        

// @LINE:23
def mockDatabase : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.mockDatabase",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "install"})
      }
   """
)
                        

// @LINE:21
def test : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.test",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
   """
)
                        

}
              
}
        


// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
class ReverseProjectList {


// @LINE:13
def index(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.ProjectList.index(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.ProjectList", "index", Seq(classOf[Long]), "GET", """""", _prefix + """profile/$id<[^/]+>""")
)
                      

}
                          

// @LINE:9
class ReverseAssets {


// @LINE:9
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:23
// @LINE:21
// @LINE:11
// @LINE:6
class ReverseApplication {


// @LINE:11
def hello(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.hello(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "hello", Seq(), "GET", """""", _prefix + """hello""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:23
def mockDatabase(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.mockDatabase(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "mockDatabase", Seq(), "GET", """""", _prefix + """install""")
)
                      

// @LINE:21
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.test(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "test", Seq(), "GET", """""", _prefix + """test""")
)
                      

}
                          
}
        
    