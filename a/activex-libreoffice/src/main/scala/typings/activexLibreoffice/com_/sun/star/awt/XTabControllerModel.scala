package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the basic operations for a tab controller model. */
@js.native
trait XTabControllerModel extends XInterface {
  
  /** returns the control models. */
  var ControlModels: SafeArray[XControlModel] = js.native
  
  /** returns whether the control models are grouped together. */
  var GroupControl: Boolean = js.native
  
  /** returns the number of control model groups. */
  val GroupCount: Double = js.native
  
  /** returns the control models. */
  def getControlModels(): SafeArray[XControlModel] = js.native
  
  /** returns a control model group. */
  def getGroup(nGroup: Double, Group: js.Array[SeqEquiv[XControlModel]], Name: js.Array[String]): Unit = js.native
  
  /** returns a control model group by name. */
  def getGroupByName(Name: String, Group: js.Array[SeqEquiv[XControlModel]]): Unit = js.native
  
  /** returns whether the control models are grouped together. */
  def getGroupControl(): Boolean = js.native
  
  /** returns the number of control model groups. */
  def getGroupCount(): Double = js.native
  
  /** sets the control models. */
  def setControlModels(Controls: SeqEquiv[XControlModel]): Unit = js.native
  
  /** sets a control model group. */
  def setGroup(Group: SeqEquiv[XControlModel], GroupName: String): Unit = js.native
  
  /** determines if the control models are grouped together. */
  def setGroupControl(GroupControl: Boolean): Unit = js.native
}
object XTabControllerModel {
  
  @scala.inline
  def apply(
    ControlModels: SafeArray[XControlModel],
    GroupControl: Boolean,
    GroupCount: Double,
    acquire: () => Unit,
    getControlModels: () => SafeArray[XControlModel],
    getGroup: (Double, js.Array[SeqEquiv[XControlModel]], js.Array[String]) => Unit,
    getGroupByName: (String, js.Array[SeqEquiv[XControlModel]]) => Unit,
    getGroupControl: () => Boolean,
    getGroupCount: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setControlModels: SeqEquiv[XControlModel] => Unit,
    setGroup: (SeqEquiv[XControlModel], String) => Unit,
    setGroupControl: Boolean => Unit
  ): XTabControllerModel = {
    val __obj = js.Dynamic.literal(ControlModels = ControlModels.asInstanceOf[js.Any], GroupControl = GroupControl.asInstanceOf[js.Any], GroupCount = GroupCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getControlModels = js.Any.fromFunction0(getControlModels), getGroup = js.Any.fromFunction3(getGroup), getGroupByName = js.Any.fromFunction2(getGroupByName), getGroupControl = js.Any.fromFunction0(getGroupControl), getGroupCount = js.Any.fromFunction0(getGroupCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setControlModels = js.Any.fromFunction1(setControlModels), setGroup = js.Any.fromFunction2(setGroup), setGroupControl = js.Any.fromFunction1(setGroupControl))
    __obj.asInstanceOf[XTabControllerModel]
  }
  
  @scala.inline
  implicit class XTabControllerModelMutableBuilder[Self <: XTabControllerModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControlModels(value: SafeArray[XControlModel]): Self = StObject.set(x, "ControlModels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetControlModels(value: () => SafeArray[XControlModel]): Self = StObject.set(x, "getControlModels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroup(value: (Double, js.Array[SeqEquiv[XControlModel]], js.Array[String]) => Unit): Self = StObject.set(x, "getGroup", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetGroupByName(value: (String, js.Array[SeqEquiv[XControlModel]]) => Unit): Self = StObject.set(x, "getGroupByName", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetGroupControl(value: () => Boolean): Self = StObject.set(x, "getGroupControl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGroupCount(value: () => Double): Self = StObject.set(x, "getGroupCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroupControl(value: Boolean): Self = StObject.set(x, "GroupControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupCount(value: Double): Self = StObject.set(x, "GroupCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetControlModels(value: SeqEquiv[XControlModel] => Unit): Self = StObject.set(x, "setControlModels", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetGroup(value: (SeqEquiv[XControlModel], String) => Unit): Self = StObject.set(x, "setGroup", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetGroupControl(value: Boolean => Unit): Self = StObject.set(x, "setGroupControl", js.Any.fromFunction1(value))
  }
}
