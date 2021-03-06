package typings.uirouterAngularjs.mod

import typings.uirouterCore.commonCommonMod.IInjectable
import typings.uirouterCore.urlInterfaceMod.UrlRuleHandlerFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "UrlRouterProvider")
@js.native
class UrlRouterProvider protected ()
  extends typings.uirouterAngularjs.urlRouterProviderMod.UrlRouterProvider {
  /** @hidden */
  def this(/** @hidden */ router: typings.uirouterCore.mod.UIRouter) = this()
}
/* static members */
object UrlRouterProvider {
  
  @JSImport("@uirouter/angularjs", "UrlRouterProvider.injectableHandler")
  @js.native
  def injectableHandler(router: typings.uirouterCore.mod.UIRouter, handler: IInjectable): UrlRuleHandlerFn = js.native
}
