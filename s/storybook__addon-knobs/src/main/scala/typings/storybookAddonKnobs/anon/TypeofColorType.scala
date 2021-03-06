package typings.storybookAddonKnobs.anon

import org.scalablytyped.runtime.Instantiable0
import typings.storybookAddonKnobs.colorMod.ColorTypeKnobValue
import typings.storybookAddonKnobs.colorMod.ColorTypeProps
import typings.storybookAddonKnobs.colorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofColorType extends Instantiable0[default] {
  
  var defaultProps: ColorTypeProps = js.native
  
  def deserialize(value: ColorTypeKnobValue): String = js.native
  
  var propTypes: OnChange = js.native
  
  def serialize(value: ColorTypeKnobValue): String = js.native
}
