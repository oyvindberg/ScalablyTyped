package typings.materialComponentsWeb.mod

import typings.materialFloatingLabel.anon.PartialMDCFloatingLabelAd
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingLabel {
  
  @JSImport("material-components-web", "floatingLabel.MDCFloatingLabel")
  @js.native
  class MDCFloatingLabel protected ()
    extends typings.materialFloatingLabel.mod.MDCFloatingLabel {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(
      root: Element,
      foundation: typings.materialFloatingLabel.foundationMod.MDCFloatingLabelFoundation,
      args: js.Any*
    ) = this()
  }
  /* static members */
  object MDCFloatingLabel {
    
    @JSImport("material-components-web", "floatingLabel.MDCFloatingLabel.attachTo")
    @js.native
    def attachTo(root: Element): typings.materialFloatingLabel.componentMod.MDCFloatingLabel = js.native
  }
  
  @JSImport("material-components-web", "floatingLabel.MDCFloatingLabelFoundation")
  @js.native
  class MDCFloatingLabelFoundation ()
    extends typings.materialFloatingLabel.mod.MDCFloatingLabelFoundation {
    def this(adapter: PartialMDCFloatingLabelAd) = this()
  }
  
  object cssClasses {
    
    @JSImport("material-components-web", "floatingLabel.cssClasses")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("material-components-web", "floatingLabel.cssClasses.LABEL_FLOAT_ABOVE")
    @js.native
    def LABEL_FLOAT_ABOVE: String = js.native
    @scala.inline
    def LABEL_FLOAT_ABOVE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_FLOAT_ABOVE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "floatingLabel.cssClasses.LABEL_REQUIRED")
    @js.native
    def LABEL_REQUIRED: String = js.native
    @scala.inline
    def LABEL_REQUIRED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_REQUIRED")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "floatingLabel.cssClasses.LABEL_SHAKE")
    @js.native
    def LABEL_SHAKE: String = js.native
    @scala.inline
    def LABEL_SHAKE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LABEL_SHAKE")(x.asInstanceOf[js.Any])
    
    @JSImport("material-components-web", "floatingLabel.cssClasses.ROOT")
    @js.native
    def ROOT: String = js.native
    @scala.inline
    def ROOT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ROOT")(x.asInstanceOf[js.Any])
  }
}
