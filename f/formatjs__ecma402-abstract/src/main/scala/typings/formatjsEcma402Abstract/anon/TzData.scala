package typings.formatjsEcma402Abstract.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TzData extends StObject {
  
  var tzData: Record[String, _] = js.native
  
  var uppercaseLinks: Record[String, String] = js.native
}
object TzData {
  
  @scala.inline
  def apply(tzData: Record[String, _], uppercaseLinks: Record[String, String]): TzData = {
    val __obj = js.Dynamic.literal(tzData = tzData.asInstanceOf[js.Any], uppercaseLinks = uppercaseLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[TzData]
  }
  
  @scala.inline
  implicit class TzDataMutableBuilder[Self <: TzData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTzData(value: Record[String, _]): Self = StObject.set(x, "tzData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUppercaseLinks(value: Record[String, String]): Self = StObject.set(x, "uppercaseLinks", value.asInstanceOf[js.Any])
  }
}
