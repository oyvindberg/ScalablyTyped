package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Signature")
@js.native
class Signature protected ()
  extends typings.ejWebAll.ej.Signature {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Signature {
  
  @JSGlobal("ej.Signature")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("ej.Signature.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Signature.SaveImageFormat")
  @js.native
  object SaveImageFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Signature.SaveImageFormat with Double] = js.native
    
    /* 2 */ val BMP: typings.ejWebAll.ej.Signature.SaveImageFormat.BMP with Double = js.native
    
    /* 1 */ val JPG: typings.ejWebAll.ej.Signature.SaveImageFormat.JPG with Double = js.native
    
    /* 0 */ val PNG: typings.ejWebAll.ej.Signature.SaveImageFormat.PNG with Double = js.native
    
    /* 3 */ val TIFF: typings.ejWebAll.ej.Signature.SaveImageFormat.TIFF with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Signature.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Signature = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.Signature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
