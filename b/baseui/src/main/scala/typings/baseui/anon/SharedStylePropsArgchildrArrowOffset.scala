package typings.baseui.anon

import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.bottomLeft
import typings.baseui.baseuiStrings.bottomRight
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.leftBottom
import typings.baseui.baseuiStrings.leftTop
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.rightBottom
import typings.baseui.baseuiStrings.rightTop
import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.topLeft
import typings.baseui.baseuiStrings.topRight
import typings.baseui.popoverMod.Offset
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/popover.SharedStylePropsArg & {  children :react.react.ReactNode | undefined} */
@js.native
trait SharedStylePropsArgchildrArrowOffset extends StObject {
  
  @JSName("$arrowOffset")
  var $arrowOffset: js.UndefOr[Offset] = js.native
  
  @JSName("$isAnimating")
  var $isAnimating: js.UndefOr[Boolean] = js.native
  
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.native
  
  @JSName("$placement")
  var $placement: js.UndefOr[
    topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
  ] = js.native
  
  @JSName("$popoverMargin")
  var $popoverMargin: js.UndefOr[Double] = js.native
  
  @JSName("$popoverOffset")
  var $popoverOffset: js.UndefOr[Offset] = js.native
  
  @JSName("$showArrow")
  var $showArrow: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
}
object SharedStylePropsArgchildrArrowOffset {
  
  @scala.inline
  def apply(): SharedStylePropsArgchildrArrowOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedStylePropsArgchildrArrowOffset]
  }
  
  @scala.inline
  implicit class SharedStylePropsArgchildrArrowOffsetMutableBuilder[Self <: SharedStylePropsArgchildrArrowOffset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$arrowOffset(value: Offset): Self = StObject.set(x, "$arrowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$arrowOffsetUndefined: Self = StObject.set(x, "$arrowOffset", js.undefined)
    
    @scala.inline
    def set$isAnimating(value: Boolean): Self = StObject.set(x, "$isAnimating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isAnimatingUndefined: Self = StObject.set(x, "$isAnimating", js.undefined)
    
    @scala.inline
    def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isOpenUndefined: Self = StObject.set(x, "$isOpen", js.undefined)
    
    @scala.inline
    def set$placement(
      value: topLeft | leftBottom | topRight | rightBottom | bottomLeft | right | auto | bottomRight | leftTop | left | bottom | rightTop | top
    ): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$placementUndefined: Self = StObject.set(x, "$placement", js.undefined)
    
    @scala.inline
    def set$popoverMargin(value: Double): Self = StObject.set(x, "$popoverMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$popoverMarginUndefined: Self = StObject.set(x, "$popoverMargin", js.undefined)
    
    @scala.inline
    def set$popoverOffset(value: Offset): Self = StObject.set(x, "$popoverOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$popoverOffsetUndefined: Self = StObject.set(x, "$popoverOffset", js.undefined)
    
    @scala.inline
    def set$showArrow(value: Boolean): Self = StObject.set(x, "$showArrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$showArrowUndefined: Self = StObject.set(x, "$showArrow", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
  }
}
