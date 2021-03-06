package typings.vegaLite

import typings.std.Set
import typings.vegaLite.anon.PartialRecordAggregateOpS
import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.utilMod.Dict
import typings.vegaTypings.transformMod.AggregateTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataAggregateMod {
  
  @JSImport("vega-lite/build/src/compile/data/aggregate", "AggregateNode")
  @js.native
  class AggregateNode protected () extends DataFlowNode {
    /**
      * @param dimensions string set for dimensions
      * @param measures dictionary mapping field name => dict of aggregation functions and names to use
      */
    def this(parent: DataFlowNode, dimensions: Set[String], measures: Measures) = this()
    
    def addDimensions(fields: js.Array[String]): Unit = js.native
    
    def assemble(): AggregateTransform = js.native
    
    var dimensions: js.Any = js.native
    
    def groupBy: Set[String] = js.native
    
    var measures: js.Any = js.native
    
    def merge(other: AggregateNode): Boolean = js.native
  }
  /* static members */
  object AggregateNode {
    
    @JSImport("vega-lite/build/src/compile/data/aggregate", "AggregateNode.makeFromEncoding")
    @js.native
    def makeFromEncoding(parent: DataFlowNode, model: UnitModel): AggregateNode = js.native
    
    @JSImport("vega-lite/build/src/compile/data/aggregate", "AggregateNode.makeFromTransform")
    @js.native
    def makeFromTransform(parent: DataFlowNode, t: typings.vegaLite.transformMod.AggregateTransform): AggregateNode = js.native
  }
  
  type Measures = Dict[PartialRecordAggregateOpS]
}
