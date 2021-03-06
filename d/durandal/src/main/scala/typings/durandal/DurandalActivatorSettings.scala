package typings.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurandalActivatorSettings extends StObject {
  
  /**
    * Lower-cased words which represent a truthy value.
    * @default ['yes', 'ok', 'true']
    */
  var affirmations: js.Array[String] = js.native
  
  /**
    * Called immediately after the old item is deactivated.
    * @param {object} oldItem The previous item.
    * @param {boolean} close Whether or not the previous item was closed.
    * @param {function} setter The activate item setter function.
    */
  def afterDeactivate(oldItem: js.Any, close: Boolean, setter: js.Function): Unit = js.native
  
  /**
    * Determines whether or not the current item and the new item are the same.
    * @param {object} currentItem
    * @param {object} newItem
    * @param {object} currentActivationData
    * @param {object} newActivationData
    * @returns {boolean}
    */
  def areSameItem(currentItem: js.Any, newItem: js.Any, currentActivationData: js.Any, newActivationData: js.Any): Boolean = js.native
  
  /**
    * Called immediately before the new item is activated.
    * @param {object} newItem
    */
  def beforeActivate(newItem: js.Any): js.Any = js.native
  
  /**
    * The default value passed to an object's deactivate function as its close parameter.
    * @default true
    */
  var closeOnDeactivate: Boolean = js.native
  
  /**
    * Interprets the response of a `canActivate` or `canDeactivate` call using the known affirmative values in the `affirmations` array.
    * @param {object} value
    * @returns {boolean}
    */
  def interpretResponse(value: js.Any): Boolean = js.native
}
object DurandalActivatorSettings {
  
  @scala.inline
  def apply(
    affirmations: js.Array[String],
    afterDeactivate: (js.Any, Boolean, js.Function) => Unit,
    areSameItem: (js.Any, js.Any, js.Any, js.Any) => Boolean,
    beforeActivate: js.Any => js.Any,
    closeOnDeactivate: Boolean,
    interpretResponse: js.Any => Boolean
  ): DurandalActivatorSettings = {
    val __obj = js.Dynamic.literal(affirmations = affirmations.asInstanceOf[js.Any], afterDeactivate = js.Any.fromFunction3(afterDeactivate), areSameItem = js.Any.fromFunction4(areSameItem), beforeActivate = js.Any.fromFunction1(beforeActivate), closeOnDeactivate = closeOnDeactivate.asInstanceOf[js.Any], interpretResponse = js.Any.fromFunction1(interpretResponse))
    __obj.asInstanceOf[DurandalActivatorSettings]
  }
  
  @scala.inline
  implicit class DurandalActivatorSettingsMutableBuilder[Self <: DurandalActivatorSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffirmations(value: js.Array[String]): Self = StObject.set(x, "affirmations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffirmationsVarargs(value: String*): Self = StObject.set(x, "affirmations", js.Array(value :_*))
    
    @scala.inline
    def setAfterDeactivate(value: (js.Any, Boolean, js.Function) => Unit): Self = StObject.set(x, "afterDeactivate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAreSameItem(value: (js.Any, js.Any, js.Any, js.Any) => Boolean): Self = StObject.set(x, "areSameItem", js.Any.fromFunction4(value))
    
    @scala.inline
    def setBeforeActivate(value: js.Any => js.Any): Self = StObject.set(x, "beforeActivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseOnDeactivate(value: Boolean): Self = StObject.set(x, "closeOnDeactivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpretResponse(value: js.Any => Boolean): Self = StObject.set(x, "interpretResponse", js.Any.fromFunction1(value))
  }
}
