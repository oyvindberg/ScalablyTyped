package typings.scrollmagic.mod

import typings.scrollmagic.scrollmagicStrings.end
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndEvent extends Event[end] {
  
  val progress: Double = js.native
  
  val state: SceneState = js.native
}
object EndEvent {
  
  @scala.inline
  def apply(
    currentTarget: Scene,
    namespace: String,
    progress: Double,
    state: SceneState,
    target: Scene,
    timeStamp: Date,
    timestamp: Date,
    `type`: end
  ): EndEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndEvent]
  }
  
  @scala.inline
  implicit class EndEventMutableBuilder[Self <: EndEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: SceneState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
