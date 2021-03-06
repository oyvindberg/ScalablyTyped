package typings.activexLibreoffice.com_.sun.star.table

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.util.SortDescriptor
import typings.activexLibreoffice.com_.sun.star.util.SortField
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains properties which describe sorting of rows or columns in a table.
  *
  * It extends the general {@link com.sun.star.util.SortDescriptor} with table-specific properties.
  * @deprecated Deprecated
  */
@js.native
trait TableSortDescriptor extends SortDescriptor {
  
  /** specifies whether the first row or column (depending on {@link com.sun.star.util.SortDescriptor.SortColumns} ) is a header which should not be sorted. */
  var ContainsHeader: Boolean = js.native
  
  /** contains the maximum number of sort fields the descriptor can hold. */
  var MaxFieldCount: Double = js.native
  
  /**
    * specifies the sorting orientation (sort rows or columns).
    *
    * Some implementations may not support sorting columns.
    * @deprecated Deprecateduse the property com::sun::star::util::SortDescriptor::SortColumns instead.
    */
  var Orientation: TableOrientation = js.native
  
  /** specifies the descriptions of the individual sort fields. */
  var SortFields: SafeArray[SortField] = js.native
}
object TableSortDescriptor {
  
  @scala.inline
  def apply(
    CollatorAlgorithm: String,
    CollatorLocale: Locale,
    ContainsHeader: Boolean,
    IsCaseSensitive: Boolean,
    MaxFieldCount: Double,
    Orientation: TableOrientation,
    PropertySetInfo: XPropertySetInfo,
    SortAscending: Boolean,
    SortColumns: Boolean,
    SortFields: SafeArray[SortField],
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): TableSortDescriptor = {
    val __obj = js.Dynamic.literal(CollatorAlgorithm = CollatorAlgorithm.asInstanceOf[js.Any], CollatorLocale = CollatorLocale.asInstanceOf[js.Any], ContainsHeader = ContainsHeader.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any], MaxFieldCount = MaxFieldCount.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any], SortColumns = SortColumns.asInstanceOf[js.Any], SortFields = SortFields.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[TableSortDescriptor]
  }
  
  @scala.inline
  implicit class TableSortDescriptorMutableBuilder[Self <: TableSortDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainsHeader(value: Boolean): Self = StObject.set(x, "ContainsHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFieldCount(value: Double): Self = StObject.set(x, "MaxFieldCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: TableOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFields(value: SafeArray[SortField]): Self = StObject.set(x, "SortFields", value.asInstanceOf[js.Any])
  }
}
