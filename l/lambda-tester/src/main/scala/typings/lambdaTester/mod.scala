package typings.lambdaTester

import typings.awsLambda.handlerMod.ClientContext
import typings.awsLambda.handlerMod.Context
import typings.awsLambda.handlerMod.Handler
import typings.std.Error
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lambda-tester", JSImport.Namespace)
  @js.native
  def apply[T /* <: Handler[_, _] */](handler: T): LambdaTester[T] = js.native
  
  @JSImport("lambda-tester", "LambdaTester")
  @js.native
  class LambdaTester[T /* <: Handler[_, _] */] () extends StObject {
    
    def clientContext(clientContext: ClientContext): this.type = js.native
    
    def context(context: Context): this.type = js.native
    
    def event(event: HandlerEvent[T]): this.type = js.native
    
    def expectError(verifier: Verifier[HandlerError[T]]): js.Promise[_] = js.native
    
    def expectFail(verifier: Verifier[HandlerError[T]]): js.Promise[_] = js.native
    
    def expectReject(verifier: Verifier[HandlerError[T]]): js.Promise[_] = js.native
    
    def expectResolve(verifier: Verifier[HandlerResult[T]]): js.Promise[_] = js.native
    
    def expectResult(verifier: Verifier[HandlerResult[T]]): js.Promise[_] = js.native
    
    def expectSucceed(verifier: Verifier[HandlerResult[T]]): js.Promise[_] = js.native
    
    def identity(cognitoIdentityId: String, cognitoIdentityPoolId: String): this.type = js.native
    
    def timeout(seconds: Double): this.type = js.native
    
    def xray(): this.type = js.native
  }
  
  type HandlerError[T /* <: Handler[_, _] */] = NonNullable[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<aws-lambda.aws-lambda/handler.Callback<any>>['0'] */ js.Any
  ]
  
  type HandlerEvent[T /* <: Handler[_, _] */] = js.Any
  
  type HandlerResult[T /* <: Handler[_, _] */] = js.Any
  
  type Verifier[S] = VerifierFn[Error | S | String]
  
  @js.native
  trait VerifierFn[S] extends StObject {
    
    def apply(result: S): Unit | js.Promise[Unit] = js.native
    def apply(result: S, additional: js.UndefOr[scala.Nothing], done: js.Function0[js.Object]): Unit = js.native
    def apply(result: S, additional: js.Any): Unit | js.Promise[Unit] = js.native
    def apply(result: S, additional: js.Any, done: js.Function0[js.Object]): Unit = js.native
  }
}
