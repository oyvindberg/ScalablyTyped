package typings.actionsOnGoogle

import typings.actionsOnGoogle.carouselMod.CarouselOptions
import typings.actionsOnGoogle.listMod.ListOptions
import typings.actionsOnGoogle.optionOptionMod.ApiOptionItem
import typings.actionsOnGoogle.optionOptionMod.OptionItem
import typings.actionsOnGoogle.optionOptionMod.OptionItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option", "Carousel")
  @js.native
  class Carousel protected ()
    extends typings.actionsOnGoogle.carouselMod.Carousel {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option", "List")
  @js.native
  class List protected ()
    extends typings.actionsOnGoogle.listMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option", "convert")
  @js.native
  def convert(items: OptionItems[String | OptionItem]): js.Array[ApiOptionItem] = js.native
}
