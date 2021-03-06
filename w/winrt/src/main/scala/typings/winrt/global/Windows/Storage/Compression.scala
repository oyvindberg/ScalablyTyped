package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Storage.Compression.CompressAlgorithm
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Compression {
  
  @JSGlobal("Windows.Storage.Compression.CompressAlgorithm")
  @js.native
  object CompressAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Compression.CompressAlgorithm with Double] = js.native
    
    /* 0 */ val invalidAlgorithm: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.invalidAlgorithm with Double = js.native
    
    /* 5 */ val lzms: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.lzms with Double = js.native
    
    /* 2 */ val mszip: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.mszip with Double = js.native
    
    /* 1 */ val nullAlgorithm: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.nullAlgorithm with Double = js.native
    
    /* 3 */ val xpress: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.xpress with Double = js.native
    
    /* 4 */ val xpressHuff: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.xpressHuff with Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Compression.Compressor")
  @js.native
  class Compressor protected ()
    extends typings.winrt.Windows.Storage.Compression.Compressor {
    def this(underlyingStream: IOutputStream) = this()
    def this(underlyingStream: IOutputStream, algorithm: CompressAlgorithm, blockSize: Double) = this()
  }
  
  @JSGlobal("Windows.Storage.Compression.Decompressor")
  @js.native
  class Decompressor protected ()
    extends typings.winrt.Windows.Storage.Compression.Decompressor {
    def this(underlyingStream: IInputStream) = this()
  }
}
