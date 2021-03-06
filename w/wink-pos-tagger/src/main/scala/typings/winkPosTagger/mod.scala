package typings.winkPosTagger

import typings.winkPosTagger.anon.Lemma
import typings.winkTokenizer.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wink-pos-tagger", JSImport.Namespace)
  @js.native
  /**
    * create a tagger instance
    */
  class ^ () extends Tagger
  
  /* Rewritten from type alias, can be one of: 
    - typings.winkPosTagger.winkPosTaggerStrings.PRP
    - typings.winkPosTagger.winkPosTaggerStrings.VBD
    - typings.winkPosTagger.winkPosTaggerStrings.DT
    - typings.winkPosTagger.winkPosTaggerStrings.JJ
    - typings.winkPosTagger.winkPosTaggerStrings.NN
    - typings.winkPosTagger.winkPosTaggerStrings.IN
    - typings.winkPosTagger.winkPosTaggerStrings.VBG
    - typings.winkPosTagger.winkPosTaggerStrings.Dot
  */
  trait PosTag extends StObject
  object PosTag {
    
    @scala.inline
    def DT: typings.winkPosTagger.winkPosTaggerStrings.DT = "DT".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.DT]
    
    @scala.inline
    def Dot: typings.winkPosTagger.winkPosTaggerStrings.Dot = ".".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.Dot]
    
    @scala.inline
    def IN: typings.winkPosTagger.winkPosTaggerStrings.IN = "IN".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.IN]
    
    @scala.inline
    def JJ: typings.winkPosTagger.winkPosTaggerStrings.JJ = "JJ".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.JJ]
    
    @scala.inline
    def NN: typings.winkPosTagger.winkPosTaggerStrings.NN = "NN".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.NN]
    
    @scala.inline
    def PRP: typings.winkPosTagger.winkPosTaggerStrings.PRP = "PRP".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.PRP]
    
    @scala.inline
    def VBD: typings.winkPosTagger.winkPosTaggerStrings.VBD = "VBD".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.VBD]
    
    @scala.inline
    def VBG: typings.winkPosTagger.winkPosTaggerStrings.VBG = "VBG".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.VBG]
  }
  
  @js.native
  trait PosTaggedToken extends StObject {
    
    var lemma: js.UndefOr[String] = js.native
    
    var normal: String = js.native
    
    var pos: PosTag = js.native
    
    var tag: Tag = js.native
    
    var value: String = js.native
  }
  object PosTaggedToken {
    
    @scala.inline
    def apply(normal: String, pos: PosTag, tag: Tag, value: String): PosTaggedToken = {
      val __obj = js.Dynamic.literal(normal = normal.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PosTaggedToken]
    }
    
    @scala.inline
    implicit class PosTaggedTokenMutableBuilder[Self <: PosTaggedToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLemma(value: String): Self = StObject.set(x, "lemma", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLemmaUndefined: Self = StObject.set(x, "lemma", js.undefined)
      
      @scala.inline
      def setNormal(value: String): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: PosTag): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.winkPosTagger.winkPosTaggerStrings.word
    - typings.winkPosTagger.winkPosTaggerStrings.email
    - typings.winkPosTagger.winkPosTaggerStrings.emoji
    - typings.winkPosTagger.winkPosTaggerStrings.punctuation
    - typings.winkPosTagger.winkPosTaggerStrings.number
    - typings.winkPosTagger.winkPosTaggerStrings.time
    - typings.winkPosTagger.winkPosTaggerStrings.hashtag
    - typings.winkPosTagger.winkPosTaggerStrings.mention
    - typings.winkPosTagger.winkPosTaggerStrings.emoticon
    - typings.winkPosTagger.winkPosTaggerStrings.ordinal
    - typings.winkPosTagger.winkPosTaggerStrings.quoted_phrase
    - typings.winkPosTagger.winkPosTaggerStrings.url
    - typings.winkPosTagger.winkPosTaggerStrings.symbol
    - typings.winkPosTagger.winkPosTaggerStrings.currency
    - typings.winkPosTagger.winkPosTaggerStrings.alien
  */
  trait Tag extends StObject
  object Tag {
    
    @scala.inline
    def alien: typings.winkPosTagger.winkPosTaggerStrings.alien = "alien".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.alien]
    
    @scala.inline
    def currency: typings.winkPosTagger.winkPosTaggerStrings.currency = "currency".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.currency]
    
    @scala.inline
    def email: typings.winkPosTagger.winkPosTaggerStrings.email = "email".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.email]
    
    @scala.inline
    def emoji: typings.winkPosTagger.winkPosTaggerStrings.emoji = "emoji".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.emoji]
    
    @scala.inline
    def emoticon: typings.winkPosTagger.winkPosTaggerStrings.emoticon = "emoticon".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.emoticon]
    
    @scala.inline
    def hashtag: typings.winkPosTagger.winkPosTaggerStrings.hashtag = "hashtag".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.hashtag]
    
    @scala.inline
    def mention: typings.winkPosTagger.winkPosTaggerStrings.mention = "mention".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.mention]
    
    @scala.inline
    def number: typings.winkPosTagger.winkPosTaggerStrings.number = "number".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.number]
    
    @scala.inline
    def ordinal: typings.winkPosTagger.winkPosTaggerStrings.ordinal = "ordinal".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.ordinal]
    
    @scala.inline
    def punctuation: typings.winkPosTagger.winkPosTaggerStrings.punctuation = "punctuation".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.punctuation]
    
    @scala.inline
    def quoted_phrase: typings.winkPosTagger.winkPosTaggerStrings.quoted_phrase = "quoted_phrase".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.quoted_phrase]
    
    @scala.inline
    def symbol: typings.winkPosTagger.winkPosTaggerStrings.symbol = "symbol".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.symbol]
    
    @scala.inline
    def time: typings.winkPosTagger.winkPosTaggerStrings.time = "time".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.time]
    
    @scala.inline
    def url: typings.winkPosTagger.winkPosTaggerStrings.url = "url".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.url]
    
    @scala.inline
    def word: typings.winkPosTagger.winkPosTaggerStrings.word = "word".asInstanceOf[typings.winkPosTagger.winkPosTaggerStrings.word]
  }
  
  @js.native
  trait Tagger extends StObject {
    
    /**
      * This API has no effect. It has been maintained for compatibility purpose.
      * The wink-tokenizer will now always add lemma and normal forms.
      * Note, lemmas are added only for nouns (excluding proper noun), verbs and adjectives.
      * @param config configuration object
      * @returns object with active configuration
      */
    def defineConfig(config: js.Any): Lemma = js.native
    
    /**
      * Tags the input tokens with their pos.
      * In order to pos tag a sentence directly, use tagSentence API instead
      * @param tokens array of tokens, as produced by the wink tokenizer
      * @return pos tagged tokens
      */
    def tag(tokens: js.Array[Token]): js.Array[PosTaggedToken] = js.native
    
    /**
      * Tags the raw tokens with their pos.
      * Note, it only categorizes each token in to one of the following 3-categories (a) word, or (b) punctuation, or (c) number.
      * @param tokens to be pos tagged. They are simple array of string.
      * @return pos tagged tokens
      */
    def tagRawTokens(tokens: js.Array[String]): js.Array[PosTaggedToken] = js.native
    
    /**
      * Tokenizes the input sentence and tags the tokens.
      * @param sentence to be pos tagged
      * @return pos tagged tokens
      */
    def tagSentence(sentence: String): js.Array[PosTaggedToken] = js.native
    
    /**
      * Updates the internal lexicon using the input lexicon.
      * If a word/pos pair is found in the internal lexicon then it's value is updated with the new pos; otherwise it added.
      * @param lexicon object with word/pos pairs to be added or replaced in the existing lexicon.
      * @return pos tagged tokens
      */
    def updateLexicon(lexicon: js.Object): Unit = js.native
  }
  object Tagger {
    
    @scala.inline
    def apply(
      defineConfig: js.Any => Lemma,
      tag: js.Array[Token] => js.Array[PosTaggedToken],
      tagRawTokens: js.Array[String] => js.Array[PosTaggedToken],
      tagSentence: String => js.Array[PosTaggedToken],
      updateLexicon: js.Object => Unit
    ): Tagger = {
      val __obj = js.Dynamic.literal(defineConfig = js.Any.fromFunction1(defineConfig), tag = js.Any.fromFunction1(tag), tagRawTokens = js.Any.fromFunction1(tagRawTokens), tagSentence = js.Any.fromFunction1(tagSentence), updateLexicon = js.Any.fromFunction1(updateLexicon))
      __obj.asInstanceOf[Tagger]
    }
    
    @scala.inline
    implicit class TaggerMutableBuilder[Self <: Tagger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefineConfig(value: js.Any => Lemma): Self = StObject.set(x, "defineConfig", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTag(value: js.Array[Token] => js.Array[PosTaggedToken]): Self = StObject.set(x, "tag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTagRawTokens(value: js.Array[String] => js.Array[PosTaggedToken]): Self = StObject.set(x, "tagRawTokens", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTagSentence(value: String => js.Array[PosTaggedToken]): Self = StObject.set(x, "tagSentence", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateLexicon(value: js.Object => Unit): Self = StObject.set(x, "updateLexicon", js.Any.fromFunction1(value))
    }
  }
}
