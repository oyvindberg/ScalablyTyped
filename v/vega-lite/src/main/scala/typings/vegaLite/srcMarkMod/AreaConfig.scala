package typings.vegaLite.srcMarkMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaConfig[ES /* <: ExprRef | SignalRef */]
  extends MarkConfig[ES]
     with PointOverlayMixins[ES]
     with LineOverlayMixins[ES]
     with _AnyMarkConfig[ES]
object AreaConfig {
  
  @scala.inline
  def apply[ES /* <: ExprRef | SignalRef */](): AreaConfig[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaConfig[ES]]
  }
}
