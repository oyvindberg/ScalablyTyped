package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlueConfiguration extends StObject {
  
  /**
    * The name of the database in your AWS Glue Data Catalog in which the table is located. An AWS Glue Data Catalog database contains metadata tables.
    */
  var databaseName: GlueDatabaseName = js.native
  
  /**
    * The name of the table in your AWS Glue Data Catalog that is used to perform the ETL operations. An AWS Glue Data Catalog table contains partitioned data and descriptions of data sources and targets.
    */
  var tableName: GlueTableName = js.native
}
object GlueConfiguration {
  
  @scala.inline
  def apply(databaseName: GlueDatabaseName, tableName: GlueTableName): GlueConfiguration = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlueConfiguration]
  }
  
  @scala.inline
  implicit class GlueConfigurationMutableBuilder[Self <: GlueConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseName(value: GlueDatabaseName): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableName(value: GlueTableName): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
  }
}
