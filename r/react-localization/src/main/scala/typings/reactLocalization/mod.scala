package typings.reactLocalization

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-localization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-localization", JSImport.Default)
  @js.native
  def default: LocalizedStringsFactory = js.native
  @scala.inline
  def default_=(x: LocalizedStringsFactory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  type FormatObject[U /* <: Formatted */] = StringDictionary[U]
  
  type Formatted = Double | String | Element
  
  type GlobalStrings[T] = StringDictionary[T]
  
  type LocalizedStrings[T] = LocalizedStringsMethods with T
  
  @js.native
  trait LocalizedStringsFactory
    extends Instantiable1[/* props */ GlobalStrings[js.Object], LocalizedStrings[js.Object]]
  
  @js.native
  trait LocalizedStringsMethods extends StObject {
    
    /**
      * Format the passed string replacing the numbered placeholders
      * i.e. I'd like some {0} and {1}, or just {0}
      * Use example:
      *   strings.formatString(strings.question, strings.bread, strings.butter)
      */
    def formatString[T /* <: Formatted */](str: String, values: (T | FormatObject[T])*): (js.Array[String | T]) | String = js.native
    
    /**
      * Return an array containing the available languages passed as props in the constructor
      */
    def getAvailableLanguages(): js.Array[String] = js.native
    
    /**
      * The current interface language (could differ from the language displayed)
      */
    def getInterfaceLanguage(): String = js.native
    
    /**
      *  The current language displayed (could differ from the interface language
      *  if it has been forced manually and a matching translation has been found)
      */
    def getLanguage(): String = js.native
    
    /**
      * Return a string with the passed key in a different language
      * @param key 
      * @param language 
      */
    def getString(key: String): String = js.native
    def getString(key: String, language: String): String = js.native
    
    /**
      * Replace the NamedLocalization object without reinstantiating the object
      * @param props 
      */
    def setContent(props: js.Any): Unit = js.native
    
    /**
      * Can be used from ouside the class to force a particular language
      * indipendently from the interface one
      * @param language 
      */
    def setLanguage(language: String): Unit = js.native
  }
}
