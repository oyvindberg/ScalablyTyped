package typings.graphqlTools.mod

import typings.graphqlToolsDelegate.anon.Dehoist
import typings.graphqlToolsUtils.interfacesMod.IFieldResolver
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "createMergedResolver")
@js.native
object createMergedResolver extends js.Object {
  def apply(hasFromPathDehoistDelimeter: Dehoist): IFieldResolver[_, _, Record[String, _], _] = js.native
}

