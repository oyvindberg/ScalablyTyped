package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactQuerySearchFields extends StObject
/** Defines which contact fields to search for a text match. */
@JSGlobal("Windows.ApplicationModel.Contacts.ContactQuerySearchFields")
@js.native
object ContactQuerySearchFields extends StObject {
  
  /** All */
  @js.native
  sealed trait all extends ContactQuerySearchFields
  
  /** Email address */
  @js.native
  sealed trait email extends ContactQuerySearchFields
  
  /** Name */
  @js.native
  sealed trait name extends ContactQuerySearchFields
  
  /** None */
  @js.native
  sealed trait none extends ContactQuerySearchFields
  
  /** Phone number */
  @js.native
  sealed trait phone extends ContactQuerySearchFields
}
