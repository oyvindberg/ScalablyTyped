package typings.mendixmodelsdk.allModelClassesMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.navigationMod.navigation.NavigationProfile
import typings.mendixmodelsdk.projectsMod.projects.IFolderBase
import typings.mendixmodelsdk.structuresMod.aliases.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menus {
  
  /**
    * See: {@link https://docs.mendix.com/refguide/menu relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuDocument")
  @js.native
  class MenuDocument protected ()
    extends typings.mendixmodelsdk.menusMod.menus.MenuDocument {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      container: IFolderBase
    ) = this()
  }
  object MenuDocument {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new MenuDocument unit in the SDK and on the server.
      * Expects one argument, the projects.IFolderBase in which this unit is contained.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuDocument.createIn")
    @js.native
    def createIn(container: IFolderBase): typings.mendixmodelsdk.menusMod.menus.MenuDocument = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuDocument.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuDocument.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.menusMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.menusMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /**
    * See: {@link https://docs.mendix.com/refguide/menu relevant section in reference guide}
    */
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItem")
  @js.native
  class MenuItem protected ()
    extends typings.mendixmodelsdk.menusMod.menus.MenuItem {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MenuItem {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MenuItem instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItem.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.menusMod.menus.MenuItem = js.native
    
    /**
      * Creates and returns a new MenuItem instance in the SDK and on the server.
      * The new MenuItem will be automatically stored in the 'items' property
      * of the parent MenuItemContainer element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItem.createIn")
    @js.native
    def createIn(container: typings.mendixmodelsdk.menusMod.menus.MenuItemContainer): typings.mendixmodelsdk.menusMod.menus.MenuItem = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItem.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItem.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.menusMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.menusMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItemCollection")
  @js.native
  class MenuItemCollection protected ()
    extends typings.mendixmodelsdk.menusMod.menus.MenuItemCollection {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MenuItemCollection {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItemCollection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * Expects one argument: the IModel object the instance will "live on".
      * After creation, assign or add this instance to a property that accepts this kind of objects.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItemCollection.create")
    @js.native
    def create(model: IModel): typings.mendixmodelsdk.menusMod.menus.MenuItemCollection = js.native
    
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * The new MenuItemCollection will be automatically stored in the 'itemCollection' property
      * of the parent MenuDocument element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItemCollection.createInMenuDocumentUnderItemCollection")
    @js.native
    def createInMenuDocumentUnderItemCollection(container: typings.mendixmodelsdk.menusMod.menus.MenuDocument): typings.mendixmodelsdk.menusMod.menus.MenuItemCollection = js.native
    
    /**
      * Creates and returns a new MenuItemCollection instance in the SDK and on the server.
      * The new MenuItemCollection will be automatically stored in the 'menuItemCollection' property
      * of the parent navigation.NavigationProfile element passed as argument.
      */
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItemCollection.createInNavigationProfileUnderMenuItemCollection")
    @js.native
    def createInNavigationProfileUnderMenuItemCollection(container: NavigationProfile): typings.mendixmodelsdk.menusMod.menus.MenuItemCollection = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItemCollection.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItemCollection.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.menusMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.menusMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItemContainer")
  @js.native
  abstract class MenuItemContainer protected ()
    extends typings.mendixmodelsdk.menusMod.menus.MenuItemContainer {
    def this(
      model: AbstractModel,
      structureTypeName: String,
      id: String,
      isPartial: Boolean,
      unit: ModelUnit[IAbstractModel],
      container: AbstractElement[IAbstractModel, Container]
    ) = this()
  }
  object MenuItemContainer {
    
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItemContainer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItemContainer.structureTypeName")
    @js.native
    def structureTypeName: String = js.native
    @scala.inline
    def structureTypeName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("structureTypeName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("mendixmodelsdk/dist/gen/all-model-classes", "menus.MenuItemContainer.versionInfo")
    @js.native
    def versionInfo: typings.mendixmodelsdk.menusMod.StructureVersionInfo = js.native
    @scala.inline
    def versionInfo_=(x: typings.mendixmodelsdk.menusMod.StructureVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
}
