package typings.antd

import typings.antd.anon.Avatar
import typings.antd.anon.Call
import typings.antd.anon.CallDefaultProps
import typings.antd.anon.DefaultProps
import typings.antd.skeletonImageMod.SkeletonImageProps
import typings.antd.skeletonSkeletonMod.SkeletonProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonMod {
  
  object default {
    
    @JSImport("antd/lib/skeleton", JSImport.Default)
    @js.native
    def apply(props: SkeletonProps): Element = js.native
    @JSImport("antd/lib/skeleton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/skeleton", "default.Avatar")
    @js.native
    def Avatar: DefaultProps = js.native
    @scala.inline
    def Avatar_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Avatar")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/skeleton", "default.Button")
    @js.native
    def Button: Call = js.native
    @scala.inline
    def Button_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/skeleton", "default.Image")
    @js.native
    def Image(props: SkeletonImageProps): Element = js.native
    
    @JSImport("antd/lib/skeleton", "default.Input")
    @js.native
    def Input: CallDefaultProps = js.native
    @scala.inline
    def Input_=(x: CallDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Input")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/skeleton", "default.defaultProps")
    @js.native
    def defaultProps: Avatar = js.native
    @scala.inline
    def defaultProps_=(x: Avatar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
