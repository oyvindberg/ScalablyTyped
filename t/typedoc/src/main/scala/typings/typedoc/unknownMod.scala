package typings.typedoc

import typings.typedoc.componentsMod.TypeTypeConverter
import typings.typedoc.converterConverterMod.Converter
import typings.typescript.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unknownMod {
  
  @JSImport("typedoc/dist/lib/converter/types/unknown", "UnknownConverter")
  @js.native
  class UnknownConverter protected () extends TypeTypeConverter[Type] {
    def this(owner: js.Symbol) = this()
    def this(owner: Converter) = this()
  }
}
