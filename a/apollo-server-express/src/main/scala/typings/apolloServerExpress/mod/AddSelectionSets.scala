package typings.apolloServerExpress.mod

import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server-express", "AddSelectionSets")
@js.native
class AddSelectionSets protected ()
  extends typings.graphqlTools.mod.AddSelectionSets {
  def this(
    sourceSchema: GraphQLSchema,
    initialType: GraphQLOutputType,
    selectionSetsByType: Record[String, SelectionSetNode],
    selectionSetsByField: Record[String, Record[String, SelectionSetNode]],
    dynamicSelectionSetsByField: Record[
        String, 
        Record[String, js.Array[js.Function1[/* node */ FieldNode, SelectionSetNode]]]
      ]
  ) = this()
}

