
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
object item extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Project,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(project: Project):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.20*/("""

<li data-project=""""),_display_(Seq[Any](/*3.20*/project/*3.27*/.id)),format.raw/*3.30*/("""">
    <a class="name" href="#"""),_display_(Seq[Any](/*4.29*/routes/*4.35*/.Tasks.index(project.id))),format.raw/*4.59*/("""">"""),_display_(Seq[Any](/*4.62*/project/*4.69*/.name)),format.raw/*4.74*/("""</a>
    <button class="delete" href=""""),_display_(Seq[Any](/*5.35*/routes/*5.41*/.Projects.delete(project.id))),format.raw/*5.69*/("""">Delete</button>
    <span class="loader">Loading</span>
</li>
"""))}
    }
    
    def render(project:Project) = apply(project)
    
    def f:((Project) => play.api.templates.Html) = (project) => apply(project)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 06 07:02:16 CDT 2012
                    SOURCE: /Users/Dave/Documents/workspace/PlaySamples/java/zentasks/app/views/projects/item.scala.html
                    HASH: c5f53f3e65fa40d8496c010da881c99d29982dd9
                    MATRIX: 764->1|859->19|915->40|930->47|954->50|1020->81|1034->87|1079->111|1117->114|1132->121|1158->126|1232->165|1246->171|1295->199
                    LINES: 27->1|30->1|32->3|32->3|32->3|33->4|33->4|33->4|33->4|33->4|33->4|34->5|34->5|34->5
                    -- GENERATED --
                */
            