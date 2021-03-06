package typings.apolloServer.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsSchema.typesMod.IExecutableSchemaDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server", "makeExecutableSchema")
@js.native
object makeExecutableSchema extends js.Object {
  def apply[TContext](
    hasTypeDefsResolversLoggerAllowUndefinedInResolveResolverValidationOptionsDirectiveResolversSchemaDirectivesSchemaTransformsParseOptionsInheritResolversFromInterfacesPruningOptions: IExecutableSchemaDefinition[TContext]
  ): GraphQLSchema = js.native
}

