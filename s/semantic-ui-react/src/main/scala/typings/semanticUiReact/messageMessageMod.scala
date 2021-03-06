package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ElementType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactNodeArray
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.genericMod.SemanticCOLORS
import typings.semanticUiReact.genericMod.SemanticShorthandCollection
import typings.semanticUiReact.genericMod.SemanticShorthandContent
import typings.semanticUiReact.genericMod.SemanticShorthandItem
import typings.semanticUiReact.messageContentMod.MessageContentProps
import typings.semanticUiReact.messageHeaderMod.MessageHeaderProps
import typings.semanticUiReact.messageItemMod.MessageItemProps
import typings.semanticUiReact.messageListMod.MessageListProps
import typings.semanticUiReact.semanticUiReactStrings.bottom
import typings.semanticUiReact.semanticUiReactStrings.top
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMessageMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/Message", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[MessageProps, ComponentState, js.Any] {
    def this(props: MessageProps) = this()
    def this(props: MessageProps, context: js.Any) = this()
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Message/Message", JSImport.Default)
  @js.native
  val default: MessageComponent = js.native
  
  @js.native
  trait MessageComponent extends ComponentClass[MessageProps, ComponentState] {
    
    var Content: StatelessComponent[MessageContentProps] = js.native
    
    var Header: StatelessComponent[MessageHeaderProps] = js.native
    
    var Item: StatelessComponent[MessageItemProps] = js.native
    
    var List: StatelessComponent[MessageListProps] = js.native
  }
  
  @js.native
  trait MessageProps
    extends StrictMessageProps
       with /* key */ StringDictionary[js.Any]
  object MessageProps {
    
    @scala.inline
    def apply(): MessageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageProps]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.semanticUiReact.semanticUiReactStrings.mini
    - typings.semanticUiReact.semanticUiReactStrings.tiny
    - typings.semanticUiReact.semanticUiReactStrings.small
    - typings.semanticUiReact.semanticUiReactStrings.large
    - typings.semanticUiReact.semanticUiReactStrings.big
    - typings.semanticUiReact.semanticUiReactStrings.huge
    - typings.semanticUiReact.semanticUiReactStrings.massive
  */
  trait MessageSizeProp extends StObject
  object MessageSizeProp {
    
    @scala.inline
    def big: typings.semanticUiReact.semanticUiReactStrings.big = "big".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.big]
    
    @scala.inline
    def huge: typings.semanticUiReact.semanticUiReactStrings.huge = "huge".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.huge]
    
    @scala.inline
    def large: typings.semanticUiReact.semanticUiReactStrings.large = "large".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.large]
    
    @scala.inline
    def massive: typings.semanticUiReact.semanticUiReactStrings.massive = "massive".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.massive]
    
    @scala.inline
    def mini: typings.semanticUiReact.semanticUiReactStrings.mini = "mini".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.mini]
    
    @scala.inline
    def small: typings.semanticUiReact.semanticUiReactStrings.small = "small".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.small]
    
    @scala.inline
    def tiny: typings.semanticUiReact.semanticUiReactStrings.tiny = "tiny".asInstanceOf[typings.semanticUiReact.semanticUiReactStrings.tiny]
  }
  
  @js.native
  trait StrictMessageProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** A message can be formatted to attach itself to other content. */
    var attached: js.UndefOr[Boolean | bottom | top] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Additional classes. */
    var className: js.UndefOr[String] = js.native
    
    /** A message can be formatted to be different colors. */
    var color: js.UndefOr[SemanticCOLORS] = js.native
    
    /** A message can only take up the width of its content. */
    var compact: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for primary content. */
    var content: js.UndefOr[SemanticShorthandContent] = js.native
    
    /** A message may be formatted to display a negative message. Same as `negative`. */
    var error: js.UndefOr[Boolean] = js.native
    
    /** A message can float above content that it is related to. */
    var floating: js.UndefOr[Boolean] = js.native
    
    /** Shorthand for MessageHeader. */
    var header: js.UndefOr[SemanticShorthandItem[MessageHeaderProps]] = js.native
    
    /** A message can be hidden. */
    var hidden: js.UndefOr[Boolean] = js.native
    
    /** Add an icon by icon name or pass an <Icon /.> */
    var icon: js.UndefOr[js.Any | Boolean] = js.native
    
    /** A message may be formatted to display information. */
    var info: js.UndefOr[Boolean] = js.native
    
    /** Array shorthand items for the MessageList. Mutually exclusive with children. */
    var list: js.UndefOr[SemanticShorthandCollection[MessageItemProps]] = js.native
    
    /** A message may be formatted to display a negative message. Same as `error`. */
    var negative: js.UndefOr[Boolean] = js.native
    
    /**
      * A message that the user can choose to hide.
      * Called when the user clicks the "x" icon. This also adds the "x" icon.
      *
      * @param {SyntheticEvent} event - React's original SyntheticEvent.
      * @param {object} data - All props.
      */
    var onDismiss: js.UndefOr[
        js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ MessageProps, Unit]
      ] = js.native
    
    /** A message may be formatted to display a positive message.  Same as `success`. */
    var positive: js.UndefOr[Boolean] = js.native
    
    /** A message can have different sizes. */
    var size: js.UndefOr[MessageSizeProp] = js.native
    
    /** A message may be formatted to display a positive message.  Same as `positive`. */
    var success: js.UndefOr[Boolean] = js.native
    
    /** A message can be set to visible to force itself to be shown. */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** A message may be formatted to display warning messages. */
    var warning: js.UndefOr[Boolean] = js.native
  }
  object StrictMessageProps {
    
    @scala.inline
    def apply(): StrictMessageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictMessageProps]
    }
    
    @scala.inline
    implicit class StrictMessagePropsMutableBuilder[Self <: StrictMessageProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAttached(value: Boolean | bottom | top): Self = StObject.set(x, "attached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachedUndefined: Self = StObject.set(x, "attached", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColor(value: SemanticCOLORS): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
      
      @scala.inline
      def setContent(value: SemanticShorthandContent): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
      
      @scala.inline
      def setHeader(value: SemanticShorthandItem[MessageHeaderProps]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFunction3(
        value: (/* component */ ElementType[MessageHeaderProps], MessageHeaderProps, /* children */ js.UndefOr[ReactNode | ReactNodeArray]) => ReactElement | Null
      ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setIcon(value: js.Any | Boolean): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setList(value: SemanticShorthandCollection[MessageItemProps]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setListVarargs(value: SemanticShorthandItem[MessageItemProps]*): Self = StObject.set(x, "list", js.Array(value :_*))
      
      @scala.inline
      def setNegative(value: Boolean): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ MessageProps) => Unit): Self = StObject.set(x, "onDismiss", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setPositive(value: Boolean): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
      
      @scala.inline
      def setSize(value: MessageSizeProp): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  type _To = MessageComponent
  
  /* This means you don't have to write `default`, but can instead just say `messageMessageMod.foo` */
  override def _to: MessageComponent = default
}
