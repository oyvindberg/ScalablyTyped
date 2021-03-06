package typings.dav

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typings.dav.davStrings.Partial with org.scalablytyped.runtime.TopLevel[T]
  
  @scala.inline
  def createAccount(options: typings.dav.mod.CreateAccountOptions): js.Promise[typings.dav.mod.Account] = typings.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createAccount")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.dav.mod.Account]]
  
  @scala.inline
  def createCalendarObject(calendar: typings.dav.mod.Calendar, options: typings.dav.mod.CreateCalendarObjectOptions): js.Promise[typings.dav.mod.CalendarObject] = (typings.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCalendarObject")(calendar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.dav.mod.CalendarObject]]
  
  @scala.inline
  def createCard(addressBook: typings.dav.mod.AddressBook, options: typings.dav.mod.CreateCardOptions): js.Promise[typings.dav.mod.AddressBook] = (typings.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createCard")(addressBook.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.dav.mod.AddressBook]]
  
  @scala.inline
  def createSandbox(): typings.dav.mod.Sandbox = typings.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSandbox")().asInstanceOf[typings.dav.mod.Sandbox]
  
  @scala.inline
  def deleteCalendarObject(
    calendarObject: typings.dav.mod.CalendarObject,
    options: typings.dav.mod.DeleteCalendarObjectOptions
  ): js.Promise[typings.dav.mod.CalendarObject] = (typings.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteCalendarObject")(calendarObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.dav.mod.CalendarObject]]
  
  @scala.inline
  def deleteCard(card: typings.dav.mod.VCard, options: typings.dav.mod.DeleteCardOptions): js.Promise[typings.dav.mod.VCard] = (typings.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("deleteCard")(card.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.dav.mod.VCard]]
  
  @scala.inline
  def syncAddressBook(addressBook: typings.dav.mod.AddressBook, options: typings.dav.mod.SyncAddressBookOptions): js.Promise[typings.dav.mod.AddressBook] = (typings.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("syncAddressBook")(addressBook.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.dav.mod.AddressBook]]
  
  @scala.inline
  def syncCaldavAccount(account: typings.dav.mod.Account, options: typings.dav.mod.SyncCaldavAccountOptions): js.Promise[typings.dav.mod.Account] = (typings.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("syncCaldavAccount")(account.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.dav.mod.Account]]
  
  @scala.inline
  def syncCalendar(calendar: typings.dav.mod.Calendar, options: typings.dav.mod.SyncCalendarOptions): js.Promise[typings.dav.mod.Calendar] = (typings.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("syncCalendar")(calendar.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.dav.mod.Calendar]]
  
  @scala.inline
  def syncCarddavAccount(account: typings.dav.mod.Account, options: typings.dav.mod.SyncCarddavAccountOptions): js.Promise[typings.dav.mod.Account] = (typings.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("syncCarddavAccount")(account.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.dav.mod.Account]]
  
  @scala.inline
  def updateCalendarObject(
    calendarObject: typings.dav.mod.CalendarObject,
    options: typings.dav.mod.UpdateCalendarObjectOptions
  ): js.Promise[typings.dav.mod.CalendarObject] = (typings.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateCalendarObject")(calendarObject.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.dav.mod.CalendarObject]]
  
  @scala.inline
  def updateCard(card: typings.dav.mod.VCard, options: typings.dav.mod.UpdateCardOptions): js.Promise[typings.dav.mod.VCard] = (typings.dav.mod.^.asInstanceOf[js.Dynamic].applyDynamic("updateCard")(card.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.dav.mod.VCard]]
  
  @scala.inline
  def version: java.lang.String = typings.dav.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
  @scala.inline
  def version_=(x: java.lang.String): scala.Unit = typings.dav.mod.^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
}
