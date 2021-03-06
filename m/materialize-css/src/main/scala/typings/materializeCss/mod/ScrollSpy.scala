package typings.materializeCss.mod

import typings.materializeCss.anon.PartialScrollSpyOptions
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<ScrollSpyOptions> * / any */ @JSImport("materialize-css", "ScrollSpy")
@js.native
class ScrollSpy () extends StObject
object ScrollSpy {
  
  /**
    * Get Instance
    */
  /* static member */
  @JSImport("materialize-css", "ScrollSpy.getInstance")
  @js.native
  def getInstance(elem: Element): typings.materializeCss.M.ScrollSpy = js.native
  
  /**
    * Init ScrollSpies
    */
  /* static member */
  @JSImport("materialize-css", "ScrollSpy.init")
  @js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any
  ): js.Array[typings.materializeCss.M.ScrollSpy] = js.native
  @JSImport("materialize-css", "ScrollSpy.init")
  @js.native
  def init(
    els: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MElements */ js.Any,
    options: PartialScrollSpyOptions
  ): js.Array[typings.materializeCss.M.ScrollSpy] = js.native
  /**
    * Init ScrollSpy
    */
  /* static member */
  @JSImport("materialize-css", "ScrollSpy.init")
  @js.native
  def init(els: Element): typings.materializeCss.M.ScrollSpy = js.native
  @JSImport("materialize-css", "ScrollSpy.init")
  @js.native
  def init(els: Element, options: PartialScrollSpyOptions): typings.materializeCss.M.ScrollSpy = js.native
}
