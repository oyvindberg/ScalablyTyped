package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.active
import typings.arcgisJsApi.arcgisJsApiStrings.complete
import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.start
import typings.arcgisJsApi.arcgisJsApiStrings.transform
import typings.arcgisJsApi.arcgisJsApiStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchViewModelUpdateEvent extends StObject {
  
  var aborted: Boolean = js.native
  
  var graphics: js.Array[Graphic] = js.native
  
  var state: start | active | complete = js.native
  
  var tool: move | transform | reshape = js.native
  
  var toolEventInfo: UpdateToolEventInfo = js.native
  
  var `type`: update = js.native
}
object SketchViewModelUpdateEvent {
  
  @scala.inline
  def apply(
    aborted: Boolean,
    graphics: js.Array[Graphic],
    state: start | active | complete,
    tool: move | transform | reshape,
    toolEventInfo: UpdateToolEventInfo,
    `type`: update
  ): SketchViewModelUpdateEvent = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], graphics = graphics.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], toolEventInfo = toolEventInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchViewModelUpdateEvent]
  }
  
  @scala.inline
  implicit class SketchViewModelUpdateEventMutableBuilder[Self <: SketchViewModelUpdateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphics(value: js.Array[Graphic]): Self = StObject.set(x, "graphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphicsVarargs(value: Graphic*): Self = StObject.set(x, "graphics", js.Array(value :_*))
    
    @scala.inline
    def setState(value: start | active | complete): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTool(value: move | transform | reshape): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolEventInfo(value: UpdateToolEventInfo): Self = StObject.set(x, "toolEventInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
