package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commentMod extends Shortcut {
  
  @JSImport("antd/lib/comment", JSImport.Default)
  @js.native
  val default: FC[CommentProps] = js.native
  
  @js.native
  trait CommentProps extends StObject {
    
    /** List of action items rendered below the comment content */
    var actions: js.UndefOr[js.Array[ReactNode]] = js.native
    
    /** The element to display as the comment author. */
    var author: js.UndefOr[ReactNode] = js.native
    
    /** The element to display as the comment avatar - generally an antd Avatar */
    var avatar: js.UndefOr[ReactNode] = js.native
    
    /** Nested comments should be provided as children of the Comment */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** className of comment */
    var className: js.UndefOr[String] = js.native
    
    /** The main content of the comment */
    var content: ReactNode = js.native
    
    /** A datetime element containing the time to be displayed */
    var datetime: js.UndefOr[ReactNode] = js.native
    
    /** Comment prefix defaults to '.ant-comment' */
    var prefixCls: js.UndefOr[String] = js.native
    
    /** Additional style for the comment */
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CommentProps {
    
    @scala.inline
    def apply(): CommentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommentProps]
    }
    
    @scala.inline
    implicit class CommentPropsMutableBuilder[Self <: CommentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[ReactNode]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setActionsVarargs(value: ReactNode*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setAuthor(value: ReactNode): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setAvatar(value: ReactNode): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDatetime(value: ReactNode): Self = StObject.set(x, "datetime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatetimeUndefined: Self = StObject.set(x, "datetime", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[CommentProps]
  
  /* This means you don't have to write `default`, but can instead just say `commentMod.foo` */
  override def _to: FC[CommentProps] = default
}
