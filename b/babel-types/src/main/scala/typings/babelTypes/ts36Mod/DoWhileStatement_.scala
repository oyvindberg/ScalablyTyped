package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.DoWhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoWhileStatement_
  extends Node
     with BlockParent
     with Loop
     with Scopable
     with Statement
     with While {
  
  var body: Statement = js.native
  
  var test: Expression = js.native
  
  @JSName("type")
  var type_DoWhileStatement_ : DoWhileStatement = js.native
}
object DoWhileStatement_ {
  
  @scala.inline
  def apply(
    body: Statement,
    end: Double,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: DoWhileStatement
  ): DoWhileStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoWhileStatement_]
  }
  
  @scala.inline
  implicit class DoWhileStatement_MutableBuilder[Self <: DoWhileStatement_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DoWhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
