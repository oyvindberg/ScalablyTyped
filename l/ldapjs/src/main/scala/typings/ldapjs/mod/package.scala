package typings.ldapjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CallBack = js.Function2[
    /* error */ typings.ldapjs.mod.Error | scala.Null, 
    /* result */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  type CompareCallback = js.Function2[
    /* error */ typings.ldapjs.mod.Error | scala.Null, 
    /* matched */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  
  type Control = js.Any
  
  type ErrorCallback = js.Function1[/* error */ typings.ldapjs.mod.Error, scala.Unit]
  
  type ExopCallback = js.Function3[
    /* error */ typings.ldapjs.mod.Error | scala.Null, 
    /* value */ java.lang.String, 
    /* result */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  type SearchCallBack = js.Function2[
    /* error */ typings.ldapjs.mod.Error | scala.Null, 
    /* result */ typings.ldapjs.mod.SearchCallbackResponse, 
    scala.Unit
  ]
  
  type SearchReference = js.Any
  
  @scala.inline
  def createClient(): typings.ldapjs.mod.Client = typings.ldapjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClient")().asInstanceOf[typings.ldapjs.mod.Client]
  @scala.inline
  def createClient(options: typings.ldapjs.mod.ClientOptions): typings.ldapjs.mod.Client = typings.ldapjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[typings.ldapjs.mod.Client]
  
  @scala.inline
  def createServer(): typings.ldapjs.mod.Server = typings.ldapjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[typings.ldapjs.mod.Server]
  @scala.inline
  def createServer(options: typings.ldapjs.mod.ServerOptions): typings.ldapjs.mod.Server = typings.ldapjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.ldapjs.mod.Server]
  
  @scala.inline
  def parseDN(dn: java.lang.String): js.Any = typings.ldapjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseDN")(dn.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def parseFilter(filterString: java.lang.String): typings.ldapjs.mod.Filter = typings.ldapjs.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseFilter")(filterString.asInstanceOf[js.Any]).asInstanceOf[typings.ldapjs.mod.Filter]
}
