package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.AdjustY
import typings.antd.colorsMod.PresetColorType
import typings.antd.placementsMod.AdjustOverflow
import typings.antd.typeMod.LiteralUnion
import typings.rcTooltip.anon.KeepParent
import typings.rcTrigger.interfaceMod.ActionType
import typings.rcTrigger.interfaceMod.AlignType
import typings.rcTrigger.interfaceMod.AnimationType
import typings.rcTrigger.interfaceMod.BuildInPlacements
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod extends Shortcut {
  
  @JSImport("antd/lib/tooltip", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[
    (TooltipPropsWithOverlay with RefAttributes[_]) | (TooltipPropsWithTitle with RefAttributes[_])
  ] = js.native
  
  /* Inlined parent std.Partial<std.Omit<rc-tooltip.rc-tooltip/es/Tooltip.TooltipProps, 'children'>> */
  @js.native
  trait AbstractTooltipProps extends StObject {
    
    var afterVisibleChange: js.UndefOr[js.Function0[Unit]] = js.native
    
    var align: js.UndefOr[AlignType] = js.native
    
    var animation: js.UndefOr[AnimationType] = js.native
    
    var arrowContent: js.UndefOr[ReactNode] = js.native
    
    var arrowPointAtCenter: js.UndefOr[Boolean] = js.native
    
    var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.native
    
    var builtinPlacements: js.UndefOr[BuildInPlacements] = js.native
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[LiteralUnion[PresetColorType, String]] = js.native
    
    var defaultVisible: js.UndefOr[Boolean] = js.native
    
    var destroyTooltipOnHide: js.UndefOr[Boolean | KeepParent] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.native
    
    var getTooltipContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var mouseEnterDelay: js.UndefOr[Double] = js.native
    
    var mouseLeaveDelay: js.UndefOr[Double] = js.native
    
    var onPopupAlign: js.UndefOr[js.Function2[/* element */ HTMLElement, /* align */ AlignType, Unit]] = js.native
    
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.native
    
    var openClassName: js.UndefOr[String] = js.native
    
    var overlay: js.UndefOr[js.Function0[ReactNode] | ReactNode] = js.native
    
    var overlayClassName: js.UndefOr[String] = js.native
    
    var overlayInnerStyle: js.UndefOr[CSSProperties] = js.native
    
    var overlayStyle: js.UndefOr[CSSProperties] = js.native
    
    var placement: js.UndefOr[TooltipPlacement] = js.native
    
    var popupVisible: js.UndefOr[Boolean] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var transitionName: js.UndefOr[String] = js.native
    
    var trigger: js.UndefOr[ActionType | js.Array[ActionType]] = js.native
    
    var visible: js.UndefOr[Boolean] = js.native
  }
  object AbstractTooltipProps {
    
    @scala.inline
    def apply(): AbstractTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractTooltipProps]
    }
    
    @scala.inline
    implicit class AbstractTooltipPropsMutableBuilder[Self <: AbstractTooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterVisibleChange(value: () => Unit): Self = StObject.set(x, "afterVisibleChange", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterVisibleChangeUndefined: Self = StObject.set(x, "afterVisibleChange", js.undefined)
      
      @scala.inline
      def setAlign(value: AlignType): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setArrowContent(value: ReactNode): Self = StObject.set(x, "arrowContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowContentUndefined: Self = StObject.set(x, "arrowContent", js.undefined)
      
      @scala.inline
      def setArrowPointAtCenter(value: Boolean): Self = StObject.set(x, "arrowPointAtCenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowPointAtCenterUndefined: Self = StObject.set(x, "arrowPointAtCenter", js.undefined)
      
      @scala.inline
      def setAutoAdjustOverflow(value: Boolean | AdjustOverflow): Self = StObject.set(x, "autoAdjustOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAdjustOverflowUndefined: Self = StObject.set(x, "autoAdjustOverflow", js.undefined)
      
      @scala.inline
      def setBuiltinPlacements(value: BuildInPlacements): Self = StObject.set(x, "builtinPlacements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuiltinPlacementsUndefined: Self = StObject.set(x, "builtinPlacements", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: LiteralUnion[PresetColorType, String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDefaultVisible(value: Boolean): Self = StObject.set(x, "defaultVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultVisibleUndefined: Self = StObject.set(x, "defaultVisible", js.undefined)
      
      @scala.inline
      def setDestroyTooltipOnHide(value: Boolean | KeepParent): Self = StObject.set(x, "destroyTooltipOnHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyTooltipOnHideUndefined: Self = StObject.set(x, "destroyTooltipOnHide", js.undefined)
      
      @scala.inline
      def setGetPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
      
      @scala.inline
      def setGetTooltipContainer(value: /* node */ HTMLElement => HTMLElement): Self = StObject.set(x, "getTooltipContainer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetTooltipContainerUndefined: Self = StObject.set(x, "getTooltipContainer", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMouseEnterDelay(value: Double): Self = StObject.set(x, "mouseEnterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseEnterDelayUndefined: Self = StObject.set(x, "mouseEnterDelay", js.undefined)
      
      @scala.inline
      def setMouseLeaveDelay(value: Double): Self = StObject.set(x, "mouseLeaveDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseLeaveDelayUndefined: Self = StObject.set(x, "mouseLeaveDelay", js.undefined)
      
      @scala.inline
      def setOnPopupAlign(value: (/* element */ HTMLElement, /* align */ AlignType) => Unit): Self = StObject.set(x, "onPopupAlign", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPopupAlignUndefined: Self = StObject.set(x, "onPopupAlign", js.undefined)
      
      @scala.inline
      def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      @scala.inline
      def setOpenClassName(value: String): Self = StObject.set(x, "openClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenClassNameUndefined: Self = StObject.set(x, "openClassName", js.undefined)
      
      @scala.inline
      def setOverlay(value: js.Function0[ReactNode] | ReactNode): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassName(value: String): Self = StObject.set(x, "overlayClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayClassNameUndefined: Self = StObject.set(x, "overlayClassName", js.undefined)
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactNode): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayInnerStyle(value: CSSProperties): Self = StObject.set(x, "overlayInnerStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayInnerStyleUndefined: Self = StObject.set(x, "overlayInnerStyle", js.undefined)
      
      @scala.inline
      def setOverlayStyle(value: CSSProperties): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayStyleUndefined: Self = StObject.set(x, "overlayStyle", js.undefined)
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setPlacement(value: TooltipPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setPopupVisible(value: Boolean): Self = StObject.set(x, "popupVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupVisibleUndefined: Self = StObject.set(x, "popupVisible", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTransitionName(value: String): Self = StObject.set(x, "transitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionNameUndefined: Self = StObject.set(x, "transitionName", js.undefined)
      
      @scala.inline
      def setTrigger(value: ActionType | js.Array[ActionType]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setTriggerVarargs(value: ActionType*): Self = StObject.set(x, "trigger", js.Array(value :_*))
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type RenderFunction = js.Function0[ReactNode]
  
  @js.native
  trait TooltipAlignConfig extends StObject {
    
    var offset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
    
    var overflow: js.UndefOr[AdjustY] = js.native
    
    var points: js.UndefOr[js.Tuple2[String, String]] = js.native
    
    var targetOffset: js.UndefOr[js.Tuple2[Double | String, Double | String]] = js.native
    
    var useCssBottom: js.UndefOr[Boolean] = js.native
    
    var useCssRight: js.UndefOr[Boolean] = js.native
    
    var useCssTransform: js.UndefOr[Boolean] = js.native
  }
  object TooltipAlignConfig {
    
    @scala.inline
    def apply(): TooltipAlignConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipAlignConfig]
    }
    
    @scala.inline
    implicit class TooltipAlignConfigMutableBuilder[Self <: TooltipAlignConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOverflow(value: AdjustY): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPoints(value: js.Tuple2[String, String]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setTargetOffset(value: js.Tuple2[Double | String, Double | String]): Self = StObject.set(x, "targetOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetOffsetUndefined: Self = StObject.set(x, "targetOffset", js.undefined)
      
      @scala.inline
      def setUseCssBottom(value: Boolean): Self = StObject.set(x, "useCssBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssBottomUndefined: Self = StObject.set(x, "useCssBottom", js.undefined)
      
      @scala.inline
      def setUseCssRight(value: Boolean): Self = StObject.set(x, "useCssRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssRightUndefined: Self = StObject.set(x, "useCssRight", js.undefined)
      
      @scala.inline
      def setUseCssTransform(value: Boolean): Self = StObject.set(x, "useCssTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCssTransformUndefined: Self = StObject.set(x, "useCssTransform", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.top
    - typings.antd.antdStrings.left
    - typings.antd.antdStrings.right
    - typings.antd.antdStrings.bottom
    - typings.antd.antdStrings.topLeft
    - typings.antd.antdStrings.topRight
    - typings.antd.antdStrings.bottomLeft
    - typings.antd.antdStrings.bottomRight
    - typings.antd.antdStrings.leftTop
    - typings.antd.antdStrings.leftBottom
    - typings.antd.antdStrings.rightTop
    - typings.antd.antdStrings.rightBottom
  */
  trait TooltipPlacement extends StObject
  object TooltipPlacement {
    
    @scala.inline
    def bottom: typings.antd.antdStrings.bottom = "bottom".asInstanceOf[typings.antd.antdStrings.bottom]
    
    @scala.inline
    def bottomLeft: typings.antd.antdStrings.bottomLeft = "bottomLeft".asInstanceOf[typings.antd.antdStrings.bottomLeft]
    
    @scala.inline
    def bottomRight: typings.antd.antdStrings.bottomRight = "bottomRight".asInstanceOf[typings.antd.antdStrings.bottomRight]
    
    @scala.inline
    def left: typings.antd.antdStrings.left = "left".asInstanceOf[typings.antd.antdStrings.left]
    
    @scala.inline
    def leftBottom: typings.antd.antdStrings.leftBottom = "leftBottom".asInstanceOf[typings.antd.antdStrings.leftBottom]
    
    @scala.inline
    def leftTop: typings.antd.antdStrings.leftTop = "leftTop".asInstanceOf[typings.antd.antdStrings.leftTop]
    
    @scala.inline
    def right: typings.antd.antdStrings.right = "right".asInstanceOf[typings.antd.antdStrings.right]
    
    @scala.inline
    def rightBottom: typings.antd.antdStrings.rightBottom = "rightBottom".asInstanceOf[typings.antd.antdStrings.rightBottom]
    
    @scala.inline
    def rightTop: typings.antd.antdStrings.rightTop = "rightTop".asInstanceOf[typings.antd.antdStrings.rightTop]
    
    @scala.inline
    def top: typings.antd.antdStrings.top = "top".asInstanceOf[typings.antd.antdStrings.top]
    
    @scala.inline
    def topLeft: typings.antd.antdStrings.topLeft = "topLeft".asInstanceOf[typings.antd.antdStrings.topLeft]
    
    @scala.inline
    def topRight: typings.antd.antdStrings.topRight = "topRight".asInstanceOf[typings.antd.antdStrings.topRight]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.tooltipMod.TooltipPropsWithTitle
    - typings.antd.tooltipMod.TooltipPropsWithOverlay
  */
  trait TooltipProps extends StObject
  object TooltipProps {
    
    @scala.inline
    def TooltipPropsWithOverlay(): typings.antd.tooltipMod.TooltipPropsWithOverlay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.antd.tooltipMod.TooltipPropsWithOverlay]
    }
    
    @scala.inline
    def TooltipPropsWithTitle(): typings.antd.tooltipMod.TooltipPropsWithTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.antd.tooltipMod.TooltipPropsWithTitle]
    }
  }
  
  @js.native
  trait TooltipPropsWithOverlay
    extends AbstractTooltipProps
       with TooltipProps {
    
    @JSName("overlay")
    var overlay_TooltipPropsWithOverlay: ReactNode | RenderFunction = js.native
    
    var title: js.UndefOr[ReactNode | RenderFunction] = js.native
  }
  object TooltipPropsWithOverlay {
    
    @scala.inline
    def apply(): TooltipPropsWithOverlay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipPropsWithOverlay]
    }
    
    @scala.inline
    implicit class TooltipPropsWithOverlayMutableBuilder[Self <: TooltipPropsWithOverlay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverlay(value: ReactNode | RenderFunction): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactNode): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait TooltipPropsWithTitle
    extends AbstractTooltipProps
       with TooltipProps {
    
    @JSName("overlay")
    var overlay_TooltipPropsWithTitle: js.UndefOr[ReactNode | RenderFunction] = js.native
    
    var title: ReactNode | RenderFunction = js.native
  }
  object TooltipPropsWithTitle {
    
    @scala.inline
    def apply(): TooltipPropsWithTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipPropsWithTitle]
    }
    
    @scala.inline
    implicit class TooltipPropsWithTitleMutableBuilder[Self <: TooltipPropsWithTitle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOverlay(value: ReactNode | RenderFunction): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayFunction0(value: () => ReactNode): Self = StObject.set(x, "overlay", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOverlayUndefined: Self = StObject.set(x, "overlay", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[
    (TooltipPropsWithOverlay with RefAttributes[_]) | (TooltipPropsWithTitle with RefAttributes[_])
  ]
  
  /* This means you don't have to write `default`, but can instead just say `tooltipMod.foo` */
  override def _to: ForwardRefExoticComponent[
    (TooltipPropsWithOverlay with RefAttributes[_]) | (TooltipPropsWithTitle with RefAttributes[_])
  ] = default
}
