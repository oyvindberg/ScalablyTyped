package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.Step
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eachHourOfIntervalWithOptionsMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/eachHourOfIntervalWithOptions", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[Step, Interval, js.Array[Date]] = js.native
    
    type _To = CurriedFn2[Step, Interval, js.Array[Date]]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[Step, Interval, js.Array[Date]] = ^
  }
}
