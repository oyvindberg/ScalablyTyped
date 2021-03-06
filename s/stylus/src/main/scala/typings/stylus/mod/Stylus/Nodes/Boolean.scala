package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Boolean extends Node {
  
  /**
    * Return 'Boolean'.
    */
  def inspect(): java.lang.String = js.native
  
  var isFalse: scala.Boolean = js.native
  
  var isTrue: scala.Boolean = js.native
  
  /**
    * Negate the value.
    */
  // tslint:disable-next-line no-unnecessary-qualifier
  def negate(): Boolean = js.native
  
  var `val`: scala.Boolean = js.native
}
object Boolean {
  
  @scala.inline
  def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    inspect: () => java.lang.String,
    isFalse: scala.Boolean,
    isTrue: scala.Boolean,
    lineno: Double,
    negate: () => Boolean,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column,
    `val`: scala.Boolean
  ): Boolean = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), isFalse = isFalse.asInstanceOf[js.Any], isTrue = isTrue.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], negate = js.Any.fromFunction0(negate), nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
  
  @scala.inline
  implicit class BooleanMutableBuilder[Self <: Boolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInspect(value: () => java.lang.String): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsFalse(value: scala.Boolean): Self = StObject.set(x, "isFalse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTrue(value: scala.Boolean): Self = StObject.set(x, "isTrue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegate(value: () => Boolean): Self = StObject.set(x, "negate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVal(value: scala.Boolean): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
