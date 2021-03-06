package typings.typedGithubApi

import typings.moment.mod.Moment
import typings.typedGithubApi.anon.Name
import typings.typedGithubApi.distOwnerRefMod.OwnerRefClass
import typings.typedGithubApi.githubRefMod.OptionsOrRef
import typings.typedGithubApi.userMod.PrivateUser
import typings.typedGithubApi.userMod.User
import typings.typedGithubApi.userMod.UserSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUserMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.ownerRefMod.OwnerRef because Already inherited
  - typings.typedGithubApi.interfacesUserMod.UserSummary because Already inherited
  - typings.typedGithubApi.interfacesUserMod.User because Already inherited
  - typings.typedGithubApi.interfacesUserMod.MyUser because var conflicts: avatarUri, blog, company, createdAt, email, followers, following, id, location, login, name, publicGists, publicRepos, updatedAt. Inlined privateReposTotal, privateReposOwned, privateGists, diskUsage, collaborators, plan, twoFactorAuthentication */ @JSImport("typed-github-api/dist/user", "MyUserClass")
  @js.native
  class MyUserClass protected () extends UserClass {
    def this(data: PrivateUser, options: OptionsOrRef) = this()
    
    var collaborators: Double = js.native
    
    var diskUsage: Double = js.native
    
    var plan: Name = js.native
    
    var privateGists: Double = js.native
    
    var privateReposOwned: Double = js.native
    
    var privateReposTotal: Double = js.native
    
    var twoFactorAuthentication: Boolean = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.ownerRefMod.OwnerRef because Already inherited
  - typings.typedGithubApi.interfacesUserMod.UserSummary because Already inherited
  - typings.typedGithubApi.interfacesUserMod.User because var conflicts: avatarUri, id, login. Inlined name, company, blog, location, email, publicRepos, publicGists, followers, following, createdAt, updatedAt */ @JSImport("typed-github-api/dist/user", "UserClass")
  @js.native
  class UserClass protected () extends UserSummaryClass {
    def this(data: User, options: OptionsOrRef) = this()
    
    var biography: String = js.native
    
    var blog: String = js.native
    
    var company: String = js.native
    
    var createdAt: Moment = js.native
    
    var email: String = js.native
    
    var followers: Double = js.native
    
    var following: Double = js.native
    
    var isHireable: Boolean = js.native
    
    var location: String = js.native
    
    var name: String = js.native
    
    var publicGists: Double = js.native
    
    var publicRepos: Double = js.native
    
    var updatedAt: Moment = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.typedGithubApi.ownerRefMod.OwnerRef because Already inherited
  - typings.typedGithubApi.interfacesUserMod.UserSummary because var conflicts: login. Inlined id, avatarUri */ @JSImport("typed-github-api/dist/user", "UserSummaryClass")
  @js.native
  class UserSummaryClass protected () extends OwnerRefClass {
    def this(data: UserSummary, options: OptionsOrRef) = this()
    
    var avatarUri: String = js.native
    
    var id: Double = js.native
    
    var siteAdministrator: Boolean = js.native
  }
}
