package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to register listeners which are called whenever a document event (see {@link EventObject} ) occurs
  * @deprecated Deprecated
  * @see XDocumentEventBroadcaster
  */
@js.native
trait XEventBroadcaster extends XInterface {
  
  /**
    * registers the given listener
    * @param Listener listener which is interested on such events
    */
  def addEventListener(Listener: XEventListener): Unit = js.native
  
  /**
    * unregisters the given listener
    * @param Listener listener which isn't interested on such events any longer
    */
  def removeEventListener(Listener: XEventListener): Unit = js.native
}
object XEventBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XEventBroadcaster]
  }
  
  @scala.inline
  implicit class XEventBroadcasterMutableBuilder[Self <: XEventBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEventListener(value: XEventListener => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveEventListener(value: XEventListener => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction1(value))
  }
}
