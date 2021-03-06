package typings.mobxStateTree

import typings.mobxStateTree.typeMod.IAnyType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refinementMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/refinement", "isRefinementType")
  @js.native
  def isRefinementType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = js.native
  
  @JSImport("mobx-state-tree/dist/types/utility-types/refinement", "refinement")
  @js.native
  def refinement_CreationType[IT /* <: IAnyType */](
    name: String,
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ]
  ): IT = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/refinement", "refinement")
  @js.native
  def refinement_CreationType[IT /* <: IAnyType */](
    name: String,
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: String
  ): IT = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/refinement", "refinement")
  @js.native
  def refinement_CreationType[IT /* <: IAnyType */](
    name: String,
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* v */ js.Any, 
      String
    ]
  ): IT = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/refinement", "refinement")
  @js.native
  def refinement_CreationType[IT /* <: IAnyType */](
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ]
  ): IT = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/refinement", "refinement")
  @js.native
  def refinement_CreationType[IT /* <: IAnyType */](
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: String
  ): IT = js.native
  @JSImport("mobx-state-tree/dist/types/utility-types/refinement", "refinement")
  @js.native
  def refinement_CreationType[IT /* <: IAnyType */](
    `type`: IT,
    predicate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* snapshot */ js.Any, 
      Boolean
    ],
    message: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ /* v */ js.Any, 
      String
    ]
  ): IT = js.native
}
