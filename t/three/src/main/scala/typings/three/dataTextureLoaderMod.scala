package typings.three

import typings.std.ErrorEvent
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.three.dataTextureMod.DataTexture
import typings.three.loaderMod.Loader
import typings.three.loadingManagerMod.LoadingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTextureLoaderMod {
  
  @JSImport("three/src/loaders/DataTextureLoader", "DataTextureLoader")
  @js.native
  class DataTextureLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    
    def load(url: String, onLoad: js.Function1[/* dataTexture */ DataTexture, Unit]): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* dataTexture */ DataTexture, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* dataTexture */ DataTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* dataTexture */ DataTexture, Unit],
      onProgress: js.Function1[/* event */ ProgressEvent[EventTarget], Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
  }
}
