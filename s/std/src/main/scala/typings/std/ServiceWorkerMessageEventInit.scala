package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkerMessageEventInit extends EventInit {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var lastEventId: js.UndefOr[java.lang.String] = js.native
  
  var origin: js.UndefOr[java.lang.String] = js.native
  
  var ports: js.UndefOr[js.Array[MessagePort] | Null] = js.native
  
  var source: js.UndefOr[ServiceWorker | MessagePort | Null] = js.native
}
object ServiceWorkerMessageEventInit {
  
  @scala.inline
  def apply(): ServiceWorkerMessageEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceWorkerMessageEventInit]
  }
  
  @scala.inline
  implicit class ServiceWorkerMessageEventInitMutableBuilder[Self <: ServiceWorkerMessageEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLastEventId(value: java.lang.String): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEventIdUndefined: Self = StObject.set(x, "lastEventId", js.undefined)
    
    @scala.inline
    def setOrigin(value: java.lang.String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPorts(value: js.Array[MessagePort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsNull: Self = StObject.set(x, "ports", null)
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: MessagePort*): Self = StObject.set(x, "ports", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: ServiceWorker | MessagePort): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
