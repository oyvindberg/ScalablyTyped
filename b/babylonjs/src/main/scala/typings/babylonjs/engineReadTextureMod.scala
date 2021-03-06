package typings.babylonjs

import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object engineReadTextureMod {
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /** @hidden */
      def _readTexturePixels(texture: InternalTexture, width: Double, height: Double): ArrayBufferView = js.native
      def _readTexturePixels(
        texture: InternalTexture,
        width: Double,
        height: Double,
        faceIndex: js.UndefOr[scala.Nothing],
        level: js.UndefOr[scala.Nothing],
        buffer: Nullable[ArrayBufferView]
      ): ArrayBufferView = js.native
      def _readTexturePixels(
        texture: InternalTexture,
        width: Double,
        height: Double,
        faceIndex: js.UndefOr[scala.Nothing],
        level: Double
      ): ArrayBufferView = js.native
      def _readTexturePixels(
        texture: InternalTexture,
        width: Double,
        height: Double,
        faceIndex: js.UndefOr[scala.Nothing],
        level: Double,
        buffer: Nullable[ArrayBufferView]
      ): ArrayBufferView = js.native
      def _readTexturePixels(texture: InternalTexture, width: Double, height: Double, faceIndex: Double): ArrayBufferView = js.native
      def _readTexturePixels(
        texture: InternalTexture,
        width: Double,
        height: Double,
        faceIndex: Double,
        level: js.UndefOr[scala.Nothing],
        buffer: Nullable[ArrayBufferView]
      ): ArrayBufferView = js.native
      def _readTexturePixels(texture: InternalTexture, width: Double, height: Double, faceIndex: Double, level: Double): ArrayBufferView = js.native
      def _readTexturePixels(
        texture: InternalTexture,
        width: Double,
        height: Double,
        faceIndex: Double,
        level: Double,
        buffer: Nullable[ArrayBufferView]
      ): ArrayBufferView = js.native
    }
  }
}
