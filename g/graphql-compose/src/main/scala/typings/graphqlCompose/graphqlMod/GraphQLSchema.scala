package typings.graphqlCompose.graphqlMod

import typings.graphql.anon.ReadonlyGraphQLSchemaConf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/graphql", "GraphQLSchema")
@js.native
class GraphQLSchema protected ()
  extends typings.graphql.mod.GraphQLSchema {
  def this(config: ReadonlyGraphQLSchemaConf) = this()
}

