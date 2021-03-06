package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The chart print options storage.
  */
@js.native
trait ASPxClientChartPrintOptions extends StObject {
  
  /**
    * Gets the custom paper height which will be used to print a chart.
    */
  def GetCustomPaperHeight(): Double = js.native
  
  /**
    * Gets the name of the custom paper width-height ratio used to print the chart.
    */
  def GetCustomPaperName(): String = js.native
  
  /**
    * Gets the custom paper width which will be used to print a chart.
    */
  def GetCustomPaperWidth(): Double = js.native
  
  /**
    * Gets a value indicating that the landscape orientation will be used to print a chart.
    */
  def GetLandscape(): Boolean = js.native
  
  /**
    * Gets the bottom margin which will be used to print a chart.
    */
  def GetMarginBottom(): Double = js.native
  
  /**
    * Gets the left margin which will be used to print a chart.
    */
  def GetMarginLeft(): Double = js.native
  
  /**
    * Gets the right margin which will be used to print a chart.
    */
  def GetMarginRight(): Double = js.native
  
  /**
    * Gets the top margin which will be used to print a chart.
    */
  def GetMarginTop(): Double = js.native
  
  /**
    * Gets the predefined size ratio of the paper which will be used to print a chart.
    */
  def GetPaperKind(): String = js.native
  
  /**
    * Returns the value that defines whether to display the crosshair on the printed or exported chart.
    */
  def GetPrintCrosshair(): Boolean = js.native
  
  /**
    * Gets the size mode used to print a chart.
    */
  def GetSizeMode(): String = js.native
  
  /**
    * Sets the custom paper height which will be used to print a chart.
    * @param customPaperHeight A System.Int32 object, specifying the height in hundredths of an inch.
    */
  def SetCustomPaperHeight(customPaperHeight: Double): Unit = js.native
  
  /**
    * Sets the name of the custom paper width-height ratio used to print a chart.
    * @param customPaperName A String object, specifying the name of the custom paper width-height ratio.
    */
  def SetCustomPaperName(customPaperName: String): Unit = js.native
  
  /**
    * Sets the custom paper width which will be used to print a chart.
    * @param customPaperWidth A System.Int32 object, specifying the width in hundredths of an inch.
    */
  def SetCustomPaperWidth(customPaperWidth: Double): Unit = js.native
  
  /**
    * Sets a value indicating that the landscape orientation will be used to print a chart.
    * @param landscape A Boolean value, specifying that the landscape orientation will be used to print a chart.
    */
  def SetLandscape(landscape: Boolean): Unit = js.native
  
  /**
    * Sets the bottom margin which will be used to print a chart.
    * @param marginBottom A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginBottom(marginBottom: Double): Unit = js.native
  
  /**
    * Sets the left margin which will be used to print a chart.
    * @param marginLeft A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginLeft(marginLeft: Double): Unit = js.native
  
  /**
    * Sets the right margin which will be used to print a chart.
    * @param marginRight A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginRight(marginRight: Double): Unit = js.native
  
  /**
    * Sets the top margin which will be used to print a chart.
    * @param marginTop A System.Int32 value, specifying the margin in hundredths of an inch.
    */
  def SetMarginTop(marginTop: Double): Unit = js.native
  
  /**
    * Sets the predefined size ratio of the paper which will be used to print a chart.
    * @param paperKind A System.String object, specifying the name of a size ratio.
    */
  def SetPaperKind(paperKind: String): Unit = js.native
  
  /**
    * Specifies the value that defines whether to display the crosshair on the printed or exported chart.
    * @param printCrosshair true, if the crosshair should be printed or exported; otherwise, false.
    */
  def SetPrintCrosshair(printCrosshair: Boolean): Unit = js.native
  
  /**
    * Sets the size mode used to print a chart.
    * @param sizeMode A System.String object, specifying the name of the size mode.
    */
  def SetSizeMode(sizeMode: String): Unit = js.native
}
object ASPxClientChartPrintOptions {
  
  @scala.inline
  def apply(
    GetCustomPaperHeight: () => Double,
    GetCustomPaperName: () => String,
    GetCustomPaperWidth: () => Double,
    GetLandscape: () => Boolean,
    GetMarginBottom: () => Double,
    GetMarginLeft: () => Double,
    GetMarginRight: () => Double,
    GetMarginTop: () => Double,
    GetPaperKind: () => String,
    GetPrintCrosshair: () => Boolean,
    GetSizeMode: () => String,
    SetCustomPaperHeight: Double => Unit,
    SetCustomPaperName: String => Unit,
    SetCustomPaperWidth: Double => Unit,
    SetLandscape: Boolean => Unit,
    SetMarginBottom: Double => Unit,
    SetMarginLeft: Double => Unit,
    SetMarginRight: Double => Unit,
    SetMarginTop: Double => Unit,
    SetPaperKind: String => Unit,
    SetPrintCrosshair: Boolean => Unit,
    SetSizeMode: String => Unit
  ): ASPxClientChartPrintOptions = {
    val __obj = js.Dynamic.literal(GetCustomPaperHeight = js.Any.fromFunction0(GetCustomPaperHeight), GetCustomPaperName = js.Any.fromFunction0(GetCustomPaperName), GetCustomPaperWidth = js.Any.fromFunction0(GetCustomPaperWidth), GetLandscape = js.Any.fromFunction0(GetLandscape), GetMarginBottom = js.Any.fromFunction0(GetMarginBottom), GetMarginLeft = js.Any.fromFunction0(GetMarginLeft), GetMarginRight = js.Any.fromFunction0(GetMarginRight), GetMarginTop = js.Any.fromFunction0(GetMarginTop), GetPaperKind = js.Any.fromFunction0(GetPaperKind), GetPrintCrosshair = js.Any.fromFunction0(GetPrintCrosshair), GetSizeMode = js.Any.fromFunction0(GetSizeMode), SetCustomPaperHeight = js.Any.fromFunction1(SetCustomPaperHeight), SetCustomPaperName = js.Any.fromFunction1(SetCustomPaperName), SetCustomPaperWidth = js.Any.fromFunction1(SetCustomPaperWidth), SetLandscape = js.Any.fromFunction1(SetLandscape), SetMarginBottom = js.Any.fromFunction1(SetMarginBottom), SetMarginLeft = js.Any.fromFunction1(SetMarginLeft), SetMarginRight = js.Any.fromFunction1(SetMarginRight), SetMarginTop = js.Any.fromFunction1(SetMarginTop), SetPaperKind = js.Any.fromFunction1(SetPaperKind), SetPrintCrosshair = js.Any.fromFunction1(SetPrintCrosshair), SetSizeMode = js.Any.fromFunction1(SetSizeMode))
    __obj.asInstanceOf[ASPxClientChartPrintOptions]
  }
  
  @scala.inline
  implicit class ASPxClientChartPrintOptionsMutableBuilder[Self <: ASPxClientChartPrintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCustomPaperHeight(value: () => Double): Self = StObject.set(x, "GetCustomPaperHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCustomPaperName(value: () => String): Self = StObject.set(x, "GetCustomPaperName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCustomPaperWidth(value: () => Double): Self = StObject.set(x, "GetCustomPaperWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLandscape(value: () => Boolean): Self = StObject.set(x, "GetLandscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMarginBottom(value: () => Double): Self = StObject.set(x, "GetMarginBottom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMarginLeft(value: () => Double): Self = StObject.set(x, "GetMarginLeft", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMarginRight(value: () => Double): Self = StObject.set(x, "GetMarginRight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMarginTop(value: () => Double): Self = StObject.set(x, "GetMarginTop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPaperKind(value: () => String): Self = StObject.set(x, "GetPaperKind", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPrintCrosshair(value: () => Boolean): Self = StObject.set(x, "GetPrintCrosshair", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSizeMode(value: () => String): Self = StObject.set(x, "GetSizeMode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCustomPaperHeight(value: Double => Unit): Self = StObject.set(x, "SetCustomPaperHeight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCustomPaperName(value: String => Unit): Self = StObject.set(x, "SetCustomPaperName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetCustomPaperWidth(value: Double => Unit): Self = StObject.set(x, "SetCustomPaperWidth", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetLandscape(value: Boolean => Unit): Self = StObject.set(x, "SetLandscape", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMarginBottom(value: Double => Unit): Self = StObject.set(x, "SetMarginBottom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMarginLeft(value: Double => Unit): Self = StObject.set(x, "SetMarginLeft", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMarginRight(value: Double => Unit): Self = StObject.set(x, "SetMarginRight", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMarginTop(value: Double => Unit): Self = StObject.set(x, "SetMarginTop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPaperKind(value: String => Unit): Self = StObject.set(x, "SetPaperKind", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPrintCrosshair(value: Boolean => Unit): Self = StObject.set(x, "SetPrintCrosshair", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSizeMode(value: String => Unit): Self = StObject.set(x, "SetSizeMode", js.Any.fromFunction1(value))
  }
}
