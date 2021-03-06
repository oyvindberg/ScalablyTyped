package typings.grommet

import typings.grommet.boxMod.BoxProps
import typings.grommet.checkBoxMod.CheckBoxProps
import typings.grommet.grommetStrings.checked
import typings.grommet.utilsMod.Omit
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.InputHTMLAttributes
import typings.std.HTMLDivElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkBoxGroupMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/CheckBoxGroup", "CheckBoxGroup")
  @js.native
  class CheckBoxGroup protected ()
    extends Component[
          CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])) = this()
    def this(
      props: CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/CheckBoxGroup", "CheckBoxGroup")
  @js.native
  val CheckBoxGroup: ComponentClass[
    CheckBoxGroupProps with BoxProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]), 
    ComponentState
  ] = js.native
  
  @js.native
  trait CheckBoxGroupProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var labelKey: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* event */ js.UndefOr[OnChangeEvent], Unit]] = js.native
    
    var options: js.Array[CheckBoxType] = js.native
    
    var value: js.UndefOr[js.Array[Double | String]] = js.native
    
    var valueKey: js.UndefOr[String] = js.native
  }
  object CheckBoxGroupProps {
    
    @scala.inline
    def apply(options: js.Array[CheckBoxType]): CheckBoxGroupProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckBoxGroupProps]
    }
    
    @scala.inline
    implicit class CheckBoxGroupPropsMutableBuilder[Self <: CheckBoxGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* event */ js.UndefOr[OnChangeEvent] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[CheckBoxType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: CheckBoxType*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: js.Array[Double | String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
  
  type CheckBoxType = Omit[
    CheckBoxProps with (DetailedHTMLProps[InputHTMLAttributes[HTMLInputElement], HTMLInputElement]), 
    checked
  ]
  
  @js.native
  trait OnChangeEvent extends StObject {
    
    var option: String | CheckBoxProps = js.native
    
    var value: String = js.native
  }
  object OnChangeEvent {
    
    @scala.inline
    def apply(option: String | CheckBoxProps, value: String): OnChangeEvent = {
      val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChangeEvent]
    }
    
    @scala.inline
    implicit class OnChangeEventMutableBuilder[Self <: OnChangeEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOption(value: String | CheckBoxProps): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
