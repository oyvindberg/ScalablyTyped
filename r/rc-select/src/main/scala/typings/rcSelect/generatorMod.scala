package typings.rcSelect

import typings.rcSelect.anon.Dictname
import typings.rcSelect.anon.FilterOption
import typings.rcSelect.anon.LabelInValue
import typings.rcSelect.generateMod.RefSelectProps
import typings.rcSelect.generateMod.SelectProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.RefForwardingComponent
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatorMod {
  
  @JSImport("rc-select/lib/interface/generator", "INTERNAL_PROPS_MARK")
  @js.native
  val INTERNAL_PROPS_MARK: /* "RC_SELECT_INTERNAL_PROPS_MARK" */ String = js.native
  
  @JSImport("rc-select/lib/interface/generator", "RefSelectFunc")
  @js.native
  def RefSelectFunc[OptionsType /* <: js.Array[js.Object] */, ValueType](Component: RefForwardingComponent[RefSelectProps, SelectProps[OptionsType, ValueType]]): ForwardRefExoticComponent[
    (PropsWithoutRef[SelectProps[OptionsType, ValueType]]) with RefAttributes[RefSelectProps]
  ] = js.native
  
  @js.native
  trait CustomTagProps extends StObject {
    
    var closable: Boolean = js.native
    
    var disabled: Boolean = js.native
    
    var label: DefaultValueType = js.native
    
    def onClose(): Unit = js.native
    def onClose(event: typings.react.mod.MouseEvent[HTMLElement, MouseEvent]): Unit = js.native
    
    var value: DefaultValueType = js.native
  }
  
  type DefaultValueType = RawValueType | (js.Array[LabelValueType | RawValueType]) | LabelValueType
  
  @js.native
  trait DisplayLabelValueType extends LabelValueType {
    
    var disabled: js.UndefOr[Boolean] = js.native
  }
  object DisplayLabelValueType {
    
    @scala.inline
    def apply(): DisplayLabelValueType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayLabelValueType]
    }
    
    @scala.inline
    implicit class DisplayLabelValueTypeMutableBuilder[Self <: DisplayLabelValueType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  type FilterFunc[OptionType] = js.Function2[/* inputValue */ String, /* option */ js.UndefOr[OptionType], Boolean]
  
  type FilterOptions[OptionsType /* <: js.Array[js.Object] */] = js.Function3[
    /* searchValue */ String, 
    /* options */ OptionsType, 
    /* config */ FilterOption[OptionsType], 
    OptionsType
  ]
  
  type FlattenOptionsType[OptionsType /* <: js.Array[js.Object] */] = js.Array[Dictname[OptionsType]]
  
  type GetLabeledValue[FOT /* <: FlattenOptionsType[js.Array[js.Object]] */] = js.Function2[/* value */ RawValueType, /* config */ LabelInValue[FOT], LabelValueType]
  
  type Key = String | Double
  
  @js.native
  trait LabelValueType extends StObject {
    
    var key: js.UndefOr[Key] = js.native
    
    var label: js.UndefOr[ReactNode] = js.native
    
    var value: js.UndefOr[RawValueType] = js.native
  }
  object LabelValueType {
    
    @scala.inline
    def apply(): LabelValueType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelValueType]
    }
    
    @scala.inline
    implicit class LabelValueTypeMutableBuilder[Self <: LabelValueType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: RawValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type OnClear = js.Function0[Unit]
  
  type RawValueType = String | Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.rcSelect.rcSelectStrings.option
    - typings.rcSelect.rcSelectStrings.selection
    - typings.rcSelect.rcSelectStrings.input
  */
  trait SelectSource extends StObject
  object SelectSource {
    
    @scala.inline
    def input: typings.rcSelect.rcSelectStrings.input = "input".asInstanceOf[typings.rcSelect.rcSelectStrings.input]
    
    @scala.inline
    def option: typings.rcSelect.rcSelectStrings.option = "option".asInstanceOf[typings.rcSelect.rcSelectStrings.option]
    
    @scala.inline
    def selection: typings.rcSelect.rcSelectStrings.selection = "selection".asInstanceOf[typings.rcSelect.rcSelectStrings.selection]
  }
  
  type SingleType[MixType] = MixType
}
