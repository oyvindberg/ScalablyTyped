package typings.winrt.Windows.Networking.Connectivity

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataPlanUsage extends IDataPlanUsage
object DataPlanUsage {
  
  @scala.inline
  def apply(lastSyncTime: Date, megabytesUsed: Double): DataPlanUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], megabytesUsed = megabytesUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPlanUsage]
  }
}
