package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.`bin-ordinal`
import typings.vegaTypings.vegaTypingsStrings.band
import typings.vegaTypings.vegaTypingsStrings.identity
import typings.vegaTypings.vegaTypingsStrings.log
import typings.vegaTypings.vegaTypingsStrings.ordinal
import typings.vegaTypings.vegaTypingsStrings.point
import typings.vegaTypings.vegaTypingsStrings.pow
import typings.vegaTypings.vegaTypingsStrings.sequential
import typings.vegaTypings.vegaTypingsStrings.sqrt
import typings.vegaTypings.vegaTypingsStrings.symlog
import typings.vegaTypings.vegaTypingsStrings.time
import typings.vegaTypings.vegaTypingsStrings.utc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.vegaTypings.scaleMod.OrdinalScale
  - typings.vegaTypings.scaleMod.BandScale
  - typings.vegaTypings.scaleMod.PointScale
  - typings.vegaTypings.scaleMod.SequentialScale
  - typings.vegaTypings.scaleMod.TimeScale
  - typings.vegaTypings.scaleMod.IdentityScale
  - typings.vegaTypings.scaleMod.LinearScale
  - typings.vegaTypings.scaleMod.LogScale
  - typings.vegaTypings.scaleMod.SymLogScale
  - typings.vegaTypings.scaleMod.PowScale
  - typings.vegaTypings.scaleMod.SqrtScale
  - typings.vegaTypings.scaleMod.QuantileScale
  - typings.vegaTypings.scaleMod.QuantizeScale
  - typings.vegaTypings.scaleMod.ThresholdScale
  - typings.vegaTypings.scaleMod.BinOrdinalScale
*/
trait Scale extends StObject
object Scale {
  
  @scala.inline
  def BandScale(name: String, `type`: band): typings.vegaTypings.scaleMod.BandScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.BandScale]
  }
  
  @scala.inline
  def BinOrdinalScale(name: String, `type`: `bin-ordinal`): typings.vegaTypings.scaleMod.BinOrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.BinOrdinalScale]
  }
  
  @scala.inline
  def IdentityScale(name: String, `type`: identity): typings.vegaTypings.scaleMod.IdentityScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.IdentityScale]
  }
  
  @scala.inline
  def LinearScale(name: String): typings.vegaTypings.scaleMod.LinearScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.LinearScale]
  }
  
  @scala.inline
  def LogScale(name: String, `type`: log): typings.vegaTypings.scaleMod.LogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.LogScale]
  }
  
  @scala.inline
  def OrdinalScale(name: String, `type`: ordinal): typings.vegaTypings.scaleMod.OrdinalScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.OrdinalScale]
  }
  
  @scala.inline
  def PointScale(name: String, `type`: point): typings.vegaTypings.scaleMod.PointScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.PointScale]
  }
  
  @scala.inline
  def PowScale(exponent: Double | SignalRef, name: String, `type`: pow): typings.vegaTypings.scaleMod.PowScale = {
    val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.PowScale]
  }
  
  @scala.inline
  def QuantileScale(name: String): typings.vegaTypings.scaleMod.QuantileScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.QuantileScale]
  }
  
  @scala.inline
  def QuantizeScale(name: String): typings.vegaTypings.scaleMod.QuantizeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.QuantizeScale]
  }
  
  @scala.inline
  def SequentialScale(name: String, `type`: sequential): typings.vegaTypings.scaleMod.SequentialScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.SequentialScale]
  }
  
  @scala.inline
  def SqrtScale(name: String, `type`: sqrt): typings.vegaTypings.scaleMod.SqrtScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.SqrtScale]
  }
  
  @scala.inline
  def SymLogScale(name: String, `type`: symlog): typings.vegaTypings.scaleMod.SymLogScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.SymLogScale]
  }
  
  @scala.inline
  def ThresholdScale(name: String): typings.vegaTypings.scaleMod.ThresholdScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.ThresholdScale]
  }
  
  @scala.inline
  def TimeScale(name: String, `type`: time | utc): typings.vegaTypings.scaleMod.TimeScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.vegaTypings.scaleMod.TimeScale]
  }
}
