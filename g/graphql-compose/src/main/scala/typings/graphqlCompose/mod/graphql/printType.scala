package typings.graphqlCompose.mod.graphql

import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.printSchemaMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.printType")
@js.native
object printType extends js.Object {
  def apply(`type`: GraphQLNamedType): String = js.native
  def apply(`type`: GraphQLNamedType, options: Options): String = js.native
}

