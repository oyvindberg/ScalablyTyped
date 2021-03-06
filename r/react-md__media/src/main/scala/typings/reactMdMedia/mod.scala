package typings.reactMdMedia

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdMedia.mediaContainerMod.MediaContainerProps
import typings.reactMdMedia.mediaContainerMod.MediaContainerWithAspectRatioProps
import typings.reactMdMedia.mediaOverlayMod.MediaOverlayProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/media", "MediaContainer")
  @js.native
  val MediaContainer: ForwardRefExoticComponent[
    (MediaContainerProps with RefAttributes[HTMLDivElement]) | (MediaContainerWithAspectRatioProps with RefAttributes[HTMLDivElement])
  ] = js.native
  
  @JSImport("@react-md/media", "MediaOverlay")
  @js.native
  val MediaOverlay: ForwardRefExoticComponent[MediaOverlayProps with RefAttributes[HTMLDivElement]] = js.native
}
