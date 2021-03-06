package typings.uniApp

import typings.uniApp.uniAppStrings.oauth
import typings.uniApp.uniAppStrings.payment
import typings.uniApp.uniAppStrings.push
import typings.uniApp.uniAppStrings.share
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProviderOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 服务类型，可取值“oauth”、“share”、“payment”、“push”
    * - oauth: 授权登录
    * - share: 分享
    * - payment: 支付
    * - push: 推送
    */
  var service: js.UndefOr[oauth | share | payment | push] = js.native
  
  /**
    * 接口调用成功的回调
    */
  var success: js.UndefOr[js.Function1[/* result */ GetProviderRes, Unit]] = js.native
}
object GetProviderOptions {
  
  @scala.inline
  def apply(): GetProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProviderOptions]
  }
  
  @scala.inline
  implicit class GetProviderOptionsMutableBuilder[Self <: GetProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setService(value: oauth | share | payment | push): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ GetProviderRes => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
