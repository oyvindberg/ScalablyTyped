package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoContext extends StObject {
  
  /**
    * 退出全屏
    */
  def exitFullScreen(): Unit = js.native
  
  /**
    * 暂停
    */
  def pause(): Unit = js.native
  
  /**
    * 播放
    */
  def play(): Unit = js.native
  
  /**
    * 设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
    */
  def playbackRate(): Unit = js.native
  
  /**
    * 进入全屏，可传入{direction}参数（1.7.0起支持），详见video组件文档
    */
  def requestFullScreen(): Unit = js.native
  
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(): Unit = js.native
  
  /**
    * 发送弹幕，danmu 包含两个属性 text, color。
    */
  def sendDanmu(): Unit = js.native
}
object VideoContext {
  
  @scala.inline
  def apply(
    exitFullScreen: () => Unit,
    pause: () => Unit,
    play: () => Unit,
    playbackRate: () => Unit,
    requestFullScreen: () => Unit,
    seek: () => Unit,
    sendDanmu: () => Unit
  ): VideoContext = {
    val __obj = js.Dynamic.literal(exitFullScreen = js.Any.fromFunction0(exitFullScreen), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), playbackRate = js.Any.fromFunction0(playbackRate), requestFullScreen = js.Any.fromFunction0(requestFullScreen), seek = js.Any.fromFunction0(seek), sendDanmu = js.Any.fromFunction0(sendDanmu))
    __obj.asInstanceOf[VideoContext]
  }
  
  @scala.inline
  implicit class VideoContextMutableBuilder[Self <: VideoContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExitFullScreen(value: () => Unit): Self = StObject.set(x, "exitFullScreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlaybackRate(value: () => Unit): Self = StObject.set(x, "playbackRate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRequestFullScreen(value: () => Unit): Self = StObject.set(x, "requestFullScreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSeek(value: () => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSendDanmu(value: () => Unit): Self = StObject.set(x, "sendDanmu", js.Any.fromFunction0(value))
  }
}
