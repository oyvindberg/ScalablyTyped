package typings.azureArmResource.mod

import typings.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResourceModels {
  
  @JSImport("azure-arm-resource", "ResourceModels.BaseResource")
  @js.native
  class BaseResource ()
    extends typings.azureArmResource.resourceModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "ResourceModels.CloudError")
  @js.native
  class CloudError protected ()
    extends typings.azureArmResource.resourceModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
