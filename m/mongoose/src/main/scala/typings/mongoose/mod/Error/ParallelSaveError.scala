package typings.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParallelSaveError
  extends typings.mongoose.mod.Error {
  
  @JSName("name")
  var name_ParallelSaveError: typings.mongoose.mongooseStrings.ParallelSaveError = js.native
}
object ParallelSaveError {
  
  @scala.inline
  def apply(name: typings.mongoose.mongooseStrings.ParallelSaveError): ParallelSaveError = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelSaveError]
  }
  
  @scala.inline
  implicit class ParallelSaveErrorOps[Self <: ParallelSaveError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: typings.mongoose.mongooseStrings.ParallelSaveError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
