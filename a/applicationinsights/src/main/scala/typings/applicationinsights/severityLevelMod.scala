package typings.applicationinsights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights/out/Declarations/Contracts/Generated/SeverityLevel", JSImport.Namespace)
@js.native
object severityLevelMod extends js.Object {
  @js.native
  sealed trait SeverityLevel extends js.Object
  
  /* 4 */ val Critical: typings.applicationinsights.severityLevelMod.SeverityLevel.Critical with Double = js.native
  /* 3 */ val Error: typings.applicationinsights.severityLevelMod.SeverityLevel.Error with Double = js.native
  /* 1 */ val Information: typings.applicationinsights.severityLevelMod.SeverityLevel.Information with Double = js.native
  /* 0 */ val Verbose: typings.applicationinsights.severityLevelMod.SeverityLevel.Verbose with Double = js.native
  /* 2 */ val Warning: typings.applicationinsights.severityLevelMod.SeverityLevel.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SeverityLevel with Double] = js.native
  @js.native
  object SeverityLevel extends js.Object {
    @js.native
    sealed trait Critical extends SeverityLevel
    
    @js.native
    sealed trait Error extends SeverityLevel
    
    @js.native
    sealed trait Information extends SeverityLevel
    
    @js.native
    sealed trait Verbose extends SeverityLevel
    
    @js.native
    sealed trait Warning extends SeverityLevel
    
  }
  
}

