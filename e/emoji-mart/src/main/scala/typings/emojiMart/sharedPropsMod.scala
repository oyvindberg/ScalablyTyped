package typings.emojiMart

import typings.emojiMart.anon.PartialRecordCategoryName
import typings.emojiMart.anon.RecordCategoryNameReactNo
import typings.emojiMart.anon.RecordCategoryNamestring
import typings.emojiMart.emojiMartStrings.auto
import typings.emojiMart.emojiMartStrings.dark
import typings.emojiMart.emojiMartStrings.light
import typings.emojiMart.nimbleEmojiIndexMod.CustomEmoji
import typings.emojiMart.nimbleEmojiIndexMod.EmojiData
import typings.emojiMart.nimbleEmojiIndexMod.EmojiSkin
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sharedPropsMod {
  
  type BackgroundImageFn = js.Function2[/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize, String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.emojiMart.emojiMartStrings.search
    - typings.emojiMart.emojiMartStrings.recent
    - typings.emojiMart.emojiMartStrings.people
    - typings.emojiMart.emojiMartStrings.nature
    - typings.emojiMart.emojiMartStrings.foods
    - typings.emojiMart.emojiMartStrings.activity
    - typings.emojiMart.emojiMartStrings.places
    - typings.emojiMart.emojiMartStrings.objects
    - typings.emojiMart.emojiMartStrings.symbols
    - typings.emojiMart.emojiMartStrings.flags
    - typings.emojiMart.emojiMartStrings.custom
  */
  trait CategoryName extends StObject
  object CategoryName {
    
    @scala.inline
    def activity: typings.emojiMart.emojiMartStrings.activity = "activity".asInstanceOf[typings.emojiMart.emojiMartStrings.activity]
    
    @scala.inline
    def custom: typings.emojiMart.emojiMartStrings.custom = "custom".asInstanceOf[typings.emojiMart.emojiMartStrings.custom]
    
    @scala.inline
    def flags: typings.emojiMart.emojiMartStrings.flags = "flags".asInstanceOf[typings.emojiMart.emojiMartStrings.flags]
    
    @scala.inline
    def foods: typings.emojiMart.emojiMartStrings.foods = "foods".asInstanceOf[typings.emojiMart.emojiMartStrings.foods]
    
    @scala.inline
    def nature: typings.emojiMart.emojiMartStrings.nature = "nature".asInstanceOf[typings.emojiMart.emojiMartStrings.nature]
    
    @scala.inline
    def objects: typings.emojiMart.emojiMartStrings.objects = "objects".asInstanceOf[typings.emojiMart.emojiMartStrings.objects]
    
    @scala.inline
    def people: typings.emojiMart.emojiMartStrings.people = "people".asInstanceOf[typings.emojiMart.emojiMartStrings.people]
    
    @scala.inline
    def places: typings.emojiMart.emojiMartStrings.places = "places".asInstanceOf[typings.emojiMart.emojiMartStrings.places]
    
    @scala.inline
    def recent: typings.emojiMart.emojiMartStrings.recent = "recent".asInstanceOf[typings.emojiMart.emojiMartStrings.recent]
    
    @scala.inline
    def search: typings.emojiMart.emojiMartStrings.search = "search".asInstanceOf[typings.emojiMart.emojiMartStrings.search]
    
    @scala.inline
    def symbols: typings.emojiMart.emojiMartStrings.symbols = "symbols".asInstanceOf[typings.emojiMart.emojiMartStrings.symbols]
  }
  
  @js.native
  trait CustomIcons extends StObject {
    
    var categories: RecordCategoryNameReactNo = js.native
  }
  object CustomIcons {
    
    @scala.inline
    def apply(categories: RecordCategoryNameReactNo): CustomIcons = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomIcons]
    }
    
    @scala.inline
    implicit class CustomIconsMutableBuilder[Self <: CustomIcons] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategories(value: RecordCategoryNameReactNo): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EmojiProps extends StObject {
    
    /** defaults to returning a png from unpkg.com-hosted emoji-datasource-${set} */
    var backgroundImageFn: js.UndefOr[BackgroundImageFn] = js.native
    
    var emoji: String | EmojiData = js.native
    
    var fallback: js.UndefOr[
        js.Function2[
          /* emoji */ EmojiData, 
          /* props */ this.type, 
          (Component[js.Object, js.Object, _]) | Element
        ]
      ] = js.native
    
    var forceSize: js.UndefOr[Boolean] = js.native
    
    var html: js.UndefOr[Boolean] = js.native
    
    var native: js.UndefOr[Boolean] = js.native
    
    var onClick: js.UndefOr[
        js.Function2[/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
      ] = js.native
    
    var onLeave: js.UndefOr[
        js.Function2[/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
      ] = js.native
    
    var onOver: js.UndefOr[
        js.Function2[/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
      ] = js.native
    
    /** defaults to 'apple' */
    var set: js.UndefOr[EmojiSet] = js.native
    
    /** defaults to 52 */
    var sheetColumns: js.UndefOr[Double] = js.native
    
    /** defaults to 52 */
    var sheetRows: js.UndefOr[Double] = js.native
    
    /** defaults to 64 */
    var sheetSize: js.UndefOr[EmojiSheetSize] = js.native
    
    var size: Double = js.native
    
    /** defaults to 1 */
    var skin: js.UndefOr[EmojiSkin] = js.native
    
    var tooltip: js.UndefOr[Boolean] = js.native
  }
  object EmojiProps {
    
    @scala.inline
    def apply(emoji: String | EmojiData, size: Double): EmojiProps = {
      val __obj = js.Dynamic.literal(emoji = emoji.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmojiProps]
    }
    
    @scala.inline
    implicit class EmojiPropsMutableBuilder[Self <: EmojiProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundImageFn(value: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String): Self = StObject.set(x, "backgroundImageFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBackgroundImageFnUndefined: Self = StObject.set(x, "backgroundImageFn", js.undefined)
      
      @scala.inline
      def setEmoji(value: String | EmojiData): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallback(value: (/* emoji */ EmojiData, EmojiProps) => (Component[js.Object, js.Object, _]) | Element): Self = StObject.set(x, "fallback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setForceSize(value: Boolean): Self = StObject.set(x, "forceSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceSizeUndefined: Self = StObject.set(x, "forceSize", js.undefined)
      
      @scala.inline
      def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnLeave(value: (/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
      
      @scala.inline
      def setOnOver(value: (/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onOver", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnOverUndefined: Self = StObject.set(x, "onOver", js.undefined)
      
      @scala.inline
      def setSet(value: EmojiSet): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      @scala.inline
      def setSheetColumns(value: Double): Self = StObject.set(x, "sheetColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetColumnsUndefined: Self = StObject.set(x, "sheetColumns", js.undefined)
      
      @scala.inline
      def setSheetRows(value: Double): Self = StObject.set(x, "sheetRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetRowsUndefined: Self = StObject.set(x, "sheetRows", js.undefined)
      
      @scala.inline
      def setSheetSize(value: EmojiSheetSize): Self = StObject.set(x, "sheetSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetSizeUndefined: Self = StObject.set(x, "sheetSize", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkin(value: EmojiSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setTooltip(value: Boolean): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emojiMart.emojiMartStrings.apple
    - typings.emojiMart.emojiMartStrings.google
    - typings.emojiMart.emojiMartStrings.twitter
    - typings.emojiMart.emojiMartStrings.emojione
    - typings.emojiMart.emojiMartStrings.messenger
    - typings.emojiMart.emojiMartStrings.facebook
  */
  trait EmojiSet extends StObject
  object EmojiSet {
    
    @scala.inline
    def apple: typings.emojiMart.emojiMartStrings.apple = "apple".asInstanceOf[typings.emojiMart.emojiMartStrings.apple]
    
    @scala.inline
    def emojione: typings.emojiMart.emojiMartStrings.emojione = "emojione".asInstanceOf[typings.emojiMart.emojiMartStrings.emojione]
    
    @scala.inline
    def facebook: typings.emojiMart.emojiMartStrings.facebook = "facebook".asInstanceOf[typings.emojiMart.emojiMartStrings.facebook]
    
    @scala.inline
    def google: typings.emojiMart.emojiMartStrings.google = "google".asInstanceOf[typings.emojiMart.emojiMartStrings.google]
    
    @scala.inline
    def messenger: typings.emojiMart.emojiMartStrings.messenger = "messenger".asInstanceOf[typings.emojiMart.emojiMartStrings.messenger]
    
    @scala.inline
    def twitter: typings.emojiMart.emojiMartStrings.twitter = "twitter".asInstanceOf[typings.emojiMart.emojiMartStrings.twitter]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.emojiMart.emojiMartNumbers.`16`
    - typings.emojiMart.emojiMartNumbers.`20`
    - typings.emojiMart.emojiMartNumbers.`32`
    - typings.emojiMart.emojiMartNumbers.`64`
  */
  trait EmojiSheetSize extends StObject
  object EmojiSheetSize {
    
    @scala.inline
    def `16`: typings.emojiMart.emojiMartNumbers.`16` = 16.asInstanceOf[typings.emojiMart.emojiMartNumbers.`16`]
    
    @scala.inline
    def `20`: typings.emojiMart.emojiMartNumbers.`20` = 20.asInstanceOf[typings.emojiMart.emojiMartNumbers.`20`]
    
    @scala.inline
    def `32`: typings.emojiMart.emojiMartNumbers.`32` = 32.asInstanceOf[typings.emojiMart.emojiMartNumbers.`32`]
    
    @scala.inline
    def `64`: typings.emojiMart.emojiMartNumbers.`64` = 64.asInstanceOf[typings.emojiMart.emojiMartNumbers.`64`]
  }
  
  @js.native
  trait I18n extends StObject {
    
    var categories: RecordCategoryNamestring = js.native
    
    var notfound: String = js.native
    
    var search: String = js.native
    
    var skintext: String = js.native
  }
  object I18n {
    
    @scala.inline
    def apply(categories: RecordCategoryNamestring, notfound: String, search: String, skintext: String): I18n = {
      val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], notfound = notfound.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], skintext = skintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18n]
    }
    
    @scala.inline
    implicit class I18nMutableBuilder[Self <: I18n] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategories(value: RecordCategoryNamestring): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotfound(value: String): Self = StObject.set(x, "notfound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkintext(value: String): Self = StObject.set(x, "skintext", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Pick<emoji-mart.emoji-mart/dist-es/utils/shared-props.I18n, 'search' | 'notfound'> & {  categories :std.Partial<emoji-mart.emoji-mart/dist-es/utils/shared-props.I18n['categories']>}> */
  @js.native
  trait PartialI18n extends StObject {
    
    var categories: js.UndefOr[PartialRecordCategoryName] = js.native
    
    var notfound: js.UndefOr[String] = js.native
    
    var search: js.UndefOr[String] = js.native
  }
  object PartialI18n {
    
    @scala.inline
    def apply(): PartialI18n = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialI18n]
    }
    
    @scala.inline
    implicit class PartialI18nMutableBuilder[Self <: PartialI18n] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategories(value: PartialRecordCategoryName): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      @scala.inline
      def setNotfound(value: String): Self = StObject.set(x, "notfound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotfoundUndefined: Self = StObject.set(x, "notfound", js.undefined)
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    }
  }
  
  @js.native
  trait PickerProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var backgroundImageFn: js.UndefOr[BackgroundImageFn] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    /** NOTE: custom emoji are copied into a singleton object on every new mount */
    var custom: js.UndefOr[js.Array[CustomEmoji]] = js.native
    
    var defaultSkin: js.UndefOr[EmojiSkin] = js.native
    
    var emoji: js.UndefOr[String] = js.native
    
    var emojiSize: js.UndefOr[Double] = js.native
    
    var emojiTooltip: js.UndefOr[Boolean] = js.native
    
    var emojisToShowFilter: js.UndefOr[js.Function1[/* emoji */ EmojiData, Boolean]] = js.native
    
    var enableFrequentEmojiSort: js.UndefOr[Boolean] = js.native
    
    var exclude: js.UndefOr[js.Array[CategoryName]] = js.native
    
    var i18n: js.UndefOr[PartialI18n] = js.native
    
    var icons: js.UndefOr[CustomIcons] = js.native
    
    var include: js.UndefOr[js.Array[CategoryName]] = js.native
    
    var native: js.UndefOr[Boolean] = js.native
    
    var notFound: js.UndefOr[js.Function0[Component[js.Object, js.Object, _]]] = js.native
    
    var notFoundEmoji: js.UndefOr[String] = js.native
    
    /** NOTE: default is not preventable */
    var onClick: js.UndefOr[
        js.Function2[/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]
      ] = js.native
    
    var onSelect: js.UndefOr[js.Function1[/* emoji */ EmojiData, Unit]] = js.native
    
    var onSkinChange: js.UndefOr[js.Function1[/* skin */ EmojiSkin, Unit]] = js.native
    
    var perLine: js.UndefOr[Double] = js.native
    
    var recent: js.UndefOr[js.Array[String]] = js.native
    
    var set: js.UndefOr[EmojiSet] = js.native
    
    var sheetSize: js.UndefOr[EmojiSheetSize] = js.native
    
    var showPreview: js.UndefOr[Boolean] = js.native
    
    var showSkinTones: js.UndefOr[Boolean] = js.native
    
    var skin: js.UndefOr[EmojiSkin] = js.native
    
    var skinEmoji: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var theme: js.UndefOr[auto | light | dark] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var useButton: js.UndefOr[Boolean] = js.native
  }
  object PickerProps {
    
    @scala.inline
    def apply(): PickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickerProps]
    }
    
    @scala.inline
    implicit class PickerPropsMutableBuilder[Self <: PickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setBackgroundImageFn(value: (/* set */ EmojiSet, /* sheetSize */ EmojiSheetSize) => String): Self = StObject.set(x, "backgroundImageFn", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBackgroundImageFnUndefined: Self = StObject.set(x, "backgroundImageFn", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCustom(value: js.Array[CustomEmoji]): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
      
      @scala.inline
      def setCustomVarargs(value: CustomEmoji*): Self = StObject.set(x, "custom", js.Array(value :_*))
      
      @scala.inline
      def setDefaultSkin(value: EmojiSkin): Self = StObject.set(x, "defaultSkin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSkinUndefined: Self = StObject.set(x, "defaultSkin", js.undefined)
      
      @scala.inline
      def setEmoji(value: String): Self = StObject.set(x, "emoji", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmojiSize(value: Double): Self = StObject.set(x, "emojiSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmojiSizeUndefined: Self = StObject.set(x, "emojiSize", js.undefined)
      
      @scala.inline
      def setEmojiTooltip(value: Boolean): Self = StObject.set(x, "emojiTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmojiTooltipUndefined: Self = StObject.set(x, "emojiTooltip", js.undefined)
      
      @scala.inline
      def setEmojiUndefined: Self = StObject.set(x, "emoji", js.undefined)
      
      @scala.inline
      def setEmojisToShowFilter(value: /* emoji */ EmojiData => Boolean): Self = StObject.set(x, "emojisToShowFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmojisToShowFilterUndefined: Self = StObject.set(x, "emojisToShowFilter", js.undefined)
      
      @scala.inline
      def setEnableFrequentEmojiSort(value: Boolean): Self = StObject.set(x, "enableFrequentEmojiSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableFrequentEmojiSortUndefined: Self = StObject.set(x, "enableFrequentEmojiSort", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[CategoryName]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: CategoryName*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setI18n(value: PartialI18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      @scala.inline
      def setIcons(value: CustomIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setInclude(value: js.Array[CategoryName]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      @scala.inline
      def setIncludeVarargs(value: CategoryName*): Self = StObject.set(x, "include", js.Array(value :_*))
      
      @scala.inline
      def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
      
      @scala.inline
      def setNotFound(value: () => Component[js.Object, js.Object, _]): Self = StObject.set(x, "notFound", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotFoundEmoji(value: String): Self = StObject.set(x, "notFoundEmoji", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotFoundEmojiUndefined: Self = StObject.set(x, "notFoundEmoji", js.undefined)
      
      @scala.inline
      def setNotFoundUndefined: Self = StObject.set(x, "notFound", js.undefined)
      
      @scala.inline
      def setOnClick(value: (/* emoji */ EmojiData, /* e */ MouseEvent[HTMLElement, NativeMouseEvent]) => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* emoji */ EmojiData => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnSkinChange(value: /* skin */ EmojiSkin => Unit): Self = StObject.set(x, "onSkinChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSkinChangeUndefined: Self = StObject.set(x, "onSkinChange", js.undefined)
      
      @scala.inline
      def setPerLine(value: Double): Self = StObject.set(x, "perLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerLineUndefined: Self = StObject.set(x, "perLine", js.undefined)
      
      @scala.inline
      def setRecent(value: js.Array[String]): Self = StObject.set(x, "recent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecentUndefined: Self = StObject.set(x, "recent", js.undefined)
      
      @scala.inline
      def setRecentVarargs(value: String*): Self = StObject.set(x, "recent", js.Array(value :_*))
      
      @scala.inline
      def setSet(value: EmojiSet): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      @scala.inline
      def setSheetSize(value: EmojiSheetSize): Self = StObject.set(x, "sheetSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetSizeUndefined: Self = StObject.set(x, "sheetSize", js.undefined)
      
      @scala.inline
      def setShowPreview(value: Boolean): Self = StObject.set(x, "showPreview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPreviewUndefined: Self = StObject.set(x, "showPreview", js.undefined)
      
      @scala.inline
      def setShowSkinTones(value: Boolean): Self = StObject.set(x, "showSkinTones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSkinTonesUndefined: Self = StObject.set(x, "showSkinTones", js.undefined)
      
      @scala.inline
      def setSkin(value: EmojiSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinEmoji(value: String): Self = StObject.set(x, "skinEmoji", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinEmojiUndefined: Self = StObject.set(x, "skinEmoji", js.undefined)
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTheme(value: auto | light | dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUseButton(value: Boolean): Self = StObject.set(x, "useButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseButtonUndefined: Self = StObject.set(x, "useButton", js.undefined)
    }
  }
}
