package typings.rollup.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypedEventEmitter[T /* <: StringDictionary[js.Function1[/* args */ js.Any, _]] */] extends StObject {
  
  def addListener[K /* <: /* keyof T */ String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  
  def emit[K /* <: /* keyof T */ String */](
    event: K,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<T[K]> is not an array type */ args: Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    ]
  ): Boolean = js.native
  
  def eventNames(): js.Array[/* keyof T */ String] = js.native
  
  def getMaxListeners(): Double = js.native
  
  def listenerCount(`type`: /* keyof T */ String): Double = js.native
  
  def listeners[K /* <: /* keyof T */ String */](event: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  
  def off[K /* <: /* keyof T */ String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  
  def on[K /* <: /* keyof T */ String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  
  def once[K /* <: /* keyof T */ String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  
  def prependListener[K /* <: /* keyof T */ String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  
  def prependOnceListener[K /* <: /* keyof T */ String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  
  def rawListeners[K /* <: /* keyof T */ String */](event: K): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = js.native
  
  def removeAllListeners[K /* <: /* keyof T */ String */](): this.type = js.native
  def removeAllListeners[K /* <: /* keyof T */ String */](event: K): this.type = js.native
  
  def removeListener[K /* <: /* keyof T */ String */](
    event: K,
    listener: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): this.type = js.native
  
  def setMaxListeners(n: Double): this.type = js.native
}
