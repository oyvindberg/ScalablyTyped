package typings.knockoutPreRendered

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ko extends Shortcut {
    
    @JSGlobal("ko")
    @js.native
    val ^ : KnockoutStatic = js.native
    
    /////////////////////////////////
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.bindingProvider")
    @js.native
    class bindingProvider () extends KnockoutBindingProvider
    
    //////////////////////////////////
    // nativeTemplateEngine.js
    //////////////////////////////////
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.nativeTemplateEngine")
    @js.native
    class nativeTemplateEngine () extends KnockoutNativeTemplateEngine
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.subscribable")
    @js.native
    class subscribable[T] () extends KnockoutSubscribable[T]
    
    //////////////////////////////////
    // templateEngine.js
    //////////////////////////////////
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.templateEngine")
    @js.native
    class templateEngine () extends KnockoutTemplateEngine
    
    type _To = KnockoutStatic
    
    /* This means you don't have to write `^`, but can instead just say `ko.foo` */
    override def _to: KnockoutStatic = ^
  }
  
  //
  // refactored types into a namespace to reduce global pollution
  // and used Union Types to simplify overloads (requires TypeScript 1.4)
  //
  object KnockoutComponentTypes
}
