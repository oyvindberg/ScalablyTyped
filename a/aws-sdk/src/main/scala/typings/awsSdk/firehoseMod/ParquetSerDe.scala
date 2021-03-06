package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParquetSerDe extends StObject {
  
  /**
    * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this value for padding calculations.
    */
  var BlockSizeBytes: js.UndefOr[typings.awsSdk.firehoseMod.BlockSizeBytes] = js.native
  
  /**
    * The compression code to use over data blocks. The possible values are UNCOMPRESSED, SNAPPY, and GZIP, with the default being SNAPPY. Use SNAPPY for higher decompression speed. Use GZIP if the compression ratio is more important than speed.
    */
  var Compression: js.UndefOr[ParquetCompression] = js.native
  
  /**
    * Indicates whether to enable dictionary compression.
    */
  var EnableDictionaryCompression: js.UndefOr[BooleanObject] = js.native
  
  /**
    * The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is 0.
    */
  var MaxPaddingBytes: js.UndefOr[NonNegativeIntegerObject] = js.native
  
  /**
    * The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
    */
  var PageSizeBytes: js.UndefOr[ParquetPageSizeBytes] = js.native
  
  /**
    * Indicates the version of row format to output. The possible values are V1 and V2. The default is V1.
    */
  var WriterVersion: js.UndefOr[ParquetWriterVersion] = js.native
}
object ParquetSerDe {
  
  @scala.inline
  def apply(): ParquetSerDe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParquetSerDe]
  }
  
  @scala.inline
  implicit class ParquetSerDeMutableBuilder[Self <: ParquetSerDe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockSizeBytes(value: BlockSizeBytes): Self = StObject.set(x, "BlockSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockSizeBytesUndefined: Self = StObject.set(x, "BlockSizeBytes", js.undefined)
    
    @scala.inline
    def setCompression(value: ParquetCompression): Self = StObject.set(x, "Compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "Compression", js.undefined)
    
    @scala.inline
    def setEnableDictionaryCompression(value: BooleanObject): Self = StObject.set(x, "EnableDictionaryCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDictionaryCompressionUndefined: Self = StObject.set(x, "EnableDictionaryCompression", js.undefined)
    
    @scala.inline
    def setMaxPaddingBytes(value: NonNegativeIntegerObject): Self = StObject.set(x, "MaxPaddingBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPaddingBytesUndefined: Self = StObject.set(x, "MaxPaddingBytes", js.undefined)
    
    @scala.inline
    def setPageSizeBytes(value: ParquetPageSizeBytes): Self = StObject.set(x, "PageSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeBytesUndefined: Self = StObject.set(x, "PageSizeBytes", js.undefined)
    
    @scala.inline
    def setWriterVersion(value: ParquetWriterVersion): Self = StObject.set(x, "WriterVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriterVersionUndefined: Self = StObject.set(x, "WriterVersion", js.undefined)
  }
}
