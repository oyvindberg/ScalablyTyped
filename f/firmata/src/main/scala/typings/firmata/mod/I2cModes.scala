package typings.firmata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-name
@js.native
trait I2cModes extends StObject {
  
  var CONTINUOUS_READ: I2C_MODE = js.native
  
  var READ: I2C_MODE = js.native
  
  var STOP_READING: I2C_MODE = js.native
  
  var WRITE: I2C_MODE = js.native
}
object I2cModes {
  
  @scala.inline
  def apply(CONTINUOUS_READ: I2C_MODE, READ: I2C_MODE, STOP_READING: I2C_MODE, WRITE: I2C_MODE): I2cModes = {
    val __obj = js.Dynamic.literal(CONTINUOUS_READ = CONTINUOUS_READ.asInstanceOf[js.Any], READ = READ.asInstanceOf[js.Any], STOP_READING = STOP_READING.asInstanceOf[js.Any], WRITE = WRITE.asInstanceOf[js.Any])
    __obj.asInstanceOf[I2cModes]
  }
  
  @scala.inline
  implicit class I2cModesMutableBuilder[Self <: I2cModes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCONTINUOUS_READ(value: I2C_MODE): Self = StObject.set(x, "CONTINUOUS_READ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREAD(value: I2C_MODE): Self = StObject.set(x, "READ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTOP_READING(value: I2C_MODE): Self = StObject.set(x, "STOP_READING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWRITE(value: I2C_MODE): Self = StObject.set(x, "WRITE", value.asInstanceOf[js.Any])
  }
}
