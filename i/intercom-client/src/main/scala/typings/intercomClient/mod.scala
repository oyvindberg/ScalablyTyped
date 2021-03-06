package typings.intercomClient

import typings.intercomClient.anon.AppApiKey
import typings.intercomClient.anon.Contact
import typings.intercomClient.anon.Email
import typings.intercomClient.anon.IdNumber
import typings.intercomClient.anon.Identifier
import typings.intercomClient.anon.PartialCompany
import typings.intercomClient.anon.PartialCreateMessage
import typings.intercomClient.anon.PartialCreateUpdateUser
import typings.intercomClient.anon.PartialEvent
import typings.intercomClient.anon.PartialLead
import typings.intercomClient.anon.PartialTag
import typings.intercomClient.anon.PartialVisitor
import typings.intercomClient.anon.Segmentid
import typings.intercomClient.anon.Token
import typings.intercomClient.anon.Type
import typings.intercomClient.companyMod.Company
import typings.intercomClient.companyMod.CompanyIdentifier
import typings.intercomClient.companyMod.List
import typings.intercomClient.eventMod.ListParam
import typings.intercomClient.intercomErrorMod.IntercomError
import typings.intercomClient.leadMod.Lead
import typings.intercomClient.leadMod.LeadIdentifier
import typings.intercomClient.messageMod.Message
import typings.intercomClient.scrollMod.Scroll
import typings.intercomClient.tagMod.Tag
import typings.intercomClient.tagMod.TagIdentifier
import typings.intercomClient.tagMod.TagOper
import typings.intercomClient.userMod.User
import typings.intercomClient.userMod.UserEmailIdentifier
import typings.intercomClient.userMod.UserIdIdentifier
import typings.intercomClient.userMod.UserIdentifier
import typings.intercomClient.visitorMod.Visitor
import typings.intercomClient.visitorMod.VisitorIdentifier
import typings.node.httpMod.IncomingMessage
import typings.node.netMod.Socket
import typings.request.mod.CoreOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("intercom-client", "ApiResponse")
  @js.native
  class ApiResponse[T] protected () extends IncomingMessage {
    def this(socket: Socket) = this()
    
    var body: T = js.native
  }
  
  @JSImport("intercom-client", "Client")
  @js.native
  class Client protected () extends StObject {
    def this(auth: AppApiKey) = this()
    def this(auth: Token) = this()
    def this(username: String, password: String) = this()
    
    var companies: Companies = js.native
    
    var contacts: Leads = js.native
    
    var events: Events = js.native
    
    var leads: Leads = js.native
    
    var messages: Messages = js.native
    
    var tags: Tags = js.native
    
    /**
      * client library also supports passing in `request` options
      * Note that certain request options (such as `json`, and certain `headers` names cannot be overridden).
      */
    def useRequestOpts(): this.type = js.native
    def useRequestOpts(options: CoreOptions): this.type = js.native
    
    var users: Users = js.native
    
    var visitors: Visitors = js.native
  }
  
  @JSImport("intercom-client", "Companies")
  @js.native
  class Companies () extends StObject {
    
    def archive(): js.Promise[Company] = js.native
    
    def create(company: CompanyIdentifier with PartialCompany): js.Promise[ApiResponse[Company]] = js.native
    def create(company: CompanyIdentifier with PartialCompany, cb: callback[ApiResponse[Company]]): Unit = js.native
    
    def find(identifier: CompanyIdentifier): js.Promise[ApiResponse[Company]] = js.native
    def find(identifier: CompanyIdentifier, cb: callback[ApiResponse[Company]]): Unit = js.native
    
    def list(): js.Promise[ApiResponse[List]] = js.native
    def list(cb: callback[ApiResponse[List]]): Unit = js.native
    
    def listBy(params: Segmentid): js.Promise[ApiResponse[List]] = js.native
    def listBy(params: Segmentid, cb: callback[ApiResponse[List]]): Unit = js.native
    
    var scroll: Scroll[Company] = js.native
    
    def update(company: CompanyIdentifier with PartialCompany): js.Promise[ApiResponse[Company]] = js.native
    def update(company: CompanyIdentifier with PartialCompany, cb: callback[ApiResponse[Company]]): Unit = js.native
  }
  
  @JSImport("intercom-client", "Events")
  @js.native
  class Events () extends StObject {
    
    def create(event: PartialEvent): js.Promise[IncomingMessage] = js.native
    def create(event: PartialEvent, cb: callback[IncomingMessage]): Unit = js.native
    
    def listBy(params: ListParam): js.Promise[ApiResponse[List]] = js.native
    def listBy(params: ListParam, cb: callback[ApiResponse[List]]): Unit = js.native
  }
  
  object IdentityVerification {
    
    @JSImport("intercom-client", "IdentityVerification.userHash")
    @js.native
    def userHash(opts: IdentityVerificationOptions): String = js.native
  }
  
  @JSImport("intercom-client", "Leads")
  @js.native
  class Leads () extends StObject {
    
    def convert(params: Contact): js.Promise[ApiResponse[Lead]] = js.native
    def convert(params: Contact, cb: callback[ApiResponse[Lead]]): Unit = js.native
    
    def create(lead: PartialLead): js.Promise[ApiResponse[Lead]] = js.native
    def create(lead: PartialLead, cb: callback[ApiResponse[Lead]]): Unit = js.native
    
    def delete(id: String): js.Promise[ApiResponse[Lead]] = js.native
    def delete(id: String, cb: callback[ApiResponse[Lead]]): Unit = js.native
    
    def find(identifier: LeadIdentifier): js.Promise[ApiResponse[Lead]] = js.native
    def find(identifier: LeadIdentifier, cb: callback[ApiResponse[Lead]]): Unit = js.native
    
    def list(): js.Promise[ApiResponse[typings.intercomClient.leadMod.List]] = js.native
    def list(cb: callback[ApiResponse[typings.intercomClient.leadMod.List]]): Unit = js.native
    
    def listBy(params: Email): js.Promise[ApiResponse[typings.intercomClient.leadMod.List]] = js.native
    def listBy(params: Email, cb: callback[ApiResponse[typings.intercomClient.leadMod.List]]): Unit = js.native
    
    def update(lead: UserIdentifier with PartialLead): js.Promise[ApiResponse[Lead]] = js.native
    def update(lead: UserIdentifier with PartialLead, cb: callback[ApiResponse[Lead]]): Unit = js.native
  }
  
  @JSImport("intercom-client", "Messages")
  @js.native
  class Messages () extends StObject {
    
    def create(message: PartialCreateMessage): js.Promise[ApiResponse[Message]] = js.native
    def create(message: PartialCreateMessage, cb: callback[ApiResponse[Message]]): Unit = js.native
  }
  
  @JSImport("intercom-client", "Tags")
  @js.native
  class Tags () extends StObject {
    
    def create(tag: PartialTag): js.Promise[ApiResponse[Tag]] = js.native
    def create(tag: PartialTag, cb: callback[ApiResponse[Tag]]): Unit = js.native
    
    def delete(tag: TagIdentifier): js.Promise[IncomingMessage] = js.native
    def delete(tag: TagIdentifier, cb: callback[IncomingMessage]): Unit = js.native
    
    def list(): js.Promise[ApiResponse[typings.intercomClient.tagMod.List]] = js.native
    def list(cb: callback[ApiResponse[typings.intercomClient.tagMod.List]]): Unit = js.native
    
    def tag(tagOper: TagOper): js.Promise[ApiResponse[Tag]] = js.native
    def tag(tagOper: TagOper, cb: callback[ApiResponse[Tag]]): Unit = js.native
    
    def untag(tagOper: TagOper): js.Promise[ApiResponse[Tag]] = js.native
    def untag(tagOper: TagOper, cb: callback[ApiResponse[Tag]]): Unit = js.native
  }
  
  @JSImport("intercom-client", "Users")
  @js.native
  class Users () extends StObject {
    
    def archive(identifier: UserIdentifier): js.Promise[ApiResponse[User]] = js.native
    def archive(identifier: UserIdentifier, cb: callback[ApiResponse[User]]): Unit = js.native
    
    def create(user: PartialCreateUpdateUser): js.Promise[ApiResponse[User]] = js.native
    def create(user: PartialCreateUpdateUser, cb: callback[ApiResponse[User]]): Unit = js.native
    
    def find(identifier: UserEmailIdentifier): js.Promise[ApiResponse[typings.intercomClient.userMod.List]] = js.native
    def find(identifier: UserEmailIdentifier, cb: callback[ApiResponse[typings.intercomClient.userMod.List]]): Unit = js.native
    def find(identifier: UserIdIdentifier): js.Promise[ApiResponse[User]] = js.native
    def find(identifier: UserIdIdentifier, cb: callback[ApiResponse[User]]): Unit = js.native
    def find(identifier: UserIdentifier): js.Promise[ApiResponse[User | typings.intercomClient.userMod.List]] = js.native
    def find(identifier: UserIdentifier, cb: callback[ApiResponse[User | typings.intercomClient.userMod.List]]): Unit = js.native
    
    def list(): js.Promise[ApiResponse[typings.intercomClient.userMod.List]] = js.native
    def list(cb: callback[ApiResponse[typings.intercomClient.userMod.List]]): Unit = js.native
    
    def listBy(params: Segmentid): js.Promise[ApiResponse[typings.intercomClient.userMod.List]] = js.native
    def listBy(params: Segmentid, cb: callback[ApiResponse[typings.intercomClient.userMod.List]]): Unit = js.native
    
    def requestPermanentDeletion(id: String): js.Promise[IdNumber] = js.native
    def requestPermanentDeletion(id: String, cb: callback[IdNumber]): Unit = js.native
    
    def requestPermanentDeletionByParams(identifier: UserIdentifier): js.Promise[IdNumber] = js.native
    def requestPermanentDeletionByParams(identifier: UserIdentifier, cb: callback[IdNumber]): Unit = js.native
    
    var scroll: Scroll[User] = js.native
    
    def update(user: UserIdentifier with PartialCreateUpdateUser): js.Promise[ApiResponse[User]] = js.native
    def update(user: UserIdentifier with PartialCreateUpdateUser, cb: callback[ApiResponse[User]]): Unit = js.native
  }
  
  @JSImport("intercom-client", "Visitors")
  @js.native
  class Visitors () extends StObject {
    
    def convert(params: Identifier): js.Promise[ApiResponse[Lead]] = js.native
    def convert(params: Identifier, cb: callback[ApiResponse[Lead]]): Unit = js.native
    def convert(params: Type): js.Promise[ApiResponse[User]] = js.native
    def convert(params: Type, cb: callback[ApiResponse[User]]): Unit = js.native
    
    def delete(id: String): js.Promise[ApiResponse[Visitor]] = js.native
    def delete(id: String, cb: callback[ApiResponse[Visitor]]): Unit = js.native
    
    def find(identifier: VisitorIdentifier): js.Promise[ApiResponse[Visitor]] = js.native
    def find(identifier: VisitorIdentifier, cb: callback[ApiResponse[Visitor]]): Unit = js.native
    
    def update(visitor: VisitorIdentifier with PartialVisitor): js.Promise[ApiResponse[Visitor]] = js.native
    def update(visitor: VisitorIdentifier with PartialVisitor, cb: callback[ApiResponse[Visitor]]): Unit = js.native
  }
  
  @js.native
  trait IdentityVerificationOptions extends StObject {
    
    var identifier: String = js.native
    
    var secretKey: String = js.native
  }
  object IdentityVerificationOptions {
    
    @scala.inline
    def apply(identifier: String, secretKey: String): IdentityVerificationOptions = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityVerificationOptions]
    }
    
    @scala.inline
    implicit class IdentityVerificationOptionsMutableBuilder[Self <: IdentityVerificationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretKey(value: String): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
    }
  }
  
  type callback[T] = (js.Function1[/* d */ T, Unit]) | (js.Function2[/* err */ IntercomError, /* d */ T, Unit])
}
