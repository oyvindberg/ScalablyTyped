package typings.babylonjs.indexMod

import typings.babylonjs.ddsMod.DDSInfo
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "DDSTools")
@js.native
class DDSTools ()
  extends typings.babylonjs.miscIndexMod.DDSTools
/* static members */
object DDSTools {
  
  @JSImport("babylonjs/index", "DDSTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets DDS information from an array buffer
    * @param data defines the array buffer view to read data from
    * @returns the DDS information
    */
  @JSImport("babylonjs/index", "DDSTools.GetDDSInfo")
  @js.native
  def GetDDSInfo(data: ArrayBufferView): DDSInfo = js.native
  
  /**
    * Gets or sets a boolean indicating that LOD info is stored in alpha channel (false by default)
    */
  @JSImport("babylonjs/index", "DDSTools.StoreLODInAlphaChannel")
  @js.native
  def StoreLODInAlphaChannel: Boolean = js.native
  @scala.inline
  def StoreLODInAlphaChannel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StoreLODInAlphaChannel")(x.asInstanceOf[js.Any])
  
  /**
    * Uploads DDS Levels to a Babylon Texture
    * @hidden
    */
  @JSImport("babylonjs/index", "DDSTools.UploadDDSLevels")
  @js.native
  def UploadDDSLevels(
    engine: typings.babylonjs.thinEngineMod.ThinEngine,
    texture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double
  ): Unit = js.native
  @JSImport("babylonjs/index", "DDSTools.UploadDDSLevels")
  @js.native
  def UploadDDSLevels(
    engine: typings.babylonjs.thinEngineMod.ThinEngine,
    texture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: js.UndefOr[scala.Nothing],
    currentFace: Double
  ): Unit = js.native
  @JSImport("babylonjs/index", "DDSTools.UploadDDSLevels")
  @js.native
  def UploadDDSLevels(
    engine: typings.babylonjs.thinEngineMod.ThinEngine,
    texture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: Double
  ): Unit = js.native
  @JSImport("babylonjs/index", "DDSTools.UploadDDSLevels")
  @js.native
  def UploadDDSLevels(
    engine: typings.babylonjs.thinEngineMod.ThinEngine,
    texture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: ArrayBufferView,
    info: DDSInfo,
    loadMipmaps: Boolean,
    faces: Double,
    lodIndex: Double,
    currentFace: Double
  ): Unit = js.native
  
  @JSImport("babylonjs/index", "DDSTools._ExtractLongWordOrder")
  @js.native
  def _ExtractLongWordOrder: js.Any = js.native
  @scala.inline
  def _ExtractLongWordOrder_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ExtractLongWordOrder")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "DDSTools._FloatView")
  @js.native
  def _FloatView: js.Any = js.native
  @scala.inline
  def _FloatView_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FloatView")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "DDSTools._FromHalfFloat")
  @js.native
  def _FromHalfFloat: js.Any = js.native
  @scala.inline
  def _FromHalfFloat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_FromHalfFloat")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "DDSTools._GetFloatAsUIntRGBAArrayBuffer")
  @js.native
  def _GetFloatAsUIntRGBAArrayBuffer: js.Any = js.native
  @scala.inline
  def _GetFloatAsUIntRGBAArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFloatAsUIntRGBAArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "DDSTools._GetFloatRGBAArrayBuffer")
  @js.native
  def _GetFloatRGBAArrayBuffer: js.Any = js.native
  @scala.inline
  def _GetFloatRGBAArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFloatRGBAArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "DDSTools._GetHalfFloatAsFloatRGBAArrayBuffer")
  @js.native
  def _GetHalfFloatAsFloatRGBAArrayBuffer: js.Any = js.native
  @scala.inline
  def _GetHalfFloatAsFloatRGBAArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetHalfFloatAsFloatRGBAArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "DDSTools._GetHalfFloatAsUIntRGBAArrayBuffer")
  @js.native
  def _GetHalfFloatAsUIntRGBAArrayBuffer: js.Any = js.native
  @scala.inline
  def _GetHalfFloatAsUIntRGBAArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetHalfFloatAsUIntRGBAArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "DDSTools._GetHalfFloatRGBAArrayBuffer")
  @js.native
  def _GetHalfFloatRGBAArrayBuffer: js.Any = js.native
  @scala.inline
  def _GetHalfFloatRGBAArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetHalfFloatRGBAArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "DDSTools._GetLuminanceArrayBuffer")
  @js.native
  def _GetLuminanceArrayBuffer: js.Any = js.native
  @scala.inline
  def _GetLuminanceArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetLuminanceArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "DDSTools._GetRGBAArrayBuffer")
  @js.native
  def _GetRGBAArrayBuffer: js.Any = js.native
  @scala.inline
  def _GetRGBAArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetRGBAArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "DDSTools._GetRGBArrayBuffer")
  @js.native
  def _GetRGBArrayBuffer: js.Any = js.native
  @scala.inline
  def _GetRGBArrayBuffer_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetRGBArrayBuffer")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "DDSTools._Int32View")
  @js.native
  def _Int32View: js.Any = js.native
  @scala.inline
  def _Int32View_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Int32View")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "DDSTools._ToHalfFloat")
  @js.native
  def _ToHalfFloat: js.Any = js.native
  @scala.inline
  def _ToHalfFloat_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ToHalfFloat")(x.asInstanceOf[js.Any])
}
