package typings.apolloServerExpress.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsMock.typesMod.IMockOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "addMocksToSchema")
@js.native
object addMocksToSchema extends js.Object {
  def apply(hasSchemaMocksPreserveResolvers: IMockOptions): GraphQLSchema = js.native
}

