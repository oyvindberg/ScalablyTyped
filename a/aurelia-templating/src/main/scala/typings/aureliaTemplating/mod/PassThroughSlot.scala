package typings.aureliaTemplating.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aurelia-templating", "PassThroughSlot")
@js.native
class PassThroughSlot () extends StObject {
  def this(anchor: js.Any) = this()
  def this(anchor: js.UndefOr[scala.Nothing], name: js.Any) = this()
  def this(anchor: js.Any, name: js.Any) = this()
  def this(anchor: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], destinationName: js.Any) = this()
  def this(anchor: js.UndefOr[scala.Nothing], name: js.Any, destinationName: js.Any) = this()
  def this(anchor: js.Any, name: js.UndefOr[scala.Nothing], destinationName: js.Any) = this()
  def this(anchor: js.Any, name: js.Any, destinationName: js.Any) = this()
  def this(
    anchor: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    destinationName: js.UndefOr[scala.Nothing],
    fallbackFactory: js.Any
  ) = this()
  def this(
    anchor: js.UndefOr[scala.Nothing],
    name: js.UndefOr[scala.Nothing],
    destinationName: js.Any,
    fallbackFactory: js.Any
  ) = this()
  def this(
    anchor: js.UndefOr[scala.Nothing],
    name: js.Any,
    destinationName: js.UndefOr[scala.Nothing],
    fallbackFactory: js.Any
  ) = this()
  def this(anchor: js.UndefOr[scala.Nothing], name: js.Any, destinationName: js.Any, fallbackFactory: js.Any) = this()
  def this(
    anchor: js.Any,
    name: js.UndefOr[scala.Nothing],
    destinationName: js.UndefOr[scala.Nothing],
    fallbackFactory: js.Any
  ) = this()
  def this(anchor: js.Any, name: js.UndefOr[scala.Nothing], destinationName: js.Any, fallbackFactory: js.Any) = this()
  def this(anchor: js.Any, name: js.Any, destinationName: js.UndefOr[scala.Nothing], fallbackFactory: js.Any) = this()
  def this(anchor: js.Any, name: js.Any, destinationName: js.Any, fallbackFactory: js.Any) = this()
  
  /**
    * @param {View} view
    * @param {Node} node
    * @param {ViewSlot} projectionSource
    * @param {number} index
    */
  def addNode(): js.Any = js.native
  def addNode(
    view: js.UndefOr[scala.Nothing],
    node: js.UndefOr[scala.Nothing],
    projectionSource: js.UndefOr[scala.Nothing],
    index: js.Any
  ): js.Any = js.native
  def addNode(view: js.UndefOr[scala.Nothing], node: js.UndefOr[scala.Nothing], projectionSource: js.Any): js.Any = js.native
  def addNode(
    view: js.UndefOr[scala.Nothing],
    node: js.UndefOr[scala.Nothing],
    projectionSource: js.Any,
    index: js.Any
  ): js.Any = js.native
  def addNode(view: js.UndefOr[scala.Nothing], node: js.Any): js.Any = js.native
  def addNode(
    view: js.UndefOr[scala.Nothing],
    node: js.Any,
    projectionSource: js.UndefOr[scala.Nothing],
    index: js.Any
  ): js.Any = js.native
  def addNode(view: js.UndefOr[scala.Nothing], node: js.Any, projectionSource: js.Any): js.Any = js.native
  def addNode(view: js.UndefOr[scala.Nothing], node: js.Any, projectionSource: js.Any, index: js.Any): js.Any = js.native
  def addNode(view: js.Any): js.Any = js.native
  def addNode(
    view: js.Any,
    node: js.UndefOr[scala.Nothing],
    projectionSource: js.UndefOr[scala.Nothing],
    index: js.Any
  ): js.Any = js.native
  def addNode(view: js.Any, node: js.UndefOr[scala.Nothing], projectionSource: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: js.UndefOr[scala.Nothing], projectionSource: js.Any, index: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: js.Any, projectionSource: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: js.Any, projectionSource: js.Any): js.Any = js.native
  def addNode(view: js.Any, node: js.Any, projectionSource: js.Any, index: js.Any): js.Any = js.native
  
  def attached(): js.Any = js.native
  
  /**
    * @param {View} view
    */
  def bind(): js.Any = js.native
  def bind(view: js.Any): js.Any = js.native
  
  /**
    * @param {View} ownerView
    */
  def created(): js.Any = js.native
  def created(ownerView: js.Any): js.Any = js.native
  
  def detached(): js.Any = js.native
  
  /**
    * Indicate whether this slot should render fallback default slot content
    */
  var needsFallbackRendering: js.Any = js.native
  
  /**
    * @param {PassThroughSlot | ShadowSlot} destinationSlot
    */
  def passThroughTo(): js.Any = js.native
  def passThroughTo(destinationSlot: js.Any): js.Any = js.native
  
  /**
    * @param {View} view
    * @param {ViewSlot} projectionSource
    */
  def projectFrom(): js.Any = js.native
  def projectFrom(view: js.UndefOr[scala.Nothing], projectionSource: js.Any): js.Any = js.native
  def projectFrom(view: js.Any): js.Any = js.native
  def projectFrom(view: js.Any, projectionSource: js.Any): js.Any = js.native
  
  /**
    * @param {ViewSlot} projectionSource
    */
  def removeAll(): js.Any = js.native
  def removeAll(projectionSource: js.Any): js.Any = js.native
  
  /**
    * @param {View} view
    * @param {ViewSlot} projectionSource
    */
  def removeView(): js.Any = js.native
  def removeView(view: js.UndefOr[scala.Nothing], projectionSource: js.Any): js.Any = js.native
  def removeView(view: js.Any): js.Any = js.native
  def removeView(view: js.Any, projectionSource: js.Any): js.Any = js.native
  
  /**
    * @param {View} view
    * @param {Node[]} nodes
    * @param {ViewSlot} projectionSource
    * @param {number} index
    */
  def renderFallbackContent(): js.Any = js.native
  def renderFallbackContent(
    view: js.UndefOr[scala.Nothing],
    nodes: js.UndefOr[scala.Nothing],
    projectionSource: js.UndefOr[scala.Nothing],
    index: js.Any
  ): js.Any = js.native
  def renderFallbackContent(view: js.UndefOr[scala.Nothing], nodes: js.UndefOr[scala.Nothing], projectionSource: js.Any): js.Any = js.native
  def renderFallbackContent(
    view: js.UndefOr[scala.Nothing],
    nodes: js.UndefOr[scala.Nothing],
    projectionSource: js.Any,
    index: js.Any
  ): js.Any = js.native
  def renderFallbackContent(view: js.UndefOr[scala.Nothing], nodes: js.Any): js.Any = js.native
  def renderFallbackContent(
    view: js.UndefOr[scala.Nothing],
    nodes: js.Any,
    projectionSource: js.UndefOr[scala.Nothing],
    index: js.Any
  ): js.Any = js.native
  def renderFallbackContent(view: js.UndefOr[scala.Nothing], nodes: js.Any, projectionSource: js.Any): js.Any = js.native
  def renderFallbackContent(view: js.UndefOr[scala.Nothing], nodes: js.Any, projectionSource: js.Any, index: js.Any): js.Any = js.native
  def renderFallbackContent(view: js.Any): js.Any = js.native
  def renderFallbackContent(
    view: js.Any,
    nodes: js.UndefOr[scala.Nothing],
    projectionSource: js.UndefOr[scala.Nothing],
    index: js.Any
  ): js.Any = js.native
  def renderFallbackContent(view: js.Any, nodes: js.UndefOr[scala.Nothing], projectionSource: js.Any): js.Any = js.native
  def renderFallbackContent(view: js.Any, nodes: js.UndefOr[scala.Nothing], projectionSource: js.Any, index: js.Any): js.Any = js.native
  def renderFallbackContent(view: js.Any, nodes: js.Any): js.Any = js.native
  def renderFallbackContent(view: js.Any, nodes: js.Any, projectionSource: js.UndefOr[scala.Nothing], index: js.Any): js.Any = js.native
  def renderFallbackContent(view: js.Any, nodes: js.Any, projectionSource: js.Any): js.Any = js.native
  def renderFallbackContent(view: js.Any, nodes: js.Any, projectionSource: js.Any, index: js.Any): js.Any = js.native
  
  def unbind(): js.Any = js.native
}
