package typings.stellarBase.xdrMod.xdr

import typings.stellarBase.stellarBaseNumbers.`0`
import typings.stellarBase.stellarBaseNumbers.`1`
import typings.stellarBase.stellarBaseNumbers.`2`
import typings.stellarBase.stellarBaseNumbers.`3`
import typings.stellarBase.stellarBaseStrings.scpStConfirm
import typings.stellarBase.stellarBaseStrings.scpStExternalize
import typings.stellarBase.stellarBaseStrings.scpStNominate
import typings.stellarBase.stellarBaseStrings.scpStPrepare
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScpStatementType extends StObject {
  
  val name: scpStPrepare | scpStConfirm | scpStExternalize | scpStNominate = js.native
  
  val value: `0` | `1` | `2` | `3` = js.native
}
object ScpStatementType {
  
  @scala.inline
  def apply(name: scpStPrepare | scpStConfirm | scpStExternalize | scpStNominate, value: `0` | `1` | `2` | `3`): ScpStatementType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScpStatementType]
  }
  
  @scala.inline
  implicit class ScpStatementTypeMutableBuilder[Self <: ScpStatementType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: scpStPrepare | scpStConfirm | scpStExternalize | scpStNominate): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
