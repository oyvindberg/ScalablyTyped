package typings.filepond.mod

import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Blob & { readonly lastModified :number,  readonly name :string} */
@js.native
trait ActualFileObject extends StObject {
  
  def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
  
  val lastModified: Double = js.native
  
  val name: String = js.native
  
  val size: Double = js.native
  
  def slice(): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], contentType: String): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double): Blob = js.native
  def slice(start: js.UndefOr[scala.Nothing], end: Double, contentType: String): Blob = js.native
  def slice(start: Double): Blob = js.native
  def slice(start: Double, end: js.UndefOr[scala.Nothing], contentType: String): Blob = js.native
  def slice(start: Double, end: Double): Blob = js.native
  def slice(start: Double, end: Double, contentType: String): Blob = js.native
  
  def stream(): ReadableStream[_] = js.native
  
  def text(): js.Promise[String] = js.native
  
  val `type`: String = js.native
}
