package typings.officeUiFabricReact

import typings.officeUiFabricReact.teachingBubbleBaseMod.ITeachingBubbleState
import typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teachingBubbleContentBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubbleContent.base", "TeachingBubbleContentBase")
  @js.native
  class TeachingBubbleContentBase protected ()
    extends Component[ITeachingBubbleProps, ITeachingBubbleState, js.Any] {
    def this(props: ITeachingBubbleProps) = this()
    
    var _onKeyDown: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MTeachingBubbleContentBase(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MTeachingBubbleContentBase(): Unit = js.native
    
    def focus(): Unit = js.native
    
    var rootElement: RefObject[HTMLDivElement] = js.native
  }
}
