package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of Key Collector.
  *
  * This interface is used to manipulate key materials.
  */
@js.native
trait XKeyCollector extends XInterface {
  
  /**
    * Set the keeper id of the key element.
    * @param id the keeper id of the key element. If the id is 0, then it represents that this security entity has included its key material internally.
    */
  def setKeyId(id: Double): Unit = js.native
}
object XKeyCollector {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setKeyId: Double => Unit
  ): XKeyCollector = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setKeyId = js.Any.fromFunction1(setKeyId))
    __obj.asInstanceOf[XKeyCollector]
  }
  
  @scala.inline
  implicit class XKeyCollectorMutableBuilder[Self <: XKeyCollector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetKeyId(value: Double => Unit): Self = StObject.set(x, "setKeyId", js.Any.fromFunction1(value))
  }
}
