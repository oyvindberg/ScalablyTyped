package typings.typescriptDeferred

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typescript-deferred", "create")
  @js.native
  def create[T](): DeferredInterface[T] = js.native
  
  @JSImport("typescript-deferred", "when")
  @js.native
  def when[T](): PromiseInterface[T] = js.native
  @JSImport("typescript-deferred", "when")
  @js.native
  def when[T](value: T): PromiseInterface[T] = js.native
  @JSImport("typescript-deferred", "when")
  @js.native
  def when[T](value: ThenableInterface[T]): PromiseInterface[T] = js.native
  
  type DeferredErrorCB[TP] = js.Function1[/* error */ js.Any, ThenableInterface[TP]]
  
  @js.native
  trait DeferredInterface[T] extends StObject {
    
    var promise: PromiseInterface[T] = js.native
    
    def reject(): DeferredInterface[T] = js.native
    def reject(error: js.Any): DeferredInterface[T] = js.native
    
    def resolve(): DeferredInterface[T] = js.native
    def resolve(value: T): DeferredInterface[T] = js.native
    def resolve(value: ThenableInterface[T]): DeferredInterface[T] = js.native
  }
  
  type DeferredSuccessCB[T, TP] = js.Function1[/* value */ T, ThenableInterface[TP]]
  
  type ImmediateErrorCB[TP] = js.Function1[/* err */ js.Any, TP]
  
  type ImmediateSuccessCB[T, TP] = js.Function1[/* value */ T, TP]
  
  @js.native
  trait PromiseInterface[T] extends ThenableInterface[T] {
    
    def always[TP](): PromiseInterface[TP] = js.native
    def always[TP](errorCB: DeferredErrorCB[TP] | ImmediateErrorCB[TP]): PromiseInterface[TP] = js.native
    
    def otherwise(): PromiseInterface[T] = js.native
    def otherwise(errorCB: DeferredErrorCB[T] | ImmediateErrorCB[T]): PromiseInterface[T] = js.native
  }
  
  @js.native
  trait ThenableInterface[T] extends StObject {
    
    def `then`[TP](): ThenableInterface[TP] = js.native
    def `then`[TP](successCB: (DeferredSuccessCB[T, TP]) | (ImmediateSuccessCB[T, TP])): ThenableInterface[TP] = js.native
    def `then`[TP](
      successCB: js.UndefOr[(DeferredSuccessCB[T, TP]) | (ImmediateSuccessCB[T, TP])],
      errorCB: DeferredErrorCB[TP] | ImmediateErrorCB[TP]
    ): ThenableInterface[TP] = js.native
  }
}
