package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.PickAntdIconPropschildren
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultMod extends Shortcut {
  
  @JSImport("antd/lib/result", JSImport.Default)
  @js.native
  val default: ResultType = js.native
  
  object ExceptionMap {
    
    @JSImport("antd/lib/result", "ExceptionMap.403")
    @js.native
    def `403`(): Element = js.native
    
    @JSImport("antd/lib/result", "ExceptionMap.404")
    @js.native
    def `404`(): Element = js.native
    
    @JSImport("antd/lib/result", "ExceptionMap.500")
    @js.native
    def `500`(): Element = js.native
  }
  
  object IconMap {
    
    @JSImport("antd/lib/result", "IconMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/result", "IconMap.error")
    @js.native
    def error: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
    @scala.inline
    def error_=(x: ForwardRefExoticComponent[PickAntdIconPropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/result", "IconMap.info")
    @js.native
    def info: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
    @scala.inline
    def info_=(x: ForwardRefExoticComponent[PickAntdIconPropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/result", "IconMap.success")
    @js.native
    def success: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
    @scala.inline
    def success_=(x: ForwardRefExoticComponent[PickAntdIconPropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("success")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/result", "IconMap.warning")
    @js.native
    def warning: ForwardRefExoticComponent[PickAntdIconPropschildren] = js.native
    @scala.inline
    def warning_=(x: ForwardRefExoticComponent[PickAntdIconPropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warning")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdNumbers.`403`
    - typings.antd.antdNumbers.`404`
    - typings.antd.antdNumbers.`500`
    - typings.antd.antdStrings.`403`
    - typings.antd.antdStrings.`404`
    - typings.antd.antdStrings.`500`
  */
  trait ExceptionStatusType extends ResultStatusType
  object ExceptionStatusType {
    
    @scala.inline
    def `403`: typings.antd.antdNumbers.`403` = 403.asInstanceOf[typings.antd.antdNumbers.`403`]
    
    @scala.inline
    def `404`: typings.antd.antdNumbers.`404` = 404.asInstanceOf[typings.antd.antdNumbers.`404`]
    
    @scala.inline
    def `500`: typings.antd.antdNumbers.`500` = 500.asInstanceOf[typings.antd.antdNumbers.`500`]
  }
  
  @js.native
  trait ResultProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var extra: js.UndefOr[ReactNode] = js.native
    
    var icon: js.UndefOr[ReactNode] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var status: js.UndefOr[ResultStatusType] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var subTitle: js.UndefOr[ReactNode] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
  }
  object ResultProps {
    
    @scala.inline
    def apply(): ResultProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResultProps]
    }
    
    @scala.inline
    implicit class ResultPropsMutableBuilder[Self <: ResultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExtra(value: ReactNode): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStatus(value: ResultStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubTitle(value: ReactNode): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.resultMod.ExceptionStatusType
    - typings.antd.antdStrings.success
    - typings.antd.antdStrings.error
    - typings.antd.antdStrings.info
    - typings.antd.antdStrings.warning
  */
  trait ResultStatusType extends StObject
  
  @js.native
  trait ResultType extends FunctionComponent[ResultProps] {
    
    var PRESENTED_IMAGE_403: ReactNode = js.native
    
    var PRESENTED_IMAGE_404: ReactNode = js.native
    
    var PRESENTED_IMAGE_500: ReactNode = js.native
  }
  
  type _To = ResultType
  
  /* This means you don't have to write `default`, but can instead just say `resultMod.foo` */
  override def _to: ResultType = default
}
