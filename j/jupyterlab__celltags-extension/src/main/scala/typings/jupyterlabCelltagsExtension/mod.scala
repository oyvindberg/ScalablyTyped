package typings.jupyterlabCelltagsExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Initialization data for the celltags extension.
    */
  @JSImport("@jupyterlab/celltags-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[Unit] = js.native
  
  type _To = JupyterFrontEndPlugin[Unit]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[Unit] = default
}
