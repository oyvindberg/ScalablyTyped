package typings.materialSelect

import typings.materialBase.componentMod.MDCComponent
import typings.materialSelect.helperTextFoundationMod.MDCSelectHelperTextFoundation
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperTextComponentMod {
  
  @JSImport("@material/select/helper-text/component", "MDCSelectHelperText")
  @js.native
  class MDCSelectHelperText protected () extends MDCComponent[MDCSelectHelperTextFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCSelectHelperTextFoundation, args: js.Any*) = this()
    
    def foundationForSelect: MDCSelectHelperTextFoundation = js.native
  }
  /* static members */
  object MDCSelectHelperText {
    
    @JSImport("@material/select/helper-text/component", "MDCSelectHelperText.attachTo")
    @js.native
    def attachTo(root: Element): MDCSelectHelperText = js.native
  }
  
  type MDCSelectHelperTextFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCSelectHelperTextFoundation], 
    MDCSelectHelperText
  ]
}
