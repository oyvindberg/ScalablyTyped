package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifySnapshotCopyRetentionPeriodResult extends StObject {
  
  var Cluster: js.UndefOr[typings.awsSdk.redshiftMod.Cluster] = js.native
}
object ModifySnapshotCopyRetentionPeriodResult {
  
  @scala.inline
  def apply(): ModifySnapshotCopyRetentionPeriodResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifySnapshotCopyRetentionPeriodResult]
  }
  
  @scala.inline
  implicit class ModifySnapshotCopyRetentionPeriodResultMutableBuilder[Self <: ModifySnapshotCopyRetentionPeriodResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
