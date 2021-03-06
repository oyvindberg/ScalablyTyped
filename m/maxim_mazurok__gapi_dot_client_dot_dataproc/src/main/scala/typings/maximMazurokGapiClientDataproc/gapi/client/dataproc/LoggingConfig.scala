package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingConfig extends StObject {
  
  /** The per-package log levels for the driver. This may include "root" package name to configure rootLogger. Examples: 'com.google = FATAL', 'root = INFO', 'org.apache = DEBUG' */
  var driverLogLevels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.LoggingConfig with TopLevel[js.Any]
  ] = js.native
}
object LoggingConfig {
  
  @scala.inline
  def apply(): LoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggingConfig]
  }
  
  @scala.inline
  implicit class LoggingConfigMutableBuilder[Self <: LoggingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriverLogLevels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientDataproc.maximMazurokGapiClientDataprocStrings.LoggingConfig with TopLevel[js.Any]
    ): Self = StObject.set(x, "driverLogLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverLogLevelsUndefined: Self = StObject.set(x, "driverLogLevels", js.undefined)
  }
}
