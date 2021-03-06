package typings.rmcCalendar

import typings.react.mod.PureComponent
import typings.rmcCalendar.anon.WeekComponents
import typings.rmcCalendar.dataTypesMod.Models.CellData
import typings.rmcCalendar.dataTypesMod.Models.ExtraData
import typings.rmcCalendar.dataTypesMod.Models.Locale
import typings.rmcCalendar.dataTypesMod.Models.MonthData
import typings.rmcCalendar.rmcCalendarStrings.normal
import typings.rmcCalendar.rmcCalendarStrings.xl
import typings.std.Date
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleMonthMod {
  
  @JSImport("rmc-calendar/lib/date/SingleMonth", JSImport.Default)
  @js.native
  class default protected () extends SingleMonth {
    def this(props: PropsType) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rmc-calendar/lib/date/SingleMonth", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-calendar/lib/date/SingleMonth", "default.defaultProps")
    @js.native
    def defaultProps: PropsType = js.native
    @scala.inline
    def defaultProps_=(x: PropsType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PropsType extends StObject {
    
    var getDateExtra: js.UndefOr[js.Function1[/* date */ Date, ExtraData]] = js.native
    
    var locale: Locale = js.native
    
    var monthData: MonthData = js.native
    
    var onCellClick: js.UndefOr[js.Function2[/* data */ CellData, /* monthData */ MonthData, Unit]] = js.native
    
    var rowSize: js.UndefOr[normal | xl] = js.native
  }
  object PropsType {
    
    @scala.inline
    def apply(locale: Locale, monthData: MonthData): PropsType = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], monthData = monthData.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDateExtra(value: /* date */ Date => ExtraData): Self = StObject.set(x, "getDateExtra", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDateExtraUndefined: Self = StObject.set(x, "getDateExtra", js.undefined)
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthData(value: MonthData): Self = StObject.set(x, "monthData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCellClick(value: (/* data */ CellData, /* monthData */ MonthData) => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      @scala.inline
      def setRowSize(value: normal | xl): Self = StObject.set(x, "rowSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSizeUndefined: Self = StObject.set(x, "rowSize", js.undefined)
    }
  }
  
  @js.native
  trait SingleMonth
    extends PureComponent[PropsType, WeekComponents, js.Any] {
    
    @JSName("componentWillMount")
    def componentWillMount_MSingleMonth(): Unit = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MSingleMonth(nextProps: PropsType): Unit = js.native
    
    def genWeek(weeksData: js.Array[CellData], index: Double): Unit = js.native
    
    def setWarpper(dom: HTMLDivElement): Unit = js.native
    
    def updateWeeks(): Unit = js.native
    def updateWeeks(monthData: MonthData): Unit = js.native
    
    var wrapperDivDOM: HTMLDivElement | Null = js.native
  }
}
