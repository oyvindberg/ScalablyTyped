package typings.stormReactDiagrams

import typings.react.mod.global.JSX.Element
import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import typings.stormReactDiagrams.baseWidgetMod.BaseWidgetProps
import typings.stormReactDiagrams.defaultNodeModelMod.DefaultNodeModel
import typings.stormReactDiagrams.diagramEngineMod.DiagramEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultNodeWidgetMod {
  
  @JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultNodeWidget", "DefaultNodeWidget")
  @js.native
  class DefaultNodeWidget protected () extends BaseWidget[DefaultNodeProps, DefaultNodeState] {
    def this(props: DefaultNodeProps) = this()
    
    def generatePort(port: js.Any): Element = js.native
  }
  
  @js.native
  trait DefaultNodeProps extends BaseWidgetProps {
    
    var diagramEngine: DiagramEngine = js.native
    
    var node: DefaultNodeModel = js.native
  }
  object DefaultNodeProps {
    
    @scala.inline
    def apply(diagramEngine: DiagramEngine, node: DefaultNodeModel): DefaultNodeProps = {
      val __obj = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultNodeProps]
    }
    
    @scala.inline
    implicit class DefaultNodePropsMutableBuilder[Self <: DefaultNodeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiagramEngine(value: DiagramEngine): Self = StObject.set(x, "diagramEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: DefaultNodeModel): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefaultNodeState extends StObject
}
