package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the settings to format a table.
  */
@js.native
trait TableFormattingSettings extends StObject {
  
  /**
    * Gets or sets the alignment of table rows.
    */
  var alignment: TableRowAlignment = js.native
  
  /**
    * Gets or sets a value specifying whether spacing is allowed between table cells.
    */
  var allowSpacingBetweenCells: Boolean = js.native
  
  /**
    * Gets or sets the default bottom margin for cells in the table in twips.
    */
  var defaultCellMarginBottom: Double = js.native
  
  /**
    * Gets or sets the default left margin for cells in the table in twips.
    */
  var defaultCellMarginLeft: Double = js.native
  
  /**
    * Gets or sets the default right margin for cells in the table in twips.
    */
  var defaultCellMarginRight: Double = js.native
  
  /**
    * Gets or sets the default top margin for cells in the table in twips.
    */
  var defaultCellMarginTop: Double = js.native
  
  /**
    * Gets or sets the table's left indent in twips.
    */
  var indent: Double = js.native
  
  /**
    * Gets or sets the preferred width of cells in the table.
    */
  var preferredWidth: TableWidthUnit = js.native
  
  /**
    * Gets or sets a value that specifying whether to allow automatic resizing of table cells to fit their contents.
    */
  var resizeToFitContent: Boolean = js.native
  
  /**
    * Gets or sets the spacing between table cells in twips.
    */
  var spacingBetweenCells: Double = js.native
}
object TableFormattingSettings {
  
  @scala.inline
  def apply(
    alignment: TableRowAlignment,
    allowSpacingBetweenCells: Boolean,
    defaultCellMarginBottom: Double,
    defaultCellMarginLeft: Double,
    defaultCellMarginRight: Double,
    defaultCellMarginTop: Double,
    indent: Double,
    preferredWidth: TableWidthUnit,
    resizeToFitContent: Boolean,
    spacingBetweenCells: Double
  ): TableFormattingSettings = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], allowSpacingBetweenCells = allowSpacingBetweenCells.asInstanceOf[js.Any], defaultCellMarginBottom = defaultCellMarginBottom.asInstanceOf[js.Any], defaultCellMarginLeft = defaultCellMarginLeft.asInstanceOf[js.Any], defaultCellMarginRight = defaultCellMarginRight.asInstanceOf[js.Any], defaultCellMarginTop = defaultCellMarginTop.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], preferredWidth = preferredWidth.asInstanceOf[js.Any], resizeToFitContent = resizeToFitContent.asInstanceOf[js.Any], spacingBetweenCells = spacingBetweenCells.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableFormattingSettings]
  }
  
  @scala.inline
  implicit class TableFormattingSettingsMutableBuilder[Self <: TableFormattingSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: TableRowAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSpacingBetweenCells(value: Boolean): Self = StObject.set(x, "allowSpacingBetweenCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCellMarginBottom(value: Double): Self = StObject.set(x, "defaultCellMarginBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCellMarginLeft(value: Double): Self = StObject.set(x, "defaultCellMarginLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCellMarginRight(value: Double): Self = StObject.set(x, "defaultCellMarginRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCellMarginTop(value: Double): Self = StObject.set(x, "defaultCellMarginTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredWidth(value: TableWidthUnit): Self = StObject.set(x, "preferredWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeToFitContent(value: Boolean): Self = StObject.set(x, "resizeToFitContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingBetweenCells(value: Double): Self = StObject.set(x, "spacingBetweenCells", value.asInstanceOf[js.Any])
  }
}
