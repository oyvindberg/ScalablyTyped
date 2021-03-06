package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`5`
import typings.cadesplugin.cadespluginNumbers.`93`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESCOM_CADES_TYPE extends StObject {
  
  val CADESCOM_CADES_BES: `1` = js.native
  
  val CADESCOM_CADES_DEFAULT: `0` = js.native
  
  val CADESCOM_CADES_T: `5` = js.native
  
  val CADESCOM_CADES_X_LONG_TYPE_1: `93` = js.native
}
object CADESCOM_CADES_TYPE {
  
  @scala.inline
  def apply(
    CADESCOM_CADES_BES: `1`,
    CADESCOM_CADES_DEFAULT: `0`,
    CADESCOM_CADES_T: `5`,
    CADESCOM_CADES_X_LONG_TYPE_1: `93`
  ): CADESCOM_CADES_TYPE = {
    val __obj = js.Dynamic.literal(CADESCOM_CADES_BES = CADESCOM_CADES_BES.asInstanceOf[js.Any], CADESCOM_CADES_DEFAULT = CADESCOM_CADES_DEFAULT.asInstanceOf[js.Any], CADESCOM_CADES_T = CADESCOM_CADES_T.asInstanceOf[js.Any], CADESCOM_CADES_X_LONG_TYPE_1 = CADESCOM_CADES_X_LONG_TYPE_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[CADESCOM_CADES_TYPE]
  }
  
  @scala.inline
  implicit class CADESCOM_CADES_TYPEMutableBuilder[Self <: CADESCOM_CADES_TYPE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCADESCOM_CADES_BES(value: `1`): Self = StObject.set(x, "CADESCOM_CADES_BES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_CADES_DEFAULT(value: `0`): Self = StObject.set(x, "CADESCOM_CADES_DEFAULT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_CADES_T(value: `5`): Self = StObject.set(x, "CADESCOM_CADES_T", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_CADES_X_LONG_TYPE_1(value: `93`): Self = StObject.set(x, "CADESCOM_CADES_X_LONG_TYPE_1", value.asInstanceOf[js.Any])
  }
}
