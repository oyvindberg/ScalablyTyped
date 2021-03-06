package typings.qlik.mod

import typings.qlik.qlikStrings.StringExpr
import typings.qlik.qlikStrings.StringExpression
import typings.qlik.qlikStrings.ValueExpression
import typings.qlik.qlikStrings.dimension
import typings.qlik.qlikStrings.expression
import typings.qlik.qlikStrings.measure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertyExpression
  extends CustomPropertyCommon
     with CustomProperty {
  
  var component: expression = js.native
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var expressionType: dimension | measure | StringExpr | typings.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression = js.native
  
  @JSName("type")
  var type_CustomPropertyExpression: js.UndefOr[scala.Nothing] = js.native
}
object CustomPropertyExpression {
  
  @scala.inline
  def apply(
    component: expression,
    expressionType: dimension | measure | StringExpr | typings.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
  ): CustomPropertyExpression = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], expressionType = expressionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyExpression]
  }
  
  @scala.inline
  implicit class CustomPropertyExpressionMutableBuilder[Self <: CustomPropertyExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: expression): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setExpressionType(
      value: dimension | measure | StringExpr | typings.qlik.qlikStrings.ValueExpr | ValueExpression | StringExpression
    ): Self = StObject.set(x, "expressionType", value.asInstanceOf[js.Any])
  }
}
