package typings.typedGithubApi

import typings.typedGithubApi.githubApiMod.GitHubApi
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("typed-github-api", JSImport.Default)
  @js.native
  class default protected () extends GitHubApi {
    def this(options: OptionsOrRef) = this()
  }
  
  @JSImport("typed-github-api", "IssueWebHook")
  @js.native
  class IssueWebHook protected ()
    extends typings.typedGithubApi.webHookMod.IssueWebHook {
    def this(options: OptionsOrRef) = this()
    def this(secret: js.UndefOr[scala.Nothing], options: OptionsOrRef) = this()
    def this(secret: String, options: OptionsOrRef) = this()
  }
}
