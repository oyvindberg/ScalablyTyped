package typings.cswAasJs

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realmRoleMod {
  
  @JSImport("csw-aas-js/dist/components/authorization/RealmRole", JSImport.Default)
  @js.native
  def default(hasRealmRoleChildrenError: RealmRoleProps): Element = js.native
  
  @js.native
  trait RealmRoleProps extends StObject {
    
    var children: ReactNode = js.native
    
    var error: ReactNode = js.native
    
    var realmRole: String = js.native
  }
  object RealmRoleProps {
    
    @scala.inline
    def apply(realmRole: String): RealmRoleProps = {
      val __obj = js.Dynamic.literal(realmRole = realmRole.asInstanceOf[js.Any])
      __obj.asInstanceOf[RealmRoleProps]
    }
    
    @scala.inline
    implicit class RealmRolePropsMutableBuilder[Self <: RealmRoleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setError(value: ReactNode): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setRealmRole(value: String): Self = StObject.set(x, "realmRole", value.asInstanceOf[js.Any])
    }
  }
}
