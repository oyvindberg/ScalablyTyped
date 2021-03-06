package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetThreatIntelSetResponse extends StObject {
  
  /**
    * The format of the threatIntelSet.
    */
  var Format: ThreatIntelSetFormat = js.native
  
  /**
    * The URI of the file that contains the ThreatIntelSet. For example: https://s3.us-west-2.amazonaws.com/my-bucket/my-object-key.
    */
  var Location: typings.awsSdk.guarddutyMod.Location = js.native
  
  /**
    * A user-friendly ThreatIntelSet name displayed in all findings that are generated by activity that involves IP addresses included in this ThreatIntelSet.
    */
  var Name: typings.awsSdk.guarddutyMod.Name = js.native
  
  /**
    * The status of threatIntelSet file uploaded.
    */
  var Status: ThreatIntelSetStatus = js.native
  
  /**
    * The tags of the threat list resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object GetThreatIntelSetResponse {
  
  @scala.inline
  def apply(Format: ThreatIntelSetFormat, Location: Location, Name: Name, Status: ThreatIntelSetStatus): GetThreatIntelSetResponse = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetThreatIntelSetResponse]
  }
  
  @scala.inline
  implicit class GetThreatIntelSetResponseMutableBuilder[Self <: GetThreatIntelSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: ThreatIntelSetFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ThreatIntelSetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
