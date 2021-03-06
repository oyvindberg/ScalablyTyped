package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMaterialSubSurfaceDefines extends StObject {
  
  var SS_ALBEDOFORREFRACTIONTINT: Boolean = js.native
  
  var SS_GAMMAREFRACTION: Boolean = js.native
  
  var SS_LINEARSPECULARREFRACTION: Boolean = js.native
  
  var SS_LINKREFRACTIONTOTRANSPARENCY: Boolean = js.native
  
  var SS_LODINREFRACTIONALPHA: Boolean = js.native
  
  var SS_MASK_FROM_THICKNESS_TEXTURE: Boolean = js.native
  
  var SS_MASK_FROM_THICKNESS_TEXTURE_GLTF: Boolean = js.native
  
  var SS_REFRACTION: Boolean = js.native
  
  var SS_REFRACTIONMAP_3D: Boolean = js.native
  
  var SS_REFRACTIONMAP_OPPOSITEZ: Boolean = js.native
  
  var SS_RGBDREFRACTION: Boolean = js.native
  
  var SS_SCATTERING: Boolean = js.native
  
  var SS_THICKNESSANDMASK_TEXTURE: Boolean = js.native
  
  var SS_THICKNESSANDMASK_TEXTUREDIRECTUV: Double = js.native
  
  var SS_TRANSLUCENCY: Boolean = js.native
  
  var SUBSURFACE: Boolean = js.native
  
  /** @hidden */
  var _areTexturesDirty: Boolean = js.native
}
object IMaterialSubSurfaceDefines {
  
  @scala.inline
  def apply(
    SS_ALBEDOFORREFRACTIONTINT: Boolean,
    SS_GAMMAREFRACTION: Boolean,
    SS_LINEARSPECULARREFRACTION: Boolean,
    SS_LINKREFRACTIONTOTRANSPARENCY: Boolean,
    SS_LODINREFRACTIONALPHA: Boolean,
    SS_MASK_FROM_THICKNESS_TEXTURE: Boolean,
    SS_MASK_FROM_THICKNESS_TEXTURE_GLTF: Boolean,
    SS_REFRACTION: Boolean,
    SS_REFRACTIONMAP_3D: Boolean,
    SS_REFRACTIONMAP_OPPOSITEZ: Boolean,
    SS_RGBDREFRACTION: Boolean,
    SS_SCATTERING: Boolean,
    SS_THICKNESSANDMASK_TEXTURE: Boolean,
    SS_THICKNESSANDMASK_TEXTUREDIRECTUV: Double,
    SS_TRANSLUCENCY: Boolean,
    SUBSURFACE: Boolean,
    _areTexturesDirty: Boolean
  ): IMaterialSubSurfaceDefines = {
    val __obj = js.Dynamic.literal(SS_ALBEDOFORREFRACTIONTINT = SS_ALBEDOFORREFRACTIONTINT.asInstanceOf[js.Any], SS_GAMMAREFRACTION = SS_GAMMAREFRACTION.asInstanceOf[js.Any], SS_LINEARSPECULARREFRACTION = SS_LINEARSPECULARREFRACTION.asInstanceOf[js.Any], SS_LINKREFRACTIONTOTRANSPARENCY = SS_LINKREFRACTIONTOTRANSPARENCY.asInstanceOf[js.Any], SS_LODINREFRACTIONALPHA = SS_LODINREFRACTIONALPHA.asInstanceOf[js.Any], SS_MASK_FROM_THICKNESS_TEXTURE = SS_MASK_FROM_THICKNESS_TEXTURE.asInstanceOf[js.Any], SS_MASK_FROM_THICKNESS_TEXTURE_GLTF = SS_MASK_FROM_THICKNESS_TEXTURE_GLTF.asInstanceOf[js.Any], SS_REFRACTION = SS_REFRACTION.asInstanceOf[js.Any], SS_REFRACTIONMAP_3D = SS_REFRACTIONMAP_3D.asInstanceOf[js.Any], SS_REFRACTIONMAP_OPPOSITEZ = SS_REFRACTIONMAP_OPPOSITEZ.asInstanceOf[js.Any], SS_RGBDREFRACTION = SS_RGBDREFRACTION.asInstanceOf[js.Any], SS_SCATTERING = SS_SCATTERING.asInstanceOf[js.Any], SS_THICKNESSANDMASK_TEXTURE = SS_THICKNESSANDMASK_TEXTURE.asInstanceOf[js.Any], SS_THICKNESSANDMASK_TEXTUREDIRECTUV = SS_THICKNESSANDMASK_TEXTUREDIRECTUV.asInstanceOf[js.Any], SS_TRANSLUCENCY = SS_TRANSLUCENCY.asInstanceOf[js.Any], SUBSURFACE = SUBSURFACE.asInstanceOf[js.Any], _areTexturesDirty = _areTexturesDirty.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialSubSurfaceDefines]
  }
  
  @scala.inline
  implicit class IMaterialSubSurfaceDefinesMutableBuilder[Self <: IMaterialSubSurfaceDefines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSS_ALBEDOFORREFRACTIONTINT(value: Boolean): Self = StObject.set(x, "SS_ALBEDOFORREFRACTIONTINT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS_GAMMAREFRACTION(value: Boolean): Self = StObject.set(x, "SS_GAMMAREFRACTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS_LINEARSPECULARREFRACTION(value: Boolean): Self = StObject.set(x, "SS_LINEARSPECULARREFRACTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS_LINKREFRACTIONTOTRANSPARENCY(value: Boolean): Self = StObject.set(x, "SS_LINKREFRACTIONTOTRANSPARENCY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS_LODINREFRACTIONALPHA(value: Boolean): Self = StObject.set(x, "SS_LODINREFRACTIONALPHA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS_MASK_FROM_THICKNESS_TEXTURE(value: Boolean): Self = StObject.set(x, "SS_MASK_FROM_THICKNESS_TEXTURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS_MASK_FROM_THICKNESS_TEXTURE_GLTF(value: Boolean): Self = StObject.set(x, "SS_MASK_FROM_THICKNESS_TEXTURE_GLTF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS_REFRACTION(value: Boolean): Self = StObject.set(x, "SS_REFRACTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS_REFRACTIONMAP_3D(value: Boolean): Self = StObject.set(x, "SS_REFRACTIONMAP_3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS_REFRACTIONMAP_OPPOSITEZ(value: Boolean): Self = StObject.set(x, "SS_REFRACTIONMAP_OPPOSITEZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS_RGBDREFRACTION(value: Boolean): Self = StObject.set(x, "SS_RGBDREFRACTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS_SCATTERING(value: Boolean): Self = StObject.set(x, "SS_SCATTERING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS_THICKNESSANDMASK_TEXTURE(value: Boolean): Self = StObject.set(x, "SS_THICKNESSANDMASK_TEXTURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS_THICKNESSANDMASK_TEXTUREDIRECTUV(value: Double): Self = StObject.set(x, "SS_THICKNESSANDMASK_TEXTUREDIRECTUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSS_TRANSLUCENCY(value: Boolean): Self = StObject.set(x, "SS_TRANSLUCENCY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUBSURFACE(value: Boolean): Self = StObject.set(x, "SUBSURFACE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_areTexturesDirty(value: Boolean): Self = StObject.set(x, "_areTexturesDirty", value.asInstanceOf[js.Any])
  }
}
