package typings.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * The Size object is used to describe the size or dimensions of
  * something, through its {@link #width} and {@link #height} properties.
  */
@JSGlobal("paper.Size")
@js.native
class Size protected ()
  extends typings.paper.paper.Size {
  /** 
    * Creates a Size object using the numbers in the given array as
    * dimensions.
    */
  def this(array: js.Array[_]) = this()
  /** 
    * Creates a Size object using the properties in the given object.
    */
  def this(`object`: js.Object) = this()
  /** 
    * Creates a Size object using the {@link Point#x} and {@link Point#y}
    * values of the given Point object.
    */
  def this(point: typings.paper.paper.Point) = this()
  /** 
    * Creates a Size object using the coordinates of the given Size object.
    */
  def this(size: typings.paper.paper.Size) = this()
  /** 
    * Creates a Size object with the given width and height values.
    * 
    * @param width - the width
    * @param height - the height
    */
  def this(width: Double, height: Double) = this()
}
object Size {
  
  /** 
    * Returns a new size object with the largest {@link #width} and
    * {@link #height} of the supplied sizes.
    * 
    * @return the newly created size object
    */
  /* static member */
  @JSGlobal("paper.Size.max")
  @js.native
  def max(size1: typings.paper.paper.Size, size2: typings.paper.paper.Size): typings.paper.paper.Size = js.native
  
  /** 
    * Returns a new size object with the smallest {@link #width} and
    * {@link #height} of the supplied sizes.
    * 
    * @return the newly created size object
    */
  /* static member */
  @JSGlobal("paper.Size.min")
  @js.native
  def min(size1: typings.paper.paper.Size, size2: typings.paper.paper.Size): typings.paper.paper.Size = js.native
  
  /** 
    * Returns a size object with random {@link #width} and {@link #height}
    * values between `0` and `1`.
    * 
    * @return the newly created size object
    */
  /* static member */
  @JSGlobal("paper.Size.random")
  @js.native
  def random(): typings.paper.paper.Size = js.native
}
