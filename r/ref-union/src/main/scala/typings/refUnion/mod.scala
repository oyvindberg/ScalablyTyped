package typings.refUnion

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.ref.mod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The union type meta-constructor. */
object mod {
  
  @JSImport("ref-union", JSImport.Namespace)
  @js.native
  def apply(): UnionType = js.native
  @JSImport("ref-union", JSImport.Namespace)
  @js.native
  def apply(fields: js.Array[_]): UnionType = js.native
  @JSImport("ref-union", JSImport.Namespace)
  @js.native
  def apply(fields: js.Object): UnionType = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("ref-union", JSImport.Namespace)
  @js.native
  class Class () extends UnionType {
    def this(fields: js.Array[_]) = this()
    def this(fields: js.Object) = this()
  }
  
  /**
    * This is the `constructor` of the Struct type that gets returned.
    *
    * Invoke it with `new` to create a new Buffer instance backing the union.
    * Pass it an existing Buffer instance to use that as the backing buffer.
    * Pass in an Object containing the union fields to auto-populate the
    * union with the data.
    *
    * @constructor
    */
  @js.native
  trait UnionType
    extends Type
       with /** Pass it an existing Buffer instance to use that as the backing buffer. */
  Instantiable1[(/* arg */ Buffer) | (/* data */ js.Object), js.Any]
       with Instantiable0[js.Any]
       with Instantiable2[/* arg */ Buffer, /* data */ js.Object, js.Any] {
    
    def apply(): js.Any = js.native
    /** Pass it an existing Buffer instance to use that as the backing buffer. */
    def apply(arg: Buffer): js.Any = js.native
    def apply(arg: Buffer, data: js.Object): js.Any = js.native
    def apply(data: js.Object): js.Any = js.native
    
    /**
      * Adds a new field to the union instance with the given name and type.
      * Note that this function will throw an Error if any instances of the union
      * type have already been created, therefore this function must be called at the
      * beginning, before any instances are created.
      */
    def defineProperty(name: String, `type`: String): Unit = js.native
    /**
      * Adds a new field to the union instance with the given name and type.
      * Note that this function will throw an Error if any instances of the union
      * type have already been created, therefore this function must be called at the
      * beginning, before any instances are created.
      */
    def defineProperty(name: String, `type`: Type): Unit = js.native
    
    var fields: StringDictionary[typings.refUnion.anon.Type] = js.native
  }
}
