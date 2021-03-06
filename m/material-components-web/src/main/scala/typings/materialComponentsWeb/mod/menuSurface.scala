package typings.materialComponentsWeb.mod

import typings.materialMenuSurface.anon.PartialMDCMenuSurfaceAdap
import typings.materialMenuSurface.utilMod.CssTransformPropertyName
import typings.std.Element
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuSurface {
  
  /**
    * Enum for representing an element corner for positioning the menu-surface.
    *
    * The START constants map to LEFT if element directionality is left
    * to right and RIGHT if the directionality is right to left.
    * Likewise END maps to RIGHT or LEFT depending on the directionality.
    */
  @JSImport("material-components-web", "menuSurface.Corner")
  @js.native
  object Corner extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialMenuSurface.constantsMod.Corner with Double] = js.native
    
    /* 13 */ val BOTTOM_END: typings.materialMenuSurface.constantsMod.Corner.BOTTOM_END with Double = js.native
    
    /* 1 */ val BOTTOM_LEFT: typings.materialMenuSurface.constantsMod.Corner.BOTTOM_LEFT with Double = js.native
    
    /* 5 */ val BOTTOM_RIGHT: typings.materialMenuSurface.constantsMod.Corner.BOTTOM_RIGHT with Double = js.native
    
    /* 9 */ val BOTTOM_START: typings.materialMenuSurface.constantsMod.Corner.BOTTOM_START with Double = js.native
    
    /* 12 */ val TOP_END: typings.materialMenuSurface.constantsMod.Corner.TOP_END with Double = js.native
    
    /* 0 */ val TOP_LEFT: typings.materialMenuSurface.constantsMod.Corner.TOP_LEFT with Double = js.native
    
    /* 4 */ val TOP_RIGHT: typings.materialMenuSurface.constantsMod.Corner.TOP_RIGHT with Double = js.native
    
    /* 8 */ val TOP_START: typings.materialMenuSurface.constantsMod.Corner.TOP_START with Double = js.native
  }
  
  /**
    * Enum for bits in the {@see Corner) bitmap.
    */
  @JSImport("material-components-web", "menuSurface.CornerBit")
  @js.native
  object CornerBit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.materialMenuSurface.constantsMod.CornerBit with Double] = js.native
    
    /* 1 */ val BOTTOM: typings.materialMenuSurface.constantsMod.CornerBit.BOTTOM with Double = js.native
    
    /* 2 */ val CENTER: typings.materialMenuSurface.constantsMod.CornerBit.CENTER with Double = js.native
    
    /* 8 */ val FLIP_RTL: typings.materialMenuSurface.constantsMod.CornerBit.FLIP_RTL with Double = js.native
    
    /* 4 */ val RIGHT: typings.materialMenuSurface.constantsMod.CornerBit.RIGHT with Double = js.native
  }
  
  @JSImport("material-components-web", "menuSurface.MDCMenuSurface")
  @js.native
  class MDCMenuSurface protected ()
    extends typings.materialMenuSurface.mod.MDCMenuSurface {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialMenuSurface.foundationMod.MDCMenuSurfaceFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCMenuSurface {
    
    @JSImport("material-components-web", "menuSurface.MDCMenuSurface.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialMenuSurface.componentMod.MDCMenuSurface = js.native
  }
  
  @JSImport("material-components-web", "menuSurface.MDCMenuSurfaceFoundation")
  @js.native
  class MDCMenuSurfaceFoundation ()
    extends typings.materialMenuSurface.mod.MDCMenuSurfaceFoundation {
    def this(adapter: PartialMDCMenuSurfaceAdap) = this()
  }
  
  /**
    * @license
    * Copyright 2018 Google Inc.
    *
    * Permission is hereby granted, free of charge, to any person obtaining a copy
    * of this software and associated documentation files (the "Software"), to deal
    * in the Software without restriction, including without limitation the rights
    * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    * copies of the Software, and to permit persons to whom the Software is
    * furnished to do so, subject to the following conditions:
    *
    * The above copyright notice and this permission notice shall be included in
    * all copies or substantial portions of the Software.
    *
    * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    * THE SOFTWARE.
    */
  object cssClasses {
    
    @JSImport("material-components-web", "menuSurface.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "menuSurface.cssClasses.ANCHOR")
    @js.native
    def ANCHOR: String = js.native
    @scala.inline
    def ANCHOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANCHOR")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "menuSurface.cssClasses.ANIMATING_CLOSED")
    @js.native
    def ANIMATING_CLOSED: String = js.native
    @scala.inline
    def ANIMATING_CLOSED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING_CLOSED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "menuSurface.cssClasses.ANIMATING_OPEN")
    @js.native
    def ANIMATING_OPEN: String = js.native
    @scala.inline
    def ANIMATING_OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANIMATING_OPEN")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "menuSurface.cssClasses.FIXED")
    @js.native
    def FIXED: String = js.native
    @scala.inline
    def FIXED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FIXED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "menuSurface.cssClasses.IS_OPEN_BELOW")
    @js.native
    def IS_OPEN_BELOW: String = js.native
    @scala.inline
    def IS_OPEN_BELOW_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_OPEN_BELOW")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "menuSurface.cssClasses.OPEN")
    @js.native
    def OPEN: String = js.native
    @scala.inline
    def OPEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "menuSurface.cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    @scala.inline
    def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
  
  object numbers {
    
    @JSImport("material-components-web", "menuSurface.numbers")
    @js.native
    val ^ : js.Any = js.native
    
    /** Ratio of anchor width to menu-surface width for switching from corner positioning to center positioning. */
    @JSImport("material-components-web", "menuSurface.numbers.ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO")
    @js.native
    def ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO: Double = js.native
    @scala.inline
    def ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANCHOR_TO_MENU_SURFACE_WIDTH_RATIO")(x.asInstanceOf[js.Any])
    
    /** Margin left to the edge of the viewport when menu-surface is at maximum possible height. Also used as a viewport margin. */
    @JSImport("material-components-web", "menuSurface.numbers.MARGIN_TO_EDGE")
    @js.native
    def MARGIN_TO_EDGE: Double = js.native
    @scala.inline
    def MARGIN_TO_EDGE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARGIN_TO_EDGE")(x.asInstanceOf[js.Any])
    
    /** Total duration of menu-surface close animation. */
    @JSImport("material-components-web", "menuSurface.numbers.TRANSITION_CLOSE_DURATION")
    @js.native
    def TRANSITION_CLOSE_DURATION: Double = js.native
    @scala.inline
    def TRANSITION_CLOSE_DURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_CLOSE_DURATION")(x.asInstanceOf[js.Any])
    
    /** Total duration of menu-surface open animation. */
    @JSImport("material-components-web", "menuSurface.numbers.TRANSITION_OPEN_DURATION")
    @js.native
    def TRANSITION_OPEN_DURATION: Double = js.native
    @scala.inline
    def TRANSITION_OPEN_DURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TRANSITION_OPEN_DURATION")(x.asInstanceOf[js.Any])
  }
  
  object strings {
    
    @JSImport("material-components-web", "menuSurface.strings")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "menuSurface.strings.CLOSED_EVENT")
    @js.native
    def CLOSED_EVENT: String = js.native
    @scala.inline
    def CLOSED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_EVENT")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "menuSurface.strings.FOCUSABLE_ELEMENTS")
    @js.native
    def FOCUSABLE_ELEMENTS: String = js.native
    @scala.inline
    def FOCUSABLE_ELEMENTS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FOCUSABLE_ELEMENTS")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "menuSurface.strings.OPENED_EVENT")
    @js.native
    def OPENED_EVENT: String = js.native
    @scala.inline
    def OPENED_EVENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENED_EVENT")(x.asInstanceOf[js.Any])
  }
  
  object util {
    
    /**
      * Returns the name of the correct transform property to use on the current browser.
      */
    @JSImport("material-components-web", "menuSurface.util.getTransformPropertyName")
    @js.native
    def getTransformPropertyName(globalObj: Window): CssTransformPropertyName = js.native
    @JSImport("material-components-web", "menuSurface.util.getTransformPropertyName")
    @js.native
    def getTransformPropertyName(globalObj: Window, forceRefresh: Boolean): CssTransformPropertyName = js.native
  }
}
