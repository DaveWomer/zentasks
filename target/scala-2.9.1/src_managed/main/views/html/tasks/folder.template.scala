
package views.html.tasks

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
object folder extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Task],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(folder: String, tasks: List[Task]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""

<div class="folder" data-folder-id=""""),_display_(Seq[Any](/*3.38*/folder)),format.raw/*3.44*/("""">
    <header>
        <input type="checkbox" />
        <h3>"""),_display_(Seq[Any](/*6.14*/folder)),format.raw/*6.20*/("""</h3>
        <span class="counter"></span>
        <dl class="options">
            <dt>Options</dt>
            <dd>
                <a class="deleteCompleteTasks" href="#">Remove complete tasks</a>
                <a class="deleteAllTasks" href="#">Remove all tasks</a>
                <a class="deleteFolder" href="#">Delete folder</a>
            </dd>
        </dl>
        <span class="loader">Loading</span>
    </header>
    <ul class="list">
        """),_display_(Seq[Any](/*19.10*/tasks/*19.15*/.map/*19.19*/ { task =>_display_(Seq[Any](format.raw/*19.29*/("""
            """),_display_(Seq[Any](/*20.14*/views/*20.19*/.html.tasks.item( task ))),format.raw/*20.43*/("""
        """)))})),format.raw/*21.10*/("""
    </ul>
    <form class="addTask">
        <input type="hidden" name="folder" value=""""),_display_(Seq[Any](/*24.52*/folder)),format.raw/*24.58*/("""" />
        <input type="text" name="taskBody" placeholder="New task..." />
        <input type="text" name="dueDate" class="dueDate" placeholder="Due date: mm/dd/yy" />
        <div class="assignedTo">
            <input type="text" name="assignedTo" placeholder="Assign to..." />
        </div>
        <input type="submit" />
    </form>
</div>

"""))}
    }
    
    def render(folder:String,tasks:List[Task]) = apply(folder,tasks)
    
    def f:((String,List[Task]) => play.api.templates.Html) = (folder,tasks) => apply(folder,tasks)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 06 07:02:16 CDT 2012
                    SOURCE: /Users/Dave/Documents/workspace/PlaySamples/java/zentasks/app/views/tasks/folder.scala.html
                    HASH: 34a2d16a7c373cb8653dbe6f645eefaf14192af0
                    MATRIX: 773->1|885->36|959->75|986->81|1084->144|1111->150|1608->611|1622->616|1635->620|1683->630|1733->644|1747->649|1793->673|1835->683|1960->772|1988->778
                    LINES: 27->1|30->1|32->3|32->3|35->6|35->6|48->19|48->19|48->19|48->19|49->20|49->20|49->20|50->21|53->24|53->24
                    -- GENERATED --
                */
            