package typings.wegameApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageFile extends StObject {
  
  /**
    * 本地文件路径
    */
  var path: String = js.native
  
  /**
    * 本地文件大小，单位 B
    */
  var size: Double = js.native
}
object ImageFile {
  
  @scala.inline
  def apply(path: String, size: Double): ImageFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFile]
  }
  
  @scala.inline
  implicit class ImageFileMutableBuilder[Self <: ImageFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
