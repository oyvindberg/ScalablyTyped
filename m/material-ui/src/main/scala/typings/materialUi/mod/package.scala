package typings.materialUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def makeSelectable[P /* <: js.Object */](component: typings.react.mod.ComponentClass[P, typings.react.mod.ComponentState]): typings.react.mod.ComponentClass[
    (typings.std.Omit[P, typings.materialUi.materialUiStrings.onChange]) with typings.materialUi.MaterialUI.List.SelectableProps, 
    typings.react.mod.ComponentState
  ] = typings.materialUi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("makeSelectable")(component.asInstanceOf[js.Any]).asInstanceOf[typings.react.mod.ComponentClass[
    (typings.std.Omit[P, typings.materialUi.materialUiStrings.onChange]) with typings.materialUi.MaterialUI.List.SelectableProps, 
    typings.react.mod.ComponentState
  ]]
}
