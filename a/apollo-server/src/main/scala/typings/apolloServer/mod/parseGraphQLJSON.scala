package typings.apolloServer.mod

import typings.graphql.parserMod.ParseOptions
import typings.graphql.schemaMod.GraphQLSchemaValidationOptions
import typings.graphqlToolsUtils.loadersMod.Source
import typings.graphqlToolsUtils.typesMod.SchemaPrintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "parseGraphQLJSON")
@js.native
object parseGraphQLJSON extends js.Object {
  def apply(
    location: String,
    jsonContent: String,
    options: SchemaPrintOptions with ParseOptions with GraphQLSchemaValidationOptions
  ): Source = js.native
}

