package typings.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the state of the playback changes.
  */
@js.native
trait AudioPlayerChangeEvent extends AudioPlayerBaseEvent {
  
  /**
    * Text description of the state of playback.
    */
  var description: Double = js.native
  
  /**
    * Current state of playback.
    */
  var state: Double = js.native
}
object AudioPlayerChangeEvent {
  
  @scala.inline
  def apply(description: Double, source: AudioPlayer, state: Double): AudioPlayerChangeEvent = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerChangeEvent]
  }
  
  @scala.inline
  implicit class AudioPlayerChangeEventMutableBuilder[Self <: AudioPlayerChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Double): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
