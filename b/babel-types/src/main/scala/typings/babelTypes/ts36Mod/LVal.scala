package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ArrayPattern
import typings.babelTypes.babelTypesStrings.AssignmentPattern
import typings.babelTypes.babelTypesStrings.Identifier
import typings.babelTypes.babelTypesStrings.MemberExpression
import typings.babelTypes.babelTypesStrings.ObjectPattern
import typings.babelTypes.babelTypesStrings.RestElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.Identifier_
  - typings.babelTypes.ts36Mod.MemberExpression_
  - typings.babelTypes.ts36Mod.RestElement_
  - typings.babelTypes.ts36Mod.AssignmentPattern_
  - typings.babelTypes.ts36Mod.ArrayPattern_
  - typings.babelTypes.ts36Mod.ObjectPattern_
  - typings.babelTypes.ts36Mod.TSParameterProperty
*/
trait LVal extends StObject
object LVal {
  
  @scala.inline
  def ArrayPattern_(
    elements: js.Array[Expression],
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ArrayPattern
  ): typings.babelTypes.ts36Mod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ArrayPattern_]
  }
  
  @scala.inline
  def AssignmentPattern_(
    end: Double,
    left: Identifier_,
    loc: SourceLocation,
    right: Expression,
    start: Double,
    `type`: AssignmentPattern
  ): typings.babelTypes.ts36Mod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.AssignmentPattern_]
  }
  
  @scala.inline
  def Identifier_(end: Double, loc: SourceLocation, name: String, start: Double, `type`: Identifier): typings.babelTypes.ts36Mod.Identifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.Identifier_]
  }
  
  @scala.inline
  def MemberExpression_(
    computed: Boolean,
    end: Double,
    loc: SourceLocation,
    `object`: Expression | Super,
    property: Expression,
    start: Double,
    `type`: MemberExpression
  ): typings.babelTypes.ts36Mod.MemberExpression_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.MemberExpression_]
  }
  
  @scala.inline
  def ObjectPattern_(
    end: Double,
    loc: SourceLocation,
    properties: js.Array[AssignmentProperty | RestProperty_],
    start: Double,
    `type`: ObjectPattern
  ): typings.babelTypes.ts36Mod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ObjectPattern_]
  }
  
  @scala.inline
  def RestElement_(argument: LVal, end: Double, loc: SourceLocation, start: Double, `type`: RestElement): typings.babelTypes.ts36Mod.RestElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.RestElement_]
  }
  
  @scala.inline
  def TSParameterProperty(
    end: Double,
    loc: SourceLocation,
    parameter: Identifier_ | AssignmentPattern_,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSParameterProperty
  ): typings.babelTypes.ts36Mod.TSParameterProperty = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.TSParameterProperty]
  }
}
