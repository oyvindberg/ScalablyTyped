package typings.officeUiFabricReact.indexBundleMod

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.officeUiFabricReact.ithemerulesMod.IThemeRules
import typings.officeUiFabricReact.ithemeslotruleMod.IThemeSlotRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator")
@js.native
class ThemeGenerator ()
  extends typings.officeUiFabricReact.mod.ThemeGenerator
/* static members */
object ThemeGenerator {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Makes the rest of the code that's used for the load theme blob in the exported codepens of
    * both the older sharepoint-specific theme designer and the new theme designer. Takes in
    * theme rules and converts them to format fitting a list of palette colors and their values.
    * Resulting output looks like:
    * ```
    * const _theme = createTheme({
    *  palette: {
    *    themePrimary: '#0078d4',
    *    themeLighterAlt: '#f3f9fd',
    *    ...
    *  }});
    * ```
    * The first line is loadTheme instead of createTheme for the old sharepoint theme designer.
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator._makeRemainingCode")
  @js.native
  def _makeRemainingCode: js.Any = js.native
  @scala.inline
  def _makeRemainingCode_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_makeRemainingCode")(x.asInstanceOf[js.Any])
  
  /**
    * Sets the given slot's color to the appropriate color, shading it if necessary.
    * Then, iterates through all other rules (that are this rule's dependents) to update them accordingly.
    * @param isCustomization - If true, it's a user-provided color, which should be to that raw color.
    * If false, the rule it's inheriting from changed, so updated using asShade.
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator._setSlot")
  @js.native
  def _setSlot: js.Any = js.native
  @scala.inline
  def _setSlot_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_setSlot")(x.asInstanceOf[js.Any])
  
  /**
    * Gets code-formatted load theme blob that can be copy and pasted.
    * Only used for the old theme designer, where loadTheme usage is acceptable,
    * unlike in the new theme designer.
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.getThemeAsCode")
  @js.native
  def getThemeAsCode(slotRules: IThemeRules): js.Any = js.native
  
  /**
    * Gets code-formatted load theme blob, specifically for the new theme designer,
    * aka.ms/themedesigner. Shouldn't use loadTheme like the old theme designer since it's deprecated.
    * We want to use the theme object from createTheme and use the Customizations.applySettings API instead.
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.getThemeAsCodeWithCreateTheme")
  @js.native
  def getThemeAsCodeWithCreateTheme(slotRules: IThemeRules): js.Any = js.native
  
  /**
    * Gets the JSON-formatted blob that describes the theme, usable with the REST request endpoints:
    * ```
    * { [theme slot name as string] : [color as string],
    *  "tokenName": "#f00f00",
    *  "tokenName2": "#ba2ba2",
    *   ... }
    * ```
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.getThemeAsJson")
  @js.native
  def getThemeAsJson(slotRules: IThemeRules): js.Any = js.native
  
  /**
    * Gets the theme as a list of SASS variables that can be used in code
    * ```
    * $tokenName: "[theme:tokenName, default:#f00f00]";
    * $tokenName2: "[theme:tokenName2, default:#ba2ba2]";
    * ...
    * ```
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.getThemeAsSass")
  @js.native
  def getThemeAsSass(slotRules: IThemeRules): js.Any = js.native
  
  /**
    * Gets the theme formatted for PowerShell scripts
    * ```
    * @{
    * "tokenName" = "#f00f00";
    * "tokenName2" = "#ba2ba2";
    * ...
    * }
    * ```
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.getThemeForPowerShell")
  @js.native
  def getThemeForPowerShell(slotRules: IThemeRules): js.Any = js.native
  
  /**
    * Sets the color of each slot based on its rule. Slots that don't inherit must have a color already.
    * If this completes without error, then the theme is ready to use. (All slots will have a color.)
    * setSlot() can be called before this, but this must be called before getThemeAs*().
    * Does not override colors of rules where isCustomized is true (i.e. doesn't override existing customizations).
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.insureSlots")
  @js.native
  def insureSlots(slotRules: IThemeRules, isInverted: Boolean): Unit = js.native
  
  /**
    * Sets an IThemeSlotRule to the given color and cascades it to the rest of the theme, updating other IThemeSlotRules
    * in the theme that inherit from that color.
    * @param isInverted - whether it's a dark theme or not, which affects the algorithm used to generate shades
    * @param isCustomization - should be true only if it's a user action, and indicates overwriting the slot's
    * inheritance (if any)
    * @param overwriteCustomColor - A slot could have a generated color based on its inheritance rules (isCustomized
    * is false), or a custom color based on user input (isCustomized is true). This bool tells us whether to override
    * existing customized colors.
    */
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(rule: IThemeSlotRule, color: String): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(
    rule: IThemeSlotRule,
    color: String,
    isInverted: js.UndefOr[scala.Nothing],
    isCustomization: js.UndefOr[scala.Nothing],
    overwriteCustomColor: Boolean
  ): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(
    rule: IThemeSlotRule,
    color: String,
    isInverted: js.UndefOr[scala.Nothing],
    isCustomization: Boolean
  ): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(
    rule: IThemeSlotRule,
    color: String,
    isInverted: js.UndefOr[scala.Nothing],
    isCustomization: Boolean,
    overwriteCustomColor: Boolean
  ): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(rule: IThemeSlotRule, color: String, isInverted: Boolean): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(
    rule: IThemeSlotRule,
    color: String,
    isInverted: Boolean,
    isCustomization: js.UndefOr[scala.Nothing],
    overwriteCustomColor: Boolean
  ): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(rule: IThemeSlotRule, color: String, isInverted: Boolean, isCustomization: Boolean): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(
    rule: IThemeSlotRule,
    color: String,
    isInverted: Boolean,
    isCustomization: Boolean,
    overwriteCustomColor: Boolean
  ): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(rule: IThemeSlotRule, color: IColor): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(
    rule: IThemeSlotRule,
    color: IColor,
    isInverted: js.UndefOr[scala.Nothing],
    isCustomization: js.UndefOr[scala.Nothing],
    overwriteCustomColor: Boolean
  ): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(
    rule: IThemeSlotRule,
    color: IColor,
    isInverted: js.UndefOr[scala.Nothing],
    isCustomization: Boolean
  ): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(
    rule: IThemeSlotRule,
    color: IColor,
    isInverted: js.UndefOr[scala.Nothing],
    isCustomization: Boolean,
    overwriteCustomColor: Boolean
  ): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(rule: IThemeSlotRule, color: IColor, isInverted: Boolean): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(
    rule: IThemeSlotRule,
    color: IColor,
    isInverted: Boolean,
    isCustomization: js.UndefOr[scala.Nothing],
    overwriteCustomColor: Boolean
  ): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(rule: IThemeSlotRule, color: IColor, isInverted: Boolean, isCustomization: Boolean): Unit = js.native
  @JSImport("office-ui-fabric-react/lib/index.bundle", "ThemeGenerator.setSlot")
  @js.native
  def setSlot(
    rule: IThemeSlotRule,
    color: IColor,
    isInverted: Boolean,
    isCustomization: Boolean,
    overwriteCustomColor: Boolean
  ): Unit = js.native
}
