package typings.esquery.mod

import typings.esquery.esqueryStrings.Asterisk
import typings.esquery.esqueryStrings.`class`
import typings.esquery.esqueryStrings.`nth-child`
import typings.esquery.esqueryStrings.`nth-last-child`
import typings.esquery.esqueryStrings.`type`
import typings.esquery.esqueryStrings.adjacent
import typings.esquery.esqueryStrings.attribute
import typings.esquery.esqueryStrings.child
import typings.esquery.esqueryStrings.compound
import typings.esquery.esqueryStrings.declaration
import typings.esquery.esqueryStrings.descendant
import typings.esquery.esqueryStrings.expression
import typings.esquery.esqueryStrings.field
import typings.esquery.esqueryStrings.function
import typings.esquery.esqueryStrings.has
import typings.esquery.esqueryStrings.identifier
import typings.esquery.esqueryStrings.not
import typings.esquery.esqueryStrings.pattern
import typings.esquery.esqueryStrings.sibling
import typings.esquery.esqueryStrings.statement
import typings.esquery.esqueryStrings.wildcard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Unions
//
/* Rewritten from type alias, can be one of: 
  - typings.esquery.mod.Field
  - typings.esquery.mod.Type
  - typings.esquery.mod.Sequence
  - typings.esquery.mod.Identifier
  - typings.esquery.mod.Wildcard
  - typings.esquery.mod.Attribute
  - typings.esquery.mod.NthChild
  - typings.esquery.mod.NthLastChild
  - typings.esquery.mod.Descendant
  - typings.esquery.mod.Child
  - typings.esquery.mod.Sibling
  - typings.esquery.mod.Adjacent
  - typings.esquery.mod.Negation
  - typings.esquery.mod.Matches_
  - typings.esquery.mod.Has
  - typings.esquery.mod.Class
*/
trait Selector extends StObject
object Selector {
  
  @scala.inline
  def Adjacent(left: SubjectSelector, right: SubjectSelector, `type`: adjacent): typings.esquery.mod.Adjacent = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Adjacent]
  }
  
  @scala.inline
  def Attribute(name: String, `type`: attribute): typings.esquery.mod.Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Attribute]
  }
  
  @scala.inline
  def Child(left: SubjectSelector, right: SubjectSelector, `type`: child): typings.esquery.mod.Child = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Child]
  }
  
  @scala.inline
  def Class(name: declaration | expression | function | pattern | statement, `type`: `class`): typings.esquery.mod.Class = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Class]
  }
  
  @scala.inline
  def Descendant(left: SubjectSelector, right: SubjectSelector, `type`: descendant): typings.esquery.mod.Descendant = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Descendant]
  }
  
  @scala.inline
  def Field(name: String, `type`: field): typings.esquery.mod.Field = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Field]
  }
  
  @scala.inline
  def Has(selectors: js.Array[SubjectSelector], `type`: has): typings.esquery.mod.Has = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Has]
  }
  
  @scala.inline
  def Identifier(`type`: identifier, value: String): typings.esquery.mod.Identifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Identifier]
  }
  
  @scala.inline
  def Matches_(selectors: js.Array[SubjectSelector], `type`: typings.esquery.esqueryStrings.matches): typings.esquery.mod.Matches_ = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Matches_]
  }
  
  @scala.inline
  def Negation(selectors: js.Array[SubjectSelector], `type`: not): typings.esquery.mod.Negation = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Negation]
  }
  
  @scala.inline
  def NthChild(index: NumericLiteral, `type`: `nth-child`): typings.esquery.mod.NthChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.NthChild]
  }
  
  @scala.inline
  def NthLastChild(index: NumericLiteral, `type`: `nth-last-child`): typings.esquery.mod.NthLastChild = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.NthLastChild]
  }
  
  @scala.inline
  def Sequence(selectors: js.Array[SubjectSelector], `type`: compound): typings.esquery.mod.Sequence = {
    val __obj = js.Dynamic.literal(selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Sequence]
  }
  
  @scala.inline
  def Sibling(left: SubjectSelector, right: SubjectSelector, `type`: sibling): typings.esquery.mod.Sibling = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Sibling]
  }
  
  @scala.inline
  def Type(`type`: `type`, value: String): typings.esquery.mod.Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Type]
  }
  
  @scala.inline
  def Wildcard(`type`: wildcard, value: Asterisk): typings.esquery.mod.Wildcard = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.esquery.mod.Wildcard]
  }
}
