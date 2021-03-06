package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersistenState extends Base {
  
  def loadValue(key: String, saveTo: js.Object): Unit = js.native
  
  def resetValue(key: String): Unit = js.native
  
  def saveValue(key: String, value: js.Any): Unit = js.native
  
  var storage: Storage = js.native
}
object PersistenState {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    loadValue: (String, js.Object) => Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    resetValue: String => Unit,
    saveValue: (String, js.Any) => Unit,
    storage: Storage,
    updatePlugin: () => Unit
  ): PersistenState = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], loadValue = js.Any.fromFunction2(loadValue), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), resetValue = js.Any.fromFunction1(resetValue), saveValue = js.Any.fromFunction2(saveValue), storage = storage.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[PersistenState]
  }
  
  @scala.inline
  implicit class PersistenStateMutableBuilder[Self <: PersistenState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadValue(value: (String, js.Object) => Unit): Self = StObject.set(x, "loadValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResetValue(value: String => Unit): Self = StObject.set(x, "resetValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSaveValue(value: (String, js.Any) => Unit): Self = StObject.set(x, "saveValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStorage(value: Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
  }
}
