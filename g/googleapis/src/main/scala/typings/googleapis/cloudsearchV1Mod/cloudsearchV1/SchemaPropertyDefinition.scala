package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The definition of a property within an object.
  */
@js.native
trait SchemaPropertyDefinition extends StObject {
  
  var booleanPropertyOptions: js.UndefOr[SchemaBooleanPropertyOptions] = js.native
  
  var datePropertyOptions: js.UndefOr[SchemaDatePropertyOptions] = js.native
  
  /**
    * Options that determine how the property is displayed in the Cloud Search
    * results page if it is specified to be displayed in the object&#39;s
    * display options .
    */
  var displayOptions: js.UndefOr[SchemaPropertyDisplayOptions] = js.native
  
  var doublePropertyOptions: js.UndefOr[SchemaDoublePropertyOptions] = js.native
  
  var enumPropertyOptions: js.UndefOr[SchemaEnumPropertyOptions] = js.native
  
  var htmlPropertyOptions: js.UndefOr[SchemaHtmlPropertyOptions] = js.native
  
  var integerPropertyOptions: js.UndefOr[SchemaIntegerPropertyOptions] = js.native
  
  /**
    * Indicates that the property can be used for generating facets. Cannot be
    * true for properties whose type is object. IsReturnable must be true to
    * set this option. Only supported for Boolean, Enum, and Text properties.
    */
  var isFacetable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates that multiple values are allowed for the property. For example,
    * a document only has one description but can have multiple comments.
    * Cannot be true for properties whose type is a boolean. If set to false,
    * properties that contain more than one value will cause the indexing
    * request for that item to be rejected.
    */
  var isRepeatable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates that the property identifies data that should be returned in
    * search results via the Query API. If set to *true*, indicates that Query
    * API users can use matching property fields in results. However, storing
    * fields requires more space allocation and uses more bandwidth for search
    * queries, which impacts performance over large datasets. Set to *true*
    * here only if the field is needed for search results. Cannot be true for
    * properties whose type is an object.
    */
  var isReturnable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates that the property can be used for sorting. Cannot be true for
    * properties that are repeatable. Cannot be true for properties whose type
    * is object or user identifier. IsReturnable must be true to set this
    * option. Only supported for Boolean, Date, Double, Integer, and Timestamp
    * properties.
    */
  var isSortable: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the property. Item indexing requests sent to the Indexing API
    * should set the property name equal to this value. For example, if name is
    * *subject_line*, then indexing requests for document items with subject
    * fields should set the name for that field equal to *subject_line*. Use
    * the name as the identifier for the object property. Once registered as a
    * property for an object, you cannot re-use this name for another property
    * within that object. The name must start with a letter and can only
    * contain letters (A-Z, a-z) or numbers (0-9). The maximum length is 256
    * characters.
    */
  var name: js.UndefOr[String] = js.native
  
  var objectPropertyOptions: js.UndefOr[SchemaObjectPropertyOptions] = js.native
  
  var textPropertyOptions: js.UndefOr[SchemaTextPropertyOptions] = js.native
  
  var timestampPropertyOptions: js.UndefOr[SchemaTimestampPropertyOptions] = js.native
}
object SchemaPropertyDefinition {
  
  @scala.inline
  def apply(): SchemaPropertyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyDefinition]
  }
  
  @scala.inline
  implicit class SchemaPropertyDefinitionMutableBuilder[Self <: SchemaPropertyDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBooleanPropertyOptions(value: SchemaBooleanPropertyOptions): Self = StObject.set(x, "booleanPropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBooleanPropertyOptionsUndefined: Self = StObject.set(x, "booleanPropertyOptions", js.undefined)
    
    @scala.inline
    def setDatePropertyOptions(value: SchemaDatePropertyOptions): Self = StObject.set(x, "datePropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatePropertyOptionsUndefined: Self = StObject.set(x, "datePropertyOptions", js.undefined)
    
    @scala.inline
    def setDisplayOptions(value: SchemaPropertyDisplayOptions): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
    
    @scala.inline
    def setDoublePropertyOptions(value: SchemaDoublePropertyOptions): Self = StObject.set(x, "doublePropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoublePropertyOptionsUndefined: Self = StObject.set(x, "doublePropertyOptions", js.undefined)
    
    @scala.inline
    def setEnumPropertyOptions(value: SchemaEnumPropertyOptions): Self = StObject.set(x, "enumPropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumPropertyOptionsUndefined: Self = StObject.set(x, "enumPropertyOptions", js.undefined)
    
    @scala.inline
    def setHtmlPropertyOptions(value: SchemaHtmlPropertyOptions): Self = StObject.set(x, "htmlPropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlPropertyOptionsUndefined: Self = StObject.set(x, "htmlPropertyOptions", js.undefined)
    
    @scala.inline
    def setIntegerPropertyOptions(value: SchemaIntegerPropertyOptions): Self = StObject.set(x, "integerPropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerPropertyOptionsUndefined: Self = StObject.set(x, "integerPropertyOptions", js.undefined)
    
    @scala.inline
    def setIsFacetable(value: Boolean): Self = StObject.set(x, "isFacetable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFacetableUndefined: Self = StObject.set(x, "isFacetable", js.undefined)
    
    @scala.inline
    def setIsRepeatable(value: Boolean): Self = StObject.set(x, "isRepeatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRepeatableUndefined: Self = StObject.set(x, "isRepeatable", js.undefined)
    
    @scala.inline
    def setIsReturnable(value: Boolean): Self = StObject.set(x, "isReturnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReturnableUndefined: Self = StObject.set(x, "isReturnable", js.undefined)
    
    @scala.inline
    def setIsSortable(value: Boolean): Self = StObject.set(x, "isSortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSortableUndefined: Self = StObject.set(x, "isSortable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setObjectPropertyOptions(value: SchemaObjectPropertyOptions): Self = StObject.set(x, "objectPropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectPropertyOptionsUndefined: Self = StObject.set(x, "objectPropertyOptions", js.undefined)
    
    @scala.inline
    def setTextPropertyOptions(value: SchemaTextPropertyOptions): Self = StObject.set(x, "textPropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextPropertyOptionsUndefined: Self = StObject.set(x, "textPropertyOptions", js.undefined)
    
    @scala.inline
    def setTimestampPropertyOptions(value: SchemaTimestampPropertyOptions): Self = StObject.set(x, "timestampPropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampPropertyOptionsUndefined: Self = StObject.set(x, "timestampPropertyOptions", js.undefined)
  }
}
