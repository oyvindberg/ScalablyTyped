package typings.domHelpers

import typings.domHelpers.addEventListenerMod.TaggedEventHandler
import typings.domHelpers.domHelpersStrings.abort
import typings.domHelpers.domHelpersStrings.animationcancel
import typings.domHelpers.domHelpersStrings.animationend
import typings.domHelpers.domHelpersStrings.animationiteration
import typings.domHelpers.domHelpersStrings.animationstart
import typings.domHelpers.domHelpersStrings.auxclick
import typings.domHelpers.domHelpersStrings.blur
import typings.domHelpers.domHelpersStrings.cancel
import typings.domHelpers.domHelpersStrings.canplay
import typings.domHelpers.domHelpersStrings.canplaythrough
import typings.domHelpers.domHelpersStrings.change
import typings.domHelpers.domHelpersStrings.click
import typings.domHelpers.domHelpersStrings.close
import typings.domHelpers.domHelpersStrings.contextmenu
import typings.domHelpers.domHelpersStrings.copy
import typings.domHelpers.domHelpersStrings.cuechange
import typings.domHelpers.domHelpersStrings.cut
import typings.domHelpers.domHelpersStrings.dblclick
import typings.domHelpers.domHelpersStrings.drag
import typings.domHelpers.domHelpersStrings.dragend
import typings.domHelpers.domHelpersStrings.dragenter
import typings.domHelpers.domHelpersStrings.dragexit
import typings.domHelpers.domHelpersStrings.dragleave
import typings.domHelpers.domHelpersStrings.dragover
import typings.domHelpers.domHelpersStrings.dragstart
import typings.domHelpers.domHelpersStrings.drop
import typings.domHelpers.domHelpersStrings.durationchange
import typings.domHelpers.domHelpersStrings.emptied
import typings.domHelpers.domHelpersStrings.ended
import typings.domHelpers.domHelpersStrings.error
import typings.domHelpers.domHelpersStrings.focus
import typings.domHelpers.domHelpersStrings.focusin
import typings.domHelpers.domHelpersStrings.focusout
import typings.domHelpers.domHelpersStrings.fullscreenchange
import typings.domHelpers.domHelpersStrings.fullscreenerror
import typings.domHelpers.domHelpersStrings.gotpointercapture
import typings.domHelpers.domHelpersStrings.input
import typings.domHelpers.domHelpersStrings.invalid
import typings.domHelpers.domHelpersStrings.keydown
import typings.domHelpers.domHelpersStrings.keypress
import typings.domHelpers.domHelpersStrings.keyup
import typings.domHelpers.domHelpersStrings.load
import typings.domHelpers.domHelpersStrings.loadeddata
import typings.domHelpers.domHelpersStrings.loadedmetadata
import typings.domHelpers.domHelpersStrings.loadstart
import typings.domHelpers.domHelpersStrings.lostpointercapture
import typings.domHelpers.domHelpersStrings.mousedown
import typings.domHelpers.domHelpersStrings.mouseenter
import typings.domHelpers.domHelpersStrings.mouseleave
import typings.domHelpers.domHelpersStrings.mousemove
import typings.domHelpers.domHelpersStrings.mouseout
import typings.domHelpers.domHelpersStrings.mouseover
import typings.domHelpers.domHelpersStrings.mouseup
import typings.domHelpers.domHelpersStrings.paste
import typings.domHelpers.domHelpersStrings.pause
import typings.domHelpers.domHelpersStrings.play
import typings.domHelpers.domHelpersStrings.playing
import typings.domHelpers.domHelpersStrings.pointercancel
import typings.domHelpers.domHelpersStrings.pointerdown
import typings.domHelpers.domHelpersStrings.pointerenter
import typings.domHelpers.domHelpersStrings.pointerleave
import typings.domHelpers.domHelpersStrings.pointermove
import typings.domHelpers.domHelpersStrings.pointerout
import typings.domHelpers.domHelpersStrings.pointerover
import typings.domHelpers.domHelpersStrings.pointerup
import typings.domHelpers.domHelpersStrings.progress
import typings.domHelpers.domHelpersStrings.ratechange
import typings.domHelpers.domHelpersStrings.reset
import typings.domHelpers.domHelpersStrings.resize
import typings.domHelpers.domHelpersStrings.scroll
import typings.domHelpers.domHelpersStrings.securitypolicyviolation
import typings.domHelpers.domHelpersStrings.seeked
import typings.domHelpers.domHelpersStrings.seeking
import typings.domHelpers.domHelpersStrings.select
import typings.domHelpers.domHelpersStrings.selectionchange
import typings.domHelpers.domHelpersStrings.selectstart
import typings.domHelpers.domHelpersStrings.stalled
import typings.domHelpers.domHelpersStrings.submit
import typings.domHelpers.domHelpersStrings.suspend
import typings.domHelpers.domHelpersStrings.timeupdate
import typings.domHelpers.domHelpersStrings.toggle
import typings.domHelpers.domHelpersStrings.touchcancel
import typings.domHelpers.domHelpersStrings.touchend
import typings.domHelpers.domHelpersStrings.touchmove
import typings.domHelpers.domHelpersStrings.touchstart
import typings.domHelpers.domHelpersStrings.transitioncancel
import typings.domHelpers.domHelpersStrings.transitionend
import typings.domHelpers.domHelpersStrings.transitionrun
import typings.domHelpers.domHelpersStrings.transitionstart
import typings.domHelpers.domHelpersStrings.volumechange
import typings.domHelpers.domHelpersStrings.waiting
import typings.domHelpers.domHelpersStrings.wheel
import typings.std.EventListenerOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object removeEventListenerMod {
  
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_abort(node: HTMLElement, eventName: abort, handler: TaggedEventHandler[abort], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_abort(
    node: HTMLElement,
    eventName: abort,
    handler: TaggedEventHandler[abort],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_animationcancel(node: HTMLElement, eventName: animationcancel, handler: TaggedEventHandler[animationcancel]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_animationcancel(
    node: HTMLElement,
    eventName: animationcancel,
    handler: TaggedEventHandler[animationcancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_animationend(node: HTMLElement, eventName: animationend, handler: TaggedEventHandler[animationend]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_animationend(
    node: HTMLElement,
    eventName: animationend,
    handler: TaggedEventHandler[animationend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_animationiteration(node: HTMLElement, eventName: animationiteration, handler: TaggedEventHandler[animationiteration]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_animationiteration(
    node: HTMLElement,
    eventName: animationiteration,
    handler: TaggedEventHandler[animationiteration],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_animationstart(node: HTMLElement, eventName: animationstart, handler: TaggedEventHandler[animationstart]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_animationstart(
    node: HTMLElement,
    eventName: animationstart,
    handler: TaggedEventHandler[animationstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_auxclick(node: HTMLElement, eventName: auxclick, handler: TaggedEventHandler[auxclick], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_auxclick(
    node: HTMLElement,
    eventName: auxclick,
    handler: TaggedEventHandler[auxclick],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_blur(node: HTMLElement, eventName: blur, handler: TaggedEventHandler[blur], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_blur(
    node: HTMLElement,
    eventName: blur,
    handler: TaggedEventHandler[blur],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_cancel(node: HTMLElement, eventName: cancel, handler: TaggedEventHandler[cancel], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_cancel(
    node: HTMLElement,
    eventName: cancel,
    handler: TaggedEventHandler[cancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_canplay(node: HTMLElement, eventName: canplay, handler: TaggedEventHandler[canplay], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_canplay(
    node: HTMLElement,
    eventName: canplay,
    handler: TaggedEventHandler[canplay],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_canplaythrough(node: HTMLElement, eventName: canplaythrough, handler: TaggedEventHandler[canplaythrough]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_canplaythrough(
    node: HTMLElement,
    eventName: canplaythrough,
    handler: TaggedEventHandler[canplaythrough],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_change(node: HTMLElement, eventName: change, handler: TaggedEventHandler[change], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_change(
    node: HTMLElement,
    eventName: change,
    handler: TaggedEventHandler[change],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_click(node: HTMLElement, eventName: click, handler: TaggedEventHandler[click], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_click(
    node: HTMLElement,
    eventName: click,
    handler: TaggedEventHandler[click],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_close(node: HTMLElement, eventName: close, handler: TaggedEventHandler[close], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_close(
    node: HTMLElement,
    eventName: close,
    handler: TaggedEventHandler[close],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_contextmenu(node: HTMLElement, eventName: contextmenu, handler: TaggedEventHandler[contextmenu]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_contextmenu(
    node: HTMLElement,
    eventName: contextmenu,
    handler: TaggedEventHandler[contextmenu],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_copy(node: HTMLElement, eventName: copy, handler: TaggedEventHandler[copy], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_copy(
    node: HTMLElement,
    eventName: copy,
    handler: TaggedEventHandler[copy],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_cuechange(node: HTMLElement, eventName: cuechange, handler: TaggedEventHandler[cuechange], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_cuechange(
    node: HTMLElement,
    eventName: cuechange,
    handler: TaggedEventHandler[cuechange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_cut(node: HTMLElement, eventName: cut, handler: TaggedEventHandler[cut], options: EventListenerOptions): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dblclick(node: HTMLElement, eventName: dblclick, handler: TaggedEventHandler[dblclick], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dblclick(
    node: HTMLElement,
    eventName: dblclick,
    handler: TaggedEventHandler[dblclick],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_drag(node: HTMLElement, eventName: drag, handler: TaggedEventHandler[drag], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_drag(
    node: HTMLElement,
    eventName: drag,
    handler: TaggedEventHandler[drag],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragend(node: HTMLElement, eventName: dragend, handler: TaggedEventHandler[dragend], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragend(
    node: HTMLElement,
    eventName: dragend,
    handler: TaggedEventHandler[dragend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragenter(node: HTMLElement, eventName: dragenter, handler: TaggedEventHandler[dragenter], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragenter(
    node: HTMLElement,
    eventName: dragenter,
    handler: TaggedEventHandler[dragenter],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragexit(node: HTMLElement, eventName: dragexit, handler: TaggedEventHandler[dragexit], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragexit(
    node: HTMLElement,
    eventName: dragexit,
    handler: TaggedEventHandler[dragexit],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragleave(node: HTMLElement, eventName: dragleave, handler: TaggedEventHandler[dragleave], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragleave(
    node: HTMLElement,
    eventName: dragleave,
    handler: TaggedEventHandler[dragleave],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragover(node: HTMLElement, eventName: dragover, handler: TaggedEventHandler[dragover], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragover(
    node: HTMLElement,
    eventName: dragover,
    handler: TaggedEventHandler[dragover],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragstart(node: HTMLElement, eventName: dragstart, handler: TaggedEventHandler[dragstart], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_dragstart(
    node: HTMLElement,
    eventName: dragstart,
    handler: TaggedEventHandler[dragstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_drop(node: HTMLElement, eventName: drop, handler: TaggedEventHandler[drop], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_drop(
    node: HTMLElement,
    eventName: drop,
    handler: TaggedEventHandler[drop],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_durationchange(node: HTMLElement, eventName: durationchange, handler: TaggedEventHandler[durationchange]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_durationchange(
    node: HTMLElement,
    eventName: durationchange,
    handler: TaggedEventHandler[durationchange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_emptied(node: HTMLElement, eventName: emptied, handler: TaggedEventHandler[emptied], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_emptied(
    node: HTMLElement,
    eventName: emptied,
    handler: TaggedEventHandler[emptied],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_ended(node: HTMLElement, eventName: ended, handler: TaggedEventHandler[ended], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_ended(
    node: HTMLElement,
    eventName: ended,
    handler: TaggedEventHandler[ended],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_error(node: HTMLElement, eventName: error, handler: TaggedEventHandler[error], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_error(
    node: HTMLElement,
    eventName: error,
    handler: TaggedEventHandler[error],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_focus(node: HTMLElement, eventName: focus, handler: TaggedEventHandler[focus], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_focus(
    node: HTMLElement,
    eventName: focus,
    handler: TaggedEventHandler[focus],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_focusin(node: HTMLElement, eventName: focusin, handler: TaggedEventHandler[focusin], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_focusin(
    node: HTMLElement,
    eventName: focusin,
    handler: TaggedEventHandler[focusin],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_focusout(node: HTMLElement, eventName: focusout, handler: TaggedEventHandler[focusout], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_focusout(
    node: HTMLElement,
    eventName: focusout,
    handler: TaggedEventHandler[focusout],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_fullscreenchange(node: HTMLElement, eventName: fullscreenchange, handler: TaggedEventHandler[fullscreenchange]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_fullscreenchange(
    node: HTMLElement,
    eventName: fullscreenchange,
    handler: TaggedEventHandler[fullscreenchange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_fullscreenerror(node: HTMLElement, eventName: fullscreenerror, handler: TaggedEventHandler[fullscreenerror]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_fullscreenerror(
    node: HTMLElement,
    eventName: fullscreenerror,
    handler: TaggedEventHandler[fullscreenerror],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_gotpointercapture(node: HTMLElement, eventName: gotpointercapture, handler: TaggedEventHandler[gotpointercapture]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_gotpointercapture(
    node: HTMLElement,
    eventName: gotpointercapture,
    handler: TaggedEventHandler[gotpointercapture],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_input(node: HTMLElement, eventName: input, handler: TaggedEventHandler[input], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_input(
    node: HTMLElement,
    eventName: input,
    handler: TaggedEventHandler[input],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_invalid(node: HTMLElement, eventName: invalid, handler: TaggedEventHandler[invalid], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_invalid(
    node: HTMLElement,
    eventName: invalid,
    handler: TaggedEventHandler[invalid],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_keydown(node: HTMLElement, eventName: keydown, handler: TaggedEventHandler[keydown], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_keydown(
    node: HTMLElement,
    eventName: keydown,
    handler: TaggedEventHandler[keydown],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_keypress(node: HTMLElement, eventName: keypress, handler: TaggedEventHandler[keypress], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_keypress(
    node: HTMLElement,
    eventName: keypress,
    handler: TaggedEventHandler[keypress],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_keyup(node: HTMLElement, eventName: keyup, handler: TaggedEventHandler[keyup], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_keyup(
    node: HTMLElement,
    eventName: keyup,
    handler: TaggedEventHandler[keyup],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_load(node: HTMLElement, eventName: load, handler: TaggedEventHandler[load], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_load(
    node: HTMLElement,
    eventName: load,
    handler: TaggedEventHandler[load],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_loadeddata(node: HTMLElement, eventName: loadeddata, handler: TaggedEventHandler[loadeddata]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_loadeddata(
    node: HTMLElement,
    eventName: loadeddata,
    handler: TaggedEventHandler[loadeddata],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_loadedmetadata(node: HTMLElement, eventName: loadedmetadata, handler: TaggedEventHandler[loadedmetadata]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_loadedmetadata(
    node: HTMLElement,
    eventName: loadedmetadata,
    handler: TaggedEventHandler[loadedmetadata],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_loadstart(node: HTMLElement, eventName: loadstart, handler: TaggedEventHandler[loadstart], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_loadstart(
    node: HTMLElement,
    eventName: loadstart,
    handler: TaggedEventHandler[loadstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_lostpointercapture(node: HTMLElement, eventName: lostpointercapture, handler: TaggedEventHandler[lostpointercapture]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_lostpointercapture(
    node: HTMLElement,
    eventName: lostpointercapture,
    handler: TaggedEventHandler[lostpointercapture],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mousedown(node: HTMLElement, eventName: mousedown, handler: TaggedEventHandler[mousedown], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mousedown(
    node: HTMLElement,
    eventName: mousedown,
    handler: TaggedEventHandler[mousedown],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseenter(node: HTMLElement, eventName: mouseenter, handler: TaggedEventHandler[mouseenter]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseenter(
    node: HTMLElement,
    eventName: mouseenter,
    handler: TaggedEventHandler[mouseenter],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseleave(node: HTMLElement, eventName: mouseleave, handler: TaggedEventHandler[mouseleave]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseleave(
    node: HTMLElement,
    eventName: mouseleave,
    handler: TaggedEventHandler[mouseleave],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mousemove(node: HTMLElement, eventName: mousemove, handler: TaggedEventHandler[mousemove], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mousemove(
    node: HTMLElement,
    eventName: mousemove,
    handler: TaggedEventHandler[mousemove],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseout(node: HTMLElement, eventName: mouseout, handler: TaggedEventHandler[mouseout], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseout(
    node: HTMLElement,
    eventName: mouseout,
    handler: TaggedEventHandler[mouseout],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseover(node: HTMLElement, eventName: mouseover, handler: TaggedEventHandler[mouseover], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseover(
    node: HTMLElement,
    eventName: mouseover,
    handler: TaggedEventHandler[mouseover],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseup(node: HTMLElement, eventName: mouseup, handler: TaggedEventHandler[mouseup], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_mouseup(
    node: HTMLElement,
    eventName: mouseup,
    handler: TaggedEventHandler[mouseup],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_paste(node: HTMLElement, eventName: paste, handler: TaggedEventHandler[paste], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_paste(
    node: HTMLElement,
    eventName: paste,
    handler: TaggedEventHandler[paste],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pause(node: HTMLElement, eventName: pause, handler: TaggedEventHandler[pause], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pause(
    node: HTMLElement,
    eventName: pause,
    handler: TaggedEventHandler[pause],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_play(node: HTMLElement, eventName: play, handler: TaggedEventHandler[play], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_play(
    node: HTMLElement,
    eventName: play,
    handler: TaggedEventHandler[play],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_playing(node: HTMLElement, eventName: playing, handler: TaggedEventHandler[playing], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_playing(
    node: HTMLElement,
    eventName: playing,
    handler: TaggedEventHandler[playing],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointercancel(node: HTMLElement, eventName: pointercancel, handler: TaggedEventHandler[pointercancel]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointercancel(
    node: HTMLElement,
    eventName: pointercancel,
    handler: TaggedEventHandler[pointercancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerdown(node: HTMLElement, eventName: pointerdown, handler: TaggedEventHandler[pointerdown]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerdown(
    node: HTMLElement,
    eventName: pointerdown,
    handler: TaggedEventHandler[pointerdown],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerenter(node: HTMLElement, eventName: pointerenter, handler: TaggedEventHandler[pointerenter]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerenter(
    node: HTMLElement,
    eventName: pointerenter,
    handler: TaggedEventHandler[pointerenter],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerleave(node: HTMLElement, eventName: pointerleave, handler: TaggedEventHandler[pointerleave]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerleave(
    node: HTMLElement,
    eventName: pointerleave,
    handler: TaggedEventHandler[pointerleave],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointermove(node: HTMLElement, eventName: pointermove, handler: TaggedEventHandler[pointermove]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointermove(
    node: HTMLElement,
    eventName: pointermove,
    handler: TaggedEventHandler[pointermove],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerout(node: HTMLElement, eventName: pointerout, handler: TaggedEventHandler[pointerout]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerout(
    node: HTMLElement,
    eventName: pointerout,
    handler: TaggedEventHandler[pointerout],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerover(node: HTMLElement, eventName: pointerover, handler: TaggedEventHandler[pointerover]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerover(
    node: HTMLElement,
    eventName: pointerover,
    handler: TaggedEventHandler[pointerover],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerup(node: HTMLElement, eventName: pointerup, handler: TaggedEventHandler[pointerup], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_pointerup(
    node: HTMLElement,
    eventName: pointerup,
    handler: TaggedEventHandler[pointerup],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_progress(node: HTMLElement, eventName: progress, handler: TaggedEventHandler[progress], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_progress(
    node: HTMLElement,
    eventName: progress,
    handler: TaggedEventHandler[progress],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_ratechange(node: HTMLElement, eventName: ratechange, handler: TaggedEventHandler[ratechange]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_ratechange(
    node: HTMLElement,
    eventName: ratechange,
    handler: TaggedEventHandler[ratechange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_reset(node: HTMLElement, eventName: reset, handler: TaggedEventHandler[reset], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_reset(
    node: HTMLElement,
    eventName: reset,
    handler: TaggedEventHandler[reset],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_resize(node: HTMLElement, eventName: resize, handler: TaggedEventHandler[resize], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_resize(
    node: HTMLElement,
    eventName: resize,
    handler: TaggedEventHandler[resize],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_scroll(node: HTMLElement, eventName: scroll, handler: TaggedEventHandler[scroll], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_scroll(
    node: HTMLElement,
    eventName: scroll,
    handler: TaggedEventHandler[scroll],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation]
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_securitypolicyviolation(
    node: HTMLElement,
    eventName: securitypolicyviolation,
    handler: TaggedEventHandler[securitypolicyviolation],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_seeked(node: HTMLElement, eventName: seeked, handler: TaggedEventHandler[seeked], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_seeked(
    node: HTMLElement,
    eventName: seeked,
    handler: TaggedEventHandler[seeked],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_seeking(node: HTMLElement, eventName: seeking, handler: TaggedEventHandler[seeking], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_seeking(
    node: HTMLElement,
    eventName: seeking,
    handler: TaggedEventHandler[seeking],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_select(node: HTMLElement, eventName: select, handler: TaggedEventHandler[select], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_select(
    node: HTMLElement,
    eventName: select,
    handler: TaggedEventHandler[select],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_selectionchange(node: HTMLElement, eventName: selectionchange, handler: TaggedEventHandler[selectionchange]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_selectionchange(
    node: HTMLElement,
    eventName: selectionchange,
    handler: TaggedEventHandler[selectionchange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_selectstart(node: HTMLElement, eventName: selectstart, handler: TaggedEventHandler[selectstart]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_selectstart(
    node: HTMLElement,
    eventName: selectstart,
    handler: TaggedEventHandler[selectstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_stalled(node: HTMLElement, eventName: stalled, handler: TaggedEventHandler[stalled], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_stalled(
    node: HTMLElement,
    eventName: stalled,
    handler: TaggedEventHandler[stalled],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_submit(node: HTMLElement, eventName: submit, handler: TaggedEventHandler[submit], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_submit(
    node: HTMLElement,
    eventName: submit,
    handler: TaggedEventHandler[submit],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_suspend(node: HTMLElement, eventName: suspend, handler: TaggedEventHandler[suspend], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_suspend(
    node: HTMLElement,
    eventName: suspend,
    handler: TaggedEventHandler[suspend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_timeupdate(node: HTMLElement, eventName: timeupdate, handler: TaggedEventHandler[timeupdate]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_timeupdate(
    node: HTMLElement,
    eventName: timeupdate,
    handler: TaggedEventHandler[timeupdate],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_toggle(node: HTMLElement, eventName: toggle, handler: TaggedEventHandler[toggle], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_toggle(
    node: HTMLElement,
    eventName: toggle,
    handler: TaggedEventHandler[toggle],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_touchcancel(node: HTMLElement, eventName: touchcancel, handler: TaggedEventHandler[touchcancel]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_touchcancel(
    node: HTMLElement,
    eventName: touchcancel,
    handler: TaggedEventHandler[touchcancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_touchend(node: HTMLElement, eventName: touchend, handler: TaggedEventHandler[touchend], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_touchend(
    node: HTMLElement,
    eventName: touchend,
    handler: TaggedEventHandler[touchend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_touchmove(node: HTMLElement, eventName: touchmove, handler: TaggedEventHandler[touchmove], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_touchmove(
    node: HTMLElement,
    eventName: touchmove,
    handler: TaggedEventHandler[touchmove],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_touchstart(node: HTMLElement, eventName: touchstart, handler: TaggedEventHandler[touchstart]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_touchstart(
    node: HTMLElement,
    eventName: touchstart,
    handler: TaggedEventHandler[touchstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_transitioncancel(node: HTMLElement, eventName: transitioncancel, handler: TaggedEventHandler[transitioncancel]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_transitioncancel(
    node: HTMLElement,
    eventName: transitioncancel,
    handler: TaggedEventHandler[transitioncancel],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_transitionend(node: HTMLElement, eventName: transitionend, handler: TaggedEventHandler[transitionend]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_transitionend(
    node: HTMLElement,
    eventName: transitionend,
    handler: TaggedEventHandler[transitionend],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_transitionrun(node: HTMLElement, eventName: transitionrun, handler: TaggedEventHandler[transitionrun]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_transitionrun(
    node: HTMLElement,
    eventName: transitionrun,
    handler: TaggedEventHandler[transitionrun],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_transitionstart(node: HTMLElement, eventName: transitionstart, handler: TaggedEventHandler[transitionstart]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_transitionstart(
    node: HTMLElement,
    eventName: transitionstart,
    handler: TaggedEventHandler[transitionstart],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_volumechange(node: HTMLElement, eventName: volumechange, handler: TaggedEventHandler[volumechange]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: Boolean
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_volumechange(
    node: HTMLElement,
    eventName: volumechange,
    handler: TaggedEventHandler[volumechange],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_waiting(node: HTMLElement, eventName: waiting, handler: TaggedEventHandler[waiting], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_waiting(
    node: HTMLElement,
    eventName: waiting,
    handler: TaggedEventHandler[waiting],
    options: EventListenerOptions
  ): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel]): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_wheel(node: HTMLElement, eventName: wheel, handler: TaggedEventHandler[wheel], options: Boolean): Unit = js.native
  @JSImport("dom-helpers/cjs/removeEventListener", JSImport.Default)
  @js.native
  def default_wheel(
    node: HTMLElement,
    eventName: wheel,
    handler: TaggedEventHandler[wheel],
    options: EventListenerOptions
  ): Unit = js.native
}
