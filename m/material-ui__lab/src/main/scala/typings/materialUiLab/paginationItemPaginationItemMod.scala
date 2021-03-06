package typings.materialUiLab

import typings.materialUiLab.anon.Color
import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationItemPaginationItemMod {
  
  /**
    *
    * Demos:
    *
    * - [Pagination](https://material-ui.com/components/pagination/)
    *
    * API:
    *
    * - [PaginationItem API](https://material-ui.com/api/pagination-item/)
    */
  @JSImport("@material-ui/lab/PaginationItem/PaginationItem", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<PaginationItemTypeMap> */ js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiLab.materialUiLabStrings.root
    - typings.materialUiLab.materialUiLabStrings.page
    - typings.materialUiLab.materialUiLabStrings.sizeSmall
    - typings.materialUiLab.materialUiLabStrings.sizeLarge
    - typings.materialUiLab.materialUiLabStrings.textPrimary
    - typings.materialUiLab.materialUiLabStrings.textSecondary
    - typings.materialUiLab.materialUiLabStrings.outlined
    - typings.materialUiLab.materialUiLabStrings.outlinedPrimary
    - typings.materialUiLab.materialUiLabStrings.outlinedSecondary
    - typings.materialUiLab.materialUiLabStrings.rounded
    - typings.materialUiLab.materialUiLabStrings.ellipsis
    - typings.materialUiLab.materialUiLabStrings.focusVisible
    - typings.materialUiLab.materialUiLabStrings.disabled
    - typings.materialUiLab.materialUiLabStrings.selected
    - typings.materialUiLab.materialUiLabStrings.icon
  */
  trait PaginationItemClassKey extends StObject
  object PaginationItemClassKey {
    
    @scala.inline
    def disabled: typings.materialUiLab.materialUiLabStrings.disabled = "disabled".asInstanceOf[typings.materialUiLab.materialUiLabStrings.disabled]
    
    @scala.inline
    def ellipsis: typings.materialUiLab.materialUiLabStrings.ellipsis = "ellipsis".asInstanceOf[typings.materialUiLab.materialUiLabStrings.ellipsis]
    
    @scala.inline
    def focusVisible: typings.materialUiLab.materialUiLabStrings.focusVisible = "focusVisible".asInstanceOf[typings.materialUiLab.materialUiLabStrings.focusVisible]
    
    @scala.inline
    def icon: typings.materialUiLab.materialUiLabStrings.icon = "icon".asInstanceOf[typings.materialUiLab.materialUiLabStrings.icon]
    
    @scala.inline
    def outlined: typings.materialUiLab.materialUiLabStrings.outlined = "outlined".asInstanceOf[typings.materialUiLab.materialUiLabStrings.outlined]
    
    @scala.inline
    def outlinedPrimary: typings.materialUiLab.materialUiLabStrings.outlinedPrimary = "outlinedPrimary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.outlinedPrimary]
    
    @scala.inline
    def outlinedSecondary: typings.materialUiLab.materialUiLabStrings.outlinedSecondary = "outlinedSecondary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.outlinedSecondary]
    
    @scala.inline
    def page: typings.materialUiLab.materialUiLabStrings.page = "page".asInstanceOf[typings.materialUiLab.materialUiLabStrings.page]
    
    @scala.inline
    def root: typings.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typings.materialUiLab.materialUiLabStrings.root]
    
    @scala.inline
    def rounded: typings.materialUiLab.materialUiLabStrings.rounded = "rounded".asInstanceOf[typings.materialUiLab.materialUiLabStrings.rounded]
    
    @scala.inline
    def selected: typings.materialUiLab.materialUiLabStrings.selected = "selected".asInstanceOf[typings.materialUiLab.materialUiLabStrings.selected]
    
    @scala.inline
    def sizeLarge: typings.materialUiLab.materialUiLabStrings.sizeLarge = "sizeLarge".asInstanceOf[typings.materialUiLab.materialUiLabStrings.sizeLarge]
    
    @scala.inline
    def sizeSmall: typings.materialUiLab.materialUiLabStrings.sizeSmall = "sizeSmall".asInstanceOf[typings.materialUiLab.materialUiLabStrings.sizeSmall]
    
    @scala.inline
    def textPrimary: typings.materialUiLab.materialUiLabStrings.textPrimary = "textPrimary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.textPrimary]
    
    @scala.inline
    def textSecondary: typings.materialUiLab.materialUiLabStrings.textSecondary = "textSecondary".asInstanceOf[typings.materialUiLab.materialUiLabStrings.textSecondary]
  }
  
  type PaginationItemProps[D /* <: ElementType[_] */, P] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverrideProps<PaginationItemTypeMap<P, D>, D> */ js.Any
  
  @js.native
  trait PaginationItemTypeMap[P, D /* <: ElementType[_] */] extends StObject {
    
    var classKey: PaginationItemClassKey = js.native
    
    var defaultComponent: D = js.native
    
    var props: P with Color = js.native
  }
  object PaginationItemTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType[_] */](classKey: PaginationItemClassKey, defaultComponent: D, props: P with Color): PaginationItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationItemTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class PaginationItemTypeMapMutableBuilder[Self <: PaginationItemTypeMap[_, _], P, D /* <: ElementType[_] */] (val x: Self with (PaginationItemTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setClassKey(value: PaginationItemClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with Color): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
