package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LineOfSightTarget
import typings.arcgisJsApi.esri.LineOfSightTargetConstructor
import typings.arcgisJsApi.esri.LineOfSightTargetProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineOfSightTargetMod extends Shortcut {
  
  @JSImport("esri/widgets/LineOfSight/LineOfSightTarget", JSImport.Namespace)
  @js.native
  val ^ : LineOfSightTargetConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/LineOfSight/LineOfSightTarget", JSImport.Namespace)
  @js.native
  class Class () extends LineOfSightTarget {
    def this(properties: LineOfSightTargetProperties) = this()
  }
  
  type _To = LineOfSightTargetConstructor
  
  /* This means you don't have to write `^`, but can instead just say `lineOfSightTargetMod.foo` */
  override def _to: LineOfSightTargetConstructor = ^
}
