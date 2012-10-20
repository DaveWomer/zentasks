
package views.html.projects

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
object group extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,List[Project],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(group: String, projects: List[Project]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.42*/("""

<li data-group=""""),_display_(Seq[Any](/*3.18*/group)),format.raw/*3.23*/("""">
    <span class="toggle"></span>
    <h4 class="groupName">"""),_display_(Seq[Any](/*5.28*/group)),format.raw/*5.33*/("""</h4>
    <span class="loader">Loading</span>
    <dl class="options">
        <dt>Options</dt>
        <dd>
            <button class="newProject">New project</button>
            <button class="deleteGroup">Remove group</button>
        </dd>
    </dl>
    <ul>
        """),_display_(Seq[Any](/*15.10*/projects/*15.18*/.map/*15.22*/ { project =>_display_(Seq[Any](format.raw/*15.35*/("""
            """),_display_(Seq[Any](/*16.14*/views/*16.19*/.html.projects.item(project))),format.raw/*16.47*/("""
        """)))})),format.raw/*17.10*/("""
    </ul>
</li>
"""))}
    }
    
    def render(group:String,projects:List[Project]) = apply(group,projects)
    
    def f:((String,List[Project]) => play.api.templates.Html) = (group,projects) => apply(group,projects)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 06 07:02:15 CDT 2012
                    SOURCE: /Users/Dave/Documents/workspace/PlaySamples/java/zentasks/app/views/projects/group.scala.html
                    HASH: 6bf42242f53aac586889bd96cb752bd7305cfa52
                    MATRIX: 778->1|895->41|949->60|975->65|1073->128|1099->133|1408->406|1425->414|1438->418|1489->431|1539->445|1553->450|1603->478|1645->488
                    LINES: 27->1|30->1|32->3|32->3|34->5|34->5|44->15|44->15|44->15|44->15|45->16|45->16|45->16|46->17
                    -- GENERATED --
                */
            