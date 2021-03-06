package typings.googleAppsScript.GoogleAppsScript.Forms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response to one question item within a form. Item responses can be accessed from FormResponse and created from any Item that asks the respondent to answer a question.
  *
  *     // Open a form by ID and log the responses to each question.
  *     var form = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *     var formResponses = form.getResponses();
  *     for (var i = 0; i < formResponses.length; i++) {
  *       var formResponse = formResponses[i];
  *       var itemResponses = formResponse.getItemResponses();
  *       for (var j = 0; j < itemResponses.length; j++) {
  *         var itemResponse = itemResponses[j];
  *         Logger.log('Response #%s to the question "%s" was "%s"',
  *             (i + 1).toString(),
  *             itemResponse.getItem().getTitle(),
  *             itemResponse.getResponse());
  *       }
  *     }
  */
@js.native
trait ItemResponse extends StObject {
  
  def getFeedback(): QuizFeedback = js.native
  
  def getItem(): Item = js.native
  
  def getResponse(): (js.Array[js.Array[String] | String]) | String = js.native
  
  def getScore(): Double = js.native
  
  def setFeedback(feedback: js.Any): ItemResponse = js.native
  
  def setScore(score: js.Any): ItemResponse = js.native
}
object ItemResponse {
  
  @scala.inline
  def apply(
    getFeedback: () => QuizFeedback,
    getItem: () => Item,
    getResponse: () => (js.Array[js.Array[String] | String]) | String,
    getScore: () => Double,
    setFeedback: js.Any => ItemResponse,
    setScore: js.Any => ItemResponse
  ): ItemResponse = {
    val __obj = js.Dynamic.literal(getFeedback = js.Any.fromFunction0(getFeedback), getItem = js.Any.fromFunction0(getItem), getResponse = js.Any.fromFunction0(getResponse), getScore = js.Any.fromFunction0(getScore), setFeedback = js.Any.fromFunction1(setFeedback), setScore = js.Any.fromFunction1(setScore))
    __obj.asInstanceOf[ItemResponse]
  }
  
  @scala.inline
  implicit class ItemResponseMutableBuilder[Self <: ItemResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFeedback(value: () => QuizFeedback): Self = StObject.set(x, "getFeedback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: () => Item): Self = StObject.set(x, "getItem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetResponse(value: () => (js.Array[js.Array[String] | String]) | String): Self = StObject.set(x, "getResponse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScore(value: () => Double): Self = StObject.set(x, "getScore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFeedback(value: js.Any => ItemResponse): Self = StObject.set(x, "setFeedback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetScore(value: js.Any => ItemResponse): Self = StObject.set(x, "setScore", js.Any.fromFunction1(value))
  }
}
