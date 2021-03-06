package typings.reactBreadcrumbs

import typings.history.mod.LocationDescriptor
import typings.history.mod.LocationState
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.react.mod.StatelessComponent
import typings.reactBreadcrumbs.anon.Title
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-breadcrumbs", "Breadcrumb")
  @js.native
  class Breadcrumb protected ()
    extends Component[BreadcrumbProps, js.Object, js.Any] {
    def this(props: BreadcrumbProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BreadcrumbProps, context: js.Any) = this()
  }
  
  @JSImport("react-breadcrumbs", "Breadcrumbs")
  @js.native
  class Breadcrumbs protected ()
    extends Component[BreadcrumbsProps, js.Object, js.Any] {
    def this(props: BreadcrumbsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BreadcrumbsProps, context: js.Any) = this()
  }
  
  @js.native
  trait BreadcrumbProps extends StObject {
    
    var data: LocationDescriptor[LocationState] with Title = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
  }
  object BreadcrumbProps {
    
    @scala.inline
    def apply(data: LocationDescriptor[LocationState] with Title): BreadcrumbProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbProps]
    }
    
    @scala.inline
    implicit class BreadcrumbPropsMutableBuilder[Self <: BreadcrumbProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: LocationDescriptor[LocationState] with Title): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    }
  }
  
  @js.native
  trait BreadcrumbsProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var separator: js.UndefOr[ReactNode] = js.native
    
    var setCrumbs: js.UndefOr[js.Function1[/* crumbs */ Crumbs, ReactNode]] = js.native
    
    var wrapper: js.UndefOr[StatelessComponent[js.Object] | (ComponentClass[js.Object, ComponentState])] = js.native
  }
  object BreadcrumbsProps {
    
    @scala.inline
    def apply(): BreadcrumbsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreadcrumbsProps]
    }
    
    @scala.inline
    implicit class BreadcrumbsPropsMutableBuilder[Self <: BreadcrumbsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setSeparator(value: ReactNode): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setSetCrumbs(value: /* crumbs */ Crumbs => ReactNode): Self = StObject.set(x, "setCrumbs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetCrumbsUndefined: Self = StObject.set(x, "setCrumbs", js.undefined)
      
      @scala.inline
      def setWrapper(value: StatelessComponent[js.Object] | (ComponentClass[js.Object, ComponentState])): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperUndefined: Self = StObject.set(x, "wrapper", js.undefined)
    }
  }
  
  @js.native
  trait Crumbs extends StObject
}
