package typings.reactMdTransition

import typings.react.mod.Dispatch
import typings.reactMdTransition.constantsMod.TransitionAction
import typings.reactMdTransition.constantsMod.TransitionStage
import typings.reactMdTransition.typesMod.CSSTransitionOptions
import typings.reactMdTransition.typesMod.CSSTransitionProvidedProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCSSTransitionMod {
  
  @JSImport("@react-md/transition/types/useCSSTransition", "useCSSTransition")
  @js.native
  def useCSSTransition[E /* <: HTMLElement */](
    hasAppearTemporaryTimeoutTransitionInOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedClassNameClassNamesRef: CSSTransitionOptions[E]
  ): CSSTransitionReturnValue[E] = js.native
  
  type CSSTransitionReturnValue[E /* <: HTMLElement */] = js.Tuple4[Rendered, CSSTransitionProvidedProps[E], Dispatch[TransitionAction], TransitionStage]
  
  type Rendered = Boolean
}
