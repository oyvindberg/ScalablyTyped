package typings.angularFormly.AngularFormly

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IFormController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * see http://docs.angular-formly.com/docs/custom-templates#templates-scope
  */
@js.native
trait ITemplateScope extends StObject {
  
  //Shortcut to options.formControl
  var fc: IFormController | js.Array[IFormController] = js.native
  
  //all the fields for the form
  var fields: IFieldArray = js.native
  
  //the form controller the field is in
  var form: js.Any = js.native
  
  //The object passed as options.formState to the formly-form directive. Use this to share state between fields.
  var formState: js.Object = js.native
  
  //The id of the field. You shouldn't have to use this.
  var id: String = js.native
  
  //The index of the field the form is on (in ng-repeat)
  var index: Double = js.native
  
  //the model of the form (or the model specified by the field if it was specified).
  var model: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var options: ITemplateScopeOptions = js.native
  
  //Shortcut to options.validation.errorExistsAndShouldBeVisible
  var showError: Boolean = js.native
  
  //Shortcut to options.templateOptions
  var to: ITemplateOptions = js.native
}
object ITemplateScope {
  
  @scala.inline
  def apply(
    fc: IFormController | js.Array[IFormController],
    fields: IFieldArray,
    form: js.Any,
    formState: js.Object,
    id: String,
    index: Double,
    options: ITemplateScopeOptions,
    showError: Boolean,
    to: ITemplateOptions
  ): ITemplateScope = {
    val __obj = js.Dynamic.literal(fc = fc.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], formState = formState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], showError = showError.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITemplateScope]
  }
  
  @scala.inline
  implicit class ITemplateScopeMutableBuilder[Self <: ITemplateScope] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFc(value: IFormController | js.Array[IFormController]): Self = StObject.set(x, "fc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFcVarargs(value: IFormController*): Self = StObject.set(x, "fc", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: IFieldArray): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: (IFieldConfigurationObject | IFieldGroup)*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setForm(value: js.Any): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormState(value: js.Object): Self = StObject.set(x, "formState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: StringDictionary[js.Any]): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setOptions(value: ITemplateScopeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowError(value: Boolean): Self = StObject.set(x, "showError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: ITemplateOptions): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
