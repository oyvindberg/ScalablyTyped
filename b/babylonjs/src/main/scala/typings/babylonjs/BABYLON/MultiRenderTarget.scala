package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiRenderTarget extends RenderTargetTexture {
  
  var _count: js.Any = js.native
  
  var _createInternalTextures: js.Any = js.native
  
  var _createTextures: js.Any = js.native
  
  var _initTypes: js.Any = js.native
  
  var _internalTextures: js.Any = js.native
  
  var _multiRenderTargetOptions: js.Any = js.native
  
  def _rebuild(forceFullRebuild: Boolean): Unit = js.native
  
  var _textures: js.Any = js.native
  
  /**
    * Gets the number of textures in this MRT. This number can be different from `_textures.length` in case a depth texture is generated.
    */
  def count: Double = js.native
  
  /**
    * Get the depth texture generated by the multi render target if options.generateDepthTexture has been set
    */
  def depthTexture: Texture = js.native
  
  /**
    * Get if draw buffers are currently supported by the used hardware and browser.
    */
  def isSupported: Boolean = js.native
  
  /**
    * Release all the underlying texture used as draw buffers.
    */
  def releaseInternalTextures(): Unit = js.native
  
  /**
    * Replaces a texture within the MRT.
    * @param texture The new texture to insert in the MRT
    * @param index The index of the texture to replace
    */
  def replaceTexture(texture: Texture, index: Double): Unit = js.native
  
  /**
    * Resize all the textures in the multi render target.
    * Be careful as it will recreate all the data in the new texture.
    * @param size Define the new size
    */
  def resize(size: js.Any): Unit = js.native
  
  /**
    * Get the list of textures generated by the multi render target.
    */
  def textures: js.Array[Texture] = js.native
  
  /**
    * Changes the number of render targets in this MRT
    * Be careful as it will recreate all the data in the new texture.
    * @param count new texture count
    * @param options Specifies texture types and sampling modes for new textures
    */
  def updateCount(count: Double): Unit = js.native
  def updateCount(count: Double, options: IMultiRenderTargetOptions): Unit = js.native
}
