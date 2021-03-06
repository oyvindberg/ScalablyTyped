package typings.rxLiteVirtualtime

import typings.rxLiteVirtualtime.Rx.VirtualTimeScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Rx {
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("Rx.HistoricalScheduler")
    @js.native
    class HistoricalSchedulerCls protected () extends VirtualTimeScheduler[Double, Double] {
      def this(initialClock: Double, comparer: js.Function2[/* first */ Double, /* second */ Double, Double]) = this()
    }
  }
}
