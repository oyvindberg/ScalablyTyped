package typings.aframe.mod.global.AFRAME

import typings.aframe.anon.DefaultComponents
import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.System
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitives {
  
  @JSGlobal("AFRAME.primitives")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("AFRAME.primitives.getMeshMixin")
  @js.native
  def getMeshMixin(): DefaultComponents = js.native
  
  @JSGlobal("AFRAME.primitives.primitives")
  @js.native
  def primitives: ObjectMap[Entity[ObjectMap[Component[js.Any, System[js.Any]]]]] = js.native
  @scala.inline
  def primitives_=(x: ObjectMap[Entity[ObjectMap[Component[js.Any, System[js.Any]]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primitives")(x.asInstanceOf[js.Any])
}
