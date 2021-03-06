package typings.apolloServerExpress.mod

import typings.graphql.mod.GraphQLObjectType
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "getUserTypesFromSchema")
@js.native
object getUserTypesFromSchema extends js.Object {
  def apply(schema: GraphQLSchema): js.Array[GraphQLObjectType[_, _]] = js.native
}

