package typings.dateFns

import org.scalablytyped.runtime.Shortcut
import typings.dateFns.anon.AdditionalDigits
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endOfDecadeWithOptionsIndexMod {
  
  object default extends Shortcut {
    
    @JSImport("date-fns/esm/fp/endOfDecadeWithOptions/index", JSImport.Default)
    @js.native
    val ^ : CurriedFn2[AdditionalDigits, Date | Double, Date] = js.native
    
    type _To = CurriedFn2[AdditionalDigits, Date | Double, Date]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: CurriedFn2[AdditionalDigits, Date | Double, Date] = ^
  }
}
