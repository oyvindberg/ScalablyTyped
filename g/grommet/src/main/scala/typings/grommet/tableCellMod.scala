package typings.grommet

import typings.grommet.boxMod.BoxTypes
import typings.grommet.grommetStrings.`1Slash2`
import typings.grommet.grommetStrings.`1Slash3`
import typings.grommet.grommetStrings.`1Slash4`
import typings.grommet.grommetStrings.`2Slash3`
import typings.grommet.grommetStrings.`2Slash4`
import typings.grommet.grommetStrings.`3Slash4`
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.col
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.middle
import typings.grommet.grommetStrings.row
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.top
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.TdHTMLAttributes
import typings.std.HTMLTableDataCellElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableCellMod {
  
  @JSImport("grommet/components/TableCell", "TableCell")
  @js.native
  val TableCell: FC[
    TableCellProps with BoxTypes with (DetailedHTMLProps[TdHTMLAttributes[HTMLTableDataCellElement], HTMLTableDataCellElement])
  ] = js.native
  
  @js.native
  trait TableCellProps extends StObject {
    
    var plain: js.UndefOr[Boolean] = js.native
    
    var scope: js.UndefOr[col | row] = js.native
    
    var size: js.UndefOr[
        xxsmall | xsmall | small | medium | large | xlarge | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | String
      ] = js.native
    
    var verticalAlign: js.UndefOr[top | middle | bottom] = js.native
  }
  object TableCellProps {
    
    @scala.inline
    def apply(): TableCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableCellProps]
    }
    
    @scala.inline
    implicit class TableCellPropsMutableBuilder[Self <: TableCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      @scala.inline
      def setScope(value: col | row): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setSize(
        value: xxsmall | xsmall | small | medium | large | xlarge | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | String
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: top | middle | bottom): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    }
  }
}
