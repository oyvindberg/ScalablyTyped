package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedAccount extends StObject {
  
  val SelectedAccount: typings.activexOutlook.Outlook.Account = js.native
}
object SelectedAccount {
  
  @scala.inline
  def apply(SelectedAccount: typings.activexOutlook.Outlook.Account): SelectedAccount = {
    val __obj = js.Dynamic.literal(SelectedAccount = SelectedAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedAccount]
  }
  
  @scala.inline
  implicit class SelectedAccountMutableBuilder[Self <: SelectedAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedAccount(value: typings.activexOutlook.Outlook.Account): Self = StObject.set(x, "SelectedAccount", value.asInstanceOf[js.Any])
  }
}
