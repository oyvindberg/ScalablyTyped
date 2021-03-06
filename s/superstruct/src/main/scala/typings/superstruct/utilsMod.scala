package typings.superstruct

import org.scalablytyped.runtime.TopLevel
import typings.std.IterableIterator
import typings.std.Iterator
import typings.std.Record
import typings.superstruct.structMod.Struct
import typings.superstruct.structMod.StructContext
import typings.superstruct.structMod.StructFailure
import typings.superstruct.structMod.StructResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("superstruct/lib/utils", "iteratorShift")
  @js.native
  def iteratorShift[T](input: Iterator[T, _, js.UndefOr[scala.Nothing]]): js.UndefOr[T] = js.native
  
  @JSImport("superstruct/lib/utils", "toFailures")
  @js.native
  def toFailures(result: StructResult, context: StructContext): IterableIterator[StructFailure] = js.native
  
  type StructRecord[T] = Record[String, Struct[T, js.Any]]
  
  type StructTuple[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: superstruct.superstruct/lib/struct.Struct<T[K], any>}
    */ typings.superstruct.superstructStrings.StructTuple with TopLevel[T]
}
