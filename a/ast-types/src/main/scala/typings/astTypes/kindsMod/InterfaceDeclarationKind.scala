package typings.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration
  - typings.astTypes.namedTypesMod.namedTypes.DeclareInterface
  - typings.astTypes.namedTypesMod.namedTypes.DeclareClass
*/
trait InterfaceDeclarationKind extends StObject
object InterfaceDeclarationKind {
  
  @scala.inline
  def DeclareClass(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.DeclareClass
  ): typings.astTypes.namedTypesMod.namedTypes.DeclareClass = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareClass]
  }
  
  @scala.inline
  def DeclareInterface(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.DeclareInterface
  ): typings.astTypes.namedTypesMod.namedTypes.DeclareInterface = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.DeclareInterface]
  }
  
  @scala.inline
  def InterfaceDeclaration(
    body: ObjectTypeAnnotationKind,
    `extends`: js.Array[InterfaceExtendsKind],
    id: IdentifierKind,
    `type`: typings.astTypes.astTypesStrings.InterfaceDeclaration
  ): typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.astTypes.namedTypesMod.namedTypes.InterfaceDeclaration]
  }
}
