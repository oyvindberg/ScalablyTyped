package typings.gapiClientSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveyAudience extends js.Object {
  /** Optional list of age buckets to target. Supported age buckets are: ['18-24', '25-34', '35-44', '45-54', '55-64', '65+'] */
  var ages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required country code that surveys should be targeted to. Accepts standard ISO 3166-1 2 character language codes. For instance, 'US' for the United
    * States, and 'GB' for the United Kingdom.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Country subdivision (states/provinces/etc) that surveys should be targeted to. For all countries except GB, ISO-3166-2 subdivision code is required
    * (eg. 'US-OH' for Ohio, United States). For GB, NUTS 1 statistical region codes for the United Kingdom is required (eg. 'UK-UKC' for North East
    * England).
    */
  var countrySubdivision: js.UndefOr[String] = js.native
  /** Optional gender to target. */
  var gender: js.UndefOr[String] = js.native
  /**
    * Language code that surveys should be targeted to. For instance, 'en-US'. Surveys may target bilingual users by specifying a list of language codes (for
    * example, 'de' and 'en-US'). In that case, all languages will be used for targeting users but the survey content (which is displayed) must match the
    * first language listed. Accepts standard BCP47 language codes. See specification.
    */
  var languages: js.UndefOr[js.Array[String]] = js.native
  /**
    * Key for predefined panel that causes survey to be sent to a predefined set of Opinion Rewards App users. You must set PopulationSource to
    * ANDROID_APP_PANEL to use this field.
    */
  var mobileAppPanelId: js.UndefOr[String] = js.native
  /** Online population source where the respondents are sampled from. */
  var populationSource: js.UndefOr[String] = js.native
}

object SurveyAudience {
  @scala.inline
  def apply(): SurveyAudience = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurveyAudience]
  }
  @scala.inline
  implicit class SurveyAudienceOps[Self <: SurveyAudience] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAgesVarargs(value: String*): Self = this.set("ages", js.Array(value :_*))
    @scala.inline
    def setAges(value: js.Array[String]): Self = this.set("ages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAges: Self = this.set("ages", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setCountrySubdivision(value: String): Self = this.set("countrySubdivision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountrySubdivision: Self = this.set("countrySubdivision", js.undefined)
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = this.set("languages", js.Array(value :_*))
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguages: Self = this.set("languages", js.undefined)
    @scala.inline
    def setMobileAppPanelId(value: String): Self = this.set("mobileAppPanelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobileAppPanelId: Self = this.set("mobileAppPanelId", js.undefined)
    @scala.inline
    def setPopulationSource(value: String): Self = this.set("populationSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopulationSource: Self = this.set("populationSource", js.undefined)
  }
  
}

