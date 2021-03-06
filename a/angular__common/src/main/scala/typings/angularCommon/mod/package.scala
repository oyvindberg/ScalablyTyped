package typings.angularCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def APP_BASE_HREF: typings.angularCore.mod.InjectionToken[java.lang.String] = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("APP_BASE_HREF").asInstanceOf[typings.angularCore.mod.InjectionToken[java.lang.String]]
  
  @scala.inline
  def DOCUMENT: typings.angularCore.mod.InjectionToken[typings.std.Document] = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("DOCUMENT").asInstanceOf[typings.angularCore.mod.InjectionToken[typings.std.Document]]
  
  @scala.inline
  def LOCATION_INITIALIZED: typings.angularCore.mod.InjectionToken[js.Promise[js.Any]] = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("LOCATION_INITIALIZED").asInstanceOf[typings.angularCore.mod.InjectionToken[js.Promise[js.Any]]]
  
  type LocationChangeListener = js.Function1[/* event */ typings.angularCommon.mod.LocationChangeEvent, js.Any]
  
  @scala.inline
  def VERSION: typings.angularCore.mod.Version = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[typings.angularCore.mod.Version]
  
  @scala.inline
  def formatCurrency(value: scala.Double, locale: java.lang.String, currency: java.lang.String): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], currency.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatCurrency(
    value: scala.Double,
    locale: java.lang.String,
    currency: java.lang.String,
    currencyCode: js.UndefOr[scala.Nothing],
    digitsInfo: java.lang.String
  ): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], currency.asInstanceOf[js.Any], currencyCode.asInstanceOf[js.Any], digitsInfo.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatCurrency(
    value: scala.Double,
    locale: java.lang.String,
    currency: java.lang.String,
    currencyCode: java.lang.String
  ): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], currency.asInstanceOf[js.Any], currencyCode.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatCurrency(
    value: scala.Double,
    locale: java.lang.String,
    currency: java.lang.String,
    currencyCode: java.lang.String,
    digitsInfo: java.lang.String
  ): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatCurrency")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], currency.asInstanceOf[js.Any], currencyCode.asInstanceOf[js.Any], digitsInfo.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def formatDate(value: java.lang.String, format: java.lang.String, locale: java.lang.String): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatDate(
    value: java.lang.String,
    format: java.lang.String,
    locale: java.lang.String,
    timezone: java.lang.String
  ): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatDate(value: scala.Double, format: java.lang.String, locale: java.lang.String): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatDate(
    value: scala.Double,
    format: java.lang.String,
    locale: java.lang.String,
    timezone: java.lang.String
  ): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatDate(value: typings.std.Date, format: java.lang.String, locale: java.lang.String): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatDate(
    value: typings.std.Date,
    format: java.lang.String,
    locale: java.lang.String,
    timezone: java.lang.String
  ): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], timezone.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def formatNumber(value: scala.Double, locale: java.lang.String): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatNumber(value: scala.Double, locale: java.lang.String, digitsInfo: java.lang.String): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], digitsInfo.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def formatPercent(value: scala.Double, locale: java.lang.String): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatPercent")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def formatPercent(value: scala.Double, locale: java.lang.String, digitsInfo: java.lang.String): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("formatPercent")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], digitsInfo.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getCurrencySymbol_narrow(code: java.lang.String, format: typings.angularCommon.angularCommonStrings.narrow): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencySymbol")(code.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def getCurrencySymbol_narrow(
    code: java.lang.String,
    format: typings.angularCommon.angularCommonStrings.narrow,
    locale: java.lang.String
  ): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencySymbol")(code.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getCurrencySymbol_wide(code: java.lang.String, format: typings.angularCommon.angularCommonStrings.wide): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencySymbol")(code.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def getCurrencySymbol_wide(
    code: java.lang.String,
    format: typings.angularCommon.angularCommonStrings.wide,
    locale: java.lang.String
  ): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getCurrencySymbol")(code.asInstanceOf[js.Any], format.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getLocaleCurrencyCode(locale: java.lang.String): java.lang.String | scala.Null = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleCurrencyCode")(locale.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def getLocaleCurrencyName(locale: java.lang.String): java.lang.String | scala.Null = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleCurrencyName")(locale.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def getLocaleCurrencySymbol(locale: java.lang.String): java.lang.String | scala.Null = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleCurrencySymbol")(locale.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def getLocaleDateFormat(locale: java.lang.String, width: typings.angularCommon.mod.FormatWidth): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDateFormat")(locale.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getLocaleDateTimeFormat(locale: java.lang.String, width: typings.angularCommon.mod.FormatWidth): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDateTimeFormat")(locale.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getLocaleDayNames(
    locale: java.lang.String,
    formStyle: typings.angularCommon.mod.FormStyle,
    width: typings.angularCommon.mod.TranslationWidth
  ): js.Array[java.lang.String] = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDayNames")(locale.asInstanceOf[js.Any], formStyle.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def getLocaleDayPeriods(
    locale: java.lang.String,
    formStyle: typings.angularCommon.mod.FormStyle,
    width: typings.angularCommon.mod.TranslationWidth
  ): js.Tuple2[java.lang.String, java.lang.String] = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDayPeriods")(locale.asInstanceOf[js.Any], formStyle.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[java.lang.String, java.lang.String]]
  
  @scala.inline
  def getLocaleDirection(locale: java.lang.String): typings.angularCommon.angularCommonStrings.ltr | typings.angularCommon.angularCommonStrings.rtl = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleDirection")(locale.asInstanceOf[js.Any]).asInstanceOf[typings.angularCommon.angularCommonStrings.ltr | typings.angularCommon.angularCommonStrings.rtl]
  
  @scala.inline
  def getLocaleEraNames(locale: java.lang.String, width: typings.angularCommon.mod.TranslationWidth): js.Tuple2[java.lang.String, java.lang.String] = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleEraNames")(locale.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[java.lang.String, java.lang.String]]
  
  @scala.inline
  def getLocaleExtraDayPeriodRules(locale: java.lang.String): js.Array[
    typings.angularCommon.mod.Time | (js.Tuple2[typings.angularCommon.mod.Time, typings.angularCommon.mod.Time])
  ] = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleExtraDayPeriodRules")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    typings.angularCommon.mod.Time | (js.Tuple2[typings.angularCommon.mod.Time, typings.angularCommon.mod.Time])
  ]]
  
  @scala.inline
  def getLocaleExtraDayPeriods(
    locale: java.lang.String,
    formStyle: typings.angularCommon.mod.FormStyle,
    width: typings.angularCommon.mod.TranslationWidth
  ): js.Array[java.lang.String] = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleExtraDayPeriods")(locale.asInstanceOf[js.Any], formStyle.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def getLocaleFirstDayOfWeek(locale: java.lang.String): typings.angularCommon.mod.WeekDay = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleFirstDayOfWeek")(locale.asInstanceOf[js.Any]).asInstanceOf[typings.angularCommon.mod.WeekDay]
  
  @scala.inline
  def getLocaleId(locale: java.lang.String): java.lang.String = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleId")(locale.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getLocaleMonthNames(
    locale: java.lang.String,
    formStyle: typings.angularCommon.mod.FormStyle,
    width: typings.angularCommon.mod.TranslationWidth
  ): js.Array[java.lang.String] = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleMonthNames")(locale.asInstanceOf[js.Any], formStyle.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def getLocaleNumberFormat(locale: java.lang.String, `type`: typings.angularCommon.mod.NumberFormatStyle): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleNumberFormat")(locale.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getLocaleNumberSymbol(locale: java.lang.String, symbol: typings.angularCommon.mod.NumberSymbol): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleNumberSymbol")(locale.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getLocalePluralCase(locale: java.lang.String): js.Function1[/* value */ scala.Double, typings.angularCommon.mod.Plural] = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocalePluralCase")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* value */ scala.Double, typings.angularCommon.mod.Plural]]
  
  @scala.inline
  def getLocaleTimeFormat(locale: java.lang.String, width: typings.angularCommon.mod.FormatWidth): java.lang.String = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleTimeFormat")(locale.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def getLocaleWeekEndRange(locale: java.lang.String): js.Tuple2[typings.angularCommon.mod.WeekDay, typings.angularCommon.mod.WeekDay] = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLocaleWeekEndRange")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[typings.angularCommon.mod.WeekDay, typings.angularCommon.mod.WeekDay]]
  
  @scala.inline
  def getNumberOfCurrencyDigits(code: java.lang.String): scala.Double = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getNumberOfCurrencyDigits")(code.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
  
  @scala.inline
  def isPlatformBrowser(platformId: js.Object): scala.Boolean = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPlatformBrowser")(platformId.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isPlatformServer(platformId: js.Object): scala.Boolean = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPlatformServer")(platformId.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isPlatformWorkerApp(platformId: js.Object): scala.Boolean = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPlatformWorkerApp")(platformId.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isPlatformWorkerUi(platformId: js.Object): scala.Boolean = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isPlatformWorkerUi")(platformId.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def registerLocaleData(data: js.Any): scala.Unit = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def registerLocaleData(data: js.Any, localeId: js.UndefOr[scala.Nothing], extraData: js.Any): scala.Unit = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def registerLocaleData(data: js.Any, localeId: java.lang.String): scala.Unit = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def registerLocaleData(data: js.Any, localeId: java.lang.String, extraData: js.Any): scala.Unit = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def registerLocaleData(data: js.Any, localeId: js.Any): scala.Unit = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def registerLocaleData(data: js.Any, localeId: js.Any, extraData: js.Any): scala.Unit = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerLocaleData")(data.asInstanceOf[js.Any], localeId.asInstanceOf[js.Any], extraData.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def ɵPLATFORMBROWSERID: /* "browser" */ java.lang.String = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275PLATFORM_BROWSER_ID").asInstanceOf[/* "browser" */ java.lang.String]
  
  @scala.inline
  def ɵPLATFORMSERVERID: /* "server" */ java.lang.String = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275PLATFORM_SERVER_ID").asInstanceOf[/* "server" */ java.lang.String]
  
  @scala.inline
  def ɵPLATFORMWORKERAPPID: /* "browserWorkerApp" */ java.lang.String = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275PLATFORM_WORKER_APP_ID").asInstanceOf[/* "browserWorkerApp" */ java.lang.String]
  
  @scala.inline
  def ɵPLATFORMWORKERUIID: /* "browserWorkerUi" */ java.lang.String = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275PLATFORM_WORKER_UI_ID").asInstanceOf[/* "browserWorkerUi" */ java.lang.String]
  
  @scala.inline
  def ɵangularPackagesCommonCommonA(): typings.angularCommon.mod.ɵBrowserPlatformLocation = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_common_a")().asInstanceOf[typings.angularCommon.mod.ɵBrowserPlatformLocation]
  
  @scala.inline
  def ɵangularPackagesCommonCommonB(): typings.angularCommon.mod.ɵBrowserPlatformLocation = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_common_b")().asInstanceOf[typings.angularCommon.mod.ɵBrowserPlatformLocation]
  
  @scala.inline
  def ɵangularPackagesCommonCommonC(): typings.angularCommon.mod.Location = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_common_c")().asInstanceOf[typings.angularCommon.mod.Location]
  
  @scala.inline
  def ɵangularPackagesCommonCommonD(platformLocation: typings.angularCommon.mod.PlatformLocation): typings.angularCommon.mod.PathLocationStrategy = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_common_d")(platformLocation.asInstanceOf[js.Any]).asInstanceOf[typings.angularCommon.mod.PathLocationStrategy]
  
  @scala.inline
  def ɵangularPackagesCommonCommonE: js.Array[typings.angularCore.mod.Provider] = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275angular_packages_common_common_e").asInstanceOf[js.Array[typings.angularCore.mod.Provider]]
  
  @scala.inline
  def ɵangularPackagesCommonCommonF: js.Array[
    (org.scalablytyped.runtime.Instantiable1[
      (/* _ref */ typings.angularCore.mod.ChangeDetectorRef) | (/* differs */ typings.angularCore.mod.KeyValueDiffers) | (/* _localization */ typings.angularCommon.mod.NgLocalization) | (/* _locale */ java.lang.String), 
      typings.angularCommon.mod.AsyncPipe | typings.angularCommon.mod.DatePipe | typings.angularCommon.mod.DecimalPipe | typings.angularCommon.mod.I18nPluralPipe | typings.angularCommon.mod.KeyValuePipe | typings.angularCommon.mod.PercentPipe
    ]) | (org.scalablytyped.runtime.Instantiable0[typings.angularCommon.mod.I18nSelectPipe | typings.angularCommon.mod.SlicePipe]) | (org.scalablytyped.runtime.Instantiable2[
      /* _locale */ java.lang.String, 
      /* _defaultCurrencyCode */ js.UndefOr[java.lang.String], 
      typings.angularCommon.mod.CurrencyPipe
    ])
  ] = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].selectDynamic("\u0275angular_packages_common_common_f").asInstanceOf[js.Array[
    (org.scalablytyped.runtime.Instantiable1[
      (/* _ref */ typings.angularCore.mod.ChangeDetectorRef) | (/* differs */ typings.angularCore.mod.KeyValueDiffers) | (/* _localization */ typings.angularCommon.mod.NgLocalization) | (/* _locale */ java.lang.String), 
      typings.angularCommon.mod.AsyncPipe | typings.angularCommon.mod.DatePipe | typings.angularCommon.mod.DecimalPipe | typings.angularCommon.mod.I18nPluralPipe | typings.angularCommon.mod.KeyValuePipe | typings.angularCommon.mod.PercentPipe
    ]) | (org.scalablytyped.runtime.Instantiable0[typings.angularCommon.mod.I18nSelectPipe | typings.angularCommon.mod.SlicePipe]) | (org.scalablytyped.runtime.Instantiable2[
      /* _locale */ java.lang.String, 
      /* _defaultCurrencyCode */ js.UndefOr[java.lang.String], 
      typings.angularCommon.mod.CurrencyPipe
    ])
  ]]
  
  @scala.inline
  def ɵgetDOM(): typings.angularCommon.mod.ɵDomAdapter = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getDOM")().asInstanceOf[typings.angularCommon.mod.ɵDomAdapter]
  
  @scala.inline
  def ɵparseCookieValue(cookieStr: java.lang.String, name: java.lang.String): java.lang.String | scala.Null = (typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275parseCookieValue")(cookieStr.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | scala.Null]
  
  @scala.inline
  def ɵsetRootDomAdapter(adapter: typings.angularCommon.mod.ɵDomAdapter): scala.Unit = typings.angularCommon.mod.^.asInstanceOf[js.Dynamic].applyDynamic("\u0275setRootDomAdapter")(adapter.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
