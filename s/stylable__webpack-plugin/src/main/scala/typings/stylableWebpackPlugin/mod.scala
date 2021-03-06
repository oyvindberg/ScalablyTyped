package typings.stylableWebpackPlugin

import typings.std.Set
import typings.stylableWebpackPlugin.anon.LogicModule
import typings.stylableWebpackPlugin.anon.Module
import typings.stylableWebpackPlugin.anon.ShallowPartialStylableWeb
import typings.stylableWebpackPlugin.stylableModuleHelpersMod.MultiMap
import typings.stylableWebpackPlugin.typesMod.CalcResult
import typings.stylableWebpackPlugin.typesMod.StylableModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/webpack-plugin", "StylableWebpackPlugin")
  @js.native
  class StylableWebpackPlugin ()
    extends typings.stylableWebpackPlugin.stylableWebpackPluginMod.StylableWebpackPlugin {
    def this(options: ShallowPartialStylableWeb) = this()
  }
  
  @JSImport("@stylable/webpack-plugin", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule): CalcResult = js.native
  @JSImport("@stylable/webpack-plugin", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: js.UndefOr[scala.Nothing],
    path: js.UndefOr[scala.Nothing],
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = js.native
  @JSImport("@stylable/webpack-plugin", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule, cssDependencies: js.UndefOr[scala.Nothing], path: js.Array[StylableModule]): CalcResult = js.native
  @JSImport("@stylable/webpack-plugin", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: js.UndefOr[scala.Nothing],
    path: js.Array[StylableModule],
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = js.native
  @JSImport("@stylable/webpack-plugin", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule, cssDependencies: js.Array[StylableModule]): CalcResult = js.native
  @JSImport("@stylable/webpack-plugin", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: js.Array[StylableModule],
    path: js.UndefOr[scala.Nothing],
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = js.native
  @JSImport("@stylable/webpack-plugin", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(module: StylableModule, cssDependencies: js.Array[StylableModule], path: js.Array[StylableModule]): CalcResult = js.native
  @JSImport("@stylable/webpack-plugin", "calculateModuleDepthAndShallowStylableDependencies")
  @js.native
  def calculateModuleDepthAndShallowStylableDependencies(
    module: StylableModule,
    cssDependencies: js.Array[StylableModule],
    path: js.Array[StylableModule],
    cache: MultiMap[StylableModule, CalcResult]
  ): CalcResult = js.native
  
  @JSImport("@stylable/webpack-plugin", "findStylableComponents")
  @js.native
  def findStylableComponents(stylableModules: js.Array[StylableModule]): js.Array[LogicModule] = js.native
  
  @JSImport("@stylable/webpack-plugin", "getCSSComponentLogicModule")
  @js.native
  def getCSSComponentLogicModule(stylableModule: StylableModule): StylableModule = js.native
  
  @JSImport("@stylable/webpack-plugin", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(m: StylableModule): Set[StylableModule] = js.native
  @JSImport("@stylable/webpack-plugin", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(
    m: StylableModule,
    onlyUsed: js.UndefOr[scala.Nothing],
    deps: js.UndefOr[scala.Nothing],
    origin: StylableModule
  ): Set[StylableModule] = js.native
  @JSImport("@stylable/webpack-plugin", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: js.UndefOr[scala.Nothing], deps: Set[StylableModule]): Set[StylableModule] = js.native
  @JSImport("@stylable/webpack-plugin", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(
    m: StylableModule,
    onlyUsed: js.UndefOr[scala.Nothing],
    deps: Set[StylableModule],
    origin: StylableModule
  ): Set[StylableModule] = js.native
  @JSImport("@stylable/webpack-plugin", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean): Set[StylableModule] = js.native
  @JSImport("@stylable/webpack-plugin", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean, deps: js.UndefOr[scala.Nothing], origin: StylableModule): Set[StylableModule] = js.native
  @JSImport("@stylable/webpack-plugin", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean, deps: Set[StylableModule]): Set[StylableModule] = js.native
  @JSImport("@stylable/webpack-plugin", "getDeepCSSDependencies")
  @js.native
  def getDeepCSSDependencies(m: StylableModule, onlyUsed: Boolean, deps: Set[StylableModule], origin: StylableModule): Set[StylableModule] = js.native
  
  @JSImport("@stylable/webpack-plugin", "getStylableModulesFromCompilation")
  @js.native
  def getStylableModulesFromCompilation(
    compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.compilation.Compilation */ js.Any
  ): js.Array[StylableModule] = js.native
  
  @JSImport("@stylable/webpack-plugin", "getStylableModulesFromDependencies")
  @js.native
  def getStylableModulesFromDependencies(dependencies: js.Array[Module]): js.Array[StylableModule] = js.native
  
  @JSImport("@stylable/webpack-plugin", "renderStaticCSS")
  @js.native
  def renderStaticCSS(modules: js.Any, mainTemplate: js.Any, hash: js.Any): js.Array[String] = js.native
  @JSImport("@stylable/webpack-plugin", "renderStaticCSS")
  @js.native
  def renderStaticCSS(
    modules: js.Any,
    mainTemplate: js.Any,
    hash: js.Any,
    filter: js.Function1[/* item */ js.Any, Boolean]
  ): js.Array[String] = js.native
  
  @JSImport("@stylable/webpack-plugin", "sortedStylableModulesByDepth")
  @js.native
  def sortedStylableModulesByDepth(modules: js.Array[StylableModule]): js.Array[StylableModule] = js.native
}
