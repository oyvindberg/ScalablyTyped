package typings.officeUiFabricReact.mod

import typings.officeUiFabricReact.detailsListBaseMod.IDetailsListState
import typings.officeUiFabricReact.detailsListTypesMod.IDetailsListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "DetailsListBase")
@js.native
class DetailsListBase protected ()
  extends typings.officeUiFabricReact.libDetailsListMod.DetailsListBase {
  def this(props: IDetailsListProps) = this()
}
/* static members */
object DetailsListBase {
  
  @JSImport("office-ui-fabric-react", "DetailsListBase")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react", "DetailsListBase.defaultProps")
  @js.native
  def defaultProps: typings.officeUiFabricReact.anon.CheckboxVisibility = js.native
  @scala.inline
  def defaultProps_=(x: typings.officeUiFabricReact.anon.CheckboxVisibility): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("office-ui-fabric-react", "DetailsListBase.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps(nextProps: IDetailsListProps, previousState: IDetailsListState): IDetailsListState = js.native
}
