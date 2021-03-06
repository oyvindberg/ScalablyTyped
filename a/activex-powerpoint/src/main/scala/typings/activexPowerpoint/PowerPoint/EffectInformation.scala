package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EffectInformation extends StObject {
  
  val AfterEffect: MsoAnimAfterEffect = js.native
  
  val AnimateBackground: MsoTriState = js.native
  
  val AnimateTextInReverse: MsoTriState = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  val BuildByLevelEffect: MsoAnimateByLevel = js.native
  
  val Dim: ColorFormat = js.native
  
  val Parent: js.Any = js.native
  
  val PlaySettings: typings.activexPowerpoint.PowerPoint.PlaySettings = js.native
  
  @JSName("PowerPoint.EffectInformation_typekey")
  var PowerPointDotEffectInformation_typekey: EffectInformation = js.native
  
  val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect = js.native
  
  val TextUnitEffect: MsoAnimTextUnitEffect = js.native
}
object EffectInformation {
  
  @scala.inline
  def apply(
    AfterEffect: MsoAnimAfterEffect,
    AnimateBackground: MsoTriState,
    AnimateTextInReverse: MsoTriState,
    Application: Application,
    BuildByLevelEffect: MsoAnimateByLevel,
    Dim: ColorFormat,
    Parent: js.Any,
    PlaySettings: PlaySettings,
    PowerPointDotEffectInformation_typekey: EffectInformation,
    SoundEffect: SoundEffect,
    TextUnitEffect: MsoAnimTextUnitEffect
  ): EffectInformation = {
    val __obj = js.Dynamic.literal(AfterEffect = AfterEffect.asInstanceOf[js.Any], AnimateBackground = AnimateBackground.asInstanceOf[js.Any], AnimateTextInReverse = AnimateTextInReverse.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BuildByLevelEffect = BuildByLevelEffect.asInstanceOf[js.Any], Dim = Dim.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PlaySettings = PlaySettings.asInstanceOf[js.Any], SoundEffect = SoundEffect.asInstanceOf[js.Any], TextUnitEffect = TextUnitEffect.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.EffectInformation_typekey")(PowerPointDotEffectInformation_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectInformation]
  }
  
  @scala.inline
  implicit class EffectInformationMutableBuilder[Self <: EffectInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterEffect(value: MsoAnimAfterEffect): Self = StObject.set(x, "AfterEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateBackground(value: MsoTriState): Self = StObject.set(x, "AnimateBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateTextInReverse(value: MsoTriState): Self = StObject.set(x, "AnimateTextInReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildByLevelEffect(value: MsoAnimateByLevel): Self = StObject.set(x, "BuildByLevelEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDim(value: ColorFormat): Self = StObject.set(x, "Dim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaySettings(value: PlaySettings): Self = StObject.set(x, "PlaySettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotEffectInformation_typekey(value: EffectInformation): Self = StObject.set(x, "PowerPoint.EffectInformation_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundEffect(value: SoundEffect): Self = StObject.set(x, "SoundEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUnitEffect(value: MsoAnimTextUnitEffect): Self = StObject.set(x, "TextUnitEffect", value.asInstanceOf[js.Any])
  }
}
