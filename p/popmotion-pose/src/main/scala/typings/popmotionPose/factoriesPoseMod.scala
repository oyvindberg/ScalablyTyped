package typings.popmotionPose

import typings.popmotionPose.libTypesMod.PoserConfig
import typings.popmotionPose.typesMod.PopmotionPoserFactoryConfig
import typings.popmotionPose.typesMod.TransitionDefinition
import typings.popmotionPose.typesMod.Value
import typings.poseCore.typesMod.Poser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoriesPoseMod {
  
  @JSImport("popmotion-pose/lib/factories/pose", JSImport.Default)
  @js.native
  def default[P](
    hasTransformPoseAddListenerToValueExtendAPIReadValueFromSourcePosePrioritySetValueNative: PopmotionPoserFactoryConfig[P, TransitionDefinition]
  ): js.Function1[
    /* config */ PoserConfig[Value], 
    Poser[
      Value, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Action */ _, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColdSubscription */ _, 
      P
    ]
  ] = js.native
}
