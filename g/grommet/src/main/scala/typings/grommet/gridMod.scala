package typings.grommet

import typings.grommet.anon.Column
import typings.grommet.anon.Count
import typings.grommet.anon.End
import typings.grommet.grommetStrings.`1Slash2`
import typings.grommet.grommetStrings.`1Slash3`
import typings.grommet.grommetStrings.`1Slash4`
import typings.grommet.grommetStrings.`2Slash3`
import typings.grommet.grommetStrings.`2Slash4`
import typings.grommet.grommetStrings.`3Slash4`
import typings.grommet.grommetStrings.auto
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.flex
import typings.grommet.grommetStrings.full
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.stretch
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignContentType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.FillType
import typings.grommet.utilsMod.GapType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.JustifyContentType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PadType
import typings.grommet.utilsMod.PolymorphicType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("grommet/components/Grid", "Grid")
  @js.native
  val Grid: FC[
    GridProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @js.native
  trait GridProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var align: js.UndefOr[start | center | end | stretch] = js.native
    
    var alignContent: js.UndefOr[AlignContentType] = js.native
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var areas: js.UndefOr[js.Array[js.Array[String] | End]] = js.native
    
    var as: js.UndefOr[PolymorphicType] = js.native
    
    var columns: js.UndefOr[
        (js.Array[
          xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
        ]) | xsmall | small | medium | large | xlarge | Count | String
      ] = js.native
    
    var fill: js.UndefOr[FillType] = js.native
    
    var gap: js.UndefOr[GapType | Column] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var justify: js.UndefOr[start | center | end | stretch] = js.native
    
    var justifyContent: js.UndefOr[JustifyContentType] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    var pad: js.UndefOr[PadType] = js.native
    
    var responsive: js.UndefOr[Boolean] = js.native
    
    var rows: js.UndefOr[
        (js.Array[
          xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
        ]) | xsmall | small | medium | large | xlarge | String
      ] = js.native
    
    var tag: js.UndefOr[PolymorphicType] = js.native
  }
  object GridProps {
    
    @scala.inline
    def apply(): GridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridProps]
    }
    
    @scala.inline
    implicit class GridPropsMutableBuilder[Self <: GridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlign(value: start | center | end | stretch): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContent(value: AlignContentType): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAreas(value: js.Array[js.Array[String] | End]): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAreasUndefined: Self = StObject.set(x, "areas", js.undefined)
      
      @scala.inline
      def setAreasVarargs(value: (js.Array[String] | End)*): Self = StObject.set(x, "areas", js.Array(value :_*))
      
      @scala.inline
      def setAs(value: PolymorphicType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setColumns(
        value: (js.Array[
              xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
            ]) | xsmall | small | medium | large | xlarge | Count | String
      ): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(
        value: (xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String])*
      ): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: FillType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setGap(value: GapType | Column): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setJustify(value: start | center | end | stretch): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyContent(value: JustifyContentType): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      @scala.inline
      def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRows(
        value: (js.Array[
              xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String]
            ]) | xsmall | small | medium | large | xlarge | String
      ): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setRowsVarargs(
        value: (xsmall | small | medium | large | xlarge | full | `1Slash2` | `1Slash3` | `2Slash3` | `1Slash4` | `2Slash4` | `3Slash4` | flex | auto | String | js.Array[String])*
      ): Self = StObject.set(x, "rows", js.Array(value :_*))
      
      @scala.inline
      def setTag(value: PolymorphicType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
