package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.Actions
import typings.contentfulManagement.anon.ContentDelivery
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.contentfulManagementStrings.delete_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object roleMod {
  
  @JSImport("contentful-management/dist/typings/entities/role", "wrapRole")
  @js.native
  def wrapRole(http: AxiosInstance, data: RoleProps): Role = js.native
  
  @JSImport("contentful-management/dist/typings/entities/role", "wrapRoleCollection")
  @js.native
  def wrapRoleCollection(http: AxiosInstance, data: CollectionProp[RoleProps]): Collection[Role, RoleProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentfulManagement.contentfulManagementStrings.read
    - typings.contentfulManagement.contentfulManagementStrings.create
    - typings.contentfulManagement.contentfulManagementStrings.update
    - typings.contentfulManagement.contentfulManagementStrings.delete_
    - typings.contentfulManagement.contentfulManagementStrings.publish
    - typings.contentfulManagement.contentfulManagementStrings.unpublish
    - typings.contentfulManagement.contentfulManagementStrings.archive
    - typings.contentfulManagement.contentfulManagementStrings.unarchive
  */
  trait ActionType extends StObject
  object ActionType {
    
    @scala.inline
    def archive: typings.contentfulManagement.contentfulManagementStrings.archive = "archive".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.archive]
    
    @scala.inline
    def create: typings.contentfulManagement.contentfulManagementStrings.create = "create".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.create]
    
    @scala.inline
    def delete: delete_ = "delete".asInstanceOf[delete_]
    
    @scala.inline
    def publish: typings.contentfulManagement.contentfulManagementStrings.publish = "publish".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.publish]
    
    @scala.inline
    def read: typings.contentfulManagement.contentfulManagementStrings.read = "read".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.read]
    
    @scala.inline
    def unarchive: typings.contentfulManagement.contentfulManagementStrings.unarchive = "unarchive".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.unarchive]
    
    @scala.inline
    def unpublish: typings.contentfulManagement.contentfulManagementStrings.unpublish = "unpublish".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.unpublish]
    
    @scala.inline
    def update: typings.contentfulManagement.contentfulManagementStrings.update = "update".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.update]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.contentfulManagement.contentfulManagementStrings.and
    - typings.contentfulManagement.contentfulManagementStrings.or
    - typings.contentfulManagement.contentfulManagementStrings.not
    - typings.contentfulManagement.contentfulManagementStrings.equals
  */
  trait ConditionType extends StObject
  object ConditionType {
    
    @scala.inline
    def and: typings.contentfulManagement.contentfulManagementStrings.and = "and".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.and]
    
    @scala.inline
    def equals: typings.contentfulManagement.contentfulManagementStrings.equals = "equals".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.equals]
    
    @scala.inline
    def not: typings.contentfulManagement.contentfulManagementStrings.not = "not".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.not]
    
    @scala.inline
    def or: typings.contentfulManagement.contentfulManagementStrings.or = "or".asInstanceOf[typings.contentfulManagement.contentfulManagementStrings.or]
  }
  
  /* Inlined {[ key in contentful-management.contentful-management/dist/typings/entities/role.ConditionType ]: std.Array<contentful-management.contentful-management/dist/typings/entities/role.ConstraintType> | any} */
  @js.native
  trait ConstraintType extends StObject {
    
    var and: js.Array[ConstraintType] | js.Any = js.native
    
    @JSName("equals")
    var equals_FConstraintType: js.Array[ConstraintType] | js.Any = js.native
    
    var not: js.Array[ConstraintType] | js.Any = js.native
    
    var or: js.Array[ConstraintType] | js.Any = js.native
  }
  object ConstraintType {
    
    @scala.inline
    def apply(
      and: js.Array[ConstraintType] | js.Any,
      equals_ : js.Array[ConstraintType] | js.Any,
      not: js.Array[ConstraintType] | js.Any,
      or: js.Array[ConstraintType] | js.Any
    ): ConstraintType = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstraintType]
    }
    
    @scala.inline
    implicit class ConstraintTypeMutableBuilder[Self <: ConstraintType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnd(value: js.Array[ConstraintType] | js.Any): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAndVarargs(value: ConstraintType*): Self = StObject.set(x, "and", js.Array(value :_*))
      
      @scala.inline
      def setEquals_(value: js.Array[ConstraintType] | js.Any): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEquals_Varargs(value: ConstraintType*): Self = StObject.set(x, "equals", js.Array(value :_*))
      
      @scala.inline
      def setNot(value: js.Array[ConstraintType] | js.Any): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotVarargs(value: ConstraintType*): Self = StObject.set(x, "not", js.Array(value :_*))
      
      @scala.inline
      def setOr(value: js.Array[ConstraintType] | js.Any): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrVarargs(value: ConstraintType*): Self = StObject.set(x, "or", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Role
    extends RoleProps
       with DefaultElements[RoleProps] {
    
    /**
      * Deletes this object on the server.
      * @memberof Role
      * @func delete
      * @return {Promise} Promise for the deletion. It contains no data, but the Promise error case should be handled.
      * @example ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      *
      * client.getSpace('<space_id>')
      * .then((space) => space.getRole('<role_id>'))
      * .then((role) => role.delete())
      * .then((role) => console.log(`role deleted.`))
      * .catch(console.error)
      * ```
      */
    def delete(): js.Promise[Unit] = js.native
    
    /**
      * Sends an update to the server with any changes made to the object's properties
      * @return Object returned from the server with updated changes.
      * @example ```javascript
      * const contentful = require('contentful-management')
      *
      * const client = contentful.createClient({
      *   accessToken: '<content_management_api_key>'
      * })
      *
      * client.getSpace('<space_id>')
      * .then((space) => space.getRole('<roles_id>'))
      * .then((roles) => {
      *   roles.name = 'New role name'
      *   return roles.update()
      * })
      * .then((roles) => console.log(`roles ${roles.sys.id} updated.`))
      * .catch(console.error)
      * ```
      */
    def update(): js.Promise[Role] = js.native
  }
  object Role {
    
    @scala.inline
    def apply(
      delete: () => js.Promise[Unit],
      name: String,
      permissions: ContentDelivery,
      policies: js.Array[Actions],
      sys: MetaSysProps,
      toPlainObject: () => RoleProps,
      update: () => js.Promise[Role]
    ): Role = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), name = name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], policies = policies.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], toPlainObject = js.Any.fromFunction0(toPlainObject), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Role]
    }
    
    @scala.inline
    implicit class RoleMutableBuilder[Self <: Role] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUpdate(value: () => js.Promise[Role]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait RoleProps extends StObject {
    
    var name: String = js.native
    
    /**
      * Permissions for application sections
      */
    var permissions: ContentDelivery = js.native
    
    var policies: js.Array[Actions] = js.native
    
    var sys: MetaSysProps = js.native
  }
  object RoleProps {
    
    @scala.inline
    def apply(name: String, permissions: ContentDelivery, policies: js.Array[Actions], sys: MetaSysProps): RoleProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], policies = policies.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoleProps]
    }
    
    @scala.inline
    implicit class RolePropsMutableBuilder[Self <: RoleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPermissions(value: ContentDelivery): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicies(value: js.Array[Actions]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoliciesVarargs(value: Actions*): Self = StObject.set(x, "policies", js.Array(value :_*))
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
