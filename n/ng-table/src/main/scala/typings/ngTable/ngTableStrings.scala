package typings.ngTable

import typings.ngTable.filterSettingsMod.FilterLayout
import typings.ngTable.groupingFuncMod.GroupSort
import typings.ngTable.sortingMod.SortDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngTableStrings {
  
  @js.native
  sealed trait _empty extends GroupSort
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait asc
    extends GroupSort
       with SortDirection
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait desc
    extends GroupSort
       with SortDirection
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait horizontal extends FilterLayout
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait stack extends FilterLayout
  @scala.inline
  def stack: stack = "stack".asInstanceOf[stack]
}
