package typings.ckeditorCkeditor5Engine.mod.view

import typings.ckeditorCkeditor5Engine.anon.Shallow
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// engine/view/treewalker
@JSImport("@ckeditor/ckeditor5-engine", "view.TreeWalker")
@js.native
class TreeWalker protected () extends StObject {
  def this(options: Shallow) = this()
  
  val boundaries: Range = js.native
  
  val direction: TreeWalkerDirection = js.native
  
  val ignoreElementEnd: Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[Iterator[TreeWalkerValue, _, js.UndefOr[scala.Nothing]]] = js.native
  
  def next(): TreeWalkerValue = js.native
  
  val position: Position = js.native
  
  val shallow: Boolean = js.native
  
  val singleCharacters: Boolean = js.native
  
  def skip(skip: js.Function1[/* treeWalkerValue */ TreeWalkerValue, Boolean]): Unit = js.native
}
