package typings.std.global

import typings.std.DOMMatrixInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("WebKitCSSMatrix")
@js.native
class WebKitCSSMatrix ()
  extends typings.std.DOMMatrix {
  def this(init: java.lang.String) = this()
  def this(init: js.Array[Double]) = this()
}
/* was `typeof DOMMatrix` */
object WebKitCSSMatrix {
  
  @JSGlobal("WebKitCSSMatrix.fromFloat32Array")
  @js.native
  def fromFloat32Array(array32: typings.std.Float32Array): typings.std.DOMMatrix = js.native
  
  @JSGlobal("WebKitCSSMatrix.fromFloat64Array")
  @js.native
  def fromFloat64Array(array64: typings.std.Float64Array): typings.std.DOMMatrix = js.native
  
  @JSGlobal("WebKitCSSMatrix.fromMatrix")
  @js.native
  def fromMatrix(): typings.std.DOMMatrix = js.native
  @JSGlobal("WebKitCSSMatrix.fromMatrix")
  @js.native
  def fromMatrix(other: DOMMatrixInit): typings.std.DOMMatrix = js.native
}
