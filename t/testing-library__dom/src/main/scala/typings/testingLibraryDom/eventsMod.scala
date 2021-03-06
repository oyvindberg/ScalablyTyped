package typings.testingLibraryDom

import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.Node
import typings.std.Window
import typings.testingLibraryDom.anon.DefaultInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("@testing-library/dom/types/events", "createEvent")
  @js.native
  val createEvent: CreateObject with CreateFunction = js.native
  
  @JSImport("@testing-library/dom/types/events", "fireEvent")
  @js.native
  val fireEvent: FireFunction with FireObject = js.native
  
  type CreateFunction = js.Function4[
    /* eventName */ String, 
    /* node */ Document | Element | Window | Node, 
    /* init */ js.UndefOr[js.Object], 
    /* options */ js.UndefOr[DefaultInit], 
    Event
  ]
  
  /* Inlined {[ K in @testing-library/dom.@testing-library/dom/types/events.EventType ]: (element : std.Document | std.Element | std.Window | std.Node, options : {} | undefined): std.Event} */
  @js.native
  trait CreateObject extends StObject {
    
    var abort: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var animationEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var animationIteration: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var animationStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var blur: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var canPlay: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var canPlayThrough: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var change: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var click: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var compositionEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var compositionStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var compositionUpdate: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var contextMenu: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var copy: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var cut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var dblClick: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var doubleClick: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var drag: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var dragEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var dragEnter: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var dragExit: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var dragLeave: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var dragOver: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var dragStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var drop: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var durationChange: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var emptied: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var encrypted: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var ended: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var error: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var focus: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var focusIn: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var focusOut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var gotPointerCapture: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var input: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var invalid: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var keyDown: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var keyPress: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var keyUp: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var load: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var loadStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var loadedData: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var loadedMetadata: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var lostPointerCapture: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var mouseDown: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var mouseEnter: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var mouseLeave: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var mouseMove: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var mouseOut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var mouseOver: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var mouseUp: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var paste: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pause: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var play: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var playing: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerCancel: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerDown: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerEnter: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerLeave: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerMove: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerOut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerOver: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var pointerUp: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var popState: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var progress: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var rateChange: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var reset: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var scroll: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var seeked: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var seeking: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var select: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var stalled: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var submit: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var suspend: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var timeUpdate: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var touchCancel: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var touchEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var touchMove: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var touchStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var transitionEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var volumeChange: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var waiting: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
    
    var wheel: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Event
      ] = js.native
  }
  object CreateObject {
    
    @scala.inline
    def apply(
      abort: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      animationEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      animationIteration: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      animationStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      blur: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      canPlay: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      canPlayThrough: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      change: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      click: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      compositionEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      compositionStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      compositionUpdate: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      contextMenu: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      copy: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      cut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dblClick: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      doubleClick: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      drag: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragExit: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      dragStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      drop: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      durationChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      emptied: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      encrypted: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      ended: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      error: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      focus: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      focusIn: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      focusOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      gotPointerCapture: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      input: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      invalid: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      keyDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      keyPress: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      keyUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      load: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      loadStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      loadedData: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      loadedMetadata: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      lostPointerCapture: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      mouseUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      paste: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pause: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      play: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      playing: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerCancel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      pointerUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      popState: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      progress: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      rateChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      reset: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      scroll: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      seeked: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      seeking: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      select: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      stalled: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      submit: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      suspend: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      timeUpdate: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      touchCancel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      touchEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      touchMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      touchStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      transitionEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      volumeChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      waiting: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event,
      wheel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
    ): CreateObject = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), animationEnd = js.Any.fromFunction2(animationEnd), animationIteration = js.Any.fromFunction2(animationIteration), animationStart = js.Any.fromFunction2(animationStart), blur = js.Any.fromFunction2(blur), canPlay = js.Any.fromFunction2(canPlay), canPlayThrough = js.Any.fromFunction2(canPlayThrough), change = js.Any.fromFunction2(change), click = js.Any.fromFunction2(click), compositionEnd = js.Any.fromFunction2(compositionEnd), compositionStart = js.Any.fromFunction2(compositionStart), compositionUpdate = js.Any.fromFunction2(compositionUpdate), contextMenu = js.Any.fromFunction2(contextMenu), copy = js.Any.fromFunction2(copy), cut = js.Any.fromFunction2(cut), dblClick = js.Any.fromFunction2(dblClick), doubleClick = js.Any.fromFunction2(doubleClick), drag = js.Any.fromFunction2(drag), dragEnd = js.Any.fromFunction2(dragEnd), dragEnter = js.Any.fromFunction2(dragEnter), dragExit = js.Any.fromFunction2(dragExit), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), dragStart = js.Any.fromFunction2(dragStart), drop = js.Any.fromFunction2(drop), durationChange = js.Any.fromFunction2(durationChange), emptied = js.Any.fromFunction2(emptied), encrypted = js.Any.fromFunction2(encrypted), ended = js.Any.fromFunction2(ended), error = js.Any.fromFunction2(error), focus = js.Any.fromFunction2(focus), focusIn = js.Any.fromFunction2(focusIn), focusOut = js.Any.fromFunction2(focusOut), gotPointerCapture = js.Any.fromFunction2(gotPointerCapture), input = js.Any.fromFunction2(input), invalid = js.Any.fromFunction2(invalid), keyDown = js.Any.fromFunction2(keyDown), keyPress = js.Any.fromFunction2(keyPress), keyUp = js.Any.fromFunction2(keyUp), load = js.Any.fromFunction2(load), loadStart = js.Any.fromFunction2(loadStart), loadedData = js.Any.fromFunction2(loadedData), loadedMetadata = js.Any.fromFunction2(loadedMetadata), lostPointerCapture = js.Any.fromFunction2(lostPointerCapture), mouseDown = js.Any.fromFunction2(mouseDown), mouseEnter = js.Any.fromFunction2(mouseEnter), mouseLeave = js.Any.fromFunction2(mouseLeave), mouseMove = js.Any.fromFunction2(mouseMove), mouseOut = js.Any.fromFunction2(mouseOut), mouseOver = js.Any.fromFunction2(mouseOver), mouseUp = js.Any.fromFunction2(mouseUp), paste = js.Any.fromFunction2(paste), pause = js.Any.fromFunction2(pause), play = js.Any.fromFunction2(play), playing = js.Any.fromFunction2(playing), pointerCancel = js.Any.fromFunction2(pointerCancel), pointerDown = js.Any.fromFunction2(pointerDown), pointerEnter = js.Any.fromFunction2(pointerEnter), pointerLeave = js.Any.fromFunction2(pointerLeave), pointerMove = js.Any.fromFunction2(pointerMove), pointerOut = js.Any.fromFunction2(pointerOut), pointerOver = js.Any.fromFunction2(pointerOver), pointerUp = js.Any.fromFunction2(pointerUp), popState = js.Any.fromFunction2(popState), progress = js.Any.fromFunction2(progress), rateChange = js.Any.fromFunction2(rateChange), reset = js.Any.fromFunction2(reset), scroll = js.Any.fromFunction2(scroll), seeked = js.Any.fromFunction2(seeked), seeking = js.Any.fromFunction2(seeking), select = js.Any.fromFunction2(select), stalled = js.Any.fromFunction2(stalled), submit = js.Any.fromFunction2(submit), suspend = js.Any.fromFunction2(suspend), timeUpdate = js.Any.fromFunction2(timeUpdate), touchCancel = js.Any.fromFunction2(touchCancel), touchEnd = js.Any.fromFunction2(touchEnd), touchMove = js.Any.fromFunction2(touchMove), touchStart = js.Any.fromFunction2(touchStart), transitionEnd = js.Any.fromFunction2(transitionEnd), volumeChange = js.Any.fromFunction2(volumeChange), waiting = js.Any.fromFunction2(waiting), wheel = js.Any.fromFunction2(wheel))
      __obj.asInstanceOf[CreateObject]
    }
    
    @scala.inline
    implicit class CreateObjectMutableBuilder[Self <: CreateObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "abort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "animationEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationIteration(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "animationIteration", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "animationStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlur(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanPlay(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "canPlay", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanPlayThrough(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "canPlayThrough", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "compositionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "compositionStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionUpdate(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "compositionUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContextMenu(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "contextMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCopy(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "cut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDblClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dblClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDoubleClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "doubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDrag(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragExit(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragExit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDrop(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDurationChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "durationChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmptied(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "emptied", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEncrypted(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "encrypted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnded(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "ended", js.Any.fromFunction2(value))
      
      @scala.inline
      def setError(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocus(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocusIn(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "focusIn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocusOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "focusOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGotPointerCapture(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "gotPointerCapture", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInput(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInvalid(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "invalid", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "keyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyPress(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "keyPress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "keyUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoad(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "loadStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadedData(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "loadedData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadedMetadata(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "loadedMetadata", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLostPointerCapture(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "lostPointerCapture", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "mouseUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPaste(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "paste", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPause(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pause", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlay(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "play", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlaying(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "playing", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerCancel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "pointerUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPopState(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "popState", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgress(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRateChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "rateChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReset(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "reset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScroll(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeeked(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "seeked", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeeking(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "seeking", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelect(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStalled(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "stalled", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubmit(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "submit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuspend(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "suspend", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTimeUpdate(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "timeUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchCancel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "touchCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "touchEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "touchMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "touchStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransitionEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVolumeChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "volumeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWaiting(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "waiting", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWheel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Event
      ): Self = StObject.set(x, "wheel", js.Any.fromFunction2(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.testingLibraryDom.testingLibraryDomStrings.copy
    - typings.testingLibraryDom.testingLibraryDomStrings.cut
    - typings.testingLibraryDom.testingLibraryDomStrings.paste
    - typings.testingLibraryDom.testingLibraryDomStrings.compositionEnd
    - typings.testingLibraryDom.testingLibraryDomStrings.compositionStart
    - typings.testingLibraryDom.testingLibraryDomStrings.compositionUpdate
    - typings.testingLibraryDom.testingLibraryDomStrings.keyDown
    - typings.testingLibraryDom.testingLibraryDomStrings.keyPress
    - typings.testingLibraryDom.testingLibraryDomStrings.keyUp
    - typings.testingLibraryDom.testingLibraryDomStrings.focus
    - typings.testingLibraryDom.testingLibraryDomStrings.blur
    - typings.testingLibraryDom.testingLibraryDomStrings.focusIn
    - typings.testingLibraryDom.testingLibraryDomStrings.focusOut
    - typings.testingLibraryDom.testingLibraryDomStrings.change
    - typings.testingLibraryDom.testingLibraryDomStrings.input
    - typings.testingLibraryDom.testingLibraryDomStrings.invalid
    - typings.testingLibraryDom.testingLibraryDomStrings.submit
    - typings.testingLibraryDom.testingLibraryDomStrings.reset
    - typings.testingLibraryDom.testingLibraryDomStrings.click
    - typings.testingLibraryDom.testingLibraryDomStrings.contextMenu
    - typings.testingLibraryDom.testingLibraryDomStrings.dblClick
    - typings.testingLibraryDom.testingLibraryDomStrings.drag
    - typings.testingLibraryDom.testingLibraryDomStrings.dragEnd
    - typings.testingLibraryDom.testingLibraryDomStrings.dragEnter
    - typings.testingLibraryDom.testingLibraryDomStrings.dragExit
    - typings.testingLibraryDom.testingLibraryDomStrings.dragLeave
    - typings.testingLibraryDom.testingLibraryDomStrings.dragOver
    - typings.testingLibraryDom.testingLibraryDomStrings.dragStart
    - typings.testingLibraryDom.testingLibraryDomStrings.drop
    - typings.testingLibraryDom.testingLibraryDomStrings.mouseDown
    - typings.testingLibraryDom.testingLibraryDomStrings.mouseEnter
    - typings.testingLibraryDom.testingLibraryDomStrings.mouseLeave
    - typings.testingLibraryDom.testingLibraryDomStrings.mouseMove
    - typings.testingLibraryDom.testingLibraryDomStrings.mouseOut
    - typings.testingLibraryDom.testingLibraryDomStrings.mouseOver
    - typings.testingLibraryDom.testingLibraryDomStrings.mouseUp
    - typings.testingLibraryDom.testingLibraryDomStrings.popState
    - typings.testingLibraryDom.testingLibraryDomStrings.select
    - typings.testingLibraryDom.testingLibraryDomStrings.touchCancel
    - typings.testingLibraryDom.testingLibraryDomStrings.touchEnd
    - typings.testingLibraryDom.testingLibraryDomStrings.touchMove
    - typings.testingLibraryDom.testingLibraryDomStrings.touchStart
    - typings.testingLibraryDom.testingLibraryDomStrings.scroll
    - typings.testingLibraryDom.testingLibraryDomStrings.wheel
    - typings.testingLibraryDom.testingLibraryDomStrings.abort
    - typings.testingLibraryDom.testingLibraryDomStrings.canPlay
    - typings.testingLibraryDom.testingLibraryDomStrings.canPlayThrough
    - typings.testingLibraryDom.testingLibraryDomStrings.durationChange
    - typings.testingLibraryDom.testingLibraryDomStrings.emptied
    - typings.testingLibraryDom.testingLibraryDomStrings.encrypted
    - typings.testingLibraryDom.testingLibraryDomStrings.ended
    - typings.testingLibraryDom.testingLibraryDomStrings.loadedData
    - typings.testingLibraryDom.testingLibraryDomStrings.loadedMetadata
    - typings.testingLibraryDom.testingLibraryDomStrings.loadStart
    - typings.testingLibraryDom.testingLibraryDomStrings.pause
    - typings.testingLibraryDom.testingLibraryDomStrings.play
    - typings.testingLibraryDom.testingLibraryDomStrings.playing
    - typings.testingLibraryDom.testingLibraryDomStrings.progress
    - typings.testingLibraryDom.testingLibraryDomStrings.rateChange
    - typings.testingLibraryDom.testingLibraryDomStrings.seeked
    - typings.testingLibraryDom.testingLibraryDomStrings.seeking
    - typings.testingLibraryDom.testingLibraryDomStrings.stalled
    - typings.testingLibraryDom.testingLibraryDomStrings.suspend
    - typings.testingLibraryDom.testingLibraryDomStrings.timeUpdate
    - typings.testingLibraryDom.testingLibraryDomStrings.volumeChange
    - typings.testingLibraryDom.testingLibraryDomStrings.waiting
    - typings.testingLibraryDom.testingLibraryDomStrings.load
    - typings.testingLibraryDom.testingLibraryDomStrings.error
    - typings.testingLibraryDom.testingLibraryDomStrings.animationStart
    - typings.testingLibraryDom.testingLibraryDomStrings.animationEnd
    - typings.testingLibraryDom.testingLibraryDomStrings.animationIteration
    - typings.testingLibraryDom.testingLibraryDomStrings.transitionEnd
    - typings.testingLibraryDom.testingLibraryDomStrings.doubleClick
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerOver
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerEnter
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerDown
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerMove
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerUp
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerCancel
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerOut
    - typings.testingLibraryDom.testingLibraryDomStrings.pointerLeave
    - typings.testingLibraryDom.testingLibraryDomStrings.gotPointerCapture
    - typings.testingLibraryDom.testingLibraryDomStrings.lostPointerCapture
  */
  trait EventType extends StObject
  object EventType {
    
    @scala.inline
    def abort: typings.testingLibraryDom.testingLibraryDomStrings.abort = "abort".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.abort]
    
    @scala.inline
    def animationEnd: typings.testingLibraryDom.testingLibraryDomStrings.animationEnd = "animationEnd".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.animationEnd]
    
    @scala.inline
    def animationIteration: typings.testingLibraryDom.testingLibraryDomStrings.animationIteration = "animationIteration".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.animationIteration]
    
    @scala.inline
    def animationStart: typings.testingLibraryDom.testingLibraryDomStrings.animationStart = "animationStart".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.animationStart]
    
    @scala.inline
    def blur: typings.testingLibraryDom.testingLibraryDomStrings.blur = "blur".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.blur]
    
    @scala.inline
    def canPlay: typings.testingLibraryDom.testingLibraryDomStrings.canPlay = "canPlay".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.canPlay]
    
    @scala.inline
    def canPlayThrough: typings.testingLibraryDom.testingLibraryDomStrings.canPlayThrough = "canPlayThrough".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.canPlayThrough]
    
    @scala.inline
    def change: typings.testingLibraryDom.testingLibraryDomStrings.change = "change".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.change]
    
    @scala.inline
    def click: typings.testingLibraryDom.testingLibraryDomStrings.click = "click".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.click]
    
    @scala.inline
    def compositionEnd: typings.testingLibraryDom.testingLibraryDomStrings.compositionEnd = "compositionEnd".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.compositionEnd]
    
    @scala.inline
    def compositionStart: typings.testingLibraryDom.testingLibraryDomStrings.compositionStart = "compositionStart".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.compositionStart]
    
    @scala.inline
    def compositionUpdate: typings.testingLibraryDom.testingLibraryDomStrings.compositionUpdate = "compositionUpdate".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.compositionUpdate]
    
    @scala.inline
    def contextMenu: typings.testingLibraryDom.testingLibraryDomStrings.contextMenu = "contextMenu".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.contextMenu]
    
    @scala.inline
    def copy: typings.testingLibraryDom.testingLibraryDomStrings.copy = "copy".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.copy]
    
    @scala.inline
    def cut: typings.testingLibraryDom.testingLibraryDomStrings.cut = "cut".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.cut]
    
    @scala.inline
    def dblClick: typings.testingLibraryDom.testingLibraryDomStrings.dblClick = "dblClick".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.dblClick]
    
    @scala.inline
    def doubleClick: typings.testingLibraryDom.testingLibraryDomStrings.doubleClick = "doubleClick".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.doubleClick]
    
    @scala.inline
    def drag: typings.testingLibraryDom.testingLibraryDomStrings.drag = "drag".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.drag]
    
    @scala.inline
    def dragEnd: typings.testingLibraryDom.testingLibraryDomStrings.dragEnd = "dragEnd".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.dragEnd]
    
    @scala.inline
    def dragEnter: typings.testingLibraryDom.testingLibraryDomStrings.dragEnter = "dragEnter".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.dragEnter]
    
    @scala.inline
    def dragExit: typings.testingLibraryDom.testingLibraryDomStrings.dragExit = "dragExit".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.dragExit]
    
    @scala.inline
    def dragLeave: typings.testingLibraryDom.testingLibraryDomStrings.dragLeave = "dragLeave".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.dragLeave]
    
    @scala.inline
    def dragOver: typings.testingLibraryDom.testingLibraryDomStrings.dragOver = "dragOver".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.dragOver]
    
    @scala.inline
    def dragStart: typings.testingLibraryDom.testingLibraryDomStrings.dragStart = "dragStart".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.dragStart]
    
    @scala.inline
    def drop: typings.testingLibraryDom.testingLibraryDomStrings.drop = "drop".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.drop]
    
    @scala.inline
    def durationChange: typings.testingLibraryDom.testingLibraryDomStrings.durationChange = "durationChange".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.durationChange]
    
    @scala.inline
    def emptied: typings.testingLibraryDom.testingLibraryDomStrings.emptied = "emptied".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.emptied]
    
    @scala.inline
    def encrypted: typings.testingLibraryDom.testingLibraryDomStrings.encrypted = "encrypted".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.encrypted]
    
    @scala.inline
    def ended: typings.testingLibraryDom.testingLibraryDomStrings.ended = "ended".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.ended]
    
    @scala.inline
    def error: typings.testingLibraryDom.testingLibraryDomStrings.error = "error".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.error]
    
    @scala.inline
    def focus: typings.testingLibraryDom.testingLibraryDomStrings.focus = "focus".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.focus]
    
    @scala.inline
    def focusIn: typings.testingLibraryDom.testingLibraryDomStrings.focusIn = "focusIn".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.focusIn]
    
    @scala.inline
    def focusOut: typings.testingLibraryDom.testingLibraryDomStrings.focusOut = "focusOut".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.focusOut]
    
    @scala.inline
    def gotPointerCapture: typings.testingLibraryDom.testingLibraryDomStrings.gotPointerCapture = "gotPointerCapture".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.gotPointerCapture]
    
    @scala.inline
    def input: typings.testingLibraryDom.testingLibraryDomStrings.input = "input".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.input]
    
    @scala.inline
    def invalid: typings.testingLibraryDom.testingLibraryDomStrings.invalid = "invalid".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.invalid]
    
    @scala.inline
    def keyDown: typings.testingLibraryDom.testingLibraryDomStrings.keyDown = "keyDown".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.keyDown]
    
    @scala.inline
    def keyPress: typings.testingLibraryDom.testingLibraryDomStrings.keyPress = "keyPress".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.keyPress]
    
    @scala.inline
    def keyUp: typings.testingLibraryDom.testingLibraryDomStrings.keyUp = "keyUp".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.keyUp]
    
    @scala.inline
    def load: typings.testingLibraryDom.testingLibraryDomStrings.load = "load".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.load]
    
    @scala.inline
    def loadStart: typings.testingLibraryDom.testingLibraryDomStrings.loadStart = "loadStart".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.loadStart]
    
    @scala.inline
    def loadedData: typings.testingLibraryDom.testingLibraryDomStrings.loadedData = "loadedData".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.loadedData]
    
    @scala.inline
    def loadedMetadata: typings.testingLibraryDom.testingLibraryDomStrings.loadedMetadata = "loadedMetadata".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.loadedMetadata]
    
    @scala.inline
    def lostPointerCapture: typings.testingLibraryDom.testingLibraryDomStrings.lostPointerCapture = "lostPointerCapture".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.lostPointerCapture]
    
    @scala.inline
    def mouseDown: typings.testingLibraryDom.testingLibraryDomStrings.mouseDown = "mouseDown".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.mouseDown]
    
    @scala.inline
    def mouseEnter: typings.testingLibraryDom.testingLibraryDomStrings.mouseEnter = "mouseEnter".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.mouseEnter]
    
    @scala.inline
    def mouseLeave: typings.testingLibraryDom.testingLibraryDomStrings.mouseLeave = "mouseLeave".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.mouseLeave]
    
    @scala.inline
    def mouseMove: typings.testingLibraryDom.testingLibraryDomStrings.mouseMove = "mouseMove".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.mouseMove]
    
    @scala.inline
    def mouseOut: typings.testingLibraryDom.testingLibraryDomStrings.mouseOut = "mouseOut".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.mouseOut]
    
    @scala.inline
    def mouseOver: typings.testingLibraryDom.testingLibraryDomStrings.mouseOver = "mouseOver".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.mouseOver]
    
    @scala.inline
    def mouseUp: typings.testingLibraryDom.testingLibraryDomStrings.mouseUp = "mouseUp".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.mouseUp]
    
    @scala.inline
    def paste: typings.testingLibraryDom.testingLibraryDomStrings.paste = "paste".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.paste]
    
    @scala.inline
    def pause: typings.testingLibraryDom.testingLibraryDomStrings.pause = "pause".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pause]
    
    @scala.inline
    def play: typings.testingLibraryDom.testingLibraryDomStrings.play = "play".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.play]
    
    @scala.inline
    def playing: typings.testingLibraryDom.testingLibraryDomStrings.playing = "playing".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.playing]
    
    @scala.inline
    def pointerCancel: typings.testingLibraryDom.testingLibraryDomStrings.pointerCancel = "pointerCancel".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerCancel]
    
    @scala.inline
    def pointerDown: typings.testingLibraryDom.testingLibraryDomStrings.pointerDown = "pointerDown".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerDown]
    
    @scala.inline
    def pointerEnter: typings.testingLibraryDom.testingLibraryDomStrings.pointerEnter = "pointerEnter".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerEnter]
    
    @scala.inline
    def pointerLeave: typings.testingLibraryDom.testingLibraryDomStrings.pointerLeave = "pointerLeave".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerLeave]
    
    @scala.inline
    def pointerMove: typings.testingLibraryDom.testingLibraryDomStrings.pointerMove = "pointerMove".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerMove]
    
    @scala.inline
    def pointerOut: typings.testingLibraryDom.testingLibraryDomStrings.pointerOut = "pointerOut".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerOut]
    
    @scala.inline
    def pointerOver: typings.testingLibraryDom.testingLibraryDomStrings.pointerOver = "pointerOver".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerOver]
    
    @scala.inline
    def pointerUp: typings.testingLibraryDom.testingLibraryDomStrings.pointerUp = "pointerUp".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.pointerUp]
    
    @scala.inline
    def popState: typings.testingLibraryDom.testingLibraryDomStrings.popState = "popState".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.popState]
    
    @scala.inline
    def progress: typings.testingLibraryDom.testingLibraryDomStrings.progress = "progress".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.progress]
    
    @scala.inline
    def rateChange: typings.testingLibraryDom.testingLibraryDomStrings.rateChange = "rateChange".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.rateChange]
    
    @scala.inline
    def reset: typings.testingLibraryDom.testingLibraryDomStrings.reset = "reset".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.reset]
    
    @scala.inline
    def scroll: typings.testingLibraryDom.testingLibraryDomStrings.scroll = "scroll".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.scroll]
    
    @scala.inline
    def seeked: typings.testingLibraryDom.testingLibraryDomStrings.seeked = "seeked".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.seeked]
    
    @scala.inline
    def seeking: typings.testingLibraryDom.testingLibraryDomStrings.seeking = "seeking".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.seeking]
    
    @scala.inline
    def select: typings.testingLibraryDom.testingLibraryDomStrings.select = "select".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.select]
    
    @scala.inline
    def stalled: typings.testingLibraryDom.testingLibraryDomStrings.stalled = "stalled".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.stalled]
    
    @scala.inline
    def submit: typings.testingLibraryDom.testingLibraryDomStrings.submit = "submit".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.submit]
    
    @scala.inline
    def suspend: typings.testingLibraryDom.testingLibraryDomStrings.suspend = "suspend".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.suspend]
    
    @scala.inline
    def timeUpdate: typings.testingLibraryDom.testingLibraryDomStrings.timeUpdate = "timeUpdate".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.timeUpdate]
    
    @scala.inline
    def touchCancel: typings.testingLibraryDom.testingLibraryDomStrings.touchCancel = "touchCancel".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.touchCancel]
    
    @scala.inline
    def touchEnd: typings.testingLibraryDom.testingLibraryDomStrings.touchEnd = "touchEnd".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.touchEnd]
    
    @scala.inline
    def touchMove: typings.testingLibraryDom.testingLibraryDomStrings.touchMove = "touchMove".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.touchMove]
    
    @scala.inline
    def touchStart: typings.testingLibraryDom.testingLibraryDomStrings.touchStart = "touchStart".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.touchStart]
    
    @scala.inline
    def transitionEnd: typings.testingLibraryDom.testingLibraryDomStrings.transitionEnd = "transitionEnd".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.transitionEnd]
    
    @scala.inline
    def volumeChange: typings.testingLibraryDom.testingLibraryDomStrings.volumeChange = "volumeChange".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.volumeChange]
    
    @scala.inline
    def waiting: typings.testingLibraryDom.testingLibraryDomStrings.waiting = "waiting".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.waiting]
    
    @scala.inline
    def wheel: typings.testingLibraryDom.testingLibraryDomStrings.wheel = "wheel".asInstanceOf[typings.testingLibraryDom.testingLibraryDomStrings.wheel]
  }
  
  type FireFunction = js.Function2[/* element */ Document | Element | Window | Node, /* event */ Event, Boolean]
  
  /* Inlined {[ K in @testing-library/dom.@testing-library/dom/types/events.EventType ]: (element : std.Document | std.Element | std.Window | std.Node, options : {} | undefined): boolean} */
  @js.native
  trait FireObject extends StObject {
    
    var abort: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var animationEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var animationIteration: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var animationStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var blur: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var canPlay: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var canPlayThrough: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var change: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var click: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var compositionEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var compositionStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var compositionUpdate: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var contextMenu: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var copy: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var cut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var dblClick: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var doubleClick: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var drag: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var dragEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var dragEnter: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var dragExit: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var dragLeave: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var dragOver: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var dragStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var drop: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var durationChange: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var emptied: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var encrypted: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var ended: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var error: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var focus: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var focusIn: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var focusOut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var gotPointerCapture: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var input: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var invalid: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var keyDown: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var keyPress: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var keyUp: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var load: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var loadStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var loadedData: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var loadedMetadata: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var lostPointerCapture: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var mouseDown: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var mouseEnter: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var mouseLeave: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var mouseMove: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var mouseOut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var mouseOver: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var mouseUp: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var paste: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pause: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var play: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var playing: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerCancel: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerDown: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerEnter: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerLeave: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerMove: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerOut: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerOver: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var pointerUp: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var popState: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var progress: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var rateChange: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var reset: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var scroll: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var seeked: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var seeking: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var select: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var stalled: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var submit: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var suspend: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var timeUpdate: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var touchCancel: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var touchEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var touchMove: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var touchStart: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var transitionEnd: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var volumeChange: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var waiting: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
    
    var wheel: js.Function2[
        /* element */ Document | Element | Window | Node, 
        /* options */ js.UndefOr[js.Object], 
        Boolean
      ] = js.native
  }
  object FireObject {
    
    @scala.inline
    def apply(
      abort: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      animationEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      animationIteration: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      animationStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      blur: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      canPlay: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      canPlayThrough: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      change: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      click: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      compositionEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      compositionStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      compositionUpdate: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      contextMenu: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      copy: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      cut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dblClick: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      doubleClick: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      drag: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragExit: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      dragStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      drop: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      durationChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      emptied: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      encrypted: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      ended: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      error: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      focus: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      focusIn: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      focusOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      gotPointerCapture: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      input: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      invalid: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      keyDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      keyPress: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      keyUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      load: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      loadStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      loadedData: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      loadedMetadata: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      lostPointerCapture: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      mouseUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      paste: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pause: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      play: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      playing: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerCancel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerDown: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerEnter: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerLeave: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerOut: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerOver: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      pointerUp: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      popState: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      progress: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      rateChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      reset: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      scroll: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      seeked: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      seeking: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      select: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      stalled: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      submit: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      suspend: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      timeUpdate: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      touchCancel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      touchEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      touchMove: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      touchStart: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      transitionEnd: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      volumeChange: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      waiting: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean,
      wheel: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
    ): FireObject = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), animationEnd = js.Any.fromFunction2(animationEnd), animationIteration = js.Any.fromFunction2(animationIteration), animationStart = js.Any.fromFunction2(animationStart), blur = js.Any.fromFunction2(blur), canPlay = js.Any.fromFunction2(canPlay), canPlayThrough = js.Any.fromFunction2(canPlayThrough), change = js.Any.fromFunction2(change), click = js.Any.fromFunction2(click), compositionEnd = js.Any.fromFunction2(compositionEnd), compositionStart = js.Any.fromFunction2(compositionStart), compositionUpdate = js.Any.fromFunction2(compositionUpdate), contextMenu = js.Any.fromFunction2(contextMenu), copy = js.Any.fromFunction2(copy), cut = js.Any.fromFunction2(cut), dblClick = js.Any.fromFunction2(dblClick), doubleClick = js.Any.fromFunction2(doubleClick), drag = js.Any.fromFunction2(drag), dragEnd = js.Any.fromFunction2(dragEnd), dragEnter = js.Any.fromFunction2(dragEnter), dragExit = js.Any.fromFunction2(dragExit), dragLeave = js.Any.fromFunction2(dragLeave), dragOver = js.Any.fromFunction2(dragOver), dragStart = js.Any.fromFunction2(dragStart), drop = js.Any.fromFunction2(drop), durationChange = js.Any.fromFunction2(durationChange), emptied = js.Any.fromFunction2(emptied), encrypted = js.Any.fromFunction2(encrypted), ended = js.Any.fromFunction2(ended), error = js.Any.fromFunction2(error), focus = js.Any.fromFunction2(focus), focusIn = js.Any.fromFunction2(focusIn), focusOut = js.Any.fromFunction2(focusOut), gotPointerCapture = js.Any.fromFunction2(gotPointerCapture), input = js.Any.fromFunction2(input), invalid = js.Any.fromFunction2(invalid), keyDown = js.Any.fromFunction2(keyDown), keyPress = js.Any.fromFunction2(keyPress), keyUp = js.Any.fromFunction2(keyUp), load = js.Any.fromFunction2(load), loadStart = js.Any.fromFunction2(loadStart), loadedData = js.Any.fromFunction2(loadedData), loadedMetadata = js.Any.fromFunction2(loadedMetadata), lostPointerCapture = js.Any.fromFunction2(lostPointerCapture), mouseDown = js.Any.fromFunction2(mouseDown), mouseEnter = js.Any.fromFunction2(mouseEnter), mouseLeave = js.Any.fromFunction2(mouseLeave), mouseMove = js.Any.fromFunction2(mouseMove), mouseOut = js.Any.fromFunction2(mouseOut), mouseOver = js.Any.fromFunction2(mouseOver), mouseUp = js.Any.fromFunction2(mouseUp), paste = js.Any.fromFunction2(paste), pause = js.Any.fromFunction2(pause), play = js.Any.fromFunction2(play), playing = js.Any.fromFunction2(playing), pointerCancel = js.Any.fromFunction2(pointerCancel), pointerDown = js.Any.fromFunction2(pointerDown), pointerEnter = js.Any.fromFunction2(pointerEnter), pointerLeave = js.Any.fromFunction2(pointerLeave), pointerMove = js.Any.fromFunction2(pointerMove), pointerOut = js.Any.fromFunction2(pointerOut), pointerOver = js.Any.fromFunction2(pointerOver), pointerUp = js.Any.fromFunction2(pointerUp), popState = js.Any.fromFunction2(popState), progress = js.Any.fromFunction2(progress), rateChange = js.Any.fromFunction2(rateChange), reset = js.Any.fromFunction2(reset), scroll = js.Any.fromFunction2(scroll), seeked = js.Any.fromFunction2(seeked), seeking = js.Any.fromFunction2(seeking), select = js.Any.fromFunction2(select), stalled = js.Any.fromFunction2(stalled), submit = js.Any.fromFunction2(submit), suspend = js.Any.fromFunction2(suspend), timeUpdate = js.Any.fromFunction2(timeUpdate), touchCancel = js.Any.fromFunction2(touchCancel), touchEnd = js.Any.fromFunction2(touchEnd), touchMove = js.Any.fromFunction2(touchMove), touchStart = js.Any.fromFunction2(touchStart), transitionEnd = js.Any.fromFunction2(transitionEnd), volumeChange = js.Any.fromFunction2(volumeChange), waiting = js.Any.fromFunction2(waiting), wheel = js.Any.fromFunction2(wheel))
      __obj.asInstanceOf[FireObject]
    }
    
    @scala.inline
    implicit class FireObjectMutableBuilder[Self <: FireObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "abort", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "animationEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationIteration(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "animationIteration", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAnimationStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "animationStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBlur(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "blur", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanPlay(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "canPlay", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCanPlayThrough(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "canPlayThrough", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "click", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "compositionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "compositionStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompositionUpdate(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "compositionUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setContextMenu(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "contextMenu", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCopy(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "copy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "cut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDblClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dblClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDoubleClick(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "doubleClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDrag(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "drag", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragExit(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragExit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDragStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "dragStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDrop(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDurationChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "durationChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEmptied(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "emptied", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEncrypted(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "encrypted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnded(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "ended", js.Any.fromFunction2(value))
      
      @scala.inline
      def setError(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocus(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "focus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocusIn(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "focusIn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFocusOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "focusOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGotPointerCapture(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "gotPointerCapture", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInput(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "input", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInvalid(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "invalid", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "keyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyPress(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "keyPress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setKeyUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "keyUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoad(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "loadStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadedData(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "loadedData", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLoadedMetadata(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "loadedMetadata", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLostPointerCapture(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "lostPointerCapture", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMouseUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "mouseUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPaste(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "paste", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPause(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pause", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlay(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "play", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPlaying(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "playing", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerCancel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerDown(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerEnter(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerLeave(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerOut(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerOver(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPointerUp(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "pointerUp", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPopState(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "popState", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProgress(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "progress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRateChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "rateChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReset(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "reset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setScroll(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "scroll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeeked(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "seeked", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSeeking(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "seeking", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSelect(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "select", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStalled(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "stalled", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSubmit(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "submit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSuspend(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "suspend", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTimeUpdate(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "timeUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchCancel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "touchCancel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "touchEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchMove(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "touchMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTouchStart(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "touchStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransitionEnd(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "transitionEnd", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVolumeChange(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "volumeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWaiting(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "waiting", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWheel(
        value: (/* element */ Document | Element | Window | Node, /* options */ js.UndefOr[js.Object]) => Boolean
      ): Self = StObject.set(x, "wheel", js.Any.fromFunction2(value))
    }
  }
}
