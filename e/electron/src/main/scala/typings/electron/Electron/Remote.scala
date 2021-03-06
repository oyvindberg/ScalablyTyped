package typings.electron.Electron

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.electron.NodeJS.Process
import typings.electron.anon.TypeofBrowserWindow
import typings.electron.anon.TypeofMenu
import typings.electron.anon.TypeofNativeImage
import typings.electron.anon.TypeofNotification
import typings.electron.anon.TypeofSession
import typings.electron.anon.TypeofTouchBar
import typings.electron.anon.TypeofWebContents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Remote extends RemoteMainInterface {
  
  // Docs: https://electronjs.org/docs/api/remote
  /**
    * The web contents of this web page.
    */
  def getCurrentWebContents(): WebContents_ = js.native
  
  /**
    * The window to which this web page belongs.
    *
    * **Note:** Do not use `removeAllListeners` on `BrowserWindow`. Use of this can
    * remove all `blur` listeners, disable click events on touch bar buttons, and
    * other unintended consequences.
    */
  def getCurrentWindow(): BrowserWindow = js.native
  
  /**
    * The global variable of `name` (e.g. `global[name]`) in the main process.
    */
  def getGlobal(name: String): js.Any = js.native
  
  /**
    * A `NodeJS.Process` object.  The `process` object in the main process. This is
    * the same as `remote.getGlobal('process')` but is cached.
    *
    */
  val process: Process = js.native
  
  /**
    * The object returned by `require(module)` in the main process. Modules specified
    * by their relative path will resolve relative to the entrypoint of the main
    * process.
  e.g.
    */
  def require(module: String): js.Any = js.native
}
object Remote {
  
  @scala.inline
  def apply(
    BrowserView: Instantiable1[/* options */ js.UndefOr[BrowserViewConstructorOptions], BrowserView],
    BrowserWindow: TypeofBrowserWindow with (Instantiable1[/* options */ js.UndefOr[BrowserWindowConstructorOptions], BrowserWindow]),
    ClientRequest: Instantiable1[/* options */ ClientRequestConstructorOptions | String, ClientRequest],
    CommandLine: Instantiable0[CommandLine],
    Cookies: Instantiable0[Cookies],
    Debugger: Instantiable0[Debugger],
    Dock: Instantiable0[Dock],
    DownloadItem: Instantiable0[DownloadItem],
    IncomingMessage: Instantiable0[IncomingMessage],
    Menu: TypeofMenu with Instantiable0[Menu],
    MenuItem: Instantiable1[/* options */ MenuItemConstructorOptions, MenuItem],
    MessageChannelMain: Instantiable0[MessageChannelMain],
    MessagePortMain: Instantiable0[MessagePortMain],
    Notification: TypeofNotification with (Instantiable1[/* options */ js.UndefOr[NotificationConstructorOptions], Notification]),
    ServiceWorkers: Instantiable0[ServiceWorkers],
    TouchBar: TypeofTouchBar with (Instantiable1[/* options */ TouchBarConstructorOptions, TouchBar]),
    TouchBarButton: Instantiable1[/* options */ TouchBarButtonConstructorOptions, TouchBarButton],
    TouchBarColorPicker: Instantiable1[/* options */ TouchBarColorPickerConstructorOptions, TouchBarColorPicker],
    TouchBarGroup: Instantiable1[/* options */ TouchBarGroupConstructorOptions, TouchBarGroup],
    TouchBarLabel: Instantiable1[/* options */ TouchBarLabelConstructorOptions, TouchBarLabel],
    TouchBarOtherItemsProxy: Instantiable0[TouchBarOtherItemsProxy],
    TouchBarPopover: Instantiable1[/* options */ TouchBarPopoverConstructorOptions, TouchBarPopover],
    TouchBarScrubber: Instantiable1[/* options */ TouchBarScrubberConstructorOptions, TouchBarScrubber],
    TouchBarSegmentedControl: Instantiable1[/* options */ TouchBarSegmentedControlConstructorOptions, TouchBarSegmentedControl],
    TouchBarSlider: Instantiable1[/* options */ TouchBarSliderConstructorOptions, TouchBarSlider],
    TouchBarSpacer: Instantiable1[/* options */ TouchBarSpacerConstructorOptions, TouchBarSpacer],
    Tray: Instantiable2[/* image */ NativeImage_ | String, /* guid */ js.UndefOr[String], Tray],
    WebRequest: Instantiable0[WebRequest],
    app: App,
    autoUpdater: AutoUpdater,
    clipboard: Clipboard,
    contentTracing: ContentTracing,
    crashReporter: CrashReporter,
    desktopCapturer: DesktopCapturer,
    dialog: Dialog,
    getCurrentWebContents: () => WebContents_,
    getCurrentWindow: () => BrowserWindow,
    getGlobal: String => js.Any,
    globalShortcut: GlobalShortcut,
    inAppPurchase: InAppPurchase,
    ipcMain: IpcMain,
    nativeImage: TypeofNativeImage with Instantiable0[NativeImage_],
    nativeTheme: NativeTheme,
    net: Net,
    netLog: NetLog,
    powerMonitor: PowerMonitor,
    powerSaveBlocker: PowerSaveBlocker,
    process: Process,
    protocol: Protocol,
    require: String => js.Any,
    screen: Screen,
    session: TypeofSession with Instantiable0[Session_],
    shell: Shell,
    systemPreferences: SystemPreferences,
    webContents: TypeofWebContents with Instantiable0[WebContents_]
  ): Remote = {
    val __obj = js.Dynamic.literal(BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], ClientRequest = ClientRequest.asInstanceOf[js.Any], CommandLine = CommandLine.asInstanceOf[js.Any], Cookies = Cookies.asInstanceOf[js.Any], Debugger = Debugger.asInstanceOf[js.Any], Dock = Dock.asInstanceOf[js.Any], DownloadItem = DownloadItem.asInstanceOf[js.Any], IncomingMessage = IncomingMessage.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], MessageChannelMain = MessageChannelMain.asInstanceOf[js.Any], MessagePortMain = MessagePortMain.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], ServiceWorkers = ServiceWorkers.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], TouchBarButton = TouchBarButton.asInstanceOf[js.Any], TouchBarColorPicker = TouchBarColorPicker.asInstanceOf[js.Any], TouchBarGroup = TouchBarGroup.asInstanceOf[js.Any], TouchBarLabel = TouchBarLabel.asInstanceOf[js.Any], TouchBarOtherItemsProxy = TouchBarOtherItemsProxy.asInstanceOf[js.Any], TouchBarPopover = TouchBarPopover.asInstanceOf[js.Any], TouchBarScrubber = TouchBarScrubber.asInstanceOf[js.Any], TouchBarSegmentedControl = TouchBarSegmentedControl.asInstanceOf[js.Any], TouchBarSlider = TouchBarSlider.asInstanceOf[js.Any], TouchBarSpacer = TouchBarSpacer.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], WebRequest = WebRequest.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], getCurrentWebContents = js.Any.fromFunction0(getCurrentWebContents), getCurrentWindow = js.Any.fromFunction0(getCurrentWindow), getGlobal = js.Any.fromFunction1(getGlobal), globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], nativeImage = nativeImage.asInstanceOf[js.Any], nativeTheme = nativeTheme.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], process = process.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], require = js.Any.fromFunction1(require), screen = screen.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webContents = webContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Remote]
  }
  
  @scala.inline
  implicit class RemoteMutableBuilder[Self <: Remote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCurrentWebContents(value: () => WebContents_): Self = StObject.set(x, "getCurrentWebContents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentWindow(value: () => BrowserWindow): Self = StObject.set(x, "getCurrentWindow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGlobal(value: String => js.Any): Self = StObject.set(x, "getGlobal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProcess(value: Process): Self = StObject.set(x, "process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire(value: String => js.Any): Self = StObject.set(x, "require", js.Any.fromFunction1(value))
  }
}
