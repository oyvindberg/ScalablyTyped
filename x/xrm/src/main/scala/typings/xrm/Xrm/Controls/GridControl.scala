package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.Events.ContextSensitiveHandler
import typings.xrm.XrmEnum.GridControlContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a CRM grid control.
  *
  * @see {@link Control}
  */
@js.native
trait GridControl extends Control {
  
  /**
    * Use this method to add event handlers to the GridControl's OnLoad event.
    *
    * @param handler The event handler.
    */
  def addOnLoad(handler: ContextSensitiveHandler): Unit = js.native
  
  /**
    * This method returns context information about the GridControl.
    *
    * @returns The context type.
    */
  def getContextType(): GridControlContext = js.native
  
  /**
    * Use this method to get the logical name of the entity data displayed in the grid.
    *
    * @returns The entity name.
    */
  def getEntityName(): String = js.native
  
  /**
    * Use this method to get access to the Grid available in the GridControl.
    * @returns The grid.
    */
  def getGrid(): Grid = js.native
  
  /**
    * Use this method to get access to the ViewSelector available for the GridControl when it is configured to display views.
    * @returns The view selector.
    */
  def getViewSelector(): ViewSelector = js.native
  
  /**
    * Refreshes the sub grid.
    * @remarks Not available during the "on load" event of the form.
    */
  def refresh(): Unit = js.native
  
  /**
    * Refreshes the sub grid ribbon.
    * @see {@link https://docs.microsoft.com/it-it/powerapps/developer/model-driven-apps/clientapi/reference/grids/gridcontrol/refreshribbon External Link: refreshRibbon (Client API reference)}
    */
  def refreshRibbon(): Unit = js.native
  
  /**
    * Use this method to remove event handlers from the GridControl's OnLoad event.
    * @param handler The handler.
    */
  def removeOnLoad(handler: js.Function0[Unit]): Unit = js.native
}
object GridControl {
  
  @scala.inline
  def apply(
    addOnLoad: ContextSensitiveHandler => Unit,
    getContextType: () => GridControlContext,
    getControlType: () => ControlType | String,
    getEntityName: () => String,
    getGrid: () => Grid,
    getLabel: () => String,
    getName: () => String,
    getParent: () => Section,
    getViewSelector: () => ViewSelector,
    getVisible: () => Boolean,
    refresh: () => Unit,
    refreshRibbon: () => Unit,
    removeOnLoad: js.Function0[Unit] => Unit,
    setLabel: String => Unit
  ): GridControl = {
    val __obj = js.Dynamic.literal(addOnLoad = js.Any.fromFunction1(addOnLoad), getContextType = js.Any.fromFunction0(getContextType), getControlType = js.Any.fromFunction0(getControlType), getEntityName = js.Any.fromFunction0(getEntityName), getGrid = js.Any.fromFunction0(getGrid), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getViewSelector = js.Any.fromFunction0(getViewSelector), getVisible = js.Any.fromFunction0(getVisible), refresh = js.Any.fromFunction0(refresh), refreshRibbon = js.Any.fromFunction0(refreshRibbon), removeOnLoad = js.Any.fromFunction1(removeOnLoad), setLabel = js.Any.fromFunction1(setLabel))
    __obj.asInstanceOf[GridControl]
  }
  
  @scala.inline
  implicit class GridControlMutableBuilder[Self <: GridControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOnLoad(value: ContextSensitiveHandler => Unit): Self = StObject.set(x, "addOnLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContextType(value: () => GridControlContext): Self = StObject.set(x, "getContextType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEntityName(value: () => String): Self = StObject.set(x, "getEntityName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGrid(value: () => Grid): Self = StObject.set(x, "getGrid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetViewSelector(value: () => ViewSelector): Self = StObject.set(x, "getViewSelector", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefreshRibbon(value: () => Unit): Self = StObject.set(x, "refreshRibbon", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveOnLoad(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "removeOnLoad", js.Any.fromFunction1(value))
  }
}
