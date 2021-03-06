package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaderboardScoreRank extends StObject {
  
  /** The number of scores in the leaderboard as a string. */
  var formattedNumScores: js.UndefOr[String] = js.native
  
  /** The rank in the leaderboard as a string. */
  var formattedRank: js.UndefOr[String] = js.native
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#leaderboardScoreRank`. */
  var kind: js.UndefOr[String] = js.native
  
  /** The number of scores in the leaderboard. */
  var numScores: js.UndefOr[String] = js.native
  
  /** The rank in the leaderboard. */
  var rank: js.UndefOr[String] = js.native
}
object LeaderboardScoreRank {
  
  @scala.inline
  def apply(): LeaderboardScoreRank = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaderboardScoreRank]
  }
  
  @scala.inline
  implicit class LeaderboardScoreRankMutableBuilder[Self <: LeaderboardScoreRank] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormattedNumScores(value: String): Self = StObject.set(x, "formattedNumScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedNumScoresUndefined: Self = StObject.set(x, "formattedNumScores", js.undefined)
    
    @scala.inline
    def setFormattedRank(value: String): Self = StObject.set(x, "formattedRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedRankUndefined: Self = StObject.set(x, "formattedRank", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNumScores(value: String): Self = StObject.set(x, "numScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumScoresUndefined: Self = StObject.set(x, "numScores", js.undefined)
    
    @scala.inline
    def setRank(value: String): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
  }
}
