package typings.chromeApps.chrome.system

import typings.chromeApps.anon.FIXED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.REMOVABLE
import typings.chromeApps.chromeAppsStrings.UNKNOWN
import typings.chromeApps.chromeAppsStrings.fixed_
import typings.chromeApps.chromeAppsStrings.removable_
import typings.chromeApps.chromeAppsStrings.unknown__
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// System Storage //
////////////////////
/**
  * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
  * @requires Permissions: 'system.storage'
  * @since Chrome 30.
  */
object storage {
  
  @js.native
  trait StorageCapacityInfo extends StObject {
    
    /** The available capacity of the storage device, in bytes. */
    var availableCapacity: integer = js.native
    
    /** A copied **id** of getAvailableCapacity function parameter **id**. */
    var id: String = js.native
  }
  object StorageCapacityInfo {
    
    @scala.inline
    def apply(availableCapacity: integer, id: String): StorageCapacityInfo = {
      val __obj = js.Dynamic.literal(availableCapacity = availableCapacity.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageCapacityInfo]
    }
    
    @scala.inline
    implicit class StorageCapacityInfoMutableBuilder[Self <: StorageCapacityInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailableCapacity(value: integer): Self = StObject.set(x, "availableCapacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StorageUnitInfo extends StObject {
    
    /** The total amount of the storage space, in bytes. */
    var capacity: integer = js.native
    
    /**
      * The transient ID that uniquely identifies the storage device.
      * This ID will be persistent within the same run of a single application.
      * It will not be a persistent identifier between different runs of an application, or between different applications.
      */
    var id: String = js.native
    
    /** The name of the storage unit. */
    var name: String = js.native
    
    /**
      * The media type of the storage unit.
      * fixed: The storage has fixed media, e.g. hard disk or SSD.
      * removable: The storage is removable, e.g. USB flash drive.
      * unknown: The storage type is unknown.
      * @see enum StorageUnitType
      */
    var `type`: ToStringLiteral[
        FIXED, 
        /* keyof chrome-apps.anon.FIXED */ typings.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
        Exclude[
          /* keyof chrome-apps.anon.FIXED */ typings.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
          fixed_ | removable_ | unknown__
        ]
      ] = js.native
  }
  object StorageUnitInfo {
    
    @scala.inline
    def apply(
      capacity: integer,
      id: String,
      name: String,
      `type`: ToStringLiteral[
          FIXED, 
          /* keyof chrome-apps.anon.FIXED */ typings.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
          Exclude[
            /* keyof chrome-apps.anon.FIXED */ typings.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
            fixed_ | removable_ | unknown__
          ]
        ]
    ): StorageUnitInfo = {
      val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageUnitInfo]
    }
    
    @scala.inline
    implicit class StorageUnitInfoMutableBuilder[Self <: StorageUnitInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCapacity(value: integer): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(
        value: ToStringLiteral[
              FIXED, 
              /* keyof chrome-apps.anon.FIXED */ typings.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
              Exclude[
                /* keyof chrome-apps.anon.FIXED */ typings.chromeApps.chromeAppsStrings.FIXED | REMOVABLE | UNKNOWN, 
                fixed_ | removable_ | unknown__
              ]
            ]
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
