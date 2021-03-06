package typings.winrtUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the format of a media stream or media container. */
@js.native
trait IMediaEncodingProperties extends StObject {
  
  /** Gets additional format properties. */
  var properties: MediaPropertySet = js.native
  
  /** Gets or sets the subtype of the format. */
  var subtype: String = js.native
  
  /** Gets the format type. */
  var `type`: String = js.native
}
object IMediaEncodingProperties {
  
  @scala.inline
  def apply(properties: MediaPropertySet, subtype: String, `type`: String): IMediaEncodingProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaEncodingProperties]
  }
  
  @scala.inline
  implicit class IMediaEncodingPropertiesMutableBuilder[Self <: IMediaEncodingProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: MediaPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
