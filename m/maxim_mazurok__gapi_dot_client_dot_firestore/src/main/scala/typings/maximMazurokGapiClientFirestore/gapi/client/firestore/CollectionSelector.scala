package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionSelector extends StObject {
  
  /** When false, selects only collections that are immediate children of the `parent` specified in the containing `RunQueryRequest`. When true, selects all descendant collections. */
  var allDescendants: js.UndefOr[Boolean] = js.native
  
  /** The collection ID. When set, selects only collections with this ID. */
  var collectionId: js.UndefOr[String] = js.native
}
object CollectionSelector {
  
  @scala.inline
  def apply(): CollectionSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionSelector]
  }
  
  @scala.inline
  implicit class CollectionSelectorMutableBuilder[Self <: CollectionSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllDescendants(value: Boolean): Self = StObject.set(x, "allDescendants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllDescendantsUndefined: Self = StObject.set(x, "allDescendants", js.undefined)
    
    @scala.inline
    def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionIdUndefined: Self = StObject.set(x, "collectionId", js.undefined)
  }
}
