package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.Action
import typings.oracleOraclejet.anon.ConverterHint
import typings.oracleOraclejet.anon.Definition
import typings.oracleOraclejet.anon.Element
import typings.oracleOraclejet.anon.Instruction
import typings.oracleOraclejet.anon.NumberRange
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.ojeditablevalueMod.editableValue
import typings.oracleOraclejet.ojeditablevalueMod.editableValueEventMap
import typings.oracleOraclejet.ojeditablevalueMod.editableValueSettableProperties
import typings.oracleOraclejet.ojinputnumberMod.ojInputNumber.ojAnimateEnd
import typings.oracleOraclejet.ojinputnumberMod.ojInputNumber.ojAnimateStart
import typings.oracleOraclejet.ojmessagingMod.^
import typings.oracleOraclejet.ojvalidationBaseMod.AsyncValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Converter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredConverter
import typings.oracleOraclejet.ojvalidationBaseMod.Validation.RegisteredValidator
import typings.oracleOraclejet.ojvalidationBaseMod.Validator
import typings.oracleOraclejet.oracleOraclejetStrings.asyncValidators
import typings.oracleOraclejet.oracleOraclejetStrings.asyncValidatorsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.autocomplete
import typings.oracleOraclejet.oracleOraclejetStrings.autocompleteChanged
import typings.oracleOraclejet.oracleOraclejetStrings.autofocus
import typings.oracleOraclejet.oracleOraclejetStrings.autofocusChanged
import typings.oracleOraclejet.oracleOraclejetStrings.converter
import typings.oracleOraclejet.oracleOraclejetStrings.converterChanged
import typings.oracleOraclejet.oracleOraclejetStrings.invalidHidden
import typings.oracleOraclejet.oracleOraclejetStrings.invalidShown
import typings.oracleOraclejet.oracleOraclejetStrings.max
import typings.oracleOraclejet.oracleOraclejetStrings.maxChanged
import typings.oracleOraclejet.oracleOraclejetStrings.min
import typings.oracleOraclejet.oracleOraclejetStrings.minChanged
import typings.oracleOraclejet.oracleOraclejetStrings.number
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.pending
import typings.oracleOraclejet.oracleOraclejetStrings.placeholder
import typings.oracleOraclejet.oracleOraclejetStrings.placeholderChanged
import typings.oracleOraclejet.oracleOraclejetStrings.rawValueChanged
import typings.oracleOraclejet.oracleOraclejetStrings.readonlyChanged_
import typings.oracleOraclejet.oracleOraclejetStrings.readonly_
import typings.oracleOraclejet.oracleOraclejetStrings.required
import typings.oracleOraclejet.oracleOraclejetStrings.requiredChanged
import typings.oracleOraclejet.oracleOraclejetStrings.step
import typings.oracleOraclejet.oracleOraclejetStrings.stepChanged
import typings.oracleOraclejet.oracleOraclejetStrings.text
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.oracleOraclejet.oracleOraclejetStrings.valid
import typings.oracleOraclejet.oracleOraclejetStrings.validators
import typings.oracleOraclejet.oracleOraclejetStrings.validatorsChanged
import typings.oracleOraclejet.oracleOraclejetStrings.value
import typings.oracleOraclejet.oracleOraclejetStrings.virtualKeyboard
import typings.oracleOraclejet.oracleOraclejetStrings.virtualKeyboardChanged
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CustomEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
import typings.std.Event
import typings.std.EventTarget
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.ProgressEvent
import typings.std.SecurityPolicyViolationEvent
import typings.std.TouchEvent
import typings.std.TransitionEvent
import typings.std.UIEvent
import typings.std.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojinputnumberMod {
  
  @js.native
  trait ojInputNumber extends editableValue[Double | Null, ojInputNumberSettableProperties, Double | Null, String] {
    
    def addEventListener(
      `type`: autocompleteChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | String], _]
    ): Unit = js.native
    def addEventListener(
      `type`: autocompleteChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[on | off | String], _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: virtualKeyboardChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | number | text], _]
    ): Unit = js.native
    def addEventListener(
      `type`: virtualKeyboardChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[auto | number | text], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_asyncValidatorsChanged(
      `type`: asyncValidatorsChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[js.Array[AsyncValidator[Double]]], 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_asyncValidatorsChanged(
      `type`: asyncValidatorsChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[js.Array[AsyncValidator[Double]]], 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autofocusChanged(
      `type`: autofocusChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_autofocusChanged(
      `type`: autofocusChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_converterChanged(
      `type`: converterChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[Converter[Double] | RegisteredConverter], 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_converterChanged(
      `type`: converterChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[Converter[Double] | RegisteredConverter], 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_maxChanged(
      `type`: maxChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_maxChanged(
      `type`: maxChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_minChanged(
      `type`: minChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_minChanged(
      `type`: minChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_placeholderChanged(
      `type`: placeholderChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_placeholderChanged(
      `type`: placeholderChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_rawValueChanged(
      `type`: rawValueChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_rawValueChanged(
      `type`: rawValueChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readonlyChanged(
      `type`: readonlyChanged_,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean | Null], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_readonlyChanged(
      `type`: readonlyChanged_,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean | Null], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_requiredChanged(
      `type`: requiredChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_requiredChanged(
      `type`: requiredChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Boolean], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stepChanged(
      `type`: stepChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_stepChanged(
      `type`: stepChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Double | Null], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_validatorsChanged(
      `type`: validatorsChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[js.Array[Validator[Double] | RegisteredValidator]], 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_validatorsChanged(
      `type`: validatorsChanged,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ JetElementCustomEvent[js.Array[Validator[Double] | RegisteredValidator]], 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    
    var asyncValidators: js.Array[AsyncValidator[Double]] = js.native
    
    var autocomplete: on | off | String = js.native
    
    var converter: Converter[Double] | RegisteredConverter = js.native
    
    @JSName("getProperty")
    def getProperty_asyncValidators(property: asyncValidators): js.Array[AsyncValidator[Double]] = js.native
    @JSName("getProperty")
    def getProperty_autocomplete(property: autocomplete): on | off | String = js.native
    @JSName("getProperty")
    def getProperty_autofocus(property: autofocus): Boolean = js.native
    @JSName("getProperty")
    def getProperty_converter(property: converter): Converter[Double] | RegisteredConverter = js.native
    @JSName("getProperty")
    def getProperty_max(property: max): Double | Null = js.native
    @JSName("getProperty")
    def getProperty_min(property: min): Double | Null = js.native
    @JSName("getProperty")
    def getProperty_placeholder(property: placeholder): String | Null = js.native
    @JSName("getProperty")
    def getProperty_rawValue(property: typings.oracleOraclejet.oracleOraclejetStrings.rawValue): String = js.native
    @JSName("getProperty")
    def getProperty_readonly(property: readonly_): Boolean | Null = js.native
    @JSName("getProperty")
    def getProperty_required(property: required): Boolean = js.native
    @JSName("getProperty")
    def getProperty_step(property: step): Double | Null = js.native
    @JSName("getProperty")
    def getProperty_validators(property: validators): js.Array[Validator[Double] | RegisteredValidator] = js.native
    @JSName("getProperty")
    def getProperty_virtualKeyboard(property: virtualKeyboard): auto | number | text = js.native
    
    var max: Double | Null = js.native
    
    var min: Double | Null = js.native
    
    var onAsyncValidatorsChanged: (js.Function1[/* event */ JetElementCustomEvent[js.Array[AsyncValidator[Double]]], _]) | Null = js.native
    
    var onAutocompleteChanged: (js.Function1[/* event */ JetElementCustomEvent[on | off | String], _]) | Null = js.native
    
    var onAutofocusChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
    
    var onConverterChanged: (js.Function1[/* event */ JetElementCustomEvent[Converter[Double] | RegisteredConverter], _]) | Null = js.native
    
    var onMaxChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
    
    var onMinChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
    
    @JSName("onOjAnimateEnd")
    var onOjAnimateEnd_ojInputNumber: (js.Function1[/* event */ ojAnimateEnd, _]) | Null = js.native
    
    @JSName("onOjAnimateStart")
    var onOjAnimateStart_ojInputNumber: (js.Function1[/* event */ ojAnimateStart, _]) | Null = js.native
    
    var onPlaceholderChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
    
    var onRawValueChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
    
    var onReadonlyChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean | Null], _]) | Null = js.native
    
    var onRequiredChanged: (js.Function1[/* event */ JetElementCustomEvent[Boolean], _]) | Null = js.native
    
    var onStepChanged: (js.Function1[/* event */ JetElementCustomEvent[Double | Null], _]) | Null = js.native
    
    var onValidatorsChanged: (js.Function1[
        /* event */ JetElementCustomEvent[js.Array[Validator[Double] | RegisteredValidator]], 
        _
      ]) | Null = js.native
    
    var onVirtualKeyboardChanged: (js.Function1[/* event */ JetElementCustomEvent[auto | number | text], _]) | Null = js.native
    
    var placeholder: String | Null = js.native
    
    val rawValue: String = js.native
    
    var readonly: Boolean | Null = js.native
    
    var required: Boolean = js.native
    
    def setProperties(properties: ojInputNumberSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: autocomplete, value: off): Unit = js.native
    def setProperty(property: autocomplete, value: on): Unit = js.native
    def setProperty(property: virtualKeyboard, value: auto): Unit = js.native
    def setProperty(property: virtualKeyboard, value: number): Unit = js.native
    def setProperty(property: virtualKeyboard, value: text): Unit = js.native
    @JSName("setProperty")
    def setProperty_asyncValidators(property: asyncValidators, value: js.Array[AsyncValidator[Double]]): Unit = js.native
    @JSName("setProperty")
    def setProperty_autocomplete(property: autocomplete, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_autofocus(property: autofocus, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_converter(property: converter, value: Converter[Double]): Unit = js.native
    @JSName("setProperty")
    def setProperty_converter(property: converter, value: RegisteredConverter): Unit = js.native
    @JSName("setProperty")
    def setProperty_max(property: max): Unit = js.native
    @JSName("setProperty")
    def setProperty_max(property: max, value: Double): Unit = js.native
    @JSName("setProperty")
    def setProperty_min(property: min): Unit = js.native
    @JSName("setProperty")
    def setProperty_min(property: min, value: Double): Unit = js.native
    @JSName("setProperty")
    def setProperty_placeholder(property: placeholder): Unit = js.native
    @JSName("setProperty")
    def setProperty_placeholder(property: placeholder, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_rawValue(property: typings.oracleOraclejet.oracleOraclejetStrings.rawValue, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_readonly(property: readonly_): Unit = js.native
    @JSName("setProperty")
    def setProperty_readonly(property: readonly_, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_required(property: required, value: Boolean): Unit = js.native
    @JSName("setProperty")
    def setProperty_step(property: step): Unit = js.native
    @JSName("setProperty")
    def setProperty_step(property: step, value: Double): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: NumberRange): Unit = js.native
    @JSName("setProperty")
    def setProperty_validators(property: validators, value: js.Array[Validator[Double] | RegisteredValidator]): Unit = js.native
    @JSName("setProperty")
    def setProperty_value(property: value): Unit = js.native
    @JSName("setProperty")
    def setProperty_value(property: value, value: Double): Unit = js.native
    
    var step: Double | Null = js.native
    
    def stepDown(): Unit = js.native
    def stepDown(steps: Double): Unit = js.native
    
    def stepUp(): Unit = js.native
    def stepUp(steps: Double): Unit = js.native
    
    @JSName("translations")
    var translations_ojInputNumber: NumberRange = js.native
    
    def validate(): js.Promise[String] = js.native
    
    var validators: js.Array[Validator[Double] | RegisteredValidator] = js.native
    
    var virtualKeyboard: auto | number | text = js.native
  }
  object ojInputNumber {
    
    type ojAnimateEnd = CustomEvent[Action]
    
    type ojAnimateStart = CustomEvent[Element]
  }
  
  @js.native
  trait ojInputNumberEventMap extends editableValueEventMap[Double | Null, ojInputNumberSettableProperties, Double | Null, String] {
    
    var asyncValidatorsChanged: JetElementCustomEvent[js.Array[AsyncValidator[Double]]] = js.native
    
    var autocompleteChanged: JetElementCustomEvent[on | off | String] = js.native
    
    var autofocusChanged: JetElementCustomEvent[Boolean] = js.native
    
    var converterChanged: JetElementCustomEvent[Converter[Double] | RegisteredConverter] = js.native
    
    var maxChanged: JetElementCustomEvent[Double | Null] = js.native
    
    var minChanged: JetElementCustomEvent[Double | Null] = js.native
    
    @JSName("ojAnimateEnd")
    var ojAnimateEnd_ojInputNumberEventMap: ojAnimateEnd = js.native
    
    @JSName("ojAnimateStart")
    var ojAnimateStart_ojInputNumberEventMap: ojAnimateStart = js.native
    
    var placeholderChanged: JetElementCustomEvent[String | Null] = js.native
    
    var rawValueChanged: JetElementCustomEvent[String] = js.native
    
    var readonlyChanged: JetElementCustomEvent[Boolean | Null] = js.native
    
    var requiredChanged: JetElementCustomEvent[Boolean] = js.native
    
    var stepChanged: JetElementCustomEvent[Double | Null] = js.native
    
    var validatorsChanged: JetElementCustomEvent[js.Array[Validator[Double] | RegisteredValidator]] = js.native
    
    var virtualKeyboardChanged: JetElementCustomEvent[auto | number | text] = js.native
  }
  object ojInputNumberEventMap {
    
    @scala.inline
    def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      asyncValidatorsChanged: JetElementCustomEvent[js.Array[AsyncValidator[Double]]],
      autocompleteChanged: JetElementCustomEvent[on | off | String],
      autofocusChanged: JetElementCustomEvent[Boolean],
      auxclick: MouseEvent,
      blur: FocusEvent,
      cancel: Event,
      canplay: Event,
      canplaythrough: Event,
      change: Event,
      click: MouseEvent,
      close: Event,
      contextmenu: MouseEvent,
      converterChanged: JetElementCustomEvent[Converter[Double] | RegisteredConverter],
      copy: ClipboardEvent,
      cuechange: Event,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      describedByChanged: JetElementCustomEvent[String | Null],
      disabledChanged: JetElementCustomEvent[Boolean],
      displayOptionsChanged: JetElementCustomEvent[ConverterHint],
      drag: DragEvent,
      dragend: DragEvent,
      dragenter: DragEvent,
      dragexit: Event,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: Event,
      emptied: Event,
      ended: Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      fullscreenchange: Event,
      fullscreenerror: Event,
      gotpointercapture: PointerEvent,
      helpChanged: JetElementCustomEvent[Instruction],
      helpHintsChanged: JetElementCustomEvent[Definition],
      input: Event,
      invalid: Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      labelHintChanged: JetElementCustomEvent[String],
      load: Event,
      loadeddata: Event,
      loadedmetadata: Event,
      loadstart: Event,
      lostpointercapture: PointerEvent,
      maxChanged: JetElementCustomEvent[Double | Null],
      messagesCustomChanged: JetElementCustomEvent[js.Array[^]],
      minChanged: JetElementCustomEvent[Double | Null],
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojAnimateEnd: ojAnimateEnd,
      ojAnimateStart: ojAnimateStart,
      paste: ClipboardEvent,
      pause: Event,
      placeholderChanged: JetElementCustomEvent[String | Null],
      play: Event,
      playing: Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      progress: ProgressEvent[EventTarget],
      ratechange: Event,
      rawValueChanged: JetElementCustomEvent[String],
      readonlyChanged: JetElementCustomEvent[Boolean | Null],
      requiredChanged: JetElementCustomEvent[Boolean],
      reset: Event,
      resize: UIEvent,
      scroll: Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: Event,
      seeking: Event,
      select: Event,
      selectionchange: Event,
      selectstart: Event,
      stalled: Event,
      stepChanged: JetElementCustomEvent[Double | Null],
      submit: Event,
      suspend: Event,
      timeupdate: Event,
      toggle: Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      translationsChanged: JetElementCustomEvent[js.Object | Null],
      validChanged: JetElementCustomEvent[valid | pending | invalidHidden | invalidShown],
      validatorsChanged: JetElementCustomEvent[js.Array[Validator[Double] | RegisteredValidator]],
      valueChanged: JetElementCustomEvent[Double | Null],
      virtualKeyboardChanged: JetElementCustomEvent[auto | number | text],
      volumechange: Event,
      waiting: Event,
      wheel: WheelEvent
    ): ojInputNumberEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], asyncValidatorsChanged = asyncValidatorsChanged.asInstanceOf[js.Any], autocompleteChanged = autocompleteChanged.asInstanceOf[js.Any], autofocusChanged = autofocusChanged.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], converterChanged = converterChanged.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], describedByChanged = describedByChanged.asInstanceOf[js.Any], disabledChanged = disabledChanged.asInstanceOf[js.Any], displayOptionsChanged = displayOptionsChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], helpChanged = helpChanged.asInstanceOf[js.Any], helpHintsChanged = helpHintsChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], labelHintChanged = labelHintChanged.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], maxChanged = maxChanged.asInstanceOf[js.Any], messagesCustomChanged = messagesCustomChanged.asInstanceOf[js.Any], minChanged = minChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], placeholderChanged = placeholderChanged.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], rawValueChanged = rawValueChanged.asInstanceOf[js.Any], readonlyChanged = readonlyChanged.asInstanceOf[js.Any], requiredChanged = requiredChanged.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], stepChanged = stepChanged.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], validChanged = validChanged.asInstanceOf[js.Any], validatorsChanged = validatorsChanged.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any], virtualKeyboardChanged = virtualKeyboardChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojInputNumberEventMap]
    }
    
    @scala.inline
    implicit class ojInputNumberEventMapMutableBuilder[Self <: ojInputNumberEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncValidatorsChanged(value: JetElementCustomEvent[js.Array[AsyncValidator[Double]]]): Self = StObject.set(x, "asyncValidatorsChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocompleteChanged(value: JetElementCustomEvent[on | off | String]): Self = StObject.set(x, "autocompleteChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutofocusChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "autofocusChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConverterChanged(value: JetElementCustomEvent[Converter[Double] | RegisteredConverter]): Self = StObject.set(x, "converterChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxChanged(value: JetElementCustomEvent[Double | Null]): Self = StObject.set(x, "maxChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinChanged(value: JetElementCustomEvent[Double | Null]): Self = StObject.set(x, "minChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateEnd(value: ojAnimateEnd): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateStart(value: ojAnimateStart): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderChanged(value: JetElementCustomEvent[String | Null]): Self = StObject.set(x, "placeholderChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawValueChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "rawValueChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlyChanged(value: JetElementCustomEvent[Boolean | Null]): Self = StObject.set(x, "readonlyChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredChanged(value: JetElementCustomEvent[Boolean]): Self = StObject.set(x, "requiredChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepChanged(value: JetElementCustomEvent[Double | Null]): Self = StObject.set(x, "stepChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorsChanged(value: JetElementCustomEvent[js.Array[Validator[Double] | RegisteredValidator]]): Self = StObject.set(x, "validatorsChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualKeyboardChanged(value: JetElementCustomEvent[auto | number | text]): Self = StObject.set(x, "virtualKeyboardChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ojInputNumberSettableProperties extends editableValueSettableProperties[Double | Null, Double | Null, String] {
    
    var asyncValidators: js.Array[AsyncValidator[Double]] = js.native
    
    var autocomplete: on | off | String = js.native
    
    var autofocus: Boolean = js.native
    
    var converter: Converter[Double] | RegisteredConverter = js.native
    
    var max: Double | Null = js.native
    
    var min: Double | Null = js.native
    
    var placeholder: String | Null = js.native
    
    val rawValue: String = js.native
    
    var readonly: Boolean | Null = js.native
    
    var required: Boolean = js.native
    
    var step: Double | Null = js.native
    
    @JSName("translations")
    var translations_ojInputNumberSettableProperties: NumberRange = js.native
    
    var validators: js.Array[Validator[Double] | RegisteredValidator] = js.native
    
    var virtualKeyboard: auto | number | text = js.native
  }
  object ojInputNumberSettableProperties {
    
    @scala.inline
    def apply(
      asyncValidators: js.Array[AsyncValidator[Double]],
      autocomplete: on | off | String,
      autofocus: Boolean,
      converter: Converter[Double] | RegisteredConverter,
      disabled: Boolean,
      displayOptions: ConverterHint,
      help: Instruction,
      helpHints: Definition,
      labelHint: String,
      messagesCustom: js.Array[^],
      rawValue: String,
      required: Boolean,
      translations: NumberRange,
      valid: valid | pending | invalidHidden | invalidShown,
      validators: js.Array[Validator[Double] | RegisteredValidator],
      virtualKeyboard: auto | number | text
    ): ojInputNumberSettableProperties = {
      val __obj = js.Dynamic.literal(asyncValidators = asyncValidators.asInstanceOf[js.Any], autocomplete = autocomplete.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], displayOptions = displayOptions.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], helpHints = helpHints.asInstanceOf[js.Any], labelHint = labelHint.asInstanceOf[js.Any], messagesCustom = messagesCustom.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any], virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojInputNumberSettableProperties]
    }
    
    @scala.inline
    implicit class ojInputNumberSettablePropertiesMutableBuilder[Self <: ojInputNumberSettableProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncValidators(value: js.Array[AsyncValidator[Double]]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncValidatorsVarargs(value: AsyncValidator[Double]*): Self = StObject.set(x, "asyncValidators", js.Array(value :_*))
      
      @scala.inline
      def setAutocomplete(value: on | off | String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConverter(value: Converter[Double] | RegisteredConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxNull: Self = StObject.set(x, "max", null)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinNull: Self = StObject.set(x, "min", null)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      @scala.inline
      def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlyNull: Self = StObject.set(x, "readonly", null)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepNull: Self = StObject.set(x, "step", null)
      
      @scala.inline
      def setTranslations(value: NumberRange): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidators(value: js.Array[Validator[Double] | RegisteredValidator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorsVarargs(value: (Validator[Double] | RegisteredValidator)*): Self = StObject.set(x, "validators", js.Array(value :_*))
      
      @scala.inline
      def setVirtualKeyboard(value: auto | number | text): Self = StObject.set(x, "virtualKeyboard", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojinputnumber.ojInputNumberSettableProperties> */
  @js.native
  trait ojInputNumberSettablePropertiesLenient
    extends /* key */ StringDictionary[js.Any] {
    
    var asyncValidators: js.UndefOr[js.Array[AsyncValidator[Double]]] = js.native
    
    var autocomplete: js.UndefOr[on | off | String] = js.native
    
    var autofocus: js.UndefOr[Boolean] = js.native
    
    var converter: js.UndefOr[Converter[Double] | RegisteredConverter] = js.native
    
    var describedBy: js.UndefOr[String | Null] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var displayOptions: js.UndefOr[ConverterHint] = js.native
    
    var help: js.UndefOr[Instruction] = js.native
    
    var helpHints: js.UndefOr[Definition] = js.native
    
    var labelHint: js.UndefOr[String] = js.native
    
    var max: js.UndefOr[Double | Null] = js.native
    
    var messagesCustom: js.UndefOr[js.Array[^]] = js.native
    
    var min: js.UndefOr[Double | Null] = js.native
    
    var placeholder: js.UndefOr[String | Null] = js.native
    
    var rawValue: js.UndefOr[String] = js.native
    
    var readonly: js.UndefOr[Boolean | Null] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var step: js.UndefOr[Double | Null] = js.native
    
    var translations: js.UndefOr[NumberRange] = js.native
    
    var valid: js.UndefOr[
        typings.oracleOraclejet.oracleOraclejetStrings.valid | pending | invalidHidden | invalidShown
      ] = js.native
    
    var validators: js.UndefOr[js.Array[Validator[Double] | RegisteredValidator]] = js.native
    
    var value: js.UndefOr[Double | Null] = js.native
    
    var virtualKeyboard: js.UndefOr[auto | number | text] = js.native
  }
  object ojInputNumberSettablePropertiesLenient {
    
    @scala.inline
    def apply(): ojInputNumberSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojInputNumberSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit class ojInputNumberSettablePropertiesLenientMutableBuilder[Self <: ojInputNumberSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsyncValidators(value: js.Array[AsyncValidator[Double]]): Self = StObject.set(x, "asyncValidators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncValidatorsUndefined: Self = StObject.set(x, "asyncValidators", js.undefined)
      
      @scala.inline
      def setAsyncValidatorsVarargs(value: AsyncValidator[Double]*): Self = StObject.set(x, "asyncValidators", js.Array(value :_*))
      
      @scala.inline
      def setAutocomplete(value: on | off | String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      @scala.inline
      def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
      
      @scala.inline
      def setConverter(value: Converter[Double] | RegisteredConverter): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConverterUndefined: Self = StObject.set(x, "converter", js.undefined)
      
      @scala.inline
      def setDescribedBy(value: String): Self = StObject.set(x, "describedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescribedByNull: Self = StObject.set(x, "describedBy", null)
      
      @scala.inline
      def setDescribedByUndefined: Self = StObject.set(x, "describedBy", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDisplayOptions(value: ConverterHint): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
      
      @scala.inline
      def setHelp(value: Instruction): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpHints(value: Definition): Self = StObject.set(x, "helpHints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpHintsUndefined: Self = StObject.set(x, "helpHints", js.undefined)
      
      @scala.inline
      def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
      
      @scala.inline
      def setLabelHint(value: String): Self = StObject.set(x, "labelHint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelHintUndefined: Self = StObject.set(x, "labelHint", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxNull: Self = StObject.set(x, "max", null)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMessagesCustom(value: js.Array[^]): Self = StObject.set(x, "messagesCustom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesCustomUndefined: Self = StObject.set(x, "messagesCustom", js.undefined)
      
      @scala.inline
      def setMessagesCustomVarargs(value: ^ *): Self = StObject.set(x, "messagesCustom", js.Array(value :_*))
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinNull: Self = StObject.set(x, "min", null)
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderNull: Self = StObject.set(x, "placeholder", null)
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawValueUndefined: Self = StObject.set(x, "rawValue", js.undefined)
      
      @scala.inline
      def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlyNull: Self = StObject.set(x, "readonly", null)
      
      @scala.inline
      def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepNull: Self = StObject.set(x, "step", null)
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setTranslations(value: NumberRange): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
      
      @scala.inline
      def setValid(value: valid | pending | invalidHidden | invalidShown): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      @scala.inline
      def setValidators(value: js.Array[Validator[Double] | RegisteredValidator]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
      
      @scala.inline
      def setValidatorsVarargs(value: (Validator[Double] | RegisteredValidator)*): Self = StObject.set(x, "validators", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueNull: Self = StObject.set(x, "value", null)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVirtualKeyboard(value: auto | number | text): Self = StObject.set(x, "virtualKeyboard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualKeyboardUndefined: Self = StObject.set(x, "virtualKeyboard", js.undefined)
    }
  }
}
