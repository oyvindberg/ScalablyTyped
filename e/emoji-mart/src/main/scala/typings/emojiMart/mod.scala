package typings.emojiMart

import typings.emojiMart.dataMod.Data
import typings.emojiMart.nimbleEmojiIndexMod.BaseEmoji
import typings.emojiMart.sharedPropsMod.EmojiSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("emoji-mart", "NimbleEmojiIndex")
  @js.native
  class NimbleEmojiIndex protected ()
    extends typings.emojiMart.distEsMod.NimbleEmojiIndex {
    def this(data: Data) = this()
  }
  
  @JSImport("emoji-mart", "getEmojiDataFromNative")
  @js.native
  def getEmojiDataFromNative(nativeString: String, set: EmojiSet, data: Data): BaseEmoji = js.native
}
