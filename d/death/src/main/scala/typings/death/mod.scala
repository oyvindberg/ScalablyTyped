package typings.death

import typings.death.anon.Debug
import typings.death.anon.SIGINT
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Invokes a callback when a SIGINT, SIGTERM, or SIGQUIT is detected
    * on the current node process.
    * @param callback The callback to invoke
    * @returns A function to unsubscribe and prevent the callback from being invoked
    * @example
    *  ON_DEATH((signal) => {
    *    console.log('Oh no!');
    *  });
    * @example
    *  const OFF_DEATH = ON_DEATH((signal) => {
    *    console.log('Oh no!');
    *  });
    *  // later
    *  OFF_DEATH();
    */
  @JSImport("death", JSImport.Namespace)
  @js.native
  def apply(callback: js.Function1[/* arg */ Signal, Unit]): js.Function0[Unit] = js.native
  /**
    * Invokes a callback when a SIGINT, SIGTERM, or SIGQUIT is detected
    * on the current node process. Configurable by the provided options.
    *
    * @param options
    * @returns A function to subscribe to the configured death detection
    * @example
    *  ON_DEATH({
    *    debug: true,
    *    uncaughtException: true,
    *  })((signal) => {
    *    console.log('Oh no!');
    *  });
    * @example
    *  const OFF_DEATH = ON_DEATH({
    *    debug: true,
    *    uncaughtException: true,
    *  })((signal) => {
    *    console.log('Oh no!');
    *  });
    *  // later
    *  OFF_DEATH();
    */
  @JSImport("death", JSImport.Namespace)
  @js.native
  def apply(options: Debug): js.Function1[
    /* callback */ js.Function2[/* signalOrErr */ Signal | Error, /* origin */ js.UndefOr[String], Unit], 
    js.Function0[Unit]
  ] = js.native
  /**
    * Invokes a callback when a SIGINT, SIGTERM, or SIGQUIT is detected
    * on the current node process. Configurable by the provided options.
    *
    * @param options
    * @returns A function to subscribe to the configured death detection
    * @example
    *  ON_DEATH({
    *    debug: true,
    *  })((signal) => {
    *    console.log('Oh no!');
    *  });
    * @example
    *  const OFF_DEATH = ON_DEATH({
    *    debug: true,
    *  })((signal) => {
    *    console.log('Oh no!');
    *  });
    *  // later
    *  OFF_DEATH();
    */
  @JSImport("death", JSImport.Namespace)
  @js.native
  def apply(options: SIGINT): js.Function1[/* callback */ js.Function1[/* signal */ Signal, Unit], js.Function0[Unit]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.death.deathStrings.SIGINT
    - typings.death.deathStrings.SIGTERM
    - typings.death.deathStrings.SIGQUIT
  */
  trait Signal extends StObject
  object Signal {
    
    @scala.inline
    def SIGINT: typings.death.deathStrings.SIGINT = "SIGINT".asInstanceOf[typings.death.deathStrings.SIGINT]
    
    @scala.inline
    def SIGQUIT: typings.death.deathStrings.SIGQUIT = "SIGQUIT".asInstanceOf[typings.death.deathStrings.SIGQUIT]
    
    @scala.inline
    def SIGTERM: typings.death.deathStrings.SIGTERM = "SIGTERM".asInstanceOf[typings.death.deathStrings.SIGTERM]
  }
}
