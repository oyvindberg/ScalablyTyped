package typings.reactDnd

import typings.react.mod.MutableRefObject
import typings.reactDnd.hooksApiMod.DragObjectWithType
import typings.reactDnd.hooksApiMod.DragSourceHookSpec
import typings.reactDnd.monitorsMod.DragSourceMonitor
import typings.reactDnd.sourceConnectorMod.SourceConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dragMod {
  
  @JSImport("react-dnd/lib/hooks/internal/drag", "useDragHandler")
  @js.native
  def useDragHandler[DragObject /* <: DragObjectWithType */, DropResult, CustomProps](
    spec: MutableRefObject[DragSourceHookSpec[DragObject, DropResult, CustomProps]],
    monitor: DragSourceMonitor,
    connector: js.Any
  ): Unit = js.native
  
  @JSImport("react-dnd/lib/hooks/internal/drag", "useDragSourceMonitor")
  @js.native
  def useDragSourceMonitor(): js.Tuple2[DragSourceMonitor, SourceConnector] = js.native
}
