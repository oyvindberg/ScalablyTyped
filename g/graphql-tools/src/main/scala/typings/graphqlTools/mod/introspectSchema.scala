package typings.graphqlTools.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.AsyncExecutor
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "introspectSchema")
@js.native
object introspectSchema extends js.Object {
  def apply(executor: AsyncExecutor): js.Promise[GraphQLSchema] = js.native
  def apply(executor: AsyncExecutor, context: Record[String, _]): js.Promise[GraphQLSchema] = js.native
}

