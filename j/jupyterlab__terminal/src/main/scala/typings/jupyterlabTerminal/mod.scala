package typings.jupyterlabTerminal

import typings.jupyterlabServices.terminalTerminalMod.ITerminalConnection
import typings.jupyterlabTerminal.anon.PartialIOptions
import typings.jupyterlabTerminal.tokensMod.ITerminal.IOptions
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ITerminal {
    
    /**
      * The default options used for creating terminals.
      */
    @JSImport("@jupyterlab/terminal", "ITerminal.defaultOptions")
    @js.native
    val defaultOptions: IOptions = js.native
  }
  
  @JSImport("@jupyterlab/terminal", "ITerminalTracker")
  @js.native
  val ITerminalTracker: Token[typings.jupyterlabTerminal.tokensMod.ITerminalTracker] = js.native
  
  @JSImport("@jupyterlab/terminal", "Terminal")
  @js.native
  class Terminal protected ()
    extends typings.jupyterlabTerminal.widgetMod.Terminal {
    /**
      * Construct a new terminal widget.
      *
      * @param session - The terminal session object.
      *
      * @param options - The terminal configuration options.
      */
    def this(session: ITerminalConnection) = this()
    def this(session: ITerminalConnection, options: PartialIOptions) = this()
  }
}
