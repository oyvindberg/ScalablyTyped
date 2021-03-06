package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specification determining how headers are added to requests or responses.
  */
@js.native
trait SchemaHttpHeaderOption extends StObject {
  
  /**
    * The name of the header.
    */
  var headerName: js.UndefOr[String] = js.native
  
  /**
    * The value of the header to add.
    */
  var headerValue: js.UndefOr[String] = js.native
  
  /**
    * If false, headerValue is appended to any values that already exist for
    * the header. If true, headerValue is set for the header, discarding any
    * values that were set for that header. The default value is false.
    */
  var replace: js.UndefOr[Boolean] = js.native
}
object SchemaHttpHeaderOption {
  
  @scala.inline
  def apply(): SchemaHttpHeaderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpHeaderOption]
  }
  
  @scala.inline
  implicit class SchemaHttpHeaderOptionMutableBuilder[Self <: SchemaHttpHeaderOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
    
    @scala.inline
    def setHeaderValue(value: String): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderValueUndefined: Self = StObject.set(x, "headerValue", js.undefined)
    
    @scala.inline
    def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
  }
}
