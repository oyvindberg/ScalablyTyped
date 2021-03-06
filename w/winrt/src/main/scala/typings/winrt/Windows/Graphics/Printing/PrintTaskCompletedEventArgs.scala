package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintTaskCompletedEventArgs extends IPrintTaskCompletedEventArgs
object PrintTaskCompletedEventArgs {
  
  @scala.inline
  def apply(completion: PrintTaskCompletion): PrintTaskCompletedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskCompletedEventArgs]
  }
}
