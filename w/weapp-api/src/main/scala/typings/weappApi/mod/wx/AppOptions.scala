package typings.weappApi.mod.wx

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppOptions
  extends /* key */ StringDictionary[js.Any] {
  
  /** 小程序发生脚本错误或 API 调用报错时触发。也可以使用 wx.onError 绑定监听。*/
  var onError: js.UndefOr[ErrorCallback] = js.native
  
  /**
    * 生命周期函数--监听小程序隐藏
    * 当小程序从前台进入后台，会触发 onHide
    */
  var onHide: js.UndefOr[NoneParamCallback] = js.native
  
  /**
    * 生命周期函数--监听小程序初始化
    * 当小程序初始化完成时，会触发 onLaunch（全局只触发一次）
    */
  var onLaunch: js.UndefOr[onLaunchCallback] = js.native
  
  /**
    * 小程序要打开的页面不存在时触发
    * 1. 开发者可以在回调中进行页面重定向，但必须在回调中同步处理，异步处理（例如 setTimeout 异步执行）无效。
    * 2. 若开发者没有调用 wx.onPageNotFound 绑定监听，也没有声明 App.onPageNotFound，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
    * 3. 如果回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再第二次回调。
    */
  var onPageNotFound: js.UndefOr[NoneParamCallback] = js.native
  
  /**
    * 生命周期函数--监听小程序显示
    * 当小程序启动，或从后台进入前台显示，会触发 onShow
    */
  var onShow: js.UndefOr[js.Function1[/* options */ onShowOptions, Unit]] = js.native
}
object AppOptions {
  
  @scala.inline
  def apply(): AppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppOptions]
  }
  
  @scala.inline
  implicit class AppOptionsMutableBuilder[Self <: AppOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnError(value: /* error */ js.Any => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    @scala.inline
    def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnLaunch(value: /* options */ onLaunchOptions => Unit): Self = StObject.set(x, "onLaunch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLaunchUndefined: Self = StObject.set(x, "onLaunch", js.undefined)
    
    @scala.inline
    def setOnPageNotFound(value: () => Unit): Self = StObject.set(x, "onPageNotFound", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPageNotFoundUndefined: Self = StObject.set(x, "onPageNotFound", js.undefined)
    
    @scala.inline
    def setOnShow(value: /* options */ onShowOptions => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
  }
}
