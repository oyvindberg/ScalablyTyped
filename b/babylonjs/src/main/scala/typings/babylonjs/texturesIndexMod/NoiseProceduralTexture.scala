package typings.babylonjs.texturesIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Textures/index", "NoiseProceduralTexture")
@js.native
class NoiseProceduralTexture protected ()
  extends typings.babylonjs.proceduralsIndexMod.NoiseProceduralTexture {
  /**
    * Creates a new NoiseProceduralTexture
    * @param name defines the name fo the texture
    * @param size defines the size of the texture (default is 256)
    * @param scene defines the hosting scene
    * @param fallbackTexture defines the texture to use if the NoiseProceduralTexture can't be created
    * @param generateMipMaps defines if mipmaps must be generated (true by default)
    */
  def this(name: String) = this()
  def this(name: String, size: Double) = this()
  def this(name: String, size: js.UndefOr[scala.Nothing], scene: Nullable[Scene]) = this()
  def this(name: String, size: Double, scene: Nullable[Scene]) = this()
  def this(
    name: String,
    size: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[Scene]],
    fallbackTexture: typings.babylonjs.textureMod.Texture
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: js.UndefOr[Nullable[Scene]],
    fallbackTexture: typings.babylonjs.textureMod.Texture
  ) = this()
  def this(
    name: String,
    size: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[Scene]],
    fallbackTexture: js.UndefOr[scala.Nothing],
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[Scene]],
    fallbackTexture: typings.babylonjs.textureMod.Texture,
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: js.UndefOr[Nullable[Scene]],
    fallbackTexture: js.UndefOr[scala.Nothing],
    generateMipMaps: Boolean
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: js.UndefOr[Nullable[Scene]],
    fallbackTexture: typings.babylonjs.textureMod.Texture,
    generateMipMaps: Boolean
  ) = this()
}
/* static members */
object NoiseProceduralTexture {
  
  /**
    * Creates a NoiseProceduralTexture from parsed noise procedural texture data
    * @param parsedTexture defines parsed texture data
    * @param scene defines the current scene
    * @param rootUrl defines the root URL containing noise procedural texture information
    * @returns a parsed NoiseProceduralTexture
    */
  @JSImport("babylonjs/Materials/Textures/index", "NoiseProceduralTexture.Parse")
  @js.native
  def Parse(parsedTexture: js.Any, scene: Scene): typings.babylonjs.noiseProceduralTextureMod.NoiseProceduralTexture = js.native
}
