package typings.rdfjsNamespace

import org.scalablytyped.runtime.StringDictionary
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.NamedNode
import typings.rdfJs.mod.Quad
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rdfjs/namespace", JSImport.Namespace)
  @js.native
  def apply(baseIRI: String): NamespaceBuilder = js.native
  @JSImport("@rdfjs/namespace", JSImport.Namespace)
  @js.native
  def apply(baseIRI: String, options: BuilderOptions): NamespaceBuilder = js.native
  
  @js.native
  trait BuilderOptions extends StObject {
    
    var factory: js.UndefOr[DataFactory[Quad, Quad]] = js.native
  }
  object BuilderOptions {
    
    @scala.inline
    def apply(): BuilderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuilderOptions]
    }
    
    @scala.inline
    implicit class BuilderOptionsMutableBuilder[Self <: BuilderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFactory(value: DataFactory[Quad, Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    }
  }
  
  @js.native
  trait NamespaceBuilder extends /* property */ StringDictionary[NamedNode[String]] {
    
    def apply(): NamedNode[String] = js.native
    def apply(property: String): NamedNode[String] = js.native
    def apply(property: TemplateStringsArray): NamedNode[String] = js.native
  }
}
