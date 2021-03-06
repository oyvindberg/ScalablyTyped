package typings.rdfjsSerializerRdfjs

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.Sink
import typings.rdfJs.mod.Stream
import typings.rdfjsSerializerRdfjs.rdfjsSerializerRdfjsStrings.esm
import typings.rdfjsSerializerRdfjs.rdfjsSerializerRdfjsStrings.ts
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/serializer-rdfjs", JSImport.Namespace)
  @js.native
  class ^[Q /* <: BaseQuad */] () extends Serializer[Q] {
    def this(options: SerializerOptions) = this()
  }
  
  @js.native
  trait Serializer[Q /* <: BaseQuad */] extends Sink[Stream[Q], EventEmitter] {
    
    def `import`(stream: Stream[Q], options: SerializerOptions): EventEmitter = js.native
    
    def transform(quads: Iterable[Q]): String = js.native
  }
  
  @js.native
  trait SerializerOptions extends StObject {
    
    var module: js.UndefOr[esm | ts | String] = js.native
  }
  object SerializerOptions {
    
    @scala.inline
    def apply(): SerializerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializerOptions]
    }
    
    @scala.inline
    implicit class SerializerOptionsMutableBuilder[Self <: SerializerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModule(value: esm | ts | String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    }
  }
}
