package typings.jsmediatags.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagHeaderFlags extends StObject {
  
  var experimental_indicator: Boolean = js.native
  
  var extended_header: Boolean = js.native
  
  var footer_present: Boolean = js.native
  
  var unsynchronisation: Boolean = js.native
}
object TagHeaderFlags {
  
  @scala.inline
  def apply(
    experimental_indicator: Boolean,
    extended_header: Boolean,
    footer_present: Boolean,
    unsynchronisation: Boolean
  ): TagHeaderFlags = {
    val __obj = js.Dynamic.literal(experimental_indicator = experimental_indicator.asInstanceOf[js.Any], extended_header = extended_header.asInstanceOf[js.Any], footer_present = footer_present.asInstanceOf[js.Any], unsynchronisation = unsynchronisation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagHeaderFlags]
  }
  
  @scala.inline
  implicit class TagHeaderFlagsMutableBuilder[Self <: TagHeaderFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExperimental_indicator(value: Boolean): Self = StObject.set(x, "experimental_indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtended_header(value: Boolean): Self = StObject.set(x, "extended_header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooter_present(value: Boolean): Self = StObject.set(x, "footer_present", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsynchronisation(value: Boolean): Self = StObject.set(x, "unsynchronisation", value.asInstanceOf[js.Any])
  }
}
