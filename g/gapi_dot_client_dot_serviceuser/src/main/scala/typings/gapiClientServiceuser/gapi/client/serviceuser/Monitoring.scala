package typings.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Monitoring extends js.Object {
  /**
    * Monitoring configurations for sending metrics to the consumer project.
    * There can be multiple consumer destinations, each one must have a
    * different monitored resource type. A metric can be used in at most
    * one consumer destination.
    */
  var consumerDestinations: js.UndefOr[js.Array[MonitoringDestination]] = js.native
  /**
    * Monitoring configurations for sending metrics to the producer project.
    * There can be multiple producer destinations, each one must have a
    * different monitored resource type. A metric can be used in at most
    * one producer destination.
    */
  var producerDestinations: js.UndefOr[js.Array[MonitoringDestination]] = js.native
}

object Monitoring {
  @scala.inline
  def apply(): Monitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Monitoring]
  }
  @scala.inline
  implicit class MonitoringOps[Self <: Monitoring] (val x: Self) extends AnyVal {
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
    def setConsumerDestinationsVarargs(value: MonitoringDestination*): Self = this.set("consumerDestinations", js.Array(value :_*))
    @scala.inline
    def setConsumerDestinations(value: js.Array[MonitoringDestination]): Self = this.set("consumerDestinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumerDestinations: Self = this.set("consumerDestinations", js.undefined)
    @scala.inline
    def setProducerDestinationsVarargs(value: MonitoringDestination*): Self = this.set("producerDestinations", js.Array(value :_*))
    @scala.inline
    def setProducerDestinations(value: js.Array[MonitoringDestination]): Self = this.set("producerDestinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducerDestinations: Self = this.set("producerDestinations", js.undefined)
  }
  
}

