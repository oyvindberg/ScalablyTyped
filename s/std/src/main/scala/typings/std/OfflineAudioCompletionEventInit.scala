package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OfflineAudioCompletionEventInit extends EventInit {
  
  var renderedBuffer: AudioBuffer = js.native
}
object OfflineAudioCompletionEventInit {
  
  @scala.inline
  def apply(renderedBuffer: AudioBuffer): OfflineAudioCompletionEventInit = {
    val __obj = js.Dynamic.literal(renderedBuffer = renderedBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineAudioCompletionEventInit]
  }
  
  @scala.inline
  implicit class OfflineAudioCompletionEventInitMutableBuilder[Self <: OfflineAudioCompletionEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderedBuffer(value: AudioBuffer): Self = StObject.set(x, "renderedBuffer", value.asInstanceOf[js.Any])
  }
}
