package typings.rcTreeSelect

import org.scalablytyped.runtime.Shortcut
import typings.rcSelect.optionListMod.RefOptionListProps
import typings.rcTreeSelect.anon.Selected
import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.interfaceMod.FlattenDataNode
import typings.rcTreeSelect.interfaceMod.RawValueType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.UIEventHandler
import typings.std.HTMLDivElement
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionListMod extends Shortcut {
  
  @JSImport("rc-tree-select/es/OptionList", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[OptionListProps[js.Array[DataNode]] with RefAttributes[RefOptionListProps]] = js.native
  
  @js.native
  trait OptionListProps[OptionsType /* <: js.Array[js.Object] */] extends StObject {
    
    var childrenAsData: Boolean = js.native
    
    var defaultActiveFirstOption: js.UndefOr[Boolean] = js.native
    
    var flattenOptions: js.Array[FlattenDataNode] = js.native
    
    var height: Double = js.native
    
    var id: String = js.native
    
    var itemHeight: Double = js.native
    
    var menuItemSelectedIcon: js.UndefOr[js.Any] = js.native
    
    var multiple: Boolean = js.native
    
    var notFoundContent: js.UndefOr[ReactNode] = js.native
    
    /** Tell Select that some value is now active to make accessibility work */
    def onActiveValue(value: RawValueType, index: Double): Unit = js.native
    
    def onMouseEnter(): Unit = js.native
    
    var onScroll: UIEventHandler[HTMLDivElement] = js.native
    
    def onSelect(value: RawValueType, option: Selected): Unit = js.native
    
    def onToggleOpen(): Unit = js.native
    def onToggleOpen(open: Boolean): Unit = js.native
    
    var open: Boolean = js.native
    
    var options: OptionsType = js.native
    
    var prefixCls: String = js.native
    
    var searchValue: String = js.native
    
    var values: Set[RawValueType] = js.native
    
    var virtual: js.UndefOr[Boolean] = js.native
  }
  
  type _To = ForwardRefExoticComponent[OptionListProps[js.Array[DataNode]] with RefAttributes[RefOptionListProps]]
  
  /* This means you don't have to write `default`, but can instead just say `optionListMod.foo` */
  override def _to: ForwardRefExoticComponent[OptionListProps[js.Array[DataNode]] with RefAttributes[RefOptionListProps]] = default
}
