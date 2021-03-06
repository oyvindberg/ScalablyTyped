package typings.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.anon.DictpropNameAction
import typings.oracleOraclejet.anon.EndCallback
import typings.oracleOraclejet.anon.Event
import typings.oracleOraclejet.anon.LabelCloseIcon
import typings.oracleOraclejet.mod.JetElementCustomEvent
import typings.oracleOraclejet.mod.baseComponent
import typings.oracleOraclejet.mod.baseComponentEventMap
import typings.oracleOraclejet.mod.baseComponentSettableProperties
import typings.oracleOraclejet.ojdialogMod.ojDialog.Position
import typings.oracleOraclejet.oracleOraclejetStrings.`title-bar`
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.cancelBehavior
import typings.oracleOraclejet.oracleOraclejetStrings.cancelBehaviorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.dialogTitle
import typings.oracleOraclejet.oracleOraclejetStrings.dialogTitleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.dragAffordance
import typings.oracleOraclejet.oracleOraclejetStrings.dragAffordanceChanged
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.escape
import typings.oracleOraclejet.oracleOraclejetStrings.fit
import typings.oracleOraclejet.oracleOraclejetStrings.flip
import typings.oracleOraclejet.oracleOraclejetStrings.flipfit
import typings.oracleOraclejet.oracleOraclejetStrings.hide
import typings.oracleOraclejet.oracleOraclejetStrings.icon
import typings.oracleOraclejet.oracleOraclejetStrings.initialVisibility
import typings.oracleOraclejet.oracleOraclejetStrings.initialVisibilityChanged
import typings.oracleOraclejet.oracleOraclejetStrings.left
import typings.oracleOraclejet.oracleOraclejetStrings.modal
import typings.oracleOraclejet.oracleOraclejetStrings.modality
import typings.oracleOraclejet.oracleOraclejetStrings.modalityChanged
import typings.oracleOraclejet.oracleOraclejetStrings.modeless
import typings.oracleOraclejet.oracleOraclejetStrings.none
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateEnd
import typings.oracleOraclejet.oracleOraclejetStrings.ojAnimateStart
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeClose
import typings.oracleOraclejet.oracleOraclejetStrings.ojBeforeOpen
import typings.oracleOraclejet.oracleOraclejetStrings.ojClose
import typings.oracleOraclejet.oracleOraclejetStrings.ojFocus
import typings.oracleOraclejet.oracleOraclejetStrings.ojOpen
import typings.oracleOraclejet.oracleOraclejetStrings.ojResize
import typings.oracleOraclejet.oracleOraclejetStrings.ojResizeStart
import typings.oracleOraclejet.oracleOraclejetStrings.ojResizeStop
import typings.oracleOraclejet.oracleOraclejetStrings.position
import typings.oracleOraclejet.oracleOraclejetStrings.positionChanged
import typings.oracleOraclejet.oracleOraclejetStrings.resizable
import typings.oracleOraclejet.oracleOraclejetStrings.resizeBehavior
import typings.oracleOraclejet.oracleOraclejetStrings.resizeBehaviorChanged
import typings.oracleOraclejet.oracleOraclejetStrings.role
import typings.oracleOraclejet.oracleOraclejetStrings.roleChanged
import typings.oracleOraclejet.oracleOraclejetStrings.show
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import typings.oracleOraclejet.oracleOraclejetStrings.translations
import typings.std.AnimationEvent
import typings.std.ClipboardEvent
import typings.std.CustomEvent
import typings.std.DragEvent
import typings.std.ErrorEvent
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

object ojdialogMod {
  
  @js.native
  trait ojDialog extends baseComponent[ojDialogSettableProperties] {
    
    def addEventListener(
      `type`: cancelBehaviorChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[icon | escape | none], _]
    ): Unit = js.native
    def addEventListener(
      `type`: cancelBehaviorChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[icon | escape | none], _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: dragAffordanceChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`title-bar` | none], _]
    ): Unit = js.native
    def addEventListener(
      `type`: dragAffordanceChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[`title-bar` | none], _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: initialVisibilityChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[hide | show], _]
    ): Unit = js.native
    def addEventListener(
      `type`: initialVisibilityChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[hide | show], _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: modalityChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modal | modeless], _]
    ): Unit = js.native
    def addEventListener(
      `type`: modalityChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[modal | modeless], _],
      useCapture: Boolean
    ): Unit = js.native
    def addEventListener(
      `type`: resizeBehaviorChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[resizable | none], _]
    ): Unit = js.native
    def addEventListener(
      `type`: resizeBehaviorChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[resizable | none], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dialogTitleChanged(
      `type`: dialogTitleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_dialogTitleChanged(
      `type`: dialogTitleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String | Null], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateEnd(
      `type`: ojAnimateEnd,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojAnimateStart(
      `type`: ojAnimateStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeClose(
      `type`: ojBeforeClose,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeClose(
      `type`: ojBeforeClose,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeOpen(
      `type`: ojBeforeOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojBeforeOpen(
      `type`: ojBeforeOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojClose(
      `type`: ojClose,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojClose(
      `type`: ojClose,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojFocus(
      `type`: ojFocus,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojFocus(
      `type`: ojFocus,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojOpen(
      `type`: ojOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojOpen(
      `type`: ojOpen,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResize(
      `type`: ojResize,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResize(
      `type`: ojResize,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResizeStart(
      `type`: ojResizeStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResizeStart(
      `type`: ojResizeStart,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResizeStop(
      `type`: ojResizeStop,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop, 
          _
        ]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_ojResizeStop(
      `type`: ojResizeStop,
      listener: js.ThisFunction1[
          /* this */ HTMLElement, 
          /* ev */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop, 
          _
        ],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_positionChanged(
      `type`: positionChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Position], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_positionChanged(
      `type`: positionChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[Position], _],
      useCapture: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_roleChanged(
      `type`: roleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _]
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_roleChanged(
      `type`: roleChanged,
      listener: js.ThisFunction1[/* this */ HTMLElement, /* ev */ JetElementCustomEvent[String], _],
      useCapture: Boolean
    ): Unit = js.native
    
    var cancelBehavior: icon | escape | none = js.native
    
    def close(): Unit = js.native
    
    var dialogTitle: String | Null = js.native
    
    var dragAffordance: `title-bar` | none = js.native
    
    @JSName("getProperty")
    def getProperty_cancelBehavior(property: cancelBehavior): icon | escape | none = js.native
    @JSName("getProperty")
    def getProperty_dialogTitle(property: dialogTitle): String | Null = js.native
    @JSName("getProperty")
    def getProperty_dragAffordance(property: dragAffordance): `title-bar` | none = js.native
    @JSName("getProperty")
    def getProperty_initialVisibility(property: initialVisibility): hide | show = js.native
    @JSName("getProperty")
    def getProperty_modality(property: modality): modal | modeless = js.native
    @JSName("getProperty")
    def getProperty_position(property: position): Position = js.native
    @JSName("getProperty")
    def getProperty_resizeBehavior(property: resizeBehavior): resizable | none = js.native
    @JSName("getProperty")
    def getProperty_role(property: role): String = js.native
    
    var initialVisibility: hide | show = js.native
    
    def isOpen(): Boolean = js.native
    
    var modality: modal | modeless = js.native
    
    var onCancelBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[icon | escape | none], _]) | Null = js.native
    
    var onDialogTitleChanged: (js.Function1[/* event */ JetElementCustomEvent[String | Null], _]) | Null = js.native
    
    var onDragAffordanceChanged: (js.Function1[/* event */ JetElementCustomEvent[`title-bar` | none], _]) | Null = js.native
    
    var onInitialVisibilityChanged: (js.Function1[/* event */ JetElementCustomEvent[hide | show], _]) | Null = js.native
    
    var onModalityChanged: (js.Function1[/* event */ JetElementCustomEvent[modal | modeless], _]) | Null = js.native
    
    var onOjAnimateEnd: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd, _]) | Null = js.native
    
    var onOjAnimateStart: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart, _]) | Null = js.native
    
    var onOjBeforeClose: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose, _]) | Null = js.native
    
    var onOjBeforeOpen: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen, _]) | Null = js.native
    
    var onOjClose: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose, _]) | Null = js.native
    
    var onOjFocus: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus, _]) | Null = js.native
    
    var onOjOpen: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen, _]) | Null = js.native
    
    var onOjResize: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize, _]) | Null = js.native
    
    var onOjResizeStart: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart, _]) | Null = js.native
    
    var onOjResizeStop: (js.Function1[/* event */ typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop, _]) | Null = js.native
    
    var onPositionChanged: (js.Function1[/* event */ JetElementCustomEvent[Position], _]) | Null = js.native
    
    var onResizeBehaviorChanged: (js.Function1[/* event */ JetElementCustomEvent[resizable | none], _]) | Null = js.native
    
    var onRoleChanged: (js.Function1[/* event */ JetElementCustomEvent[String], _]) | Null = js.native
    
    def open(): Unit = js.native
    
    var position: Position = js.native
    
    var resizeBehavior: resizable | none = js.native
    
    var role: String = js.native
    
    def setProperties(properties: ojDialogSettablePropertiesLenient): Unit = js.native
    
    def setProperty(property: cancelBehavior, value: escape): Unit = js.native
    def setProperty(property: cancelBehavior, value: icon): Unit = js.native
    def setProperty(property: cancelBehavior, value: none): Unit = js.native
    def setProperty(property: dragAffordance, value: `title-bar`): Unit = js.native
    def setProperty(property: dragAffordance, value: none): Unit = js.native
    def setProperty(property: initialVisibility, value: hide): Unit = js.native
    def setProperty(property: initialVisibility, value: show): Unit = js.native
    def setProperty(property: modality, value: modal): Unit = js.native
    def setProperty(property: modality, value: modeless): Unit = js.native
    def setProperty(property: resizeBehavior, value: none): Unit = js.native
    def setProperty(property: resizeBehavior, value: resizable): Unit = js.native
    @JSName("setProperty")
    def setProperty_dialogTitle(property: dialogTitle): Unit = js.native
    @JSName("setProperty")
    def setProperty_dialogTitle(property: dialogTitle, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_position(property: position, value: Position): Unit = js.native
    @JSName("setProperty")
    def setProperty_role(property: role, value: String): Unit = js.native
    @JSName("setProperty")
    def setProperty_translations(property: translations, value: LabelCloseIcon): Unit = js.native
    
    @JSName("translations")
    var translations_ojDialog: LabelCloseIcon = js.native
  }
  object ojDialog {
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait Position extends StObject {
      
      var at: js.UndefOr[PositionAlign] = js.native
      
      var collision: js.UndefOr[flip | fit | flipfit | none] = js.native
      
      var my: js.UndefOr[PositionAlign] = js.native
      
      var of: js.UndefOr[String | PositionPoint] = js.native
      
      var offset: js.UndefOr[PositionPoint] = js.native
    }
    object Position {
      
      @scala.inline
      def apply(): Position = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Position]
      }
      
      @scala.inline
      implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAt(value: PositionAlign): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
        
        @scala.inline
        def setCollision(value: flip | fit | flipfit | none): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
        
        @scala.inline
        def setMy(value: PositionAlign): Self = StObject.set(x, "my", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMyUndefined: Self = StObject.set(x, "my", js.undefined)
        
        @scala.inline
        def setOf(value: String | PositionPoint): Self = StObject.set(x, "of", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOfUndefined: Self = StObject.set(x, "of", js.undefined)
        
        @scala.inline
        def setOffset(value: PositionPoint): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait PositionAlign extends StObject {
      
      var horizontal: js.UndefOr[start | end | left | center | bottom] = js.native
      
      var vertical: js.UndefOr[top | bottom | center] = js.native
    }
    object PositionAlign {
      
      @scala.inline
      def apply(): PositionAlign = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionAlign]
      }
      
      @scala.inline
      implicit class PositionAlignMutableBuilder[Self <: PositionAlign] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHorizontal(value: start | end | left | center | bottom): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
        
        @scala.inline
        def setVertical(value: top | bottom | center): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      }
    }
    
    // tslint:disable-next-line interface-over-type-literal
    @js.native
    trait PositionPoint extends StObject {
      
      var x: js.UndefOr[Double] = js.native
      
      var y: js.UndefOr[Double] = js.native
    }
    object PositionPoint {
      
      @scala.inline
      def apply(): PositionPoint = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PositionPoint]
      }
      
      @scala.inline
      implicit class PositionPointMutableBuilder[Self <: PositionPoint] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setXUndefined: Self = StObject.set(x, "x", js.undefined)
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      }
    }
    
    type ojAnimateEnd = CustomEvent[DictpropNameAction]
    
    type ojAnimateStart = CustomEvent[EndCallback]
    
    type ojBeforeClose = CustomEvent[Event]
    
    type ojBeforeOpen = CustomEvent[Event]
    
    type ojClose = CustomEvent[Event]
    
    type ojFocus = CustomEvent[Event]
    
    type ojOpen = CustomEvent[Event]
    
    type ojResize = CustomEvent[Event]
    
    type ojResizeStart = CustomEvent[Event]
    
    type ojResizeStop = CustomEvent[Event]
  }
  
  @js.native
  trait ojDialogEventMap extends baseComponentEventMap[ojDialogSettableProperties] {
    
    var cancelBehaviorChanged: JetElementCustomEvent[icon | escape | none] = js.native
    
    var dialogTitleChanged: JetElementCustomEvent[String | Null] = js.native
    
    var dragAffordanceChanged: JetElementCustomEvent[`title-bar` | none] = js.native
    
    var initialVisibilityChanged: JetElementCustomEvent[hide | show] = js.native
    
    var modalityChanged: JetElementCustomEvent[modal | modeless] = js.native
    
    var ojAnimateEnd: typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd = js.native
    
    var ojAnimateStart: typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart = js.native
    
    var ojBeforeClose: typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose = js.native
    
    var ojBeforeOpen: typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen = js.native
    
    var ojClose: typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose = js.native
    
    var ojFocus: typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus = js.native
    
    var ojOpen: typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen = js.native
    
    var ojResize: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize = js.native
    
    var ojResizeStart: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart = js.native
    
    var ojResizeStop: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop = js.native
    
    var positionChanged: JetElementCustomEvent[Position] = js.native
    
    var resizeBehaviorChanged: JetElementCustomEvent[resizable | none] = js.native
    
    var roleChanged: JetElementCustomEvent[String] = js.native
  }
  object ojDialogEventMap {
    
    @scala.inline
    def apply(
      abort: UIEvent,
      animationcancel: AnimationEvent,
      animationend: AnimationEvent,
      animationiteration: AnimationEvent,
      animationstart: AnimationEvent,
      auxclick: MouseEvent,
      blur: FocusEvent,
      cancel: typings.std.Event,
      cancelBehaviorChanged: JetElementCustomEvent[icon | escape | none],
      canplay: typings.std.Event,
      canplaythrough: typings.std.Event,
      change: typings.std.Event,
      click: MouseEvent,
      close: typings.std.Event,
      contextmenu: MouseEvent,
      copy: ClipboardEvent,
      cuechange: typings.std.Event,
      cut: ClipboardEvent,
      dblclick: MouseEvent,
      dialogTitleChanged: JetElementCustomEvent[String | Null],
      drag: DragEvent,
      dragAffordanceChanged: JetElementCustomEvent[`title-bar` | none],
      dragend: DragEvent,
      dragenter: DragEvent,
      dragexit: typings.std.Event,
      dragleave: DragEvent,
      dragover: DragEvent,
      dragstart: DragEvent,
      drop: DragEvent,
      durationchange: typings.std.Event,
      emptied: typings.std.Event,
      ended: typings.std.Event,
      error: ErrorEvent,
      focus: FocusEvent,
      focusin: FocusEvent,
      focusout: FocusEvent,
      fullscreenchange: typings.std.Event,
      fullscreenerror: typings.std.Event,
      gotpointercapture: PointerEvent,
      initialVisibilityChanged: JetElementCustomEvent[hide | show],
      input: typings.std.Event,
      invalid: typings.std.Event,
      keydown: KeyboardEvent,
      keypress: KeyboardEvent,
      keyup: KeyboardEvent,
      load: typings.std.Event,
      loadeddata: typings.std.Event,
      loadedmetadata: typings.std.Event,
      loadstart: typings.std.Event,
      lostpointercapture: PointerEvent,
      modalityChanged: JetElementCustomEvent[modal | modeless],
      mousedown: MouseEvent,
      mouseenter: MouseEvent,
      mouseleave: MouseEvent,
      mousemove: MouseEvent,
      mouseout: MouseEvent,
      mouseover: MouseEvent,
      mouseup: MouseEvent,
      ojAnimateEnd: typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd,
      ojAnimateStart: typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart,
      ojBeforeClose: typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose,
      ojBeforeOpen: typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen,
      ojClose: typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose,
      ojFocus: typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus,
      ojOpen: typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen,
      ojResize: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize,
      ojResizeStart: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart,
      ojResizeStop: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop,
      paste: ClipboardEvent,
      pause: typings.std.Event,
      play: typings.std.Event,
      playing: typings.std.Event,
      pointercancel: PointerEvent,
      pointerdown: PointerEvent,
      pointerenter: PointerEvent,
      pointerleave: PointerEvent,
      pointermove: PointerEvent,
      pointerout: PointerEvent,
      pointerover: PointerEvent,
      pointerup: PointerEvent,
      positionChanged: JetElementCustomEvent[Position],
      progress: ProgressEvent[EventTarget],
      ratechange: typings.std.Event,
      reset: typings.std.Event,
      resize: UIEvent,
      resizeBehaviorChanged: JetElementCustomEvent[resizable | none],
      roleChanged: JetElementCustomEvent[String],
      scroll: typings.std.Event,
      securitypolicyviolation: SecurityPolicyViolationEvent,
      seeked: typings.std.Event,
      seeking: typings.std.Event,
      select: typings.std.Event,
      selectionchange: typings.std.Event,
      selectstart: typings.std.Event,
      stalled: typings.std.Event,
      submit: typings.std.Event,
      suspend: typings.std.Event,
      timeupdate: typings.std.Event,
      toggle: typings.std.Event,
      touchcancel: TouchEvent,
      touchend: TouchEvent,
      touchmove: TouchEvent,
      touchstart: TouchEvent,
      transitioncancel: TransitionEvent,
      transitionend: TransitionEvent,
      transitionrun: TransitionEvent,
      transitionstart: TransitionEvent,
      translationsChanged: JetElementCustomEvent[js.Object | Null],
      volumechange: typings.std.Event,
      waiting: typings.std.Event,
      wheel: WheelEvent
    ): ojDialogEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], animationcancel = animationcancel.asInstanceOf[js.Any], animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], auxclick = auxclick.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], cancelBehaviorChanged = cancelBehaviorChanged.asInstanceOf[js.Any], canplay = canplay.asInstanceOf[js.Any], canplaythrough = canplaythrough.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], contextmenu = contextmenu.asInstanceOf[js.Any], copy = copy.asInstanceOf[js.Any], cuechange = cuechange.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], dialogTitleChanged = dialogTitleChanged.asInstanceOf[js.Any], drag = drag.asInstanceOf[js.Any], dragAffordanceChanged = dragAffordanceChanged.asInstanceOf[js.Any], dragend = dragend.asInstanceOf[js.Any], dragenter = dragenter.asInstanceOf[js.Any], dragexit = dragexit.asInstanceOf[js.Any], dragleave = dragleave.asInstanceOf[js.Any], dragover = dragover.asInstanceOf[js.Any], dragstart = dragstart.asInstanceOf[js.Any], drop = drop.asInstanceOf[js.Any], durationchange = durationchange.asInstanceOf[js.Any], emptied = emptied.asInstanceOf[js.Any], ended = ended.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusin = focusin.asInstanceOf[js.Any], focusout = focusout.asInstanceOf[js.Any], fullscreenchange = fullscreenchange.asInstanceOf[js.Any], fullscreenerror = fullscreenerror.asInstanceOf[js.Any], gotpointercapture = gotpointercapture.asInstanceOf[js.Any], initialVisibilityChanged = initialVisibilityChanged.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], keydown = keydown.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], keyup = keyup.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any], loadeddata = loadeddata.asInstanceOf[js.Any], loadedmetadata = loadedmetadata.asInstanceOf[js.Any], loadstart = loadstart.asInstanceOf[js.Any], lostpointercapture = lostpointercapture.asInstanceOf[js.Any], modalityChanged = modalityChanged.asInstanceOf[js.Any], mousedown = mousedown.asInstanceOf[js.Any], mouseenter = mouseenter.asInstanceOf[js.Any], mouseleave = mouseleave.asInstanceOf[js.Any], mousemove = mousemove.asInstanceOf[js.Any], mouseout = mouseout.asInstanceOf[js.Any], mouseover = mouseover.asInstanceOf[js.Any], mouseup = mouseup.asInstanceOf[js.Any], ojAnimateEnd = ojAnimateEnd.asInstanceOf[js.Any], ojAnimateStart = ojAnimateStart.asInstanceOf[js.Any], ojBeforeClose = ojBeforeClose.asInstanceOf[js.Any], ojBeforeOpen = ojBeforeOpen.asInstanceOf[js.Any], ojClose = ojClose.asInstanceOf[js.Any], ojFocus = ojFocus.asInstanceOf[js.Any], ojOpen = ojOpen.asInstanceOf[js.Any], ojResize = ojResize.asInstanceOf[js.Any], ojResizeStart = ojResizeStart.asInstanceOf[js.Any], ojResizeStop = ojResizeStop.asInstanceOf[js.Any], paste = paste.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any], play = play.asInstanceOf[js.Any], playing = playing.asInstanceOf[js.Any], pointercancel = pointercancel.asInstanceOf[js.Any], pointerdown = pointerdown.asInstanceOf[js.Any], pointerenter = pointerenter.asInstanceOf[js.Any], pointerleave = pointerleave.asInstanceOf[js.Any], pointermove = pointermove.asInstanceOf[js.Any], pointerout = pointerout.asInstanceOf[js.Any], pointerover = pointerover.asInstanceOf[js.Any], pointerup = pointerup.asInstanceOf[js.Any], positionChanged = positionChanged.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], ratechange = ratechange.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], resize = resize.asInstanceOf[js.Any], resizeBehaviorChanged = resizeBehaviorChanged.asInstanceOf[js.Any], roleChanged = roleChanged.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], securitypolicyviolation = securitypolicyviolation.asInstanceOf[js.Any], seeked = seeked.asInstanceOf[js.Any], seeking = seeking.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectionchange = selectionchange.asInstanceOf[js.Any], selectstart = selectstart.asInstanceOf[js.Any], stalled = stalled.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], suspend = suspend.asInstanceOf[js.Any], timeupdate = timeupdate.asInstanceOf[js.Any], toggle = toggle.asInstanceOf[js.Any], touchcancel = touchcancel.asInstanceOf[js.Any], touchend = touchend.asInstanceOf[js.Any], touchmove = touchmove.asInstanceOf[js.Any], touchstart = touchstart.asInstanceOf[js.Any], transitioncancel = transitioncancel.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any], transitionrun = transitionrun.asInstanceOf[js.Any], transitionstart = transitionstart.asInstanceOf[js.Any], translationsChanged = translationsChanged.asInstanceOf[js.Any], volumechange = volumechange.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojDialogEventMap]
    }
    
    @scala.inline
    implicit class ojDialogEventMapMutableBuilder[Self <: ojDialogEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelBehaviorChanged(value: JetElementCustomEvent[icon | escape | none]): Self = StObject.set(x, "cancelBehaviorChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogTitleChanged(value: JetElementCustomEvent[String | Null]): Self = StObject.set(x, "dialogTitleChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragAffordanceChanged(value: JetElementCustomEvent[`title-bar` | none]): Self = StObject.set(x, "dragAffordanceChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialVisibilityChanged(value: JetElementCustomEvent[hide | show]): Self = StObject.set(x, "initialVisibilityChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalityChanged(value: JetElementCustomEvent[modal | modeless]): Self = StObject.set(x, "modalityChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateEnd(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateEnd): Self = StObject.set(x, "ojAnimateEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjAnimateStart(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojAnimateStart): Self = StObject.set(x, "ojAnimateStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeClose(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeClose): Self = StObject.set(x, "ojBeforeClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjBeforeOpen(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojBeforeOpen): Self = StObject.set(x, "ojBeforeOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjClose(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojClose): Self = StObject.set(x, "ojClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjFocus(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojFocus): Self = StObject.set(x, "ojFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjOpen(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojOpen): Self = StObject.set(x, "ojOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjResize(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResize): Self = StObject.set(x, "ojResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjResizeStart(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStart): Self = StObject.set(x, "ojResizeStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOjResizeStop(value: typings.oracleOraclejet.ojdialogMod.ojDialog.ojResizeStop): Self = StObject.set(x, "ojResizeStop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionChanged(value: JetElementCustomEvent[Position]): Self = StObject.set(x, "positionChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeBehaviorChanged(value: JetElementCustomEvent[resizable | none]): Self = StObject.set(x, "resizeBehaviorChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleChanged(value: JetElementCustomEvent[String]): Self = StObject.set(x, "roleChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ojDialogSettableProperties extends baseComponentSettableProperties {
    
    var cancelBehavior: icon | escape | none = js.native
    
    var dialogTitle: String | Null = js.native
    
    var dragAffordance: `title-bar` | none = js.native
    
    var initialVisibility: hide | show = js.native
    
    var modality: modal | modeless = js.native
    
    var position: Position = js.native
    
    var resizeBehavior: resizable | none = js.native
    
    var role: String = js.native
    
    @JSName("translations")
    var translations_ojDialogSettableProperties: LabelCloseIcon = js.native
  }
  object ojDialogSettableProperties {
    
    @scala.inline
    def apply(
      cancelBehavior: icon | escape | none,
      dragAffordance: `title-bar` | none,
      initialVisibility: hide | show,
      modality: modal | modeless,
      position: Position,
      resizeBehavior: resizable | none,
      role: String,
      translations: LabelCloseIcon
    ): ojDialogSettableProperties = {
      val __obj = js.Dynamic.literal(cancelBehavior = cancelBehavior.asInstanceOf[js.Any], dragAffordance = dragAffordance.asInstanceOf[js.Any], initialVisibility = initialVisibility.asInstanceOf[js.Any], modality = modality.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], resizeBehavior = resizeBehavior.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[ojDialogSettableProperties]
    }
    
    @scala.inline
    implicit class ojDialogSettablePropertiesMutableBuilder[Self <: ojDialogSettableProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelBehavior(value: icon | escape | none): Self = StObject.set(x, "cancelBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogTitle(value: String): Self = StObject.set(x, "dialogTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogTitleNull: Self = StObject.set(x, "dialogTitle", null)
      
      @scala.inline
      def setDragAffordance(value: `title-bar` | none): Self = StObject.set(x, "dragAffordance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialVisibility(value: hide | show): Self = StObject.set(x, "initialVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModality(value: modal | modeless): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeBehavior(value: resizable | none): Self = StObject.set(x, "resizeBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslations(value: LabelCloseIcon): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@oracle/oraclejet.@oracle/oraclejet/ojdialog.ojDialogSettableProperties> */
  @js.native
  trait ojDialogSettablePropertiesLenient
    extends /* key */ StringDictionary[js.Any] {
    
    var cancelBehavior: js.UndefOr[icon | escape | none] = js.native
    
    var dialogTitle: js.UndefOr[String | Null] = js.native
    
    var dragAffordance: js.UndefOr[`title-bar` | none] = js.native
    
    var initialVisibility: js.UndefOr[hide | show] = js.native
    
    var modality: js.UndefOr[modal | modeless] = js.native
    
    var position: js.UndefOr[Position] = js.native
    
    var resizeBehavior: js.UndefOr[resizable | none] = js.native
    
    var role: js.UndefOr[String] = js.native
    
    var translations: js.UndefOr[LabelCloseIcon] = js.native
  }
  object ojDialogSettablePropertiesLenient {
    
    @scala.inline
    def apply(): ojDialogSettablePropertiesLenient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ojDialogSettablePropertiesLenient]
    }
    
    @scala.inline
    implicit class ojDialogSettablePropertiesLenientMutableBuilder[Self <: ojDialogSettablePropertiesLenient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelBehavior(value: icon | escape | none): Self = StObject.set(x, "cancelBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelBehaviorUndefined: Self = StObject.set(x, "cancelBehavior", js.undefined)
      
      @scala.inline
      def setDialogTitle(value: String): Self = StObject.set(x, "dialogTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDialogTitleNull: Self = StObject.set(x, "dialogTitle", null)
      
      @scala.inline
      def setDialogTitleUndefined: Self = StObject.set(x, "dialogTitle", js.undefined)
      
      @scala.inline
      def setDragAffordance(value: `title-bar` | none): Self = StObject.set(x, "dragAffordance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragAffordanceUndefined: Self = StObject.set(x, "dragAffordance", js.undefined)
      
      @scala.inline
      def setInitialVisibility(value: hide | show): Self = StObject.set(x, "initialVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialVisibilityUndefined: Self = StObject.set(x, "initialVisibility", js.undefined)
      
      @scala.inline
      def setModality(value: modal | modeless): Self = StObject.set(x, "modality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModalityUndefined: Self = StObject.set(x, "modality", js.undefined)
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setResizeBehavior(value: resizable | none): Self = StObject.set(x, "resizeBehavior", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeBehaviorUndefined: Self = StObject.set(x, "resizeBehavior", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setTranslations(value: LabelCloseIcon): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsUndefined: Self = StObject.set(x, "translations", js.undefined)
    }
  }
}
