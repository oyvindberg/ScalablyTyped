package typings.ionicAngular.proxiesMod

import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.EventEmitter
import typings.angularCore.mod.NgZone
import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/proxies", "IonDatetime")
@js.native
class IonDatetime protected ()
  extends typings.ionicCore.componentsMod.Components.IonDatetime {
  def this(c: ChangeDetectorRef, r: ElementRef[_], z: NgZone) = this()
  
  var el: HTMLElement = js.native
  
  var ionBlur: EventEmitter[CustomEvent[_]] = js.native
  
  var ionCancel: EventEmitter[CustomEvent[_]] = js.native
  
  var ionChange: EventEmitter[CustomEvent[_]] = js.native
  
  var ionFocus: EventEmitter[CustomEvent[_]] = js.native
  
  var z: NgZone = js.native
}
