package typings.websql

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 4.3.1 Executing SQL statements
  */
@js.native
trait SQLTransaction extends StObject {
  
  def executeSql(sqlStatement: DOMString): Unit = js.native
  def executeSql(
    sqlStatement: DOMString,
    arguments: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    errorCallback: SQLStatementErrorCallback
  ): Unit = js.native
  def executeSql(sqlStatement: DOMString, arguments: js.UndefOr[scala.Nothing], callback: SQLStatementCallback): Unit = js.native
  def executeSql(
    sqlStatement: DOMString,
    arguments: js.UndefOr[scala.Nothing],
    callback: SQLStatementCallback,
    errorCallback: SQLStatementErrorCallback
  ): Unit = js.native
  def executeSql(sqlStatement: DOMString, arguments: ObjectArray): Unit = js.native
  def executeSql(
    sqlStatement: DOMString,
    arguments: ObjectArray,
    callback: js.UndefOr[scala.Nothing],
    errorCallback: SQLStatementErrorCallback
  ): Unit = js.native
  def executeSql(sqlStatement: DOMString, arguments: ObjectArray, callback: SQLStatementCallback): Unit = js.native
  def executeSql(
    sqlStatement: DOMString,
    arguments: ObjectArray,
    callback: SQLStatementCallback,
    errorCallback: SQLStatementErrorCallback
  ): Unit = js.native
}
