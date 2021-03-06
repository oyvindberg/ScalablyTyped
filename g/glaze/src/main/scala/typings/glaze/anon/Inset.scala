package typings.glaze.anon

import typings.glaze.glazeStrings.bottom
import typings.glaze.glazeStrings.height
import typings.glaze.glazeStrings.left
import typings.glaze.glazeStrings.marginBottom
import typings.glaze.glazeStrings.marginLeft
import typings.glaze.glazeStrings.marginRight
import typings.glaze.glazeStrings.marginTop
import typings.glaze.glazeStrings.paddingBottom
import typings.glaze.glazeStrings.paddingLeft
import typings.glaze.glazeStrings.paddingRight
import typings.glaze.glazeStrings.paddingTop
import typings.glaze.glazeStrings.right
import typings.glaze.glazeStrings.top
import typings.glaze.glazeStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inset extends StObject {
  
  val inset: js.Tuple4[top, right, bottom, left] = js.native
  
  val insetX: js.Tuple2[left, right] = js.native
  
  val insetY: js.Tuple2[top, bottom] = js.native
  
  val marginX: js.Tuple2[marginLeft, marginRight] = js.native
  
  val marginY: js.Tuple2[marginTop, marginBottom] = js.native
  
  val paddingX: js.Tuple2[paddingLeft, paddingRight] = js.native
  
  val paddingY: js.Tuple2[paddingTop, paddingBottom] = js.native
  
  val size: js.Tuple2[width, height] = js.native
}
object Inset {
  
  @scala.inline
  def apply(
    inset: js.Tuple4[top, right, bottom, left],
    insetX: js.Tuple2[left, right],
    insetY: js.Tuple2[top, bottom],
    marginX: js.Tuple2[marginLeft, marginRight],
    marginY: js.Tuple2[marginTop, marginBottom],
    paddingX: js.Tuple2[paddingLeft, paddingRight],
    paddingY: js.Tuple2[paddingTop, paddingBottom],
    size: js.Tuple2[width, height]
  ): Inset = {
    val __obj = js.Dynamic.literal(inset = inset.asInstanceOf[js.Any], insetX = insetX.asInstanceOf[js.Any], insetY = insetY.asInstanceOf[js.Any], marginX = marginX.asInstanceOf[js.Any], marginY = marginY.asInstanceOf[js.Any], paddingX = paddingX.asInstanceOf[js.Any], paddingY = paddingY.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inset]
  }
  
  @scala.inline
  implicit class InsetMutableBuilder[Self <: Inset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInset(value: js.Tuple4[top, right, bottom, left]): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetX(value: js.Tuple2[left, right]): Self = StObject.set(x, "insetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsetY(value: js.Tuple2[top, bottom]): Self = StObject.set(x, "insetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginX(value: js.Tuple2[marginLeft, marginRight]): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginY(value: js.Tuple2[marginTop, marginBottom]): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingX(value: js.Tuple2[paddingLeft, paddingRight]): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingY(value: js.Tuple2[paddingTop, paddingBottom]): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: js.Tuple2[width, height]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
