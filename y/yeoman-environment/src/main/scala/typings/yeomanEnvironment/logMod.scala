package typings.yeomanEnvironment

import org.scalablytyped.runtime.TopLevel
import typings.node.eventsMod.EventEmitter
import typings.node.ttyMod.WriteStream
import typings.std.Console
import typings.yeomanEnvironment.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  /**
    * Creates a new `Logger` instance with the specified `options`.
    *
    * @param options
    * The options for creating the new logger.
    */
  @JSImport("yeoman-environment/lib/util/log", JSImport.Namespace)
  @js.native
  def apply[TCategories /* <: String | Double | js.Symbol */](options: LoggerOptions[TCategories]): Logger[TCategories] = js.native
  
  /**
    * Provides a set of colors.
    */
  type ColorMap[TKeys /* <: String | Double | js.Symbol */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in TKeys ]: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Color * / any | / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Modifiers * / any}
    */ typings.yeomanEnvironment.yeomanEnvironmentStrings.ColorMap with TopLevel[js.Any]
  
  /**
    * Provides default color-categories.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.skip
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.force
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.create
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.invoke
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.conflict
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.identical
    - typings.yeomanEnvironment.yeomanEnvironmentStrings.info
  */
  trait DefaultCategories extends StObject
  object DefaultCategories {
    
    @scala.inline
    def conflict: typings.yeomanEnvironment.yeomanEnvironmentStrings.conflict = "conflict".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.conflict]
    
    @scala.inline
    def create: typings.yeomanEnvironment.yeomanEnvironmentStrings.create = "create".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.create]
    
    @scala.inline
    def force: typings.yeomanEnvironment.yeomanEnvironmentStrings.force = "force".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.force]
    
    @scala.inline
    def identical: typings.yeomanEnvironment.yeomanEnvironmentStrings.identical = "identical".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.identical]
    
    @scala.inline
    def info: typings.yeomanEnvironment.yeomanEnvironmentStrings.info = "info".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.info]
    
    @scala.inline
    def invoke: typings.yeomanEnvironment.yeomanEnvironmentStrings.invoke = "invoke".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.invoke]
    
    @scala.inline
    def skip: typings.yeomanEnvironment.yeomanEnvironmentStrings.skip = "skip".asInstanceOf[typings.yeomanEnvironment.yeomanEnvironmentStrings.skip]
  }
  
  /**
    * Provides the functionality to log messages.
    */
  type Logger[TCategories /* <: String | Double | js.Symbol */] = EventEmitter with typings.yeomanEnvironment.yeomanEnvironmentStrings.Logger with TopLevel[js.Any] with Call
  
  /**
    * Provides options for creating a logger.
    */
  @js.native
  trait LoggerOptions[TCategories /* <: String | Double | js.Symbol */] extends StObject {
    
    /**
      * A set of categories and assigned `chalk`-formats.
      */
    var colors: js.UndefOr[ColorMap[TCategories]] = js.native
    
    /**
      * The console to write log-messages to.
      */
    var console: js.UndefOr[Console] = js.native
    
    /**
      * The stream to write other messages to.
      */
    var stderr: js.UndefOr[WriteStream] = js.native
    
    /**
      * The stream to write other messages to.
      */
    var stdout: js.UndefOr[WriteStream] = js.native
  }
  object LoggerOptions {
    
    @scala.inline
    def apply[TCategories /* <: String | Double | js.Symbol */](): LoggerOptions[TCategories] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions[TCategories]]
    }
    
    @scala.inline
    implicit class LoggerOptionsMutableBuilder[Self <: LoggerOptions[_], TCategories /* <: String | Double | js.Symbol */] (val x: Self with LoggerOptions[TCategories]) extends AnyVal {
      
      @scala.inline
      def setColors(value: ColorMap[TCategories]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      @scala.inline
      def setStderr(value: WriteStream): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      @scala.inline
      def setStdout(value: WriteStream): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
}
