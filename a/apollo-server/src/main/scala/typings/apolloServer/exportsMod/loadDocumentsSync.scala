package typings.apolloServer.exportsMod

import typings.graphqlToolsLoad.anon.LoadTypedefsOptionskeystr
import typings.graphqlToolsLoad.loadTypedefsMod.UnnormalizedTypeDefPointer
import typings.graphqlToolsUtils.loadersMod.Source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "loadDocumentsSync")
@js.native
object loadDocumentsSync extends js.Object {
  def apply(pointerOrPointers: js.Array[UnnormalizedTypeDefPointer], options: LoadTypedefsOptionskeystr): js.Array[Source] = js.native
  def apply(pointerOrPointers: UnnormalizedTypeDefPointer, options: LoadTypedefsOptionskeystr): js.Array[Source] = js.native
}

