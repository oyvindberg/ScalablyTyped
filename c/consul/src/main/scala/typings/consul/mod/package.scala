package typings.consul

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[TData] = js.Function3[
    /* err */ js.UndefOr[typings.std.Error], 
    /* data */ js.UndefOr[TData], 
    /* res */ js.UndefOr[typings.consul.mod.Response], 
    js.Any
  ]
}
