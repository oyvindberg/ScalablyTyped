package typings.officeUiFabricReact.indexBundleMod

import typings.officeUiFabricReact.anon.Disabled
import typings.officeUiFabricReact.buttonGridCellTypesMod.IButtonGridCellProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("office-ui-fabric-react/lib/index.bundle", "GridCell")
@js.native
class GridCell[T, P /* <: IButtonGridCellProps[/* import warning: RewrittenClass.unapply cls was tparam T */ _] */] ()
  extends typings.officeUiFabricReact.buttonGridCellMod.ButtonGridCell[T, P]
object GridCell {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "GridCell")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "GridCell.defaultProps")
  @js.native
  def defaultProps: Disabled = js.native
  @scala.inline
  def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
