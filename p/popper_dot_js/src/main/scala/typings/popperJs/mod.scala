package typings.popperJs

import org.scalablytyped.runtime.StringDictionary
import typings.popperJs.anon.Arrow
import typings.popperJs.anon.BaseModifierbehaviorBehav
import typings.popperJs.anon.BaseModifierelementstring
import typings.popperJs.anon.BaseModifiergpuAccelerati
import typings.popperJs.anon.BaseModifiernamestring
import typings.popperJs.anon.BaseModifieroffsetnumbers
import typings.popperJs.anon.BaseModifieronLoadFunctio
import typings.popperJs.anon.BaseModifierpriorityArray
import typings.popperJs.popperJsBooleans.`false`
import typings.popperJs.popperJsStrings._empty
import typings.std.CSSStyleDeclaration
import typings.std.ClientRect
import typings.std.Element
import typings.std.Node
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("popper.js", JSImport.Default)
  @js.native
  class default protected () extends Popper {
    def this(reference: ReferenceObject, popper: Element) = this()
    def this(reference: Element, popper: Element) = this()
    def this(reference: ReferenceObject, popper: Element, options: PopperOptions) = this()
    def this(reference: Element, popper: Element, options: PopperOptions) = this()
  }
  object default {
    
    @JSImport("popper.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("popper.js", "default.Defaults")
    @js.native
    def Defaults: PopperOptions = js.native
    @scala.inline
    def Defaults_=(x: PopperOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Defaults")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("popper.js", "default.modifiers")
    @js.native
    def modifiers: js.Array[BaseModifiernamestring] = js.native
    @scala.inline
    def modifiers_=(x: js.Array[BaseModifiernamestring]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modifiers")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("popper.js", "default.placements")
    @js.native
    def placements: js.Array[Placement] = js.native
    @scala.inline
    def placements_=(x: js.Array[Placement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placements")(x.asInstanceOf[js.Any])
  }
  
  type BaseModifier = typings.popperJs.mod.Popper.BaseModifier
  
  type Behavior = typings.popperJs.mod.Popper.Behavior
  
  type Boundary = typings.popperJs.mod.Popper.Boundary
  
  type Data = typings.popperJs.mod.Popper.Data
  
  type ModifierFn = typings.popperJs.mod.Popper.ModifierFn
  
  type Modifiers = typings.popperJs.mod.Popper.Modifiers
  
  type Offset = typings.popperJs.mod.Popper.Offset
  
  type Padding = typings.popperJs.mod.Popper.Padding
  
  type Placement = typings.popperJs.mod.Popper.Placement
  
  @js.native
  trait Popper extends StObject {
    
    def destroy(): Unit = js.native
    
    def disableEventListeners(): Unit = js.native
    
    def enableEventListeners(): Unit = js.native
    
    var options: PopperOptions = js.native
    
    var popper: Element = js.native
    
    var reference: Element | ReferenceObject = js.native
    
    def scheduleUpdate(): Unit = js.native
    
    def update(): Unit = js.native
  }
  object Popper {
    
    @scala.inline
    def apply(
      destroy: () => Unit,
      disableEventListeners: () => Unit,
      enableEventListeners: () => Unit,
      options: typings.popperJs.mod.PopperOptions,
      popper: Element,
      reference: Element | typings.popperJs.mod.ReferenceObject,
      scheduleUpdate: () => Unit,
      update: () => Unit
    ): Popper = {
      val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), disableEventListeners = js.Any.fromFunction0(disableEventListeners), enableEventListeners = js.Any.fromFunction0(enableEventListeners), options = options.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], scheduleUpdate = js.Any.fromFunction0(scheduleUpdate), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Popper]
    }
    
    @js.native
    trait Attributes extends StObject {
      
      var `x-out-of-boundaries`: _empty | `false` = js.native
      
      var `x-placement`: typings.popperJs.mod.Popper.Placement = js.native
    }
    object Attributes {
      
      @scala.inline
      def apply(`x-out-of-boundaries`: _empty | `false`, `x-placement`: typings.popperJs.mod.Popper.Placement): Attributes = {
        val __obj = js.Dynamic.literal()
        __obj.updateDynamic("x-out-of-boundaries")(`x-out-of-boundaries`.asInstanceOf[js.Any])
        __obj.updateDynamic("x-placement")(`x-placement`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Attributes]
      }
      
      @scala.inline
      implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
        
        @scala.inline
        def `setX-out-of-boundaries`(value: _empty | `false`): Self = StObject.set(x, "x-out-of-boundaries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setX-placement`(value: typings.popperJs.mod.Popper.Placement): Self = StObject.set(x, "x-placement", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait BaseModifier extends StObject {
      
      var enabled: js.UndefOr[Boolean] = js.native
      
      var fn: js.UndefOr[typings.popperJs.mod.Popper.ModifierFn] = js.native
      
      var order: js.UndefOr[Double] = js.native
    }
    object BaseModifier {
      
      @scala.inline
      def apply(): typings.popperJs.mod.Popper.BaseModifier = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.popperJs.mod.Popper.BaseModifier]
      }
      
      @scala.inline
      implicit class BaseModifierMutableBuilder[Self <: typings.popperJs.mod.Popper.BaseModifier] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
        
        @scala.inline
        def setFn(
          value: (/* data */ typings.popperJs.mod.Popper.Data, /* options */ js.Object) => typings.popperJs.mod.Popper.Data
        ): Self = StObject.set(x, "fn", js.Any.fromFunction2(value))
        
        @scala.inline
        def setFnUndefined: Self = StObject.set(x, "fn", js.undefined)
        
        @scala.inline
        def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.popperJs.popperJsStrings.flip
      - typings.popperJs.popperJsStrings.clockwise
      - typings.popperJs.popperJsStrings.counterclockwise
    */
    trait Behavior extends StObject
    object Behavior {
      
      @scala.inline
      def clockwise: typings.popperJs.popperJsStrings.clockwise = "clockwise".asInstanceOf[typings.popperJs.popperJsStrings.clockwise]
      
      @scala.inline
      def counterclockwise: typings.popperJs.popperJsStrings.counterclockwise = "counterclockwise".asInstanceOf[typings.popperJs.popperJsStrings.counterclockwise]
      
      @scala.inline
      def flip: typings.popperJs.popperJsStrings.flip = "flip".asInstanceOf[typings.popperJs.popperJsStrings.flip]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.popperJs.popperJsStrings.scrollParent
      - typings.popperJs.popperJsStrings.viewport
      - typings.popperJs.popperJsStrings.window
    */
    trait Boundary extends StObject
    object Boundary {
      
      @scala.inline
      def scrollParent: typings.popperJs.popperJsStrings.scrollParent = "scrollParent".asInstanceOf[typings.popperJs.popperJsStrings.scrollParent]
      
      @scala.inline
      def viewport: typings.popperJs.popperJsStrings.viewport = "viewport".asInstanceOf[typings.popperJs.popperJsStrings.viewport]
      
      @scala.inline
      def window: typings.popperJs.popperJsStrings.window = "window".asInstanceOf[typings.popperJs.popperJsStrings.window]
    }
    
    @js.native
    trait Data extends StObject {
      
      var arrowElement: Element = js.native
      
      var arrowStyles: CSSStyleDeclaration = js.native
      
      var attributes: Attributes = js.native
      
      var boundaries: js.Object = js.native
      
      var flipped: Boolean = js.native
      
      var hide: Boolean = js.native
      
      var instance: Popper = js.native
      
      var offsets: Arrow = js.native
      
      var originalPlacement: typings.popperJs.mod.Popper.Placement = js.native
      
      var placement: typings.popperJs.mod.Popper.Placement = js.native
      
      var styles: CSSStyleDeclaration = js.native
    }
    object Data {
      
      @scala.inline
      def apply(
        arrowElement: Element,
        arrowStyles: CSSStyleDeclaration,
        attributes: Attributes,
        boundaries: js.Object,
        flipped: Boolean,
        hide: Boolean,
        instance: Popper,
        offsets: Arrow,
        originalPlacement: typings.popperJs.mod.Popper.Placement,
        placement: typings.popperJs.mod.Popper.Placement,
        styles: CSSStyleDeclaration
      ): typings.popperJs.mod.Popper.Data = {
        val __obj = js.Dynamic.literal(arrowElement = arrowElement.asInstanceOf[js.Any], arrowStyles = arrowStyles.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], boundaries = boundaries.asInstanceOf[js.Any], flipped = flipped.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], offsets = offsets.asInstanceOf[js.Any], originalPlacement = originalPlacement.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.popperJs.mod.Popper.Data]
      }
      
      @scala.inline
      implicit class DataMutableBuilder[Self <: typings.popperJs.mod.Popper.Data] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArrowElement(value: Element): Self = StObject.set(x, "arrowElement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArrowStyles(value: CSSStyleDeclaration): Self = StObject.set(x, "arrowStyles", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBoundaries(value: js.Object): Self = StObject.set(x, "boundaries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlipped(value: Boolean): Self = StObject.set(x, "flipped", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInstance(value: Popper): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsets(value: Arrow): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOriginalPlacement(value: typings.popperJs.mod.Popper.Placement): Self = StObject.set(x, "originalPlacement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlacement(value: typings.popperJs.mod.Popper.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyles(value: CSSStyleDeclaration): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      }
    }
    
    type ModifierFn = js.Function2[
        /* data */ typings.popperJs.mod.Popper.Data, 
        /* options */ js.Object, 
        typings.popperJs.mod.Popper.Data
      ]
    
    @js.native
    trait Modifiers
      extends /* name */ StringDictionary[js.UndefOr[typings.popperJs.mod.Popper.BaseModifier with (Record[String, _])]] {
      
      var applyStyle: js.UndefOr[BaseModifieronLoadFunctio] = js.native
      
      var arrow: js.UndefOr[BaseModifierelementstring] = js.native
      
      var computeStyle: js.UndefOr[BaseModifiergpuAccelerati] = js.native
      
      var flip: js.UndefOr[BaseModifierbehaviorBehav] = js.native
      
      var hide: js.UndefOr[typings.popperJs.mod.Popper.BaseModifier] = js.native
      
      var inner: js.UndefOr[typings.popperJs.mod.Popper.BaseModifier] = js.native
      
      var keepTogether: js.UndefOr[typings.popperJs.mod.Popper.BaseModifier] = js.native
      
      var offset: js.UndefOr[BaseModifieroffsetnumbers] = js.native
      
      var preventOverflow: js.UndefOr[BaseModifierpriorityArray] = js.native
      
      var shift: js.UndefOr[typings.popperJs.mod.Popper.BaseModifier] = js.native
    }
    object Modifiers {
      
      @scala.inline
      def apply(): typings.popperJs.mod.Popper.Modifiers = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.popperJs.mod.Popper.Modifiers]
      }
      
      @scala.inline
      implicit class ModifiersMutableBuilder[Self <: typings.popperJs.mod.Popper.Modifiers] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApplyStyle(value: BaseModifieronLoadFunctio): Self = StObject.set(x, "applyStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setApplyStyleUndefined: Self = StObject.set(x, "applyStyle", js.undefined)
        
        @scala.inline
        def setArrow(value: BaseModifierelementstring): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
        
        @scala.inline
        def setComputeStyle(value: BaseModifiergpuAccelerati): Self = StObject.set(x, "computeStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setComputeStyleUndefined: Self = StObject.set(x, "computeStyle", js.undefined)
        
        @scala.inline
        def setFlip(value: BaseModifierbehaviorBehav): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
        
        @scala.inline
        def setHide(value: typings.popperJs.mod.Popper.BaseModifier): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
        
        @scala.inline
        def setInner(value: typings.popperJs.mod.Popper.BaseModifier): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
        
        @scala.inline
        def setKeepTogether(value: typings.popperJs.mod.Popper.BaseModifier): Self = StObject.set(x, "keepTogether", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeepTogetherUndefined: Self = StObject.set(x, "keepTogether", js.undefined)
        
        @scala.inline
        def setOffset(value: BaseModifieroffsetnumbers): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
        
        @scala.inline
        def setPreventOverflow(value: BaseModifierpriorityArray): Self = StObject.set(x, "preventOverflow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreventOverflowUndefined: Self = StObject.set(x, "preventOverflow", js.undefined)
        
        @scala.inline
        def setShift(value: typings.popperJs.mod.Popper.BaseModifier): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      }
    }
    
    @js.native
    trait Offset extends StObject {
      
      var height: Double = js.native
      
      var left: Double = js.native
      
      var top: Double = js.native
      
      var width: Double = js.native
    }
    object Offset {
      
      @scala.inline
      def apply(height: Double, left: Double, top: Double, width: Double): typings.popperJs.mod.Popper.Offset = {
        val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.popperJs.mod.Popper.Offset]
      }
      
      @scala.inline
      implicit class OffsetMutableBuilder[Self <: typings.popperJs.mod.Popper.Offset] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Padding extends StObject {
      
      var bottom: js.UndefOr[Double] = js.native
      
      var left: js.UndefOr[Double] = js.native
      
      var right: js.UndefOr[Double] = js.native
      
      var top: js.UndefOr[Double] = js.native
    }
    object Padding {
      
      @scala.inline
      def apply(): typings.popperJs.mod.Popper.Padding = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.popperJs.mod.Popper.Padding]
      }
      
      @scala.inline
      implicit class PaddingMutableBuilder[Self <: typings.popperJs.mod.Popper.Padding] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
        
        @scala.inline
        def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
        
        @scala.inline
        def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
        
        @scala.inline
        def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.popperJs.popperJsStrings.`auto-start`
      - typings.popperJs.popperJsStrings.auto
      - typings.popperJs.popperJsStrings.`auto-end`
      - typings.popperJs.popperJsStrings.`top-start`
      - typings.popperJs.popperJsStrings.top
      - typings.popperJs.popperJsStrings.`top-end`
      - typings.popperJs.popperJsStrings.`right-start`
      - typings.popperJs.popperJsStrings.right
      - typings.popperJs.popperJsStrings.`right-end`
      - typings.popperJs.popperJsStrings.`bottom-end`
      - typings.popperJs.popperJsStrings.bottom
      - typings.popperJs.popperJsStrings.`bottom-start`
      - typings.popperJs.popperJsStrings.`left-end`
      - typings.popperJs.popperJsStrings.left
      - typings.popperJs.popperJsStrings.`left-start`
    */
    trait Placement extends StObject
    object Placement {
      
      @scala.inline
      def auto: typings.popperJs.popperJsStrings.auto = "auto".asInstanceOf[typings.popperJs.popperJsStrings.auto]
      
      @scala.inline
      def `auto-end`: typings.popperJs.popperJsStrings.`auto-end` = "auto-end".asInstanceOf[typings.popperJs.popperJsStrings.`auto-end`]
      
      @scala.inline
      def `auto-start`: typings.popperJs.popperJsStrings.`auto-start` = "auto-start".asInstanceOf[typings.popperJs.popperJsStrings.`auto-start`]
      
      @scala.inline
      def bottom: typings.popperJs.popperJsStrings.bottom = "bottom".asInstanceOf[typings.popperJs.popperJsStrings.bottom]
      
      @scala.inline
      def `bottom-end`: typings.popperJs.popperJsStrings.`bottom-end` = "bottom-end".asInstanceOf[typings.popperJs.popperJsStrings.`bottom-end`]
      
      @scala.inline
      def `bottom-start`: typings.popperJs.popperJsStrings.`bottom-start` = "bottom-start".asInstanceOf[typings.popperJs.popperJsStrings.`bottom-start`]
      
      @scala.inline
      def left: typings.popperJs.popperJsStrings.left = "left".asInstanceOf[typings.popperJs.popperJsStrings.left]
      
      @scala.inline
      def `left-end`: typings.popperJs.popperJsStrings.`left-end` = "left-end".asInstanceOf[typings.popperJs.popperJsStrings.`left-end`]
      
      @scala.inline
      def `left-start`: typings.popperJs.popperJsStrings.`left-start` = "left-start".asInstanceOf[typings.popperJs.popperJsStrings.`left-start`]
      
      @scala.inline
      def right: typings.popperJs.popperJsStrings.right = "right".asInstanceOf[typings.popperJs.popperJsStrings.right]
      
      @scala.inline
      def `right-end`: typings.popperJs.popperJsStrings.`right-end` = "right-end".asInstanceOf[typings.popperJs.popperJsStrings.`right-end`]
      
      @scala.inline
      def `right-start`: typings.popperJs.popperJsStrings.`right-start` = "right-start".asInstanceOf[typings.popperJs.popperJsStrings.`right-start`]
      
      @scala.inline
      def top: typings.popperJs.popperJsStrings.top = "top".asInstanceOf[typings.popperJs.popperJsStrings.top]
      
      @scala.inline
      def `top-end`: typings.popperJs.popperJsStrings.`top-end` = "top-end".asInstanceOf[typings.popperJs.popperJsStrings.`top-end`]
      
      @scala.inline
      def `top-start`: typings.popperJs.popperJsStrings.`top-start` = "top-start".asInstanceOf[typings.popperJs.popperJsStrings.`top-start`]
    }
    
    @scala.inline
    implicit class PopperMutableBuilder[Self <: Popper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableEventListeners(value: () => Unit): Self = StObject.set(x, "disableEventListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnableEventListeners(value: () => Unit): Self = StObject.set(x, "enableEventListeners", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptions(value: typings.popperJs.mod.PopperOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopper(value: Element): Self = StObject.set(x, "popper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReference(value: Element | typings.popperJs.mod.ReferenceObject): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheduleUpdate(value: () => Unit): Self = StObject.set(x, "scheduleUpdate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
    
    @js.native
    trait PopperOptions extends StObject {
      
      var eventsEnabled: js.UndefOr[Boolean] = js.native
      
      var modifiers: js.UndefOr[typings.popperJs.mod.Popper.Modifiers] = js.native
      
      var onCreate: js.UndefOr[js.Function1[/* data */ typings.popperJs.mod.Popper.Data, Unit]] = js.native
      
      var onUpdate: js.UndefOr[js.Function1[/* data */ typings.popperJs.mod.Popper.Data, Unit]] = js.native
      
      var placement: js.UndefOr[typings.popperJs.mod.Popper.Placement] = js.native
      
      var positionFixed: js.UndefOr[Boolean] = js.native
      
      var removeOnDestroy: js.UndefOr[Boolean] = js.native
    }
    object PopperOptions {
      
      @scala.inline
      def apply(): typings.popperJs.mod.Popper.PopperOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.popperJs.mod.Popper.PopperOptions]
      }
      
      @scala.inline
      implicit class PopperOptionsMutableBuilder[Self <: typings.popperJs.mod.Popper.PopperOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEventsEnabled(value: Boolean): Self = StObject.set(x, "eventsEnabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEventsEnabledUndefined: Self = StObject.set(x, "eventsEnabled", js.undefined)
        
        @scala.inline
        def setModifiers(value: typings.popperJs.mod.Popper.Modifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
        
        @scala.inline
        def setOnCreate(value: /* data */ typings.popperJs.mod.Popper.Data => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
        
        @scala.inline
        def setOnUpdate(value: /* data */ typings.popperJs.mod.Popper.Data => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
        
        @scala.inline
        def setPlacement(value: typings.popperJs.mod.Popper.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
        
        @scala.inline
        def setPositionFixed(value: Boolean): Self = StObject.set(x, "positionFixed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionFixedUndefined: Self = StObject.set(x, "positionFixed", js.undefined)
        
        @scala.inline
        def setRemoveOnDestroy(value: Boolean): Self = StObject.set(x, "removeOnDestroy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemoveOnDestroyUndefined: Self = StObject.set(x, "removeOnDestroy", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.popperJs.popperJsStrings.top
      - typings.popperJs.popperJsStrings.right
      - typings.popperJs.popperJsStrings.bottom
      - typings.popperJs.popperJsStrings.left
    */
    trait Position extends StObject
    object Position {
      
      @scala.inline
      def bottom: typings.popperJs.popperJsStrings.bottom = "bottom".asInstanceOf[typings.popperJs.popperJsStrings.bottom]
      
      @scala.inline
      def left: typings.popperJs.popperJsStrings.left = "left".asInstanceOf[typings.popperJs.popperJsStrings.left]
      
      @scala.inline
      def right: typings.popperJs.popperJsStrings.right = "right".asInstanceOf[typings.popperJs.popperJsStrings.right]
      
      @scala.inline
      def top: typings.popperJs.popperJsStrings.top = "top".asInstanceOf[typings.popperJs.popperJsStrings.top]
    }
    
    @js.native
    trait ReferenceObject extends StObject {
      
      var clientHeight: Double = js.native
      
      var clientWidth: Double = js.native
      
      def getBoundingClientRect(): ClientRect = js.native
      
      var referenceNode: js.UndefOr[Node] = js.native
    }
    object ReferenceObject {
      
      @scala.inline
      def apply(clientHeight: Double, clientWidth: Double, getBoundingClientRect: () => ClientRect): typings.popperJs.mod.Popper.ReferenceObject = {
        val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], getBoundingClientRect = js.Any.fromFunction0(getBoundingClientRect))
        __obj.asInstanceOf[typings.popperJs.mod.Popper.ReferenceObject]
      }
      
      @scala.inline
      implicit class ReferenceObjectMutableBuilder[Self <: typings.popperJs.mod.Popper.ReferenceObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGetBoundingClientRect(value: () => ClientRect): Self = StObject.set(x, "getBoundingClientRect", js.Any.fromFunction0(value))
        
        @scala.inline
        def setReferenceNode(value: Node): Self = StObject.set(x, "referenceNode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReferenceNodeUndefined: Self = StObject.set(x, "referenceNode", js.undefined)
      }
    }
  }
  
  type PopperOptions = typings.popperJs.mod.Popper.PopperOptions
  
  type Position = typings.popperJs.mod.Popper.Position
  
  type ReferenceObject = typings.popperJs.mod.Popper.ReferenceObject
}
