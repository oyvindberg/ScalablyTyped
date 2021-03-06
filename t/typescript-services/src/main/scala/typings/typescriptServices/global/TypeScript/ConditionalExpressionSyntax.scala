package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.ConditionalExpressionSyntax")
@js.native
class ConditionalExpressionSyntax protected ()
  extends typings.typescriptServices.TypeScript.ConditionalExpressionSyntax {
  def this(
    condition: IExpressionSyntax,
    questionToken: ISyntaxToken,
    whenTrue: IExpressionSyntax,
    colonToken: ISyntaxToken,
    whenFalse: IExpressionSyntax,
    parsedInStrictMode: Boolean
  ) = this()
}
object ConditionalExpressionSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.ConditionalExpressionSyntax.create1")
  @js.native
  def create1(condition: IExpressionSyntax, whenTrue: IExpressionSyntax, whenFalse: IExpressionSyntax): typings.typescriptServices.TypeScript.ConditionalExpressionSyntax = js.native
}
