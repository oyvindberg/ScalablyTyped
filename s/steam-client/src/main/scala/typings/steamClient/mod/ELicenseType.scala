package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ELicenseType extends StObject
@JSImport("steam-client", "ELicenseType")
@js.native
object ELicenseType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ELicenseType with Double] = js.native
  
  @js.native
  sealed trait LimitedUseDelayedActivation extends ELicenseType
  /* 7 */ val LimitedUseDelayedActivation: typings.steamClient.mod.ELicenseType.LimitedUseDelayedActivation with Double = js.native
  
  @js.native
  sealed trait NoLicense extends ELicenseType
  /* 0 */ val NoLicense: typings.steamClient.mod.ELicenseType.NoLicense with Double = js.native
  
  @js.native
  sealed trait RecurringCharge extends ELicenseType
  /* 3 */ val RecurringCharge: typings.steamClient.mod.ELicenseType.RecurringCharge with Double = js.native
  
  @js.native
  sealed trait RecurringChargeLimitedUse extends ELicenseType
  /* 4 */ val RecurringChargeLimitedUse: typings.steamClient.mod.ELicenseType.RecurringChargeLimitedUse with Double = js.native
  
  @js.native
  sealed trait RecurringChargeLimitedUseWithOverages extends ELicenseType
  /* 5 */ val RecurringChargeLimitedUseWithOverages: typings.steamClient.mod.ELicenseType.RecurringChargeLimitedUseWithOverages with Double = js.native
  
  @js.native
  sealed trait RecurringOption extends ELicenseType
  /* 6 */ val RecurringOption: typings.steamClient.mod.ELicenseType.RecurringOption with Double = js.native
  
  @js.native
  sealed trait SinglePurchase extends ELicenseType
  /* 1 */ val SinglePurchase: typings.steamClient.mod.ELicenseType.SinglePurchase with Double = js.native
  
  @js.native
  sealed trait SinglePurchaseLimitedUse extends ELicenseType
  /* 2 */ val SinglePurchaseLimitedUse: typings.steamClient.mod.ELicenseType.SinglePurchaseLimitedUse with Double = js.native
}
