package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoData extends StObject {
  
  /** 选定视频的时间长度 */
  var duration: Double = js.native
  
  /** 返回选定视频的长 */
  var height: Double = js.native
  
  /** 选定视频的数据量大小 */
  var size: Double = js.native
  
  /** 选定视频的临时文件路径 */
  var tempFilePath: String = js.native
  
  /** 返回选定视频的宽 */
  var width: Double = js.native
}
object VideoData {
  
  @scala.inline
  def apply(duration: Double, height: Double, size: Double, tempFilePath: String, width: Double): VideoData = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tempFilePath = tempFilePath.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoData]
  }
  
  @scala.inline
  implicit class VideoDataMutableBuilder[Self <: VideoData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTempFilePath(value: String): Self = StObject.set(x, "tempFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
