package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to write strings to a stream using a special character encoding.
  *
  * This interfaces allows to write strings to a stream. The character encoding to be used can be set by {@link setEncoding()} . Default encoding is
  * "utf8".
  */
@js.native
trait XTextOutputStream extends XOutputStream {
  
  /**
    * sets character encoding.
    * @param Encoding sets the character encoding that should be used. The character encoding names refer to the document [http://www.iana.org/assignments/cha
    */
  def setEncoding(Encoding: String): Unit = js.native
  
  /**
    * writes a string to the stream using the encoding defined by {@link setEncoding()} .
    *
    * Line breaks or delimiters that may be necessary to support {@link XTextInputStream.readLine()} and {@link XTextInputStream.readString()} have to be
    * added manually to the parameter string.
    * @see setEncoding
    * @see XTextInputStream.readLine
    * @see XTextInputStream.readString
    */
  def writeString(aString: String): Unit = js.native
}
object XTextOutputStream {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    closeOutput: () => Unit,
    flush: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setEncoding: String => Unit,
    writeBytes: SeqEquiv[Double] => Unit,
    writeString: String => Unit
  ): XTextOutputStream = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), closeOutput = js.Any.fromFunction0(closeOutput), flush = js.Any.fromFunction0(flush), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setEncoding = js.Any.fromFunction1(setEncoding), writeBytes = js.Any.fromFunction1(writeBytes), writeString = js.Any.fromFunction1(writeString))
    __obj.asInstanceOf[XTextOutputStream]
  }
  
  @scala.inline
  implicit class XTextOutputStreamMutableBuilder[Self <: XTextOutputStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetEncoding(value: String => Unit): Self = StObject.set(x, "setEncoding", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWriteString(value: String => Unit): Self = StObject.set(x, "writeString", js.Any.fromFunction1(value))
  }
}
