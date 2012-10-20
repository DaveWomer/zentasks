
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Project],User,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(projects: List[Project], user: User)(body: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.51*/("""

<html>
    <head>
        <title>Zentasks</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/main.css"))),format.raw/*7.110*/("""">
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*8.46*/routes/*8.52*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*8.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("javascripts/jquery-play-1.7.1.js"))),format.raw/*9.98*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*10.46*/routes/*10.52*/.Assets.at("javascripts/underscore-min.js"))),format.raw/*10.95*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*11.46*/routes/*11.52*/.Assets.at("javascripts/backbone-min.js"))),format.raw/*11.93*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*12.46*/routes/*12.52*/.Assets.at("javascripts/main.js"))),format.raw/*12.85*/(""""></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*13.46*/routes/*13.52*/.Application.javascriptRoutes)),format.raw/*13.81*/(""""></script>
    </head>
    <body>
        <header>
            <a href=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Projects.index)),format.raw/*17.44*/("""" id="logo"><span>Zen</span>tasks</a>
            <dl id="user">
                <dt>"""),_display_(Seq[Any](/*19.22*/user/*19.26*/.name)),format.raw/*19.31*/(""" <span>("""),_display_(Seq[Any](/*19.40*/user/*19.44*/.email)),format.raw/*19.50*/(""")</span></dt>
                <dd>
                    <a href=""""),_display_(Seq[Any](/*21.31*/routes/*21.37*/.Application.logout())),format.raw/*21.58*/("""">Logout</a>
                </dd>
            </dl>
        </header>
        <nav>
            <h4 class="dashboard"><a href="#/">Dashboard</a></h4>
            <ul id="projects">
                """),_display_(Seq[Any](/*28.18*/projects/*28.26*/.groupBy(_.folder).map/*28.48*/ {/*29.21*/case (group, projects) =>/*29.46*/ {_display_(Seq[Any](format.raw/*29.48*/("""
                        """),_display_(Seq[Any](/*30.26*/views/*30.31*/.html.projects.group(group, projects))),format.raw/*30.68*/("""
                    """)))}})),format.raw/*32.18*/("""
            </ul>
            <button id="newGroup">New group</button>
        </nav>
        <section id="main">
            """),_display_(Seq[Any](/*37.14*/body)),format.raw/*37.18*/("""
        </section>
    </body>
</html>

"""))}
    }
    
    def render(projects:List[Project],user:User,body:Html) = apply(projects,user)(body)
    
    def f:((List[Project],User) => (Html) => play.api.templates.Html) = (projects,user) => (body) => apply(projects,user)(body)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Oct 06 07:02:15 CDT 2012
                    SOURCE: /Users/Dave/Documents/workspace/PlaySamples/java/zentasks/app/views/main.scala.html
                    HASH: 8a252b5c6a41db8944ecd8a149f2c7c3bd7ccae6
                    MATRIX: 771->1|897->50|1042->160|1056->166|1109->198|1216->270|1230->276|1286->310|1369->358|1383->364|1445->405|1537->462|1551->468|1618->514|1711->571|1726->577|1791->620|1884->677|1899->683|1962->724|2055->781|2070->787|2125->820|2218->877|2233->883|2284->912|2394->986|2409->992|2446->1007|2568->1093|2581->1097|2608->1102|2653->1111|2666->1115|2694->1121|2795->1186|2810->1192|2853->1213|3088->1412|3105->1420|3136->1442|3147->1465|3181->1490|3221->1492|3283->1518|3297->1523|3356->1560|3411->1600|3575->1728|3601->1732
                    LINES: 27->1|30->1|35->6|35->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|46->17|46->17|46->17|48->19|48->19|48->19|48->19|48->19|48->19|50->21|50->21|50->21|57->28|57->28|57->28|57->29|57->29|57->29|58->30|58->30|58->30|59->32|64->37|64->37
                    -- GENERATED --
                */
            