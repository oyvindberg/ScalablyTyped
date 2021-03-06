package typings.linguiMacro

import typings.linguiCore.i18nMod.MessageDescriptor
import typings.linguiMacro.createFormatMod.FormatPropsWithoutI18n
import typings.linguiMacro.reactSelectMod.Plural
import typings.linguiMacro.reactSelectMod.PluralPropsWithoutI18n
import typings.linguiMacro.reactSelectMod.Select
import typings.linguiMacro.reactSelectMod.SelectOrdinal
import typings.linguiMacro.reactSelectMod.SelectPropsWithoutI18n
import typings.linguiMacro.selectMod.PluralProps
import typings.linguiMacro.selectMod.SelectProps
import typings.linguiMacro.transMod.default
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.std.Date
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@lingui/macro", "DateFormat")
  @js.native
  class DateFormat protected ()
    extends Component[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState, js.Any] {
    def this(props: FormatPropsWithoutI18n[Date, DateTimeFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[Date, DateTimeFormatOptions], context: js.Any) = this()
  }
  @JSImport("@lingui/macro", "DateFormat")
  @js.native
  val DateFormat: ComponentClass[FormatPropsWithoutI18n[Date, DateTimeFormatOptions], ComponentState] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@lingui/macro", "NumberFormat")
  @js.native
  class NumberFormat protected ()
    extends Component[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState, js.Any] {
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions]) = this()
    def this(props: FormatPropsWithoutI18n[Double, NumberFormatOptions], context: js.Any) = this()
  }
  @JSImport("@lingui/macro", "NumberFormat")
  @js.native
  val NumberFormat: ComponentClass[FormatPropsWithoutI18n[Double, NumberFormatOptions], ComponentState] = js.native
  
  @JSImport("@lingui/macro", "Plural")
  @js.native
  class Plural_ protected () extends Plural {
    def this(props: PluralPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PluralPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/macro", "SelectOrdinal")
  @js.native
  class SelectOrdinal_ protected () extends SelectOrdinal {
    def this(props: PluralPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PluralPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/macro", "Select")
  @js.native
  class Select_ protected () extends Select {
    def this(props: SelectPropsWithoutI18n) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SelectPropsWithoutI18n, context: js.Any) = this()
  }
  
  @JSImport("@lingui/macro", "Trans")
  @js.native
  class Trans () extends default
  
  @JSImport("@lingui/macro", "date")
  @js.native
  def date(value: Date): MessageDescriptor = js.native
  @JSImport("@lingui/macro", "date")
  @js.native
  def date(value: Date, format: DateTimeFormatOptions): MessageDescriptor = js.native
  
  @JSImport("@lingui/macro", "number")
  @js.native
  def number(value: Double): MessageDescriptor = js.native
  @JSImport("@lingui/macro", "number")
  @js.native
  def number(value: Double, format: NumberFormatOptions): MessageDescriptor = js.native
  
  @JSImport("@lingui/macro", "plural")
  @js.native
  def plural(config: PluralProps): MessageDescriptor = js.native
  @JSImport("@lingui/macro", "plural")
  @js.native
  def plural(id: String, config: PluralProps): MessageDescriptor = js.native
  
  @JSImport("@lingui/macro", "select")
  @js.native
  def select(config: SelectProps): MessageDescriptor = js.native
  @JSImport("@lingui/macro", "select")
  @js.native
  def select(id: String, config: SelectProps): MessageDescriptor = js.native
  
  @JSImport("@lingui/macro", "selectOrdinal")
  @js.native
  def selectOrdinal(config: PluralProps): MessageDescriptor = js.native
  @JSImport("@lingui/macro", "selectOrdinal")
  @js.native
  def selectOrdinal(id: String, config: PluralProps): MessageDescriptor = js.native
  
  @JSImport("@lingui/macro", "t")
  @js.native
  def t(id: String): js.Function2[/* strings */ TemplateStringsArray, /* repeated */ js.Any, MessageDescriptor] = js.native
  @JSImport("@lingui/macro", "t")
  @js.native
  def t(strings: TemplateStringsArray, values: js.Any*): MessageDescriptor = js.native
}
