package typings.oracleOraclejet.ojdiagramMod

import typings.oracleOraclejet.anon.H
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DvtDiagramLayoutContext extends StObject {
  
  def getCommonContainer(nodeId1: js.Any, nodeId2: js.Any): js.Any = js.native
  
  def getComponentSize(): H = js.native
  
  def getCurrentViewport(): H = js.native
  
  def getEventData(): js.Object = js.native
  
  def getLinkById(id: js.Any): DvtDiagramLayoutContextLink = js.native
  
  def getLinkByIndex(index: Double): DvtDiagramLayoutContextLink = js.native
  
  def getLinkCount(): Double = js.native
  
  def getNodeById(id: js.Any): DvtDiagramLayoutContextNode = js.native
  
  def getNodeByIndex(index: Double): DvtDiagramLayoutContextNode = js.native
  
  def getNodeCount(): Double = js.native
  
  def getViewport(): H = js.native
  
  def isLocaleR2L(): Boolean = js.native
  
  def setViewport(viewport: H): Unit = js.native
}
object DvtDiagramLayoutContext {
  
  @scala.inline
  def apply(
    getCommonContainer: (js.Any, js.Any) => js.Any,
    getComponentSize: () => H,
    getCurrentViewport: () => H,
    getEventData: () => js.Object,
    getLinkById: js.Any => DvtDiagramLayoutContextLink,
    getLinkByIndex: Double => DvtDiagramLayoutContextLink,
    getLinkCount: () => Double,
    getNodeById: js.Any => DvtDiagramLayoutContextNode,
    getNodeByIndex: Double => DvtDiagramLayoutContextNode,
    getNodeCount: () => Double,
    getViewport: () => H,
    isLocaleR2L: () => Boolean,
    setViewport: H => Unit
  ): DvtDiagramLayoutContext = {
    val __obj = js.Dynamic.literal(getCommonContainer = js.Any.fromFunction2(getCommonContainer), getComponentSize = js.Any.fromFunction0(getComponentSize), getCurrentViewport = js.Any.fromFunction0(getCurrentViewport), getEventData = js.Any.fromFunction0(getEventData), getLinkById = js.Any.fromFunction1(getLinkById), getLinkByIndex = js.Any.fromFunction1(getLinkByIndex), getLinkCount = js.Any.fromFunction0(getLinkCount), getNodeById = js.Any.fromFunction1(getNodeById), getNodeByIndex = js.Any.fromFunction1(getNodeByIndex), getNodeCount = js.Any.fromFunction0(getNodeCount), getViewport = js.Any.fromFunction0(getViewport), isLocaleR2L = js.Any.fromFunction0(isLocaleR2L), setViewport = js.Any.fromFunction1(setViewport))
    __obj.asInstanceOf[DvtDiagramLayoutContext]
  }
  
  @scala.inline
  implicit class DvtDiagramLayoutContextMutableBuilder[Self <: DvtDiagramLayoutContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCommonContainer(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "getCommonContainer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetComponentSize(value: () => H): Self = StObject.set(x, "getComponentSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentViewport(value: () => H): Self = StObject.set(x, "getCurrentViewport", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEventData(value: () => js.Object): Self = StObject.set(x, "getEventData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLinkById(value: js.Any => DvtDiagramLayoutContextLink): Self = StObject.set(x, "getLinkById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLinkByIndex(value: Double => DvtDiagramLayoutContextLink): Self = StObject.set(x, "getLinkByIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLinkCount(value: () => Double): Self = StObject.set(x, "getLinkCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNodeById(value: js.Any => DvtDiagramLayoutContextNode): Self = StObject.set(x, "getNodeById", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeByIndex(value: Double => DvtDiagramLayoutContextNode): Self = StObject.set(x, "getNodeByIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNodeCount(value: () => Double): Self = StObject.set(x, "getNodeCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetViewport(value: () => H): Self = StObject.set(x, "getViewport", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLocaleR2L(value: () => Boolean): Self = StObject.set(x, "isLocaleR2L", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetViewport(value: H => Unit): Self = StObject.set(x, "setViewport", js.Any.fromFunction1(value))
  }
}
