package typings.javascriptTimeAgo

import org.scalablytyped.runtime.Shortcut
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.sl
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typings.javascriptTimeAgo.localeMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slMod extends Shortcut {
  
  @JSImport("javascript-time-ago/locale/sl", JSImport.Namespace)
  @js.native
  val ^ : Locale = js.native
  
  @js.native
  trait Locale extends StObject {
    
    var locale: sl = js.native
    
    var long: Duration = js.native
    
    var narrow: Duration = js.native
    
    def quantify(n: Double): one | two | few | other = js.native
    
    var short: Duration = js.native
  }
  object Locale {
    
    @scala.inline
    def apply(
      locale: sl,
      long: Duration,
      narrow: Duration,
      quantify: Double => one | two | few | other,
      short: Duration
    ): Locale = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Locale]
    }
    
    @scala.inline
    implicit class LocaleMutableBuilder[Self <: Locale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: sl): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong(value: Duration): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNarrow(value: Duration): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantify(value: Double => one | two | few | other): Self = StObject.set(x, "quantify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShort(value: Duration): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Locale
  
  /* This means you don't have to write `^`, but can instead just say `slMod.foo` */
  override def _to: Locale = ^
}
