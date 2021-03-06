package typings.graphqlTools.mod

import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.typesMod.SchemaPrintOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools", "printSchemaWithDirectives")
@js.native
object printSchemaWithDirectives extends js.Object {
  def apply(schema: GraphQLSchema): String = js.native
  def apply(schema: GraphQLSchema, _options: SchemaPrintOptions): String = js.native
}

