package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.failed_
import typings.microsoftGraph.microsoftGraphStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.pending
  - typings.microsoftGraph.microsoftGraphStrings.canceled
  - typings.microsoftGraph.microsoftGraphStrings.active
  - typings.microsoftGraph.microsoftGraphStrings.done
  - typings.microsoftGraph.microsoftGraphStrings.failed_
  - typings.microsoftGraph.microsoftGraphStrings.notSupported
*/
trait ActionState extends StObject
object ActionState {
  
  @scala.inline
  def active: typings.microsoftGraph.microsoftGraphStrings.active = "active".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.active]
  
  @scala.inline
  def canceled: typings.microsoftGraph.microsoftGraphStrings.canceled = "canceled".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.canceled]
  
  @scala.inline
  def done: typings.microsoftGraph.microsoftGraphStrings.done = "done".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.done]
  
  @scala.inline
  def failed: failed_ = "failed".asInstanceOf[failed_]
  
  @scala.inline
  def none: none_ = "none".asInstanceOf[none_]
  
  @scala.inline
  def notSupported: typings.microsoftGraph.microsoftGraphStrings.notSupported = "notSupported".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.notSupported]
  
  @scala.inline
  def pending: typings.microsoftGraph.microsoftGraphStrings.pending = "pending".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.pending]
}
