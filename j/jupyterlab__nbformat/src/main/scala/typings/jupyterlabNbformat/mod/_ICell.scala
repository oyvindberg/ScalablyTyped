package typings.jupyterlabNbformat.mod

import typings.jupyterlabNbformat.anon.PartialICodeCellMetadata
import typings.jupyterlabNbformat.anon.PartialIRawCellMetadata
import typings.jupyterlabNbformat.jupyterlabNbformatStrings.code
import typings.jupyterlabNbformat.jupyterlabNbformatStrings.markdown
import typings.jupyterlabNbformat.jupyterlabNbformatStrings.raw
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _ICell extends StObject
object _ICell {
  
  @scala.inline
  def ICodeCell(
    cell_type: code,
    metadata: PartialICodeCellMetadata,
    outputs: js.Array[IOutput],
    source: MultilineString
  ): typings.jupyterlabNbformat.mod.ICodeCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabNbformat.mod.ICodeCell]
  }
  
  @scala.inline
  def IMarkdownCell(cell_type: markdown, metadata: Partial[ICellMetadata], source: MultilineString): typings.jupyterlabNbformat.mod.IMarkdownCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabNbformat.mod.IMarkdownCell]
  }
  
  @scala.inline
  def IRawCell(cell_type: raw, metadata: PartialIRawCellMetadata, source: MultilineString): typings.jupyterlabNbformat.mod.IRawCell = {
    val __obj = js.Dynamic.literal(cell_type = cell_type.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jupyterlabNbformat.mod.IRawCell]
  }
}
