package typings.reactIntl

import typings.formatjsIntl.mod.IntlError
import typings.formatjsIntl.srcCreateIntlMod.CreateIntlFn
import typings.formatjsIntl.srcErrorMod.IntlErrorCode
import typings.formatjsIntl.srcTypesMod.FormatDateOptions
import typings.formatjsIntl.srcTypesMod.FormatNumberOptions
import typings.formatjsIntl.srcTypesMod.IntlCache
import typings.formatjsIntl.srcTypesMod.MessageDescriptor
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.PropsWithoutRef
import typings.react.mod.Provider
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.reactIntl.anon.Children
import typings.reactIntl.anon.DateTimeFormatOptionsCust
import typings.reactIntl.anon.DisplayNamesOptionsvalues
import typings.reactIntl.anon.IntlListFormatOptionsvalu
import typings.reactIntl.anon.NumberFormatOptionsCustom
import typings.reactIntl.anon.PartialStateCache
import typings.reactIntl.anon.PartialStateCurrentValueInSeconds
import typings.reactIntl.anon.PickIntlConfigtimeZonefor
import typings.reactIntl.anon.PickPropsunitvalue
import typings.reactIntl.anon.Value
import typings.reactIntl.anon.WrappedComponentComponentType
import typings.reactIntl.dateTimeRangeMod.Props
import typings.reactIntl.injectIntlMod.Opts
import typings.reactIntl.injectIntlMod.WithIntlProps
import typings.reactIntl.injectIntlMod.WrappedComponentProps
import typings.reactIntl.messageMod.default
import typings.reactIntl.providerMod.OptionalIntlConfig
import typings.reactIntl.reactIntlBooleans.`false`
import typings.reactIntl.reactIntlBooleans.`true`
import typings.reactIntl.relativeMod.State
import typings.reactIntl.typesMod.IntlShape
import typings.std.Error
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("react-intl/lib", "FormattedDate")
  @js.native
  val FormattedDate: FC[DateTimeFormatOptionsCust] = js.native
  
  @JSImport("react-intl/lib", "FormattedDateParts")
  @js.native
  val FormattedDateParts: FC[FormatDateOptions with Children] = js.native
  
  @JSImport("react-intl/lib", "FormattedDateTimeRange")
  @js.native
  val FormattedDateTimeRange: FC[Props] = js.native
  
  @JSImport("react-intl/lib", "FormattedDisplayName")
  @js.native
  val FormattedDisplayName: FC[DisplayNamesOptionsvalues] = js.native
  
  @JSImport("react-intl/lib", "FormattedList")
  @js.native
  val FormattedList: FC[IntlListFormatOptionsvalu] = js.native
  
  @JSImport("react-intl/lib", "FormattedMessage")
  @js.native
  class FormattedMessage[V /* <: Record[String, _] */] () extends default[V]
  object FormattedMessage {
    
    @JSImport("react-intl/lib", "FormattedMessage")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-intl/lib", "FormattedMessage.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-intl/lib", "FormattedNumber")
  @js.native
  val FormattedNumber: FC[NumberFormatOptionsCustom] = js.native
  
  @JSImport("react-intl/lib", "FormattedNumberParts")
  @js.native
  val FormattedNumberParts: FC[FormatNumberOptions with Value] = js.native
  
  /* Inlined react.react.FC<react-intl.react-intl/lib/src/components/injectIntl.WithIntlProps<react-intl.react-intl/lib/src/components/plural.Props>> & {  WrappedComponent :react.react.ComponentType<react-intl.react-intl/lib/src/components/plural.Props>} */
  object FormattedPlural {
    
    @JSImport("react-intl/lib", "FormattedPlural")
    @js.native
    def apply(props: PropsWithChildren[WithIntlProps[typings.reactIntl.pluralMod.Props]]): ReactElement | Null = js.native
    @JSImport("react-intl/lib", "FormattedPlural")
    @js.native
    def apply(props: PropsWithChildren[WithIntlProps[typings.reactIntl.pluralMod.Props]], context: js.Any): ReactElement | Null = js.native
    @JSImport("react-intl/lib", "FormattedPlural")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/lib", "FormattedPlural.WrappedComponent")
    @js.native
    def WrappedComponent: ComponentType[typings.reactIntl.pluralMod.Props] = js.native
    @scala.inline
    def WrappedComponent_=(x: ComponentType[typings.reactIntl.pluralMod.Props]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WrappedComponent")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "FormattedPlural.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
    @scala.inline
    def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "FormattedPlural.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[Partial[WithIntlProps[typings.reactIntl.pluralMod.Props]]] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[Partial[WithIntlProps[typings.reactIntl.pluralMod.Props]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "FormattedPlural.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "FormattedPlural.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMap[WithIntlProps[typings.reactIntl.pluralMod.Props]]] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMap[WithIntlProps[typings.reactIntl.pluralMod.Props]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-intl/lib", "FormattedRelativeTime")
  @js.native
  class FormattedRelativeTime protected ()
    extends typings.reactIntl.relativeMod.default {
    def this(props: typings.reactIntl.relativeMod.Props) = this()
  }
  /* static members */
  object FormattedRelativeTime {
    
    @JSImport("react-intl/lib", "FormattedRelativeTime")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/lib", "FormattedRelativeTime.defaultProps")
    @js.native
    def defaultProps: PickPropsunitvalue = js.native
    @scala.inline
    def defaultProps_=(x: PickPropsunitvalue): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "FormattedRelativeTime.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "FormattedRelativeTime.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: typings.reactIntl.relativeMod.Props, state: State): PartialStateCurrentValueInSeconds | Null = js.native
  }
  
  @JSImport("react-intl/lib", "FormattedTime")
  @js.native
  val FormattedTime: FC[DateTimeFormatOptionsCust] = js.native
  
  @JSImport("react-intl/lib", "FormattedTimeParts")
  @js.native
  val FormattedTimeParts: FC[FormatDateOptions with Children] = js.native
  
  @JSImport("react-intl/lib", "IntlContext")
  @js.native
  val IntlContext: Context[IntlShape] = js.native
  
  @JSImport("react-intl/lib", "IntlProvider")
  @js.native
  class IntlProvider ()
    extends typings.reactIntl.providerMod.default
  /* static members */
  object IntlProvider {
    
    @JSImport("react-intl/lib", "IntlProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-intl/lib", "IntlProvider.defaultProps")
    @js.native
    def defaultProps: PickIntlConfigtimeZonefor = js.native
    @scala.inline
    def defaultProps_=(x: PickIntlConfigtimeZonefor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "IntlProvider.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-intl/lib", "IntlProvider.getDerivedStateFromProps")
    @js.native
    def getDerivedStateFromProps(props: OptionalIntlConfig, hasPrevConfigCache: typings.reactIntl.providerMod.State): PartialStateCache | Null = js.native
  }
  
  @JSImport("react-intl/lib", "InvalidConfigError")
  @js.native
  class InvalidConfigError protected ()
    extends typings.formatjsIntl.mod.InvalidConfigError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @JSImport("react-intl/lib", "MessageFormatError")
  @js.native
  class MessageFormatError protected ()
    extends typings.formatjsIntl.mod.MessageFormatError {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: js.UndefOr[scala.Nothing], exception: Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: Error) = this()
  }
  
  @JSImport("react-intl/lib", "MissingDataError")
  @js.native
  class MissingDataError protected ()
    extends typings.formatjsIntl.mod.MissingDataError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @JSImport("react-intl/lib", "MissingTranslationError")
  @js.native
  class MissingTranslationError protected ()
    extends typings.formatjsIntl.mod.MissingTranslationError {
    def this(descriptor: MessageDescriptor, locale: String) = this()
  }
  
  @JSImport("react-intl/lib", "RawIntlProvider")
  @js.native
  val RawIntlProvider: Provider[IntlShape] = js.native
  
  @JSImport("react-intl/lib", "ReactIntlError")
  @js.native
  class ReactIntlError[T /* <: IntlErrorCode */] protected () extends IntlError[T] {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: Error) = this()
  }
  
  @JSImport("react-intl/lib", "UnsupportedFormatterError")
  @js.native
  class UnsupportedFormatterError protected ()
    extends typings.formatjsIntl.mod.UnsupportedFormatterError {
    def this(message: String) = this()
    def this(message: String, exception: Error) = this()
  }
  
  @JSImport("react-intl/lib", "createIntl")
  @js.native
  val createIntl: CreateIntlFn[ReactNode, OptionalIntlConfig, IntlShape] = js.native
  
  @JSImport("react-intl/lib", "createIntlCache")
  @js.native
  def createIntlCache(): IntlCache = js.native
  
  @JSImport("react-intl/lib", "defineMessage")
  @js.native
  def defineMessage[T](msg: T): T = js.native
  
  @JSImport("react-intl/lib", "defineMessages")
  @js.native
  def defineMessages[K /* <: /* keyof any */ String */, T, U /* <: Record[K, T] */](msgs: U): U = js.native
  
  @JSImport("react-intl/lib", "injectIntl")
  @js.native
  def injectIntl[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P]): FC[WithIntlProps[P]] with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  @JSImport("react-intl/lib", "injectIntl")
  @js.native
  def injectIntl_IntlPropName_StringP_WrappedComponentPropsIntlPropNameT_ComponentTypeP[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] with RefAttributes[T]]) with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  @JSImport("react-intl/lib", "injectIntl")
  @js.native
  def injectIntl_false[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `false`]): FC[WithIntlProps[P]] with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  @JSImport("react-intl/lib", "injectIntl")
  @js.native
  def injectIntl_true[IntlPropName /* <: String */, P /* <: WrappedComponentProps[IntlPropName] */, T /* <: ComponentType[P] */](WrappedComponent: ComponentType[P], options: Opts[IntlPropName, `true`]): (ForwardRefExoticComponent[PropsWithoutRef[WithIntlProps[PropsWithChildren[P]]] with RefAttributes[T]]) with (WrappedComponentComponentType[P, IntlPropName]) = js.native
  
  @JSImport("react-intl/lib", "useIntl")
  @js.native
  def useIntl(): IntlShape = js.native
}
