package typings.eslint.anon

import typings.eslint.mod.Rule.ReportDescriptorLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeNode extends ReportDescriptorLocation {
  var node: typings.estree.mod.Node = js.native
}

object NodeNode {
  @scala.inline
  def apply(node: typings.estree.mod.Node): NodeNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeNode]
  }
  @scala.inline
  implicit class NodeNodeOps[Self <: NodeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNode(value: typings.estree.mod.Node): Self = this.set("node", value.asInstanceOf[js.Any])
  }
  
}

