package typings
package reactDashMdLib.libTabsTabMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabProps
  extends reactDashMdLib.libMod.BaseProps
     with // for the `component` prop until refactored out
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
  var controlsId: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactElement[_]] = js.undefined
  var id: js.UndefOr[reactDashMdLib.libMod.IdPropType] = js.undefined
  var inactiveClassName: js.UndefOr[java.lang.String] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var label: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onClick: js.UndefOr[
    js.Function5[
      /* index */ scala.Double, 
      /* id */ reactDashMdLib.libMod.IdPropType, 
      /* controlsId */ reactDashMdLib.libMod.IdPropType, 
      /* children */ reactLib.reactMod.ReactNode, 
      /* event */ stdLib.Event, 
      scala.Unit
    ]
  ] = js.undefined
}

object TabProps {
  @scala.inline
  def apply(
    StringDictionary: // for the `component` prop until refactored out
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    activeClassName: java.lang.String = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    component: reactLib.reactMod.ReactType[_] = null,
    controlsId: reactDashMdLib.libMod.IdPropType = null,
    icon: reactLib.reactMod.ReactElement[_] = null,
    id: reactDashMdLib.libMod.IdPropType = null,
    inactiveClassName: java.lang.String = null,
    index: scala.Int | scala.Double = null,
    label: reactLib.reactMod.ReactNode = null,
    onBlur: /* event */ reactLib.reactMod.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onClick: (/* index */ scala.Double, /* id */ reactDashMdLib.libMod.IdPropType, /* controlsId */ reactDashMdLib.libMod.IdPropType, /* children */ reactLib.reactMod.ReactNode, /* event */ stdLib.Event) => scala.Unit = null,
    onDrag: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnd: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragEnter: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragExit: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragLeave: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragOver: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDragStart: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onDrop: /* event */ reactLib.reactMod.DragEvent[stdLib.HTMLElement] => scala.Unit = null,
    onFocus: /* event */ reactLib.reactMod.FocusEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyDown: /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onKeyUp: /* event */ reactLib.reactMod.KeyboardEvent[stdLib.HTMLElement] => scala.Unit = null,
    onMouseDown: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseEnter: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseLeave: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseMove: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOut: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseOver: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onMouseUp: /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent] => scala.Unit = null,
    onTouchCancel: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchEnd: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchMove: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    onTouchStart: /* event */ reactLib.reactMod.TouchEvent[stdLib.HTMLElement] => scala.Unit = null,
    style: reactLib.reactMod.CSSProperties = null
  ): TabProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (controlsId != null) __obj.updateDynamic("controlsId")(controlsId.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inactiveClassName != null) __obj.updateDynamic("inactiveClassName")(inactiveClassName)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction5(onClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TabProps]
  }
}

