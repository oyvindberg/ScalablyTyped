package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Walls extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val Border: ChartBorder = js.native
  
  def ClearFormats(): js.Any = js.native
  
  val Creator: Double = js.native
  
  val Fill: ChartFillFormat = js.native
  
  val Format: ChartFormat = js.native
  
  val Interior: typings.activexPowerpoint.PowerPoint.Interior = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  def Paste(): Unit = js.native
  
  var PictureType: js.Any = js.native
  
  var PictureUnit: js.Any = js.native
  
  @JSName("PowerPoint.Walls_typekey")
  var PowerPointDotWalls_typekey: Walls = js.native
  
  def Select(): js.Any = js.native
  
  var Thickness: Double = js.native
}
object Walls {
  
  @scala.inline
  def apply(
    Application: Application,
    Border: ChartBorder,
    ClearFormats: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Format: ChartFormat,
    Interior: Interior,
    Name: String,
    Parent: js.Any,
    Paste: () => Unit,
    PictureType: js.Any,
    PictureUnit: js.Any,
    PowerPointDotWalls_typekey: Walls,
    Select: () => js.Any,
    Thickness: Double
  ): Walls = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], ClearFormats = js.Any.fromFunction0(ClearFormats), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), PictureType = PictureType.asInstanceOf[js.Any], PictureUnit = PictureUnit.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Thickness = Thickness.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Walls_typekey")(PowerPointDotWalls_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Walls]
  }
  
  @scala.inline
  implicit class WallsMutableBuilder[Self <: Walls] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: ChartBorder): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFormats(value: () => js.Any): Self = StObject.set(x, "ClearFormats", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: ChartFillFormat): Self = StObject.set(x, "Fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: ChartFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterior(value: Interior): Self = StObject.set(x, "Interior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaste(value: () => Unit): Self = StObject.set(x, "Paste", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPictureType(value: js.Any): Self = StObject.set(x, "PictureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureUnit(value: js.Any): Self = StObject.set(x, "PictureUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotWalls_typekey(value: Walls): Self = StObject.set(x, "PowerPoint.Walls_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: () => js.Any): Self = StObject.set(x, "Select", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "Thickness", value.asInstanceOf[js.Any])
  }
}
