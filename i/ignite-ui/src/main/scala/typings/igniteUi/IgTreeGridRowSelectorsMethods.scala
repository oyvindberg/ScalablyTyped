package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgTreeGridRowSelectorsMethods extends StObject {
  
  /**
    * Changes the check state of a row by index to specified value
    *
    * @param index Row index
    * @param toCheck The new check state of the checkbox - true for checked or false for unchecked
    */
  def changeCheckState(index: Double, toCheck: Boolean): Unit = js.native
  
  /**
    * Change the check state of a row by row id
    *
    * @param rowId Row Id
    * @param toCheck The new check state of the checkbox - true for checked or false for unchecked
    */
  def changeCheckStateById(rowId: js.Object, toCheck: Boolean): Unit = js.native
  
  /**
    * Changes the all locales into the widget element to the language specified in [options.language](ui.igtreegridrowselectors#options:language)
    * Note that this method is for rare scenarios, see [language](ui.igtreegridrowselectors#options:language) or [locale](ui.igtreegridrowselectors#options:locale) option setter
    */
  def changeLocale(): Unit = js.native
  
  /**
    * Returns the check state of the row by id.
    *
    * @param rowId
    */
  def checkStateById(rowId: js.Object): String = js.native
  
  /**
    * Gets an array of all the checked rows. Every object from the array has the following format { element: , id: , index: }
    */
  def checkedRows(): js.Array[_] = js.native
  
  def destroy(): Unit = js.native
  
  /**
    * Gets an array of all the partially checked rows. Every object from the array has the following format { element: , id: , index: }
    */
  def partiallyCheckedRows(): js.Array[_] = js.native
  
  def rsRenderColgroup(): Unit = js.native
  
  /**
    * Toggles the check state of a row by index
    *
    * @param index Row index
    */
  def toggleCheckState(index: Double): Unit = js.native
  
  /**
    * Toggles the check state of a row by row id
    *
    * @param rowId Row Id
    */
  def toggleCheckStateById(rowId: js.Object): Unit = js.native
  
  /**
    * Gets an array of all the unchecked rows. Every object from the array has the following format { element: , id: , index: }
    */
  def uncheckedRows(): js.Array[_] = js.native
}
object IgTreeGridRowSelectorsMethods {
  
  @scala.inline
  def apply(
    changeCheckState: (Double, Boolean) => Unit,
    changeCheckStateById: (js.Object, Boolean) => Unit,
    changeLocale: () => Unit,
    checkStateById: js.Object => String,
    checkedRows: () => js.Array[_],
    destroy: () => Unit,
    partiallyCheckedRows: () => js.Array[_],
    rsRenderColgroup: () => Unit,
    toggleCheckState: Double => Unit,
    toggleCheckStateById: js.Object => Unit,
    uncheckedRows: () => js.Array[_]
  ): IgTreeGridRowSelectorsMethods = {
    val __obj = js.Dynamic.literal(changeCheckState = js.Any.fromFunction2(changeCheckState), changeCheckStateById = js.Any.fromFunction2(changeCheckStateById), changeLocale = js.Any.fromFunction0(changeLocale), checkStateById = js.Any.fromFunction1(checkStateById), checkedRows = js.Any.fromFunction0(checkedRows), destroy = js.Any.fromFunction0(destroy), partiallyCheckedRows = js.Any.fromFunction0(partiallyCheckedRows), rsRenderColgroup = js.Any.fromFunction0(rsRenderColgroup), toggleCheckState = js.Any.fromFunction1(toggleCheckState), toggleCheckStateById = js.Any.fromFunction1(toggleCheckStateById), uncheckedRows = js.Any.fromFunction0(uncheckedRows))
    __obj.asInstanceOf[IgTreeGridRowSelectorsMethods]
  }
  
  @scala.inline
  implicit class IgTreeGridRowSelectorsMethodsMutableBuilder[Self <: IgTreeGridRowSelectorsMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeCheckState(value: (Double, Boolean) => Unit): Self = StObject.set(x, "changeCheckState", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeCheckStateById(value: (js.Object, Boolean) => Unit): Self = StObject.set(x, "changeCheckStateById", js.Any.fromFunction2(value))
    
    @scala.inline
    def setChangeLocale(value: () => Unit): Self = StObject.set(x, "changeLocale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckStateById(value: js.Object => String): Self = StObject.set(x, "checkStateById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckedRows(value: () => js.Array[_]): Self = StObject.set(x, "checkedRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPartiallyCheckedRows(value: () => js.Array[_]): Self = StObject.set(x, "partiallyCheckedRows", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRsRenderColgroup(value: () => Unit): Self = StObject.set(x, "rsRenderColgroup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleCheckState(value: Double => Unit): Self = StObject.set(x, "toggleCheckState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggleCheckStateById(value: js.Object => Unit): Self = StObject.set(x, "toggleCheckStateById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUncheckedRows(value: () => js.Array[_]): Self = StObject.set(x, "uncheckedRows", js.Any.fromFunction0(value))
  }
}
