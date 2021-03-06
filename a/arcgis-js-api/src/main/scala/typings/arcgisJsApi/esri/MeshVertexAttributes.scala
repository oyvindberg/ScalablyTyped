package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.PropertyKey
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshVertexAttributes extends AnonymousAccessor {
  
  /**
    * **Since: 4.9**    A flat array of the vertex colors (4 elements per vertex ranging from 0 to 255).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var color: js.UndefOr[Uint8Array] = js.native
  
  /**
    * A flat array of the vertex normals (3 elements per vertex ranging from -1 to 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var normal: js.UndefOr[Float32Array] = js.native
  
  /**
    * A flat array of vertex positions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var position: Float64Array = js.native
  
  /**
    * **Since: 4.11**    A flat array of the vertex tangents (4 elements per vertex ranging from -1 to 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var tangent: js.UndefOr[Float32Array] = js.native
  
  /**
    * A flat array of vertex uv coordinates (2 elements per vertex).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var uv: js.UndefOr[Float32Array] = js.native
}
object MeshVertexAttributes {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    position: Float64Array,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, MeshVertexAttributes]
    ]) with (js.UndefOr[js.Function1[/* props */ HashMap[_], MeshVertexAttributes]])
  ): MeshVertexAttributes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), position = position.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshVertexAttributes]
  }
  
  @scala.inline
  implicit class MeshVertexAttributesMutableBuilder[Self <: MeshVertexAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Uint8Array): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setNormal(value: Float32Array): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    @scala.inline
    def setPosition(value: Float64Array): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangent(value: Float32Array): Self = StObject.set(x, "tangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangentUndefined: Self = StObject.set(x, "tangent", js.undefined)
    
    @scala.inline
    def setUv(value: Float32Array): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvUndefined: Self = StObject.set(x, "uv", js.undefined)
  }
}
