package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashFrame extends StObject {
  
  var actionScript: js.Any = js.native
  
  var duration: js.Any = js.native
  
  var elements: js.Array[FlashElement] = js.native
  
  def getCustomEase(): js.Any = js.native
  
  var hasCustomEase: js.Any = js.native
  
  var labelType: js.Any = js.native
  
  var motionTweenOrientToPath: js.Any = js.native
  
  var motionTweenRotate: js.Any = js.native
  
  var motionTweenRotateTimes: js.Any = js.native
  
  var motionTweenScale: js.Any = js.native
  
  var motionTweenSnap: js.Any = js.native
  
  var motionTweenSync: js.Any = js.native
  
  var name: js.Any = js.native
  
  def setCustomEase(): js.Any = js.native
  
  var shapeTweenBlend: js.Any = js.native
  
  var soundEffect: js.Any = js.native
  
  var soundLibraryItem: FlashSoundItem = js.native
  
  var soundLoop: js.Any = js.native
  
  var soundLoopMode: js.Any = js.native
  
  var soundName: js.Any = js.native
  
  var soundSync: js.Any = js.native
  
  var startFrame: js.Any = js.native
  
  var tweenEasing: js.Any = js.native
  
  var tweenType: js.Any = js.native
  
  var useSingleEaseCurve: js.Any = js.native
}
object FlashFrame {
  
  @scala.inline
  def apply(
    actionScript: js.Any,
    duration: js.Any,
    elements: js.Array[FlashElement],
    getCustomEase: () => js.Any,
    hasCustomEase: js.Any,
    labelType: js.Any,
    motionTweenOrientToPath: js.Any,
    motionTweenRotate: js.Any,
    motionTweenRotateTimes: js.Any,
    motionTweenScale: js.Any,
    motionTweenSnap: js.Any,
    motionTweenSync: js.Any,
    name: js.Any,
    setCustomEase: () => js.Any,
    shapeTweenBlend: js.Any,
    soundEffect: js.Any,
    soundLibraryItem: FlashSoundItem,
    soundLoop: js.Any,
    soundLoopMode: js.Any,
    soundName: js.Any,
    soundSync: js.Any,
    startFrame: js.Any,
    tweenEasing: js.Any,
    tweenType: js.Any,
    useSingleEaseCurve: js.Any
  ): FlashFrame = {
    val __obj = js.Dynamic.literal(actionScript = actionScript.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], getCustomEase = js.Any.fromFunction0(getCustomEase), hasCustomEase = hasCustomEase.asInstanceOf[js.Any], labelType = labelType.asInstanceOf[js.Any], motionTweenOrientToPath = motionTweenOrientToPath.asInstanceOf[js.Any], motionTweenRotate = motionTweenRotate.asInstanceOf[js.Any], motionTweenRotateTimes = motionTweenRotateTimes.asInstanceOf[js.Any], motionTweenScale = motionTweenScale.asInstanceOf[js.Any], motionTweenSnap = motionTweenSnap.asInstanceOf[js.Any], motionTweenSync = motionTweenSync.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], setCustomEase = js.Any.fromFunction0(setCustomEase), shapeTweenBlend = shapeTweenBlend.asInstanceOf[js.Any], soundEffect = soundEffect.asInstanceOf[js.Any], soundLibraryItem = soundLibraryItem.asInstanceOf[js.Any], soundLoop = soundLoop.asInstanceOf[js.Any], soundLoopMode = soundLoopMode.asInstanceOf[js.Any], soundName = soundName.asInstanceOf[js.Any], soundSync = soundSync.asInstanceOf[js.Any], startFrame = startFrame.asInstanceOf[js.Any], tweenEasing = tweenEasing.asInstanceOf[js.Any], tweenType = tweenType.asInstanceOf[js.Any], useSingleEaseCurve = useSingleEaseCurve.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashFrame]
  }
  
  @scala.inline
  implicit class FlashFrameMutableBuilder[Self <: FlashFrame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionScript(value: js.Any): Self = StObject.set(x, "actionScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: js.Any): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElements(value: js.Array[FlashElement]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: FlashElement*): Self = StObject.set(x, "elements", js.Array(value :_*))
    
    @scala.inline
    def setGetCustomEase(value: () => js.Any): Self = StObject.set(x, "getCustomEase", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasCustomEase(value: js.Any): Self = StObject.set(x, "hasCustomEase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelType(value: js.Any): Self = StObject.set(x, "labelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionTweenOrientToPath(value: js.Any): Self = StObject.set(x, "motionTweenOrientToPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionTweenRotate(value: js.Any): Self = StObject.set(x, "motionTweenRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionTweenRotateTimes(value: js.Any): Self = StObject.set(x, "motionTweenRotateTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionTweenScale(value: js.Any): Self = StObject.set(x, "motionTweenScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionTweenSnap(value: js.Any): Self = StObject.set(x, "motionTweenSnap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMotionTweenSync(value: js.Any): Self = StObject.set(x, "motionTweenSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCustomEase(value: () => js.Any): Self = StObject.set(x, "setCustomEase", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShapeTweenBlend(value: js.Any): Self = StObject.set(x, "shapeTweenBlend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundEffect(value: js.Any): Self = StObject.set(x, "soundEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundLibraryItem(value: FlashSoundItem): Self = StObject.set(x, "soundLibraryItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundLoop(value: js.Any): Self = StObject.set(x, "soundLoop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundLoopMode(value: js.Any): Self = StObject.set(x, "soundLoopMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundName(value: js.Any): Self = StObject.set(x, "soundName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundSync(value: js.Any): Self = StObject.set(x, "soundSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFrame(value: js.Any): Self = StObject.set(x, "startFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTweenEasing(value: js.Any): Self = StObject.set(x, "tweenEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTweenType(value: js.Any): Self = StObject.set(x, "tweenType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSingleEaseCurve(value: js.Any): Self = StObject.set(x, "useSingleEaseCurve", value.asInstanceOf[js.Any])
  }
}
