package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSParenthesizedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSParenthesizedType_
  extends TSType
     with BaseNode {
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSParenthesizedType_ : TSParenthesizedType = js.native
}
object TSParenthesizedType_ {
  
  @scala.inline
  def apply(`type`: TSParenthesizedType, typeAnnotation: TSType): TSParenthesizedType_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSParenthesizedType_]
  }
  
  @scala.inline
  implicit class TSParenthesizedType_MutableBuilder[Self <: TSParenthesizedType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TSParenthesizedType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
