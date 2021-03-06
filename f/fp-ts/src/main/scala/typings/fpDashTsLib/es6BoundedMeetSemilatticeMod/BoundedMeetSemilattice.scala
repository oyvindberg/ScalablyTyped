package typings
package fpDashTsLib.es6BoundedMeetSemilatticeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundedMeetSemilattice[A]
  extends fpDashTsLib.es6MeetSemilatticeMod.MeetSemilattice[A] {
  val one: A
}

object BoundedMeetSemilattice {
  @scala.inline
  def apply[A](meet: (A, A) => A, one: A): BoundedMeetSemilattice[A] = {
    val __obj = js.Dynamic.literal(meet = js.Any.fromFunction2(meet), one = one.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BoundedMeetSemilattice[A]]
  }
}

