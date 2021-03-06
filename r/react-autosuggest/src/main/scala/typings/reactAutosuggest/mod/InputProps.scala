package typings.reactAutosuggest.mod

import typings.react.mod.FocusEvent
import typings.react.mod.FormEvent
import typings.react.mod.Ref
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.InputHTMLAttributes<any> ]: P} & {[ P in 'onChange' | 'onBlur' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.InputHTMLAttributes<any>] ]: react.react.InputHTMLAttributes<any>[P]} */ @js.native
trait InputProps[TSuggestion] extends StObject {
  
  var onBlur: js.UndefOr[
    js.Function2[/* event */ FocusEvent[_], /* params */ js.UndefOr[BlurEvent[TSuggestion]], Unit]
  ] = js.native
  
  def onChange(event: FormEvent[_], params: ChangeEvent): Unit = js.native
  
  var ref: js.UndefOr[Ref[HTMLInputElement]] = js.native
  
  var value: String = js.native
}
object InputProps {
  
  @scala.inline
  def apply[TSuggestion](onChange: (FormEvent[_], ChangeEvent) => Unit, value: String): InputProps[TSuggestion] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction2(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputProps[TSuggestion]]
  }
  
  @scala.inline
  implicit class InputPropsMutableBuilder[Self <: InputProps[_], TSuggestion] (val x: Self with InputProps[TSuggestion]) extends AnyVal {
    
    @scala.inline
    def setOnBlur(value: (/* event */ FocusEvent[_], /* params */ js.UndefOr[BlurEvent[TSuggestion]]) => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnChange(value: (FormEvent[_], ChangeEvent) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRef(value: Ref[HTMLInputElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefFunction1(value: /* instance */ HTMLInputElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRefNull: Self = StObject.set(x, "ref", null)
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
