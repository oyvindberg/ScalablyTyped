package typings.uirouterCore

import typings.std.RegExp
import typings.uirouterCore.paramMod.Param
import typings.uirouterCore.paramTypesMod.ParamTypes
import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.urlInterfaceMod.UrlMatcherCompileConfig
import typings.uirouterCore.urlInterfaceMod.UrlRuleHandlerFn
import typings.uirouterCore.urlInterfaceMod.UrlRuleMatchFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUrlMod {
  
  @JSImport("@uirouter/core/lib/url", "BaseUrlRule")
  @js.native
  class BaseUrlRule protected ()
    extends typings.uirouterCore.urlRuleMod.BaseUrlRule {
    def this(`match`: UrlRuleMatchFn) = this()
    def this(`match`: UrlRuleMatchFn, handler: UrlRuleHandlerFn) = this()
  }
  
  @JSImport("@uirouter/core/lib/url", "ParamFactory")
  @js.native
  class ParamFactory protected ()
    extends typings.uirouterCore.urlMatcherFactoryMod.ParamFactory {
    def this(router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/url", "UrlConfig")
  @js.native
  class UrlConfig protected ()
    extends typings.uirouterCore.urlConfigMod.UrlConfig {
    /** @internal */ def this(/** @internal */ router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/url", "UrlMatcher")
  @js.native
  class UrlMatcher protected ()
    extends typings.uirouterCore.urlMatcherMod.UrlMatcher {
    /**
      * @param pattern The pattern to compile into a matcher.
      * @param paramTypes The [[ParamTypes]] registry
      * @param paramFactory A [[ParamFactory]] object
      * @param config  A [[UrlMatcherCompileConfig]] configuration object
      */
    def this(
      pattern: String,
      paramTypes: ParamTypes,
      paramFactory: typings.uirouterCore.urlMatcherFactoryMod.ParamFactory
    ) = this()
    def this(
      pattern: String,
      paramTypes: ParamTypes,
      paramFactory: typings.uirouterCore.urlMatcherFactoryMod.ParamFactory,
      config: UrlMatcherCompileConfig
    ) = this()
  }
  /* static members */
  object UrlMatcher {
    
    @JSImport("@uirouter/core/lib/url", "UrlMatcher")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Compare two UrlMatchers
      *
      * This comparison function converts a UrlMatcher into static and dynamic path segments.
      * Each static path segment is a static string between a path separator (slash character).
      * Each dynamic segment is a path parameter.
      *
      * The comparison function sorts static segments before dynamic ones.
      */
    @JSImport("@uirouter/core/lib/url", "UrlMatcher.compare")
    @js.native
    def compare(a: typings.uirouterCore.urlMatcherMod.UrlMatcher, b: typings.uirouterCore.urlMatcherMod.UrlMatcher): Double = js.native
    
    /** @internal */
    @JSImport("@uirouter/core/lib/url", "UrlMatcher.encodeDashes")
    @js.native
    def encodeDashes(str: String): String = js.native
    
    /** @internal */
    @JSImport("@uirouter/core/lib/url", "UrlMatcher.nameValidator")
    @js.native
    def nameValidator: RegExp = js.native
    @scala.inline
    def nameValidator_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nameValidator")(x.asInstanceOf[js.Any])
    
    /** @internal Given a matcher, return an array with the matcher's path segments and path params, in order */
    @JSImport("@uirouter/core/lib/url", "UrlMatcher.pathSegmentsAndParams")
    @js.native
    def pathSegmentsAndParams(matcher: typings.uirouterCore.urlMatcherMod.UrlMatcher): js.Any = js.native
    
    /** @internal Given a matcher, return an array with the matcher's query params */
    @JSImport("@uirouter/core/lib/url", "UrlMatcher.queryParams")
    @js.native
    def queryParams(matcher: typings.uirouterCore.urlMatcherMod.UrlMatcher): js.Array[Param] = js.native
  }
  
  @JSImport("@uirouter/core/lib/url", "UrlMatcherFactory")
  @js.native
  class UrlMatcherFactory protected ()
    extends typings.uirouterCore.urlMatcherFactoryMod.UrlMatcherFactory {
    def this(/** @internal */ router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/url", "UrlRouter")
  @js.native
  class UrlRouter protected ()
    extends typings.uirouterCore.urlRouterMod.UrlRouter {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/url", "UrlRuleFactory")
  @js.native
  class UrlRuleFactory protected ()
    extends typings.uirouterCore.urlRuleMod.UrlRuleFactory {
    def this(router: UIRouter) = this()
  }
  /* static members */
  object UrlRuleFactory {
    
    @JSImport("@uirouter/core/lib/url", "UrlRuleFactory.isUrlRule")
    @js.native
    def isUrlRule(obj: js.Any): Boolean = js.native
  }
  
  @JSImport("@uirouter/core/lib/url", "UrlRules")
  @js.native
  class UrlRules protected ()
    extends typings.uirouterCore.urlRulesMod.UrlRules {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/url", "UrlService")
  @js.native
  class UrlService protected ()
    extends typings.uirouterCore.urlServiceMod.UrlService {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
  }
}
