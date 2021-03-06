package typings.knockoutPreRendered

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.knockoutPreRendered.KnockoutComputedFunctions because Already inherited */ @js.native
trait KnockoutComputed[T] extends KnockoutObservable[T] {
  
  def dispose(): Unit = js.native
  
  var fn: KnockoutComputedFunctions[_] = js.native
  
  def getDependenciesCount(): Double = js.native
  
  def isActive(): Boolean = js.native
}
