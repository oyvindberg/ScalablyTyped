package typings.three.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "Texture")
@js.native
class Texture protected ()
  extends typings.three.textureMod.Texture {
  /**
  	 * @param [image]
  	 * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
  	 * @param [wrapS=THREE.ClampToEdgeWrapping]
  	 * @param [wrapT=THREE.ClampToEdgeWrapping]
  	 * @param [magFilter=THREE.LinearFilter]
  	 * @param [minFilter=THREE.LinearMipmapLinearFilter]
  	 * @param [format=THREE.RGBAFormat]
  	 * @param [type=THREE.UnsignedByteType]
  	 * @param [anisotropy=1]
  	 * @param [encoding=THREE.LinearEncoding]
  	 */
  def this(
    image: js.UndefOr[HTMLImageElement | HTMLCanvasElement | HTMLVideoElement],
    mapping: js.UndefOr[typings.three.constantsMod.Mapping],
    wrapS: js.UndefOr[typings.three.constantsMod.Wrapping],
    wrapT: js.UndefOr[typings.three.constantsMod.Wrapping],
    magFilter: js.UndefOr[typings.three.constantsMod.TextureFilter],
    minFilter: js.UndefOr[typings.three.constantsMod.TextureFilter],
    format: js.UndefOr[typings.three.constantsMod.PixelFormat],
    `type`: js.UndefOr[typings.three.constantsMod.TextureDataType],
    anisotropy: js.UndefOr[Double],
    encoding: js.UndefOr[typings.three.constantsMod.TextureEncoding]
  ) = this()
}
/* static members */
object Texture {
  
  @JSImport("three", "Texture")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("three", "Texture.DEFAULT_IMAGE")
  @js.native
  def DEFAULT_IMAGE: js.Any = js.native
  @scala.inline
  def DEFAULT_IMAGE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_IMAGE")(x.asInstanceOf[js.Any])
  
  @JSImport("three", "Texture.DEFAULT_MAPPING")
  @js.native
  def DEFAULT_MAPPING: js.Any = js.native
  @scala.inline
  def DEFAULT_MAPPING_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAPPING")(x.asInstanceOf[js.Any])
}
