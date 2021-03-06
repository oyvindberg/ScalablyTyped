package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Size")
@js.native
class Size protected ()
  extends typings.babylonjs.BABYLON.Size {
  /**
    * Creates a Size object from the given width and height (floats).
    * @param width width of the new size
    * @param height height of the new size
    */
  def this(width: Double, height: Double) = this()
}
/* static members */
object Size {
  
  /**
    * Creates a new Size set at the linear interpolation "amount" between "start" and "end"
    * @param start starting size to lerp between
    * @param end end size to lerp between
    * @param amount amount to lerp between the start and end values
    * @returns a new Size set at the linear interpolation "amount" between "start" and "end"
    */
  @JSGlobal("BABYLON.Size.Lerp")
  @js.native
  def Lerp(start: typings.babylonjs.BABYLON.Size, end: typings.babylonjs.BABYLON.Size, amount: Double): typings.babylonjs.BABYLON.Size = js.native
  
  /**
    * Create a new size of zero
    * @returns a new Size set to (0.0, 0.0)
    */
  @JSGlobal("BABYLON.Size.Zero")
  @js.native
  def Zero(): typings.babylonjs.BABYLON.Size = js.native
}
