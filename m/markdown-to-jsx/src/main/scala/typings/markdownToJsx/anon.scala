package typings.markdownToJsx

import org.scalablytyped.runtime.StringDictionary
import typings.markdownToJsx.mod.ComponentOverride
import typings.react.mod.ComponentClass
import typings.react.mod.SFC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Component[P, S] extends StObject {
    
    var component: String | (ComponentClass[P, S]) | SFC[P] = js.native
    
    var props: js.UndefOr[js.Any] = js.native
  }
  object Component {
    
    @scala.inline
    def apply[P, S](component: String | (ComponentClass[P, S]) | SFC[P]): Component[P, S] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[Component[P, S]]
    }
    
    @scala.inline
    implicit class ComponentMutableBuilder[Self <: Component[_, _], P, S] (val x: Self with (Component[P, S])) extends AnyVal {
      
      @scala.inline
      def setComponent(value: String | (ComponentClass[P, S]) | SFC[P]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: js.Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    }
  }
  
  @js.native
  trait Dictkey
    extends /** In addition to HTML tags, you can specify a custom component name which can be used within markdown text. */
  /* key */ StringDictionary[js.UndefOr[ComponentOverride[_, _]]] {
    
    // As of 6.9.3, these tags are the only ones automatically generated by markdown-to-jsx.
    var a: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var br: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var button: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var code: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var del: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var div: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var em: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var footer: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var h1: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var h2: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var h3: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var h4: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var h5: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var h6: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var hr: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var img: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var input: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var ol: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var p: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var pre: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var span: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var strong: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var sub: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var sup: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var table: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var tbody: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var td: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var th: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var thead: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var tr: js.UndefOr[ComponentOverride[_, _]] = js.native
    
    var ul: js.UndefOr[ComponentOverride[_, _]] = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: ComponentOverride[_, _]): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAUndefined: Self = StObject.set(x, "a", js.undefined)
      
      @scala.inline
      def setBr(value: ComponentOverride[_, _]): Self = StObject.set(x, "br", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrUndefined: Self = StObject.set(x, "br", js.undefined)
      
      @scala.inline
      def setButton(value: ComponentOverride[_, _]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setCode(value: ComponentOverride[_, _]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setDel(value: ComponentOverride[_, _]): Self = StObject.set(x, "del", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelUndefined: Self = StObject.set(x, "del", js.undefined)
      
      @scala.inline
      def setDiv(value: ComponentOverride[_, _]): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDivUndefined: Self = StObject.set(x, "div", js.undefined)
      
      @scala.inline
      def setEm(value: ComponentOverride[_, _]): Self = StObject.set(x, "em", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmUndefined: Self = StObject.set(x, "em", js.undefined)
      
      @scala.inline
      def setFooter(value: ComponentOverride[_, _]): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setH1(value: ComponentOverride[_, _]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
      
      @scala.inline
      def setH2(value: ComponentOverride[_, _]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
      
      @scala.inline
      def setH3(value: ComponentOverride[_, _]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
      
      @scala.inline
      def setH4(value: ComponentOverride[_, _]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
      
      @scala.inline
      def setH5(value: ComponentOverride[_, _]): Self = StObject.set(x, "h5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH5Undefined: Self = StObject.set(x, "h5", js.undefined)
      
      @scala.inline
      def setH6(value: ComponentOverride[_, _]): Self = StObject.set(x, "h6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH6Undefined: Self = StObject.set(x, "h6", js.undefined)
      
      @scala.inline
      def setHr(value: ComponentOverride[_, _]): Self = StObject.set(x, "hr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrUndefined: Self = StObject.set(x, "hr", js.undefined)
      
      @scala.inline
      def setImg(value: ComponentOverride[_, _]): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      @scala.inline
      def setInput(value: ComponentOverride[_, _]): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setOl(value: ComponentOverride[_, _]): Self = StObject.set(x, "ol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOlUndefined: Self = StObject.set(x, "ol", js.undefined)
      
      @scala.inline
      def setP(value: ComponentOverride[_, _]): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      @scala.inline
      def setPre(value: ComponentOverride[_, _]): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreUndefined: Self = StObject.set(x, "pre", js.undefined)
      
      @scala.inline
      def setSpan(value: ComponentOverride[_, _]): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setStrong(value: ComponentOverride[_, _]): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
      
      @scala.inline
      def setSub(value: ComponentOverride[_, _]): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubUndefined: Self = StObject.set(x, "sub", js.undefined)
      
      @scala.inline
      def setSup(value: ComponentOverride[_, _]): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupUndefined: Self = StObject.set(x, "sup", js.undefined)
      
      @scala.inline
      def setTable(value: ComponentOverride[_, _]): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
      
      @scala.inline
      def setTbody(value: ComponentOverride[_, _]): Self = StObject.set(x, "tbody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTbodyUndefined: Self = StObject.set(x, "tbody", js.undefined)
      
      @scala.inline
      def setTd(value: ComponentOverride[_, _]): Self = StObject.set(x, "td", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTdUndefined: Self = StObject.set(x, "td", js.undefined)
      
      @scala.inline
      def setTh(value: ComponentOverride[_, _]): Self = StObject.set(x, "th", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThUndefined: Self = StObject.set(x, "th", js.undefined)
      
      @scala.inline
      def setThead(value: ComponentOverride[_, _]): Self = StObject.set(x, "thead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheadUndefined: Self = StObject.set(x, "thead", js.undefined)
      
      @scala.inline
      def setTr(value: ComponentOverride[_, _]): Self = StObject.set(x, "tr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrUndefined: Self = StObject.set(x, "tr", js.undefined)
      
      @scala.inline
      def setUl(value: ComponentOverride[_, _]): Self = StObject.set(x, "ul", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUlUndefined: Self = StObject.set(x, "ul", js.undefined)
    }
  }
}
