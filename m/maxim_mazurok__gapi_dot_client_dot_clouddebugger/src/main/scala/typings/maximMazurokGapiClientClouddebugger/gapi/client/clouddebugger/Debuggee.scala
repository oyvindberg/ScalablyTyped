package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Debuggee extends StObject {
  
  /** Version ID of the agent. Schema: `domain/language-platform/vmajor.minor` (for example `google.com/java-gcp/v1.1`). */
  var agentVersion: js.UndefOr[String] = js.native
  
  /** Used when setting breakpoint canary for this debuggee. */
  var canaryMode: js.UndefOr[String] = js.native
  
  /** Human readable description of the debuggee. Including a human-readable project name, environment name and version information is recommended. */
  var description: js.UndefOr[String] = js.native
  
  /** References to the locations and revisions of the source code used in the deployed application. */
  var extSourceContexts: js.UndefOr[js.Array[ExtendedSourceContext]] = js.native
  
  /** Unique identifier for the debuggee generated by the controller service. */
  var id: js.UndefOr[String] = js.native
  
  /** If set to `true`, indicates that the agent should disable itself and detach from the debuggee. */
  var isDisabled: js.UndefOr[Boolean] = js.native
  
  /** If set to `true`, indicates that Controller service does not detect any activity from the debuggee agents and the application is possibly stopped. */
  var isInactive: js.UndefOr[Boolean] = js.native
  
  /** A set of custom debuggee properties, populated by the agent, to be displayed to the user. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientClouddebugger.maximMazurokGapiClientClouddebuggerStrings.Debuggee with TopLevel[js.Any]
  ] = js.native
  
  /** Project the debuggee is associated with. Use project number or id when registering a Google Cloud Platform project. */
  var project: js.UndefOr[String] = js.native
  
  /** References to the locations and revisions of the source code used in the deployed application. */
  var sourceContexts: js.UndefOr[js.Array[SourceContext]] = js.native
  
  /** Human readable message to be displayed to the user about this debuggee. Absence of this field indicates no status. The message can be either informational or an error status. */
  var status: js.UndefOr[StatusMessage] = js.native
  
  /**
    * Uniquifier to further distinguish the application. It is possible that different applications might have identical values in the debuggee message, thus, incorrectly identified as a
    * single application by the Controller service. This field adds salt to further distinguish the application. Agents should consider seeding this field with value that identifies the
    * code, binary, configuration and environment.
    */
  var uniquifier: js.UndefOr[String] = js.native
}
object Debuggee {
  
  @scala.inline
  def apply(): Debuggee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Debuggee]
  }
  
  @scala.inline
  implicit class DebuggeeMutableBuilder[Self <: Debuggee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
    
    @scala.inline
    def setCanaryMode(value: String): Self = StObject.set(x, "canaryMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanaryModeUndefined: Self = StObject.set(x, "canaryMode", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExtSourceContexts(value: js.Array[ExtendedSourceContext]): Self = StObject.set(x, "extSourceContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtSourceContextsUndefined: Self = StObject.set(x, "extSourceContexts", js.undefined)
    
    @scala.inline
    def setExtSourceContextsVarargs(value: ExtendedSourceContext*): Self = StObject.set(x, "extSourceContexts", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    @scala.inline
    def setIsInactive(value: Boolean): Self = StObject.set(x, "isInactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInactiveUndefined: Self = StObject.set(x, "isInactive", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientClouddebugger.maximMazurokGapiClientClouddebuggerStrings.Debuggee with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setSourceContexts(value: js.Array[SourceContext]): Self = StObject.set(x, "sourceContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceContextsUndefined: Self = StObject.set(x, "sourceContexts", js.undefined)
    
    @scala.inline
    def setSourceContextsVarargs(value: SourceContext*): Self = StObject.set(x, "sourceContexts", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: StatusMessage): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUniquifier(value: String): Self = StObject.set(x, "uniquifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniquifierUndefined: Self = StObject.set(x, "uniquifier", js.undefined)
  }
}
