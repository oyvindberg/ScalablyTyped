package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.AmpersandEqualssign
import typings.babelTypes.babelTypesStrings.AssignmentExpression
import typings.babelTypes.babelTypesStrings.AsteriskEqualssign
import typings.babelTypes.babelTypesStrings.Equalssign
import typings.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignEqualssign
import typings.babelTypes.babelTypesStrings.GreaterthansignGreaterthansignGreaterthansignEqualssign
import typings.babelTypes.babelTypesStrings.LessthansignLessthansignEqualssign
import typings.babelTypes.babelTypesStrings.PercentsignEqualssign
import typings.babelTypes.babelTypesStrings.PlussignEqualssign
import typings.babelTypes.babelTypesStrings.SlashEqualssign
import typings.babelTypes.babelTypesStrings.VerticallineEqualssign
import typings.babelTypes.babelTypesStrings.`-Equalssign`
import typings.babelTypes.babelTypesStrings.`^Equalssign`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignmentExpression_
  extends Node
     with Expression {
  
  var left: LVal = js.native
  
  var operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign = js.native
  
  var right: Expression = js.native
  
  @JSName("type")
  var type_AssignmentExpression_ : AssignmentExpression = js.native
}
object AssignmentExpression_ {
  
  @scala.inline
  def apply(
    end: Double,
    left: LVal,
    loc: SourceLocation,
    operator: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign,
    right: Expression,
    start: Double,
    `type`: AssignmentExpression
  ): AssignmentExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentExpression_]
  }
  
  @scala.inline
  implicit class AssignmentExpression_MutableBuilder[Self <: AssignmentExpression_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: LVal): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(
      value: Equalssign | PlussignEqualssign | `-Equalssign` | AsteriskEqualssign | SlashEqualssign | PercentsignEqualssign | LessthansignLessthansignEqualssign | GreaterthansignGreaterthansignEqualssign | GreaterthansignGreaterthansignGreaterthansignEqualssign | VerticallineEqualssign | `^Equalssign` | AmpersandEqualssign
    ): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: AssignmentExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
