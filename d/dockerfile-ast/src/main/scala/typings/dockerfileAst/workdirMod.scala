package typings.dockerfileAst

import typings.dockerfileAst.dockerfileMod.Dockerfile
import typings.dockerfileAst.instructionMod.Instruction
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/instructions/workdir", JSImport.Namespace)
@js.native
object workdirMod extends js.Object {
  @js.native
  class Workdir protected () extends Instruction {
    def this(
      document: TextDocument,
      range: Range,
      dockerfile: Dockerfile,
      escapeChar: String,
      instruction: String,
      instructionRange: Range
    ) = this()
  }
  
}

