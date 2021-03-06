package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a whole or partial calendar date, e.g. a birthday. The time of
  * day and time zone are either specified elsewhere or are not significant.
  * The date is relative to the Proleptic Gregorian Calendar. This can
  * represent:  * A full date, with non-zero year, month and day values * A
  * month and day value, with a zero year, e.g. an anniversary * A year on its
  * own, with zero month and day values * A year and month value, with a zero
  * day, e.g. a credit card expiration date  Related types are
  * google.type.TimeOfDay and `google.protobuf.Timestamp`.
  */
@js.native
trait SchemaGoogleTypeDate extends StObject {
  
  /**
    * Day of month. Must be from 1 to 31 and valid for the year and month, or 0
    * if specifying a year by itself or a year and month where the day is not
    * significant.
    */
  var day: js.UndefOr[Double] = js.native
  
  /**
    * Month of year. Must be from 1 to 12, or 0 if specifying a year without a
    * month and day.
    */
  var month: js.UndefOr[Double] = js.native
  
  /**
    * Year of date. Must be from 1 to 9999, or 0 if specifying a date without a
    * year.
    */
  var year: js.UndefOr[Double] = js.native
}
object SchemaGoogleTypeDate {
  
  @scala.inline
  def apply(): SchemaGoogleTypeDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleTypeDate]
  }
  
  @scala.inline
  implicit class SchemaGoogleTypeDateMutableBuilder[Self <: SchemaGoogleTypeDate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    @scala.inline
    def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
    
    @scala.inline
    def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
  }
}
