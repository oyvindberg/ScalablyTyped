package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inserts a table at the specified location.  A newline character will be
  * inserted before the inserted table.
  */
@js.native
trait SchemaInsertTableRequest extends StObject {
  
  /**
    * The number of columns in the table.
    */
  var columns: js.UndefOr[Double] = js.native
  
  /**
    * Inserts the table at the end of the given header, footer or document
    * body. A newline character will be inserted before the inserted table.
    * Tables cannot be inserted inside a footnote.
    */
  var endOfSegmentLocation: js.UndefOr[SchemaEndOfSegmentLocation] = js.native
  
  /**
    * Inserts the table at a specific model index.  A newline character will be
    * inserted before the inserted table, therefore the table start index will
    * be at the specified location index + 1.  The table must be inserted
    * inside the bounds of an existing Paragraph. For instance, it cannot be
    * inserted at a table&#39;s start index (i.e. between an existing table and
    * its preceding paragraph).  Tables cannot be inserted inside a footnote or
    * equation.
    */
  var location: js.UndefOr[SchemaLocation] = js.native
  
  /**
    * The number of rows in the table.
    */
  var rows: js.UndefOr[Double] = js.native
}
object SchemaInsertTableRequest {
  
  @scala.inline
  def apply(): SchemaInsertTableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInsertTableRequest]
  }
  
  @scala.inline
  implicit class SchemaInsertTableRequestMutableBuilder[Self <: SchemaInsertTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setEndOfSegmentLocation(value: SchemaEndOfSegmentLocation): Self = StObject.set(x, "endOfSegmentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOfSegmentLocationUndefined: Self = StObject.set(x, "endOfSegmentLocation", js.undefined)
    
    @scala.inline
    def setLocation(value: SchemaLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
