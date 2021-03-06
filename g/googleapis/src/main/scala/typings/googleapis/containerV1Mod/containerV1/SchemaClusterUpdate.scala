package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ClusterUpdate describes an update to the cluster. Exactly one update can be
  * applied to a cluster with each request, so at most one field can be
  * provided.
  */
@js.native
trait SchemaClusterUpdate extends StObject {
  
  /**
    * Configurations for the various addons available to run in the cluster.
    */
  var desiredAddonsConfig: js.UndefOr[SchemaAddonsConfig] = js.native
  
  /**
    * The desired image type for the node pool. NOTE: Set the
    * &quot;desired_node_pool&quot; field as well.
    */
  var desiredImageType: js.UndefOr[String] = js.native
  
  /**
    * The desired list of Google Compute Engine
    * [zones](/compute/docs/zones#available) in which the cluster&#39;s nodes
    * should be located. Changing the locations a cluster is in will result in
    * nodes being either created or removed from the cluster, depending on
    * whether locations are being added or removed.  This list must always
    * include the cluster&#39;s primary zone.
    */
  var desiredLocations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The desired configuration options for master authorized networks feature.
    */
  var desiredMasterAuthorizedNetworksConfig: js.UndefOr[SchemaMasterAuthorizedNetworksConfig] = js.native
  
  /**
    * The Kubernetes version to change the master to.  Users may specify either
    * explicit versions offered by Kubernetes Engine or version aliases, which
    * have the following behavior:  - &quot;latest&quot;: picks the highest
    * valid Kubernetes version - &quot;1.X&quot;: picks the highest valid
    * patch+gke.N patch in the 1.X version - &quot;1.X.Y&quot;: picks the
    * highest valid gke.N patch in the 1.X.Y version - &quot;1.X.Y-gke.N&quot;:
    * picks an explicit Kubernetes version - &quot;-&quot;: picks the default
    * Kubernetes version
    */
  var desiredMasterVersion: js.UndefOr[String] = js.native
  
  /**
    * The monitoring service the cluster should use to write metrics. Currently
    * available options:  * &quot;monitoring.googleapis.com&quot; - the Google
    * Cloud Monitoring service * &quot;none&quot; - no metrics will be exported
    * from the cluster
    */
  var desiredMonitoringService: js.UndefOr[String] = js.native
  
  /**
    * Autoscaler configuration for the node pool specified in
    * desired_node_pool_id. If there is only one pool in the cluster and
    * desired_node_pool_id is not provided then the change applies to that
    * single node pool.
    */
  var desiredNodePoolAutoscaling: js.UndefOr[SchemaNodePoolAutoscaling] = js.native
  
  /**
    * The node pool to be upgraded. This field is mandatory if
    * &quot;desired_node_version&quot;, &quot;desired_image_family&quot; or
    * &quot;desired_node_pool_autoscaling&quot; is specified and there is more
    * than one node pool on the cluster.
    */
  var desiredNodePoolId: js.UndefOr[String] = js.native
  
  /**
    * The Kubernetes version to change the nodes to (typically an upgrade).
    * Users may specify either explicit versions offered by Kubernetes Engine
    * or version aliases, which have the following behavior:  -
    * &quot;latest&quot;: picks the highest valid Kubernetes version -
    * &quot;1.X&quot;: picks the highest valid patch+gke.N patch in the 1.X
    * version - &quot;1.X.Y&quot;: picks the highest valid gke.N patch in
    * the 1.X.Y version - &quot;1.X.Y-gke.N&quot;: picks an explicit Kubernetes
    * version - &quot;-&quot;: picks the Kubernetes master version
    */
  var desiredNodeVersion: js.UndefOr[String] = js.native
}
object SchemaClusterUpdate {
  
  @scala.inline
  def apply(): SchemaClusterUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterUpdate]
  }
  
  @scala.inline
  implicit class SchemaClusterUpdateMutableBuilder[Self <: SchemaClusterUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredAddonsConfig(value: SchemaAddonsConfig): Self = StObject.set(x, "desiredAddonsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredAddonsConfigUndefined: Self = StObject.set(x, "desiredAddonsConfig", js.undefined)
    
    @scala.inline
    def setDesiredImageType(value: String): Self = StObject.set(x, "desiredImageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredImageTypeUndefined: Self = StObject.set(x, "desiredImageType", js.undefined)
    
    @scala.inline
    def setDesiredLocations(value: js.Array[String]): Self = StObject.set(x, "desiredLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredLocationsUndefined: Self = StObject.set(x, "desiredLocations", js.undefined)
    
    @scala.inline
    def setDesiredLocationsVarargs(value: String*): Self = StObject.set(x, "desiredLocations", js.Array(value :_*))
    
    @scala.inline
    def setDesiredMasterAuthorizedNetworksConfig(value: SchemaMasterAuthorizedNetworksConfig): Self = StObject.set(x, "desiredMasterAuthorizedNetworksConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredMasterAuthorizedNetworksConfigUndefined: Self = StObject.set(x, "desiredMasterAuthorizedNetworksConfig", js.undefined)
    
    @scala.inline
    def setDesiredMasterVersion(value: String): Self = StObject.set(x, "desiredMasterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredMasterVersionUndefined: Self = StObject.set(x, "desiredMasterVersion", js.undefined)
    
    @scala.inline
    def setDesiredMonitoringService(value: String): Self = StObject.set(x, "desiredMonitoringService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredMonitoringServiceUndefined: Self = StObject.set(x, "desiredMonitoringService", js.undefined)
    
    @scala.inline
    def setDesiredNodePoolAutoscaling(value: SchemaNodePoolAutoscaling): Self = StObject.set(x, "desiredNodePoolAutoscaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredNodePoolAutoscalingUndefined: Self = StObject.set(x, "desiredNodePoolAutoscaling", js.undefined)
    
    @scala.inline
    def setDesiredNodePoolId(value: String): Self = StObject.set(x, "desiredNodePoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredNodePoolIdUndefined: Self = StObject.set(x, "desiredNodePoolId", js.undefined)
    
    @scala.inline
    def setDesiredNodeVersion(value: String): Self = StObject.set(x, "desiredNodeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredNodeVersionUndefined: Self = StObject.set(x, "desiredNodeVersion", js.undefined)
  }
}
