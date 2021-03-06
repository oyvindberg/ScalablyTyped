package typings.html5plus

import typings.html5plus.html5plusStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，原生窗口扩展参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewExtraOptions extends StObject {
  
  /**
    * 窗口动画加速
    * 开启窗口动画加速功能可优化窗口动画效果，提升动画流程度，可避免部分设备上打开（关闭）窗口闪屏的问题。
    *     可取值：
    *     "auto" - 自动优化窗口动画；
    *     "none" - 关闭窗口动画加速功能；
    *     "capture" - 使用截屏方式加速窗口动画。
    *     默认值为"auto"。
    * - auto: 
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var acceleration: js.UndefOr[auto] = js.native
  
  /**
    * 窗口动画加速时使用的图片
    * 当使用截屏方式加速窗口动画时，可设置已经创建好的截屏图片，此时不会进行实时截屏操作，加速窗口动画响应时间，提升用户体验。
    *     如果未指定截屏图片，则实时截取当前Webview窗口对象的图片进行动画操作。
    *     如果窗口未使用截屏方式加速动画，则忽略此参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var capture: js.UndefOr[PlusNativeObjBitmap] = js.native
  
  /**
    * 关联窗口动画使用的图片
    * 当使用截屏方式加速窗口动画时，可设置已经创建好的截屏图片，此时不会进行实时截屏操作，加速关联窗口动画响应时间，提升用户体验。
    *     如果未指定截屏图片，则实时截取关联Webview窗口对象的图片进行动画操作。
    *     如果窗口未使用截屏方式加速动画，则忽略此参数。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var otherCapture: js.UndefOr[PlusNativeObjBitmap] = js.native
}
object PlusWebviewWebviewExtraOptions {
  
  @scala.inline
  def apply(): PlusWebviewWebviewExtraOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewExtraOptions]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewExtraOptionsMutableBuilder[Self <: PlusWebviewWebviewExtraOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleration(value: auto): Self = StObject.set(x, "acceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccelerationUndefined: Self = StObject.set(x, "acceleration", js.undefined)
    
    @scala.inline
    def setCapture(value: PlusNativeObjBitmap): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    @scala.inline
    def setOtherCapture(value: PlusNativeObjBitmap): Self = StObject.set(x, "otherCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOtherCaptureUndefined: Self = StObject.set(x, "otherCapture", js.undefined)
  }
}
