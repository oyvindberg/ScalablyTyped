package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.anon.Tab
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonTabs extends StObject {
  
  /**
    * Emitted when the navigation has finished transitioning to a new component.
    */
  var onIonTabsDidChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Tab], Unit]] = js.native
  
  /**
    * Emitted when the navigation is about to transition to a new component.
    */
  var onIonTabsWillChange: js.UndefOr[js.Function1[/* event */ CustomEvent[Tab], Unit]] = js.native
}
object IonTabs {
  
  @scala.inline
  def apply(): IonTabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonTabs]
  }
  
  @scala.inline
  implicit class IonTabsMutableBuilder[Self <: IonTabs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnIonTabsDidChange(value: /* event */ CustomEvent[Tab] => Unit): Self = StObject.set(x, "onIonTabsDidChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonTabsDidChangeUndefined: Self = StObject.set(x, "onIonTabsDidChange", js.undefined)
    
    @scala.inline
    def setOnIonTabsWillChange(value: /* event */ CustomEvent[Tab] => Unit): Self = StObject.set(x, "onIonTabsWillChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnIonTabsWillChangeUndefined: Self = StObject.set(x, "onIonTabsWillChange", js.undefined)
  }
}
