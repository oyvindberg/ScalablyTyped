package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Explorer extends StObject {
  
  val Explorer: typings.activexOutlook.Outlook.Explorer = js.native
}
object Explorer {
  
  @scala.inline
  def apply(Explorer: typings.activexOutlook.Outlook.Explorer): Explorer = {
    val __obj = js.Dynamic.literal(Explorer = Explorer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explorer]
  }
  
  @scala.inline
  implicit class ExplorerMutableBuilder[Self <: Explorer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplorer(value: typings.activexOutlook.Outlook.Explorer): Self = StObject.set(x, "Explorer", value.asInstanceOf[js.Any])
  }
}
