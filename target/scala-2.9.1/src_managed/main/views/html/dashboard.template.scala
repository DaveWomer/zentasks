
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object dashboard extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Project],List[Task],User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(projects: List[Project], todoTasks: List[Task], user: User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.62*/("""

"""),_display_(Seq[Any](/*3.2*/main(projects, user)/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    
    <header>
        <hgroup>
            <h1>Dashboard</h1>
            <h2>Tasks over all projects</h2>
        </hgroup>
    </header>
    
    <article  class="tasks">
        """),_display_(Seq[Any](/*13.10*/todoTasks/*13.19*/.groupBy(_.project).map/*13.42*/ {/*14.13*/case (project, tasks) =>/*14.37*/ {_display_(Seq[Any](format.raw/*14.39*/("""
                <div class="folder" data-folder-id=""""),_display_(Seq[Any](/*15.54*/project/*15.61*/.id)),format.raw/*15.64*/("""">
                    <header>
                        <h3><a href="#"""),_display_(Seq[Any](/*17.40*/routes/*17.46*/.Tasks.index(project.id))),format.raw/*17.70*/("""">"""),_display_(Seq[Any](/*17.73*/project/*17.80*/.name)),format.raw/*17.85*/("""</a></h3>
                        <span class="loader">Loading</span>
                    </header>
                    <ul class="list">
                        """),_display_(Seq[Any](/*21.26*/tasks/*21.31*/.map/*21.35*/ { task =>_display_(Seq[Any](format.raw/*21.45*/("""
                            """),_display_(Seq[Any](/*22.30*/views/*22.35*/.html.tasks.item(task, isEditable = false))),format.raw/*22.77*/("""
                        """)))})),format.raw/*23.26*/("""
                    </ul>
                </div>
            """)))}})),format.raw/*27.10*/("""
    </article>
    
""")))})),format.raw/*30.2*/("""

"""))}
    }
    
    def render(projects:List[Project],todoTasks:List[Task],user:User) = apply(projects,todoTasks,user)
    
    def f:((List[Project],List[Task],User) => play.api.templates.Html) = (projects,todoTasks,user) => apply(projects,todoTasks,user)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 06 07:02:10 CDT 2012
                    SOURCE: /Users/Dave/Documents/workspace/PlaySamples/java/zentasks/app/views/dashboard.scala.html
                    HASH: 6f09b3d749860f574cf0ced818f319daa33e3c2e
                    MATRIX: 782->1|919->61|956->64|984->84|1022->85|1245->272|1263->281|1295->304|1306->319|1339->343|1379->345|1469->399|1485->406|1510->409|1617->480|1632->486|1678->510|1717->513|1733->520|1760->525|1959->688|1973->693|1986->697|2034->707|2100->737|2114->742|2178->784|2236->810|2332->883|2385->905
                    LINES: 27->1|30->1|32->3|32->3|32->3|42->13|42->13|42->13|42->14|42->14|42->14|43->15|43->15|43->15|45->17|45->17|45->17|45->17|45->17|45->17|49->21|49->21|49->21|49->21|50->22|50->22|50->22|51->23|54->27|57->30
                    -- GENERATED --
                */
            