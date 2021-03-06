package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISyntaxNodeOrToken extends ISyntaxElement {
  
  def accept(visitor: ISyntaxVisitor): js.Any = js.native
  
  def withLeadingTrivia(leadingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
  
  def withTrailingTrivia(trailingTrivia: ISyntaxTriviaList): ISyntaxNodeOrToken = js.native
}
object ISyntaxNodeOrToken {
  
  @scala.inline
  def apply(
    accept: ISyntaxVisitor => js.Any,
    childAt: Double => ISyntaxElement,
    childCount: () => Double,
    collectTextElements: js.Array[String] => Unit,
    firstToken: () => ISyntaxToken,
    fullText: () => String,
    fullWidth: () => Double,
    isIncrementallyUnusable: () => Boolean,
    isList: () => Boolean,
    isNode: () => Boolean,
    isSeparatedList: () => Boolean,
    isToken: () => Boolean,
    isTypeScriptSpecific: () => Boolean,
    kind: () => SyntaxKind,
    lastToken: () => ISyntaxToken,
    leadingTrivia: () => ISyntaxTriviaList,
    leadingTriviaWidth: () => Double,
    trailingTrivia: () => ISyntaxTriviaList,
    trailingTriviaWidth: () => Double,
    width: () => Double,
    withLeadingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken,
    withTrailingTrivia: ISyntaxTriviaList => ISyntaxNodeOrToken
  ): ISyntaxNodeOrToken = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), childAt = js.Any.fromFunction1(childAt), childCount = js.Any.fromFunction0(childCount), collectTextElements = js.Any.fromFunction1(collectTextElements), firstToken = js.Any.fromFunction0(firstToken), fullText = js.Any.fromFunction0(fullText), fullWidth = js.Any.fromFunction0(fullWidth), isIncrementallyUnusable = js.Any.fromFunction0(isIncrementallyUnusable), isList = js.Any.fromFunction0(isList), isNode = js.Any.fromFunction0(isNode), isSeparatedList = js.Any.fromFunction0(isSeparatedList), isToken = js.Any.fromFunction0(isToken), isTypeScriptSpecific = js.Any.fromFunction0(isTypeScriptSpecific), kind = js.Any.fromFunction0(kind), lastToken = js.Any.fromFunction0(lastToken), leadingTrivia = js.Any.fromFunction0(leadingTrivia), leadingTriviaWidth = js.Any.fromFunction0(leadingTriviaWidth), trailingTrivia = js.Any.fromFunction0(trailingTrivia), trailingTriviaWidth = js.Any.fromFunction0(trailingTriviaWidth), width = js.Any.fromFunction0(width), withLeadingTrivia = js.Any.fromFunction1(withLeadingTrivia), withTrailingTrivia = js.Any.fromFunction1(withTrailingTrivia))
    __obj.asInstanceOf[ISyntaxNodeOrToken]
  }
  
  @scala.inline
  implicit class ISyntaxNodeOrTokenMutableBuilder[Self <: ISyntaxNodeOrToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: ISyntaxVisitor => js.Any): Self = StObject.set(x, "accept", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithLeadingTrivia(value: ISyntaxTriviaList => ISyntaxNodeOrToken): Self = StObject.set(x, "withLeadingTrivia", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithTrailingTrivia(value: ISyntaxTriviaList => ISyntaxNodeOrToken): Self = StObject.set(x, "withTrailingTrivia", js.Any.fromFunction1(value))
  }
}
