package typings.agGrid.mainMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Event
import typings.std.EventListener
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.NamedNodeMap
import typings.std.Node
import typings.std.NodeList
import typings.std.Touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "Utils")
@js.native
class Utils ()
  extends typings.agGrid.utilsMod.Utils
/* static members */
object Utils {
  
  @JSImport("ag-grid/dist/lib/main", "Utils")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.NUMPAD_DEL_NUMLOCK_ON_CHARCODE")
  @js.native
  def NUMPAD_DEL_NUMLOCK_ON_CHARCODE: js.Any = js.native
  @scala.inline
  def NUMPAD_DEL_NUMLOCK_ON_CHARCODE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_DEL_NUMLOCK_ON_CHARCODE")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Utils.NUMPAD_DEL_NUMLOCK_ON_KEY")
  @js.native
  def NUMPAD_DEL_NUMLOCK_ON_KEY: js.Any = js.native
  @scala.inline
  def NUMPAD_DEL_NUMLOCK_ON_KEY_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMPAD_DEL_NUMLOCK_ON_KEY")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Utils.PRINTABLE_CHARACTERS")
  @js.native
  def PRINTABLE_CHARACTERS: js.Any = js.native
  @scala.inline
  def PRINTABLE_CHARACTERS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRINTABLE_CHARACTERS")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Utils.addAgGridEventPath")
  @js.native
  def addAgGridEventPath(event: Event): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.addChangeListener")
  @js.native
  def addChangeListener(element: HTMLElement, listener: EventListener): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.addCssClass")
  @js.native
  def addCssClass(element: HTMLElement, className: String): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.addOrRemoveCssClass")
  @js.native
  def addOrRemoveCssClass(element: HTMLElement, className: String, addOrRemove: Boolean): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.addSafePassiveEventListener")
  @js.native
  def addSafePassiveEventListener(eElement: HTMLElement, event: String, listener: js.Function1[/* event */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.addStylesToElement")
  @js.native
  def addStylesToElement(eElement: js.Any, styles: js.Any): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.anyExists")
  @js.native
  def anyExists(values: js.Array[_]): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.appendHtml")
  @js.native
  def appendHtml(eContainer: HTMLElement, htmlTemplate: String): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.areEventsNear")
  @js.native
  def areEventsNear(e1: MouseEvent, e2: MouseEvent, pixelCount: Double): Boolean = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.areEventsNear")
  @js.native
  def areEventsNear(e1: MouseEvent, e2: Touch, pixelCount: Double): Boolean = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.areEventsNear")
  @js.native
  def areEventsNear(e1: Touch, e2: MouseEvent, pixelCount: Double): Boolean = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.areEventsNear")
  @js.native
  def areEventsNear(e1: Touch, e2: Touch, pixelCount: Double): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.assign")
  @js.native
  def assign(`object`: js.Any, sources: js.Any*): js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.callIfPresent")
  @js.native
  def callIfPresent(func: js.Function): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.camelCaseToHumanText")
  @js.native
  def camelCaseToHumanText(camelCase: String): String = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.camelCaseToHyphen")
  @js.native
  def camelCaseToHyphen(str: String): String = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.cleanNumber")
  @js.native
  def cleanNumber(value: js.Any): Double = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.cloneObject")
  @js.native
  def cloneObject[T](`object`: T): T = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.compareArrays")
  @js.native
  def compareArrays(array1: js.Array[_], array2: js.Array[_]): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.containsClass")
  @js.native
  def containsClass(element: js.Any, className: String): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.copyNodeList")
  @js.native
  def copyNodeList(nodeList: NodeList): js.Array[Node] = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.createArrayOfNumbers")
  @js.native
  def createArrayOfNumbers(first: Double, last: Double): js.Array[Double] = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.createEventPath")
  @js.native
  def createEventPath(event: Event): js.Array[EventTarget] = js.native
  
  /**
    * If icon provided, use this (either a string, or a function callback).
    * if not, then use the default icon from the theme
    */
  @JSImport("ag-grid/dist/lib/main", "Utils.createIcon")
  @js.native
  def createIcon(
    iconName: String,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column
  ): HTMLElement = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.createIconNoSpan")
  @js.native
  def createIconNoSpan(
    iconName: String,
    gridOptionsWrapper: typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper,
    column: typings.agGrid.columnMod.Column
  ): HTMLElement = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.cssStyleObjectToMarkup")
  @js.native
  def cssStyleObjectToMarkup(stylesToUse: js.Any): String = js.native
  
  /**
    * https://stackoverflow.com/questions/24004791/can-someone-explain-the-debounce-function-in-javascript
    */
  @JSImport("ag-grid/dist/lib/main", "Utils.debounce")
  @js.native
  def debounce(func: js.Function0[Unit], wait: Double): js.Function0[Unit] = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.debounce")
  @js.native
  def debounce(func: js.Function0[Unit], wait: Double, immediate: Boolean): js.Function0[Unit] = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.defaultComparator")
  @js.native
  def defaultComparator(valueA: js.Any, valueB: js.Any): Double = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.defaultComparator")
  @js.native
  def defaultComparator(valueA: js.Any, valueB: js.Any, accentedCompare: Boolean): Double = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.doOnce")
  @js.native
  def doOnce(func: js.Function0[Unit], key: String): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.doOnceFlags")
  @js.native
  def doOnceFlags: js.Any = js.native
  @scala.inline
  def doOnceFlags_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("doOnceFlags")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Utils.ensureDomOrder")
  @js.native
  def ensureDomOrder(eContainer: HTMLElement, eChild: HTMLElement, eChildBefore: HTMLElement): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.escape")
  @js.native
  def escape(toEscape: String): String = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.every")
  @js.native
  def every[T](items: js.Array[T], callback: js.Function1[/* item */ T, Boolean]): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.executeAfter")
  @js.native
  def executeAfter(funcs: js.Array[js.Function], millis: Double): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.executeInAWhile")
  @js.native
  def executeInAWhile(funcs: js.Array[js.Function]): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.executeNextVMTurn")
  @js.native
  def executeNextVMTurn(funcs: js.Array[js.Function]): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.exists")
  @js.native
  def exists(value: js.Any): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.existsAndNotEmpty")
  @js.native
  def existsAndNotEmpty(value: js.Array[_]): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.filter")
  @js.native
  def filter[T](array: js.Array[T], callback: js.Function1[/* item */ T, Boolean]): js.Array[T] = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.find")
  @js.native
  def find[T](collection: js.Array[T], predicate: String): T = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.find")
  @js.native
  def find[T](collection: js.Array[T], predicate: String, value: js.Any): T = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.find")
  @js.native
  def find[T](collection: js.Array[T], predicate: js.Function1[/* item */ T, Unit]): T = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.find")
  @js.native
  def find[T](collection: js.Array[T], predicate: js.Function1[/* item */ T, Unit], value: js.Any): T = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.find")
  @js.native
  def find[T](collection: js.Array[T], predicate: Boolean): T = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.find")
  @js.native
  def find[T](collection: js.Array[T], predicate: Boolean, value: js.Any): T = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.find")
  @js.native
  def find[T](collection: StringDictionary[T], predicate: String): T = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.find")
  @js.native
  def find[T](collection: StringDictionary[T], predicate: String, value: js.Any): T = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.find")
  @js.native
  def find[T](collection: StringDictionary[T], predicate: js.Function1[/* item */ T, Unit]): T = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.find")
  @js.native
  def find[T](collection: StringDictionary[T], predicate: js.Function1[/* item */ T, Unit], value: js.Any): T = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.find")
  @js.native
  def find[T](collection: StringDictionary[T], predicate: Boolean): T = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.find")
  @js.native
  def find[T](collection: StringDictionary[T], predicate: Boolean, value: js.Any): T = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.firstExistingValue")
  @js.native
  def firstExistingValue[A](values: A*): A = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.forEach")
  @js.native
  def forEach[T](array: js.Array[T], callback: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.forEachSnapshotFirst")
  @js.native
  def forEachSnapshotFirst(list: js.Array[_], callback: js.Function1[/* item */ js.Any, Unit]): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.formatNumberCommas")
  @js.native
  def formatNumberCommas(value: Double): String = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.formatNumberTwoDecimalPlacesAndCommas")
  @js.native
  def formatNumberTwoDecimalPlacesAndCommas(value: Double): String = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.formatWidth")
  @js.native
  def formatWidth(width: String): String = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.formatWidth")
  @js.native
  def formatWidth(width: Double): String = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.fuzzyCheckStrings")
  @js.native
  def fuzzyCheckStrings(inputValues: js.Array[String], validValues: js.Array[String], allSuggestions: js.Array[String]): StringDictionary[js.Array[String]] = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.fuzzySuggestions")
  @js.native
  def fuzzySuggestions(inputValue: String, validValues: js.Array[String], allSuggestions: js.Array[String]): js.Array[String] = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.get")
  @js.native
  def get(source: StringDictionary[js.Any], expression: String, defaultValue: js.Any): js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.getAllKeysInObjects")
  @js.native
  def getAllKeysInObjects(objects: js.Array[_]): js.Array[String] = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.getBodyHeight")
  @js.native
  def getBodyHeight(): Double = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.getBodyWidth")
  @js.native
  def getBodyWidth(): Double = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.getElementAttribute")
  @js.native
  def getElementAttribute(element: js.Any, attributeName: String): String = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.getEventPath")
  @js.native
  def getEventPath(event: Event): js.Array[EventTarget] = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.getFunctionParameters")
  @js.native
  def getFunctionParameters(func: js.Any): js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.getMaxDivHeight")
  @js.native
  def getMaxDivHeight(): Double = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.getNameOfClass")
  @js.native
  def getNameOfClass(TheClass: js.Any): String = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.getScrollLeft")
  @js.native
  def getScrollLeft(element: HTMLElement, rtl: Boolean): Double = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.getScrollbarWidth")
  @js.native
  def getScrollbarWidth(): Double = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.getTarget")
  @js.native
  def getTarget(event: Event): Element = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.getValueUsingField")
  @js.native
  def getValueUsingField(data: js.Any, field: String, fieldContainsDots: Boolean): js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.get_bigrams")
  @js.native
  def get_bigrams(from: String): js.Array[_] = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.hyphenToCamelCase")
  @js.native
  def hyphenToCamelCase(str: String): String = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.iconNameClassMap")
  @js.native
  def iconNameClassMap: StringDictionary[String] = js.native
  @scala.inline
  def iconNameClassMap_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iconNameClassMap")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Utils.insertArrayIntoArray")
  @js.native
  def insertArrayIntoArray[T](dest: js.Array[T], src: js.Array[T], toIndex: Double): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.insertIntoArray")
  @js.native
  def insertIntoArray[T](array: js.Array[T], `object`: T, toIndex: Double): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.insertTemplateWithDomOrder")
  @js.native
  def insertTemplateWithDomOrder(eContainer: HTMLElement, htmlTemplate: String, eChildBefore: HTMLElement): HTMLElement = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.insertWithDomOrder")
  @js.native
  def insertWithDomOrder(eContainer: HTMLElement, eChild: HTMLElement, eChildBefore: HTMLElement): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isBrowserChrome")
  @js.native
  def isBrowserChrome(): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isBrowserEdge")
  @js.native
  def isBrowserEdge(): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isBrowserFirefox")
  @js.native
  def isBrowserFirefox(): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isBrowserIE")
  @js.native
  def isBrowserIE(): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isBrowserSafari")
  @js.native
  def isBrowserSafari(): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isChrome")
  @js.native
  def isChrome: js.Any = js.native
  @scala.inline
  def isChrome_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isChrome")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isEdge")
  @js.native
  def isEdge: js.Any = js.native
  @scala.inline
  def isEdge_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isEdge")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isElement")
  @js.native
  def isElement(o: js.Any): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isElementInEventPath")
  @js.native
  def isElementInEventPath(element: HTMLElement, event: Event): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isEventFromPrintableCharacter")
  @js.native
  def isEventFromPrintableCharacter(event: KeyboardEvent): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isFirefox")
  @js.native
  def isFirefox: js.Any = js.native
  @scala.inline
  def isFirefox_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFirefox")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isHorizontalScrollShowing")
  @js.native
  def isHorizontalScrollShowing(element: HTMLElement): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isIE")
  @js.native
  def isIE: js.Any = js.native
  @scala.inline
  def isIE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isIE")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isIPad")
  @js.native
  def isIPad: js.Any = js.native
  @scala.inline
  def isIPad_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isIPad")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isKeyPressed")
  @js.native
  def isKeyPressed(event: KeyboardEvent, keyToCheck: Double): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isNode")
  @js.native
  def isNode(o: js.Any): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isNodeOrElement")
  @js.native
  def isNodeOrElement(o: js.Any): Boolean = js.native
  
  /**
    * From http://stackoverflow.com/questions/9716468/is-there-any-function-like-isnumeric-in-javascript-to-validate-numbers
    */
  @JSImport("ag-grid/dist/lib/main", "Utils.isNumeric")
  @js.native
  def isNumeric(value: js.Any): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isNumpadDelWithNumlockOnForEdgeOrIe")
  @js.native
  def isNumpadDelWithNumlockOnForEdgeOrIe(event: js.Any): js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isSafari")
  @js.native
  def isSafari: js.Any = js.native
  @scala.inline
  def isSafari_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSafari")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isStopPropagationForAgGrid")
  @js.native
  def isStopPropagationForAgGrid(event: Event): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isUserAgentIPad")
  @js.native
  def isUserAgentIPad(): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isVerticalScrollShowing")
  @js.native
  def isVerticalScrollShowing(element: HTMLElement): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.isVisible")
  @js.native
  def isVisible(element: HTMLElement): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.iterateArray")
  @js.native
  def iterateArray[T](array: js.Array[T], callback: js.Function2[/* item */ T, /* index */ Double, Unit]): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.iterateNamedNodeMap")
  @js.native
  def iterateNamedNodeMap(map: NamedNodeMap, callback: js.Function2[/* key */ String, /* value */ String, Unit]): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.iterateObject")
  @js.native
  def iterateObject[T](`object`: js.Array[T], callback: js.Function2[/* key */ String, /* value */ T, Unit]): Unit = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.iterateObject")
  @js.native
  def iterateObject[T](`object`: StringDictionary[T], callback: js.Function2[/* key */ String, /* value */ T, Unit]): Unit = js.native
  
  /**
    * loads the template and returns it as an element. makes up for no simple way in
    * the dom api to load html directly, eg we cannot do this: document.createElement(template)
    */
  @JSImport("ag-grid/dist/lib/main", "Utils.loadTemplate")
  @js.native
  def loadTemplate(template: String): HTMLElement = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.makeNull")
  @js.native
  def makeNull[T](value: T): T = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.map")
  @js.native
  def map[TItem, TResult](array: js.Array[TItem], callback: js.Function1[/* item */ TItem, TResult]): js.Array[TResult] = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.mapObject")
  @js.native
  def mapObject[TResult](`object`: js.Any, callback: js.Function1[/* item */ js.Any, TResult]): js.Array[TResult] = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.mergeDeep")
  @js.native
  def mergeDeep(dest: js.Any, source: js.Any): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.message")
  @js.native
  def message(msg: String): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.missing")
  @js.native
  def missing(value: js.Any): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.missingOrEmpty")
  @js.native
  def missingOrEmpty(value: String): Boolean = js.native
  @JSImport("ag-grid/dist/lib/main", "Utils.missingOrEmpty")
  @js.native
  def missingOrEmpty(value: js.Array[_]): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.missingOrEmptyObject")
  @js.native
  def missingOrEmptyObject(value: js.Any): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.moveInArray")
  @js.native
  def moveInArray[T](array: js.Array[T], objectsToMove: js.Array[T], toIndex: Double): Unit = js.native
  
  /**
    * Mouse wheel (and 2-finger trackpad) support on the web sucks.  It is
    * complicated, thus this doc is long and (hopefully) detailed enough to answer
    * your questions.
    *
    * If you need to react to the mouse wheel in a predictable way, this code is
    * like your bestest friend. * hugs *
    *
    * As of today, there are 4 DOM event types you can listen to:
    *
    *   'wheel'                -- Chrome(31+), FF(17+), IE(9+)
    *   'mousewheel'           -- Chrome, IE(6+), Opera, Safari
    *   'MozMousePixelScroll'  -- FF(3.5 only!) (2010-2013) -- don't bother!
    *   'DOMMouseScroll'       -- FF(0.9.7+) since 2003
    *
    * So what to do?  The is the best:
    *
    *   normalizeWheel.getEventType();
    *
    * In your event callback, use this code to get sane interpretation of the
    * deltas.  This code will return an object with properties:
    *
    *   spinX   -- normalized spin speed (use for zoom) - x plane
    *   spinY   -- " - y plane
    *   pixelX  -- normalized distance (to pixels) - x plane
    *   pixelY  -- " - y plane
    *
    * Wheel values are provided by the browser assuming you are using the wheel to
    * scroll a web page by a number of lines or pixels (or pages).  Values can vary
    * significantly on different platforms and browsers, forgetting that you can
    * scroll at different speeds.  Some devices (like trackpads) emit more events
    * at smaller increments with fine granularity, and some emit massive jumps with
    * linear speed or acceleration.
    *
    * This code does its best to normalize the deltas for you:
    *
    *   - spin is trying to normalize how far the wheel was spun (or trackpad
    *     dragged).  This is super useful for zoom support where you want to
    *     throw away the chunky scroll steps on the PC and make those equal to
    *     the slow and smooth tiny steps on the Mac. Key data: This code tries to
    *     resolve a single slow step on a wheel to 1.
    *
    *   - pixel is normalizing the desired scroll delta in pixel units.  You'll
    *     get the crazy differences between browsers, but at least it'll be in
    *     pixels!
    *
    *   - positive value indicates scrolling DOWN/RIGHT, negative UP/LEFT.  This
    *     should translate to positive value zooming IN, negative zooming OUT.
    *     This matches the newer 'wheel' event.
    *
    * Why are there spinX, spinY (or pixels)?
    *
    *   - spinX is a 2-finger side drag on the trackpad, and a shift + wheel turn
    *     with a mouse.  It results in side-scrolling in the browser by default.
    *
    *   - spinY is what you expect -- it's the classic axis of a mouse wheel.
    *
    *   - I dropped spinZ/pixelZ.  It is supported by the DOM 3 'wheel' event and
    *     probably is by browsers in conjunction with fancy 3D controllers .. but
    *     you know.
    *
    * Implementation info:
    *
    * Examples of 'wheel' event if you scroll slowly (down) by one step with an
    * average mouse:
    *
    *   OS X + Chrome  (mouse)     -    4   pixel delta  (wheelDelta -120)
    *   OS X + Safari  (mouse)     -  N/A   pixel delta  (wheelDelta  -12)
    *   OS X + Firefox (mouse)     -    0.1 line  delta  (wheelDelta  N/A)
    *   Win8 + Chrome  (mouse)     -  100   pixel delta  (wheelDelta -120)
    *   Win8 + Firefox (mouse)     -    3   line  delta  (wheelDelta -120)
    *
    * On the trackpad:
    *
    *   OS X + Chrome  (trackpad)  -    2   pixel delta  (wheelDelta   -6)
    *   OS X + Firefox (trackpad)  -    1   pixel delta  (wheelDelta  N/A)
    *
    * On other/older browsers.. it's more complicated as there can be multiple and
    * also missing delta values.
    *
    * The 'wheel' event is more standard:
    *
    * http://www.w3.org/TR/DOM-Level-3-Events/#events-wheelevents
    *
    * The basics is that it includes a unit, deltaMode (pixels, lines, pages), and
    * deltaX, deltaY and deltaZ.  Some browsers provide other values to maintain
    * backward compatibility with older events.  Those other values help us
    * better normalize spin speed.  Example of what the browsers provide:
    *
    *                          | event.wheelDelta | event.detail
    *        ------------------+------------------+--------------
    *          Safari v5/OS X  |       -120       |       0
    *          Safari v5/Win7  |       -120       |       0
    *         Chrome v17/OS X  |       -120       |       0
    *         Chrome v17/Win7  |       -120       |       0
    *                IE9/Win7  |       -120       |   undefined
    *         Firefox v4/OS X  |     undefined    |       1
    *         Firefox v4/Win7  |     undefined    |       3
    *
    */
  @JSImport("ag-grid/dist/lib/main", "Utils.normalizeWheel")
  @js.native
  def normalizeWheel(event: js.Any): js.Any = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.offsetHeight")
  @js.native
  def offsetHeight(element: HTMLElement): Double = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.offsetWidth")
  @js.native
  def offsetWidth(element: HTMLElement): Double = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.pad")
  @js.native
  def pad(num: Double, totalStringSize: Double): String = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.parseYyyyMmDdToDate")
  @js.native
  def parseYyyyMmDdToDate(yyyyMmDd: String, separator: String): Date = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.passiveEvents")
  @js.native
  def passiveEvents: js.Array[String] = js.native
  @scala.inline
  def passiveEvents_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("passiveEvents")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid/dist/lib/main", "Utils.prependDC")
  @js.native
  def prependDC(parent: HTMLElement, documentFragment: DocumentFragment): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.pushAll")
  @js.native
  def pushAll(target: js.Array[_], source: js.Array[_]): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.referenceCompare")
  @js.native
  def referenceCompare(left: js.Any, right: js.Any): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.removeAllChildren")
  @js.native
  def removeAllChildren(node: HTMLElement): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.removeAllFromArray")
  @js.native
  def removeAllFromArray[T](array: js.Array[T], toRemove: js.Array[T]): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.removeCssClass")
  @js.native
  def removeCssClass(element: HTMLElement, className: String): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.removeElement")
  @js.native
  def removeElement(parent: HTMLElement, cssSelector: String): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.removeFromArray")
  @js.native
  def removeFromArray[T](array: js.Array[T], `object`: T): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.removeFromParent")
  @js.native
  def removeFromParent(node: Element): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.removeRepeatsFromArray")
  @js.native
  def removeRepeatsFromArray[T](array: js.Array[T], `object`: T): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.serializeDateToYyyyMmDd")
  @js.native
  def serializeDateToYyyyMmDd(date: Date, separator: String): String = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.setCheckboxState")
  @js.native
  def setCheckboxState(eCheckbox: js.Any, state: js.Any): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.setHidden")
  @js.native
  def setHidden(element: HTMLElement, hidden: Boolean): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.setScrollLeft")
  @js.native
  def setScrollLeft(element: HTMLElement, value: Double, rtl: Boolean): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.setVisible")
  @js.native
  def setVisible(element: HTMLElement, visible: Boolean): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.shallowCompare")
  @js.native
  def shallowCompare(arr1: js.Array[_], arr2: js.Array[_]): Boolean = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.sortNumberArray")
  @js.native
  def sortNumberArray(numberArray: js.Array[Double]): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.sortRowNodesByOrder")
  @js.native
  def sortRowNodesByOrder(rowNodes: js.Array[typings.agGrid.rowNodeMod.RowNode], rowNodeOrder: StringDictionary[Double]): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.stopPropagationForAgGrid")
  @js.native
  def stopPropagationForAgGrid(event: Event): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.string_similarity")
  @js.native
  def string_similarity(str1: String, str2: String): Double = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.toStringOrNull")
  @js.native
  def toStringOrNull(value: js.Any): String = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.toStrings")
  @js.native
  def toStrings[T](array: js.Array[T]): js.Array[String] = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.traverseNodesWithKey")
  @js.native
  def traverseNodesWithKey(
    nodes: js.Array[typings.agGrid.rowNodeMod.RowNode],
    callback: js.Function2[/* node */ typings.agGrid.rowNodeMod.RowNode, /* key */ String, Unit]
  ): Unit = js.native
  
  @JSImport("ag-grid/dist/lib/main", "Utils.values")
  @js.native
  def values[T](`object`: StringDictionary[T]): js.Array[T] = js.native
}
