package typings.three

import typings.three.anon.HeightWidth
import typings.three.constantsMod.Mapping
import typings.three.constantsMod.TextureDataType
import typings.three.constantsMod.TextureFilter
import typings.three.constantsMod.Wrapping
import typings.three.textureMod.Texture
import typings.three.threeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object depthTextureMod {
  
  @JSImport("three/src/textures/DepthTexture", "DepthTexture")
  @js.native
  class DepthTexture protected () extends Texture {
    /**
    	 * @param width
    	 * @param height
    	 * @param type
    	 * @param [mapping=THREE.Texture.DEFAULT_MAPPING]
    	 * @param [wrapS=THREE.ClampToEdgeWrapping]
    	 * @param [wrapT=THREE.ClampToEdgeWrapping]
    	 * @param [magFilter=THREE.NearestFilter]
    	 * @param [minFilter=THREE.NearestFilter]
    	 * @param [anisotropy=1]
    	 */
    def this(
      width: Double,
      height: Double,
      `type`: js.UndefOr[TextureDataType],
      mapping: js.UndefOr[Mapping],
      wrapS: js.UndefOr[Wrapping],
      wrapT: js.UndefOr[Wrapping],
      magFilter: js.UndefOr[TextureFilter],
      minFilter: js.UndefOr[TextureFilter],
      anisotropy: js.UndefOr[Double]
    ) = this()
    
    @JSName("image")
    var image_DepthTexture: HeightWidth = js.native
    
    val isDepthTexture: `true` = js.native
  }
}
