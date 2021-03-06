
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products", user)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
    <!-- Wrapper -->
    <section id="wrapper">

        <section id="products" class="wrapper spotlight style3">
                <div class="content">
                    <div class="row">
                        <div class="col-sm-2">
                            <h4>Categories</h4>
                            <div class="list-group">
                                    <!-- A link to display all products -->
                                <a href=""""),_display_(/*16.43*/routes/*16.49*/.HomeController.products(0)),format.raw/*16.76*/("""" class="list-group-item">All categories</a>

                                    <!-- Start of For loop - For each c in categories add a list item -->
                                    <!-- Also show the number of products in each category -->
                                """),_display_(/*20.34*/for(c <- categories) yield /*20.54*/ {_display_(Seq[Any](format.raw/*20.56*/("""
                                    """),format.raw/*21.37*/("""<a href=""""),_display_(/*21.47*/routes/*21.53*/.HomeController.products(c.getId)),format.raw/*21.86*/("""" class="list-group-item">"""),_display_(/*21.113*/c/*21.114*/.getName),format.raw/*21.122*/("""
                                    """),format.raw/*22.37*/("""<span class="badge">"""),_display_(/*22.58*/c/*22.59*/.getProducts.size()),format.raw/*22.78*/("""</span>
                                    </a>
                                """)))}),format.raw/*24.34*/("""
                            """),format.raw/*25.29*/("""</div>
                        </div>
                        <div class="col-sm-10">

                            """),_display_(/*29.30*/if(flash.containsKey("success"))/*29.62*/ {_display_(Seq[Any](format.raw/*29.64*/("""
                                """),format.raw/*30.33*/("""<div class="alert alert-success">
                                """),_display_(/*31.34*/flash/*31.39*/.get("success")),format.raw/*31.54*/("""
                                """),format.raw/*32.33*/("""</div>
                            """)))}),format.raw/*33.30*/("""
                                """),format.raw/*34.33*/("""<!-- Two -->
                            <section id="two" class="wrapper alt spotlight style2">
                                <div class="inner">
                                    <a href="#" class="image"><img src="images/pic02.jpg" alt="" /></a>
                                    <div class="content">
                                        <table class="table table-bordered table-hover table-condensed">
                                            <thead>
                                                    <!-- The header row-->
                                                <tr>
                                                    <th>ID</th>
                                                    <th>Name</th>
                                                    <th>Category</th>
                                                    <th>Description</th>
                                                    <th>Stock</th>
                                                    <th>Price</th>
                                                    <th>Available</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                    <!-- Product row(s) -->
                                                    <!-- Start of For loop - For each p in products add a row -->
                                                """),_display_(/*55.50*/for(p <- products) yield /*55.68*/ {_display_(Seq[Any](format.raw/*55.70*/("""
                                                    """),format.raw/*56.53*/("""<tr>
                                                        <td>"""),_display_(/*57.62*/p/*57.63*/.getId),format.raw/*57.69*/("""</td>
                                                        <td>"""),_display_(/*58.62*/p/*58.63*/.getName),format.raw/*58.71*/("""</td>
                                                        <td>"""),_display_(/*59.62*/p/*59.63*/.getCategory.getName),format.raw/*59.83*/("""</td>
                                                        <td>"""),_display_(/*60.62*/p/*60.63*/.getDescription),format.raw/*60.78*/("""</td>
                                                        <td>"""),_display_(/*61.62*/p/*61.63*/.getStock),format.raw/*61.72*/("""</td>
                                                        <td>&euro; """),_display_(/*62.69*/("%.2f".format(p.getPrice))),format.raw/*62.96*/("""</td>
                                                        <td>"""),_display_(/*63.62*/p/*63.63*/.getAvailable),format.raw/*63.76*/("""</td>
                                                    </tr>
                                                """)))}),format.raw/*65.50*/(""" """),format.raw/*65.51*/("""<!-- End of For loop -->
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </section>


                        </div>
                </div>
            </div>
        </section>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*80.27*/("""{"""),format.raw/*80.28*/("""
        """),format.raw/*81.9*/("""return confirm('Are you sure?');
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/("""
  """),format.raw/*83.3*/("""</script>

  <!-- End of content for main -->
""")))}),format.raw/*86.2*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Mon Apr 17 00:21:35 IST 2017
                  SOURCE: /home/ifeanyi/Documents/v.5/03042017/app/views/products.scala.html
                  HASH: 3d0078fc9cf395327e0d51de12c4c8dfccfe8605
                  MATRIX: 806->1|994->94|1022->96|1082->129|1110->130|1156->149|1184->150|1212->151|1259->173|1289->195|1328->197|1357->200|1881->697|1896->703|1944->730|2251->1010|2287->1030|2327->1032|2392->1069|2429->1079|2444->1085|2498->1118|2553->1145|2564->1146|2594->1154|2659->1191|2707->1212|2717->1213|2757->1232|2870->1314|2927->1343|3070->1459|3111->1491|3151->1493|3212->1526|3306->1593|3320->1598|3356->1613|3417->1646|3484->1682|3545->1715|5044->3187|5078->3205|5118->3207|5199->3260|5292->3326|5302->3327|5329->3333|5423->3400|5433->3401|5462->3409|5556->3476|5566->3477|5607->3497|5701->3564|5711->3565|5747->3580|5841->3647|5851->3648|5881->3657|5982->3731|6030->3758|6124->3825|6134->3826|6168->3839|6312->3952|6341->3953|6826->4410|6855->4411|6891->4420|6955->4457|6983->4458|7013->4461|7090->4508
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|47->16|47->16|47->16|51->20|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|55->24|56->25|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|64->33|65->34|86->55|86->55|86->55|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|94->63|94->63|94->63|96->65|96->65|111->80|111->80|112->81|113->82|113->82|114->83|117->86
                  -- GENERATED --
              */
          