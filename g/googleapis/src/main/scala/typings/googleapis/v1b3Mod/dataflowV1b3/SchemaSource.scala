package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A source that records can be read and decoded from.
  */
@js.native
trait SchemaSource extends StObject {
  
  /**
    * While splitting, sources may specify the produced bundles as differences
    * against another source, in order to save backend-side memory and allow
    * bigger jobs. For details, see SourceSplitRequest. To support this use
    * case, the full set of parameters of the source is logically obtained by
    * taking the latest explicitly specified value of each parameter in the
    * order: base_specs (later items win), spec (overrides anything in
    * base_specs).
    */
  var baseSpecs: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  
  /**
    * The codec to use to decode data read from the source.
    */
  var codec: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Setting this value to true hints to the framework that the source
    * doesn&#39;t need splitting, and using SourceSplitRequest on it would
    * yield SOURCE_SPLIT_OUTCOME_USE_CURRENT.  E.g. a file splitter may set
    * this to true when splitting a single file into a set of byte ranges of
    * appropriate size, and set this to false when splitting a filepattern into
    * individual files. However, for efficiency, a file splitter may decide to
    * produce file subranges directly from the filepattern to avoid a splitting
    * round-trip.  See SourceSplitRequest for an overview of the splitting
    * process.  This field is meaningful only in the Source objects populated
    * by the user (e.g. when filling in a DerivedSource). Source objects
    * supplied by the framework to the user don&#39;t have this field
    * populated.
    */
  var doesNotNeedSplitting: js.UndefOr[Boolean] = js.native
  
  /**
    * Optionally, metadata for this source can be supplied right away, avoiding
    * a SourceGetMetadataOperation roundtrip (see SourceOperationRequest). This
    * field is meaningful only in the Source objects populated by the user
    * (e.g. when filling in a DerivedSource). Source objects supplied by the
    * framework to the user don&#39;t have this field populated.
    */
  var metadata: js.UndefOr[SchemaSourceMetadata] = js.native
  
  /**
    * The source to read from, plus its parameters.
    */
  var spec: js.UndefOr[StringDictionary[js.Any]] = js.native
}
object SchemaSource {
  
  @scala.inline
  def apply(): SchemaSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSource]
  }
  
  @scala.inline
  implicit class SchemaSourceMutableBuilder[Self <: SchemaSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseSpecs(value: js.Array[StringDictionary[_]]): Self = StObject.set(x, "baseSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseSpecsUndefined: Self = StObject.set(x, "baseSpecs", js.undefined)
    
    @scala.inline
    def setBaseSpecsVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "baseSpecs", js.Array(value :_*))
    
    @scala.inline
    def setCodec(value: StringDictionary[js.Any]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    @scala.inline
    def setDoesNotNeedSplitting(value: Boolean): Self = StObject.set(x, "doesNotNeedSplitting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoesNotNeedSplittingUndefined: Self = StObject.set(x, "doesNotNeedSplitting", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaSourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setSpec(value: StringDictionary[js.Any]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
