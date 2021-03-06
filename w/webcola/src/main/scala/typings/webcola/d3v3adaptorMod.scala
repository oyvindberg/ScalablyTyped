package typings.webcola

import typings.webcola.d3adaptorMod.ID3StyleLayoutAdaptor
import typings.webcola.layoutMod.Event
import typings.webcola.layoutMod.Layout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object d3v3adaptorMod {
  
  @JSImport("webcola/dist/src/d3v3adaptor", "D3StyleLayoutAdaptor")
  @js.native
  class D3StyleLayoutAdaptor ()
    extends Layout
       with ID3StyleLayoutAdaptor {
    
    /* InferMemberOverrides */
    /* protected */ override def kick(): Unit = js.native
    
    /* InferMemberOverrides */
    /* protected */ override def trigger(e: Event): Unit = js.native
  }
  
  @JSImport("webcola/dist/src/d3v3adaptor", "d3adaptor")
  @js.native
  def d3adaptor(): D3StyleLayoutAdaptor = js.native
}
