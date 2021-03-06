package typings.reactDnd

import typings.dndCore.interfacesMod.DragDropManager
import typings.dndCore.interfacesMod.DragSource
import typings.dndCore.interfacesMod.DropTarget
import typings.dndCore.interfacesMod.Identifier
import typings.dndCore.interfacesMod.SourceType
import typings.dndCore.interfacesMod.TargetType
import typings.dndCore.interfacesMod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registrationMod {
  
  @JSImport("react-dnd/lib/common/registration", "registerSource")
  @js.native
  def registerSource(`type`: SourceType, source: DragSource, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = js.native
  
  @JSImport("react-dnd/lib/common/registration", "registerTarget")
  @js.native
  def registerTarget(`type`: TargetType, target: DropTarget, manager: DragDropManager): js.Tuple2[Identifier, Unsubscribe] = js.native
}
