package typings.typescriptServices.mod

import typings.typescriptServices.TypeScript.IExpressionSyntax
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "ThrowStatementSyntax")
@js.native
class ThrowStatementSyntax protected ()
  extends typings.typescriptServices.TypeScript.ThrowStatementSyntax {
  def this(
    throwKeyword: ISyntaxToken,
    expression: IExpressionSyntax,
    semicolonToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object ThrowStatementSyntax {
  
  /* static member */
  @JSImport("typescript-services", "ThrowStatementSyntax.create1")
  @js.native
  def create1(expression: IExpressionSyntax): typings.typescriptServices.TypeScript.ThrowStatementSyntax = js.native
}
