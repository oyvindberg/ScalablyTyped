package typings.vegaLite

import typings.vegaLite.dataMod.DataComponent
import typings.vegaLite.facetMod.FacetNode
import typings.vegaLite.srcDataMod.InlineDataset
import typings.vegaLite.utilMod.Dict
import typings.vegaLite.vegaSchemaMod.VgData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/data/assemble", "assembleFacetData")
  @js.native
  def assembleFacetData(root: FacetNode): js.Array[VgData] = js.native
  
  @JSImport("vega-lite/build/src/compile/data/assemble", "assembleRootData")
  @js.native
  def assembleRootData(dataComponent: DataComponent, datasets: Dict[InlineDataset]): js.Array[VgData] = js.native
}
