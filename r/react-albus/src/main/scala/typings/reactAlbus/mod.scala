package typings.reactAlbus

import typings.history.mod.History
import typings.history.mod.LocationState
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-albus", "Step")
  @js.native
  val Step: ComponentType[StepProps] = js.native
  
  @JSImport("react-albus", "Steps")
  @js.native
  val Steps: ComponentType[StepsProps] = js.native
  
  @JSImport("react-albus", "WithWizard")
  @js.native
  val WithWizard_ : ComponentType[WizardContextRenderProps] = js.native
  
  @JSImport("react-albus", "Wizard")
  @js.native
  val Wizard: ComponentType[WizardProps] = js.native
  
  @JSImport("react-albus", "withWizard")
  @js.native
  def withWizard[P](component: ComponentType[P with WizardComponentProps]): ComponentType[P] = js.native
  
  @js.native
  trait StepObject extends StObject {
    
    var id: String = js.native
  }
  object StepObject {
    
    @scala.inline
    def apply(id: String): StepObject = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepObject]
    }
    
    @scala.inline
    implicit class StepObjectMutableBuilder[Self <: StepObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type StepProps = StepObject with WizardContextRenderProps
  
  @js.native
  trait StepsProps extends StObject {
    
    var step: js.UndefOr[StepObject] = js.native
  }
  object StepsProps {
    
    @scala.inline
    def apply(): StepsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepsProps]
    }
    
    @scala.inline
    implicit class StepsPropsMutableBuilder[Self <: StepsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStep(value: StepObject): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  @js.native
  trait WizardComponentProps extends StObject {
    
    var wizard: WizardContext = js.native
  }
  object WizardComponentProps {
    
    @scala.inline
    def apply(wizard: WizardContext): WizardComponentProps = {
      val __obj = js.Dynamic.literal(wizard = wizard.asInstanceOf[js.Any])
      __obj.asInstanceOf[WizardComponentProps]
    }
    
    @scala.inline
    implicit class WizardComponentPropsMutableBuilder[Self <: WizardComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWizard(value: WizardContext): Self = StObject.set(x, "wizard", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WizardContext extends StObject {
    
    def go(n: Double): Unit = js.native
    
    var history: History[LocationState] = js.native
    
    def next(): Unit = js.native
    
    def previous(): Unit = js.native
    
    def push(): Unit = js.native
    def push(id: String): Unit = js.native
    
    def replace(): Unit = js.native
    def replace(id: String): Unit = js.native
    
    var step: StepObject = js.native
    
    var steps: js.Array[StepObject] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactAlbus.anon.Render
    - typings.reactAlbus.anon.Children
  */
  trait WizardContextRenderProps extends StObject
  object WizardContextRenderProps {
    
    @scala.inline
    def Children(children: WizardContext => ReactNode): typings.reactAlbus.anon.Children = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[typings.reactAlbus.anon.Children]
    }
    
    @scala.inline
    def Render(): typings.reactAlbus.anon.Render = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactAlbus.anon.Render]
    }
  }
  
  @js.native
  trait WizardProps extends StObject {
    
    var basename: js.UndefOr[String] = js.native
    
    var history: js.UndefOr[History[LocationState]] = js.native
    
    var onNext: js.UndefOr[js.Function1[/* wizard */ WizardContext, Unit]] = js.native
    
    var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, ReactNode]] = js.native
  }
  object WizardProps {
    
    @scala.inline
    def apply(): WizardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WizardProps]
    }
    
    @scala.inline
    implicit class WizardPropsMutableBuilder[Self <: WizardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename(value: String): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      @scala.inline
      def setHistory(value: History[LocationState]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
      
      @scala.inline
      def setOnNext(value: /* wizard */ WizardContext => Unit): Self = StObject.set(x, "onNext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      @scala.inline
      def setRender(value: /* wizard */ WizardContext => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
