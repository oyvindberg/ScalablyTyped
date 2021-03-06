package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides the possibility of executing a precompiled SQL statement.
  *
  * A SQL statement is pre-compiled and stored in a {@link PreparedStatement} object. This object can then be used to efficiently execute this statement
  * multiple times.
  */
@js.native
trait XPreparedStatement extends XInterface {
  
  /**
    * returns the {@link com.sun.star.sdbc.Connection} object that produced this {@link com.sun.star.sdbc.Statement} object.
    * @returns the {@link Connection} object
    * @throws SQLException if a database access error occurs.
    */
  val Connection: XConnection = js.native
  
  /**
    * executes any kind of SQL statement.
    *
    * Some prepared statements return multiple results; the execute method handles these complex statements as well as the simpler form of statements
    * handled by executeQuery and executeUpdate.
    * @returns `TRUE` if successful
    * @throws SQLException if a database access error occurs.
    */
  def execute(): Boolean = js.native
  
  /**
    * executes the SQL query in this `PreparedStatement` object and returns the result set generated by the query.
    * @returns the {@link ResultSet} object
    * @throws SQLException if a database access error occurs.
    */
  def executeQuery(): XResultSet = js.native
  
  /**
    * executes the SQL INSERT, UPDATE or DELETE statement in this {@link com.sun.star.sdbc.PreparedStatement} object. ;  In addition, SQL statements that
    * return nothing, such as SQL DDL statements, can be executed.
    * @returns either the row count for INSERT, UPDATE or DELETE statements; or 0 for SQL statements that return nothing
    * @throws SQLException if a database access error occurs.
    */
  def executeUpdate(): Double = js.native
  
  /**
    * returns the {@link com.sun.star.sdbc.Connection} object that produced this {@link com.sun.star.sdbc.Statement} object.
    * @returns the {@link Connection} object
    * @throws SQLException if a database access error occurs.
    */
  def getConnection(): XConnection = js.native
}
object XPreparedStatement {
  
  @scala.inline
  def apply(
    Connection: XConnection,
    acquire: () => Unit,
    execute: () => Boolean,
    executeQuery: () => XResultSet,
    executeUpdate: () => Double,
    getConnection: () => XConnection,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPreparedStatement = {
    val __obj = js.Dynamic.literal(Connection = Connection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), execute = js.Any.fromFunction0(execute), executeQuery = js.Any.fromFunction0(executeQuery), executeUpdate = js.Any.fromFunction0(executeUpdate), getConnection = js.Any.fromFunction0(getConnection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPreparedStatement]
  }
  
  @scala.inline
  implicit class XPreparedStatementMutableBuilder[Self <: XPreparedStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: XConnection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(value: () => Boolean): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecuteQuery(value: () => XResultSet): Self = StObject.set(x, "executeQuery", js.Any.fromFunction0(value))
    
    @scala.inline
    def setExecuteUpdate(value: () => Double): Self = StObject.set(x, "executeUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetConnection(value: () => XConnection): Self = StObject.set(x, "getConnection", js.Any.fromFunction0(value))
  }
}
