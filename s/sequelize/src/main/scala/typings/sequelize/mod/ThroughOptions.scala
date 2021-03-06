package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for a association table in n:m associations.
  *
  * @see AssociationOptionsBelongsToMany
  */
@js.native
trait ThroughOptions extends StObject {
  
  /**
    * The model used to join both sides of the N:M association.
    */
  var model: Model[_, _, _] = js.native
  
  /**
    * A key/value set that will be used for association create and find defaults on the through model.
    * (Remember to add the attributes to the through model)
    */
  var scope: js.UndefOr[AssociationScope] = js.native
  
  /**
    * If true a unique key will be generated from the foreign keys used (might want to turn this off and create
    * specific unique keys when using scopes)
    *
    * Defaults to true
    */
  var unique: js.UndefOr[Boolean] = js.native
}
object ThroughOptions {
  
  @scala.inline
  def apply(model: Model[_, _, _]): ThroughOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThroughOptions]
  }
  
  @scala.inline
  implicit class ThroughOptionsMutableBuilder[Self <: ThroughOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModel(value: Model[_, _, _]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: AssociationScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}
