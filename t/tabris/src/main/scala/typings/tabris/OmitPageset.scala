package typings.tabris

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.mod.Action
import typings.tabris.mod.AnimationOptions
import typings.tabris.mod.Bounds
import typings.tabris.mod.BoxDimensions
import typings.tabris.mod.ChangeListeners
import typings.tabris.mod.ColorValue
import typings.tabris.mod.Composite
import typings.tabris.mod.CompositeAddChildEvent
import typings.tabris.mod.CompositeRemoveChildEvent
import typings.tabris.mod.ConstraintValue
import typings.tabris.mod.Dimension
import typings.tabris.mod.EventObject
import typings.tabris.mod.ImageValue
import typings.tabris.mod.JSXAttributes
import typings.tabris.mod.Layout
import typings.tabris.mod.LayoutDataValue
import typings.tabris.mod.LinearGradientValue
import typings.tabris.mod.Listeners
import typings.tabris.mod.NativeObject
import typings.tabris.mod.NavigationView
import typings.tabris.mod.Offset
import typings.tabris.mod.Omit
import typings.tabris.mod.Page
import typings.tabris.mod.Properties
import typings.tabris.mod.Selector
import typings.tabris.mod.SiblingReferenceValue
import typings.tabris.mod.Transformation
import typings.tabris.mod.Widget
import typings.tabris.mod.WidgetCollection
import typings.tabris.mod.WidgetLongPressEvent
import typings.tabris.mod.WidgetPanEvent
import typings.tabris.mod.WidgetResizeEvent
import typings.tabris.mod.WidgetSwipeEvent
import typings.tabris.mod.WidgetTapEvent
import typings.tabris.mod.WidgetTouchEvent
import typings.tabris.tabrisBooleans.`true`
import typings.tabris.tabrisStrings.`class`
import typings.tabris.tabrisStrings.auto
import typings.tabris.tabrisStrings.autoDispose
import typings.tabris.tabrisStrings.background
import typings.tabris.tabrisStrings.baseline
import typings.tabris.tabrisStrings.bottom
import typings.tabris.tabrisStrings.bounds
import typings.tabris.tabrisStrings.centerX
import typings.tabris.tabrisStrings.centerY
import typings.tabris.tabrisStrings.classList
import typings.tabris.tabrisStrings.cornerRadius
import typings.tabris.tabrisStrings.elevation
import typings.tabris.tabrisStrings.enabled
import typings.tabris.tabrisStrings.excludeFromLayout
import typings.tabris.tabrisStrings.height
import typings.tabris.tabrisStrings.highlightOnTouch
import typings.tabris.tabrisStrings.id
import typings.tabris.tabrisStrings.image
import typings.tabris.tabrisStrings.layoutData
import typings.tabris.tabrisStrings.left
import typings.tabris.tabrisStrings.opacity
import typings.tabris.tabrisStrings.right
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.title
import typings.tabris.tabrisStrings.top
import typings.tabris.tabrisStrings.transform
import typings.tabris.tabrisStrings.visible
import typings.tabris.tabrisStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined tabris.tabris.Omit<tabris.tabris.Page, 'set'> */
@js.native
trait OmitPageset extends js.Object {
  @JSName("$children")
  var $children: js.Array[Widget] = js.native
  @JSName("$flushChildren")
  var $flushChildren_Original: js.Function0[Unit] = js.native
  @JSName("$getPropertyGetter")
  var $getPropertyGetter_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("$getPropertySetter")
  var $getPropertySetter_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("$getProperty")
  var $getProperty_Original: js.Function1[/* name */ String, _] = js.native
  @JSName("$props")
  var $props: js.Any = js.native
  @JSName("$setProperty")
  var $setProperty_Original: js.Function2[/* name */ String, /* value */ js.Any, Unit] = js.native
  @JSName("$trigger")
  var $trigger_Original: js.Function2[/* eventType */ String, /* eventData */ js.UndefOr[js.Object], Unit] = js.native
  @JSName("_acceptChild")
  var _acceptChild_Original: js.Function1[/* child */ Widget, Boolean] = js.native
  @JSName("_addChild")
  var _addChild_Original: js.Function2[/* child */ Widget, /* index */ js.UndefOr[Double], Unit] = js.native
  @JSName("_apply")
  var _apply_Original: js.Function1[
    /* properties */ StringDictionary[Properties[Widget, OmitWidgetsetBackground]], 
    Page
  ] = js.native
  @JSName("_checkDisposed")
  var _checkDisposed_Original: js.Function0[Unit] = js.native
  @JSName("_checkLayout")
  var _checkLayout_Original: js.Function1[/* value */ Layout, Unit] = js.native
  @JSName("_children")
  var _children_Original: js.Function1[/* selector */ js.UndefOr[Selector[Widget, Widget]], WidgetCollection[Widget]] = js.native
  @JSName("_decodeProperty")
  var _decodeProperty_Original: js.Function2[/* propertyName */ String, /* value */ js.Any, _] = js.native
  @JSName("_dispose")
  var _dispose_Original: js.Function1[/* skipNative */ js.UndefOr[Boolean], Unit] = js.native
  @JSName("_encodeProperty")
  var _encodeProperty_Original: js.Function2[/* propertyName */ String, /* value */ js.Any, _] = js.native
  @JSName("_find")
  var _find_Original: js.Function1[/* selector */ js.UndefOr[Selector[Widget, Widget]], WidgetCollection[Widget]] = js.native
  @JSName("_getDefaultPropertyValue")
  var _getDefaultPropertyValue_Original: js.Function1[/* propertyName */ String, Unit] = js.native
  @JSName("_getStoredProperty")
  var _getStoredProperty_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("_getTypeDef")
  var _getTypeDef_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("_getXMLAttributes")
  var _getXMLAttributes_Original: js.Function0[js.Array[js.Tuple2[String, _]]] = js.native
  @JSName("_getXMLContent")
  var _getXMLContent_Original: js.Function0[js.Array[String]] = js.native
  @JSName("_getXMLElementName")
  var _getXMLElementName_Original: js.Function0[String] = js.native
  @JSName("_getXMLFooter")
  var _getXMLFooter_Original: js.Function1[/* hasChild */ Boolean, String] = js.native
  @JSName("_getXMLHeader")
  var _getXMLHeader_Original: js.Function1[/* hasChild */ Boolean, String] = js.native
  @JSName("_initLayout")
  var _initLayout_Original: js.Function1[/* props */ js.UndefOr[AnonLayout], Unit] = js.native
  var _isDisposed: js.UndefOr[`true`] = js.native
  @JSName("_isListening")
  var _isListening_Original: js.Function1[/* eventType */ String, Boolean] = js.native
  var _layout: Layout = js.native
  @JSName("_listen")
  var _listen_Original: js.Function2[/* eventName */ String, /* listening */ Boolean, Unit] = js.native
  @JSName("_nativeCall")
  var _nativeCall_Original: js.Function2[/* methodName */ String, /* parameters */ js.Object, _] = js.native
  @JSName("_nativeCreate")
  var _nativeCreate_Original: js.Function1[/* param */ js.UndefOr[StringDictionary[js.Any]], Unit] = js.native
  @JSName("_nativeGet")
  var _nativeGet_Original: js.Function1[/* propertyName */ String, _] = js.native
  @JSName("_nativeListen")
  var _nativeListen_Original: js.Function1[/* eventType */ String, Unit] = js.native
  @JSName("_nativeSet")
  var _nativeSet_Original: js.Function2[/* propertyName */ String, /* value */ js.Any, Unit] = js.native
  var _nativeType: String = js.native
  @JSName("_onoff")
  var _onoff_Original: js.Function3[/* eventType */ String, /* listening */ Boolean, /* listener */ js.Function, Unit] = js.native
  @JSName("_register")
  var _register_Original: js.Function0[Unit] = js.native
  @JSName("_release")
  var _release_Original: js.Function0[Unit] = js.native
  @JSName("_removeChild")
  var _removeChild_Original: js.Function1[/* child */ Widget, Unit] = js.native
  @JSName("_reorderProperties")
  var _reorderProperties_Original: js.Function1[/* propertyNames */ js.Array[String], js.Array[String]] = js.native
  @JSName("_scheduleRenderChildren")
  var _scheduleRenderChildren_Original: js.Function0[Unit] = js.native
  @JSName("_setParent")
  var _setParent_Original: js.Function2[/* parent */ Composite[Widget], /* index */ js.UndefOr[Double], Unit] = js.native
  @JSName("_storeProperty")
  var _storeProperty_Original: js.Function2[/* propertyName */ String, /* encodedValue */ js.Any, Unit] = js.native
  @JSName("_triggerChangeEvent")
  var _triggerChangeEvent_Original: js.Function2[/* propertyName */ String, /* newEncodedValue */ js.Any, Unit] = js.native
  @JSName("_trigger")
  var _trigger_Original: js.Function2[/* eventType */ String, /* eventData */ js.UndefOr[js.Object], Boolean] = js.native
  @JSName("_wasSet")
  var _wasSet_Original: js.Function1[/* propertyName */ String, Boolean] = js.native
  var absoluteBounds: Bounds = js.native
  @JSName("animate")
  var animate_Original: js.Function2[/* properties */ AnonOpacity, /* options */ AnimationOptions, js.Promise[Unit]] = js.native
  @JSName("appendTo")
  var appendTo_Original: js.Function1[/* parent */ NavigationView[Page, Action], Page] = js.native
  @JSName("append")
  var append_Original: js.Function1[/* repeated */ Widget, Page] = js.native
  @JSName("apply")
  var apply_Original: js.Function1[
    /* properties */ StringDictionary[Properties[Widget, OmitWidgetsetBackground]], 
    Page
  ] = js.native
  var autoDispose: Boolean = js.native
  var background: LinearGradientValue | ColorValue | ImageValue = js.native
  var baseline: SiblingReferenceValue | auto | `true` = js.native
  var bottom: ConstraintValue = js.native
  var bounds: Bounds = js.native
  var centerX: Offset | auto | `true` = js.native
  var centerY: Offset | auto | `true` = js.native
  @JSName("children")
  var children_Original: js.Function1[/* selector */ js.UndefOr[Selector[Widget, Widget]], WidgetCollection[Widget]] = js.native
  var cid: String = js.native
  var `class`: String = js.native
  var classList: js.Array[String] = js.native
  @JSName("constructor")
  var constructor_Original: js.Function1[/* properties */ js.UndefOr[Properties[Page, Omit[Page, set]]], js.Any] = js.native
  var cornerRadius: Double = js.native
  var data: StringDictionary[js.Any] = js.native
  var defineChangeEvent: js.Any = js.native
  var defineEvent: js.Any = js.native
  var defineEvents: js.Any = js.native
  var defineProperties: js.Any = js.native
  var defineProperty: js.Any = js.native
  @JSName("detach")
  var detach_Original: js.Function0[Page] = js.native
  @JSName("dispose")
  var dispose_Original: js.Function0[Unit] = js.native
  var elevation: Double = js.native
  var enabled: Boolean = js.native
  var excludeFromLayout: Boolean = js.native
  var extend: js.Any = js.native
  @JSName("find")
  var find_Original: js.Function1[/* selector */ js.UndefOr[Selector[Widget, Widget]], WidgetCollection[Widget]] = js.native
  var height: Dimension | auto = js.native
  var highlightOnTouch: Boolean = js.native
  var id: String = js.native
  var image: ImageValue = js.native
  @JSName("insertAfter")
  var insertAfter_Original: js.Function1[/* widget */ Page, Page] = js.native
  @JSName("insertBefore")
  var insertBefore_Original: js.Function1[/* widget */ Page, Page] = js.native
  @JSName("isDisposed")
  var isDisposed_Original: js.Function0[Boolean] = js.native
  var jsxAttributes: (JSXAttributes[Page, Omit[Page, set | typings.tabris.tabrisStrings.jsxAttributes]]) with Anon2 = js.native
  var layout: js.UndefOr[Layout] = js.native
  var layoutData: LayoutDataValue = js.native
  var left: ConstraintValue = js.native
  @JSName("off")
  var off_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], Unit], 
    /* context */ js.UndefOr[js.Object], 
    Page
  ] = js.native
  var onAddChild: Listeners[CompositeAddChildEvent[Page]] = js.native
  var onAppear: Listeners[EventObject[Page]] = js.native
  var onAutoDisposeChanged: ChangeListeners[Page, autoDispose] = js.native
  var onBackgroundChanged: ChangeListeners[Page, background] = js.native
  var onBaselineChanged: ChangeListeners[Page, baseline] = js.native
  var onBottomChanged: ChangeListeners[Page, bottom] = js.native
  var onBoundsChanged: ChangeListeners[Page, bounds] = js.native
  var onCenterXChanged: ChangeListeners[Page, centerX] = js.native
  var onCenterYChanged: ChangeListeners[Page, centerY] = js.native
  var onClassChanged: ChangeListeners[Page, `class`] = js.native
  var onClassListChanged: ChangeListeners[Page, classList] = js.native
  var onCornerRadiusChanged: ChangeListeners[Page, cornerRadius] = js.native
  var onDisappear: Listeners[EventObject[Page]] = js.native
  var onDispose: Listeners[EventObject[Page]] = js.native
  var onElevationChanged: ChangeListeners[Page, elevation] = js.native
  var onEnabledChanged: ChangeListeners[Page, enabled] = js.native
  var onExcludeFromLayoutChanged: ChangeListeners[Page, excludeFromLayout] = js.native
  var onHeightChanged: ChangeListeners[Page, height] = js.native
  var onHighlightOnTouchChanged: ChangeListeners[Page, highlightOnTouch] = js.native
  var onIdChanged: ChangeListeners[Page, id] = js.native
  var onImageChanged: ChangeListeners[Page, image] = js.native
  var onLayoutDataChanged: ChangeListeners[Page, layoutData] = js.native
  var onLeftChanged: ChangeListeners[Page, left] = js.native
  var onLongPress: Listeners[WidgetLongPressEvent[Page]] = js.native
  var onOpacityChanged: ChangeListeners[Page, opacity] = js.native
  var onPan: Listeners[WidgetPanEvent[Page]] = js.native
  var onPanDown: Listeners[WidgetPanEvent[Page]] = js.native
  var onPanHorizontal: Listeners[WidgetPanEvent[Page]] = js.native
  var onPanLeft: Listeners[WidgetPanEvent[Page]] = js.native
  var onPanRight: Listeners[WidgetPanEvent[Page]] = js.native
  var onPanUp: Listeners[WidgetPanEvent[Page]] = js.native
  var onPanVertical: Listeners[WidgetPanEvent[Page]] = js.native
  var onRemoveChild: Listeners[CompositeRemoveChildEvent[Page]] = js.native
  var onResize: Listeners[WidgetResizeEvent[Page]] = js.native
  var onRightChanged: ChangeListeners[Page, right] = js.native
  var onSwipeDown: Listeners[WidgetSwipeEvent[Page]] = js.native
  var onSwipeLeft: Listeners[WidgetSwipeEvent[Page]] = js.native
  var onSwipeRight: Listeners[WidgetSwipeEvent[Page]] = js.native
  var onSwipeUp: Listeners[WidgetSwipeEvent[Page]] = js.native
  var onTap: Listeners[WidgetTapEvent[Page]] = js.native
  var onTitleChanged: ChangeListeners[Page, title] = js.native
  var onTopChanged: ChangeListeners[Page, top] = js.native
  var onTouchCancel: Listeners[WidgetTouchEvent[Page]] = js.native
  var onTouchEnd: Listeners[WidgetTouchEvent[Page]] = js.native
  var onTouchMove: Listeners[WidgetTouchEvent[Page]] = js.native
  var onTouchStart: Listeners[WidgetTouchEvent[Page]] = js.native
  var onTransformChanged: ChangeListeners[Page, transform] = js.native
  var onVisibleChanged: ChangeListeners[Page, visible] = js.native
  var onWidthChanged: ChangeListeners[Page, width] = js.native
  @JSName("on")
  var on_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], _], 
    /* context */ js.UndefOr[js.Object], 
    Page
  ] = js.native
  @JSName("once")
  var once_Original: js.Function3[
    /* type */ String, 
    /* listener */ js.Function1[/* event */ EventObject[NativeObject], _], 
    /* context */ js.UndefOr[js.Object], 
    Page
  ] = js.native
  var opacity: Double = js.native
  var padding: js.UndefOr[BoxDimensions] = js.native
  @JSName("parent")
  var parent_Original: js.Function0[NavigationView[Page, Action]] = js.native
  var right: ConstraintValue = js.native
  @JSName("siblings")
  var siblings_Original: js.Function1[
    /* selector */ js.UndefOr[Selector[Widget, Action | Page]], 
    WidgetCollection[Action | Page]
  ] = js.native
  var title: String = js.native
  var top: ConstraintValue = js.native
  var transform: Transformation = js.native
  @JSName("triggerAsync")
  var triggerAsync_Original: js.Function1[/* type */ String, js.Promise[Page]] = js.native
  @JSName("trigger")
  var trigger_Original: js.Function1[/* type */ String, Page] = js.native
  var visible: Boolean = js.native
  var width: Dimension | auto = js.native
  @JSName("$flushChildren")
  def $flushChildren(): Unit = js.native
  @JSName("$getProperty")
  def $getProperty(name: String): js.Any = js.native
  @JSName("$getPropertyGetter")
  def $getPropertyGetter(propertyName: String): js.Any = js.native
  @JSName("$getPropertySetter")
  def $getPropertySetter(propertyName: String): js.Any = js.native
  @JSName("$setProperty")
  def $setProperty(name: String, value: js.Any): Unit = js.native
  @JSName("$trigger")
  def $trigger(eventType: String): Unit = js.native
  @JSName("$trigger")
  def $trigger(eventType: String, eventData: js.Object): Unit = js.native
  def _acceptChild(child: Widget): Boolean = js.native
  def _addChild(child: Widget): Unit = js.native
  def _addChild(child: Widget, index: Double): Unit = js.native
  def _apply(properties: StringDictionary[Properties[Widget, OmitWidgetsetBackground]]): Page = js.native
  def _checkDisposed(): Unit = js.native
  def _checkLayout(value: Layout): Unit = js.native
  def _children[Result /* <: Widget */](): WidgetCollection[Result] = js.native
  def _children[Result /* <: Widget */](selector: Selector[Widget, Result]): WidgetCollection[Result] = js.native
  def _decodeProperty(propertyName: String, value: js.Any): js.Any = js.native
  def _dispose(): Unit = js.native
  def _dispose(skipNative: Boolean): Unit = js.native
  def _encodeProperty(propertyName: String, value: js.Any): js.Any = js.native
  def _find[Result /* <: Widget */](): WidgetCollection[Result] = js.native
  def _find[Result /* <: Widget */](selector: Selector[Widget, Result]): WidgetCollection[Result] = js.native
  def _getDefaultPropertyValue(propertyName: String): Unit = js.native
  def _getStoredProperty(propertyName: String): js.Any = js.native
  def _getTypeDef(propertyName: String): js.Any = js.native
  def _getXMLAttributes(): js.Array[js.Tuple2[String, _]] = js.native
  def _getXMLContent(): js.Array[String] = js.native
  def _getXMLElementName(): String = js.native
  def _getXMLFooter(hasChild: Boolean): String = js.native
  def _getXMLHeader(hasChild: Boolean): String = js.native
  def _initLayout(): Unit = js.native
  def _initLayout(props: AnonLayout): Unit = js.native
  def _isListening(eventType: String): Boolean = js.native
  def _listen(eventName: String, listening: Boolean): Unit = js.native
  def _nativeCall(methodName: String, parameters: js.Object): js.Any = js.native
  def _nativeCreate(): Unit = js.native
  def _nativeCreate(param: StringDictionary[js.Any]): Unit = js.native
  def _nativeGet(propertyName: String): js.Any = js.native
  def _nativeListen(eventType: String): Unit = js.native
  def _nativeSet(propertyName: String, value: js.Any): Unit = js.native
  def _onoff(eventType: String, listening: Boolean, listener: js.Function): Unit = js.native
  def _register(): Unit = js.native
  def _release(): Unit = js.native
  def _removeChild(child: Widget): Unit = js.native
  def _reorderProperties(propertyNames: js.Array[String]): js.Array[String] = js.native
  def _scheduleRenderChildren(): Unit = js.native
  def _setParent(parent: Composite[Widget]): Unit = js.native
  def _setParent(parent: Composite[Widget], index: Double): Unit = js.native
  def _storeProperty(propertyName: String, encodedValue: js.Any): Unit = js.native
  def _trigger(eventType: String): Boolean = js.native
  def _trigger(eventType: String, eventData: js.Object): Boolean = js.native
  def _triggerChangeEvent(propertyName: String, newEncodedValue: js.Any): Unit = js.native
  def _wasSet(propertyName: String): Boolean = js.native
  def animate(properties: AnonOpacity, options: AnimationOptions): js.Promise[Unit] = js.native
  def append(widgets: Widget*): Page = js.native
  def appendTo(parent: NavigationView[Page, Action]): Page = js.native
  @JSName("apply")
  def apply(properties: StringDictionary[Properties[Widget, OmitWidgetsetBackground]]): Page = js.native
  def children[Result /* <: Widget */](): WidgetCollection[Result] = js.native
  def children[Result /* <: Widget */](selector: Selector[Widget, Result]): WidgetCollection[Result] = js.native
  def detach(): Page = js.native
  def dispose(): Unit = js.native
  def find[Result /* <: Widget */](): WidgetCollection[Result] = js.native
  def find[Result /* <: Widget */](selector: Selector[Widget, Result]): WidgetCollection[Result] = js.native
  def insertAfter(widget: Page): Page = js.native
  def insertBefore(widget: Page): Page = js.native
  def isDisposed(): Boolean = js.native
  def off(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], Unit]): Page = js.native
  def off(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], Unit],
    context: js.Object
  ): Page = js.native
  def on(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], _]): Page = js.native
  def on(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], _],
    context: js.Object
  ): Page = js.native
  def once(`type`: String, listener: js.Function1[/* event */ EventObject[NativeObject], _]): Page = js.native
  def once(
    `type`: String,
    listener: js.Function1[/* event */ EventObject[NativeObject], _],
    context: js.Object
  ): Page = js.native
  def parent(): NavigationView[Page, Action] = js.native
  def siblings[Result /* <: Widget */](): WidgetCollection[Result] = js.native
  def siblings[Result /* <: Widget */](selector: Selector[Widget, Result]): WidgetCollection[Result] = js.native
  def trigger(`type`: String): Page = js.native
  def triggerAsync(`type`: String): js.Promise[Page] = js.native
}

