package typings.reactMdAppBar

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdAppBar.appBarActionMod.AppBarActionProps
import typings.reactMdAppBar.appBarMod.AppBarProps
import typings.reactMdAppBar.appBarNavMod.AppBarNavProps
import typings.reactMdAppBar.appBarTitleMod.AppBarTitleProps
import typings.reactMdAppBar.useActionClassNameMod.AppBarActionClassNameProps
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLHeadingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/app-bar", "APP_BAR_OFFSET_CLASSNAME")
  @js.native
  val APP_BAR_OFFSET_CLASSNAME: /* "rmd-app-bar-offset" */ String = js.native
  
  @JSImport("@react-md/app-bar", "APP_BAR_OFFSET_DENSE_CLASSNAME")
  @js.native
  val APP_BAR_OFFSET_DENSE_CLASSNAME: /* "rmd-app-bar-offset--dense" */ String = js.native
  
  @JSImport("@react-md/app-bar", "APP_BAR_OFFSET_PROMINENT_CLASSNAME")
  @js.native
  val APP_BAR_OFFSET_PROMINENT_CLASSNAME: /* "rmd-app-bar-offset--prominent" */ String = js.native
  
  @JSImport("@react-md/app-bar", "APP_BAR_OFFSET_PROMINENT_DENSE_CLASSNAME")
  @js.native
  val APP_BAR_OFFSET_PROMINENT_DENSE_CLASSNAME: /* "rmd-app-bar-offset--prominent-dense" */ String = js.native
  
  @JSImport("@react-md/app-bar", "AppBar")
  @js.native
  val AppBar: ForwardRefExoticComponent[AppBarProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/app-bar", "AppBarAction")
  @js.native
  val AppBarAction: ForwardRefExoticComponent[AppBarActionProps with RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/app-bar", "AppBarNav")
  @js.native
  val AppBarNav: ForwardRefExoticComponent[AppBarNavProps with RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/app-bar", "AppBarTitle")
  @js.native
  val AppBarTitle: ForwardRefExoticComponent[AppBarTitleProps with RefAttributes[HTMLHeadingElement]] = js.native
  
  @JSImport("@react-md/app-bar", "useActionClassName")
  @js.native
  def useActionClassName(): String = js.native
  @JSImport("@react-md/app-bar", "useActionClassName")
  @js.native
  def useActionClassName(hasFirstLastInheritColorClassName: AppBarActionClassNameProps): String = js.native
}
