package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSConstructSignatureDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSConstructSignatureDeclaration_
  extends TSTypeElement
     with BaseNode {
  
  var parameters: js.Array[Identifier_ | RestElement_] = js.native
  
  var typeAnnotation: TSTypeAnnotation_ | Null = js.native
  
  var typeParameters: TSTypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_TSConstructSignatureDeclaration_ : TSConstructSignatureDeclaration = js.native
}
object TSConstructSignatureDeclaration_ {
  
  @scala.inline
  def apply(parameters: js.Array[Identifier_ | RestElement_], `type`: TSConstructSignatureDeclaration): TSConstructSignatureDeclaration_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSConstructSignatureDeclaration_]
  }
  
  @scala.inline
  implicit class TSConstructSignatureDeclaration_MutableBuilder[Self <: TSConstructSignatureDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TSConstructSignatureDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
