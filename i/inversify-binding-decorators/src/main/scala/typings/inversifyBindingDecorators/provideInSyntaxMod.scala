package typings.inversifyBindingDecorators

import typings.inversify.interfacesMod.interfaces.Bind
import typings.inversify.interfacesMod.interfaces.BindingInSyntax
import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideDoneSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provideInSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_in_syntax", JSImport.Default)
  @js.native
  class default[T] protected () extends ProvideInSyntax[T] {
    def this(
      bindingInSyntax: js.Function2[/* bind */ Bind, /* target */ js.Any, BindingInSyntax[T]],
      provideDoneSyntax: ProvideDoneSyntax
    ) = this()
  }
  
  @js.native
  trait ProvideInSyntax[T]
    extends typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideInSyntax[T] {
    
    var _bindingInSyntax: js.Any = js.native
    
    var _provideDoneSyntax: js.Any = js.native
  }
}
