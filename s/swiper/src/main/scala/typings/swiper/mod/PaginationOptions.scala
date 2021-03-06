package typings.swiper.mod

import typings.swiper.swiperStrings.bullets
import typings.swiper.swiperStrings.custom
import typings.swiper.swiperStrings.fraction
import typings.swiper.swiperStrings.progressbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationOptions extends StObject {
  
  /**
    * CSS class name of currently active pagination bullet
    */
  var bulletActiveClass: js.UndefOr[String] = js.native
  
  /**
    * CSS class name of single pagination bullet
    */
  var bulletClass: js.UndefOr[String] = js.native
  
  /**
    * Defines which HTML tag will be use to represent single pagination bullet. Only for bullets pagination type.
    */
  var bulletElement: js.UndefOr[String] = js.native
  
  /**
    * If true then clicking on pagination button will cause transition to appropriate slide. Only for bullets pagination type
    */
  var clickable: js.UndefOr[Boolean] = js.native
  
  /**
    * CSS class name set to pagination when it is clickable
    */
  var clickableClass: js.UndefOr[String] = js.native
  
  /**
    * CSS class name of the element with currently active index in "fraction" pagination
    */
  var currentClass: js.UndefOr[String] = js.native
  
  /**
    * Good to enable if you use bullets pagination with a lot of slides. So it will keep only few bullets visible at the same time.
    */
  var dynamicBullets: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of main bullets visible when dynamicBullets enabled.
    */
  var dynamicMainBullets: js.UndefOr[Double] = js.native
  
  /**
    * String with CSS selector or HTML element of the container with pagination
    */
  var el: SelectableElement = js.native
  
  /**
    * format fraction pagination current number. Function receives current number,
    * and you need to return formatted value
    */
  var formatFractionCurrent: js.UndefOr[js.Function1[/* number */ Double, Double]] = js.native
  
  /**
    * format fraction pagination total number. Function receives total number, and you
    * need to return formatted value
    */
  var formatFractionTotal: js.UndefOr[js.Function1[/* number */ Double, Double]] = js.native
  
  /**
    * CSS class name of pagination when it becomes inactive
    */
  var hiddenClass: js.UndefOr[String] = js.native
  
  /**
    * Toggle (hide/true) pagination container visibility after click on Slider's container
    */
  var hideOnClick: js.UndefOr[Boolean] = js.native
  
  /**
    * The beginning of the modifier CSS class name that will be added to pagination depending on parameters
    */
  var modifierClass: js.UndefOr[String] = js.native
  
  /**
    * CSS class name of pagination progressbar fill element
    */
  var progressbarFillClass: js.UndefOr[String] = js.native
  
  /**
    * Makes pagination progressbar opposite to Swiper's `direction` parameter, means vertical progressbar for horizontal swiper
    * direction and horizontal progressbar for vertical swiper direction
    */
  var progressbarOpposite: js.UndefOr[Boolean] = js.native
  
  /**
    * This parameter allows totally customize pagination bullets, you need to pass here a function that accepts index number of
    * pagination bullet and required element class name (className). Only for bullets pagination type
    */
  var renderBullet: js.UndefOr[js.Function2[/* index */ Double, /* className */ String, Unit]] = js.native
  
  /**
    * This parameter is required for custom pagination type where you have to specify
    * how it should be rendered.
    *
    * @example
    * var swiper = new Swiper('.swiper-container', {
    *   //...
    *   renderCustom: function (swiper, current, total) {
    *     return current + ' of ' + total;
    *   }
    * });
    */
  var renderCustom: js.UndefOr[
    js.Function3[/* swiper */ Swiper, /* current */ Double, /* total */ Double, Unit]
  ] = js.native
  
  /**
    * This parameter allows to customize "fraction" pagination html. Only for fraction pagination type
    */
  var renderFraction: js.UndefOr[js.Function2[/* currentClass */ String, /* totalClass */ String, Unit]] = js.native
  
  /**
    * This parameter allows to customize "progress" pagination. Only for progress pagination type
    */
  var renderProgressbar: js.UndefOr[js.Function1[/* progressbarFillClass */ String, Unit]] = js.native
  
  /**
    * CSS class name of the element with total number of "snaps" in "fraction" pagination
    */
  var totalClass: js.UndefOr[String] = js.native
  
  /**
    * String with type of pagination. Can be "bullets", "fraction", "progressbar" or "custom"
    */
  var `type`: js.UndefOr[bullets | fraction | progressbar | custom] = js.native
}
object PaginationOptions {
  
  @scala.inline
  def apply(el: SelectableElement): PaginationOptions = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationOptions]
  }
  
  @scala.inline
  implicit class PaginationOptionsMutableBuilder[Self <: PaginationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulletActiveClass(value: String): Self = StObject.set(x, "bulletActiveClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletActiveClassUndefined: Self = StObject.set(x, "bulletActiveClass", js.undefined)
    
    @scala.inline
    def setBulletClass(value: String): Self = StObject.set(x, "bulletClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletClassUndefined: Self = StObject.set(x, "bulletClass", js.undefined)
    
    @scala.inline
    def setBulletElement(value: String): Self = StObject.set(x, "bulletElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletElementUndefined: Self = StObject.set(x, "bulletElement", js.undefined)
    
    @scala.inline
    def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableClass(value: String): Self = StObject.set(x, "clickableClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickableClassUndefined: Self = StObject.set(x, "clickableClass", js.undefined)
    
    @scala.inline
    def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
    
    @scala.inline
    def setCurrentClass(value: String): Self = StObject.set(x, "currentClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentClassUndefined: Self = StObject.set(x, "currentClass", js.undefined)
    
    @scala.inline
    def setDynamicBullets(value: Boolean): Self = StObject.set(x, "dynamicBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicBulletsUndefined: Self = StObject.set(x, "dynamicBullets", js.undefined)
    
    @scala.inline
    def setDynamicMainBullets(value: Double): Self = StObject.set(x, "dynamicMainBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicMainBulletsUndefined: Self = StObject.set(x, "dynamicMainBullets", js.undefined)
    
    @scala.inline
    def setEl(value: SelectableElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatFractionCurrent(value: /* number */ Double => Double): Self = StObject.set(x, "formatFractionCurrent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatFractionCurrentUndefined: Self = StObject.set(x, "formatFractionCurrent", js.undefined)
    
    @scala.inline
    def setFormatFractionTotal(value: /* number */ Double => Double): Self = StObject.set(x, "formatFractionTotal", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormatFractionTotalUndefined: Self = StObject.set(x, "formatFractionTotal", js.undefined)
    
    @scala.inline
    def setHiddenClass(value: String): Self = StObject.set(x, "hiddenClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenClassUndefined: Self = StObject.set(x, "hiddenClass", js.undefined)
    
    @scala.inline
    def setHideOnClick(value: Boolean): Self = StObject.set(x, "hideOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOnClickUndefined: Self = StObject.set(x, "hideOnClick", js.undefined)
    
    @scala.inline
    def setModifierClass(value: String): Self = StObject.set(x, "modifierClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierClassUndefined: Self = StObject.set(x, "modifierClass", js.undefined)
    
    @scala.inline
    def setProgressbarFillClass(value: String): Self = StObject.set(x, "progressbarFillClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressbarFillClassUndefined: Self = StObject.set(x, "progressbarFillClass", js.undefined)
    
    @scala.inline
    def setProgressbarOpposite(value: Boolean): Self = StObject.set(x, "progressbarOpposite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressbarOppositeUndefined: Self = StObject.set(x, "progressbarOpposite", js.undefined)
    
    @scala.inline
    def setRenderBullet(value: (/* index */ Double, /* className */ String) => Unit): Self = StObject.set(x, "renderBullet", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderBulletUndefined: Self = StObject.set(x, "renderBullet", js.undefined)
    
    @scala.inline
    def setRenderCustom(value: (/* swiper */ Swiper, /* current */ Double, /* total */ Double) => Unit): Self = StObject.set(x, "renderCustom", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRenderCustomUndefined: Self = StObject.set(x, "renderCustom", js.undefined)
    
    @scala.inline
    def setRenderFraction(value: (/* currentClass */ String, /* totalClass */ String) => Unit): Self = StObject.set(x, "renderFraction", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenderFractionUndefined: Self = StObject.set(x, "renderFraction", js.undefined)
    
    @scala.inline
    def setRenderProgressbar(value: /* progressbarFillClass */ String => Unit): Self = StObject.set(x, "renderProgressbar", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRenderProgressbarUndefined: Self = StObject.set(x, "renderProgressbar", js.undefined)
    
    @scala.inline
    def setTotalClass(value: String): Self = StObject.set(x, "totalClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalClassUndefined: Self = StObject.set(x, "totalClass", js.undefined)
    
    @scala.inline
    def setType(value: bullets | fraction | progressbar | custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
