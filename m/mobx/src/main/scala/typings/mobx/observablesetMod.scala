package typings.mobx

import typings.mobx.interceptUtilsMod.IInterceptable
import typings.mobx.listenUtilsMod.IListenable
import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.delete
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.utilsMod.Lambda
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablesetMod {
  
  @JSImport("mobx/lib/types/observableset", "ObservableSet")
  @js.native
  class ObservableSet[T] ()
    extends Set[T]
       with IInterceptable[ISetWillChange[js.Any]]
       with IListenable {
    def this(initialData: IObservableSetInitialValues[T]) = this()
    def this(initialData: js.UndefOr[IObservableSetInitialValues[T]], enhancer: IEnhancer[T]) = this()
    def this(
      initialData: js.UndefOr[IObservableSetInitialValues[T]],
      enhancer: js.UndefOr[scala.Nothing],
      name: String
    ) = this()
    def this(initialData: js.UndefOr[IObservableSetInitialValues[T]], enhancer: IEnhancer[T], name: String) = this()
    
    var _atom: js.Any = js.native
    
    var _data: js.Any = js.native
    
    var dehanceValue: js.Any = js.native
    
    var dehancer: js.Any = js.native
    
    def delete(value: js.Any): Boolean = js.native
    
    def enhancer(newV: js.Any): js.Any = js.native
    def enhancer(newV: js.Any, oldV: js.Any): js.Any = js.native
    
    def has(value: js.Any): Boolean = js.native
    
    var name: String = js.native
    
    def observe(listener: js.Function1[/* changes */ ISetDidChange[T], Unit]): Lambda = js.native
    def observe(listener: js.Function1[/* changes */ ISetDidChange[T], Unit], fireImmediately: Boolean): Lambda = js.native
    
    def replace(other: IObservableSetInitialValues[T]): ObservableSet[T] = js.native
    def replace(other: ObservableSet[T]): ObservableSet[T] = js.native
    
    @JSName("size")
    def size_MObservableSet: Double = js.native
    
    def toJS(): Set[T] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_ObservableSet: typings.mobx.mobxStrings.Set = js.native
  }
  
  @JSImport("mobx/lib/types/observableset", "isObservableSet")
  @js.native
  def isObservableSet(thing: js.Any): /* is mobx.mobx/lib/types/observableset.ObservableSet<any> */ Boolean = js.native
  
  type IObservableSetInitialValues[T] = Set[T] | js.Array[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobx.anon.NewValueObject[T]
    - typings.mobx.anon.ObjectOldValue[T]
  */
  trait ISetDidChange[T] extends StObject
  object ISetDidChange {
    
    @scala.inline
    def NewValueObject[T](newValue: T, `object`: ObservableSet[T], `type`: add): typings.mobx.anon.NewValueObject[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mobx.anon.NewValueObject[T]]
    }
    
    @scala.inline
    def ObjectOldValue[T](`object`: ObservableSet[T], oldValue: T, `type`: delete): typings.mobx.anon.ObjectOldValue[T] = {
      val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mobx.anon.ObjectOldValue[T]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobx.anon.OldValueType[T]
    - typings.mobx.anon.NewValueObjectType[T]
  */
  trait ISetWillChange[T] extends StObject
  object ISetWillChange {
    
    @scala.inline
    def NewValueObjectType[T](newValue: T, `object`: ObservableSet[T], `type`: add): typings.mobx.anon.NewValueObjectType[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mobx.anon.NewValueObjectType[T]]
    }
    
    @scala.inline
    def OldValueType[T](`object`: ObservableSet[T], oldValue: T, `type`: delete): typings.mobx.anon.OldValueType[T] = {
      val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mobx.anon.OldValueType[T]]
    }
  }
}
