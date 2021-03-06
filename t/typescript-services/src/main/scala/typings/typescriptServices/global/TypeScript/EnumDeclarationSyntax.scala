package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.ISeparatedSyntaxList
import typings.typescriptServices.TypeScript.ISyntaxList
import typings.typescriptServices.TypeScript.ISyntaxToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.EnumDeclarationSyntax")
@js.native
class EnumDeclarationSyntax protected ()
  extends typings.typescriptServices.TypeScript.EnumDeclarationSyntax {
  def this(
    modifiers: ISyntaxList,
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    enumElements: ISeparatedSyntaxList,
    closeBraceToken: ISyntaxToken,
    parsedInStrictMode: Boolean
  ) = this()
}
object EnumDeclarationSyntax {
  
  /* static member */
  @JSGlobal("TypeScript.EnumDeclarationSyntax.create")
  @js.native
  def create(
    enumKeyword: ISyntaxToken,
    identifier: ISyntaxToken,
    openBraceToken: ISyntaxToken,
    closeBraceToken: ISyntaxToken
  ): typings.typescriptServices.TypeScript.EnumDeclarationSyntax = js.native
  
  /* static member */
  @JSGlobal("TypeScript.EnumDeclarationSyntax.create1")
  @js.native
  def create1(identifier: ISyntaxToken): typings.typescriptServices.TypeScript.EnumDeclarationSyntax = js.native
}
