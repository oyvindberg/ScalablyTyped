package typings.remarkable.libMod

import typings.remarkable.remarkableStrings.list
import typings.remarkable.remarkableStrings.root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateBlock extends StObject {
  
  var bMarks: js.Array[Double] = js.native
  
  /** required block content indent */
  var blkIndent: Double = js.native
  
  /** Indent of the current dd block, -1 if there isn't any */
  var ddIndent: Double = js.native
  
  var eMarks: js.Array[Double] = js.native
  
  var env: Env = js.native
  
  def getLines(begin: Double, end: Double, indent: Double, keepLastLF: Boolean): String = js.native
  
  def isEmpty(line: Double): Boolean = js.native
  
  var level: Double = js.native
  
  /** line index in src */
  var line: Double = js.native
  
  /** lines count */
  var lineMax: Double = js.native
  
  var options: Options = js.native
  
  /** If `list`, block parser stops on two newlines */
  var parentType: root | list = js.native
  
  /** Shortcuts to simplify nested calls */
  var parser: ParserBlock = js.native
  
  var result: String = js.native
  
  def skipChars(pos: Double, code: Double): Double = js.native
  
  def skipEmptyLines(from: Double): Double = js.native
  
  def skipSpaces(pos: Double): Double = js.native
  
  var src: String = js.native
  
  var tShift: js.Array[Double] = js.native
  
  /** loose/tight mode for lists */
  var tight: Boolean = js.native
  
  var tokens: js.Array[BlockContentToken] = js.native
}
object StateBlock {
  
  @scala.inline
  def apply(
    bMarks: js.Array[Double],
    blkIndent: Double,
    ddIndent: Double,
    eMarks: js.Array[Double],
    env: Env,
    getLines: (Double, Double, Double, Boolean) => String,
    isEmpty: Double => Boolean,
    level: Double,
    line: Double,
    lineMax: Double,
    options: Options,
    parentType: root | list,
    parser: ParserBlock,
    result: String,
    skipChars: (Double, Double) => Double,
    skipEmptyLines: Double => Double,
    skipSpaces: Double => Double,
    src: String,
    tShift: js.Array[Double],
    tight: Boolean,
    tokens: js.Array[BlockContentToken]
  ): StateBlock = {
    val __obj = js.Dynamic.literal(bMarks = bMarks.asInstanceOf[js.Any], blkIndent = blkIndent.asInstanceOf[js.Any], ddIndent = ddIndent.asInstanceOf[js.Any], eMarks = eMarks.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], getLines = js.Any.fromFunction4(getLines), isEmpty = js.Any.fromFunction1(isEmpty), level = level.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], lineMax = lineMax.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], skipChars = js.Any.fromFunction2(skipChars), skipEmptyLines = js.Any.fromFunction1(skipEmptyLines), skipSpaces = js.Any.fromFunction1(skipSpaces), src = src.asInstanceOf[js.Any], tShift = tShift.asInstanceOf[js.Any], tight = tight.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateBlock]
  }
  
  @scala.inline
  implicit class StateBlockMutableBuilder[Self <: StateBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBMarks(value: js.Array[Double]): Self = StObject.set(x, "bMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBMarksVarargs(value: Double*): Self = StObject.set(x, "bMarks", js.Array(value :_*))
    
    @scala.inline
    def setBlkIndent(value: Double): Self = StObject.set(x, "blkIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdIndent(value: Double): Self = StObject.set(x, "ddIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEMarks(value: js.Array[Double]): Self = StObject.set(x, "eMarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEMarksVarargs(value: Double*): Self = StObject.set(x, "eMarks", js.Array(value :_*))
    
    @scala.inline
    def setEnv(value: Env): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetLines(value: (Double, Double, Double, Boolean) => String): Self = StObject.set(x, "getLines", js.Any.fromFunction4(value))
    
    @scala.inline
    def setIsEmpty(value: Double => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineMax(value: Double): Self = StObject.set(x, "lineMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentType(value: root | list): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParser(value: ParserBlock): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipChars(value: (Double, Double) => Double): Self = StObject.set(x, "skipChars", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSkipEmptyLines(value: Double => Double): Self = StObject.set(x, "skipEmptyLines", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSkipSpaces(value: Double => Double): Self = StObject.set(x, "skipSpaces", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTShift(value: js.Array[Double]): Self = StObject.set(x, "tShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTShiftVarargs(value: Double*): Self = StObject.set(x, "tShift", js.Array(value :_*))
    
    @scala.inline
    def setTight(value: Boolean): Self = StObject.set(x, "tight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: js.Array[BlockContentToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: BlockContentToken*): Self = StObject.set(x, "tokens", js.Array(value :_*))
  }
}
