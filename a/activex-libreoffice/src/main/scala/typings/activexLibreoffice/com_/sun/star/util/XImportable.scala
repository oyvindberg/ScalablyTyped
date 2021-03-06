package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to import files into the object. */
@js.native
trait XImportable extends XInterface {
  
  /** @returns a descriptor which contains the arguments for an import. */
  def createImportDescriptor(bEmpty: Boolean): SafeArray[PropertyValue] = js.native
  
  /** imports data from an external database. */
  def doImport(aDescriptor: SeqEquiv[PropertyValue]): Unit = js.native
}
object XImportable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createImportDescriptor: Boolean => SafeArray[PropertyValue],
    doImport: SeqEquiv[PropertyValue] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XImportable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createImportDescriptor = js.Any.fromFunction1(createImportDescriptor), doImport = js.Any.fromFunction1(doImport), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XImportable]
  }
  
  @scala.inline
  implicit class XImportableMutableBuilder[Self <: XImportable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateImportDescriptor(value: Boolean => SafeArray[PropertyValue]): Self = StObject.set(x, "createImportDescriptor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoImport(value: SeqEquiv[PropertyValue] => Unit): Self = StObject.set(x, "doImport", js.Any.fromFunction1(value))
  }
}
