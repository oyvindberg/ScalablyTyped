package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a named sheet view of a worksheet. A sheet view stores the sort and filter rules for a particular worksheet.
  Every sheet view (even a temporary sheet view) has a unique, worksheet-scoped name that is used to access the view.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
@js.native
trait NamedSheetViewLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Gets or sets the name of the sheet view.
    The temporary sheet view name is the empty string ("").  Naming the view by using the name property causes the sheet view to be saved.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var name: js.UndefOr[Boolean] = js.native
}
object NamedSheetViewLoadOptions {
  
  @scala.inline
  def apply(): NamedSheetViewLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedSheetViewLoadOptions]
  }
  
  @scala.inline
  implicit class NamedSheetViewLoadOptionsMutableBuilder[Self <: NamedSheetViewLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
