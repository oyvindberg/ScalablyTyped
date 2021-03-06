package typings.babylonjs.mod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "SphericalPolynomial")
@js.native
class SphericalPolynomial ()
  extends typings.babylonjs.legacyMod.SphericalPolynomial
/* static members */
object SphericalPolynomial {
  
  /**
    * Constructs a spherical polynomial from an array.
    * @param data defines the 9x3 coefficients (x, y, z, xx, yy, zz, yz, zx, xy)
    * @returns the spherical polynomial
    */
  @JSImport("babylonjs", "SphericalPolynomial.FromArray")
  @js.native
  def FromArray(data: ArrayLike[ArrayLike[Double]]): typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial = js.native
  
  /**
    * Gets the spherical polynomial from harmonics
    * @param harmonics the spherical harmonics
    * @returns the spherical polynomial
    */
  @JSImport("babylonjs", "SphericalPolynomial.FromHarmonics")
  @js.native
  def FromHarmonics(harmonics: typings.babylonjs.sphericalPolynomialMod.SphericalHarmonics): typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial = js.native
}
