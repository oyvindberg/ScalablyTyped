package typings.bardjs

import typings.chai.Chai.AssertionError
import typings.mocha.Mocha.Context
import typings.mocha.Mocha.Runner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Module for bardjs functions
    */
  object bard {
    
    /**
      * Add names of globals to list of OK globals for this mocha spec
      * NB: Call this method ONLY if you're using mocha!
      * NB: Turn off browser-sync else mocha detects the browser-sync globals
      * like ` ___browserSync___`
      */
    @JSGlobal("bard.addGlobals")
    @js.native
    def addGlobals(globals: js.Any*): Unit = js.native
    
    /**
      * Prepare ngMocked application feature module
      * along with faked toastr, routehelper,
      * and faked router services.
      * Especially useful for controller testing
      * Use it as you would the ngMocks#module method
      *
      * DO NOT USE IF YOU NEED THE REAL ROUTER SERVICES!
      * Fall back to `angular.mock.module(...)` or just `module(...)`
      */
    @JSGlobal("bard.appModule")
    @js.native
    def appModule(fns: (String | js.Function | js.Object)*): js.Function0[Unit] = js.native
    
    /**
      * Assert a failure in mocha, without condition
      */
    @JSGlobal("bard.assertFail")
    @js.native
    def assertFail(message: String): AssertionError = js.native
    
    /**
      * Prepare ngMocked module definition that makes real $http and $q calls
      * Also adds fakeLogger to the end of the definition
      * Use it as you would the ngMocks#module method
      */
    @JSGlobal("bard.asyncModule")
    @js.native
    def asyncModule(fns: (String | js.Function | js.Object)*): js.Function0[Unit] = js.native
    
    /**
      * Get or set bard debugging flag
      */
    @JSGlobal("bard.debugging")
    @js.native
    def debugging(): Boolean = js.native
    @JSGlobal("bard.debugging")
    @js.native
    def debugging(newFlag: js.Any): Boolean = js.native
    
    /**
      * Registers a fake logger service that you can spy on
      */
    @JSGlobal("bard.fakeLogger")
    @js.native
    def fakeLogger(
      $provide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IProvideService */ js.Any
    ): Unit = js.native
    
    /**
      * Registers a fake route helper provider service that you can spy on
      */
    @JSGlobal("bard.fakeRouteHelperProvider")
    @js.native
    def fakeRouteHelperProvider(
      $provide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IProvideService */ js.Any
    ): Unit = js.native
    
    /**
      * Stub out the $routeProvider so we avoid
      * all routing calls, including the default route
      * which runs on every test otherwise.
      * Make sure this goes before the inject in the spec.
      */
    @JSGlobal("bard.fakeRouteProvider")
    @js.native
    def fakeRouteProvider(
      $provide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IProvideService */ js.Any
    ): Unit = js.native
    
    /**
      * Stub out the $stateProvider so we avoid
      * all routing calls, including the default state
      * which runs on every test otherwise.
      * Make sure this goes before the inject in the spec.
      */
    @JSGlobal("bard.fakeStateProvider")
    @js.native
    def fakeStateProvider(
      $provide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IProvideService */ js.Any
    ): Unit = js.native
    
    /**
      * Registers a fake toastr service that you can spy on
      */
    @JSGlobal("bard.fakeToastr")
    @js.native
    def fakeToastr(
      $provide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IProvideService */ js.Any
    ): Unit = js.native
    
    /**
      *  Replaces the ngMock'ed $httpBackend with the real one from ng thus
      *  restoring the ability to issue AJAX calls to the backend with $http.
      *
      *  Note that $q remains ngMocked so you must flush $http calls ($rootScope.$digest).
      *  Use $rootScope.$apply() for this purpose.
      *
      *  Could restore $q with $qReal in which case don't need to flush.
      */
    @JSGlobal("bard.$httpBackend")
    @js.native
    def httpBackend(
      $provide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IProvideService */ js.Any
    ): js.Any = js.native
    
    @JSGlobal("bard.inject")
    @js.native
    def inject(context: js.UndefOr[scala.Nothing], args: String*): Unit = js.native
    /**
      * Inject selected services into the windows object during test
      * then remove them when test ends with an `afterEach`.
      *
      * spares us the repetition of creating common service vars and injecting them
      *
      * Option: the first argument may be the mocha spec context object (`this`)
      *         It MUST be `this` if you what to check for mocha global leaks.
      *         Do NOT supply `this` as the first arg if you're not running mocha specs.
      *
      * remaining inject arguments may take one of 3 forms :
      *
      *    function    - This fn will be passed to ngMocks.inject.
      *                  Annotations extracted after inject does its thing.
      *    [strings]   - same string array you'd use to set fn.$inject
      *    (...string) - string arguments turned into a string array
      */
    @JSGlobal("bard.inject")
    @js.native
    def inject(context: js.Function, args: String*): Unit = js.native
    @JSGlobal("bard.inject")
    @js.native
    def inject(context: Context, args: String*): Unit = js.native
    
    /**
      * Write to console if bard debugging flag is on
      */
    @JSGlobal("bard.log")
    @js.native
    def log(message: js.Any): Unit = js.native
    
    /**
      *  Listen to mocha test runner events
      *  Usage in browser:
      *     var runner = mocha.run();
      *     bard.mochaRunnerListener(runner);
      */
    @JSGlobal("bard.mochaRunnerListener")
    @js.native
    def mochaRunnerListener(runner: Runner): Unit = js.native
    
    /**
      * Mocks out a service with sinon stubbed functions
      * that return the values specified in the config
      *
      * If the config value is `undefined`,
      * stub the service method with a dummy that doesn't return a value
      *
      * If the config value is a function, set service property with it
      *
      * If a service member is a property, not a function,
      * set it with the config value
      * If a service member name is not a key in config,
      * follow the same logic as above to set its members
      * using the config._default value (which is `undefined` if omitted)
      *
      * If there is a config entry that is NOT a member of the service
      * add mocked function to the service using the config value
      */
    @JSGlobal("bard.mockService")
    @js.native
    def mockService(service: js.Any, config: js.Any): js.Any = js.native
    
    /**
      *  Replaces the ngMock'ed $q with the real one from ng thus
      *  obviating the need to flush $http and $q queues
      *  at the expense of ability to control $q timing.
      */
    @JSGlobal("bard.$q")
    @js.native
    def q(
      $provide: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.auto.IProvideService */ js.Any
    ): js.Any = js.native
    
    /**
      * Replaces the accented characters of many European languages w/ unaccented chars
      * Use it in JavaScript string sorts where such characters may be encountered
      * Matches the default string comparers of most databases.
      * Ex: replaceAccentChars(a.Name) < replaceAccentChars(b.Name)
      * instead of:            a.Name  <                    b.Name
      */
    @JSGlobal("bard.replaceAccentChars")
    @js.native
    def replaceAccentChars(text: String): String = js.native
    
    /**
      *  Assert that there are no outstanding HTTP requests after test is complete
      *  For use with ngMocks; doesn't work for async server integration tests
      */
    @JSGlobal("bard.verifyNoOutstandingHttpRequests")
    @js.native
    def verifyNoOutstandingHttpRequests(): Unit = js.native
    
    /**
      * Returns a function that execute a callback function
      * (typically a fn making asserts) within a try/catch
      * The try/catch then calls the ambient "done" function
      * in the appropriate way for both success and failure
      */
    @JSGlobal("bard.wrapWithDone")
    @js.native
    def wrapWithDone(callback: js.Function, done: js.Function): js.Function = js.native
  }
}
