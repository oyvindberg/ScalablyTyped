package typings.redent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  [Strip redundant indentation](https://github.com/sindresorhus/strip-indent) and [indent the string](https://github.com/sindresorhus/indent-string).
  @param string - The string to normalize indentation.
  @param count - How many times you want `options.indent` repeated. Default: `0`.
  @example
  ```
  import redent = require('redent');
  redent('\n  foo\n    bar\n', 1);
  //=> '\n foo\n   bar\n'
  ```
  */
  @JSImport("redent", JSImport.Namespace)
  @js.native
  def apply(string: String): String = js.native
  @JSImport("redent", JSImport.Namespace)
  @js.native
  def apply(string: String, count: js.UndefOr[scala.Nothing], options: Options): String = js.native
  @JSImport("redent", JSImport.Namespace)
  @js.native
  def apply(string: String, count: Double): String = js.native
  @JSImport("redent", JSImport.Namespace)
  @js.native
  def apply(string: String, count: Double, options: Options): String = js.native
  
  type Options = typings.indentString.mod.Options
}
