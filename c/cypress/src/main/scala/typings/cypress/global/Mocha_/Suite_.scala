package typings.cypress.global.Mocha_

import typings.cypress.Mocha.IContext
import typings.cypress.Mocha.ISuite
import typings.cypress.Mocha.Suite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Suite "post-require" event
// #region Suite untyped events
// #endregion Suite "require" event
// #region Suite "post-require" event
// #endregion Suite "pre-require" event
// #region Suite "require" event
// #endregion Suite "run" event
// #region Suite "pre-require" event
// #endregion Suite "test" event
// #region Suite "run" event
// #endregion Suite "suite" event
// #region Suite "test" event
// #endregion Suite "afterEach" event
// #region Suite "suite" event
// #endregion Suite "beforeEach" event
// #region Suite "afterEach" event
// #endregion Suite "afterAll" event
// #region Suite "beforeEach" event
// #endregion Suite "beforeAll" event
// #region Suite "afterAll" event
// #region Suite "beforeAll" event
// #endregion Runner untyped events
/**
  * Initialize a new `Suite` with the given `title` and `ctx`.
  *
  * @see https://mochajs.org/api/Mocha.Suite.html
  */
@JSGlobal("Mocha.Suite")
@js.native
class Suite_ protected () extends Suite {
  def this(title: String) = this()
  def this(title: String, parentContext: typings.cypress.Mocha.Context) = this()
  def this(title: String, parentContext: IContext) = this()
}

/* static members */
@JSGlobal("Mocha.Suite")
@js.native
object Suite_ extends js.Object {
  /** @deprecated Use the overload that accepts `Mocha.Suite` instead. */
  def create(parent: ISuite, title: String): Suite = js.native
  /**
    * Create a new `Suite` with the given `title` and parent `Suite`. When a suite
    * with the same title is already present, that suite is returned to provide
    * nicer reporter and more flexible meta-testing.
    *
    * @see https://mochajs.org/api/mocha#.exports.create
    */
  def create(parent: Suite, title: String): Suite = js.native
}

