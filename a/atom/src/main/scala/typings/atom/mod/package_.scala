package typings.atom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CommandRegistryListener[TargetType /* <: typings.std.EventTarget */] = typings.atom.anon.Description[TargetType] | (js.Function1[
    /* event */ typings.atom.mod.CommandEvent[TargetType], 
    scala.Unit | js.Promise[scala.Unit]
  ])
  
  type FilesystemChange = (typings.atom.mod.FilesystemChangeBasic[
    typings.atom.atomStrings.created | typings.atom.atomStrings.modified | typings.atom.atomStrings.deleted
  ]) | typings.atom.mod.FilesystemChangeRename
  
  type FilesystemChangeEvent = js.Array[typings.atom.mod.FilesystemChange]
  
  type FocusableHTMLElement = typings.std.HTMLElement | java.lang.String | js.Function0[typings.std.HTMLElement]
  
  type PointCompatible = typings.atom.mod.PointLike | (js.Tuple2[scala.Double, scala.Double])
  
  type RangeCompatible = typings.atom.mod.RangeLike | (js.Tuple2[
    typings.atom.mod.PointLike | (js.Tuple2[scala.Double, scala.Double]), 
    typings.atom.mod.PointLike | (js.Tuple2[scala.Double, scala.Double])
  ])
  
  type TestRunner = js.Function1[/* params */ typings.atom.mod.TestRunnerParams, js.Promise[scala.Double]]
  
  @scala.inline
  def watchPath(
    rootPath: java.lang.String,
    options: js.Object,
    eventCallback: js.Function1[/* events */ typings.atom.mod.FilesystemChangeEvent, scala.Unit]
  ): js.Promise[typings.atom.mod.PathWatcher] = (typings.atom.mod.^.asInstanceOf[js.Dynamic].applyDynamic("watchPath")(rootPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], eventCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.atom.mod.PathWatcher]]
}
