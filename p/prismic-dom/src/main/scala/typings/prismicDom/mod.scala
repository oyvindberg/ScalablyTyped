package typings.prismicDom

import typings.prismicDom.prismicDomStrings.`group-list-item`
import typings.prismicDom.prismicDomStrings.`group-o-list-item`
import typings.prismicDom.prismicDomStrings.`list-item`
import typings.prismicDom.prismicDomStrings.`o-list-item`
import typings.prismicDom.prismicDomStrings.em
import typings.prismicDom.prismicDomStrings.embed
import typings.prismicDom.prismicDomStrings.heading1
import typings.prismicDom.prismicDomStrings.heading2
import typings.prismicDom.prismicDomStrings.heading3
import typings.prismicDom.prismicDomStrings.heading4
import typings.prismicDom.prismicDomStrings.heading5
import typings.prismicDom.prismicDomStrings.heading6
import typings.prismicDom.prismicDomStrings.hyperlink
import typings.prismicDom.prismicDomStrings.image
import typings.prismicDom.prismicDomStrings.label
import typings.prismicDom.prismicDomStrings.paragraph
import typings.prismicDom.prismicDomStrings.preformatted
import typings.prismicDom.prismicDomStrings.span
import typings.prismicDom.prismicDomStrings.strong
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("prismic-dom", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("prismic-dom", "default.Link")
    @js.native
    def Link: typings.prismicDom.mod.Link = js.native
    @scala.inline
    def Link_=(x: typings.prismicDom.mod.Link): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Link")(x.asInstanceOf[js.Any])
    
    @JSImport("prismic-dom", "default.RichText")
    @js.native
    def RichText: typings.prismicDom.mod.RichText = js.native
    @scala.inline
    def RichText_=(x: typings.prismicDom.mod.RichText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RichText")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("prismic-dom", "HTMLSerializer")
  @js.native
  val HTMLSerializer: typings.prismicDom.mod.HTMLSerializer[String] = js.native
  type HTMLSerializer[T] = js.Function5[
    /* type */ ElementType, 
    /* element */ js.Any, 
    /* text */ String | Null, 
    /* children */ js.Array[T], 
    /* index */ Double, 
    T
  ]
  
  @js.native
  trait Link extends StObject {
    
    def url(link: js.Any): String = js.native
    def url(link: js.Any, linkResolver: js.Function1[/* doc */ js.Any, String]): String = js.native
  }
  @JSImport("prismic-dom", "Link")
  @js.native
  val Link: typings.prismicDom.mod.Link = js.native
  
  @js.native
  trait RichText extends StObject {
    
    var Elements: typings.prismicDom.mod.Elements = js.native
    
    def asHtml(richText: js.Any): String = js.native
    def asHtml(
      richText: js.Any,
      linkResolver: js.UndefOr[scala.Nothing],
      serializer: typings.prismicDom.mod.HTMLSerializer[String]
    ): String = js.native
    def asHtml(richText: js.Any, linkResolver: js.Function1[/* doc */ js.Any, String]): String = js.native
    def asHtml(
      richText: js.Any,
      linkResolver: js.Function1[/* doc */ js.Any, String],
      serializer: typings.prismicDom.mod.HTMLSerializer[String]
    ): String = js.native
    
    def asText(richText: js.Any): String = js.native
    def asText(richText: js.Any, joinString: String): String = js.native
  }
  @JSImport("prismic-dom", "RichText")
  @js.native
  val RichText: typings.prismicDom.mod.RichText = js.native
  
  /* Inlined prismic-dom.prismic-dom.Elements[keyof prismic-dom.prismic-dom.Elements] */
  /* Rewritten from type alias, can be one of: 
    - typings.prismicDom.prismicDomStrings.`list-item`
    - typings.prismicDom.prismicDomStrings.`group-list-item`
    - typings.prismicDom.prismicDomStrings.heading6
    - typings.prismicDom.prismicDomStrings.`o-list-item`
    - typings.prismicDom.prismicDomStrings.heading2
    - typings.prismicDom.prismicDomStrings.hyperlink
    - typings.prismicDom.prismicDomStrings.image
    - typings.prismicDom.prismicDomStrings.heading5
    - typings.prismicDom.prismicDomStrings.paragraph
    - typings.prismicDom.prismicDomStrings.preformatted
    - typings.prismicDom.prismicDomStrings.strong
    - typings.prismicDom.prismicDomStrings.span
    - typings.prismicDom.prismicDomStrings.heading3
    - typings.prismicDom.prismicDomStrings.em
    - typings.prismicDom.prismicDomStrings.heading4
    - typings.prismicDom.prismicDomStrings.label
    - typings.prismicDom.prismicDomStrings.`group-o-list-item`
    - typings.prismicDom.prismicDomStrings.embed
    - typings.prismicDom.prismicDomStrings.heading1
  */
  trait ElementType extends StObject
  object ElementType {
    
    @scala.inline
    def em: typings.prismicDom.prismicDomStrings.em = "em".asInstanceOf[typings.prismicDom.prismicDomStrings.em]
    
    @scala.inline
    def embed: typings.prismicDom.prismicDomStrings.embed = "embed".asInstanceOf[typings.prismicDom.prismicDomStrings.embed]
    
    @scala.inline
    def `group-list-item`: typings.prismicDom.prismicDomStrings.`group-list-item` = "group-list-item".asInstanceOf[typings.prismicDom.prismicDomStrings.`group-list-item`]
    
    @scala.inline
    def `group-o-list-item`: typings.prismicDom.prismicDomStrings.`group-o-list-item` = "group-o-list-item".asInstanceOf[typings.prismicDom.prismicDomStrings.`group-o-list-item`]
    
    @scala.inline
    def heading1: typings.prismicDom.prismicDomStrings.heading1 = "heading1".asInstanceOf[typings.prismicDom.prismicDomStrings.heading1]
    
    @scala.inline
    def heading2: typings.prismicDom.prismicDomStrings.heading2 = "heading2".asInstanceOf[typings.prismicDom.prismicDomStrings.heading2]
    
    @scala.inline
    def heading3: typings.prismicDom.prismicDomStrings.heading3 = "heading3".asInstanceOf[typings.prismicDom.prismicDomStrings.heading3]
    
    @scala.inline
    def heading4: typings.prismicDom.prismicDomStrings.heading4 = "heading4".asInstanceOf[typings.prismicDom.prismicDomStrings.heading4]
    
    @scala.inline
    def heading5: typings.prismicDom.prismicDomStrings.heading5 = "heading5".asInstanceOf[typings.prismicDom.prismicDomStrings.heading5]
    
    @scala.inline
    def heading6: typings.prismicDom.prismicDomStrings.heading6 = "heading6".asInstanceOf[typings.prismicDom.prismicDomStrings.heading6]
    
    @scala.inline
    def hyperlink: typings.prismicDom.prismicDomStrings.hyperlink = "hyperlink".asInstanceOf[typings.prismicDom.prismicDomStrings.hyperlink]
    
    @scala.inline
    def image: typings.prismicDom.prismicDomStrings.image = "image".asInstanceOf[typings.prismicDom.prismicDomStrings.image]
    
    @scala.inline
    def label: typings.prismicDom.prismicDomStrings.label = "label".asInstanceOf[typings.prismicDom.prismicDomStrings.label]
    
    @scala.inline
    def `list-item`: typings.prismicDom.prismicDomStrings.`list-item` = "list-item".asInstanceOf[typings.prismicDom.prismicDomStrings.`list-item`]
    
    @scala.inline
    def `o-list-item`: typings.prismicDom.prismicDomStrings.`o-list-item` = "o-list-item".asInstanceOf[typings.prismicDom.prismicDomStrings.`o-list-item`]
    
    @scala.inline
    def paragraph: typings.prismicDom.prismicDomStrings.paragraph = "paragraph".asInstanceOf[typings.prismicDom.prismicDomStrings.paragraph]
    
    @scala.inline
    def preformatted: typings.prismicDom.prismicDomStrings.preformatted = "preformatted".asInstanceOf[typings.prismicDom.prismicDomStrings.preformatted]
    
    @scala.inline
    def span: typings.prismicDom.prismicDomStrings.span = "span".asInstanceOf[typings.prismicDom.prismicDomStrings.span]
    
    @scala.inline
    def strong: typings.prismicDom.prismicDomStrings.strong = "strong".asInstanceOf[typings.prismicDom.prismicDomStrings.strong]
  }
  
  @js.native
  trait Elements extends StObject {
    
    var em: typings.prismicDom.prismicDomStrings.em = js.native
    
    var embed: typings.prismicDom.prismicDomStrings.embed = js.native
    
    var heading1: typings.prismicDom.prismicDomStrings.heading1 = js.native
    
    var heading2: typings.prismicDom.prismicDomStrings.heading2 = js.native
    
    var heading3: typings.prismicDom.prismicDomStrings.heading3 = js.native
    
    var heading4: typings.prismicDom.prismicDomStrings.heading4 = js.native
    
    var heading5: typings.prismicDom.prismicDomStrings.heading5 = js.native
    
    var heading6: typings.prismicDom.prismicDomStrings.heading6 = js.native
    
    var hyperlink: typings.prismicDom.prismicDomStrings.hyperlink = js.native
    
    var image: typings.prismicDom.prismicDomStrings.image = js.native
    
    var label: typings.prismicDom.prismicDomStrings.label = js.native
    
    var list: `group-list-item` = js.native
    
    var listItem: `list-item` = js.native
    
    var oList: `group-o-list-item` = js.native
    
    var oListItem: `o-list-item` = js.native
    
    var paragraph: typings.prismicDom.prismicDomStrings.paragraph = js.native
    
    var preformatted: typings.prismicDom.prismicDomStrings.preformatted = js.native
    
    var span: typings.prismicDom.prismicDomStrings.span = js.native
    
    var strong: typings.prismicDom.prismicDomStrings.strong = js.native
  }
  object Elements {
    
    @scala.inline
    def apply(
      em: em,
      embed: embed,
      heading1: heading1,
      heading2: heading2,
      heading3: heading3,
      heading4: heading4,
      heading5: heading5,
      heading6: heading6,
      hyperlink: hyperlink,
      image: image,
      label: label,
      list: `group-list-item`,
      listItem: `list-item`,
      oList: `group-o-list-item`,
      oListItem: `o-list-item`,
      paragraph: paragraph,
      preformatted: preformatted,
      span: span,
      strong: strong
    ): Elements = {
      val __obj = js.Dynamic.literal(em = em.asInstanceOf[js.Any], embed = embed.asInstanceOf[js.Any], heading1 = heading1.asInstanceOf[js.Any], heading2 = heading2.asInstanceOf[js.Any], heading3 = heading3.asInstanceOf[js.Any], heading4 = heading4.asInstanceOf[js.Any], heading5 = heading5.asInstanceOf[js.Any], heading6 = heading6.asInstanceOf[js.Any], hyperlink = hyperlink.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], listItem = listItem.asInstanceOf[js.Any], oList = oList.asInstanceOf[js.Any], oListItem = oListItem.asInstanceOf[js.Any], paragraph = paragraph.asInstanceOf[js.Any], preformatted = preformatted.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any])
      __obj.asInstanceOf[Elements]
    }
    
    @scala.inline
    implicit class ElementsMutableBuilder[Self <: Elements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEm(value: em): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmbed(value: embed): Self = StObject.set(x, "embed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading1(value: heading1): Self = StObject.set(x, "heading1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading2(value: heading2): Self = StObject.set(x, "heading2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading3(value: heading3): Self = StObject.set(x, "heading3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading4(value: heading4): Self = StObject.set(x, "heading4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading5(value: heading5): Self = StObject.set(x, "heading5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading6(value: heading6): Self = StObject.set(x, "heading6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHyperlink(value: hyperlink): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setList(value: `group-list-item`): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListItem(value: `list-item`): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOList(value: `group-o-list-item`): Self = StObject.set(x, "oList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOListItem(value: `o-list-item`): Self = StObject.set(x, "oListItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParagraph(value: paragraph): Self = StObject.set(x, "paragraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreformatted(value: preformatted): Self = StObject.set(x, "preformatted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpan(value: span): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrong(value: strong): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
    }
  }
}
