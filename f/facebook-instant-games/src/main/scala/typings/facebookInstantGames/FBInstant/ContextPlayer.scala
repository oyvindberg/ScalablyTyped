package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents information about a player who is in the context that the current player is playing in.
  */
@js.native
trait ContextPlayer extends StObject {
  
  /**
    * Get the id of the context player.
    *
    * @returns The ID of the context player
    */
  def getID(): String = js.native
  
  /**
    * Get the player's localized display name.
    *
    * @returns The player's localized display name.
    */
  def getName(): String | Null = js.native
  
  /**
    * Get the player's public profile photo.
    *
    * @returns A url to the player's public profile photo
    */
  def getPhoto(): String | Null = js.native
}
object ContextPlayer {
  
  @scala.inline
  def apply(getID: () => String, getName: () => String | Null, getPhoto: () => String | Null): ContextPlayer = {
    val __obj = js.Dynamic.literal(getID = js.Any.fromFunction0(getID), getName = js.Any.fromFunction0(getName), getPhoto = js.Any.fromFunction0(getPhoto))
    __obj.asInstanceOf[ContextPlayer]
  }
  
  @scala.inline
  implicit class ContextPlayerMutableBuilder[Self <: ContextPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetID(value: () => String): Self = StObject.set(x, "getID", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String | Null): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPhoto(value: () => String | Null): Self = StObject.set(x, "getPhoto", js.Any.fromFunction0(value))
  }
}
