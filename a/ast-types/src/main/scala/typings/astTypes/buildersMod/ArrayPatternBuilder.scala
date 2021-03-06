package typings.astTypes.buildersMod

import typings.astTypes.anon.CommentsElements
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.SpreadElementKind
import typings.astTypes.namedTypesMod.namedTypes.ArrayPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayPatternBuilder extends StObject {
  
  def apply(elements: js.Array[PatternKind | SpreadElementKind | Null]): ArrayPattern = js.native
  
  def from(params: CommentsElements): ArrayPattern = js.native
}
