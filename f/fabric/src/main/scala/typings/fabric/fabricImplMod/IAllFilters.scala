package typings.fabric.fabricImplMod

import typings.fabric.anon.FromObject
import typings.fabric.anon.Instantiable
import typings.fabric.anon.InstantiableFromObject
import typings.fabric.anon.InstantiableIBrightnessFilter
import typings.fabric.anon.InstantiableIColorMatrix
import typings.fabric.anon.InstantiableIContrastFilter
import typings.fabric.anon.InstantiableIConvoluteFilter
import typings.fabric.anon.InstantiableIGradientTransparencyFilter
import typings.fabric.anon.InstantiableIGrayscaleFilter
import typings.fabric.anon.InstantiableIInvertFilter
import typings.fabric.anon.InstantiableIMaskFilter
import typings.fabric.anon.InstantiableIMultiplyFilter
import typings.fabric.anon.InstantiableINoiseFilter
import typings.fabric.anon.InstantiableIPixelateFilter
import typings.fabric.anon.InstantiableIRemoveWhiteFilter
import typings.fabric.anon.InstantiableIResizeFilter
import typings.fabric.anon.InstantiableISaturationFilter
import typings.fabric.anon.InstantiableISepia2Filter
import typings.fabric.anon.InstantiableISepiaFilter
import typings.fabric.anon.InstantiableITintFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////////////////////////////////////////////
// Filters
////////////////////////////////////////////////////////////
@js.native
trait IAllFilters extends StObject {
  
  var BaseFilter: Instantiable = js.native
  
  var BlendColor: FromObject = js.native
  
  var BlendImage: InstantiableFromObject = js.native
  
  var Brightness: InstantiableIBrightnessFilter = js.native
  
  var ColorMatrix: InstantiableIColorMatrix = js.native
  
  var Contrast: InstantiableIContrastFilter = js.native
  
  var Convolute: InstantiableIConvoluteFilter = js.native
  
  var GradientTransparency: InstantiableIGradientTransparencyFilter = js.native
  
  var Grayscale: InstantiableIGrayscaleFilter = js.native
  
  var Invert: InstantiableIInvertFilter = js.native
  
  var Mask: InstantiableIMaskFilter = js.native
  
  var Multiply: InstantiableIMultiplyFilter = js.native
  
  var Noise: InstantiableINoiseFilter = js.native
  
  var Pixelate: InstantiableIPixelateFilter = js.native
  
  var RemoveWhite: InstantiableIRemoveWhiteFilter = js.native
  
  var Resize: InstantiableIResizeFilter = js.native
  
  var Saturation: InstantiableISaturationFilter = js.native
  
  var Sepia: InstantiableISepiaFilter = js.native
  
  var Sepia2: InstantiableISepia2Filter = js.native
  
  var Tint: InstantiableITintFilter = js.native
}
object IAllFilters {
  
  @scala.inline
  def apply(
    BaseFilter: Instantiable,
    BlendColor: FromObject,
    BlendImage: InstantiableFromObject,
    Brightness: InstantiableIBrightnessFilter,
    ColorMatrix: InstantiableIColorMatrix,
    Contrast: InstantiableIContrastFilter,
    Convolute: InstantiableIConvoluteFilter,
    GradientTransparency: InstantiableIGradientTransparencyFilter,
    Grayscale: InstantiableIGrayscaleFilter,
    Invert: InstantiableIInvertFilter,
    Mask: InstantiableIMaskFilter,
    Multiply: InstantiableIMultiplyFilter,
    Noise: InstantiableINoiseFilter,
    Pixelate: InstantiableIPixelateFilter,
    RemoveWhite: InstantiableIRemoveWhiteFilter,
    Resize: InstantiableIResizeFilter,
    Saturation: InstantiableISaturationFilter,
    Sepia: InstantiableISepiaFilter,
    Sepia2: InstantiableISepia2Filter,
    Tint: InstantiableITintFilter
  ): IAllFilters = {
    val __obj = js.Dynamic.literal(BaseFilter = BaseFilter.asInstanceOf[js.Any], BlendColor = BlendColor.asInstanceOf[js.Any], BlendImage = BlendImage.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], ColorMatrix = ColorMatrix.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], Convolute = Convolute.asInstanceOf[js.Any], GradientTransparency = GradientTransparency.asInstanceOf[js.Any], Grayscale = Grayscale.asInstanceOf[js.Any], Invert = Invert.asInstanceOf[js.Any], Mask = Mask.asInstanceOf[js.Any], Multiply = Multiply.asInstanceOf[js.Any], Noise = Noise.asInstanceOf[js.Any], Pixelate = Pixelate.asInstanceOf[js.Any], RemoveWhite = RemoveWhite.asInstanceOf[js.Any], Resize = Resize.asInstanceOf[js.Any], Saturation = Saturation.asInstanceOf[js.Any], Sepia = Sepia.asInstanceOf[js.Any], Sepia2 = Sepia2.asInstanceOf[js.Any], Tint = Tint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAllFilters]
  }
  
  @scala.inline
  implicit class IAllFiltersMutableBuilder[Self <: IAllFilters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseFilter(value: Instantiable): Self = StObject.set(x, "BaseFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendColor(value: FromObject): Self = StObject.set(x, "BlendColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendImage(value: InstantiableFromObject): Self = StObject.set(x, "BlendImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightness(value: InstantiableIBrightnessFilter): Self = StObject.set(x, "Brightness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMatrix(value: InstantiableIColorMatrix): Self = StObject.set(x, "ColorMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrast(value: InstantiableIContrastFilter): Self = StObject.set(x, "Contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConvolute(value: InstantiableIConvoluteFilter): Self = StObject.set(x, "Convolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientTransparency(value: InstantiableIGradientTransparencyFilter): Self = StObject.set(x, "GradientTransparency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrayscale(value: InstantiableIGrayscaleFilter): Self = StObject.set(x, "Grayscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvert(value: InstantiableIInvertFilter): Self = StObject.set(x, "Invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMask(value: InstantiableIMaskFilter): Self = StObject.set(x, "Mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiply(value: InstantiableIMultiplyFilter): Self = StObject.set(x, "Multiply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoise(value: InstantiableINoiseFilter): Self = StObject.set(x, "Noise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelate(value: InstantiableIPixelateFilter): Self = StObject.set(x, "Pixelate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveWhite(value: InstantiableIRemoveWhiteFilter): Self = StObject.set(x, "RemoveWhite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResize(value: InstantiableIResizeFilter): Self = StObject.set(x, "Resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaturation(value: InstantiableISaturationFilter): Self = StObject.set(x, "Saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSepia(value: InstantiableISepiaFilter): Self = StObject.set(x, "Sepia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSepia2(value: InstantiableISepia2Filter): Self = StObject.set(x, "Sepia2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTint(value: InstantiableITintFilter): Self = StObject.set(x, "Tint", value.asInstanceOf[js.Any])
  }
}
