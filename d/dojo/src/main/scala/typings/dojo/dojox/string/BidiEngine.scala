package typings.dojo.dojox.string

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/string/BidiEngine.html
  *
  * This class provides a bidi transformation engine, i.e.
  * functions for reordering and shaping bidi text.
  * Bidi stands for support for languages with a bidirectional script.
  *
  * Usually Unicode Bidi Algorithm used by OS platform (and web browsers) is capable of properly transforming
  * Bidi text and as a result it is adequately displayed on the screen. However, in some situations,
  * Unicode Bidi Algorithm is not invoked or is not properly applied. This may occur in situation in which software
  * responsible for rendering the text is not leveraging Unicode Bidi Algorithm implemented by OS (e.g. dojox.GFX renderers).
  *
  * Bidi engine provided in this class implements Unicode Bidi Algorithm as specified at
  * http://www.unicode.org/reports/tr9/.
  *
  * For more information on basic Bidi concepts please read
  * "Bidirectional script support - A primer" available from
  * http://www.ibm.com/developerworks/websphere/library/techarticles/bidi/bidigen.html.
  *
  * As of February 2011, Bidi engine has following limitations:
  *
  * No support for following numeric shaping options:
  * H - Hindi,
  * C - Contextual,
  * N - Nominal.
  *
  * No support for following shaping options:
  * I - Initial shaping,
  * M - Middle shaping,
  * F - Final shaping,
  * B - Isolated shaping.
  *
  * No support for source-to-target or/and target-to-source maps.
  * No support for LRE/RLE/LRO/RLO/PDF (they are handled like neutrals).
  * No support for Windows compatibility.
  * No support for  insert/remove marks.
  * No support for code pages (currently only UTF-8 is supported. Ideally we should convert from any code page to UTF-8).
  *
  */
@JSGlobal("dojox.string_.BidiEngine")
@js.native
class BidiEngine () extends js.Object {
  /**
    * Central public API for Bidi engine. Transforms the text according to formatIn, formatOut parameters.
    * If formatIn or formatOut parametrs are not valid throws an exception.
    * Both formatIn and formatOut parameters are 5 letters long strings.
    * For example - "ILYNN". Each letter is associated with specific attribute of Bidi layout.
    * Possible and default values for each one of the letters are provided below:
    *
    * First letter:
    *
    * Letter position/index:
    *   1
    * Letter meaning:
    *   Ordering Schema.
    * Possible values:
    * I - Implicit (Logical).
    * V - Visual.
    *
    * Default value:
    *   I
    * Second letter:
    *
    * Letter position/index:
    *   2
    * Letter meaning:
    *   Orientation.
    * Possible values:
    * L - Left To Right.
    * R - Right To Left.
    * C - Contextual Left to Right.
    * D - Contextual Right to Left.
    *
    * Default value:
    *   L
    * Third letter:
    *
    * Letter position/index:
    *   3
    * Letter meaning:
    *   Symmetric Swapping.
    * Possible values:
    * Y - Symmetric swapping is on.
    * N - Symmetric swapping is off.
    *
    * Default value:
    *   Y
    * Fourth letter:
    *
    * Letter position/index:
    *   4
    * Letter meaning:
    *   Shaping.
    * Possible values:
    * S - Text is shaped.
    * N - Text is not shaped.
    *
    * Default value:
    *   N
    * Fifth letter:
    *
    * Letter position/index:
    *   5
    * Letter meaning:
    *   Numeric Shaping.
    * Possible values:
    * N - Nominal.
    *
    * Default value:
    *   N
    * The output of this function is original text (passed via first argument) transformed from input Bidi layout (second argument)
    * to output Bidi layout (last argument).
    *
    * Sample call:
    *
    * mytext = bidiTransform("HELLO WORLD", "ILYNN", "VLYNN");
    * In this case, "HELLO WORLD" text is transformed from Logical - LTR to Visual - LTR Bidi layout with
    *
    * default values for symmetric swapping (Yes), shaping (Not shaped) and numeric shaping (Nominal).
    *
    * @param text
    * @param formatIn Input Bidi layout in which inputText is passed to the function.
    * @param formatOut Output Bidi layout to which inputText should be transformed.
    */
  def bidiTransform(text: String, formatIn: String, formatOut: String): js.Any = js.native
  /**
    * Determine the base direction of a bidi text according
    * to its first strong directional character.
    *
    * @param text The text to check.
    */
  def checkContextual(text: String): js.Any = js.native
  /**
    * Return true if text contains RTL directed character.
    * Iterates over the text string, letter by letter starting from its beginning,
    * searching for RTL directed character.
    * Return true if found else false. Needed for vml transformation.
    *
    * @param text The source string.
    */
  def hasBidiChar(text: String): js.Any = js.native
}

