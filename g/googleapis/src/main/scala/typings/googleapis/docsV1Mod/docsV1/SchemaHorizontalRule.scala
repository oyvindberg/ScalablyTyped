package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ParagraphElement representing a horizontal line.
  */
@js.native
trait SchemaHorizontalRule extends StObject {
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The suggested insertion IDs. A HorizontalRule may have multiple insertion
    * IDs if it is a nested suggested change. If empty, then this is not a
    * suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The suggested text style changes to this HorizontalRule, keyed by
    * suggestion ID.
    */
  var suggestedTextStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedTextStyle]] = js.native
  
  /**
    * The text style of this HorizontalRule.  Similar to text content, like
    * text runs and footnote references, the text style of a horizontal rule
    * can affect content layout as well as the styling of text inserted
    * adjacent to it.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
}
object SchemaHorizontalRule {
  
  @scala.inline
  def apply(): SchemaHorizontalRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHorizontalRule]
  }
  
  @scala.inline
  implicit class SchemaHorizontalRuleMutableBuilder[Self <: SchemaHorizontalRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    @scala.inline
    def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedTextStyleChanges(value: StringDictionary[SchemaSuggestedTextStyle]): Self = StObject.set(x, "suggestedTextStyleChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedTextStyleChangesUndefined: Self = StObject.set(x, "suggestedTextStyleChanges", js.undefined)
    
    @scala.inline
    def setTextStyle(value: SchemaTextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
