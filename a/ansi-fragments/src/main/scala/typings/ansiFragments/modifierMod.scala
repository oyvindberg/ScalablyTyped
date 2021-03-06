package typings.ansiFragments

import typings.ansiFragments.ifragmentMod.IFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifierMod {
  
  @JSImport("ansi-fragments/build/fragments/Modifier", "Modifier")
  @js.native
  class Modifier_ protected () extends IFragment {
    def this(ansiModifier: AnsiModifier, children: js.Array[String | IFragment]) = this()
    
    val children: js.Any = js.native
    
    val modifier: js.Any = js.native
  }
  
  @JSImport("ansi-fragments/build/fragments/Modifier", "modifier")
  @js.native
  def modifier(ansiModifier: AnsiModifier, children: (String | IFragment)*): Modifier_ = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ansiFragments.ansiFragmentsStrings.dim
    - typings.ansiFragments.ansiFragmentsStrings.bold
    - typings.ansiFragments.ansiFragmentsStrings.hidden
    - typings.ansiFragments.ansiFragmentsStrings.italic
    - typings.ansiFragments.ansiFragmentsStrings.underline
    - typings.ansiFragments.ansiFragmentsStrings.strikethrough
    - typings.ansiFragments.ansiFragmentsStrings.none
  */
  trait AnsiModifier extends StObject
  object AnsiModifier {
    
    @scala.inline
    def bold: typings.ansiFragments.ansiFragmentsStrings.bold = "bold".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.bold]
    
    @scala.inline
    def dim: typings.ansiFragments.ansiFragmentsStrings.dim = "dim".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.dim]
    
    @scala.inline
    def hidden: typings.ansiFragments.ansiFragmentsStrings.hidden = "hidden".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.hidden]
    
    @scala.inline
    def italic: typings.ansiFragments.ansiFragmentsStrings.italic = "italic".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.italic]
    
    @scala.inline
    def none: typings.ansiFragments.ansiFragmentsStrings.none = "none".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.none]
    
    @scala.inline
    def strikethrough: typings.ansiFragments.ansiFragmentsStrings.strikethrough = "strikethrough".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.strikethrough]
    
    @scala.inline
    def underline: typings.ansiFragments.ansiFragmentsStrings.underline = "underline".asInstanceOf[typings.ansiFragments.ansiFragmentsStrings.underline]
  }
}
