package typings.frecency

import typings.frecency.anon.ExactQueryMatchWeight
import typings.frecency.anon.FrecencyScore
import typings.frecency.anon.KeepScores
import typings.frecency.anon.SearchQuery
import typings.frecency.anon.SearchResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("frecency", JSImport.Default)
  @js.native
  class default[T] protected () extends Frecency[T] {
    def this(constructOpts: ExactQueryMatchWeight) = this()
  }
  
  @js.native
  trait Frecency[T] extends StObject {
    
    def save(arg: SearchQuery[T]): Unit = js.native
    
    var sort: js.Function1[
        (/* arg */ KeepScores[T]) | (/* arg */ SearchResults[T]), 
        js.Array[(T with FrecencyScore) | T]
      ] = js.native
  }
  object Frecency {
    
    @scala.inline
    def apply[T](
      save: SearchQuery[T] => Unit,
      sort: (/* arg */ KeepScores[T]) | (/* arg */ SearchResults[T]) => js.Array[(T with FrecencyScore) | T]
    ): Frecency[T] = {
      val __obj = js.Dynamic.literal(save = js.Any.fromFunction1(save), sort = js.Any.fromFunction1(sort))
      __obj.asInstanceOf[Frecency[T]]
    }
    
    @scala.inline
    implicit class FrecencyMutableBuilder[Self <: Frecency[_], T] (val x: Self with Frecency[T]) extends AnyVal {
      
      @scala.inline
      def setSave(value: SearchQuery[T] => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSort(
        value: (/* arg */ KeepScores[T]) | (/* arg */ SearchResults[T]) => js.Array[(T with FrecencyScore) | T]
      ): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
    }
  }
  
  type idAttrFn = js.Function1[/* result */ String, String]
}
