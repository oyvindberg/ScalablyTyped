package typings.rcVirtualList

import typings.rcVirtualList.interfaceMod.GetKey
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useHeightsMod {
  
  @JSImport("rc-virtual-list/es/hooks/useHeights", JSImport.Default)
  @js.native
  def default[T](getKey: GetKey[T]): js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typings.rcVirtualList.cacheMapMod.default, 
    Double
  ] = js.native
  @JSImport("rc-virtual-list/es/hooks/useHeights", JSImport.Default)
  @js.native
  def default[T](
    getKey: GetKey[T],
    onItemAdd: js.UndefOr[scala.Nothing],
    onItemRemove: js.Function1[/* item */ T, Unit]
  ): js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typings.rcVirtualList.cacheMapMod.default, 
    Double
  ] = js.native
  @JSImport("rc-virtual-list/es/hooks/useHeights", JSImport.Default)
  @js.native
  def default[T](getKey: GetKey[T], onItemAdd: js.Function1[/* item */ T, Unit]): js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typings.rcVirtualList.cacheMapMod.default, 
    Double
  ] = js.native
  @JSImport("rc-virtual-list/es/hooks/useHeights", JSImport.Default)
  @js.native
  def default[T](
    getKey: GetKey[T],
    onItemAdd: js.Function1[/* item */ T, Unit],
    onItemRemove: js.Function1[/* item */ T, Unit]
  ): js.Tuple4[
    js.Function2[/* item */ T, /* instance */ HTMLElement, Unit], 
    js.Function0[Unit], 
    typings.rcVirtualList.cacheMapMod.default, 
    Double
  ] = js.native
}
