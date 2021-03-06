package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisposePackageVersionsRequest extends StObject {
  
  /**
    *  The name of the package with the versions you want to dispose. 
    */
  @JSName("package")
  var _package: PackageName = js.native
  
  /**
    *  The name of the domain that contains the repository you want to dispose. 
    */
  var domain: DomainName = js.native
  
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  
  /**
    *  The expected status of the package version to dispose. Valid values are:     Published     Unfinished     Unlisted     Archived     Disposed   
    */
  var expectedStatus: js.UndefOr[PackageVersionStatus] = js.native
  
  /**
    *  A format that specifies the type of package versions you want to dispose. The valid values are:     npm     pypi     maven   
    */
  var format: PackageFormat = js.native
  
  /**
    *  The namespace of the package. The package component that specifies its namespace depends on its type. For example:     The namespace of a Maven package is its groupId.     The namespace of an npm package is its scope.     A Python package does not contain a corresponding component, so Python packages do not have a namespace.   
    */
  var namespace: js.UndefOr[PackageNamespace] = js.native
  
  /**
    *  The name of the repository that contains the package versions you want to dispose. 
    */
  var repository: RepositoryName = js.native
  
  /**
    *  The revisions of the package versions you want to dispose. 
    */
  var versionRevisions: js.UndefOr[PackageVersionRevisionMap] = js.native
  
  /**
    *  The versions of the package you want to dispose. 
    */
  var versions: PackageVersionList = js.native
}
object DisposePackageVersionsRequest {
  
  @scala.inline
  def apply(
    _package: PackageName,
    domain: DomainName,
    format: PackageFormat,
    repository: RepositoryName,
    versions: PackageVersionList
  ): DisposePackageVersionsRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisposePackageVersionsRequest]
  }
  
  @scala.inline
  implicit class DisposePackageVersionsRequestMutableBuilder[Self <: DisposePackageVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwner(value: AccountId): Self = StObject.set(x, "domainOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainOwnerUndefined: Self = StObject.set(x, "domainOwner", js.undefined)
    
    @scala.inline
    def setExpectedStatus(value: PackageVersionStatus): Self = StObject.set(x, "expectedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedStatusUndefined: Self = StObject.set(x, "expectedStatus", js.undefined)
    
    @scala.inline
    def setFormat(value: PackageFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: PackageNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setRepository(value: RepositoryName): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionRevisions(value: PackageVersionRevisionMap): Self = StObject.set(x, "versionRevisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionRevisionsUndefined: Self = StObject.set(x, "versionRevisions", js.undefined)
    
    @scala.inline
    def setVersions(value: PackageVersionList): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsVarargs(value: PackageVersion*): Self = StObject.set(x, "versions", js.Array(value :_*))
    
    @scala.inline
    def set_package(value: PackageName): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
