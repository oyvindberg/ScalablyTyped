package typings.seleniumWebdriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def Browser: typings.seleniumWebdriver.capabilitiesMod.IBrowser = typings.seleniumWebdriver.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Browser").asInstanceOf[typings.seleniumWebdriver.capabilitiesMod.IBrowser]
  
  @scala.inline
  def Capability: typings.seleniumWebdriver.capabilitiesMod.ICapability = typings.seleniumWebdriver.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Capability").asInstanceOf[typings.seleniumWebdriver.capabilitiesMod.ICapability]
  
  type IWebElementId = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  @scala.inline
  def Key: typings.seleniumWebdriver.inputMod.IKey = typings.seleniumWebdriver.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Key").asInstanceOf[typings.seleniumWebdriver.inputMod.IKey]
  
  /* Rewritten from type alias, can be one of: 
    - typings.seleniumWebdriver.byMod.By
    - js.Function
    - typings.seleniumWebdriver.byMod.ByHash
  */
  type Locator = typings.seleniumWebdriver.mod._Locator | js.Function
}
