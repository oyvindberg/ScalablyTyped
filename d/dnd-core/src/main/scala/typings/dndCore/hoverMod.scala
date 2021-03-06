package typings.dndCore

import typings.dndCore.interfacesMod.Action
import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.HoverOptions
import typings.dndCore.interfacesMod.HoverPayload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hoverMod {
  
  @JSImport("dnd-core/lib/actions/dragDrop/hover", "createHover")
  @js.native
  def createHover(manager: DragDropManager): js.Function2[
    /* targetIdsArg */ js.Array[String], 
    /* hasClientOffset */ js.UndefOr[HoverOptions], 
    Action[HoverPayload]
  ] = js.native
}
