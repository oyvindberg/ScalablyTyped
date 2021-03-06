package typings.photonui.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object photonui {
  
  // Methods
  @scala.inline
  def domInsert(widget: typings.photonui.photonui.Widget): scala.Unit = typings.photonui.global.photonui.^.asInstanceOf[js.Dynamic].applyDynamic("domInsert")(widget.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def domInsert(widget: typings.photonui.photonui.Widget, element: java.lang.String): scala.Unit = (typings.photonui.global.photonui.^.asInstanceOf[js.Dynamic].applyDynamic("domInsert")(widget.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def domInsert(widget: typings.photonui.photonui.Widget, element: typings.std.HTMLElement): scala.Unit = (typings.photonui.global.photonui.^.asInstanceOf[js.Dynamic].applyDynamic("domInsert")(widget.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def getWidget(name: java.lang.String): typings.photonui.photonui.Widget = typings.photonui.global.photonui.^.asInstanceOf[js.Dynamic].applyDynamic("getWidget")(name.asInstanceOf[js.Any]).asInstanceOf[typings.photonui.photonui.Widget]
}
