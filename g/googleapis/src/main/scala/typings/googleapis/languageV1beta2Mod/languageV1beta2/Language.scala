package typings.googleapis.languageV1beta2Mod.languageV1beta2

import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.GlobalOptions
import typings.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud Natural Language API
  *
  * Provides natural language understanding technologies, such as sentiment
  * analysis, entity recognition, entity sentiment analysis, and other text
  * annotations, to developers.
  *
  * @example
  * const {google} = require('googleapis');
  * const language = google.language('v1beta2');
  *
  * @namespace language
  * @type {Function}
  * @version v1beta2
  * @variation v1beta2
  * @param {object=} options Options for Language
  */
@JSImport("googleapis/build/src/apis/language/v1beta2", "language_v1beta2.Language")
@js.native
class Language protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var documents: ResourceDocuments = js.native
}
