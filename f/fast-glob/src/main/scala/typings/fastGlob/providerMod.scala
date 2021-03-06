package typings.fastGlob

import typings.fastGlob.tasksMod.Task
import typings.fastGlob.typesMod.MicromatchOptions
import typings.fastGlob.typesMod.ReaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("fast-glob/out/providers/provider", JSImport.Default)
  @js.native
  abstract class default[T] protected () extends Provider[T] {
    def this(_settings: typings.fastGlob.settingsMod.default) = this()
  }
  
  @js.native
  trait Provider[T] extends StObject {
    
    /* protected */ def _getMicromatchOptions(): MicromatchOptions = js.native
    
    /* protected */ def _getReaderOptions(task: Task): ReaderOptions = js.native
    
    /* protected */ def _getRootDirectory(task: Task): String = js.native
    
    val _settings: typings.fastGlob.settingsMod.default = js.native
    
    val deepFilter: typings.fastGlob.deepMod.default = js.native
    
    val entryFilter: typings.fastGlob.entryMod.default = js.native
    
    val entryTransformer: typings.fastGlob.transformersEntryMod.default = js.native
    
    val errorFilter: typings.fastGlob.errorMod.default = js.native
    
    def read(_task: Task): T = js.native
  }
  object Provider {
    
    @scala.inline
    def apply[T](
      _getMicromatchOptions: () => MicromatchOptions,
      _getReaderOptions: Task => ReaderOptions,
      _getRootDirectory: Task => String,
      _settings: typings.fastGlob.settingsMod.default,
      deepFilter: typings.fastGlob.deepMod.default,
      entryFilter: typings.fastGlob.entryMod.default,
      entryTransformer: typings.fastGlob.transformersEntryMod.default,
      errorFilter: typings.fastGlob.errorMod.default,
      read: Task => T
    ): Provider[T] = {
      val __obj = js.Dynamic.literal(_getMicromatchOptions = js.Any.fromFunction0(_getMicromatchOptions), _getReaderOptions = js.Any.fromFunction1(_getReaderOptions), _getRootDirectory = js.Any.fromFunction1(_getRootDirectory), _settings = _settings.asInstanceOf[js.Any], deepFilter = deepFilter.asInstanceOf[js.Any], entryFilter = entryFilter.asInstanceOf[js.Any], entryTransformer = entryTransformer.asInstanceOf[js.Any], errorFilter = errorFilter.asInstanceOf[js.Any], read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[Provider[T]]
    }
    
    @scala.inline
    implicit class ProviderMutableBuilder[Self <: Provider[_], T] (val x: Self with Provider[T]) extends AnyVal {
      
      @scala.inline
      def setDeepFilter(value: typings.fastGlob.deepMod.default): Self = StObject.set(x, "deepFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryFilter(value: typings.fastGlob.entryMod.default): Self = StObject.set(x, "entryFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryTransformer(value: typings.fastGlob.transformersEntryMod.default): Self = StObject.set(x, "entryTransformer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorFilter(value: typings.fastGlob.errorMod.default): Self = StObject.set(x, "errorFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRead(value: Task => T): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_getMicromatchOptions(value: () => MicromatchOptions): Self = StObject.set(x, "_getMicromatchOptions", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_getReaderOptions(value: Task => ReaderOptions): Self = StObject.set(x, "_getReaderOptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_getRootDirectory(value: Task => String): Self = StObject.set(x, "_getRootDirectory", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_settings(value: typings.fastGlob.settingsMod.default): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
