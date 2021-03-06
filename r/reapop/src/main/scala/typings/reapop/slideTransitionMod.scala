package typings.reapop

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reapop.typesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideTransitionMod {
  
  @JSImport("reapop/dist/components/SlideTransition", JSImport.Default)
  @js.native
  def default(props: Props): Element = js.native
  
  @js.native
  trait Props
    extends /* index */ StringDictionary[js.Any] {
    
    var children: ReactNode = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var notification: Notification = js.native
  }
  object Props {
    
    @scala.inline
    def apply(notification: Notification): Props = {
      val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
}
