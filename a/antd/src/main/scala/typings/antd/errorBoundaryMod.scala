package typings.antd

import typings.antd.anon.Error
import typings.antd.anon.Info
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorBoundaryMod {
  
  @JSImport("antd/lib/alert/ErrorBoundary", JSImport.Default)
  @js.native
  class default () extends ErrorBoundary
  
  @js.native
  trait ErrorBoundary
    extends Component[ErrorBoundaryProps, Error, js.Any] {
    
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(error: Null, info: js.Object): Unit = js.native
    @JSName("componentDidCatch")
    def componentDidCatch_MErrorBoundary(error: typings.std.Error, info: js.Object): Unit = js.native
    
    @JSName("state")
    var state_ErrorBoundary: Info = js.native
  }
  
  @js.native
  trait ErrorBoundaryProps extends StObject {
    
    var description: js.UndefOr[ReactNode] = js.native
    
    var message: js.UndefOr[ReactNode] = js.native
  }
  object ErrorBoundaryProps {
    
    @scala.inline
    def apply(): ErrorBoundaryProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBoundaryProps]
    }
    
    @scala.inline
    implicit class ErrorBoundaryPropsMutableBuilder[Self <: ErrorBoundaryProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: ReactNode): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setMessage(value: ReactNode): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
