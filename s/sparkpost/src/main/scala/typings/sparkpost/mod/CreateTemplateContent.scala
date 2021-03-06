package typings.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTemplateContent extends StObject {
  
  /**
    * Address "from" : "deals@company.com" or JSON object composed of the "name" and "email" fields.
    * "from" : { "name" : "My Company", "email" : "deals@company.com" } used to compose the email’s "From" header.
    *
    */
  var from: Address | String = js.native
  
  /**  JSON dictionary containing headers other than “Subject”, “From”, “To”, and “Reply-To”. */
  var headers: js.UndefOr[js.Any] = js.native
  
  /** HTML content for the email’s text/html MIME part */
  var html: js.UndefOr[String] = js.native
  
  /** Email address used to compose the email’s “Reply-To” header. */
  var reply_to: js.UndefOr[String] = js.native
  
  /** Email subject line. */
  var subject: String = js.native
  
  /** Text content for the email’s text/plain MIME part */
  var text: js.UndefOr[String] = js.native
}
object CreateTemplateContent {
  
  @scala.inline
  def apply(from: Address | String, subject: String): CreateTemplateContent = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTemplateContent]
  }
  
  @scala.inline
  implicit class CreateTemplateContentMutableBuilder[Self <: CreateTemplateContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Address | String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setReply_to(value: String): Self = StObject.set(x, "reply_to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReply_toUndefined: Self = StObject.set(x, "reply_to", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
