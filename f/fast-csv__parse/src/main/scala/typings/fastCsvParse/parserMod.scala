package typings.fastCsvParse

import typings.fastCsvParse.parserOptionsMod.ParserOptions
import typings.fastCsvParse.scannerMod.ScannerArgs
import typings.fastCsvParse.tokenMod.TokenArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@fast-csv/parse/build/src/parser", "ColumnParser")
  @js.native
  class ColumnParser protected ()
    extends typings.fastCsvParse.columnMod.ColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "NonQuotedColumnParser")
  @js.native
  class NonQuotedColumnParser protected ()
    extends typings.fastCsvParse.columnMod.NonQuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "Parser")
  @js.native
  class Parser protected ()
    extends typings.fastCsvParse.parserParserMod.Parser {
    def this(parserOptions: ParserOptions) = this()
  }
  /* static members */
  object Parser {
    
    @JSImport("@fast-csv/parse/build/src/parser", "Parser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser", "Parser.removeBOM")
    @js.native
    def removeBOM: js.Any = js.native
    @scala.inline
    def removeBOM_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeBOM")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "QuotedColumnParser")
  @js.native
  class QuotedColumnParser protected ()
    extends typings.fastCsvParse.columnMod.QuotedColumnParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "RowParser")
  @js.native
  class RowParser protected ()
    extends typings.fastCsvParse.rowParserMod.RowParser {
    def this(parserOptions: ParserOptions) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "Scanner")
  @js.native
  class Scanner protected ()
    extends typings.fastCsvParse.scannerMod.Scanner {
    def this(args: ScannerArgs) = this()
  }
  
  @JSImport("@fast-csv/parse/build/src/parser", "Token")
  @js.native
  class Token protected ()
    extends typings.fastCsvParse.tokenMod.Token {
    def this(tokenArgs: TokenArgs) = this()
  }
  /* static members */
  object Token {
    
    @JSImport("@fast-csv/parse/build/src/parser", "Token.isTokenCarriageReturn")
    @js.native
    def isTokenCarriageReturn(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser", "Token.isTokenComment")
    @js.native
    def isTokenComment(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser", "Token.isTokenDelimiter")
    @js.native
    def isTokenDelimiter(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser", "Token.isTokenEscapeCharacter")
    @js.native
    def isTokenEscapeCharacter(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser", "Token.isTokenQuote")
    @js.native
    def isTokenQuote(token: typings.fastCsvParse.tokenMod.Token, parserOptions: ParserOptions): Boolean = js.native
    
    @JSImport("@fast-csv/parse/build/src/parser", "Token.isTokenRowDelimiter")
    @js.native
    def isTokenRowDelimiter(token: typings.fastCsvParse.tokenMod.Token): Boolean = js.native
  }
}
