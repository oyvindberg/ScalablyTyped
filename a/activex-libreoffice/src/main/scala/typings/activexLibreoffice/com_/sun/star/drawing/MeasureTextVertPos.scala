package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.activexLibreofficeNumbers.`0`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This enumeration defines the relative vertical placement of the text inside a measure shape. */
/* Rewritten from type alias, can be one of: 
  - typings.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
*/
trait MeasureTextVertPos extends StObject
object MeasureTextVertPos {
  
  /**
    * the connection point is chosen automatically,
    *
    * Set this to have the application select the best horizontal position for the text.
    */
  @scala.inline
  def AUTO: `0` = 0.asInstanceOf[`0`]
  
  @scala.inline
  def BREAKEDLINE: `2` = 2.asInstanceOf[`2`]
  
  /**
    * The text is positioned at the center.
    *
    * The text is positioned over the main line.
    */
  @scala.inline
  def CENTERED: `4` = 4.asInstanceOf[`4`]
  
  @scala.inline
  def EAST: `1` = 1.asInstanceOf[`1`]
  
  @scala.inline
  def WEST: `3` = 3.asInstanceOf[`3`]
}
