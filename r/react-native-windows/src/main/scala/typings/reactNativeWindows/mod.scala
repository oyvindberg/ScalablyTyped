package typings.reactNativeWindows

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ComponentType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.RefAttributes
import typings.reactNativeWindows.anon.Children
import typings.reactNativeWindows.appThemeMod.AppThemeModule
import typings.reactNativeWindows.appThemeMod.MissingNativeAppThemeShim
import typings.reactNativeWindows.datePickerPropsMod.IDatePickerProps
import typings.reactNativeWindows.flyoutMod.IFlyoutTargetState
import typings.reactNativeWindows.flyoutPropsMod.IFlyoutProps
import typings.reactNativeWindows.glyphPropsMod.GlyphProps
import typings.reactNativeWindows.keyboardExtPropsMod.IKeyboardProps
import typings.reactNativeWindows.pickerPropsMod.IPickerProps
import typings.reactNativeWindows.pickerWindowsMod.PickerItem
import typings.reactNativeWindows.pickerWindowsMod.PickerPropsWithChildren
import typings.reactNativeWindows.pickerWindowsMod.State
import typings.reactNativeWindows.popupMod.IPopupTargetState
import typings.reactNativeWindows.popupPropsMod.IPopupProps
import typings.reactNativeWindows.viewWindowsMod.ViewWindowsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-windows", "AppTheme")
  @js.native
  val AppTheme: AppThemeModule | MissingNativeAppThemeShim = js.native
  
  @JSImport("react-native-windows", "DatePicker")
  @js.native
  class DatePicker protected ()
    extends typings.reactNativeWindows.datePickerMod.DatePicker {
    def this(props: IDatePickerProps) = this()
  }
  /* static members */
  object DatePicker {
    
    @JSImport("react-native-windows", "DatePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-windows", "DatePicker.defaultProps")
    @js.native
    def defaultProps: IDatePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: IDatePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-windows", "EventPhase")
  @js.native
  object EventPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.reactNativeWindows.keyboardExtPropsMod.EventPhase with Double] = js.native
    
    /* 2 */ val AtTarget: typings.reactNativeWindows.keyboardExtPropsMod.EventPhase.AtTarget with Double = js.native
    
    /* 3 */ val Bubbling: typings.reactNativeWindows.keyboardExtPropsMod.EventPhase.Bubbling with Double = js.native
    
    /* 1 */ val Capturing: typings.reactNativeWindows.keyboardExtPropsMod.EventPhase.Capturing with Double = js.native
    
    /* 0 */ val None: typings.reactNativeWindows.keyboardExtPropsMod.EventPhase.None with Double = js.native
  }
  
  @JSImport("react-native-windows", "Flyout")
  @js.native
  class Flyout protected ()
    extends typings.reactNativeWindows.flyoutMod.Flyout {
    def this(props: IFlyoutProps) = this()
  }
  /* static members */
  object Flyout {
    
    @JSImport("react-native-windows", "Flyout.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IFlyoutProps, prevState: IFlyoutTargetState): IFlyoutTargetState = js.native
  }
  
  @JSImport("react-native-windows", "Glyph")
  @js.native
  class Glyph protected ()
    extends typings.reactNativeWindows.glyphMod.Glyph {
    def this(props: GlyphProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GlyphProps, context: js.Any) = this()
  }
  
  @JSImport("react-native-windows", "HandledEventPhase")
  @js.native
  object HandledEventPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.reactNativeWindows.keyboardExtPropsMod.HandledEventPhase with Double] = js.native
    
    /* 3 */ val Bubbling: typings.reactNativeWindows.keyboardExtPropsMod.HandledEventPhase.Bubbling with Double = js.native
    
    /* 1 */ val Capturing: typings.reactNativeWindows.keyboardExtPropsMod.HandledEventPhase.Capturing with Double = js.native
  }
  
  @JSImport("react-native-windows", "Picker")
  @js.native
  class Picker protected ()
    extends typings.reactNativeWindows.pickerWindowsMod.Picker {
    def this(props: IPickerProps) = this()
  }
  /* static members */
  object Picker {
    
    @JSImport("react-native-windows", "Picker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-windows", "Picker.Item")
    @js.native
    def Item: Instantiable0[PickerItem] = js.native
    @scala.inline
    def Item_=(x: Instantiable0[PickerItem]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-windows", "Picker.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: PickerPropsWithChildren): State = js.native
  }
  
  @JSImport("react-native-windows", "Popup")
  @js.native
  class Popup protected ()
    extends typings.reactNativeWindows.popupMod.Popup {
    def this(props: IPopupProps) = this()
  }
  /* static members */
  object Popup {
    
    @JSImport("react-native-windows", "Popup.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(nextProps: IPopupProps, prevState: IPopupTargetState): IPopupTargetState = js.native
  }
  
  @JSImport("react-native-windows", "ViewWindows")
  @js.native
  val ViewWindows: ViewWindowsType = js.native
  
  @JSImport("react-native-windows", "supportKeyboard")
  @js.native
  def supportKeyboard[P /* <: js.Object */](WrappedComponent: ComponentType[P]): ForwardRefExoticComponent[(PropsWithoutRef[P with IKeyboardProps with Children]) with RefAttributes[_]] = js.native
}
