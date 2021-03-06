package typings.vsoNodeApi.dashboardInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TeamDashboardPermission extends StObject
@JSImport("vso-node-api/interfaces/DashboardInterfaces", "TeamDashboardPermission")
@js.native
object TeamDashboardPermission extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TeamDashboardPermission with Double] = js.native
  
  @js.native
  sealed trait Create extends TeamDashboardPermission
  /* 2 */ val Create: typings.vsoNodeApi.dashboardInterfacesMod.TeamDashboardPermission.Create with Double = js.native
  
  @js.native
  sealed trait Delete extends TeamDashboardPermission
  /* 8 */ val Delete: typings.vsoNodeApi.dashboardInterfacesMod.TeamDashboardPermission.Delete with Double = js.native
  
  @js.native
  sealed trait Edit extends TeamDashboardPermission
  /* 4 */ val Edit: typings.vsoNodeApi.dashboardInterfacesMod.TeamDashboardPermission.Edit with Double = js.native
  
  @js.native
  sealed trait ManagePermissions extends TeamDashboardPermission
  /* 16 */ val ManagePermissions: typings.vsoNodeApi.dashboardInterfacesMod.TeamDashboardPermission.ManagePermissions with Double = js.native
  
  @js.native
  sealed trait None extends TeamDashboardPermission
  /* 0 */ val None: typings.vsoNodeApi.dashboardInterfacesMod.TeamDashboardPermission.None with Double = js.native
  
  @js.native
  sealed trait Read extends TeamDashboardPermission
  /* 1 */ val Read: typings.vsoNodeApi.dashboardInterfacesMod.TeamDashboardPermission.Read with Double = js.native
}
