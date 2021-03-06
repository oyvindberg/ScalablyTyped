package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a line.
  */
@js.native
trait SchemaCreateLineRequest extends StObject {
  
  /**
    * The category of the line to be created.  The exact line type created is
    * determined based on the category and how it&#39;s routed to connect to
    * other page elements.  If you specify both a `category` and a
    * `line_category`, the `category` takes precedence.  If you do not specify
    * a value for `category`, but specify a value for `line_category`, then the
    * specified `line_category` value is used.  If you do not specify either,
    * then STRAIGHT is used.
    */
  var category: js.UndefOr[String] = js.native
  
  /**
    * The element properties for the line.
    */
  var elementProperties: js.UndefOr[SchemaPageElementProperties] = js.native
  
  /**
    * The category of the line to be created.  &lt;b&gt;Deprecated&lt;/b&gt;:
    * use `category` instead.  The exact line type created is determined based
    * on the category and how it&#39;s routed to connect to other page
    * elements.  If you specify both a `category` and a `line_category`, the
    * `category` takes precedence.
    */
  var lineCategory: js.UndefOr[String] = js.native
  
  /**
    * A user-supplied object ID.  If you specify an ID, it must be unique among
    * all pages and page elements in the presentation. The ID must start with
    * an alphanumeric character or an underscore (matches regex
    * `[a-zA-Z0-9_]`); remaining characters may include those as well as a
    * hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The length of the ID
    * must not be less than 5 or greater than 50.  If you don&#39;t specify an
    * ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.native
}
object SchemaCreateLineRequest {
  
  @scala.inline
  def apply(): SchemaCreateLineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateLineRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateLineRequestMutableBuilder[Self <: SchemaCreateLineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    @scala.inline
    def setElementProperties(value: SchemaPageElementProperties): Self = StObject.set(x, "elementProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementPropertiesUndefined: Self = StObject.set(x, "elementProperties", js.undefined)
    
    @scala.inline
    def setLineCategory(value: String): Self = StObject.set(x, "lineCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCategoryUndefined: Self = StObject.set(x, "lineCategory", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
