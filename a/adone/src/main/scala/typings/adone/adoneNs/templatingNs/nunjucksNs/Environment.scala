package typings.adone.adoneNs.templatingNs.nunjucksNs

import typings.adone.Anon_Autoescape
import typings.adone.adoneNs.templatingNs.nunjucksNs.INs.EnvironmentOptions
import typings.adone.adoneNs.templatingNs.nunjucksNs.INs.Extension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.templating.nunjucks.Environment")
@js.native
class Environment () extends js.Object {
  def this(loader: js.Array[typings.adone.adoneNs.templatingNs.nunjucksNs.INs.Loader]) = this()
  def this(loader: typings.adone.adoneNs.templatingNs.nunjucksNs.INs.Loader) = this()
  def this(
    loader: js.Array[typings.adone.adoneNs.templatingNs.nunjucksNs.INs.Loader],
    opts: EnvironmentOptions
  ) = this()
  def this(loader: Null, opts: EnvironmentOptions) = this()
  def this(loader: typings.adone.adoneNs.templatingNs.nunjucksNs.INs.Loader, opts: EnvironmentOptions) = this()
  var options: Anon_Autoescape = js.native
  def addExtension(name: String, ext: Extension): Unit = js.native
  def addFilter(name: String, func: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def addFilter(name: String, func: js.Function1[/* repeated */ js.Any, _], async: Boolean): Unit = js.native
  def addGlobal(name: String, value: js.Any): this.type = js.native
  def express(app: js.Object): Unit = js.native
  def getExtension(name: String): Extension = js.native
  def getFilter(name: String): js.Function1[/* repeated */ js.Any, _] = js.native
  def getTemplate(name: String): Template = js.native
  def getTemplate(name: String, eagerCompile: Boolean): Template = js.native
  def getTemplate(
    name: String,
    eagerCompile: Boolean,
    callback: js.Function2[/* err */ js.Any, /* templ */ Template, Template]
  ): Unit = js.native
  @JSName("getTemplate")
  def getTemplate_Unit(name: String): Unit = js.native
  @JSName("getTemplate")
  def getTemplate_Unit(name: String, eagerCompile: Boolean): Unit = js.native
  def hasExtension(name: String): Boolean = js.native
  def removeExtension(name: String): Unit = js.native
  def render(name: String): String = js.native
  def render(name: String, context: js.Object): String = js.native
  def render(name: String, context: js.Object, callback: js.Function2[/* err */ js.Any, /* res */ String, _]): Unit = js.native
  def renderString(name: String): String = js.native
  def renderString(name: String, context: js.Object): String = js.native
  def renderString(name: String, context: js.Object, callback: js.Function2[/* err */ js.Any, /* res */ String, _]): Unit = js.native
  @JSName("renderString")
  def renderString_Unit(name: String): Unit = js.native
  @JSName("renderString")
  def renderString_Unit(name: String, context: js.Object): Unit = js.native
  @JSName("render")
  def render_Unit(name: String): Unit = js.native
  @JSName("render")
  def render_Unit(name: String, context: js.Object): Unit = js.native
}

