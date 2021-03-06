package typings.typedGithubApi

import typings.typedGithubApi.githubRefMod.GitHubRef
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.interfacesLabelMod.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLabelMod {
  
  @JSImport("typed-github-api/dist/label", "LabelClass")
  @js.native
  class LabelClass protected ()
    extends GitHubRef
       with Label {
    def this(data: typings.typedGithubApi.labelMod.Label, options: OptionsOrRef) = this()
  }
}
