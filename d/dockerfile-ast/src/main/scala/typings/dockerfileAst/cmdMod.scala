package typings.dockerfileAst

import typings.dockerfileAst.dockerfileMod.Dockerfile
import typings.dockerfileAst.jsonInstructionMod.JSONInstruction
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dockerfile-ast/lib/instructions/cmd", JSImport.Namespace)
@js.native
object cmdMod extends js.Object {
  @js.native
  class Cmd protected () extends JSONInstruction {
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

