package typings.electron

import org.scalablytyped.runtime.Shortcut
import typings.electron.Electron.BrowserViewConstructorOptions
import typings.electron.Electron.BrowserWindowConstructorOptions
import typings.electron.Electron.ClientRequestConstructorOptions
import typings.electron.Electron.ContextBridge
import typings.electron.Electron.IpcRenderer
import typings.electron.Electron.MenuItemConstructorOptions
import typings.electron.Electron.NativeImage_
import typings.electron.Electron.NotificationConstructorOptions
import typings.electron.Electron.Remote
import typings.electron.Electron.Session_
import typings.electron.Electron.TouchBarButtonConstructorOptions
import typings.electron.Electron.TouchBarColorPickerConstructorOptions
import typings.electron.Electron.TouchBarConstructorOptions
import typings.electron.Electron.TouchBarGroupConstructorOptions
import typings.electron.Electron.TouchBarLabelConstructorOptions
import typings.electron.Electron.TouchBarPopoverConstructorOptions
import typings.electron.Electron.TouchBarScrubberConstructorOptions
import typings.electron.Electron.TouchBarSegmentedControlConstructorOptions
import typings.electron.Electron.TouchBarSliderConstructorOptions
import typings.electron.Electron.TouchBarSpacerConstructorOptions
import typings.electron.Electron.WebContents_
import typings.electron.Electron.WebFrame
import typings.electron.Electron.WebviewTag
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("electron/renderer", "BrowserWindowProxy")
  @js.native
  class BrowserWindowProxy ()
    extends typings.electron.Electron.BrowserWindowProxy
  
  @JSImport("electron/renderer", "contextBridge")
  @js.native
  val contextBridge: ContextBridge = js.native
  
  @JSImport("electron/renderer", "ipcRenderer")
  @js.native
  val ipcRenderer: IpcRenderer = js.native
  
  object remote extends Shortcut {
    
    @JSImport("electron/renderer", "remote")
    @js.native
    val ^ : Remote = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.BrowserView")
    @js.native
    // Docs: https://electronjs.org/docs/api/browser-view
    /**
      * BrowserView
      */
    class BrowserView ()
      extends typings.electron.Electron.BrowserView {
      def this(options: BrowserViewConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.BrowserWindow")
    @js.native
    /**
      * BrowserWindow
      */
    class BrowserWindow ()
      extends typings.electron.Electron.BrowserWindow {
      def this(options: BrowserWindowConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.ClientRequest")
    @js.native
    class ClientRequest protected ()
      extends typings.electron.Electron.ClientRequest {
      def this(options: String) = this()
      /**
        * ClientRequest
        */
      def this(options: ClientRequestConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.CommandLine")
    @js.native
    class CommandLine ()
      extends typings.electron.Electron.CommandLine
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.Cookies")
    @js.native
    class Cookies ()
      extends typings.electron.Electron.Cookies
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.Debugger")
    @js.native
    class Debugger ()
      extends typings.electron.Electron.Debugger
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.Dock")
    @js.native
    class Dock ()
      extends typings.electron.Electron.Dock
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.DownloadItem")
    @js.native
    class DownloadItem ()
      extends typings.electron.Electron.DownloadItem
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.IncomingMessage")
    @js.native
    class IncomingMessage ()
      extends typings.electron.Electron.IncomingMessage
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.Menu")
    @js.native
    /**
      * Menu
      */
    class Menu ()
      extends typings.electron.Electron.Menu
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.MenuItem")
    @js.native
    class MenuItem protected ()
      extends typings.electron.Electron.MenuItem {
      // Docs: https://electronjs.org/docs/api/menu-item
      /**
        * MenuItem
        */
      def this(options: MenuItemConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.MessageChannelMain")
    @js.native
    class MessageChannelMain ()
      extends typings.electron.Electron.MessageChannelMain
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.MessagePortMain")
    @js.native
    class MessagePortMain ()
      extends typings.electron.Electron.MessagePortMain
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.Notification")
    @js.native
    /**
      * Notification
      */
    class Notification ()
      extends typings.electron.Electron.Notification {
      def this(options: NotificationConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.ServiceWorkers")
    @js.native
    class ServiceWorkers ()
      extends typings.electron.Electron.ServiceWorkers
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.TouchBar")
    @js.native
    class TouchBar protected ()
      extends typings.electron.Electron.TouchBar {
      // Docs: https://electronjs.org/docs/api/touch-bar
      /**
        * TouchBar
        */
      def this(options: TouchBarConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.TouchBarButton")
    @js.native
    class TouchBarButton protected ()
      extends typings.electron.Electron.TouchBarButton {
      // Docs: https://electronjs.org/docs/api/touch-bar-button
      /**
        * TouchBarButton
        */
      def this(options: TouchBarButtonConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.TouchBarColorPicker")
    @js.native
    class TouchBarColorPicker protected ()
      extends typings.electron.Electron.TouchBarColorPicker {
      // Docs: https://electronjs.org/docs/api/touch-bar-color-picker
      /**
        * TouchBarColorPicker
        */
      def this(options: TouchBarColorPickerConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.TouchBarGroup")
    @js.native
    class TouchBarGroup protected () extends EventEmitter {
      // Docs: https://electronjs.org/docs/api/touch-bar-group
      /**
        * TouchBarGroup
        */
      def this(options: TouchBarGroupConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.TouchBarLabel")
    @js.native
    class TouchBarLabel protected ()
      extends typings.electron.Electron.TouchBarLabel {
      // Docs: https://electronjs.org/docs/api/touch-bar-label
      /**
        * TouchBarLabel
        */
      def this(options: TouchBarLabelConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.TouchBarOtherItemsProxy")
    @js.native
    // Docs: https://electronjs.org/docs/api/touch-bar-other-items-proxy
    /**
      * TouchBarOtherItemsProxy
      */
    class TouchBarOtherItemsProxy () extends EventEmitter
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.TouchBarPopover")
    @js.native
    class TouchBarPopover protected ()
      extends typings.electron.Electron.TouchBarPopover {
      // Docs: https://electronjs.org/docs/api/touch-bar-popover
      /**
        * TouchBarPopover
        */
      def this(options: TouchBarPopoverConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.TouchBarScrubber")
    @js.native
    class TouchBarScrubber protected ()
      extends typings.electron.Electron.TouchBarScrubber {
      // Docs: https://electronjs.org/docs/api/touch-bar-scrubber
      /**
        * TouchBarScrubber
        */
      def this(options: TouchBarScrubberConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.TouchBarSegmentedControl")
    @js.native
    class TouchBarSegmentedControl protected ()
      extends typings.electron.Electron.TouchBarSegmentedControl {
      // Docs: https://electronjs.org/docs/api/touch-bar-segmented-control
      /**
        * TouchBarSegmentedControl
        */
      def this(options: TouchBarSegmentedControlConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.TouchBarSlider")
    @js.native
    class TouchBarSlider protected ()
      extends typings.electron.Electron.TouchBarSlider {
      // Docs: https://electronjs.org/docs/api/touch-bar-slider
      /**
        * TouchBarSlider
        */
      def this(options: TouchBarSliderConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.TouchBarSpacer")
    @js.native
    class TouchBarSpacer protected ()
      extends typings.electron.Electron.TouchBarSpacer {
      // Docs: https://electronjs.org/docs/api/touch-bar-spacer
      /**
        * TouchBarSpacer
        */
      def this(options: TouchBarSpacerConstructorOptions) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.Tray")
    @js.native
    class Tray protected ()
      extends typings.electron.Electron.Tray {
      def this(image: String) = this()
      /**
        * Tray
        */
      def this(image: NativeImage_) = this()
      def this(image: String, guid: String) = this()
      def this(image: NativeImage_, guid: String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.WebRequest")
    @js.native
    class WebRequest ()
      extends typings.electron.Electron.WebRequest
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.nativeImage")
    @js.native
    class nativeImage () extends NativeImage_
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.session")
    @js.native
    class session () extends Session_
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("electron/renderer", "remote.webContents")
    @js.native
    class webContents () extends WebContents_
    
    type _To = Remote
    
    /* This means you don't have to write `^`, but can instead just say `remote.foo` */
    override def _to: Remote = ^
  }
  
  @JSImport("electron/renderer", "webFrame")
  @js.native
  val webFrame: WebFrame = js.native
  
  @JSImport("electron/renderer", "webviewTag")
  @js.native
  val webviewTag: WebviewTag = js.native
}
