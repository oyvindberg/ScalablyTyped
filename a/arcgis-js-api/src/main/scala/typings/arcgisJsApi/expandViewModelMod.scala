package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ExpandViewModel
import typings.arcgisJsApi.esri.ExpandViewModelConstructor
import typings.arcgisJsApi.esri.ExpandViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Expand/ExpandViewModel", JSImport.Namespace)
  @js.native
  val ^ : ExpandViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Expand/ExpandViewModel", JSImport.Namespace)
  @js.native
  class Class () extends ExpandViewModel {
    def this(properties: ExpandViewModelProperties) = this()
  }
  
  type _To = ExpandViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `expandViewModelMod.foo` */
  override def _to: ExpandViewModelConstructor = ^
}
