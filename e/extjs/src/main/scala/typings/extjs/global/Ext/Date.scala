package typings.extjs.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Date")
@js.native
class Date ()
  extends typings.extjs.Ext.Date
/* static members */
object Date {
  
  @JSGlobal("Ext.Date")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.DAY")
  @js.native
  def DAY: java.lang.String = js.native
  @scala.inline
  def DAY_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DAY")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.HOUR")
  @js.native
  def HOUR: java.lang.String = js.native
  @scala.inline
  def HOUR_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HOUR")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.MILLI")
  @js.native
  def MILLI: java.lang.String = js.native
  @scala.inline
  def MILLI_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MILLI")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.MINUTE")
  @js.native
  def MINUTE: java.lang.String = js.native
  @scala.inline
  def MINUTE_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MINUTE")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.MONTH")
  @js.native
  def MONTH: java.lang.String = js.native
  @scala.inline
  def MONTH_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MONTH")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.SECOND")
  @js.native
  def SECOND: java.lang.String = js.native
  @scala.inline
  def SECOND_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECOND")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.YEAR")
  @js.native
  def YEAR: java.lang.String = js.native
  @scala.inline
  def YEAR_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("YEAR")(x.asInstanceOf[js.Any])
  
  /** [Method] Provides a convenient method for performing basic date arithmetic
    * @param date Date The date to modify
    * @param interval String A valid date interval enum value.
    * @param value Number The amount to add to the current date.
    * @returns Date The new Date instance.
    */
  @JSGlobal("Ext.Date.add")
  @js.native
  def add(): js.Any = js.native
  @JSGlobal("Ext.Date.add")
  @js.native
  def add(date: js.UndefOr[scala.Nothing], interval: js.UndefOr[scala.Nothing], value: Double): js.Any = js.native
  @JSGlobal("Ext.Date.add")
  @js.native
  def add(date: js.UndefOr[scala.Nothing], interval: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.Date.add")
  @js.native
  def add(date: js.UndefOr[scala.Nothing], interval: java.lang.String, value: Double): js.Any = js.native
  @JSGlobal("Ext.Date.add")
  @js.native
  def add(date: js.Any): js.Any = js.native
  @JSGlobal("Ext.Date.add")
  @js.native
  def add(date: js.Any, interval: js.UndefOr[scala.Nothing], value: Double): js.Any = js.native
  @JSGlobal("Ext.Date.add")
  @js.native
  def add(date: js.Any, interval: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.Date.add")
  @js.native
  def add(date: js.Any, interval: java.lang.String, value: Double): js.Any = js.native
  
  /** [Method] Checks if a date falls on or between the given start and end dates
    * @param date Date The date to check
    * @param start Date Start date
    * @param end Date End date
    * @returns Boolean true if this date falls on or between the given start and end dates.
    */
  @JSGlobal("Ext.Date.between")
  @js.native
  def between(): Boolean = js.native
  @JSGlobal("Ext.Date.between")
  @js.native
  def between(date: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], end: js.Any): Boolean = js.native
  @JSGlobal("Ext.Date.between")
  @js.native
  def between(date: js.UndefOr[scala.Nothing], start: js.Any): Boolean = js.native
  @JSGlobal("Ext.Date.between")
  @js.native
  def between(date: js.UndefOr[scala.Nothing], start: js.Any, end: js.Any): Boolean = js.native
  @JSGlobal("Ext.Date.between")
  @js.native
  def between(date: js.Any): Boolean = js.native
  @JSGlobal("Ext.Date.between")
  @js.native
  def between(date: js.Any, start: js.UndefOr[scala.Nothing], end: js.Any): Boolean = js.native
  @JSGlobal("Ext.Date.between")
  @js.native
  def between(date: js.Any, start: js.Any): Boolean = js.native
  @JSGlobal("Ext.Date.between")
  @js.native
  def between(date: js.Any, start: js.Any, end: js.Any): Boolean = js.native
  
  /** [Method] Attempts to clear all time information from this Date by setting the time to midnight of the same day automatically
    * @param date Date The date
    * @param clone Boolean true to create a clone of this date, clear the time and return it.
    * @returns Date this or the clone.
    */
  @JSGlobal("Ext.Date.clearTime")
  @js.native
  def clearTime(): js.Any = js.native
  @JSGlobal("Ext.Date.clearTime")
  @js.native
  def clearTime(date: js.UndefOr[scala.Nothing], clone: Boolean): js.Any = js.native
  @JSGlobal("Ext.Date.clearTime")
  @js.native
  def clearTime(date: js.Any): js.Any = js.native
  @JSGlobal("Ext.Date.clearTime")
  @js.native
  def clearTime(date: js.Any, clone: Boolean): js.Any = js.native
  
  @JSGlobal("Ext.Date.clone")
  @js.native
  def clone(date: js.Any): js.Any = js.native
  
  /** [Property] (String[]) */
  @JSGlobal("Ext.Date.dayNames")
  @js.native
  def dayNames: typings.extjs.Ext.Array = js.native
  @scala.inline
  def dayNames_=(x: typings.extjs.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(x.asInstanceOf[js.Any])
  
  /** [Property] (String) */
  @JSGlobal("Ext.Date.defaultFormat")
  @js.native
  def defaultFormat: java.lang.String = js.native
  @scala.inline
  def defaultFormat_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormat")(x.asInstanceOf[js.Any])
  
  /** [Property] (Object) */
  @JSGlobal("Ext.Date.defaults")
  @js.native
  def defaults: js.Any = js.native
  @scala.inline
  def defaults_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  /** [Method] Formats a date given the supplied format string
    * @param date Date The date to format
    * @param format String The format string
    * @returns String The formatted date or an empty string if date parameter is not a JavaScript Date object
    */
  @JSGlobal("Ext.Date.format")
  @js.native
  def format(): java.lang.String = js.native
  @JSGlobal("Ext.Date.format")
  @js.native
  def format(date: js.UndefOr[scala.Nothing], format: java.lang.String): java.lang.String = js.native
  @JSGlobal("Ext.Date.format")
  @js.native
  def format(date: js.Any): java.lang.String = js.native
  @JSGlobal("Ext.Date.format")
  @js.native
  def format(date: js.Any, format: java.lang.String): java.lang.String = js.native
  
  /** [Property] (Object) */
  @JSGlobal("Ext.Date.formatCodes")
  @js.native
  def formatCodes: js.Any = js.native
  @scala.inline
  def formatCodes_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatCodes")(x.asInstanceOf[js.Any])
  
  /** [Method] Checks if the specified format contains information about anything other than the time
    * @param format String The format to check
    * @returns Boolean True if the format contains information about date/day information.
    */
  @JSGlobal("Ext.Date.formatContainsDateInfo")
  @js.native
  def formatContainsDateInfo(): Boolean = js.native
  @JSGlobal("Ext.Date.formatContainsDateInfo")
  @js.native
  def formatContainsDateInfo(format: java.lang.String): Boolean = js.native
  
  /** [Method] Checks if the specified format contains hour information
    * @param format String The format to check
    * @returns Boolean True if the format contains hour information
    */
  @JSGlobal("Ext.Date.formatContainsHourInfo")
  @js.native
  def formatContainsHourInfo(): Boolean = js.native
  @JSGlobal("Ext.Date.formatContainsHourInfo")
  @js.native
  def formatContainsHourInfo(format: java.lang.String): Boolean = js.native
  
  /** [Property] (Object) */
  @JSGlobal("Ext.Date.formatFunctions")
  @js.native
  def formatFunctions: js.Any = js.native
  @scala.inline
  def formatFunctions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatFunctions")(x.asInstanceOf[js.Any])
  
  /** [Method] Get the numeric day number of the year adjusted for leap year
    * @param date Date The date
    * @returns Number 0 to 364 (365 in leap years).
    */
  @JSGlobal("Ext.Date.getDayOfYear")
  @js.native
  def getDayOfYear(): Double = js.native
  @JSGlobal("Ext.Date.getDayOfYear")
  @js.native
  def getDayOfYear(date: js.Any): Double = js.native
  
  /** [Method] Get the number of days in the current month adjusted for leap year
    * @param date Date The date
    * @returns Number The number of days in the month.
    */
  @JSGlobal("Ext.Date.getDaysInMonth")
  @js.native
  def getDaysInMonth(): Double = js.native
  @JSGlobal("Ext.Date.getDaysInMonth")
  @js.native
  def getDaysInMonth(date: js.Any): Double = js.native
  
  /** [Method] Returns the number of milliseconds between two dates
    * @param dateA Date The first date.
    * @param dateB Date The second date.
    * @returns Number The difference in milliseconds
    */
  @JSGlobal("Ext.Date.getElapsed")
  @js.native
  def getElapsed(): Double = js.native
  @JSGlobal("Ext.Date.getElapsed")
  @js.native
  def getElapsed(dateA: js.UndefOr[scala.Nothing], dateB: js.Any): Double = js.native
  @JSGlobal("Ext.Date.getElapsed")
  @js.native
  def getElapsed(dateA: js.Any): Double = js.native
  @JSGlobal("Ext.Date.getElapsed")
  @js.native
  def getElapsed(dateA: js.Any, dateB: js.Any): Double = js.native
  
  /** [Method] Get the date of the first day of the month in which this date resides
    * @param date Date The date
    * @returns Date
    */
  @JSGlobal("Ext.Date.getFirstDateOfMonth")
  @js.native
  def getFirstDateOfMonth(): js.Any = js.native
  @JSGlobal("Ext.Date.getFirstDateOfMonth")
  @js.native
  def getFirstDateOfMonth(date: js.Any): js.Any = js.native
  
  /** [Method] Get the first day of the current month adjusted for leap year
    * @param date Date The date
    * @returns Number The day number (0-6).
    */
  @JSGlobal("Ext.Date.getFirstDayOfMonth")
  @js.native
  def getFirstDayOfMonth(): Double = js.native
  @JSGlobal("Ext.Date.getFirstDayOfMonth")
  @js.native
  def getFirstDayOfMonth(date: js.Any): Double = js.native
  
  /** [Method] Get the offset from GMT of the current date equivalent to the format specifier O
    * @param date Date The date
    * @param colon Boolean true to separate the hours and minutes with a colon.
    * @returns String The 4-character offset string prefixed with + or - (e.g. '-0600').
    */
  @JSGlobal("Ext.Date.getGMTOffset")
  @js.native
  def getGMTOffset(): java.lang.String = js.native
  @JSGlobal("Ext.Date.getGMTOffset")
  @js.native
  def getGMTOffset(date: js.UndefOr[scala.Nothing], colon: Boolean): java.lang.String = js.native
  @JSGlobal("Ext.Date.getGMTOffset")
  @js.native
  def getGMTOffset(date: js.Any): java.lang.String = js.native
  @JSGlobal("Ext.Date.getGMTOffset")
  @js.native
  def getGMTOffset(date: js.Any, colon: Boolean): java.lang.String = js.native
  
  /** [Method] Get the date of the last day of the month in which this date resides
    * @param date Date The date
    * @returns Date
    */
  @JSGlobal("Ext.Date.getLastDateOfMonth")
  @js.native
  def getLastDateOfMonth(): js.Any = js.native
  @JSGlobal("Ext.Date.getLastDateOfMonth")
  @js.native
  def getLastDateOfMonth(date: js.Any): js.Any = js.native
  
  /** [Method] Get the last day of the current month adjusted for leap year
    * @param date Date The date
    * @returns Number The day number (0-6).
    */
  @JSGlobal("Ext.Date.getLastDayOfMonth")
  @js.native
  def getLastDayOfMonth(): Double = js.native
  @JSGlobal("Ext.Date.getLastDayOfMonth")
  @js.native
  def getLastDayOfMonth(date: js.Any): Double = js.native
  
  /** [Method] Get the zero based JavaScript month number for the given short full month name
    * @param name String The short/full month name.
    * @returns Number The zero-based JavaScript month number.
    */
  @JSGlobal("Ext.Date.getMonthNumber")
  @js.native
  def getMonthNumber(): Double = js.native
  @JSGlobal("Ext.Date.getMonthNumber")
  @js.native
  def getMonthNumber(name: java.lang.String): Double = js.native
  
  /** [Method] Get the short day name for the given day number
    * @param day Number A zero-based JavaScript day number.
    * @returns String The short day name.
    */
  @JSGlobal("Ext.Date.getShortDayName")
  @js.native
  def getShortDayName(): java.lang.String = js.native
  @JSGlobal("Ext.Date.getShortDayName")
  @js.native
  def getShortDayName(day: Double): java.lang.String = js.native
  
  /** [Method] Get the short month name for the given month number
    * @param month Number A zero-based JavaScript month number.
    * @returns String The short month name.
    */
  @JSGlobal("Ext.Date.getShortMonthName")
  @js.native
  def getShortMonthName(): java.lang.String = js.native
  @JSGlobal("Ext.Date.getShortMonthName")
  @js.native
  def getShortMonthName(month: Double): java.lang.String = js.native
  
  /** [Method] Get the English ordinal suffix of the current day equivalent to the format specifier S
    * @param date Date The date
    * @returns String 'st, 'nd', 'rd' or 'th'.
    */
  @JSGlobal("Ext.Date.getSuffix")
  @js.native
  def getSuffix(): java.lang.String = js.native
  @JSGlobal("Ext.Date.getSuffix")
  @js.native
  def getSuffix(date: js.Any): java.lang.String = js.native
  
  /** [Method] Get the timezone abbreviation of the current date equivalent to the format specifier T
    * @param date Date The date
    * @returns String The abbreviated timezone name (e.g. 'CST', 'PDT', 'EDT', 'MPST' ...).
    */
  @JSGlobal("Ext.Date.getTimezone")
  @js.native
  def getTimezone(): java.lang.String = js.native
  @JSGlobal("Ext.Date.getTimezone")
  @js.native
  def getTimezone(date: js.Any): java.lang.String = js.native
  
  /** [Method] Get the numeric ISO 8601 week number of the year
    * @param date Date The date
    * @returns Number 1 to 53
    */
  @JSGlobal("Ext.Date.getWeekOfYear")
  @js.native
  def getWeekOfYear(): Double = js.native
  @JSGlobal("Ext.Date.getWeekOfYear")
  @js.native
  def getWeekOfYear(date: js.Any): Double = js.native
  
  /** [Method] Checks if the current date is affected by Daylight Saving Time DST
    * @param date Date The date
    * @returns Boolean true if the current date is affected by DST.
    */
  @JSGlobal("Ext.Date.isDST")
  @js.native
  def isDST(): Boolean = js.native
  @JSGlobal("Ext.Date.isDST")
  @js.native
  def isDST(date: js.Any): Boolean = js.native
  
  /** [Method] Compares if two dates are equal by comparing their values
    * @param date1 Date
    * @param date2 Date
    * @returns Boolean true if the date values are equal
    */
  @JSGlobal("Ext.Date.isEqual")
  @js.native
  def isEqual(): Boolean = js.native
  @JSGlobal("Ext.Date.isEqual")
  @js.native
  def isEqual(date1: js.UndefOr[scala.Nothing], date2: js.Any): Boolean = js.native
  @JSGlobal("Ext.Date.isEqual")
  @js.native
  def isEqual(date1: js.Any): Boolean = js.native
  @JSGlobal("Ext.Date.isEqual")
  @js.native
  def isEqual(date1: js.Any, date2: js.Any): Boolean = js.native
  
  /** [Method] Checks if the current date falls within a leap year
    * @param date Date The date
    * @returns Boolean True if the current date falls within a leap year, false otherwise.
    */
  @JSGlobal("Ext.Date.isLeapYear")
  @js.native
  def isLeapYear(): Boolean = js.native
  @JSGlobal("Ext.Date.isLeapYear")
  @js.native
  def isLeapYear(date: js.Any): Boolean = js.native
  
  /** [Method] Checks if the passed Date parameters will cause a JavaScript Date rollover
    * @param year Number 4-digit year
    * @param month Number 1-based month-of-year
    * @param day Number Day of month
    * @param hour Number Hour
    * @param minute Number Minute
    * @param second Number Second
    * @param millisecond Number Millisecond
    * @returns Boolean true if the passed parameters do not cause a Date "rollover", false otherwise.
    */
  @JSGlobal("Ext.Date.isValid")
  @js.native
  def isValid(
    year: js.UndefOr[Double],
    month: js.UndefOr[Double],
    day: js.UndefOr[Double],
    hour: js.UndefOr[Double],
    minute: js.UndefOr[Double],
    second: js.UndefOr[Double],
    millisecond: js.UndefOr[Double]
  ): Boolean = js.native
  
  /** [Property] (String[]) */
  @JSGlobal("Ext.Date.monthNames")
  @js.native
  def monthNames: typings.extjs.Ext.Array = js.native
  @scala.inline
  def monthNames_=(x: typings.extjs.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(x.asInstanceOf[js.Any])
  
  /** [Property] (Object) */
  @JSGlobal("Ext.Date.monthNumbers")
  @js.native
  def monthNumbers: js.Any = js.native
  @scala.inline
  def monthNumbers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthNumbers")(x.asInstanceOf[js.Any])
  
  /** [Method] Returns the current timestamp
    * @returns Number Milliseconds since UNIX epoch.
    */
  @JSGlobal("Ext.Date.now")
  @js.native
  def now(): Double = js.native
  
  /** [Method] Parses the passed string using the specified date format
    * @param input String The raw date string.
    * @param format String The expected date string format.
    * @param strict Boolean true to validate date strings while parsing (i.e. prevents JavaScript Date "rollover"). Invalid date strings will return null when parsed.
    * @returns Date The parsed Date.
    */
  @JSGlobal("Ext.Date.parse")
  @js.native
  def parse(): js.Any = js.native
  @JSGlobal("Ext.Date.parse")
  @js.native
  def parse(input: js.UndefOr[scala.Nothing], format: js.UndefOr[scala.Nothing], strict: Boolean): js.Any = js.native
  @JSGlobal("Ext.Date.parse")
  @js.native
  def parse(input: js.UndefOr[scala.Nothing], format: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.Date.parse")
  @js.native
  def parse(input: js.UndefOr[scala.Nothing], format: java.lang.String, strict: Boolean): js.Any = js.native
  @JSGlobal("Ext.Date.parse")
  @js.native
  def parse(input: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.Date.parse")
  @js.native
  def parse(input: java.lang.String, format: js.UndefOr[scala.Nothing], strict: Boolean): js.Any = js.native
  @JSGlobal("Ext.Date.parse")
  @js.native
  def parse(input: java.lang.String, format: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.Date.parse")
  @js.native
  def parse(input: java.lang.String, format: java.lang.String, strict: Boolean): js.Any = js.native
  
  /** [Property] (Object) */
  @JSGlobal("Ext.Date.parseFunctions")
  @js.native
  def parseFunctions: js.Any = js.native
  @scala.inline
  def parseFunctions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseFunctions")(x.asInstanceOf[js.Any])
  
  /** [Method] Provides a convenient method for performing basic date arithmetic
    * @param date Date The date to modify
    * @param interval String A valid date interval enum value.
    * @param value Number The amount to subtract from the current date.
    * @returns Date The new Date instance.
    */
  @JSGlobal("Ext.Date.subtract")
  @js.native
  def subtract(): js.Any = js.native
  @JSGlobal("Ext.Date.subtract")
  @js.native
  def subtract(date: js.UndefOr[scala.Nothing], interval: js.UndefOr[scala.Nothing], value: Double): js.Any = js.native
  @JSGlobal("Ext.Date.subtract")
  @js.native
  def subtract(date: js.UndefOr[scala.Nothing], interval: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.Date.subtract")
  @js.native
  def subtract(date: js.UndefOr[scala.Nothing], interval: java.lang.String, value: Double): js.Any = js.native
  @JSGlobal("Ext.Date.subtract")
  @js.native
  def subtract(date: js.Any): js.Any = js.native
  @JSGlobal("Ext.Date.subtract")
  @js.native
  def subtract(date: js.Any, interval: js.UndefOr[scala.Nothing], value: Double): js.Any = js.native
  @JSGlobal("Ext.Date.subtract")
  @js.native
  def subtract(date: js.Any, interval: java.lang.String): js.Any = js.native
  @JSGlobal("Ext.Date.subtract")
  @js.native
  def subtract(date: js.Any, interval: java.lang.String, value: Double): js.Any = js.native
  
  /** [Method] Removes all escaping for a date format string
    * @param format String The format to unescape
    * @returns String The unescaped format
    */
  @JSGlobal("Ext.Date.unescapeFormat")
  @js.native
  def unescapeFormat(): java.lang.String = js.native
  @JSGlobal("Ext.Date.unescapeFormat")
  @js.native
  def unescapeFormat(format: java.lang.String): java.lang.String = js.native
  
  /** [Property] (Boolean) */
  @JSGlobal("Ext.Date.useStrict")
  @js.native
  def useStrict: Boolean = js.native
  @scala.inline
  def useStrict_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useStrict")(x.asInstanceOf[js.Any])
}
