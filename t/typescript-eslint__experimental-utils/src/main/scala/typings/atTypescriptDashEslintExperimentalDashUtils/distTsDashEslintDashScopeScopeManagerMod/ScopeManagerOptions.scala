package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeScopeManagerMod

import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.module
import typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsStrings.script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeManagerOptions extends js.Object {
  var directive: js.UndefOr[Boolean] = js.undefined
  var ecmaVersion: js.UndefOr[Double] = js.undefined
  var ignoreEval: js.UndefOr[Boolean] = js.undefined
  var impliedStrict: js.UndefOr[Boolean] = js.undefined
  var nodejsScope: js.UndefOr[Boolean] = js.undefined
  var optimistic: js.UndefOr[Boolean] = js.undefined
  var sourceType: js.UndefOr[module | script] = js.undefined
}

object ScopeManagerOptions {
  @scala.inline
  def apply(
    directive: js.UndefOr[Boolean] = js.undefined,
    ecmaVersion: Int | Double = null,
    ignoreEval: js.UndefOr[Boolean] = js.undefined,
    impliedStrict: js.UndefOr[Boolean] = js.undefined,
    nodejsScope: js.UndefOr[Boolean] = js.undefined,
    optimistic: js.UndefOr[Boolean] = js.undefined,
    sourceType: module | script = null
  ): ScopeManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(directive)) __obj.updateDynamic("directive")(directive)
    if (ecmaVersion != null) __obj.updateDynamic("ecmaVersion")(ecmaVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEval)) __obj.updateDynamic("ignoreEval")(ignoreEval)
    if (!js.isUndefined(impliedStrict)) __obj.updateDynamic("impliedStrict")(impliedStrict)
    if (!js.isUndefined(nodejsScope)) __obj.updateDynamic("nodejsScope")(nodejsScope)
    if (!js.isUndefined(optimistic)) __obj.updateDynamic("optimistic")(optimistic)
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeManagerOptions]
  }
}

