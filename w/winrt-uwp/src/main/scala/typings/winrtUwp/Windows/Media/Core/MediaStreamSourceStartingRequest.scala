package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a request from the MediaStreamSource.Starting event for the application to start accumulating MediaStreamSample objects from a specific position in the media. */
@js.native
trait MediaStreamSourceStartingRequest extends StObject {
  
  /**
    * Defers completing the MediaStreamSource.Starting event.
    * @return The deferral.
    */
  def getDeferral(): MediaStreamSourceStartingRequestDeferral = js.native
  
  /**
    * Specifies the starting position in the media time-line for subsequent MediaStreamSamples that will be delivered to the MediaStreamSource .
    * @param position The actual starting point in the media time-line chosen by the application.
    */
  def setActualStartPosition(position: Double): Unit = js.native
  
  /** Specifies a reference to a TimeSpan object which represents a time position in the media time-line from which the application should return MediaStreamSample objects. */
  var startPosition: Double = js.native
}
object MediaStreamSourceStartingRequest {
  
  @scala.inline
  def apply(
    getDeferral: () => MediaStreamSourceStartingRequestDeferral,
    setActualStartPosition: Double => Unit,
    startPosition: Double
  ): MediaStreamSourceStartingRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), setActualStartPosition = js.Any.fromFunction1(setActualStartPosition), startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaStreamSourceStartingRequest]
  }
  
  @scala.inline
  implicit class MediaStreamSourceStartingRequestMutableBuilder[Self <: MediaStreamSourceStartingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeferral(value: () => MediaStreamSourceStartingRequestDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetActualStartPosition(value: Double => Unit): Self = StObject.set(x, "setActualStartPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStartPosition(value: Double): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}
