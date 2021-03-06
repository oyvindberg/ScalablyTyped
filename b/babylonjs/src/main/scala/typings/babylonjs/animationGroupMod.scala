package typings.babylonjs

import typings.babylonjs.animatableMod.Animatable
import typings.babylonjs.animationMod.Animation
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationGroupMod {
  
  @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup")
  @js.native
  class AnimationGroup protected () extends IDisposable {
    /**
      * Instantiates a new Animation Group.
      * This helps managing several animations at once.
      * @see https://doc.babylonjs.com/how_to/group
      * @param name Defines the name of the group
      * @param scene Defines the scene the group belongs to
      */
    def this(/** The name of the animation group */
    name: String) = this()
    def this(/** The name of the animation group */
    name: String, scene: Nullable[Scene]) = this()
    
    var _animatables: js.Any = js.native
    
    var _animationLoopCount: js.Any = js.native
    
    var _animationLoopFlags: js.Any = js.native
    
    var _checkAnimationGroupEnded: js.Any = js.native
    
    var _from: js.Any = js.native
    
    var _isAdditive: js.Any = js.native
    
    var _isPaused: js.Any = js.native
    
    var _isStarted: js.Any = js.native
    
    var _loopAnimation: js.Any = js.native
    
    var _processLoop: js.Any = js.native
    
    var _scene: js.Any = js.native
    
    var _speedRatio: js.Any = js.native
    
    var _targetedAnimations: js.Any = js.native
    
    var _to: js.Any = js.native
    
    /**
      * Add an animation (with its target) in the group
      * @param animation defines the animation we want to add
      * @param target defines the target of the animation
      * @returns the TargetedAnimation object
      */
    def addTargetedAnimation(animation: Animation, target: js.Any): TargetedAnimation = js.native
    
    /**
      * returning the list of animatables controlled by this animation group.
      */
    def animatables: js.Array[Animatable] = js.native
    
    /**
      * Gets the list of target animations
      */
    def children: js.Array[TargetedAnimation] = js.native
    
    /**
      * Clone the current animation group and returns a copy
      * @param newName defines the name of the new group
      * @param targetConverter defines an optional function used to convert current animation targets to new ones
      * @returns the new aniamtion group
      */
    def clone(newName: String): AnimationGroup = js.native
    def clone(newName: String, targetConverter: js.Function1[/* oldTarget */ js.Any, _]): AnimationGroup = js.native
    
    /**
      * Gets the first frame
      */
    def from: Double = js.native
    
    /**
      * Returns the string "AnimationGroup"
      * @returns "AnimationGroup"
      */
    def getClassName(): String = js.native
    
    /**
      * Goes to a specific frame in this animation group
      * @param frame the frame number to go to
      * @return the animationGroup
      */
    def goToFrame(frame: Double): AnimationGroup = js.native
    
    /**
      * Gets or sets if all animations should be evaluated additively
      */
    def isAdditive: Boolean = js.native
    def isAdditive_=(value: Boolean): Unit = js.native
    
    /**
      * Gets a value indicating that the current group is playing
      */
    def isPlaying: Boolean = js.native
    
    /**
      * Define if the animations are started
      */
    def isStarted: Boolean = js.native
    
    /**
      * Gets or sets if all animations should loop or not
      */
    def loopAnimation: Boolean = js.native
    def loopAnimation_=(value: Boolean): Unit = js.native
    
    /** The name of the animation group */
    var name: String = js.native
    
    /**
      * This function will normalize every animation in the group to make sure they all go from beginFrame to endFrame
      * It can add constant keys at begin or end
      * @param beginFrame defines the new begin frame for all animations or the smallest begin frame of all animations if null (defaults to null)
      * @param endFrame defines the new end frame for all animations or the largest end frame of all animations if null (defaults to null)
      * @returns the animation group
      */
    def normalize(): AnimationGroup = js.native
    def normalize(beginFrame: js.UndefOr[Nullable[Double]], endFrame: Nullable[Double]): AnimationGroup = js.native
    def normalize(beginFrame: Nullable[Double]): AnimationGroup = js.native
    
    /**
      * This observable will notify when one animation have ended
      */
    var onAnimationEndObservable: Observable[TargetedAnimation] = js.native
    
    /**
      * This observable will notify when all animations have ended.
      */
    var onAnimationGroupEndObservable: Observable[AnimationGroup] = js.native
    
    /**
      * Observer raised when all animations have looped
      */
    var onAnimationGroupLoopObservable: Observable[AnimationGroup] = js.native
    
    /**
      * This observable will notify when all animations have paused.
      */
    var onAnimationGroupPauseObservable: Observable[AnimationGroup] = js.native
    
    /**
      * This observable will notify when all animations are playing.
      */
    var onAnimationGroupPlayObservable: Observable[AnimationGroup] = js.native
    
    /**
      * Observer raised when one animation loops
      */
    var onAnimationLoopObservable: Observable[TargetedAnimation] = js.native
    
    /**
      * Pause all animations
      * @returns the animation group
      */
    def pause(): AnimationGroup = js.native
    
    /**
      * Play all animations to initial state
      * This function will start() the animations if they were not started or will restart() them if they were paused
      * @param loop defines if animations must loop
      * @returns the animation group
      */
    def play(): AnimationGroup = js.native
    def play(loop: Boolean): AnimationGroup = js.native
    
    /**
      * Reset all animations to initial state
      * @returns the animation group
      */
    def reset(): AnimationGroup = js.native
    
    /**
      * Restart animations from key 0
      * @returns the animation group
      */
    def restart(): AnimationGroup = js.native
    
    /**
      * Serializes the animationGroup to an object
      * @returns Serialized object
      */
    def serialize(): js.Any = js.native
    
    /**
      * Set animation weight for all animatables
      * @param weight defines the weight to use
      * @return the animationGroup
      * @see https://doc.babylonjs.com/babylon101/animations#animation-weights
      */
    def setWeightForAllAnimatables(weight: Double): AnimationGroup = js.native
    
    /**
      * Gets or sets the speed ratio to use for all animations
      */
    def speedRatio: Double = js.native
    /**
      * Gets or sets the speed ratio to use for all animations
      */
    def speedRatio_=(value: Double): Unit = js.native
    
    /**
      * Start all animations on given targets
      * @param loop defines if animations must loop
      * @param speedRatio defines the ratio to apply to animation speed (1 by default)
      * @param from defines the from key (optional)
      * @param to defines the to key (optional)
      * @param isAdditive defines the additive state for the resulting animatables (optional)
      * @returns the current animation group
      */
    def start(): AnimationGroup = js.native
    def start(
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      from: js.UndefOr[scala.Nothing],
      to: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): AnimationGroup = js.native
    def start(
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      from: js.UndefOr[scala.Nothing],
      to: Double
    ): AnimationGroup = js.native
    def start(
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      from: js.UndefOr[scala.Nothing],
      to: Double,
      isAdditive: Boolean
    ): AnimationGroup = js.native
    def start(loop: js.UndefOr[scala.Nothing], speedRatio: js.UndefOr[scala.Nothing], from: Double): AnimationGroup = js.native
    def start(
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      from: Double,
      to: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): AnimationGroup = js.native
    def start(loop: js.UndefOr[scala.Nothing], speedRatio: js.UndefOr[scala.Nothing], from: Double, to: Double): AnimationGroup = js.native
    def start(
      loop: js.UndefOr[scala.Nothing],
      speedRatio: js.UndefOr[scala.Nothing],
      from: Double,
      to: Double,
      isAdditive: Boolean
    ): AnimationGroup = js.native
    def start(loop: js.UndefOr[scala.Nothing], speedRatio: Double): AnimationGroup = js.native
    def start(
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      from: js.UndefOr[scala.Nothing],
      to: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): AnimationGroup = js.native
    def start(loop: js.UndefOr[scala.Nothing], speedRatio: Double, from: js.UndefOr[scala.Nothing], to: Double): AnimationGroup = js.native
    def start(
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      from: js.UndefOr[scala.Nothing],
      to: Double,
      isAdditive: Boolean
    ): AnimationGroup = js.native
    def start(loop: js.UndefOr[scala.Nothing], speedRatio: Double, from: Double): AnimationGroup = js.native
    def start(
      loop: js.UndefOr[scala.Nothing],
      speedRatio: Double,
      from: Double,
      to: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): AnimationGroup = js.native
    def start(loop: js.UndefOr[scala.Nothing], speedRatio: Double, from: Double, to: Double): AnimationGroup = js.native
    def start(loop: js.UndefOr[scala.Nothing], speedRatio: Double, from: Double, to: Double, isAdditive: Boolean): AnimationGroup = js.native
    def start(loop: Boolean): AnimationGroup = js.native
    def start(
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      from: js.UndefOr[scala.Nothing],
      to: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): AnimationGroup = js.native
    def start(loop: Boolean, speedRatio: js.UndefOr[scala.Nothing], from: js.UndefOr[scala.Nothing], to: Double): AnimationGroup = js.native
    def start(
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      from: js.UndefOr[scala.Nothing],
      to: Double,
      isAdditive: Boolean
    ): AnimationGroup = js.native
    def start(loop: Boolean, speedRatio: js.UndefOr[scala.Nothing], from: Double): AnimationGroup = js.native
    def start(
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      from: Double,
      to: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): AnimationGroup = js.native
    def start(loop: Boolean, speedRatio: js.UndefOr[scala.Nothing], from: Double, to: Double): AnimationGroup = js.native
    def start(
      loop: Boolean,
      speedRatio: js.UndefOr[scala.Nothing],
      from: Double,
      to: Double,
      isAdditive: Boolean
    ): AnimationGroup = js.native
    def start(loop: Boolean, speedRatio: Double): AnimationGroup = js.native
    def start(
      loop: Boolean,
      speedRatio: Double,
      from: js.UndefOr[scala.Nothing],
      to: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): AnimationGroup = js.native
    def start(loop: Boolean, speedRatio: Double, from: js.UndefOr[scala.Nothing], to: Double): AnimationGroup = js.native
    def start(
      loop: Boolean,
      speedRatio: Double,
      from: js.UndefOr[scala.Nothing],
      to: Double,
      isAdditive: Boolean
    ): AnimationGroup = js.native
    def start(loop: Boolean, speedRatio: Double, from: Double): AnimationGroup = js.native
    def start(
      loop: Boolean,
      speedRatio: Double,
      from: Double,
      to: js.UndefOr[scala.Nothing],
      isAdditive: Boolean
    ): AnimationGroup = js.native
    def start(loop: Boolean, speedRatio: Double, from: Double, to: Double): AnimationGroup = js.native
    def start(loop: Boolean, speedRatio: Double, from: Double, to: Double, isAdditive: Boolean): AnimationGroup = js.native
    
    /**
      * Stop all animations
      * @returns the animation group
      */
    def stop(): AnimationGroup = js.native
    
    /**
      * Synchronize and normalize all animatables with a source animatable
      * @param root defines the root animatable to synchronize with
      * @return the animationGroup
      * @see https://doc.babylonjs.com/babylon101/animations#animation-weights
      */
    def syncAllAnimationsWith(root: Animatable): AnimationGroup = js.native
    
    /**
      * Gets the targeted animations for this animation group
      */
    def targetedAnimations: js.Array[TargetedAnimation] = js.native
    
    /**
      * Gets the last frame
      */
    def to: Double = js.native
    
    def toString(fullDetails: Boolean): String = js.native
    
    /**
      * Gets or sets the unique id of the node
      */
    var uniqueId: Double = js.native
  }
  /* static members */
  object AnimationGroup {
    
    /**
      * Convert the keyframes for all animations belonging to the group to be relative to a given reference frame.
      * @param sourceAnimationGroup defines the AnimationGroup containing animations to convert
      * @param referenceFrame defines the frame that keyframes in the range will be relative to
      * @param range defines the name of the AnimationRange belonging to the animations in the group to convert
      * @param cloneOriginal defines whether or not to clone the group and convert the clone or convert the original group (default is false)
      * @param clonedName defines the name of the resulting cloned AnimationGroup if cloneOriginal is true
      * @returns a new AnimationGroup if cloneOriginal is true or the original AnimationGroup if cloneOriginal is false
      */
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(sourceAnimationGroup: AnimationGroup): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: AnimationGroup,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: AnimationGroup,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean
    ): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: AnimationGroup,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean,
      clonedName: String
    ): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(sourceAnimationGroup: AnimationGroup, referenceFrame: js.UndefOr[scala.Nothing], range: String): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: AnimationGroup,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String,
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: AnimationGroup,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String,
      cloneOriginal: Boolean
    ): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: AnimationGroup,
      referenceFrame: js.UndefOr[scala.Nothing],
      range: String,
      cloneOriginal: Boolean,
      clonedName: String
    ): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(sourceAnimationGroup: AnimationGroup, referenceFrame: Double): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: AnimationGroup,
      referenceFrame: Double,
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: AnimationGroup,
      referenceFrame: Double,
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean
    ): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: AnimationGroup,
      referenceFrame: Double,
      range: js.UndefOr[scala.Nothing],
      cloneOriginal: Boolean,
      clonedName: String
    ): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(sourceAnimationGroup: AnimationGroup, referenceFrame: Double, range: String): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: AnimationGroup,
      referenceFrame: Double,
      range: String,
      cloneOriginal: js.UndefOr[scala.Nothing],
      clonedName: String
    ): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: AnimationGroup,
      referenceFrame: Double,
      range: String,
      cloneOriginal: Boolean
    ): AnimationGroup = js.native
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.MakeAnimationAdditive")
    @js.native
    def MakeAnimationAdditive(
      sourceAnimationGroup: AnimationGroup,
      referenceFrame: Double,
      range: String,
      cloneOriginal: Boolean,
      clonedName: String
    ): AnimationGroup = js.native
    
    /**
      * Returns a new AnimationGroup object parsed from the source provided.
      * @param parsedAnimationGroup defines the source
      * @param scene defines the scene that will receive the animationGroup
      * @returns a new AnimationGroup
      */
    @JSImport("babylonjs/Animations/animationGroup", "AnimationGroup.Parse")
    @js.native
    def Parse(parsedAnimationGroup: js.Any, scene: Scene): AnimationGroup = js.native
  }
  
  @JSImport("babylonjs/Animations/animationGroup", "TargetedAnimation")
  @js.native
  class TargetedAnimation () extends StObject {
    
    /**
      * Animation to perform
      */
    var animation: Animation = js.native
    
    /**
      * Returns the string "TargetedAnimation"
      * @returns "TargetedAnimation"
      */
    def getClassName(): String = js.native
    
    /**
      * Serialize the object
      * @returns the JSON object representing the current entity
      */
    def serialize(): js.Any = js.native
    
    /**
      * Target to animate
      */
    var target: js.Any = js.native
  }
}
