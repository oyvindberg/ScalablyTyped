package typings.officeUiFabricReact

import typings.officeUiFabricReact.baseFloatingPickerTypesMod.IBaseFloatingPickerProps
import typings.officeUiFabricReact.floatingPeoplePickerMod.IPeopleFloatingPickerProps
import typings.officeUiFabricReact.personaTypesMod.IPersonaProps
import typings.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsControlProps
import typings.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsCoreProps
import typings.officeUiFabricReact.suggestionsDottypesMod.ISuggestionsHeaderFooterItemProps
import typings.officeUiFabricReact.suggestionsStoreMod.SuggestionsStoreOptions
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFloatingPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/FloatingPicker", "BaseFloatingPeoplePicker")
  @js.native
  class BaseFloatingPeoplePicker protected ()
    extends typings.officeUiFabricReact.floatingPickerMod.BaseFloatingPeoplePicker {
    def this(basePickerProps: IPeopleFloatingPickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/FloatingPicker", "BaseFloatingPicker")
  @js.native
  class BaseFloatingPicker[T, P /* <: IBaseFloatingPickerProps[T] */] protected ()
    extends typings.officeUiFabricReact.floatingPickerMod.BaseFloatingPicker[T, P] {
    def this(basePickerProps: P) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/FloatingPicker", "FloatingPeoplePicker")
  @js.native
  class FloatingPeoplePicker protected ()
    extends typings.officeUiFabricReact.floatingPickerMod.FloatingPeoplePicker {
    def this(basePickerProps: IPeopleFloatingPickerProps) = this()
  }
  /* static members */
  object FloatingPeoplePicker {
    
    @JSImport("office-ui-fabric-react/lib/FloatingPicker", "FloatingPeoplePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/FloatingPicker", "FloatingPeoplePicker.defaultProps")
    @js.native
    def defaultProps: js.Any = js.native
    @scala.inline
    def defaultProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/FloatingPicker", "SuggestionItemType")
  @js.native
  object SuggestionItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.suggestionsControlMod.SuggestionItemType with Double] = js.native
    
    /* 2 */ val footer: typings.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.footer with Double = js.native
    
    /* 0 */ val header: typings.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.header with Double = js.native
    
    /* 1 */ val suggestion: typings.officeUiFabricReact.suggestionsControlMod.SuggestionItemType.suggestion with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/FloatingPicker", "SuggestionsControl")
  @js.native
  class SuggestionsControl[T] protected ()
    extends typings.officeUiFabricReact.floatingPickerMod.SuggestionsControl[T] {
    def this(suggestionsProps: ISuggestionsControlProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/FloatingPicker", "SuggestionsCore")
  @js.native
  class SuggestionsCore[T] protected ()
    extends typings.officeUiFabricReact.floatingPickerMod.SuggestionsCore[T] {
    def this(suggestionsProps: ISuggestionsCoreProps[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/FloatingPicker", "SuggestionsHeaderFooterItem")
  @js.native
  class SuggestionsHeaderFooterItem protected ()
    extends typings.officeUiFabricReact.floatingPickerMod.SuggestionsHeaderFooterItem {
    def this(props: ISuggestionsHeaderFooterItemProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/FloatingPicker", "SuggestionsStore")
  @js.native
  class SuggestionsStore[T] ()
    extends typings.officeUiFabricReact.floatingPickerMod.SuggestionsStore[T] {
    def this(options: SuggestionsStoreOptions[T]) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/FloatingPicker", "createItem")
  @js.native
  def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = js.native
}
