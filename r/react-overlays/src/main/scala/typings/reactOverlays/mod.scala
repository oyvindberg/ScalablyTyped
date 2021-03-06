package typings.reactOverlays

import org.scalablytyped.runtime.Instantiable1
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactOverlays.anon.Container
import typings.reactOverlays.anon.HandleContainerOverflow
import typings.reactOverlays.anon.PartialModalPropsRefAttri
import typings.reactOverlays.anon.WeakValidationMapModalPro
import typings.reactOverlays.dropdownMenuMod.DropdownMenuProps
import typings.reactOverlays.dropdownMenuMod.UseDropdownMenuOptions
import typings.reactOverlays.dropdownMenuMod.UseDropdownMenuValue
import typings.reactOverlays.dropdownMod.DropdownProps
import typings.reactOverlays.dropdownToggleMod.DropdownToggleProps
import typings.reactOverlays.dropdownToggleMod.UseDropdownToggleHelpers
import typings.reactOverlays.dropdownToggleMod.UseDropdownToggleProps
import typings.reactOverlays.modalManagerMod.default
import typings.reactOverlays.modalMod.ModalHandle
import typings.reactOverlays.modalMod.ModalProps
import typings.reactOverlays.overlayMod.OverlayProps
import typings.reactOverlays.portalMod.PortalProps
import typings.reactOverlays.useRootCloseMod.RootCloseOptions
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object Dropdown {
    
    /**
      * @displayName Dropdown
      */
    @JSImport("react-overlays/cjs", "Dropdown")
    @js.native
    def apply(hasDropAlignEndDefaultShowShowOnToggleItemSelectorFocusFirstItemOnShowChildren: DropdownProps): Element = js.native
    @JSImport("react-overlays/cjs", "Dropdown")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof DropdownMenu` */
    object Menu {
      
      /**
        * Also exported as `<Dropdown.Menu>` from `Dropdown`.
        *
        * @displayName DropdownMenu
        * @memberOf Dropdown
        */
      @JSImport("react-overlays/cjs", "Dropdown.Menu")
      @js.native
      def apply(hasChildrenOptions: DropdownMenuProps): Element = js.native
      @JSImport("react-overlays/cjs", "Dropdown.Menu")
      @js.native
      val ^ : js.Any = js.native
      
      object defaultProps {
        
        @JSImport("react-overlays/cjs", "Dropdown.Menu.defaultProps")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("react-overlays/cjs", "Dropdown.Menu.defaultProps.usePopper")
        @js.native
        def usePopper: Boolean = js.native
        @scala.inline
        def usePopper_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(x.asInstanceOf[js.Any])
      }
      
      @JSImport("react-overlays/cjs", "Dropdown.Menu.displayName")
      @js.native
      def displayName: String = js.native
      @scala.inline
      def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      object propTypes {
        
        @JSImport("react-overlays/cjs", "Dropdown.Menu.propTypes")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * Aligns the dropdown menu to the 'end' of it's placement position.
          * Generally this is provided by the parent `Dropdown` component,
          * but may also be specified as a prop directly.
          */
        @JSImport("react-overlays/cjs", "Dropdown.Menu.propTypes.alignEnd")
        @js.native
        def alignEnd: Requireable[Boolean] = js.native
        @scala.inline
        def alignEnd_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(x.asInstanceOf[js.Any])
        
        /**
          * A render prop that returns a Menu element. The `props`
          * argument should spread through to **a component that can accept a ref**.
          *
          * @type {Function ({
          *   show: boolean,
          *   alignEnd: boolean,
          *   close: (?SyntheticEvent) => void,
          *   placement: Placement,
          *   update: () => void,
          *   forceUpdate: () => void,
          *   props: {
          *     ref: (?HTMLElement) => void,
          *     style: { [string]: string | number },
          *     aria-labelledby: ?string
          *   },
          *   arrowProps: {
          *     ref: (?HTMLElement) => void,
          *     style: { [string]: string | number },
          *   },
          * }) => React.Element}
          */
        @JSImport("react-overlays/cjs", "Dropdown.Menu.propTypes.children")
        @js.native
        def children: Validator[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
        @scala.inline
        def children_=(x: Validator[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
        
        /**
          * Enables the Popper.js `flip` modifier, allowing the Dropdown to
          * automatically adjust it's placement in case of overlap with the viewport or toggle.
          * Refer to the [flip docs](https://popper.js.org/popper-documentation.html#modifiers..flip.enabled) for more info
          */
        @JSImport("react-overlays/cjs", "Dropdown.Menu.propTypes.flip")
        @js.native
        def flip: Requireable[Boolean] = js.native
        @scala.inline
        def flip_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flip")(x.asInstanceOf[js.Any])
        
        /**
          * A set of popper options and props passed directly to react-popper's Popper component.
          */
        @JSImport("react-overlays/cjs", "Dropdown.Menu.propTypes.popperConfig")
        @js.native
        def popperConfig: Requireable[js.Object] = js.native
        @scala.inline
        def popperConfig_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popperConfig")(x.asInstanceOf[js.Any])
        
        /**
          * Override the default event used by RootCloseWrapper.
          */
        @JSImport("react-overlays/cjs", "Dropdown.Menu.propTypes.rootCloseEvent")
        @js.native
        def rootCloseEvent: Requireable[String] = js.native
        @scala.inline
        def rootCloseEvent_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rootCloseEvent")(x.asInstanceOf[js.Any])
        
        /**
          * Controls the visible state of the menu, generally this is
          * provided by the parent `Dropdown` component,
          * but may also be specified as a prop directly.
          */
        @JSImport("react-overlays/cjs", "Dropdown.Menu.propTypes.show")
        @js.native
        def show: Requireable[Boolean] = js.native
        @scala.inline
        def show_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
        
        @JSImport("react-overlays/cjs", "Dropdown.Menu.propTypes.usePopper")
        @js.native
        def usePopper: Requireable[Boolean] = js.native
        @scala.inline
        def usePopper_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("usePopper")(x.asInstanceOf[js.Any])
      }
    }
    
    /* was `typeof DropdownToggle` */
    object Toggle {
      
      /**
        * Also exported as `<Dropdown.Toggle>` from `Dropdown`.
        *
        * @displayName DropdownToggle
        * @memberOf Dropdown
        */
      @JSImport("react-overlays/cjs", "Dropdown.Toggle")
      @js.native
      def apply(hasChildren: DropdownToggleProps): Element = js.native
      @JSImport("react-overlays/cjs", "Dropdown.Toggle")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-overlays/cjs", "Dropdown.Toggle.displayName")
      @js.native
      def displayName: String = js.native
      @scala.inline
      def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      object propTypes {
        
        @JSImport("react-overlays/cjs", "Dropdown.Toggle.propTypes")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * A render prop that returns a Toggle element. The `props`
          * argument should spread through to **a component that can accept a ref**. Use
          * the `onToggle` argument to toggle the menu open or closed
          *
          * @type {Function ({
          *   show: boolean,
          *   toggle: (show: boolean) => void,
          *   props: {
          *     ref: (?HTMLElement) => void,
          *     aria-haspopup: true
          *     aria-expanded: boolean
          *   },
          * }) => React.Element}
          */
        @JSImport("react-overlays/cjs", "Dropdown.Toggle.propTypes.children")
        @js.native
        def children: Validator[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
        @scala.inline
        def children_=(x: Validator[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      }
    }
    
    @JSImport("react-overlays/cjs", "Dropdown.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("react-overlays/cjs", "Dropdown.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Align the menu to the 'end' side of the placement side of the Dropdown toggle. The default placement is `top-start` or `bottom-start`.
        */
      @JSImport("react-overlays/cjs", "Dropdown.propTypes.alignEnd")
      @js.native
      def alignEnd: Requireable[Boolean] = js.native
      @scala.inline
      def alignEnd_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alignEnd")(x.asInstanceOf[js.Any])
      
      /**
        * A render prop that returns the root dropdown element. The `props`
        * argument should spread through to an element containing _both_ the
        * menu and toggle in order to handle keyboard events for focus management.
        *
        * @type {Function ({
        *   props: {
        *     onKeyDown: (SyntheticEvent) => void,
        *   },
        * }) => React.Element}
        */
      @JSImport("react-overlays/cjs", "Dropdown.propTypes.children")
      @js.native
      def children: Validator[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      @scala.inline
      def children_=(x: Validator[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /**
        * Sets the initial show position of the Dropdown.
        */
      @JSImport("react-overlays/cjs", "Dropdown.propTypes.defaultShow")
      @js.native
      def defaultShow: Requireable[Boolean] = js.native
      @scala.inline
      def defaultShow_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultShow")(x.asInstanceOf[js.Any])
      
      /**
        * Determines the direction and location of the Menu in relation to it's Toggle.
        */
      @JSImport("react-overlays/cjs", "Dropdown.propTypes.drop")
      @js.native
      def drop: Requireable[String] = js.native
      @scala.inline
      def drop_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drop")(x.asInstanceOf[js.Any])
      
      /**
        * Controls the focus behavior for when the Dropdown is opened. Set to
        * `true` to always focus the first menu item, `keyboard` to focus only when
        * navigating via the keyboard, or `false` to disable completely
        *
        * The Default behavior is `false` **unless** the Menu has a `role="menu"`
        * where it will default to `keyboard` to match the recommended [ARIA Authoring practices](https://www.w3.org/TR/wai-aria-practices-1.1/#menubutton).
        */
      @JSImport("react-overlays/cjs", "Dropdown.propTypes.focusFirstItemOnShow")
      @js.native
      def focusFirstItemOnShow: Requireable[String | Boolean] = js.native
      @scala.inline
      def focusFirstItemOnShow_=(x: Requireable[String | Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusFirstItemOnShow")(x.asInstanceOf[js.Any])
      
      /**
        * A css slector string that will return __focusable__ menu items.
        * Selectors should be relative to the menu component:
        * e.g. ` > li:not('.disabled')`
        */
      @JSImport("react-overlays/cjs", "Dropdown.propTypes.itemSelector")
      @js.native
      def itemSelector: Requireable[String] = js.native
      @scala.inline
      def itemSelector_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemSelector")(x.asInstanceOf[js.Any])
      
      /**
        * A callback fired when the Dropdown wishes to change visibility. Called with the requested
        * `show` value, the DOM event, and the source that fired it: `'click'`,`'keydown'`,`'rootClose'`, or `'select'`.
        *
        * ```ts static
        * function(
        *   isOpen: boolean,
        *   event: SyntheticEvent,
        * ): void
        * ```
        *
        * @controllable show
        */
      @JSImport("react-overlays/cjs", "Dropdown.propTypes.onToggle")
      @js.native
      def onToggle: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      @scala.inline
      def onToggle_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onToggle")(x.asInstanceOf[js.Any])
      
      /**
        * Whether or not the Dropdown is visible.
        *
        * @controllable onToggle
        */
      @JSImport("react-overlays/cjs", "Dropdown.propTypes.show")
      @js.native
      def show: Requireable[Boolean] = js.native
      @scala.inline
      def show_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("show")(x.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined react.react.ForwardRefExoticComponent<react-overlays.react-overlays/cjs/Modal.ModalProps & react.react.RefAttributes<react-overlays.react-overlays/cjs/Modal.ModalHandle>> & {  Manager :new (hasHideSiblingNodesHandleContainerOverflow : {  hideSiblingNodes :boolean | undefined,   handleContainerOverflow :boolean | undefined} | undefined): react-overlays.react-overlays/cjs/ModalManager.default} */
  object Modal {
    
    /**
      * **NOTE**: Exotic components are not callable.
      */
    @JSImport("react-overlays/cjs", "Modal")
    @js.native
    def apply(props: ModalProps with RefAttributes[ModalHandle]): ReactElement | Null = js.native
    @JSImport("react-overlays/cjs", "Modal")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-overlays/cjs", "Modal.Manager")
    @js.native
    class Manager () extends default {
      def this(hasHideSiblingNodesHandleContainerOverflow: HandleContainerOverflow) = this()
    }
    @JSImport("react-overlays/cjs", "Modal.Manager")
    @js.native
    def Manager: Instantiable1[
        /* hasHideSiblingNodesHandleContainerOverflow */ js.UndefOr[HandleContainerOverflow], 
        default
      ] = js.native
    @scala.inline
    def Manager_=(
      x: Instantiable1[
          /* hasHideSiblingNodesHandleContainerOverflow */ js.UndefOr[HandleContainerOverflow], 
          default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Manager")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/cjs", "Modal.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialModalPropsRefAttri] = js.native
    @scala.inline
    def defaultProps_=(x: js.UndefOr[PartialModalPropsRefAttri]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/cjs", "Modal.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    @scala.inline
    def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/cjs", "Modal.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapModalPro] = js.native
    @scala.inline
    def propTypes_=(x: js.UndefOr[WeakValidationMapModalPro]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/cjs", "Modal.$$typeof")
    @js.native
    val typeof: js.Symbol = js.native
  }
  
  /**
    * Built on top of `Popper.js`, the overlay component is
    * great for custom tooltip overlays.
    */
  @JSImport("react-overlays/cjs", "Overlay")
  @js.native
  val Overlay: ForwardRefExoticComponent[OverlayProps with RefAttributes[HTMLElement]] = js.native
  
  /**
    * @public
    */
  object Portal {
    
    @JSImport("react-overlays/cjs", "Portal")
    @js.native
    def apply(hasContainerChildrenOnRendered: PortalProps): Element | Null = js.native
    @JSImport("react-overlays/cjs", "Portal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-overlays/cjs", "Portal.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/cjs", "Portal.propTypes")
    @js.native
    def propTypes: Container = js.native
    @scala.inline
    def propTypes_=(x: Container): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-overlays/cjs", "useDropdownMenu")
  @js.native
  def useDropdownMenu(): UseDropdownMenuValue = js.native
  @JSImport("react-overlays/cjs", "useDropdownMenu")
  @js.native
  def useDropdownMenu(options: UseDropdownMenuOptions): UseDropdownMenuValue = js.native
  
  @JSImport("react-overlays/cjs", "useDropdownToggle")
  @js.native
  def useDropdownToggle(): js.Tuple2[UseDropdownToggleProps, UseDropdownToggleHelpers] = js.native
  
  @JSImport("react-overlays/cjs", "useRootClose")
  @js.native
  def useRootClose(ref: js.UndefOr[scala.Nothing], onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  @JSImport("react-overlays/cjs", "useRootClose")
  @js.native
  def useRootClose(
    ref: js.UndefOr[scala.Nothing],
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
  @JSImport("react-overlays/cjs", "useRootClose")
  @js.native
  def useRootClose(ref: Null, onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  @JSImport("react-overlays/cjs", "useRootClose")
  @js.native
  def useRootClose(
    ref: Null,
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
  /**
    * The `useRootClose` hook registers your callback on the document
    * when rendered. Powers the `<Overlay/>` component. This is used achieve modal
    * style behavior where your callback is triggered when the user tries to
    * interact with the rest of the document or hits the `esc` key.
    *
    * @param {Ref<HTMLElement>| HTMLElement} ref  The element boundary
    * @param {function} onRootClose
    * @param {object=}  options
    * @param {boolean=} options.disabled
    * @param {string=}  options.clickTrigger The DOM event name (click, mousedown, etc) to attach listeners on
    */
  @JSImport("react-overlays/cjs", "useRootClose")
  @js.native
  def useRootClose(ref: RefObject[typings.std.Element], onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  @JSImport("react-overlays/cjs", "useRootClose")
  @js.native
  def useRootClose(
    ref: RefObject[typings.std.Element],
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
  @JSImport("react-overlays/cjs", "useRootClose")
  @js.native
  def useRootClose(ref: typings.std.Element, onRootClose: js.Function1[/* e */ Event, Unit]): Unit = js.native
  @JSImport("react-overlays/cjs", "useRootClose")
  @js.native
  def useRootClose(
    ref: typings.std.Element,
    onRootClose: js.Function1[/* e */ Event, Unit],
    hasDisabledClickTrigger: RootCloseOptions
  ): Unit = js.native
}
