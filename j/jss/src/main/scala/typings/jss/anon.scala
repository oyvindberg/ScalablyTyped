package typings.jss

import org.scalablytyped.runtime.Instantiable0
import typings.jss.mod.Classes
import typings.jss.mod.ContainerRule
import typings.jss.mod.CreateGenerateIdOptions
import typings.jss.mod.CreateGenerateId_
import typings.jss.mod.GenerateId
import typings.jss.mod.InsertionPoint
import typings.jss.mod.Jss
import typings.jss.mod.Plugin
import typings.jss.mod.Renderer
import typings.jss.mod.Rule
import typings.jss.mod.StyleSheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Instantiable extends Instantiable0[Renderer]
  
  /* Inlined std.Partial<jss.jss.JssOptions> */
  @js.native
  trait PartialJssOptions extends StObject {
    
    var Renderer: js.UndefOr[Instantiable | Null] = js.native
    
    var createGenerateId: js.UndefOr[CreateGenerateId_] = js.native
    
    var id: js.UndefOr[CreateGenerateIdOptions] = js.native
    
    var insertionPoint: js.UndefOr[InsertionPoint] = js.native
    
    var plugins: js.UndefOr[js.Array[Plugin]] = js.native
  }
  object PartialJssOptions {
    
    @scala.inline
    def apply(): PartialJssOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialJssOptions]
    }
    
    @scala.inline
    implicit class PartialJssOptionsMutableBuilder[Self <: PartialJssOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateGenerateId(value: /* options */ js.UndefOr[CreateGenerateIdOptions] => GenerateId): Self = StObject.set(x, "createGenerateId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateGenerateIdUndefined: Self = StObject.set(x, "createGenerateId", js.undefined)
      
      @scala.inline
      def setId(value: CreateGenerateIdOptions): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInsertionPoint(value: InsertionPoint): Self = StObject.set(x, "insertionPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertionPointUndefined: Self = StObject.set(x, "insertionPoint", js.undefined)
      
      @scala.inline
      def setPlugins(value: js.Array[Plugin]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: Plugin*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setRenderer(value: Instantiable): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererNull: Self = StObject.set(x, "Renderer", null)
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "Renderer", js.undefined)
    }
  }
  
  /* Inlined std.Partial<jss.jss.RuleOptions> */
  @js.native
  trait PartialRuleOptions extends StObject {
    
    var Renderer: js.UndefOr[typings.jss.mod.Renderer] = js.native
    
    var classes: js.UndefOr[Classes[String]] = js.native
    
    var generateId: js.UndefOr[GenerateId] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var jss: js.UndefOr[Jss] = js.native
    
    var parent: js.UndefOr[ContainerRule | (StyleSheet[String | Double | js.Symbol])] = js.native
    
    var selector: js.UndefOr[String] = js.native
    
    var sheet: js.UndefOr[StyleSheet[String | Double | js.Symbol]] = js.native
  }
  object PartialRuleOptions {
    
    @scala.inline
    def apply(): PartialRuleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRuleOptions]
    }
    
    @scala.inline
    implicit class PartialRuleOptionsMutableBuilder[Self <: PartialRuleOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClasses(value: Classes[String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateId", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
      
      @scala.inline
      def setParent(value: ContainerRule | (StyleSheet[String | Double | js.Symbol])): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setRenderer(value: Renderer): Self = StObject.set(x, "Renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "Renderer", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setSheet(value: StyleSheet[String | Double | js.Symbol]): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
    }
  }
}
