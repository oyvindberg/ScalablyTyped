package typings.jupyterlabNbformat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ExecutionCount = scala.Double | scala.Null
  
  type IAttachments = org.scalablytyped.runtime.StringDictionary[js.UndefOr[typings.jupyterlabNbformat.mod.IMimeBundle]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabNbformat.mod.IRawCell
    - typings.jupyterlabNbformat.mod.IMarkdownCell
    - typings.jupyterlabNbformat.mod.ICodeCell
    - typings.jupyterlabNbformat.mod.IUnrecognizedCell
  */
  type ICell = typings.jupyterlabNbformat.mod._ICell | typings.jupyterlabNbformat.mod.IUnrecognizedCell
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabNbformat.mod.IUnrecognizedOutput
    - typings.jupyterlabNbformat.mod.IExecuteResult
    - typings.jupyterlabNbformat.mod.IDisplayData
    - typings.jupyterlabNbformat.mod.IStream
    - typings.jupyterlabNbformat.mod.IError
  */
  type IOutput = typings.jupyterlabNbformat.mod._IOutput | typings.jupyterlabNbformat.mod.IUnrecognizedOutput
  
  type IUnrecognizedCell = typings.jupyterlabNbformat.mod.IBaseCell
  
  type IUnrecognizedOutput = typings.jupyterlabNbformat.mod.IBaseOutput
  
  @scala.inline
  def MAJOR_VERSION: scala.Double = typings.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MAJOR_VERSION").asInstanceOf[scala.Double]
  
  @scala.inline
  def MINOR_VERSION: scala.Double = typings.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].selectDynamic("MINOR_VERSION").asInstanceOf[scala.Double]
  
  type MultilineString = java.lang.String | js.Array[java.lang.String]
  
  type OutputMetadata = typings.luminoCoreutils.jsonMod.PartialJSONObject
  
  @scala.inline
  def isCode(cell: typings.jupyterlabNbformat.mod.ICell): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.ICodeCell */ scala.Boolean = typings.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isCode")(cell.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.ICodeCell */ scala.Boolean]
  
  @scala.inline
  def isDisplayData(output: typings.jupyterlabNbformat.mod.IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IDisplayData */ scala.Boolean = typings.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isDisplayData")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IDisplayData */ scala.Boolean]
  
  @scala.inline
  def isDisplayUpdate(output: typings.jupyterlabNbformat.mod.IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IDisplayUpdate */ scala.Boolean = typings.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isDisplayUpdate")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IDisplayUpdate */ scala.Boolean]
  
  @scala.inline
  def isError(output: typings.jupyterlabNbformat.mod.IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IError */ scala.Boolean = typings.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isError")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IError */ scala.Boolean]
  
  @scala.inline
  def isExecuteResult(output: typings.jupyterlabNbformat.mod.IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IExecuteResult */ scala.Boolean = typings.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isExecuteResult")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IExecuteResult */ scala.Boolean]
  
  @scala.inline
  def isMarkdown(cell: typings.jupyterlabNbformat.mod.ICell): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IMarkdownCell */ scala.Boolean = typings.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isMarkdown")(cell.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IMarkdownCell */ scala.Boolean]
  
  @scala.inline
  def isRaw(cell: typings.jupyterlabNbformat.mod.ICell): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IRawCell */ scala.Boolean = typings.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isRaw")(cell.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IRawCell */ scala.Boolean]
  
  @scala.inline
  def isStream(output: typings.jupyterlabNbformat.mod.IOutput): /* is @jupyterlab/nbformat.@jupyterlab/nbformat.IStream */ scala.Boolean = typings.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isStream")(output.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/nbformat.@jupyterlab/nbformat.IStream */ scala.Boolean]
  
  @scala.inline
  def validateMimeValue(`type`: java.lang.String, value: typings.jupyterlabNbformat.mod.MultilineString): scala.Boolean = (typings.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validateMimeValue")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  @scala.inline
  def validateMimeValue(`type`: java.lang.String, value: typings.luminoCoreutils.jsonMod.PartialJSONObject): scala.Boolean = (typings.jupyterlabNbformat.mod.^.asInstanceOf[js.Dynamic].applyDynamic("validateMimeValue")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
}
