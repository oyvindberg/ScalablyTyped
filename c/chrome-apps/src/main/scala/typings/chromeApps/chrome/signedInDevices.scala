package typings.chromeApps.chrome

import typings.chromeApps.chromeAppsStrings.android_
import typings.chromeApps.chromeAppsStrings.linux_
import typings.chromeApps.chromeAppsStrings.mac_
import typings.chromeApps.chromeAppsStrings.unknown__
import typings.chromeApps.chromeAppsStrings.win_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.signedInDevices
//////////////////////
// SignedIn Devices //
//////////////////////
/**
  * @requires(dev) Requires Chrome *dev*
  * Use the *chrome.signedInDevices* API to get a list of devices
  * signed into chrome with the same account as the current profile.
  */
object signedInDevices {
  
  @js.native
  trait DeviceInfo extends StObject {
    
    /** Version of chrome running in this device. */
    var chromeVersion: String = js.native
    
    /**
      * Unique Id for this device.
      * Note: The id is meaningful only in the current device.
      * This id cannot be used to refer to the same device from
      * another device or extension.
      */
    var id: String = js.native
    
    /**
      * Name of the device.
      * This name is usually set by the user when setting up a device.
      */
    var name: String = js.native
    
    /** The OS of the device. */
    var os: OS = js.native
    
    /** Device type */
    var `type`: DeviceType = js.native
  }
  object DeviceInfo {
    
    @scala.inline
    def apply(chromeVersion: String, id: String, name: String, os: OS, `type`: DeviceType): DeviceInfo = {
      val __obj = js.Dynamic.literal(chromeVersion = chromeVersion.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeviceInfo]
    }
    
    @scala.inline
    implicit class DeviceInfoMutableBuilder[Self <: DeviceInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChromeVersion(value: String): Self = StObject.set(x, "chromeVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: OS): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: DeviceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.desktop_or_laptop
    - typings.chromeApps.chromeAppsStrings.phone
    - typings.chromeApps.chromeAppsStrings.tablet
    - typings.chromeApps.chromeAppsStrings.unknown__
  */
  trait DeviceType extends StObject
  object DeviceType {
    
    @scala.inline
    def desktop_or_laptop: typings.chromeApps.chromeAppsStrings.desktop_or_laptop = "desktop_or_laptop".asInstanceOf[typings.chromeApps.chromeAppsStrings.desktop_or_laptop]
    
    @scala.inline
    def phone: typings.chromeApps.chromeAppsStrings.phone = "phone".asInstanceOf[typings.chromeApps.chromeAppsStrings.phone]
    
    @scala.inline
    def tablet: typings.chromeApps.chromeAppsStrings.tablet = "tablet".asInstanceOf[typings.chromeApps.chromeAppsStrings.tablet]
    
    @scala.inline
    def unknown: unknown__ = "unknown".asInstanceOf[unknown__]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chromeApps.chromeAppsStrings.win_
    - typings.chromeApps.chromeAppsStrings.mac_
    - typings.chromeApps.chromeAppsStrings.linux_
    - typings.chromeApps.chromeAppsStrings.chrome_os
    - typings.chromeApps.chromeAppsStrings.android_
    - typings.chromeApps.chromeAppsStrings.ios
    - typings.chromeApps.chromeAppsStrings.unknown__
  */
  trait OS extends StObject
  object OS {
    
    @scala.inline
    def android: android_ = "android".asInstanceOf[android_]
    
    @scala.inline
    def chrome_os: typings.chromeApps.chromeAppsStrings.chrome_os = "chrome_os".asInstanceOf[typings.chromeApps.chromeAppsStrings.chrome_os]
    
    @scala.inline
    def ios: typings.chromeApps.chromeAppsStrings.ios = "ios".asInstanceOf[typings.chromeApps.chromeAppsStrings.ios]
    
    @scala.inline
    def linux: linux_ = "linux".asInstanceOf[linux_]
    
    @scala.inline
    def mac: mac_ = "mac".asInstanceOf[mac_]
    
    @scala.inline
    def unknown: unknown__ = "unknown".asInstanceOf[unknown__]
    
    @scala.inline
    def win: win_ = "win".asInstanceOf[win_]
  }
}
