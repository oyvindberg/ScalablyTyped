package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.contextMenus.CreateCreateProperties
import typings.firefoxWebextBrowser.browser.contextMenus.OnClickData
import typings.firefoxWebextBrowser.browser.contextMenus.OnShownInfo
import typings.firefoxWebextBrowser.browser.contextMenus.OverrideContextContextOptions
import typings.firefoxWebextBrowser.browser.contextMenus.UpdateUpdateProperties
import typings.firefoxWebextBrowser.browser.tabs.Tab
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the browser.contextMenus API to add items to the browser's context menu. You can choose what types of objects your context menu additions apply to, such as images, hyperlinks, and pages.
  *
  * Permissions: `contextMenus`
  */
object contextMenus {
  
  /* contextMenus properties */
  /**
    * The maximum number of top level extension items that can be added to an extension action context menu. Any items beyond this limit will be ignored.
    */
  @JSGlobal("browser.contextMenus.ACTION_MENU_TOP_LEVEL_LIMIT")
  @js.native
  val ACTION_MENU_TOP_LEVEL_LIMIT: Double = js.native
  
  /* contextMenus functions */
  /**
    * Creates a new context menu item. Note that if an error occurs during creation, you may not find out until the creation callback fires (the details will be in `runtime.lastError`).
    * @param [callback] Called when the item has been created in the browser. If there were any problems creating the item, details will be available in `runtime.lastError`.
    * @returns The ID of the newly created item.
    */
  @JSGlobal("browser.contextMenus.create")
  @js.native
  def create(createProperties: CreateCreateProperties): Double | String = js.native
  @JSGlobal("browser.contextMenus.create")
  @js.native
  def create(createProperties: CreateCreateProperties, callback: js.Function0[Unit]): Double | String = js.native
  
  /**
    * Retrieve the element that was associated with a recent contextmenu event.
    * @param targetElementId The identifier of the clicked element, available as info.targetElementId in the menus.onShown, onClicked or onclick event.
    */
  @JSGlobal("browser.contextMenus.getTargetElement")
  @js.native
  def getTargetElement(targetElementId: Double): Element | Unit = js.native
  
  /* contextMenus events */
  /**
    * Fired when a context menu item is clicked.
    * @param info Information about the item clicked and the context where the click happened.
    * @param [tab] The details of the tab where the click took place. If the click did not take place in a tab, this parameter will be missing.
    */
  @JSGlobal("browser.contextMenus.onClicked")
  @js.native
  val onClicked: WebExtEvent[js.Function2[/* info */ OnClickData, /* tab */ js.UndefOr[Tab], Unit]] = js.native
  
  /** Fired when a menu is hidden. This event is only fired if onShown has fired before. */
  @JSGlobal("browser.contextMenus.onHidden")
  @js.native
  val onHidden: WebExtEvent[js.Function0[Unit]] = js.native
  
  /**
    * Fired when a menu is shown. The extension can add, modify or remove menu items and call menus.refresh() to update the menu.
    * @param info Information about the context of the menu action and the created menu items. For more information about each property, see OnClickData. The following properties are only set if the extension has host permissions for the given context: linkUrl, linkText, srcUrl, pageUrl, frameUrl, selectionText.
    * @param tab The details of the tab where the menu was opened.
    */
  @JSGlobal("browser.contextMenus.onShown")
  @js.native
  val onShown: WebExtEvent[js.Function2[/* info */ OnShownInfo, /* tab */ Tab, Unit]] = js.native
  
  /**
    * Show the matching menu items from this extension instead of the default menu. This should be called during a 'contextmenu' DOM event handler, and only applies to the menu that opens after this event.
    */
  @JSGlobal("browser.contextMenus.overrideContext")
  @js.native
  def overrideContext(contextOptions: OverrideContextContextOptions): Unit = js.native
  
  /**
    * Updates the extension items in the shown menu, including changes that have been made since the menu was shown. Has no effect if the menu is hidden. Rebuilding a shown menu is an expensive operation, only invoke this method when necessary.
    */
  @JSGlobal("browser.contextMenus.refresh")
  @js.native
  def refresh(): js.Promise[_] = js.native
  
  @JSGlobal("browser.contextMenus.remove")
  @js.native
  def remove(menuItemId: String): js.Promise[Unit] = js.native
  /**
    * Removes a context menu item.
    * @param menuItemId The ID of the context menu item to remove.
    */
  @JSGlobal("browser.contextMenus.remove")
  @js.native
  def remove(menuItemId: Double): js.Promise[Unit] = js.native
  
  /** Removes all context menu items added by this extension. */
  @JSGlobal("browser.contextMenus.removeAll")
  @js.native
  def removeAll(): js.Promise[Unit] = js.native
  
  @JSGlobal("browser.contextMenus.update")
  @js.native
  def update(id: String, updateProperties: UpdateUpdateProperties): js.Promise[Unit] = js.native
  /**
    * Updates a previously created context menu item.
    * @param id The ID of the item to update.
    * @param updateProperties The properties to update. Accepts the same values as the create function.
    */
  @JSGlobal("browser.contextMenus.update")
  @js.native
  def update(id: Double, updateProperties: UpdateUpdateProperties): js.Promise[Unit] = js.native
}
