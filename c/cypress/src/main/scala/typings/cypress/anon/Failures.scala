package typings.cypress.anon

import typings.cypress.cypressMod.dateTimeISO
import typings.cypress.cypressMod.ms
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failures extends js.Object {
  var failures: Double
  var passes: Double
  var pending: Double
  var skipped: Double
  var suites: Double
  var tests: Double
  var wallClockDuration: ms
  var wallClockEndedAt: dateTimeISO
  var wallClockStartedAt: dateTimeISO
}

object Failures {
  @scala.inline
  def apply(
    failures: Double,
    passes: Double,
    pending: Double,
    skipped: Double,
    suites: Double,
    tests: Double,
    wallClockDuration: ms,
    wallClockEndedAt: dateTimeISO,
    wallClockStartedAt: dateTimeISO
  ): Failures = {
    val __obj = js.Dynamic.literal(failures = failures.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], skipped = skipped.asInstanceOf[js.Any], suites = suites.asInstanceOf[js.Any], tests = tests.asInstanceOf[js.Any], wallClockDuration = wallClockDuration.asInstanceOf[js.Any], wallClockEndedAt = wallClockEndedAt.asInstanceOf[js.Any], wallClockStartedAt = wallClockStartedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failures]
  }
}

