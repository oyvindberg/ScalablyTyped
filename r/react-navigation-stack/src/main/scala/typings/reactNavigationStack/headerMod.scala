package typings.reactNavigationStack

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.NamedExoticComponent
import typings.reactNavigationStack.vendorTypesMod.StackHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerMod extends Shortcut {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Header/Header", JSImport.Default)
  @js.native
  val default: NamedExoticComponent[StackHeaderProps] = js.native
  
  type _To = NamedExoticComponent[StackHeaderProps]
  
  /* This means you don't have to write `default`, but can instead just say `headerMod.foo` */
  override def _to: NamedExoticComponent[StackHeaderProps] = default
}
