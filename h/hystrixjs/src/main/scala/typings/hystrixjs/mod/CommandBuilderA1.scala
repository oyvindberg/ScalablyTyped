package typings.hystrixjs.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBuilderA1[R, T] extends StObject {
  
  def build(): CommandA1[R, T] = js.native
  
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA1[R, T] = js.native
  
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA1[R, T] = js.native
  
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA1[R, T] = js.native
  
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA1[R, T] = js.native
  
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA1[R, T] = js.native
  
  def context(value: js.Any): CommandBuilderA1[R, T] = js.native
  
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA1[R, T] = js.native
  
  def fallbackTo(value: js.Function2[/* error */ Error, /* args */ js.Array[T], js.Thenable[R]]): CommandBuilderA1[R, T] = js.native
  
  def percentileWindowLength(value: Double): CommandBuilderA1[R, T] = js.native
  
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA1[R, T] = js.native
  
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA1[R, T] = js.native
  
  def run(value: js.Function1[/* t */ T, js.Thenable[R]]): CommandBuilderA1[R, T] = js.native
  
  def statisticalWindowLength(value: Double): CommandBuilderA1[R, T] = js.native
  
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA1[R, T] = js.native
  
  def timeout(value: Double): CommandBuilderA1[R, T] = js.native
}
object CommandBuilderA1 {
  
  @scala.inline
  def apply[R, T](
    build: () => CommandA1[R, T],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA1[R, T],
    circuitBreakerForceClosed: Boolean => CommandBuilderA1[R, T],
    circuitBreakerForceOpened: Boolean => CommandBuilderA1[R, T],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA1[R, T],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA1[R, T],
    context: js.Any => CommandBuilderA1[R, T],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA1[R, T],
    fallbackTo: js.Function2[/* error */ Error, /* args */ js.Array[T], js.Thenable[R]] => CommandBuilderA1[R, T],
    percentileWindowLength: Double => CommandBuilderA1[R, T],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA1[R, T],
    requestVolumeRejectionThreshold: Double => CommandBuilderA1[R, T],
    run: js.Function1[/* t */ T, js.Thenable[R]] => CommandBuilderA1[R, T],
    statisticalWindowLength: Double => CommandBuilderA1[R, T],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA1[R, T],
    timeout: Double => CommandBuilderA1[R, T]
  ): CommandBuilderA1[R, T] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
    __obj.asInstanceOf[CommandBuilderA1[R, T]]
  }
  
  @scala.inline
  implicit class CommandBuilderA1MutableBuilder[Self <: CommandBuilderA1[_, _], R, T] (val x: Self with (CommandBuilderA1[R, T])) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => CommandA1[R, T]): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCircuitBreakerErrorThresholdPercentage(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "circuitBreakerErrorThresholdPercentage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceClosed(value: Boolean => CommandBuilderA1[R, T]): Self = StObject.set(x, "circuitBreakerForceClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerForceOpened(value: Boolean => CommandBuilderA1[R, T]): Self = StObject.set(x, "circuitBreakerForceOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerRequestVolumeThreshold(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "circuitBreakerRequestVolumeThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCircuitBreakerSleepWindowInMilliseconds(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "circuitBreakerSleepWindowInMilliseconds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContext(value: js.Any => CommandBuilderA1[R, T]): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorHandler(value: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA1[R, T]): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFallbackTo(
      value: js.Function2[/* error */ Error, /* args */ js.Array[T], js.Thenable[R]] => CommandBuilderA1[R, T]
    ): Self = StObject.set(x, "fallbackTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowLength(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "percentileWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPercentileWindowNumberOfBuckets(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "percentileWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestVolumeRejectionThreshold(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "requestVolumeRejectionThreshold", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun(value: js.Function1[/* t */ T, js.Thenable[R]] => CommandBuilderA1[R, T]): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowLength(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "statisticalWindowLength", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatisticalWindowNumberOfBuckets(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "statisticalWindowNumberOfBuckets", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimeout(value: Double => CommandBuilderA1[R, T]): Self = StObject.set(x, "timeout", js.Any.fromFunction1(value))
  }
}
