package typings.rrule

import typings.rrule.typesMod._ByWeekday
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weekdayMod {
  
  @JSImport("rrule/dist/esm/src/weekday", "ALL_WEEKDAYS")
  @js.native
  val ALL_WEEKDAYS: js.Array[WeekdayStr] = js.native
  
  @JSImport("rrule/dist/esm/src/weekday", "Weekday")
  @js.native
  class Weekday protected () extends _ByWeekday {
    def this(weekday: Double) = this()
    def this(weekday: Double, n: Double) = this()
    
    def equals(other: Weekday): Boolean = js.native
    
    def getJsWeekday(): Double = js.native
    
    val n: js.UndefOr[Double] = js.native
    
    def nth(n: Double): Weekday = js.native
    
    val weekday: Double = js.native
  }
  /* static members */
  object Weekday {
    
    @JSImport("rrule/dist/esm/src/weekday", "Weekday.fromStr")
    @js.native
    def fromStr(str: WeekdayStr): Weekday = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rrule.rruleStrings.MO
    - typings.rrule.rruleStrings.TU
    - typings.rrule.rruleStrings.WE
    - typings.rrule.rruleStrings.TH
    - typings.rrule.rruleStrings.FR
    - typings.rrule.rruleStrings.SA
    - typings.rrule.rruleStrings.SU
  */
  trait WeekdayStr extends _ByWeekday
  object WeekdayStr {
    
    @scala.inline
    def FR: typings.rrule.rruleStrings.FR = "FR".asInstanceOf[typings.rrule.rruleStrings.FR]
    
    @scala.inline
    def MO: typings.rrule.rruleStrings.MO = "MO".asInstanceOf[typings.rrule.rruleStrings.MO]
    
    @scala.inline
    def SA: typings.rrule.rruleStrings.SA = "SA".asInstanceOf[typings.rrule.rruleStrings.SA]
    
    @scala.inline
    def SU: typings.rrule.rruleStrings.SU = "SU".asInstanceOf[typings.rrule.rruleStrings.SU]
    
    @scala.inline
    def TH: typings.rrule.rruleStrings.TH = "TH".asInstanceOf[typings.rrule.rruleStrings.TH]
    
    @scala.inline
    def TU: typings.rrule.rruleStrings.TU = "TU".asInstanceOf[typings.rrule.rruleStrings.TU]
    
    @scala.inline
    def WE: typings.rrule.rruleStrings.WE = "WE".asInstanceOf[typings.rrule.rruleStrings.WE]
  }
}
