package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackgroundAudioPlayerStateOptions extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[NoneParamCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[NoneParamCallback] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[GetBackgroundAudioPlayerStateSuccessCallback] = js.native
}
object GetBackgroundAudioPlayerStateOptions {
  
  @scala.inline
  def apply(): GetBackgroundAudioPlayerStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackgroundAudioPlayerStateOptions]
  }
  
  @scala.inline
  implicit class GetBackgroundAudioPlayerStateOptionsMutableBuilder[Self <: GetBackgroundAudioPlayerStateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* state */ BackgroundAudioPlayerState => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
