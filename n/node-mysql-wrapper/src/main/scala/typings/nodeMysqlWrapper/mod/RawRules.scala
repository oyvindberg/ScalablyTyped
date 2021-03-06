package typings.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawRules extends StObject {
  
  var begin: String = js.native
  
  var end: String = js.native
  
  var groupBy: String = js.native
  
  var limit: Double = js.native
  
  var limitEnd: Double = js.native
  
  // limit = limitStart  =0 and limitEnd = limit.
  var limitStart: Double = js.native
  
  var orderBy: String = js.native
  
  var orderByDesc: String = js.native
  
  var table: String = js.native
}
object RawRules {
  
  @scala.inline
  def apply(
    begin: String,
    end: String,
    groupBy: String,
    limit: Double,
    limitEnd: Double,
    limitStart: Double,
    orderBy: String,
    orderByDesc: String,
    table: String
  ): RawRules = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], groupBy = groupBy.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], limitEnd = limitEnd.asInstanceOf[js.Any], limitStart = limitStart.asInstanceOf[js.Any], orderBy = orderBy.asInstanceOf[js.Any], orderByDesc = orderByDesc.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawRules]
  }
  
  @scala.inline
  implicit class RawRulesMutableBuilder[Self <: RawRules] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupBy(value: String): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitEnd(value: Double): Self = StObject.set(x, "limitEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitStart(value: Double): Self = StObject.set(x, "limitStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderByDesc(value: String): Self = StObject.set(x, "orderByDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
