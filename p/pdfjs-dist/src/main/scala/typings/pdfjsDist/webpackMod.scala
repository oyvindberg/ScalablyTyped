package typings.pdfjsDist

import typings.pdfjsDist.mod.PDFJSStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackMod {
  
  @JSImport("pdfjs-dist/webpack", "CMapCompressionType")
  @js.native
  object CMapCompressionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pdfjsDist.mod.CMapCompressionType with Double] = js.native
    
    /* 1 */ val BINARY: typings.pdfjsDist.mod.CMapCompressionType.BINARY with Double = js.native
    
    /* 0 */ val NONE: typings.pdfjsDist.mod.CMapCompressionType.NONE with Double = js.native
    
    /* 2 */ val STREAM: typings.pdfjsDist.mod.CMapCompressionType.STREAM with Double = js.native
  }
  
  @JSImport("pdfjs-dist/webpack", "PDFJS")
  @js.native
  val PDFJS: PDFJSStatic = js.native
  
  @JSImport("pdfjs-dist/webpack", "VerbosityLevel")
  @js.native
  object VerbosityLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.pdfjsDist.mod.VerbosityLevel with Double] = js.native
    
    /* 0 */ val ERRORS: typings.pdfjsDist.mod.VerbosityLevel.ERRORS with Double = js.native
    
    /* 5 */ val INFOS: typings.pdfjsDist.mod.VerbosityLevel.INFOS with Double = js.native
    
    /* 1 */ val WARNINGS: typings.pdfjsDist.mod.VerbosityLevel.WARNINGS with Double = js.native
  }
}
