package typings.rxjsCompat

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arrayLikeObservableMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> * / any */ @JSImport("rxjs-compat/observable/ArrayLikeObservable", "ArrayLikeObservable")
  @js.native
  class ArrayLikeObservable[T] () extends StObject
  /* static members */
  object ArrayLikeObservable {
    
    @JSImport("rxjs-compat/observable/ArrayLikeObservable", "ArrayLikeObservable.create")
    @js.native
    def create[T](arrayLike: ArrayLike[T]): js.Any = js.native
    @JSImport("rxjs-compat/observable/ArrayLikeObservable", "ArrayLikeObservable.create")
    @js.native
    def create[T](
      arrayLike: ArrayLike[T],
      scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
    ): js.Any = js.native
  }
}
