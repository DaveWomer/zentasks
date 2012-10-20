
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
object item extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Task,Boolean,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(task: Task, isEditable: Boolean = true):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.42*/("""

<li data-task-id=""""),_display_(Seq[Any](/*3.20*/task/*3.24*/.id)),format.raw/*3.27*/("""">
    
    """),_display_(Seq[Any](/*5.6*/if(isEditable)/*5.20*/ {_display_(Seq[Any](format.raw/*5.22*/("""
        <input class="done" type="checkbox" """),_display_(Seq[Any](/*6.46*/(if(task.done) "checked"))),format.raw/*6.71*/(""" />
    """)))})),format.raw/*7.6*/("""
    
    <h4>"""),_display_(Seq[Any](/*9.10*/task/*9.14*/.title)),format.raw/*9.20*/("""</h4>
    
    """),_display_(Seq[Any](/*11.6*/if(task.dueDate != null)/*11.30*/ {_display_(Seq[Any](format.raw/*11.32*/("""
        <time datetime=""""),_display_(Seq[Any](/*12.26*/task/*12.30*/.dueDate)),format.raw/*12.38*/("""">"""),_display_(Seq[Any](/*12.41*/task/*12.45*/.dueDate.format("MMM dd yyyy"))),format.raw/*12.75*/("""</time>
    """)))})),format.raw/*13.6*/("""
    
    """),_display_(Seq[Any](/*15.6*/if(task.assignedTo != null && task.assignedTo.email != null)/*15.66*/ {_display_(Seq[Any](format.raw/*15.68*/("""
        <span class="assignedTo">"""),_display_(Seq[Any](/*16.35*/task/*16.39*/.assignedTo.email)),format.raw/*16.56*/("""</span>
    """)))})),format.raw/*17.6*/("""
    
    """),_display_(Seq[Any](/*19.6*/if(isEditable)/*19.20*/ {_display_(Seq[Any](format.raw/*19.22*/("""
        <a class="deleteTask" href=""""),_display_(Seq[Any](/*20.38*/routes/*20.44*/.Tasks.delete(task.id))),format.raw/*20.66*/("""">Delete task</a>
        <span class="loader">Loading</span>
    """)))})),format.raw/*22.6*/("""
    
</li>
"""))}
    }
    
    def render(task:Task,isEditable:Boolean) = apply(task,isEditable)
    
    def f:((Task,Boolean) => play.api.templates.Html) = (task,isEditable) => apply(task,isEditable)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 06 07:02:20 CDT 2012
                    SOURCE: /Users/Dave/Documents/workspace/PlaySamples/java/zentasks/app/views/tasks/item.scala.html
                    HASH: 62f5ccf4f484464c33473117df75b39a8985dcc0
                    MATRIX: 766->1|883->41|939->62|951->66|975->69|1022->82|1044->96|1083->98|1164->144|1210->169|1249->178|1299->193|1311->197|1338->203|1389->219|1422->243|1462->245|1524->271|1537->275|1567->283|1606->286|1619->290|1671->320|1715->333|1761->344|1830->404|1870->406|1941->441|1954->445|1993->462|2037->475|2083->486|2106->500|2146->502|2220->540|2235->546|2279->568|2377->635
                    LINES: 27->1|30->1|32->3|32->3|32->3|34->5|34->5|34->5|35->6|35->6|36->7|38->9|38->9|38->9|40->11|40->11|40->11|41->12|41->12|41->12|41->12|41->12|41->12|42->13|44->15|44->15|44->15|45->16|45->16|45->16|46->17|48->19|48->19|48->19|49->20|49->20|49->20|51->22
                    -- GENERATED --
                */
            