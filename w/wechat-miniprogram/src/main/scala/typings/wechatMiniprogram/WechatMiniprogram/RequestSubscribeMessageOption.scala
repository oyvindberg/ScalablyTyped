package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestSubscribeMessageOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RequestSubscribeMessageCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RequestSubscribeMessageFailCallback] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RequestSubscribeMessageSuccessCallback] = js.native
  
  /** 需要订阅的消息模板的id的集合，一次调用最多可订阅3条消息（注意：iOS客户端7.0.6版本、Android客户端7.0.7版本之后的一次性订阅/长期订阅才支持多个模板消息，iOS客户端7.0.5版本、Android客户端7.0.6版本之前的一次订阅只支持一个模板消息）消息模板id在[微信公众平台(mp.weixin.qq.com)-功能-订阅消息]中配置 */
  var tmplIds: js.Array[_] = js.native
}
object RequestSubscribeMessageOption {
  
  @scala.inline
  def apply(tmplIds: js.Array[_]): RequestSubscribeMessageOption = {
    val __obj = js.Dynamic.literal(tmplIds = tmplIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSubscribeMessageOption]
  }
  
  @scala.inline
  implicit class RequestSubscribeMessageOptionMutableBuilder[Self <: RequestSubscribeMessageOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* result */ RequestSubscribeMessageFailCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ RequestSubscribeMessageSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTmplIds(value: js.Array[_]): Self = StObject.set(x, "tmplIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTmplIdsVarargs(value: js.Any*): Self = StObject.set(x, "tmplIds", js.Array(value :_*))
  }
}
