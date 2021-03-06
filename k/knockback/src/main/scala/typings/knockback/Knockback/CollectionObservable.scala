package typings.knockback.Knockback

import typings.backbone.mod.Collection
import typings.backbone.mod.Model
import typings.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<any> * / any */ @js.native
trait CollectionObservable extends StObject {
  
  def collection(): Collection[Model[_, ModelSetOptions, js.Object]] = js.native
  def collection(colleciton: Collection[Model[_, ModelSetOptions, js.Object]]): js.Any = js.native
  
  def comparator(comparatorFunction: js.Any): js.Any = js.native
  
  def destroy(): js.Any = js.native
  
  def filters(id: js.Any): Model[_, ModelSetOptions, js.Object] = js.native
  def filters(ids: js.Array[_]): CollectionObservable = js.native
  def filters(iterator: js.Function1[/* element */ Model[_, ModelSetOptions, js.Object], Boolean]): CollectionObservable = js.native
  
  def hasViewModels(): Boolean = js.native
  
  def shareOptions(): CollectionOptions = js.native
  
  def sortAttribute(attr: String): js.Any = js.native
  
  def viewModelByModel(model: Model[_, ModelSetOptions, js.Object]): ViewModel = js.native
}
