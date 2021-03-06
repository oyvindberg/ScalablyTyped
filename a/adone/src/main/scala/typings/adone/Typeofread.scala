package typings.adone

import typings.node.Anon_BufferBytesRead
import typings.node.Anon_BufferBytesReadFloat32Array
import typings.node.Anon_BufferBytesReadFloat64Array
import typings.node.Anon_BufferBytesReadInt16Array
import typings.node.Anon_BufferBytesReadInt32Array
import typings.node.Anon_BufferBytesReadInt8Array
import typings.node.Anon_BufferBytesReadNumber
import typings.node.Anon_BufferBytesReadNumberUint16Array
import typings.node.Anon_BufferBytesReadNumberUint32Array
import typings.node.Anon_BufferBytesReadNumberUint8ClampedArray
import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofread extends js.Object {
  def __promisify__(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[Anon_BufferBytesRead] = js.native
  /**
    * @param fd A file descriptor.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
    */
  def __promisify__(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesRead] = js.native
  def __promisify__(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadFloat32Array] = js.native
  def __promisify__(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadFloat32Array] = js.native
  def __promisify__(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadFloat64Array] = js.native
  def __promisify__(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadFloat64Array] = js.native
  def __promisify__(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadInt16Array] = js.native
  def __promisify__(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadInt16Array] = js.native
  def __promisify__(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadInt32Array] = js.native
  def __promisify__(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadInt32Array] = js.native
  def __promisify__(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadInt8Array] = js.native
  def __promisify__(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadInt8Array] = js.native
  def __promisify__(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadNumberUint16Array] = js.native
  def __promisify__(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadNumberUint16Array] = js.native
  def __promisify__(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadNumberUint32Array] = js.native
  def __promisify__(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadNumberUint32Array] = js.native
  def __promisify__(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadNumber] = js.native
  def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[Anon_BufferBytesReadNumberUint8ClampedArray] = js.native
  def __promisify__(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[Anon_BufferBytesReadNumberUint8ClampedArray] = js.native
}

