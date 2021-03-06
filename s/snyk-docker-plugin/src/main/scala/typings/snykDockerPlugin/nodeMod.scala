package typings.snykDockerPlugin

import typings.snykDockerPlugin.distTypesMod.ScannedProjectCustom
import typings.snykDockerPlugin.typesMod.FilePathToContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-docker-plugin/dist/analyzer/applications/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  def nodeFilesToScannedProjects(filePathToContent: FilePathToContent): js.Promise[js.Array[ScannedProjectCustom]] = js.native
}

