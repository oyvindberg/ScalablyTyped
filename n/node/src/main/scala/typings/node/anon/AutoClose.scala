package typings.node.anon

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoClose extends StObject {
  
  var autoClose: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var emitClose: js.UndefOr[Boolean] = js.native
  
  var encoding: js.UndefOr[BufferEncoding] = js.native
  
  var end: js.UndefOr[Double] = js.native
  
  var fd: js.UndefOr[Double] = js.native
  
  var flags: js.UndefOr[String] = js.native
  
  var highWaterMark: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[Double] = js.native
  
  var start: js.UndefOr[Double] = js.native
}
object AutoClose {
  
  @scala.inline
  def apply(): AutoClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoClose]
  }
  
  @scala.inline
  implicit class AutoCloseMutableBuilder[Self <: AutoClose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    @scala.inline
    def setEmitClose(value: Boolean): Self = StObject.set(x, "emitClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmitCloseUndefined: Self = StObject.set(x, "emitClose", js.undefined)
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
    
    @scala.inline
    def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
