package typings.reactVirtualized

import typings.reactVirtualized.anon.Children
import typings.reactVirtualized.esColumnSizerMod.ColumnSizerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnSizerMod {
  
  @JSImport("react-virtualized/dist/commonjs/ColumnSizer", "ColumnSizer")
  @js.native
  class ColumnSizer protected ()
    extends typings.reactVirtualized.esColumnSizerMod.ColumnSizer {
    def this(props: ColumnSizerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColumnSizerProps, context: js.Any) = this()
  }
  /* static members */
  object ColumnSizer {
    
    @JSImport("react-virtualized/dist/commonjs/ColumnSizer", "ColumnSizer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-virtualized/dist/commonjs/ColumnSizer", "ColumnSizer.propTypes")
    @js.native
    def propTypes: Children = js.native
    @scala.inline
    def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
