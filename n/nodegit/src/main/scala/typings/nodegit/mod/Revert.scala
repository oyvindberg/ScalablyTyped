package typings.nodegit.mod

import typings.nodegit.revertMod.RevertOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Revert")
@js.native
class Revert ()
  extends typings.nodegit.revertMod.Revert
/* static members */
object Revert {
  
  /**
    * Reverts the given commit against the given "our" commit, producing an index that reflects the result of the revert.
    */
  @JSImport("nodegit", "Revert.commit")
  @js.native
  def commit(
    repo: typings.nodegit.repositoryMod.Repository,
    revertCommit: typings.nodegit.commitMod.Commit,
    ourCommit: typings.nodegit.commitMod.Commit,
    mainline: Double
  ): js.Promise[Index] = js.native
  @JSImport("nodegit", "Revert.commit")
  @js.native
  def commit(
    repo: typings.nodegit.repositoryMod.Repository,
    revertCommit: typings.nodegit.commitMod.Commit,
    ourCommit: typings.nodegit.commitMod.Commit,
    mainline: Double,
    mergeOptions: typings.nodegit.mergeOptionsMod.MergeOptions
  ): js.Promise[Index] = js.native
  
  @JSImport("nodegit", "Revert.revert")
  @js.native
  def revert(repo: typings.nodegit.repositoryMod.Repository, commit: typings.nodegit.commitMod.Commit): js.Promise[Double] = js.native
  @JSImport("nodegit", "Revert.revert")
  @js.native
  def revert(
    repo: typings.nodegit.repositoryMod.Repository,
    commit: typings.nodegit.commitMod.Commit,
    givenOpts: RevertOptions
  ): js.Promise[Double] = js.native
}
