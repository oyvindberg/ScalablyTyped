package typings.activexLibreoffice.com_.sun.star.container

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is the base interface of all collection interfaces. */
@js.native
trait XElementAccess extends XInterface {
  
  /** @returns the type of the elements. `void` means that it is a multi-type container and you cannot determine the exact types with this interface. */
  val ElementType: `type` = js.native
  
  /** @returns the type of the elements. `void` means that it is a multi-type container and you cannot determine the exact types with this interface. */
  def getElementType(): `type` = js.native
  
  /** @returns `TRUE` if the object contain elements, otherwise `FALSE` . */
  def hasElements(): Boolean = js.native
}
object XElementAccess {
  
  @scala.inline
  def apply(
    ElementType: `type`,
    acquire: () => Unit,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XElementAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XElementAccess]
  }
  
  @scala.inline
  implicit class XElementAccessMutableBuilder[Self <: XElementAccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElementType(value: `type`): Self = StObject.set(x, "ElementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetElementType(value: () => `type`): Self = StObject.set(x, "getElementType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasElements(value: () => Boolean): Self = StObject.set(x, "hasElements", js.Any.fromFunction0(value))
  }
}
