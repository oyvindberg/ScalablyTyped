package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.switchSwitchMod.SwitchProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchMod extends Shortcut {
  
  @JSImport("@material-ui/core/Switch", JSImport.Default)
  @js.native
  val default: ComponentType[SwitchProps] = js.native
  
  type _To = ComponentType[SwitchProps]
  
  /* This means you don't have to write `default`, but can instead just say `switchMod.foo` */
  override def _to: ComponentType[SwitchProps] = default
}
