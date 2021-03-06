package typings.documentdb

import typings.documentdb.mod.ConsistencyLevel
import typings.documentdb.mod.IndexKind
import typings.documentdb.mod.IndexingMode
import typings.documentdb.mod.MediaReadMode
import typings.documentdb.mod.PermissionMode
import typings.documentdb.mod.TriggerOperation
import typings.documentdb.mod.TriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentdbStrings {
  
  @js.native
  sealed trait All
    extends PermissionMode
       with TriggerOperation
  @scala.inline
  def All: All = "All".asInstanceOf[All]
  
  @js.native
  sealed trait BoundedStaleness extends ConsistencyLevel
  @scala.inline
  def BoundedStaleness: BoundedStaleness = "BoundedStaleness".asInstanceOf[BoundedStaleness]
  
  @js.native
  sealed trait Buffered extends MediaReadMode
  @scala.inline
  def Buffered: Buffered = "Buffered".asInstanceOf[Buffered]
  
  @js.native
  sealed trait Consistent extends IndexingMode
  @scala.inline
  def Consistent: Consistent = "Consistent".asInstanceOf[Consistent]
  
  @js.native
  sealed trait Create extends TriggerOperation
  @scala.inline
  def Create: Create = "Create".asInstanceOf[Create]
  
  @js.native
  sealed trait Delete extends TriggerOperation
  @scala.inline
  def Delete: Delete = "Delete".asInstanceOf[Delete]
  
  @js.native
  sealed trait Eventual extends ConsistencyLevel
  @scala.inline
  def Eventual: Eventual = "Eventual".asInstanceOf[Eventual]
  
  @js.native
  sealed trait Hash extends IndexKind
  @scala.inline
  def Hash: Hash = "Hash".asInstanceOf[Hash]
  
  @js.native
  sealed trait Javascript extends StObject
  @scala.inline
  def Javascript: Javascript = "Javascript".asInstanceOf[Javascript]
  
  @js.native
  sealed trait Lazy extends IndexingMode
  @scala.inline
  def Lazy: Lazy = "Lazy".asInstanceOf[Lazy]
  
  @js.native
  sealed trait None extends PermissionMode
  @scala.inline
  def None: None = "None".asInstanceOf[None]
  
  @js.native
  sealed trait Post extends TriggerType
  @scala.inline
  def Post: Post = "Post".asInstanceOf[Post]
  
  @js.native
  sealed trait Pre extends TriggerType
  @scala.inline
  def Pre: Pre = "Pre".asInstanceOf[Pre]
  
  @js.native
  sealed trait Range extends IndexKind
  @scala.inline
  def Range: Range = "Range".asInstanceOf[Range]
  
  @js.native
  sealed trait Read extends PermissionMode
  @scala.inline
  def Read: Read = "Read".asInstanceOf[Read]
  
  @js.native
  sealed trait Replace extends TriggerOperation
  @scala.inline
  def Replace: Replace = "Replace".asInstanceOf[Replace]
  
  @js.native
  sealed trait Session extends ConsistencyLevel
  @scala.inline
  def Session: Session = "Session".asInstanceOf[Session]
  
  @js.native
  sealed trait Spatial extends IndexKind
  @scala.inline
  def Spatial: Spatial = "Spatial".asInstanceOf[Spatial]
  
  @js.native
  sealed trait Streamed extends MediaReadMode
  @scala.inline
  def Streamed: Streamed = "Streamed".asInstanceOf[Streamed]
  
  @js.native
  sealed trait Strong extends ConsistencyLevel
  @scala.inline
  def Strong: Strong = "Strong".asInstanceOf[Strong]
  
  @js.native
  sealed trait Update extends TriggerOperation
  @scala.inline
  def Update: Update = "Update".asInstanceOf[Update]
  
  @js.native
  sealed trait all_ extends TriggerOperation
  @scala.inline
  def all_ : all_ = "all".asInstanceOf[all_]
  
  @js.native
  sealed trait create_ extends TriggerOperation
  @scala.inline
  def create_ : create_ = "create".asInstanceOf[create_]
  
  @js.native
  sealed trait delete_ extends TriggerOperation
  @scala.inline
  def delete_ : delete_ = "delete".asInstanceOf[delete_]
  
  @js.native
  sealed trait post_ extends TriggerType
  @scala.inline
  def post_ : post_ = "post".asInstanceOf[post_]
  
  @js.native
  sealed trait pre_ extends TriggerType
  @scala.inline
  def pre_ : pre_ = "pre".asInstanceOf[pre_]
  
  @js.native
  sealed trait replace_ extends TriggerOperation
  @scala.inline
  def replace_ : replace_ = "replace".asInstanceOf[replace_]
  
  @js.native
  sealed trait update_ extends TriggerOperation
  @scala.inline
  def update_ : update_ = "update".asInstanceOf[update_]
}
