package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDatabaseRequest extends StObject {
  
  /**
    * Required. A `CREATE DATABASE` statement, which specifies the ID of the new database. The database ID must conform to the regular expression `a-z*[a-z0-9]` and be between 2 and 30
    * characters in length. If the database ID is a reserved word or if it contains a hyphen, the database ID must be enclosed in backticks (`` ` ``).
    */
  var createStatement: js.UndefOr[String] = js.native
  
  /**
    * Optional. A list of DDL statements to run inside the newly created database. Statements can create tables, indexes, etc. These statements execute atomically with the creation of the
    * database: if there is an error in any statement, the database is not created.
    */
  var extraStatements: js.UndefOr[js.Array[String]] = js.native
}
object CreateDatabaseRequest {
  
  @scala.inline
  def apply(): CreateDatabaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatabaseRequest]
  }
  
  @scala.inline
  implicit class CreateDatabaseRequestMutableBuilder[Self <: CreateDatabaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateStatement(value: String): Self = StObject.set(x, "createStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateStatementUndefined: Self = StObject.set(x, "createStatement", js.undefined)
    
    @scala.inline
    def setExtraStatements(value: js.Array[String]): Self = StObject.set(x, "extraStatements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraStatementsUndefined: Self = StObject.set(x, "extraStatements", js.undefined)
    
    @scala.inline
    def setExtraStatementsVarargs(value: String*): Self = StObject.set(x, "extraStatements", js.Array(value :_*))
  }
}
