package typings.maximMazurokGapiClientCivicinfo

import typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo.DivisionsResource
import typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo.ElectionsResource
import typings.maximMazurokGapiClientCivicinfo.gapi.client.civicinfo.RepresentativesResource
import typings.maximMazurokGapiClientCivicinfo.maximMazurokGapiClientCivicinfoStrings.civicinfo
import typings.maximMazurokGapiClientCivicinfo.maximMazurokGapiClientCivicinfoStrings.v2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object civicinfo {
        
        @JSGlobal("gapi.client.civicinfo.divisions")
        @js.native
        val divisions: DivisionsResource = js.native
        
        @JSGlobal("gapi.client.civicinfo.elections")
        @js.native
        val elections: ElectionsResource = js.native
        
        @JSGlobal("gapi.client.civicinfo.representatives")
        @js.native
        val representatives: RepresentativesResource = js.native
      }
      
      /** Load Google Civic Information API v2 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: civicinfo, version: v2): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: civicinfo, version: v2, callback: js.Function0[_]): Unit = js.native
    }
  }
}
