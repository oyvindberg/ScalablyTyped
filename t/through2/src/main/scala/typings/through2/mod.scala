package typings.through2

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.BufferEncoding
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("through2", JSImport.Namespace)
  @js.native
  def apply(): Transform = js.native
  @JSImport("through2", JSImport.Namespace)
  @js.native
  def apply(opts: js.UndefOr[scala.Nothing], transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Transform = js.native
  @JSImport("through2", JSImport.Namespace)
  @js.native
  def apply(opts: js.UndefOr[scala.Nothing], transform: TransformFunction): Transform = js.native
  @JSImport("through2", JSImport.Namespace)
  @js.native
  def apply(opts: js.UndefOr[scala.Nothing], transform: TransformFunction, flush: FlushCallback): Transform = js.native
  @JSImport("through2", JSImport.Namespace)
  @js.native
  def apply(opts: DuplexOptions): Transform = js.native
  @JSImport("through2", JSImport.Namespace)
  @js.native
  def apply(opts: DuplexOptions, transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Transform = js.native
  @JSImport("through2", JSImport.Namespace)
  @js.native
  def apply(opts: DuplexOptions, transform: TransformFunction): Transform = js.native
  @JSImport("through2", JSImport.Namespace)
  @js.native
  def apply(opts: DuplexOptions, transform: TransformFunction, flush: FlushCallback): Transform = js.native
  @JSImport("through2", JSImport.Namespace)
  @js.native
  def apply(transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Transform = js.native
  @JSImport("through2", JSImport.Namespace)
  @js.native
  def apply(transform: TransformFunction): Transform = js.native
  @JSImport("through2", JSImport.Namespace)
  @js.native
  def apply(transform: TransformFunction, flush: FlushCallback): Transform = js.native
  
  /**
    * Creates a constructor for a custom Transform. This is useful when you
    * want to use the same transform logic in multiple instances.
    */
  @JSImport("through2", "ctor")
  @js.native
  def ctor(): Through2Constructor = js.native
  @JSImport("through2", "ctor")
  @js.native
  def ctor(opts: js.UndefOr[scala.Nothing], transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Through2Constructor = js.native
  @JSImport("through2", "ctor")
  @js.native
  def ctor(opts: js.UndefOr[scala.Nothing], transform: TransformFunction): Through2Constructor = js.native
  @JSImport("through2", "ctor")
  @js.native
  def ctor(opts: js.UndefOr[scala.Nothing], transform: TransformFunction, flush: FlushCallback): Through2Constructor = js.native
  @JSImport("through2", "ctor")
  @js.native
  def ctor(opts: DuplexOptions): Through2Constructor = js.native
  @JSImport("through2", "ctor")
  @js.native
  def ctor(opts: DuplexOptions, transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Through2Constructor = js.native
  @JSImport("through2", "ctor")
  @js.native
  def ctor(opts: DuplexOptions, transform: TransformFunction): Through2Constructor = js.native
  @JSImport("through2", "ctor")
  @js.native
  def ctor(opts: DuplexOptions, transform: TransformFunction, flush: FlushCallback): Through2Constructor = js.native
  @JSImport("through2", "ctor")
  @js.native
  def ctor(transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Through2Constructor = js.native
  @JSImport("through2", "ctor")
  @js.native
  def ctor(transform: TransformFunction): Through2Constructor = js.native
  @JSImport("through2", "ctor")
  @js.native
  def ctor(transform: TransformFunction, flush: FlushCallback): Through2Constructor = js.native
  
  /**
    * Convenvience method for creating object streams
    */
  @JSImport("through2", "obj")
  @js.native
  def obj(): Transform = js.native
  @JSImport("through2", "obj")
  @js.native
  def obj(transform: js.UndefOr[scala.Nothing], flush: FlushCallback): Transform = js.native
  @JSImport("through2", "obj")
  @js.native
  def obj(transform: TransformFunction): Transform = js.native
  @JSImport("through2", "obj")
  @js.native
  def obj(transform: TransformFunction, flush: FlushCallback): Transform = js.native
  
  type FlushCallback = js.ThisFunction1[/* this */ Transform, /* flushCallback */ js.Function0[Unit], Unit]
  
  @js.native
  trait Through2Constructor
    extends Transform
       with Instantiable0[Transform]
       with Instantiable1[/* opts */ DuplexOptions, Transform] {
    
    def apply(): Transform = js.native
    def apply(opts: DuplexOptions): Transform = js.native
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
  
  type TransformCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any], Unit]
  
  type TransformFunction = js.ThisFunction3[
    /* this */ Transform, 
    /* chunk */ js.Any, 
    /* enc */ BufferEncoding, 
    /* callback */ TransformCallback, 
    Unit
  ]
}
