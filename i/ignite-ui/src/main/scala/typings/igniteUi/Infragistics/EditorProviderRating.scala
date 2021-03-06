package typings.igniteUi.Infragistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorProviderRating extends StObject {
  
  def attachErrorEvents(errorShowing: js.Object, errorShown: js.Object, errorHidden: js.Object): Unit = js.native
  
  def createEditor(
    callbacks: js.Object,
    key: js.Object,
    editorOptions: js.Object,
    tabIndex: js.Object,
    format: js.Object,
    element: js.Object
  ): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def getEditor(): Unit = js.native
  
  def getValue(): Unit = js.native
  
  def internalValueChange(evt: js.Object, ui: js.Object): Unit = js.native
  
  def isValid(): Unit = js.native
  
  def keyDown(evt: js.Object, ui: js.Object): Unit = js.native
  
  def refreshValue(): Unit = js.native
  
  def removeFromParent(): Unit = js.native
  
  def requestValidate(evt: js.Object): Unit = js.native
  
  def setFocus(): Unit = js.native
  
  def setSize(width: js.Object, height: js.Object): Unit = js.native
  
  def setValue(`val`: js.Object): Unit = js.native
  
  def validate(): Unit = js.native
  
  def validator(): Unit = js.native
  
  def valueChange(evt: js.Object, ui: js.Object): Unit = js.native
}
object EditorProviderRating {
  
  @scala.inline
  def apply(
    attachErrorEvents: (js.Object, js.Object, js.Object) => Unit,
    createEditor: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit,
    destroy: () => Unit,
    getEditor: () => Unit,
    getValue: () => Unit,
    internalValueChange: (js.Object, js.Object) => Unit,
    isValid: () => Unit,
    keyDown: (js.Object, js.Object) => Unit,
    refreshValue: () => Unit,
    removeFromParent: () => Unit,
    requestValidate: js.Object => Unit,
    setFocus: () => Unit,
    setSize: (js.Object, js.Object) => Unit,
    setValue: js.Object => Unit,
    validate: () => Unit,
    validator: () => Unit,
    valueChange: (js.Object, js.Object) => Unit
  ): EditorProviderRating = {
    val __obj = js.Dynamic.literal(attachErrorEvents = js.Any.fromFunction3(attachErrorEvents), createEditor = js.Any.fromFunction6(createEditor), destroy = js.Any.fromFunction0(destroy), getEditor = js.Any.fromFunction0(getEditor), getValue = js.Any.fromFunction0(getValue), internalValueChange = js.Any.fromFunction2(internalValueChange), isValid = js.Any.fromFunction0(isValid), keyDown = js.Any.fromFunction2(keyDown), refreshValue = js.Any.fromFunction0(refreshValue), removeFromParent = js.Any.fromFunction0(removeFromParent), requestValidate = js.Any.fromFunction1(requestValidate), setFocus = js.Any.fromFunction0(setFocus), setSize = js.Any.fromFunction2(setSize), setValue = js.Any.fromFunction1(setValue), validate = js.Any.fromFunction0(validate), validator = js.Any.fromFunction0(validator), valueChange = js.Any.fromFunction2(valueChange))
    __obj.asInstanceOf[EditorProviderRating]
  }
  
  @scala.inline
  implicit class EditorProviderRatingMutableBuilder[Self <: EditorProviderRating] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachErrorEvents(value: (js.Object, js.Object, js.Object) => Unit): Self = StObject.set(x, "attachErrorEvents", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCreateEditor(value: (js.Object, js.Object, js.Object, js.Object, js.Object, js.Object) => Unit): Self = StObject.set(x, "createEditor", js.Any.fromFunction6(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEditor(value: () => Unit): Self = StObject.set(x, "getEditor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetValue(value: () => Unit): Self = StObject.set(x, "getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInternalValueChange(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "internalValueChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsValid(value: () => Unit): Self = StObject.set(x, "isValid", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeyDown(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "keyDown", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRefreshValue(value: () => Unit): Self = StObject.set(x, "refreshValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveFromParent(value: () => Unit): Self = StObject.set(x, "removeFromParent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestValidate(value: js.Object => Unit): Self = StObject.set(x, "requestValidate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetFocus(value: () => Unit): Self = StObject.set(x, "setFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSize(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetValue(value: js.Object => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidate(value: () => Unit): Self = StObject.set(x, "validate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValidator(value: () => Unit): Self = StObject.set(x, "validator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueChange(value: (js.Object, js.Object) => Unit): Self = StObject.set(x, "valueChange", js.Any.fromFunction2(value))
  }
}
