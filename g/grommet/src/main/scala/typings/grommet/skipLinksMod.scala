package typings.grommet

import typings.grommet.anon.SkipTo
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skipLinksMod {
  
  @JSImport("grommet/components/SkipLinks", "SkipLinks")
  @js.native
  val SkipLinks: FC[SkipLinksProps] = js.native
  
  @js.native
  trait SkipLinksProps extends StObject {
    
    var children: ReactNode = js.native
    
    var messages: js.UndefOr[SkipTo] = js.native
  }
  object SkipLinksProps {
    
    @scala.inline
    def apply(): SkipLinksProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipLinksProps]
    }
    
    @scala.inline
    implicit class SkipLinksPropsMutableBuilder[Self <: SkipLinksProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setMessages(value: SkipTo): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    }
  }
}
