package typings.electron.mod

import typings.electron.Electron.FromPartitionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof Session` */
@JSImport("electron", "session")
@js.native
class session ()
  extends typings.electron.Electron.Session_
/* was `typeof Session` */
object session {
  
  @JSImport("electron", "session")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A `Session` object, the default session object of the app.
    */
  /* static member */
  @JSImport("electron", "session.defaultSession")
  @js.native
  def defaultSession: typings.electron.Electron.Session_ = js.native
  @scala.inline
  def defaultSession_=(x: typings.electron.Electron.Session_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSession")(x.asInstanceOf[js.Any])
  
  // Docs: https://electronjs.org/docs/api/session
  /**
    * A session instance from `partition` string. When there is an existing `Session`
    * with the same `partition`, it will be returned; otherwise a new `Session`
    * instance will be created with `options`.
    *
    * If `partition` starts with `persist:`, the page will use a persistent session
    * available to all pages in the app with the same `partition`. if there is no
    * `persist:` prefix, the page will use an in-memory session. If the `partition` is
    * empty then default session of the app will be returned.
    *
    * To create a `Session` with `options`, you have to ensure the `Session` with the
    * `partition` has never been used before. There is no way to change the `options`
    * of an existing `Session` object.
    */
  /* static member */
  @JSImport("electron", "session.fromPartition")
  @js.native
  def fromPartition(partition: String): typings.electron.Electron.Session_ = js.native
  @JSImport("electron", "session.fromPartition")
  @js.native
  def fromPartition(partition: String, options: FromPartitionOptions): typings.electron.Electron.Session_ = js.native
}
