package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.BooleanLiteral
import typings.babelTypes.babelTypesStrings.JSXAttribute
import typings.babelTypes.babelTypesStrings.JSXClosingElement
import typings.babelTypes.babelTypesStrings.JSXElement
import typings.babelTypes.babelTypesStrings.JSXExpressionContainer
import typings.babelTypes.babelTypesStrings.JSXOpeningElement
import typings.babelTypes.babelTypesStrings.NullLiteral
import typings.babelTypes.babelTypesStrings.NumericLiteral
import typings.babelTypes.babelTypesStrings.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.StringLiteral_
  - typings.babelTypes.ts36Mod.NumericLiteral_
  - typings.babelTypes.ts36Mod.BooleanLiteral_
  - typings.babelTypes.ts36Mod.NullLiteral_
  - typings.babelTypes.ts36Mod.JSXAttribute_
  - typings.babelTypes.ts36Mod.JSXClosingElement_
  - typings.babelTypes.ts36Mod.JSXElement_
  - typings.babelTypes.ts36Mod.JSXExpressionContainer_
  - typings.babelTypes.ts36Mod.JSXOpeningElement_
*/
trait Immutable extends StObject
object Immutable {
  
  @scala.inline
  def BooleanLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: BooleanLiteral, value: Boolean): typings.babelTypes.ts36Mod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.BooleanLiteral_]
  }
  
  @scala.inline
  def JSXAttribute_(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXNamespacedName_,
    start: Double,
    `type`: JSXAttribute
  ): typings.babelTypes.ts36Mod.JSXAttribute_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXAttribute_]
  }
  
  @scala.inline
  def JSXClosingElement_(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXMemberExpression_,
    start: Double,
    `type`: JSXClosingElement
  ): typings.babelTypes.ts36Mod.JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXClosingElement_]
  }
  
  @scala.inline
  def JSXElement_(
    children: js.Array[typings.babelTypes.ts36Mod.JSXElement_ | JSXExpressionContainer_ | JSXText_],
    closingElement: JSXClosingElement_,
    end: Double,
    loc: SourceLocation,
    openingElement: JSXOpeningElement_,
    start: Double,
    `type`: JSXElement
  ): typings.babelTypes.ts36Mod.JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXElement_]
  }
  
  @scala.inline
  def JSXExpressionContainer_(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: JSXExpressionContainer
  ): typings.babelTypes.ts36Mod.JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXExpressionContainer_]
  }
  
  @scala.inline
  def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_],
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXMemberExpression_,
    selfClosing: Boolean,
    start: Double,
    `type`: JSXOpeningElement
  ): typings.babelTypes.ts36Mod.JSXOpeningElement_ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.JSXOpeningElement_]
  }
  
  @scala.inline
  def NullLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: NullLiteral): typings.babelTypes.ts36Mod.NullLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.NullLiteral_]
  }
  
  @scala.inline
  def NumericLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: NumericLiteral, value: Double): typings.babelTypes.ts36Mod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.NumericLiteral_]
  }
  
  @scala.inline
  def StringLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: StringLiteral, value: String): typings.babelTypes.ts36Mod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.StringLiteral_]
  }
}
