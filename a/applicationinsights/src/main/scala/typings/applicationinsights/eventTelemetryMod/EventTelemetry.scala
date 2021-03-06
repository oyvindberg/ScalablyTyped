package typings.applicationinsights.eventTelemetryMod

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.telemetryMod.Telemetry
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTelemetry extends Telemetry {
  /**
    * Metrics associated with this event, displayed in Metrics Explorer on the portal.
    */
  var measurements: js.UndefOr[StringDictionary[Double]] = js.undefined
  /**
    * Name of the event
    */
  var name: String
}

object EventTelemetry {
  @scala.inline
  def apply(
    name: String,
    contextObjects: StringDictionary[js.Any] = null,
    measurements: StringDictionary[Double] = null,
    properties: StringDictionary[String] = null,
    tagOverrides: StringDictionary[String] = null,
    time: Date = null
  ): EventTelemetry = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (contextObjects != null) __obj.updateDynamic("contextObjects")(contextObjects.asInstanceOf[js.Any])
    if (measurements != null) __obj.updateDynamic("measurements")(measurements.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (tagOverrides != null) __obj.updateDynamic("tagOverrides")(tagOverrides.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTelemetry]
  }
}

