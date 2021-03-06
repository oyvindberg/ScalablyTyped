package typings.angularPlatformBrowserDynamic

import typings.angularCompiler.mod.CompileMetadataResolver
import typings.angularCompiler.mod.CompileReflector
import typings.angularCompiler.mod.CompilerConfig
import typings.angularCompiler.mod.JitEvaluator
import typings.angularCompiler.mod.NgModuleCompiler
import typings.angularCompiler.mod.ResourceLoader
import typings.angularCompiler.mod.StyleCompiler
import typings.angularCompiler.mod.SummaryResolver
import typings.angularCompiler.mod.TemplateParser
import typings.angularCompiler.mod.ViewCompiler
import typings.angularCore.mod.Compiler
import typings.angularCore.mod.CompilerFactory
import typings.angularCore.mod.ComponentFactory
import typings.angularCore.mod.Injector
import typings.angularCore.mod.PlatformRef
import typings.angularCore.mod.Provider
import typings.angularCore.mod.StaticProvider
import typings.angularCore.mod.Type
import typings.angularCore.mod.Version
import typings.angularCore.mod.ɵConsole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular/platform-browser-dynamic", "JitCompilerFactory")
  @js.native
  class JitCompilerFactory () extends CompilerFactory {
    
    var _defaultOptions: js.Any = js.native
  }
  
  @JSImport("@angular/platform-browser-dynamic", "RESOURCE_CACHE_PROVIDER")
  @js.native
  val RESOURCE_CACHE_PROVIDER: js.Array[Provider] = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "platformBrowserDynamic")
  @js.native
  def platformBrowserDynamic(): PlatformRef = js.native
  @JSImport("@angular/platform-browser-dynamic", "platformBrowserDynamic")
  @js.native
  def platformBrowserDynamic(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275COMPILER_PROVIDERS__POST_R3__")
  @js.native
  val ɵCOMPILERPROVIDERSPOSTR3: js.Array[StaticProvider] = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275CompilerImpl")
  @js.native
  class ɵCompilerImpl protected () extends Compiler {
    def this(
      injector: Injector,
      _metadataResolver: CompileMetadataResolver,
      templateParser: TemplateParser,
      styleCompiler: StyleCompiler,
      viewCompiler: ViewCompiler,
      ngModuleCompiler: NgModuleCompiler,
      summaryResolver: SummaryResolver[Type[_]],
      compileReflector: CompileReflector,
      jitEvaluator: JitEvaluator,
      compilerConfig: CompilerConfig,
      console: ɵConsole
    ) = this()
    
    var _delegate: js.Any = js.native
    
    var _metadataResolver: js.Any = js.native
    
    def getComponentFactory[T](component: Type[T]): ComponentFactory[T] = js.native
    
    var getExtraNgModuleProviders: js.Any = js.native
    
    def hasAotSummary(ref: Type[_]): Boolean = js.native
    
    val injector: Injector = js.native
    
    def loadAotSummaries(summaries: js.Function0[js.Array[_]]): Unit = js.native
  }
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275INTERNAL_BROWSER_DYNAMIC_PLATFORM_PROVIDERS")
  @js.native
  val ɵINTERNALBROWSERDYNAMICPLATFORMPROVIDERS: js.Array[StaticProvider] = js.native
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275ResourceLoaderImpl")
  @js.native
  class ɵResourceLoaderImpl () extends ResourceLoader
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275angular_packages_platform_browser_dynamic_platform_browser_dynamic_a")
  @js.native
  class ɵangularPackagesPlatformBrowserDynamicPlatformBrowserDynamicA () extends ResourceLoader {
    
    var _cache: js.Any = js.native
  }
  
  @JSImport("@angular/platform-browser-dynamic", "\u0275platformCoreDynamic")
  @js.native
  def ɵplatformCoreDynamic(): PlatformRef = js.native
  @JSImport("@angular/platform-browser-dynamic", "\u0275platformCoreDynamic")
  @js.native
  def ɵplatformCoreDynamic(extraProviders: js.Array[StaticProvider]): PlatformRef = js.native
}
