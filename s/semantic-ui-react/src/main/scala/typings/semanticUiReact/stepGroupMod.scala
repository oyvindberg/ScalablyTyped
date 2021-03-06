package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.semanticUiReactNumbers.`1`
import typings.semanticUiReact.semanticUiReactNumbers.`2`
import typings.semanticUiReact.semanticUiReactNumbers.`3`
import typings.semanticUiReact.semanticUiReactNumbers.`4`
import typings.semanticUiReact.semanticUiReactNumbers.`5`
import typings.semanticUiReact.semanticUiReactNumbers.`6`
import typings.semanticUiReact.semanticUiReactNumbers.`7`
import typings.semanticUiReact.semanticUiReactNumbers.`8`
import typings.semanticUiReact.semanticUiReactStrings.big
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.eight
import typings.semanticUiReact.semanticUiReactStrings.five
import typings.semanticUiReact.semanticUiReactStrings.four
import typings.semanticUiReact.semanticUiReactStrings.huge
import typings.semanticUiReact.semanticUiReactStrings.large
import typings.semanticUiReact.semanticUiReactStrings.massive
import typings.semanticUiReact.semanticUiReactStrings.mini
import typings.semanticUiReact.semanticUiReactStrings.one
import typings.semanticUiReact.semanticUiReactStrings.seven
import typings.semanticUiReact.semanticUiReactStrings.six
import typings.semanticUiReact.semanticUiReactStrings.small
import typings.semanticUiReact.semanticUiReactStrings.tablet
import typings.semanticUiReact.semanticUiReactStrings.three
import typings.semanticUiReact.semanticUiReactStrings.tiny
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.semanticUiReact.semanticUiReactStrings.two
import typings.semanticUiReact.stepStepMod.StepProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepGroupMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/elements/Step/StepGroup", JSImport.Default)
  @js.native
  val default: StatelessComponent[StepGroupProps] = js.native
  
  @js.native
  trait StepGroupProps
    extends StrictStepGroupProps
       with /* key */ StringDictionary[js.Any]
  object StepGroupProps {
    
    @scala.inline
    def apply(): StepGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepGroupProps]
    }
  }
  
  @js.native
  trait StrictStepGroupProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Steps can be attached to other elements. */
    var attached: js.UndefOr[Boolean | bottom | top] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A fluid step takes up the width of its container. */
    var fluid: js.UndefOr[Boolean] = js.native
    
    /** Shorthand array of props for Step. */
    var items: js.UndefOr[SemanticShorthandCollection[StepProps]] = js.native
    
    /** A step can show a ordered sequence of steps. */
    var ordered: js.UndefOr[Boolean] = js.native
    
    /** Steps can have different sizes. */
    var size: js.UndefOr[mini | tiny | small | large | big | huge | massive] = js.native
    
    /** A step can stack vertically only on smaller screens. */
    var stackable: js.UndefOr[tablet] = js.native
    
    /** A step can prevent itself from stacking on mobile. */
    var unstackable: js.UndefOr[Boolean] = js.native
    
    /** A step can be displayed stacked vertically. */
    var vertical: js.UndefOr[Boolean] = js.native
    
    /** Steps can be divided evenly inside their parent. */
    var widths: js.UndefOr[
        `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typings.semanticUiReact.semanticUiReactStrings.`1` | typings.semanticUiReact.semanticUiReactStrings.`2` | typings.semanticUiReact.semanticUiReactStrings.`3` | typings.semanticUiReact.semanticUiReactStrings.`4` | typings.semanticUiReact.semanticUiReactStrings.`5` | typings.semanticUiReact.semanticUiReactStrings.`6` | typings.semanticUiReact.semanticUiReactStrings.`7` | typings.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight
      ] = js.native
  }
  object StrictStepGroupProps {
    
    @scala.inline
    def apply(): StrictStepGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictStepGroupProps]
    }
    
    @scala.inline
    implicit class StrictStepGroupPropsMutableBuilder[Self <: StrictStepGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAttached(value: Boolean | bottom | top): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setItems(value: SemanticShorthandCollection[StepProps]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: SemanticShorthandItem[StepProps]*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setOrdered(value: Boolean): Self = StObject.set(x, "ordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderedUndefined: Self = StObject.set(x, "ordered", js.undefined)
      
      @scala.inline
      def setSize(value: mini | tiny | small | large | big | huge | massive): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStackable(value: tablet): Self = StObject.set(x, "stackable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackableUndefined: Self = StObject.set(x, "stackable", js.undefined)
      
      @scala.inline
      def setUnstackable(value: Boolean): Self = StObject.set(x, "unstackable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnstackableUndefined: Self = StObject.set(x, "unstackable", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setWidths(
        value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | typings.semanticUiReact.semanticUiReactStrings.`1` | typings.semanticUiReact.semanticUiReactStrings.`2` | typings.semanticUiReact.semanticUiReactStrings.`3` | typings.semanticUiReact.semanticUiReactStrings.`4` | typings.semanticUiReact.semanticUiReactStrings.`5` | typings.semanticUiReact.semanticUiReactStrings.`6` | typings.semanticUiReact.semanticUiReactStrings.`7` | typings.semanticUiReact.semanticUiReactStrings.`8` | one | two | three | four | five | six | seven | eight
      ): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    }
  }
  
  type _To = StatelessComponent[StepGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `stepGroupMod.foo` */
  override def _to: StatelessComponent[StepGroupProps] = default
}
