package typings.ejWebAll.global.ej

import typings.ejWebAll.JQuery
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ej.Tab")
@js.native
class Tab protected ()
  extends typings.ejWebAll.ej.Tab {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejWebAll.ej.Model) = this()
  def this(element: Element, options: typings.ejWebAll.ej.Model) = this()
}
object Tab {
  
  @JSGlobal("ej.Tab")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ej.Tab.HeightAdjustMode")
  @js.native
  object HeightAdjustMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tab.HeightAdjustMode with Double] = js.native
    
    /* 2 */ val Auto: typings.ejWebAll.ej.Tab.HeightAdjustMode.Auto with Double = js.native
    
    /* 1 */ val Content: typings.ejWebAll.ej.Tab.HeightAdjustMode.Content with Double = js.native
    
    /* 3 */ val Fill: typings.ejWebAll.ej.Tab.HeightAdjustMode.Fill with Double = js.native
    
    /* 0 */ val None: typings.ejWebAll.ej.Tab.HeightAdjustMode.None with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Tab.Locale")
  @js.native
  def Locale: js.Any = js.native
  @scala.inline
  def Locale_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Locale")(x.asInstanceOf[js.Any])
  
  @JSGlobal("ej.Tab.Position")
  @js.native
  object Position extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.ejWebAll.ej.Tab.Position with Double] = js.native
    
    /* 1 */ val Bottom: typings.ejWebAll.ej.Tab.Position.Bottom with Double = js.native
    
    /* 2 */ val Left: typings.ejWebAll.ej.Tab.Position.Left with Double = js.native
    
    /* 3 */ val Right: typings.ejWebAll.ej.Tab.Position.Right with Double = js.native
    
    /* 0 */ val Top: typings.ejWebAll.ej.Tab.Position.Top with Double = js.native
  }
  
  /* static member */
  @JSGlobal("ej.Tab.fn")
  @js.native
  def fn: typings.ejWebAll.ej.Tab = js.native
  @scala.inline
  def fn_=(x: typings.ejWebAll.ej.Tab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fn")(x.asInstanceOf[js.Any])
}
