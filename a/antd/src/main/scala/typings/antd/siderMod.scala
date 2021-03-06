package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.antdStrings.lg
import typings.antd.antdStrings.md
import typings.antd.antdStrings.sm
import typings.antd.antdStrings.xl
import typings.antd.antdStrings.xs
import typings.antd.antdStrings.xxl
import typings.react.mod.CSSProperties
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siderMod extends Shortcut {
  
  @JSImport("antd/lib/layout/Sider", JSImport.Default)
  @js.native
  val default: FC[SiderProps] = js.native
  
  @JSImport("antd/lib/layout/Sider", "SiderContext")
  @js.native
  val SiderContext: Context[SiderContextProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.clickTrigger
    - typings.antd.antdStrings.responsive
  */
  trait CollapseType extends StObject
  object CollapseType {
    
    @scala.inline
    def clickTrigger: typings.antd.antdStrings.clickTrigger = "clickTrigger".asInstanceOf[typings.antd.antdStrings.clickTrigger]
    
    @scala.inline
    def responsive: typings.antd.antdStrings.responsive = "responsive".asInstanceOf[typings.antd.antdStrings.responsive]
  }
  
  @js.native
  trait SiderContextProps extends StObject {
    
    var collapsedWidth: js.UndefOr[Double | String] = js.native
    
    var siderCollapsed: js.UndefOr[Boolean] = js.native
  }
  object SiderContextProps {
    
    @scala.inline
    def apply(): SiderContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiderContextProps]
    }
    
    @scala.inline
    implicit class SiderContextPropsMutableBuilder[Self <: SiderContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapsedWidth(value: Double | String): Self = StObject.set(x, "collapsedWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedWidthUndefined: Self = StObject.set(x, "collapsedWidth", js.undefined)
      
      @scala.inline
      def setSiderCollapsed(value: Boolean): Self = StObject.set(x, "siderCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSiderCollapsedUndefined: Self = StObject.set(x, "siderCollapsed", js.undefined)
    }
  }
  
  @js.native
  trait SiderProps extends HTMLAttributes[HTMLDivElement] {
    
    var breakpoint: js.UndefOr[xs | sm | md | lg | xl | xxl] = js.native
    
    var collapsed: js.UndefOr[Boolean] = js.native
    
    var collapsedWidth: js.UndefOr[Double | String] = js.native
    
    var collapsible: js.UndefOr[Boolean] = js.native
    
    var defaultCollapsed: js.UndefOr[Boolean] = js.native
    
    var onBreakpoint: js.UndefOr[js.Function1[/* broken */ Boolean, Unit]] = js.native
    
    var onCollapse: js.UndefOr[js.Function2[/* collapsed */ Boolean, /* type */ CollapseType, Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var reverseArrow: js.UndefOr[Boolean] = js.native
    
    var theme: js.UndefOr[SiderTheme] = js.native
    
    var trigger: js.UndefOr[ReactNode] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
    
    var zeroWidthTriggerStyle: js.UndefOr[CSSProperties] = js.native
  }
  object SiderProps {
    
    @scala.inline
    def apply(): SiderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SiderProps]
    }
    
    @scala.inline
    implicit class SiderPropsMutableBuilder[Self <: SiderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoint(value: xs | sm | md | lg | xl | xxl): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setCollapsedWidth(value: Double | String): Self = StObject.set(x, "collapsedWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedWidthUndefined: Self = StObject.set(x, "collapsedWidth", js.undefined)
      
      @scala.inline
      def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsibleUndefined: Self = StObject.set(x, "collapsible", js.undefined)
      
      @scala.inline
      def setDefaultCollapsed(value: Boolean): Self = StObject.set(x, "defaultCollapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCollapsedUndefined: Self = StObject.set(x, "defaultCollapsed", js.undefined)
      
      @scala.inline
      def setOnBreakpoint(value: /* broken */ Boolean => Unit): Self = StObject.set(x, "onBreakpoint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBreakpointUndefined: Self = StObject.set(x, "onBreakpoint", js.undefined)
      
      @scala.inline
      def setOnCollapse(value: (/* collapsed */ Boolean, /* type */ CollapseType) => Unit): Self = StObject.set(x, "onCollapse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCollapseUndefined: Self = StObject.set(x, "onCollapse", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setReverseArrow(value: Boolean): Self = StObject.set(x, "reverseArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseArrowUndefined: Self = StObject.set(x, "reverseArrow", js.undefined)
      
      @scala.inline
      def setTheme(value: SiderTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTrigger(value: ReactNode): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZeroWidthTriggerStyle(value: CSSProperties): Self = StObject.set(x, "zeroWidthTriggerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroWidthTriggerStyleUndefined: Self = StObject.set(x, "zeroWidthTriggerStyle", js.undefined)
    }
  }
  
  @js.native
  trait SiderState extends StObject {
    
    var below: Boolean = js.native
    
    var collapsed: js.UndefOr[Boolean] = js.native
  }
  object SiderState {
    
    @scala.inline
    def apply(below: Boolean): SiderState = {
      val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any])
      __obj.asInstanceOf[SiderState]
    }
    
    @scala.inline
    implicit class SiderStateMutableBuilder[Self <: SiderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBelow(value: Boolean): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.light
    - typings.antd.antdStrings.dark
  */
  trait SiderTheme extends StObject
  object SiderTheme {
    
    @scala.inline
    def dark: typings.antd.antdStrings.dark = "dark".asInstanceOf[typings.antd.antdStrings.dark]
    
    @scala.inline
    def light: typings.antd.antdStrings.light = "light".asInstanceOf[typings.antd.antdStrings.light]
  }
  
  type _To = FC[SiderProps]
  
  /* This means you don't have to write `default`, but can instead just say `siderMod.foo` */
  override def _to: FC[SiderProps] = default
}
