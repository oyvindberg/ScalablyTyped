package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.NearestTo
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fpRoundToNearestMinutesWithOptionsMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/fp/roundToNearestMinutesWithOptions", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[NearestTo, Date | Double, Date] = js.native
    
    type _To = CurriedFn2[NearestTo, Date | Double, Date]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[NearestTo, Date | Double, Date] = ^
  }
}
