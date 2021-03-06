package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.componentMod.Component
import typings.agGrid.dragAndDropServiceMod.DropTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerWrapperCompMod {
  
  @JSImport("ag-grid/dist/lib/headerRendering/header/headerWrapperComp", "HeaderWrapperComp")
  @js.native
  class HeaderWrapperComp protected () extends Component {
    def this(column: Column, dragSourceDropTarget: DropTarget, pinned: String) = this()
    
    /* private */ def addAttributes(): js.Any = js.native
    
    /* private */ def addColumnHoverListener(): js.Any = js.native
    
    /* private */ def afterHeaderCompCreated(displayName: js.Any, headerComp: js.Any): js.Any = js.native
    
    /* private */ def appendHeaderComp(displayName: js.Any, enableSorting: js.Any, enableMenu: js.Any): js.Any = js.native
    
    var beans: js.Any = js.native
    
    var cbSelectAll: js.Any = js.native
    
    var column: js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    var columnController: js.Any = js.native
    
    var columnHoverService: js.Any = js.native
    
    var componentRecipes: js.Any = js.native
    
    var context: js.Any = js.native
    
    /* private */ def createDragItem(): js.Any = js.native
    
    var dragAndDropService: js.Any = js.native
    
    var dragSourceDropTarget: js.Any = js.native
    
    var eResize: js.Any = js.native
    
    var eventService: js.Any = js.native
    
    def getColumn(): Column = js.native
    
    var gridApi: js.Any = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var horizontalResizeService: js.Any = js.native
    
    @JSName("init")
    def init_MHeaderWrapperComp(): Unit = js.native
    
    var menuFactory: js.Any = js.native
    
    /* private */ def normaliseResizeAmount(dragChange: js.Any): js.Any = js.native
    
    /* private */ def onColumnHover(): js.Any = js.native
    
    /* private */ def onColumnMovingChanged(): js.Any = js.native
    
    /* private */ def onColumnWidthChanged(): js.Any = js.native
    
    /* private */ def onFilterChanged(): js.Any = js.native
    
    /* private */ def onMenuVisible(): js.Any = js.native
    
    def onResizeStart(shiftKey: Boolean): Unit = js.native
    
    def onResizing(finished: Boolean, resizeAmount: Double): Unit = js.native
    
    var pinned: js.Any = js.native
    
    var resizeStartWidth: js.Any = js.native
    
    var resizeWithShiftKey: js.Any = js.native
    
    /* private */ def setupMenuClass(): js.Any = js.native
    
    /* private */ def setupMove(eHeaderCellLabel: js.Any, displayName: js.Any): js.Any = js.native
    
    /* private */ def setupMovingCss(): js.Any = js.native
    
    /* private */ def setupResize(): js.Any = js.native
    
    /* private */ def setupSortableClass(enableSorting: js.Any): js.Any = js.native
    
    /* private */ def setupTooltip(): js.Any = js.native
    
    /* private */ def setupWidth(): js.Any = js.native
    
    var sortController: js.Any = js.native
  }
  /* static members */
  object HeaderWrapperComp {
    
    @JSImport("ag-grid/dist/lib/headerRendering/header/headerWrapperComp", "HeaderWrapperComp")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/headerRendering/header/headerWrapperComp", "HeaderWrapperComp.TEMPLATE")
    @js.native
    def TEMPLATE: js.Any = js.native
    @scala.inline
    def TEMPLATE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TEMPLATE")(x.asInstanceOf[js.Any])
  }
}
