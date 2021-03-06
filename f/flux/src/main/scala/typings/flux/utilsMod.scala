package typings.flux

import typings.flux.fluxContainerMod.Component
import typings.flux.fluxContainerMod.RealOptions
import typings.flux.fluxMixinLegacyMod.Options
import typings.flux.fluxStoreMod.^
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  object Container {
    
    @JSImport("flux/utils", "Container.create")
    @js.native
    def create[TProps](base: Component[TProps, _, _]): Component[TProps, _, _] = js.native
    @JSImport("flux/utils", "Container.create")
    @js.native
    def create[TProps](base: Component[TProps, _, _], options: RealOptions): Component[TProps, _, _] = js.native
    
    @JSImport("flux/utils", "Container.createFunctional")
    @js.native
    def createFunctional[TProps, TState](
      viewFn: js.Function1[/* props */ TState, ReactElement],
      getStores: js.Function2[
          /* maybeProps */ js.UndefOr[TProps], 
          /* maybeContext */ js.UndefOr[js.Any], 
          js.Array[^[_]]
        ],
      calculateState: js.Function3[
          /* prevState */ js.UndefOr[TState], 
          /* maybeProps */ js.UndefOr[TProps], 
          /* maybeContext */ js.UndefOr[js.Any], 
          TState
        ]
    ): Component[TProps, TState, _] = js.native
    @JSImport("flux/utils", "Container.createFunctional")
    @js.native
    def createFunctional[TProps, TState](
      viewFn: js.Function1[/* props */ TState, ReactElement],
      getStores: js.Function2[
          /* maybeProps */ js.UndefOr[TProps], 
          /* maybeContext */ js.UndefOr[js.Any], 
          js.Array[^[_]]
        ],
      calculateState: js.Function3[
          /* prevState */ js.UndefOr[TState], 
          /* maybeProps */ js.UndefOr[TProps], 
          /* maybeContext */ js.UndefOr[js.Any], 
          TState
        ],
      options: RealOptions
    ): Component[TProps, TState, _] = js.native
    
    @JSImport("flux/utils", "Container.create")
    @js.native
    def create_TPropsTState[TProps, TState](base: Component[TProps, TState, _]): Component[TProps, TState, _] = js.native
    @JSImport("flux/utils", "Container.create")
    @js.native
    def create_TPropsTState[TProps, TState](base: Component[TProps, TState, _], options: RealOptions): Component[TProps, TState, _] = js.native
    @JSImport("flux/utils", "Container.create")
    @js.native
    def create_TPropsTStateTContext[TProps, TState, TContext](base: Component[TProps, TState, TContext]): Component[TProps, TState, TContext] = js.native
    @JSImport("flux/utils", "Container.create")
    @js.native
    def create_TPropsTStateTContext[TProps, TState, TContext](base: Component[TProps, TState, TContext], options: RealOptions): Component[TProps, TState, TContext] = js.native
    @JSImport("flux/utils", "Container.create")
    @js.native
    def create_TPropsTStateTContextTStatic_Intersection[TProps, TState, TContext, TStatic](base: (Component[TProps, TState, TContext]) with TStatic): (Component[TProps, TState, TContext]) with TStatic = js.native
    @JSImport("flux/utils", "Container.create")
    @js.native
    def create_TPropsTStateTContextTStatic_Intersection[TProps, TState, TContext, TStatic](base: (Component[TProps, TState, TContext]) with TStatic, options: RealOptions): (Component[TProps, TState, TContext]) with TStatic = js.native
  }
  
  object Mixin {
    
    /**
      * `FluxContainer` should be preferred over this mixin, but it requires using
      * react with classes. So this mixin is provided where it is not yet possible
      * to convert a container to be a class.
      *
      * This mixin should be used for React components that have state based purely
      * on stores. `this.props` will not be available inside of `calculateState()`.
      *
      * This mixin will only `setState` not replace it, so you should always return
      * every key in your state unless you know what you are doing.
      *
      * On the second calculateState when prevState is not null, the state will be
      * updated to contain the previous foo AND the bar that was just returned. Only
      * returning bar will not delete foo.
      */
    @JSImport("flux/utils", "Mixin")
    @js.native
    def apply(stores: js.Array[^[_]]): js.Any = js.native
    @JSImport("flux/utils", "Mixin")
    @js.native
    def apply(stores: js.Array[^[_]], options: Options): js.Any = js.native
  }
  
  /**
    * This is the basic building block of a Flux application. All of your stores
    * should extend this class.
    */
  @JSImport("flux/utils", "ReduceStore")
  @js.native
  abstract class ReduceStore[TState, TPayload] ()
    extends typings.flux.fluxReduceStoreMod.^[TState, TPayload]
  
  /**
    * This class represents the most basic functionality for a FluxStore. Do not
    * extend this store directly; instead extend FluxReduceStore when creating a
    * new store.
    */
  @JSImport("flux/utils", "Store")
  @js.native
  abstract class Store[TPayload] protected () extends ^[TPayload] {
    /**
      * Constructs and registers an instance of this store with the given dispatcher.
      */
    def this(dispatcher: typings.flux.dispatcherMod.^[TPayload]) = this()
  }
}
