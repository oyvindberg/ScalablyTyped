package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordCredential extends StObject {
  
  // Do not use.
  var customKeyIdentifier: js.UndefOr[NullableOption[Double]] = js.native
  
  // Friendly name for the password. Optional.
  var displayName: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The date and time at which the password expires represented using ISO 8601 format and is always in UTC time. For
    * example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Optional.
    */
  var endDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Contains the first three characters of the password. Read-only.
  var hint: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier for the password.
  var keyId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Read-only; Contains the strong passwords generated by Azure AD that are 16-64 characters in length. The generated
    * password value is only returned during the initial POST request to addPassword. There is no way to retrieve this
    * password in the future.
    */
  var secretText: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The date and time at which the password becomes valid. The Timestamp type represents date and time information using
    * ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Optional.
    */
  var startDateTime: js.UndefOr[NullableOption[String]] = js.native
}
object PasswordCredential {
  
  @scala.inline
  def apply(): PasswordCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordCredential]
  }
  
  @scala.inline
  implicit class PasswordCredentialMutableBuilder[Self <: PasswordCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomKeyIdentifier(value: NullableOption[Double]): Self = StObject.set(x, "customKeyIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomKeyIdentifierNull: Self = StObject.set(x, "customKeyIdentifier", null)
    
    @scala.inline
    def setCustomKeyIdentifierUndefined: Self = StObject.set(x, "customKeyIdentifier", js.undefined)
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    @scala.inline
    def setHint(value: NullableOption[String]): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintNull: Self = StObject.set(x, "hint", null)
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setKeyId(value: NullableOption[String]): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdNull: Self = StObject.set(x, "keyId", null)
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    @scala.inline
    def setSecretText(value: NullableOption[String]): Self = StObject.set(x, "secretText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretTextNull: Self = StObject.set(x, "secretText", null)
    
    @scala.inline
    def setSecretTextUndefined: Self = StObject.set(x, "secretText", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    @scala.inline
    def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
  }
}
