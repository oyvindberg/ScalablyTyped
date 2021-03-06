package typings.winrtUwp.global.Windows.UI

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.UI.StartScreen.TileOptions
import typings.winrtUwp.Windows.UI.StartScreen.TileSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides ways for apps to integrate with the Start screen, such as the creation of secondary tiles and the customization of jump lists. */
object StartScreen {
  
  /** Specifies the color of the tile's foreground text. */
  @JSGlobal("Windows.UI.StartScreen.ForegroundText")
  @js.native
  object ForegroundText extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.StartScreen.ForegroundText with Double] = js.native
    
    /* 0 */ val dark: typings.winrtUwp.Windows.UI.StartScreen.ForegroundText.dark with Double = js.native
    
    /* 1 */ val light: typings.winrtUwp.Windows.UI.StartScreen.ForegroundText.light with Double = js.native
  }
  
  /** Provides functionality for selecting the type of system-managed jump list that is used by an app, adding custom task entry points to an app's jump list, and adding custom groups to an app's jump list. A jump list consists of an optional system-provided list of items, as well as optional app-provided items. Not all device families support jump lists. */
  @JSGlobal("Windows.UI.StartScreen.JumpList")
  @js.native
  abstract class JumpList ()
    extends typings.winrtUwp.Windows.UI.StartScreen.JumpList
  object JumpList {
    
    /**
      * Gets a value that indicates whether the system supports jump lists.
      * @return A boolean value that is True if jump lists are supported. Otherwise, False.
      */
    /* static member */
    @JSGlobal("Windows.UI.StartScreen.JumpList.isSupported")
    @js.native
    def isSupported(): Boolean = js.native
    
    /**
      * Asynchronously retrieves the current jump list and its items.
      * @return When this method completes successfully, it returns the current JumpList . If the system does not support jump lists, this method returns an empty jump list and the SaveAsync method has no effect. Apps can check for this case using the isSupported method.
      */
    /* static member */
    @JSGlobal("Windows.UI.StartScreen.JumpList.loadCurrentAsync")
    @js.native
    def loadCurrentAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.UI.StartScreen.JumpList] = js.native
  }
  
  /** Provides functionality for creating and defining jump list items for an app's jump list. */
  @JSGlobal("Windows.UI.StartScreen.JumpListItem")
  @js.native
  abstract class JumpListItem ()
    extends typings.winrtUwp.Windows.UI.StartScreen.JumpListItem
  object JumpListItem {
    
    /**
      * Creates a jump list item that is an inert separator for a custom group within the app's jump list.
      * @return A jump list item that can be added to an app's jump list through the items property.
      */
    /* static member */
    @JSGlobal("Windows.UI.StartScreen.JumpListItem.createSeparator")
    @js.native
    def createSeparator(): typings.winrtUwp.Windows.UI.StartScreen.JumpListItem = js.native
    
    /**
      * Creates a new jump list item for an app's jump list.
      * @param arguments String that specifies any command line arguments that should be passed onto the app when the jump list item is selected by a user.
      * @param displayName String that specifies a display name for the jump list item. If localization is desired, this string must be a ms-resource: scheme specified URI.
      * @return A jump list item with the specified parameters that can be added to an app's jump list through the items property.
      */
    /* static member */
    @JSGlobal("Windows.UI.StartScreen.JumpListItem.createWithArguments")
    @js.native
    def createWithArguments(args: String, displayName: String): typings.winrtUwp.Windows.UI.StartScreen.JumpListItem = js.native
  }
  
  /** Specifies the kind of jump list item. */
  @JSGlobal("Windows.UI.StartScreen.JumpListItemKind")
  @js.native
  object JumpListItemKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.StartScreen.JumpListItemKind with Double] = js.native
    
    /* 0 */ val arguments: typings.winrtUwp.Windows.UI.StartScreen.JumpListItemKind.arguments with Double = js.native
    
    /* 1 */ val separator: typings.winrtUwp.Windows.UI.StartScreen.JumpListItemKind.separator with Double = js.native
  }
  
  /** Indicates the kind of system group used by an app's jump list. */
  @JSGlobal("Windows.UI.StartScreen.JumpListSystemGroupKind")
  @js.native
  object JumpListSystemGroupKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.StartScreen.JumpListSystemGroupKind with Double] = js.native
    
    /* 1 */ val frequent: typings.winrtUwp.Windows.UI.StartScreen.JumpListSystemGroupKind.frequent with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.UI.StartScreen.JumpListSystemGroupKind.none with Double = js.native
    
    /* 2 */ val recent: typings.winrtUwp.Windows.UI.StartScreen.JumpListSystemGroupKind.recent with Double = js.native
  }
  
  /** Creates, enumerates, and provides information about a secondary tile. */
  @JSGlobal("Windows.UI.StartScreen.SecondaryTile")
  @js.native
  /** Creates a SecondaryTile object. The caller must then set any mandatory properties through the object before attempting to pin, update, or delete the tile. */
  class SecondaryTile ()
    extends typings.winrtUwp.Windows.UI.StartScreen.SecondaryTile {
    /**
      * Creates a SecondaryTile object with a specific ID. This form of the constructor should be used to create a secondary tile object to perform a tile update or deletion.
      * @param tileId A string that will uniquely identify the tile within your app. Choose a unique ID that is descriptive and meaningful to your app. If you provide the same ID as that of an existing secondary tile, the existing secondary tile will be overwritten.
      */
    def this(tileId: String) = this()
    /**
      * Creates a SecondaryTile object that includes all of the mandatory properties required to create a medium tile.
      * @param tileId A string that will uniquely identify the tile within your app's package. Choose a unique ID that is descriptive and meaningful to your app. It is limited to 64 characters and must begin with a number or letter and be composed of the characters a-z, A-Z, 0-9, period (.), or underscore (_). If you provide the same ID as that of an existing secondary tile, the existing secondary tile will be overwritten. Can be set or retrieved through the TileId property.
      * @param displayName A name to be displayed on the tile, in the tile's tooltip, and when showing small tiles, such as on the Apps or search results screens. This string is equivalent to the display name given in the manifest for the main tile. It is restricted to 256 characters, but in practice should be kept short to avoid truncation. This value can be set or retrieved through the DisplayName property.
      * @param arguments An app-defined string meaningful to the calling application. This argument string is passed back to the app when the app is activated from the secondary tile. It will be truncated after 2048 characters. Can be set or retrieved through the Arguments property.
      * @param square150x150Logo A reference to a medium logo image stored at a URI. Can be set or retrieved through the SecondaryTileVisualElements.Square150x150Logo property. This value can be expressed using one of these schemes:
      * @param desiredSize The size of tile to pin. This value must be Default (which provides Windows 8 behavior), Square150x150, or Wide310x150. Any other TileSize value causes an exception to be thrown during runtime.
      */
    def this(tileId: String, displayName: String, args: String, square150x150Logo: Uri, desiredSize: TileSize) = this()
    /**
      * Creates a SecondaryTile object as a medium tile.
      * @param tileId A string that will uniquely identify the tile within your app's package. Choose a unique ID that is descriptive and meaningful to your app. It is limited to 64 characters and must begin with a number or letter and be composed of the characters a-z, A-Z, 0-9, period (.), or underscore (_). If you provide the same ID as that of an existing secondary tile, the existing secondary tile will be overwritten. Can be set or retrieved through the TileId property.
      * @param shortName A short name to display directly on the tile if the app chooses to do so. Anything over 40 characters will be truncated. The user has the option to change this value as part of the pinning process. Can be set or retrieved through the ShortName property.
      * @param displayName A name to be displayed on the tile, in the tile's tooltip, and when showing small tiles, such as on the Apps or search results screens. This string is equivalent to the display name given in the manifest for the main tile. It is restricted to 256 characters, but in practice should be kept short to avoid truncation. This value can be set or retrieved through the DisplayName property.
      * @param arguments An app-defined string meaningful to the calling application. This argument string is passed back to the app when the app is activated from the secondary tile. It will be truncated after 2048 characters. Can be set or retrieved through the Arguments property.
      * @param tileOptions A value that specifies various options such as whether the name will be displayed on the secondary tile. Can be set or retrieved through the TileOptions property.
      * @param logoReference A reference to a square logo image stored at a URI. Can be set or retrieved through the Logo property. This value can be expressed using one of these schemes:
      */
    def this(
      tileId: String,
      shortName: String,
      displayName: String,
      args: String,
      tileOptions: TileOptions,
      logoReference: Uri
    ) = this()
    /**
      * Creates a SecondaryTile object as a wide tile.
      * @param tileId A string that will uniquely identify the tile within your app's package. Choose a unique ID that is descriptive and meaningful to your app. It is limited to 64 characters and must begin with a number or letter and be composed of the characters a-z, A-Z, 0-9, period (.), or underscore (_). If you provide the same ID as that of an existing secondary tile, the existing secondary tile will be overwritten. Can be set or retrieved through the TileId property.
      * @param shortName A short name to display directly on the tile if the app chooses to do so. Anything over 40 characters will be truncated. The user has the option to change this value as part of the pinning process. Can be set or retrieved through the ShortName property.
      * @param displayName A name to be displayed on the tile, in the tile's tooltip, and when showing small tiles, such as on the Apps or search results screens. This string is equivalent to the display name given in the manifest for the main tile. It is restricted to 256 characters, but in practice should be kept short to avoid truncation. This value can be set or retrieved through the DisplayName property.
      * @param arguments An app-defined string meaningful to the calling application. This argument string is passed back to the app when the app is activated from the secondary tile. It will be truncated after 2048 characters. Can be set or retrieved through the Arguments property.
      * @param tileOptions A value that specifies various options such as whether the name will be displayed on the secondary tile. Can be set or retrieved through the TileOptions property.
      * @param logoReference A reference to a medium logo image stored at a URI. Can be set or retrieved through the Square150x150Logo property. This value can be expressed using one of these schemes:
      * @param wideLogoReference A reference to a wide logo image stored at a URI. Can be set or retrieved through the WideLogo property. This value can be expressed using one of these schemes:
      */
    def this(
      tileId: String,
      shortName: String,
      displayName: String,
      args: String,
      tileOptions: TileOptions,
      logoReference: Uri,
      wideLogoReference: Uri
    ) = this()
  }
  object SecondaryTile {
    
    /**
      * Checks whether a specific secondary tile exists for the calling app.
      * @param tileId The unique ID string that was assigned to the tile when it was created.
      * @return True if the tile exists in the calling application; otherwise, false.
      */
    /* static member */
    @JSGlobal("Windows.UI.StartScreen.SecondaryTile.exists")
    @js.native
    def exists(tileId: String): Boolean = js.native
    
    /**
      * Retrieves a list of secondary tiles created for the calling app.
      * @return An enumeration object that allows you to examine the set of tiles.
      */
    /* static member */
    @JSGlobal("Windows.UI.StartScreen.SecondaryTile.findAllAsync")
    @js.native
    def findAllAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Retrieves a list of secondary tiles created for another app in the same package as the calling app.
      * @param applicationId The Package Relative Application ID (PRAID) of the app.
      * @return An enumeration object that allows you to examine the set of tiles.
      */
    /* static member */
    @JSGlobal("Windows.UI.StartScreen.SecondaryTile.findAllAsync")
    @js.native
    def findAllAsync(applicationId: String): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    
    /**
      * Retrieves a list of secondary tiles created for all of the apps in the package of the calling app.
      * @return An enumeration object that allows you to examine the set of tiles.
      */
    /* static member */
    @JSGlobal("Windows.UI.StartScreen.SecondaryTile.findAllForPackageAsync")
    @js.native
    def findAllForPackageAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  }
  
  /** Contains properties through which you can get or set a secondary tile's background color, foreground text, tile images, and app name display options. The properties in this class replace these SecondaryTile properties: */
  @JSGlobal("Windows.UI.StartScreen.SecondaryTileVisualElements")
  @js.native
  abstract class SecondaryTileVisualElements ()
    extends typings.winrtUwp.Windows.UI.StartScreen.SecondaryTileVisualElements
  
  /** Specifies options available to a secondary tile. */
  @JSGlobal("Windows.UI.StartScreen.TileOptions")
  @js.native
  object TileOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.StartScreen.TileOptions with Double] = js.native
    
    /* 3 */ val copyOnDeployment: typings.winrtUwp.Windows.UI.StartScreen.TileOptions.copyOnDeployment with Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.UI.StartScreen.TileOptions.none with Double = js.native
    
    /* 1 */ val showNameOnLogo: typings.winrtUwp.Windows.UI.StartScreen.TileOptions.showNameOnLogo with Double = js.native
    
    /* 2 */ val showNameOnWideLogo: typings.winrtUwp.Windows.UI.StartScreen.TileOptions.showNameOnWideLogo with Double = js.native
  }
  
  /** Specifies the size of tile to pin. Used by some secondary tile constructors. */
  @JSGlobal("Windows.UI.StartScreen.TileSize")
  @js.native
  object TileSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.StartScreen.TileSize with Double] = js.native
    
    /* 0 */ val default: typings.winrtUwp.Windows.UI.StartScreen.TileSize.default with Double = js.native
    
    /* 3 */ val square150x150: typings.winrtUwp.Windows.UI.StartScreen.TileSize.square150x150 with Double = js.native
    
    /* 1 */ val square30x30: typings.winrtUwp.Windows.UI.StartScreen.TileSize.square30x30 with Double = js.native
    
    /* 5 */ val square310x310: typings.winrtUwp.Windows.UI.StartScreen.TileSize.square310x310 with Double = js.native
    
    /* 7 */ val square44x44: typings.winrtUwp.Windows.UI.StartScreen.TileSize.square44x44 with Double = js.native
    
    /* 2 */ val square70x70: typings.winrtUwp.Windows.UI.StartScreen.TileSize.square70x70 with Double = js.native
    
    /* 6 */ val square71x71: typings.winrtUwp.Windows.UI.StartScreen.TileSize.square71x71 with Double = js.native
    
    /* 4 */ val wide310x150: typings.winrtUwp.Windows.UI.StartScreen.TileSize.wide310x150 with Double = js.native
  }
  
  /** Provides a method to delay the display of the Pin to Start flyout, as well as methods through which you can set the visual elements of the secondary tile to be presented in that flyout as well as alternate versions of the tile that can also be presented as options. */
  @JSGlobal("Windows.UI.StartScreen.VisualElementsRequest")
  @js.native
  abstract class VisualElementsRequest ()
    extends typings.winrtUwp.Windows.UI.StartScreen.VisualElementsRequest
  
  /** A deferral object used during the creation of the Pin to Start flyout. By using this object, the app can delay the display of the flyout while it gathers the information and assets that will be shown in that flyout. */
  @JSGlobal("Windows.UI.StartScreen.VisualElementsRequestDeferral")
  @js.native
  abstract class VisualElementsRequestDeferral ()
    extends typings.winrtUwp.Windows.UI.StartScreen.VisualElementsRequestDeferral
  
  /** Passed to the SecondaryTile.VisualElementsRequested event handler to provide the visual elements details. */
  @JSGlobal("Windows.UI.StartScreen.VisualElementsRequestedEventArgs")
  @js.native
  abstract class VisualElementsRequestedEventArgs ()
    extends typings.winrtUwp.Windows.UI.StartScreen.VisualElementsRequestedEventArgs
}
