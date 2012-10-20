
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Project,List[Task],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(project: Project, tasks: List[Task]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.39*/("""

<header>
    <hgroup>
        <h1>"""),_display_(Seq[Any](/*5.14*/project/*5.21*/.folder)),format.raw/*5.28*/("""</h1>
        <h2>"""),_display_(Seq[Any](/*6.14*/project/*6.21*/.name)),format.raw/*6.26*/("""</h2>
    </hgroup>
    <dl class="users">
        <dt>Project's team</dt>
        <dd>
            <div class="wrap">
                <h3>Team mates</h3>
                <div class="list">
                    """),_display_(Seq[Any](/*14.22*/project/*14.29*/.members.map/*14.41*/ { user =>_display_(Seq[Any](format.raw/*14.51*/("""
                        <dl data-user-id=""""),_display_(Seq[Any](/*15.44*/user/*15.48*/.email)),format.raw/*15.54*/("""">
                            <dt>"""),_display_(Seq[Any](/*16.34*/user/*16.38*/.name)),format.raw/*16.43*/(""" <span>("""),_display_(Seq[Any](/*16.52*/user/*16.56*/.email)),format.raw/*16.62*/(""")</span></dt>
                            <dd class="action">Action</dd>
                        </dl>
                    """)))})),format.raw/*19.22*/("""
                </div>
                <h3>Add a team mate</h3>
                <div class="addUserList">
                    """),_display_(Seq[Any](/*23.22*/User/*23.26*/.findAll.diff(project.members).map/*23.60*/ { user =>_display_(Seq[Any](format.raw/*23.70*/("""
                        <dl data-user-id=""""),_display_(Seq[Any](/*24.44*/user/*24.48*/.email)),format.raw/*24.54*/("""">
                            <dt>"""),_display_(Seq[Any](/*25.34*/user/*25.38*/.name)),format.raw/*25.43*/(""" <span>("""),_display_(Seq[Any](/*25.52*/user/*25.56*/.email)),format.raw/*25.62*/(""")</span></dt>
                            <dd class="action">Action</dd>
                        </dl>
                    """)))})),format.raw/*28.22*/("""
                </div>
            </div>
        </dd>
    </dl>
</header>
<article  class="tasks" id="tasks">
    """),_display_(Seq[Any](/*35.6*/tasks/*35.11*/.groupBy(_.folder).map/*35.33*/ {/*36.9*/case (folder, tasks) =>/*36.32*/ {_display_(Seq[Any](format.raw/*36.34*/("""
            """),_display_(Seq[Any](/*37.14*/views/*37.19*/.html.tasks.folder(folder, tasks))),format.raw/*37.52*/("""
        """)))}})),format.raw/*39.6*/("""
    <a href="#newFolder" class="new newFolder">New folder</a>
</article>

"""))}
    }
    
    def render(project:Project,tasks:List[Task]) = apply(project,tasks)
    
    def f:((Project,List[Task]) => play.api.templates.Html) = (project,tasks) => apply(project,tasks)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 06 07:02:18 CDT 2012
                    SOURCE: /Users/Dave/Documents/workspace/PlaySamples/java/zentasks/app/views/tasks/index.scala.html
                    HASH: ca5808423196986435a6a73d1b2cd9998b7c7393
                    MATRIX: 773->1|887->38|959->75|974->82|1002->89|1056->108|1071->115|1097->120|1344->331|1360->338|1381->350|1429->360|1509->404|1522->408|1550->414|1622->450|1635->454|1662->459|1707->468|1720->472|1748->478|1904->602|2068->730|2081->734|2124->768|2172->778|2252->822|2265->826|2293->832|2365->868|2378->872|2405->877|2450->886|2463->890|2491->896|2647->1020|2800->1138|2814->1143|2845->1165|2855->1176|2887->1199|2927->1201|2977->1215|2991->1220|3046->1253|3088->1269
                    LINES: 27->1|30->1|34->5|34->5|34->5|35->6|35->6|35->6|43->14|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|45->16|45->16|45->16|48->19|52->23|52->23|52->23|52->23|53->24|53->24|53->24|54->25|54->25|54->25|54->25|54->25|54->25|57->28|64->35|64->35|64->35|64->36|64->36|64->36|65->37|65->37|65->37|66->39
                    -- GENERATED --
                */
            