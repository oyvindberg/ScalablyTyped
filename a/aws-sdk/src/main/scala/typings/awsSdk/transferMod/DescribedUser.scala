package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribedUser extends StObject {
  
  /**
    * Specifies the unique Amazon Resource Name (ARN) for the user that was requested to be described.
    */
  var Arn: typings.awsSdk.transferMod.Arn = js.native
  
  /**
    * Specifies the landing directory (or folder), which is the location that files are written to or read from in an Amazon S3 bucket, for the described user. An example is  your-Amazon-S3-bucket-name&gt;/home/username .
    */
  var HomeDirectory: js.UndefOr[typings.awsSdk.transferMod.HomeDirectory] = js.native
  
  /**
    * Specifies the logical directory mappings that specify what Amazon S3 paths and keys should be visible to your user and how you want to make them visible. You will need to specify the "Entry" and "Target" pair, where Entry shows how the path is made visible and Target is the actual Amazon S3 path. If you only specify a target, it will be displayed as is. You will need to also make sure that your AWS Identity and Access Management (IAM) role provides access to paths in Target. In most cases, you can use this value instead of the scope-down policy to lock your user down to the designated home directory ("chroot"). To do this, you can set Entry to '/' and set Target to the HomeDirectory parameter value.
    */
  var HomeDirectoryMappings: js.UndefOr[typings.awsSdk.transferMod.HomeDirectoryMappings] = js.native
  
  /**
    * Specifies the type of landing directory (folder) you mapped for your users to see when they log into the file transfer protocol-enabled server. If you set it to PATH, the user will see the absolute Amazon S3 bucket paths as is in their file transfer protocol clients. If you set it LOGICAL, you will need to provide mappings in the HomeDirectoryMappings for how you want to make Amazon S3 paths visible to your users.
    */
  var HomeDirectoryType: js.UndefOr[typings.awsSdk.transferMod.HomeDirectoryType] = js.native
  
  /**
    * Specifies the name of the policy in use for the described user.
    */
  var Policy: js.UndefOr[typings.awsSdk.transferMod.Policy] = js.native
  
  /**
    * Specifies the IAM role that controls your users' access to your Amazon S3 bucket. The policies attached to this role will determine the level of access you want to provide your users when transferring files into and out of your Amazon S3 bucket or buckets. The IAM role should also contain a trust relationship that allows a server to access your resources when servicing your users' transfer requests.
    */
  var Role: js.UndefOr[typings.awsSdk.transferMod.Role] = js.native
  
  /**
    * Specifies the public key portion of the Secure Shell (SSH) keys stored for the described user.
    */
  var SshPublicKeys: js.UndefOr[typings.awsSdk.transferMod.SshPublicKeys] = js.native
  
  /**
    * Specifies the key-value pairs for the user requested. Tag can be used to search for and group users for a variety of purposes.
    */
  var Tags: js.UndefOr[typings.awsSdk.transferMod.Tags] = js.native
  
  /**
    * Specifies the name of the user that was requested to be described. User names are used for authentication purposes. This is the string that will be used by your user when they log in to your server.
    */
  var UserName: js.UndefOr[typings.awsSdk.transferMod.UserName] = js.native
}
object DescribedUser {
  
  @scala.inline
  def apply(Arn: Arn): DescribedUser = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedUser]
  }
  
  @scala.inline
  implicit class DescribedUserMutableBuilder[Self <: DescribedUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDirectory(value: HomeDirectory): Self = StObject.set(x, "HomeDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDirectoryMappings(value: HomeDirectoryMappings): Self = StObject.set(x, "HomeDirectoryMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDirectoryMappingsUndefined: Self = StObject.set(x, "HomeDirectoryMappings", js.undefined)
    
    @scala.inline
    def setHomeDirectoryMappingsVarargs(value: HomeDirectoryMapEntry*): Self = StObject.set(x, "HomeDirectoryMappings", js.Array(value :_*))
    
    @scala.inline
    def setHomeDirectoryType(value: HomeDirectoryType): Self = StObject.set(x, "HomeDirectoryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeDirectoryTypeUndefined: Self = StObject.set(x, "HomeDirectoryType", js.undefined)
    
    @scala.inline
    def setHomeDirectoryUndefined: Self = StObject.set(x, "HomeDirectory", js.undefined)
    
    @scala.inline
    def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    
    @scala.inline
    def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    @scala.inline
    def setSshPublicKeys(value: SshPublicKeys): Self = StObject.set(x, "SshPublicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeysUndefined: Self = StObject.set(x, "SshPublicKeys", js.undefined)
    
    @scala.inline
    def setSshPublicKeysVarargs(value: SshPublicKey*): Self = StObject.set(x, "SshPublicKeys", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
