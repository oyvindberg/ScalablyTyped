package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of properties, key-value pairs that are either public or
  * private to an application.
  */
@js.native
trait SchemaPropertyList extends StObject {
  
  /**
    * The ETag of the list.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The list of properties.
    */
  var items: js.UndefOr[js.Array[SchemaProperty]] = js.native
  
  /**
    * This is always drive#propertyList.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The link back to this list.
    */
  var selfLink: js.UndefOr[String] = js.native
}
object SchemaPropertyList {
  
  @scala.inline
  def apply(): SchemaPropertyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyList]
  }
  
  @scala.inline
  implicit class SchemaPropertyListMutableBuilder[Self <: SchemaPropertyList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaProperty]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaProperty*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
