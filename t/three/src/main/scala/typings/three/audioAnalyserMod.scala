package typings.three

import typings.std.AnalyserNode
import typings.std.AudioNode
import typings.std.Uint8Array
import typings.three.audioMod.Audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object audioAnalyserMod {
  
  @JSImport("three/src/audio/AudioAnalyser", "AudioAnalyser")
  @js.native
  class AudioAnalyser protected () extends StObject {
    /**
    	 * @param audio
    	 * @param [fftSize=2048]
    	 */
    def this(audio: Audio[AudioNode]) = this()
    def this(audio: Audio[AudioNode], fftSize: Double) = this()
    
    var analyser: AnalyserNode = js.native
    
    var data: Uint8Array = js.native
    
    def getAverageFrequency(): Double = js.native
    
    /**
    	 * @deprecated Use {@link AudioAnalyser#getFrequencyData .getFrequencyData()} instead.
    	 */
    def getData(file: js.Any): js.Any = js.native
    
    def getFrequencyData(): Uint8Array = js.native
  }
}
