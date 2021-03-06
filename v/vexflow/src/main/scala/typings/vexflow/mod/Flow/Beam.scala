package typings.vexflow.mod.Flow

import typings.vexflow.anon.Beammiddleonly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Beam")
@js.native
class Beam protected ()
  extends typings.vexflow.Vex.Flow.Beam {
  def this(notes: js.Array[typings.vexflow.Vex.Flow.StemmableNote]) = this()
  def this(notes: js.Array[typings.vexflow.Vex.Flow.StemmableNote], auto_stem: Boolean) = this()
}
object Beam {
  
  /* static member */
  @JSImport("vexflow", "Flow.Beam.applyAndGetBeams")
  @js.native
  def applyAndGetBeams(
    voice: typings.vexflow.Vex.Flow.Voice,
    stem_direction: Double,
    groups: js.Array[typings.vexflow.Vex.Flow.Fraction]
  ): js.Array[typings.vexflow.Vex.Flow.Beam] = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.Beam.generateBeams")
  @js.native
  def generateBeams(notes: js.Array[typings.vexflow.Vex.Flow.StemmableNote]): js.Array[typings.vexflow.Vex.Flow.Beam] = js.native
  @JSImport("vexflow", "Flow.Beam.generateBeams")
  @js.native
  def generateBeams(notes: js.Array[typings.vexflow.Vex.Flow.StemmableNote], config: Beammiddleonly): js.Array[typings.vexflow.Vex.Flow.Beam] = js.native
  
  /* static member */
  @JSImport("vexflow", "Flow.Beam.getDefaultBeamGroups")
  @js.native
  def getDefaultBeamGroups(time_sig: String): js.Array[typings.vexflow.Vex.Flow.Fraction] = js.native
}
