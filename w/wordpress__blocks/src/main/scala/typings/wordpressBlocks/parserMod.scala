package typings.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ReactChild
import typings.react.mod.global.JSX.Element
import typings.std.Record
import typings.wordpressBlocks.anon.Attributetypeboolean
import typings.wordpressBlocks.mod.Block
import typings.wordpressBlocks.mod.BlockInstance
import typings.wordpressBlocks.parserMod.Schema.Attribute
import typings.wordpressBlocks.parserMod.Schema.Children
import typings.wordpressBlocks.parserMod.Schema.HTML
import typings.wordpressBlocks.parserMod.Schema.Node
import typings.wordpressBlocks.parserMod.Schema.Query
import typings.wordpressBlocks.parserMod.Schema.Tag
import typings.wordpressBlocks.parserMod.Schema.Text
import typings.wordpressBlocks.wordpressBlocksStrings.attribute
import typings.wordpressBlocks.wordpressBlocksStrings.boolean
import typings.wordpressBlocks.wordpressBlocksStrings.children
import typings.wordpressBlocks.wordpressBlocksStrings.html
import typings.wordpressBlocks.wordpressBlocksStrings.node
import typings.wordpressBlocks.wordpressBlocksStrings.query_
import typings.wordpressBlocks.wordpressBlocksStrings.string
import typings.wordpressBlocks.wordpressBlocksStrings.tag
import typings.wordpressBlocks.wordpressBlocksStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("@wordpress/blocks/api/parser", "getBlockAttributes")
  @js.native
  def getBlockAttributes(blockTypeOrName: String, innerHTML: String): Record[String, _] = js.native
  @JSImport("@wordpress/blocks/api/parser", "getBlockAttributes")
  @js.native
  def getBlockAttributes(blockTypeOrName: String, innerHTML: String, attributes: Record[String, _]): Record[String, _] = js.native
  @JSImport("@wordpress/blocks/api/parser", "getBlockAttributes")
  @js.native
  def getBlockAttributes[T /* <: Block[_] */](blockTypeOrName: T, innerHTML: String): js.Any = js.native
  @JSImport("@wordpress/blocks/api/parser", "getBlockAttributes")
  @js.native
  def getBlockAttributes[T /* <: Block[_] */](blockTypeOrName: T, innerHTML: String, attributes: Record[String, _]): js.Any = js.native
  
  @JSImport("@wordpress/blocks/api/parser", "parse")
  @js.native
  def parse(content: String): js.Array[BlockInstance[StringDictionary[_]]] = js.native
  
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Attributetypeboolean): js.UndefOr[Boolean] = js.native
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Attribute): js.UndefOr[String] = js.native
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Children): js.Array[ReactChild] = js.native
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema(innerHTML: String, schema: HTML): js.UndefOr[String] = js.native
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Node): Element | Null = js.native
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Tag): js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 173 */ js.Any
  ] = js.native
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema(innerHTML: String, schema: Text): js.UndefOr[String] = js.native
  @JSImport("@wordpress/blocks/api/parser", "parseWithAttributeSchema")
  @js.native
  def parseWithAttributeSchema[T /* <: Record[String, Source[_]] */](innerHTML: String, schema: Query[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.parseWithAttributeSchema with TopLevel[T] = js.native
  
  object Schema {
    
    @js.native
    trait Attribute
      extends Source[js.Any] {
      
      var attribute: String = js.native
      
      var selector: js.UndefOr[String] = js.native
      
      var source: attribute = js.native
      
      var `type`: js.UndefOr[string | boolean] = js.native
    }
    object Attribute {
      
      @scala.inline
      def apply(attribute: String, source: attribute): Attribute = {
        val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[Attribute]
      }
      
      @scala.inline
      implicit class AttributeMutableBuilder[Self <: Attribute] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSource(value: attribute): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: string | boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait Children
      extends Source[js.Any] {
      
      var selector: js.UndefOr[String] = js.native
      
      var source: children = js.native
    }
    object Children {
      
      @scala.inline
      def apply(source: children): Children = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[Children]
      }
      
      @scala.inline
      implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSource(value: children): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait HTML
      extends Source[js.Any] {
      
      var multiline: js.UndefOr[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any
          ] = js.native
      
      var selector: js.UndefOr[String] = js.native
      
      var source: html = js.native
    }
    object HTML {
      
      @scala.inline
      def apply(source: html): HTML = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[HTML]
      }
      
      @scala.inline
      implicit class HTMLMutableBuilder[Self <: HTML] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMultiline(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSource(value: html): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Node
      extends Source[js.Any] {
      
      var selector: js.UndefOr[String] = js.native
      
      var source: node = js.native
    }
    object Node {
      
      @scala.inline
      def apply(source: node): Node = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[Node]
      }
      
      @scala.inline
      implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSource(value: node): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Query[T] extends Source[T] {
      
      var query: T = js.native
      
      var selector: js.UndefOr[String] = js.native
      
      var source: query_ = js.native
    }
    object Query {
      
      @scala.inline
      def apply[T](query: T, source: query_): Query[T] = {
        val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[Query[T]]
      }
      
      @scala.inline
      implicit class QueryMutableBuilder[Self <: Query[_], T] (val x: Self with Query[T]) extends AnyVal {
        
        @scala.inline
        def setQuery(value: T): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSource(value: query_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Tag
      extends Source[js.Any] {
      
      var selector: js.UndefOr[String] = js.native
      
      var source: tag = js.native
    }
    object Tag {
      
      @scala.inline
      def apply(source: tag): Tag = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[Tag]
      }
      
      @scala.inline
      implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSource(value: tag): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Text
      extends Source[js.Any] {
      
      var selector: js.UndefOr[String] = js.native
      
      var source: text = js.native
    }
    object Text {
      
      @scala.inline
      def apply(source: text): Text = {
        val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[Text]
      }
      
      @scala.inline
      implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        @scala.inline
        def setSource(value: text): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wordpressBlocks.parserMod.Schema.Attribute
    - typings.wordpressBlocks.parserMod.Schema.Children
    - typings.wordpressBlocks.parserMod.Schema.HTML
    - typings.wordpressBlocks.parserMod.Schema.Node
    - typings.wordpressBlocks.parserMod.Schema.Query[T]
    - typings.wordpressBlocks.parserMod.Schema.Tag
    - typings.wordpressBlocks.parserMod.Schema.Text
  */
  trait Source[T] extends StObject
  object Source {
    
    @scala.inline
    def Attribute(attribute: String, source: attribute): typings.wordpressBlocks.parserMod.Schema.Attribute = {
      val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.wordpressBlocks.parserMod.Schema.Attribute]
    }
    
    @scala.inline
    def Children(source: children): typings.wordpressBlocks.parserMod.Schema.Children = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.wordpressBlocks.parserMod.Schema.Children]
    }
    
    @scala.inline
    def HTML(source: html): typings.wordpressBlocks.parserMod.Schema.HTML = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.wordpressBlocks.parserMod.Schema.HTML]
    }
    
    @scala.inline
    def Node(source: node): typings.wordpressBlocks.parserMod.Schema.Node = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.wordpressBlocks.parserMod.Schema.Node]
    }
    
    @scala.inline
    def Query[T](query: T, source: query_): typings.wordpressBlocks.parserMod.Schema.Query[T] = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.wordpressBlocks.parserMod.Schema.Query[T]]
    }
    
    @scala.inline
    def Tag(source: tag): typings.wordpressBlocks.parserMod.Schema.Tag = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.wordpressBlocks.parserMod.Schema.Tag]
    }
    
    @scala.inline
    def Text(source: text): typings.wordpressBlocks.parserMod.Schema.Text = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.wordpressBlocks.parserMod.Schema.Text]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - js.UndefOr[scala.Nothing]
    - / * import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof any ]: any[k] extends @wordpress/blocks.@wordpress/blocks/api/parser.Schema.Query<infer V>? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<@wordpress/blocks.@wordpress/blocks/api/parser.Schema.Query<V>> * / object : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<U[k]> * / object}
    * / typings.wordpressBlocks.wordpressBlocksStrings.SourceReturnValue with org.scalablytyped.runtime.TopLevel[js.Any]
    - typings.wordpressBlocks.wordpressBlocksStrings.a
    - typings.wordpressBlocks.wordpressBlocksStrings.abbr
    - typings.wordpressBlocks.wordpressBlocksStrings.address
    - typings.wordpressBlocks.wordpressBlocksStrings.applet
    - typings.wordpressBlocks.wordpressBlocksStrings.area
    - typings.wordpressBlocks.wordpressBlocksStrings.article
    - typings.wordpressBlocks.wordpressBlocksStrings.aside
    - typings.wordpressBlocks.wordpressBlocksStrings.audio
    - typings.wordpressBlocks.wordpressBlocksStrings.b
    - typings.wordpressBlocks.wordpressBlocksStrings.base
    - typings.wordpressBlocks.wordpressBlocksStrings.basefont
    - typings.wordpressBlocks.wordpressBlocksStrings.bdi
    - typings.wordpressBlocks.wordpressBlocksStrings.bdo
    - typings.wordpressBlocks.wordpressBlocksStrings.blockquote
    - typings.wordpressBlocks.wordpressBlocksStrings.body
    - typings.wordpressBlocks.wordpressBlocksStrings.br
    - typings.wordpressBlocks.wordpressBlocksStrings.button
    - typings.wordpressBlocks.wordpressBlocksStrings.canvas
    - typings.wordpressBlocks.wordpressBlocksStrings.caption
    - typings.wordpressBlocks.wordpressBlocksStrings.cite
    - typings.wordpressBlocks.wordpressBlocksStrings.code
    - typings.wordpressBlocks.wordpressBlocksStrings.col
    - typings.wordpressBlocks.wordpressBlocksStrings.colgroup
    - typings.wordpressBlocks.wordpressBlocksStrings.data
    - typings.wordpressBlocks.wordpressBlocksStrings.datalist
    - typings.wordpressBlocks.wordpressBlocksStrings.dd
    - typings.wordpressBlocks.wordpressBlocksStrings.del
    - typings.wordpressBlocks.wordpressBlocksStrings.details
    - typings.wordpressBlocks.wordpressBlocksStrings.dfn
    - typings.wordpressBlocks.wordpressBlocksStrings.dialog
    - typings.wordpressBlocks.wordpressBlocksStrings.dir
    - typings.wordpressBlocks.wordpressBlocksStrings.div
    - typings.wordpressBlocks.wordpressBlocksStrings.dl
    - typings.wordpressBlocks.wordpressBlocksStrings.dt
    - typings.wordpressBlocks.wordpressBlocksStrings.em
    - typings.wordpressBlocks.wordpressBlocksStrings.embed
    - typings.wordpressBlocks.wordpressBlocksStrings.fieldset
    - typings.wordpressBlocks.wordpressBlocksStrings.figcaption
    - typings.wordpressBlocks.wordpressBlocksStrings.figure
    - typings.wordpressBlocks.wordpressBlocksStrings.font
    - typings.wordpressBlocks.wordpressBlocksStrings.footer
    - typings.wordpressBlocks.wordpressBlocksStrings.form
    - typings.wordpressBlocks.wordpressBlocksStrings.frame
    - typings.wordpressBlocks.wordpressBlocksStrings.frameset
    - typings.wordpressBlocks.wordpressBlocksStrings.h1
    - typings.wordpressBlocks.wordpressBlocksStrings.h2
    - typings.wordpressBlocks.wordpressBlocksStrings.h3
    - typings.wordpressBlocks.wordpressBlocksStrings.h4
    - typings.wordpressBlocks.wordpressBlocksStrings.h5
    - typings.wordpressBlocks.wordpressBlocksStrings.h6
    - typings.wordpressBlocks.wordpressBlocksStrings.head
    - typings.wordpressBlocks.wordpressBlocksStrings.header
    - typings.wordpressBlocks.wordpressBlocksStrings.hgroup
    - typings.wordpressBlocks.wordpressBlocksStrings.hr
    - typings.wordpressBlocks.wordpressBlocksStrings.html
    - typings.wordpressBlocks.wordpressBlocksStrings.i
    - typings.wordpressBlocks.wordpressBlocksStrings.iframe
    - typings.wordpressBlocks.wordpressBlocksStrings.img
    - typings.wordpressBlocks.wordpressBlocksStrings.input
    - typings.wordpressBlocks.wordpressBlocksStrings.ins
    - typings.wordpressBlocks.wordpressBlocksStrings.kbd
    - typings.wordpressBlocks.wordpressBlocksStrings.label
    - typings.wordpressBlocks.wordpressBlocksStrings.legend
    - typings.wordpressBlocks.wordpressBlocksStrings.li
    - typings.wordpressBlocks.wordpressBlocksStrings.link
    - typings.wordpressBlocks.wordpressBlocksStrings.main
    - typings.wordpressBlocks.wordpressBlocksStrings.map
    - typings.wordpressBlocks.wordpressBlocksStrings.mark
    - typings.wordpressBlocks.wordpressBlocksStrings.marquee
    - typings.wordpressBlocks.wordpressBlocksStrings.menu
    - typings.wordpressBlocks.wordpressBlocksStrings.meta
    - typings.wordpressBlocks.wordpressBlocksStrings.meter
    - typings.wordpressBlocks.wordpressBlocksStrings.nav
    - typings.wordpressBlocks.wordpressBlocksStrings.noscript
    - typings.wordpressBlocks.wordpressBlocksStrings.`object`
    - typings.wordpressBlocks.wordpressBlocksStrings.ol
    - typings.wordpressBlocks.wordpressBlocksStrings.optgroup
    - typings.wordpressBlocks.wordpressBlocksStrings.option
    - typings.wordpressBlocks.wordpressBlocksStrings.output
    - typings.wordpressBlocks.wordpressBlocksStrings.p
    - typings.wordpressBlocks.wordpressBlocksStrings.param
    - typings.wordpressBlocks.wordpressBlocksStrings.picture
    - typings.wordpressBlocks.wordpressBlocksStrings.pre
    - typings.wordpressBlocks.wordpressBlocksStrings.progress
    - typings.wordpressBlocks.wordpressBlocksStrings.q
    - typings.wordpressBlocks.wordpressBlocksStrings.rp
    - typings.wordpressBlocks.wordpressBlocksStrings.rt
    - typings.wordpressBlocks.wordpressBlocksStrings.ruby
    - typings.wordpressBlocks.wordpressBlocksStrings.s
    - typings.wordpressBlocks.wordpressBlocksStrings.samp
    - typings.wordpressBlocks.wordpressBlocksStrings.script
    - typings.wordpressBlocks.wordpressBlocksStrings.section
    - typings.wordpressBlocks.wordpressBlocksStrings.select
    - typings.wordpressBlocks.wordpressBlocksStrings.slot
    - typings.wordpressBlocks.wordpressBlocksStrings.small
    - typings.wordpressBlocks.wordpressBlocksStrings.source
    - typings.wordpressBlocks.wordpressBlocksStrings.span
    - typings.wordpressBlocks.wordpressBlocksStrings.strong
    - typings.wordpressBlocks.wordpressBlocksStrings.style
    - typings.wordpressBlocks.wordpressBlocksStrings.sub
    - typings.wordpressBlocks.wordpressBlocksStrings.summary
    - typings.wordpressBlocks.wordpressBlocksStrings.sup
    - typings.wordpressBlocks.wordpressBlocksStrings.table
    - typings.wordpressBlocks.wordpressBlocksStrings.tbody
    - typings.wordpressBlocks.wordpressBlocksStrings.td
    - typings.wordpressBlocks.wordpressBlocksStrings.template
    - typings.wordpressBlocks.wordpressBlocksStrings.textarea
    - typings.wordpressBlocks.wordpressBlocksStrings.tfoot
    - typings.wordpressBlocks.wordpressBlocksStrings.th
    - typings.wordpressBlocks.wordpressBlocksStrings.thead
    - typings.wordpressBlocks.wordpressBlocksStrings.time
    - typings.wordpressBlocks.wordpressBlocksStrings.title
    - typings.wordpressBlocks.wordpressBlocksStrings.tr
    - typings.wordpressBlocks.wordpressBlocksStrings.track
    - typings.wordpressBlocks.wordpressBlocksStrings.u
    - typings.wordpressBlocks.wordpressBlocksStrings.ul
    - typings.wordpressBlocks.wordpressBlocksStrings.`var`
    - typings.wordpressBlocks.wordpressBlocksStrings.video
    - typings.wordpressBlocks.wordpressBlocksStrings.wbr
    - typings.wordpressBlocks.wordpressBlocksStrings.circle
    - typings.wordpressBlocks.wordpressBlocksStrings.clipPath
    - typings.wordpressBlocks.wordpressBlocksStrings.defs
    - typings.wordpressBlocks.wordpressBlocksStrings.desc
    - typings.wordpressBlocks.wordpressBlocksStrings.ellipse
    - typings.wordpressBlocks.wordpressBlocksStrings.feBlend
    - typings.wordpressBlocks.wordpressBlocksStrings.feColorMatrix
    - typings.wordpressBlocks.wordpressBlocksStrings.feComponentTransfer
    - typings.wordpressBlocks.wordpressBlocksStrings.feComposite
    - typings.wordpressBlocks.wordpressBlocksStrings.feConvolveMatrix
    - typings.wordpressBlocks.wordpressBlocksStrings.feDiffuseLighting
    - typings.wordpressBlocks.wordpressBlocksStrings.feDisplacementMap
    - typings.wordpressBlocks.wordpressBlocksStrings.feDistantLight
    - typings.wordpressBlocks.wordpressBlocksStrings.feFlood
    - typings.wordpressBlocks.wordpressBlocksStrings.feFuncA
    - typings.wordpressBlocks.wordpressBlocksStrings.feFuncB
    - typings.wordpressBlocks.wordpressBlocksStrings.feFuncG
    - typings.wordpressBlocks.wordpressBlocksStrings.feFuncR
    - typings.wordpressBlocks.wordpressBlocksStrings.feGaussianBlur
    - typings.wordpressBlocks.wordpressBlocksStrings.feImage
    - typings.wordpressBlocks.wordpressBlocksStrings.feMerge
    - typings.wordpressBlocks.wordpressBlocksStrings.feMergeNode
    - typings.wordpressBlocks.wordpressBlocksStrings.feMorphology
    - typings.wordpressBlocks.wordpressBlocksStrings.feOffset
    - typings.wordpressBlocks.wordpressBlocksStrings.fePointLight
    - typings.wordpressBlocks.wordpressBlocksStrings.feSpecularLighting
    - typings.wordpressBlocks.wordpressBlocksStrings.feSpotLight
    - typings.wordpressBlocks.wordpressBlocksStrings.feTile
    - typings.wordpressBlocks.wordpressBlocksStrings.feTurbulence
    - typings.wordpressBlocks.wordpressBlocksStrings.filter
    - typings.wordpressBlocks.wordpressBlocksStrings.foreignObject
    - typings.wordpressBlocks.wordpressBlocksStrings.g
    - typings.wordpressBlocks.wordpressBlocksStrings.image
    - typings.wordpressBlocks.wordpressBlocksStrings.line
    - typings.wordpressBlocks.wordpressBlocksStrings.linearGradient
    - typings.wordpressBlocks.wordpressBlocksStrings.marker
    - typings.wordpressBlocks.wordpressBlocksStrings.mask
    - typings.wordpressBlocks.wordpressBlocksStrings.metadata
    - typings.wordpressBlocks.wordpressBlocksStrings.path
    - typings.wordpressBlocks.wordpressBlocksStrings.pattern
    - typings.wordpressBlocks.wordpressBlocksStrings.polygon
    - typings.wordpressBlocks.wordpressBlocksStrings.polyline
    - typings.wordpressBlocks.wordpressBlocksStrings.radialGradient
    - typings.wordpressBlocks.wordpressBlocksStrings.rect
    - typings.wordpressBlocks.wordpressBlocksStrings.stop
    - typings.wordpressBlocks.wordpressBlocksStrings.svg
    - typings.wordpressBlocks.wordpressBlocksStrings.switch
    - typings.wordpressBlocks.wordpressBlocksStrings.symbol
    - typings.wordpressBlocks.wordpressBlocksStrings.text
    - typings.wordpressBlocks.wordpressBlocksStrings.textPath
    - typings.wordpressBlocks.wordpressBlocksStrings.tspan
    - typings.wordpressBlocks.wordpressBlocksStrings.use
    - typings.wordpressBlocks.wordpressBlocksStrings.view
    - typings.react.mod.global.JSX.Element
    - scala.Null
    - js.Array[typings.react.mod.ReactChild]
    - scala.Boolean
  */
  type SourceReturnValue[T] = js.UndefOr[
    _SourceReturnValue[T] | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof any ]: any[k] extends @wordpress/blocks.@wordpress/blocks/api/parser.Schema.Query<infer V>? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<@wordpress/blocks.@wordpress/blocks/api/parser.Schema.Query<V>> * / object : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @wordpress/blocks.@wordpress/blocks/api/parser.SourceReturnValue<U[k]> * / object}
    */ typings.wordpressBlocks.wordpressBlocksStrings.SourceReturnValue with TopLevel[js.Any]) | js.Array[ReactChild] | String | Element | Null | Boolean
  ]
  
  trait _SourceReturnValue[T] extends StObject
}
