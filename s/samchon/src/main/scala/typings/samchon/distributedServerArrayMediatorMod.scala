package typings.samchon

import typings.samchon.distributedSystemArrayMediatorMod.DistributedSystemArrayMediator
import typings.samchon.idistributedserverMod.IDistributedServer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributedServerArrayMediatorMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.ecol.ieventdispatcherMod.IEventDispatcher because Already inherited
  - typings.ecol.icollectionMod.ICollection because Already inherited
  - typings.ecol.dequeCollectionMod.DequeCollection because Already inherited
  - typings.ecol.mod.DequeCollection because Already inherited
  - typings.samchon.iprotocolMod.IProtocol because Already inherited
  - typings.samchon.entityCollectionMod.EntityDequeCollection because Already inherited
  - typings.samchon.externalSystemArrayMod.ExternalSystemArray because Already inherited
  - typings.samchon.iexternalserverarrayMod.IExternalServerArray because var conflicts: _Handle_system_erase, _Notify_erase, _Notify_insert, dispatcher_. Inlined connect */ @JSImport("samchon/templates/distributed/derived/DistributedServerArrayMediator", "DistributedServerArrayMediator")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class DistributedServerArrayMediator[System /* <: IDistributedServer */] () extends DistributedSystemArrayMediator[System] {
    
    /**
      * @inheritdoc
      */
    /**
      * Connect to {@link IExternalServer external servers}.
      *
      * This method calls children elements' method {@link IExternalServer.connect} gradually.
      */
    def connect(): Unit = js.native
  }
}
