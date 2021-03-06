package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadFileOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[DownloadFileCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[DownloadFileFailCallback] = js.native
  
  /** 指定文件下载后存储的路径 (本地路径)
    *
    * 最低基础库： `1.8.0` */
  var filePath: js.UndefOr[String] = js.native
  
  /** HTTP 请求的 Header，Header 中不能设置 Referer */
  var header: js.UndefOr[IAnyObject] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[DownloadFileSuccessCallback] = js.native
  
  /** 超时时间，单位为毫秒
    *
    * 最低基础库： `2.10.0` */
  var timeout: js.UndefOr[Double] = js.native
  
  /** 下载资源的 url */
  var url: String = js.native
}
object DownloadFileOption {
  
  @scala.inline
  def apply(url: String): DownloadFileOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileOption]
  }
  
  @scala.inline
  implicit class DownloadFileOptionMutableBuilder[Self <: DownloadFileOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    @scala.inline
    def setHeader(value: IAnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ DownloadFileSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
