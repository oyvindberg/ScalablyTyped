package typings.angularCompiler.publicApiMod

import typings.angularCompiler.anon.ChangeDetection
import typings.angularCompiler.anon.ComponentFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "CompileDirectiveMetadata")
@js.native
class CompileDirectiveMetadata protected ()
  extends typings.angularCompiler.srcCompilerMod.CompileDirectiveMetadata {
  def this(hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostListenersHostPropertiesHostAttributesProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: ComponentFactory) = this()
}
/* static members */
object CompileDirectiveMetadata {
  
  @JSImport("@angular/compiler/public_api", "CompileDirectiveMetadata.create")
  @js.native
  def create(
    hasIsHostTypeIsComponentSelectorExportAsChangeDetectionInputsOutputsHostProvidersViewProvidersQueriesGuardsViewQueriesEntryComponentsTemplateComponentViewTypeRendererTypeComponentFactory: ChangeDetection
  ): typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata = js.native
}
