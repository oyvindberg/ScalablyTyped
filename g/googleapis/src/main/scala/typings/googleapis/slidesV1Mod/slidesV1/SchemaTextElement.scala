package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A TextElement describes the content of a range of indices in the text
  * content of a Shape or TableCell.
  */
@js.native
trait SchemaTextElement extends StObject {
  
  /**
    * A TextElement representing a spot in the text that is dynamically
    * replaced with content that can change over time.
    */
  var autoText: js.UndefOr[SchemaAutoText] = js.native
  
  /**
    * The zero-based end index of this text element, exclusive, in Unicode code
    * units.
    */
  var endIndex: js.UndefOr[Double] = js.native
  
  /**
    * A marker representing the beginning of a new paragraph.  The
    * `start_index` and `end_index` of this TextElement represent the range of
    * the paragraph. Other TextElements with an index range contained inside
    * this paragraph&#39;s range are considered to be part of this paragraph.
    * The range of indices of two separate paragraphs will never overlap.
    */
  var paragraphMarker: js.UndefOr[SchemaParagraphMarker] = js.native
  
  /**
    * The zero-based start index of this text element, in Unicode code units.
    */
  var startIndex: js.UndefOr[Double] = js.native
  
  /**
    * A TextElement representing a run of text where all of the characters in
    * the run have the same TextStyle.  The `start_index` and `end_index` of
    * TextRuns will always be fully contained in the index range of a single
    * `paragraph_marker` TextElement. In other words, a TextRun will never span
    * multiple paragraphs.
    */
  var textRun: js.UndefOr[SchemaTextRun] = js.native
}
object SchemaTextElement {
  
  @scala.inline
  def apply(): SchemaTextElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextElement]
  }
  
  @scala.inline
  implicit class SchemaTextElementMutableBuilder[Self <: SchemaTextElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoText(value: SchemaAutoText): Self = StObject.set(x, "autoText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoTextUndefined: Self = StObject.set(x, "autoText", js.undefined)
    
    @scala.inline
    def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    @scala.inline
    def setParagraphMarker(value: SchemaParagraphMarker): Self = StObject.set(x, "paragraphMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphMarkerUndefined: Self = StObject.set(x, "paragraphMarker", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setTextRun(value: SchemaTextRun): Self = StObject.set(x, "textRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRunUndefined: Self = StObject.set(x, "textRun", js.undefined)
  }
}
