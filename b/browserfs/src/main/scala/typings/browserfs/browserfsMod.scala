package typings.browserfs

import typings.browserfs.anon.TypeofAsyncMirror
import typings.browserfs.anon.TypeofBFSUtils
import typings.browserfs.anon.TypeofDropbox
import typings.browserfs.anon.TypeofEmscripten
import typings.browserfs.anon.TypeofFolderAdapter
import typings.browserfs.anon.TypeofHTML5FS
import typings.browserfs.anon.TypeofInMemory
import typings.browserfs.anon.TypeofIndexedDB
import typings.browserfs.anon.TypeofIsoFS
import typings.browserfs.anon.TypeofLocalStorage
import typings.browserfs.anon.TypeofMountableFileSystem
import typings.browserfs.anon.TypeofOverlayFS
import typings.browserfs.anon.TypeofWorkerFS
import typings.browserfs.anon.TypeofXmlHttpRequest
import typings.browserfs.anon.TypeofZipFS
import typings.browserfs.anon.Typeofbuffer
import typings.browserfs.apiErrorMod.ErrorCode
import typings.browserfs.browserfsStrings.bfs_utils
import typings.browserfs.browserfsStrings.buffer
import typings.browserfs.browserfsStrings.fs
import typings.browserfs.browserfsStrings.path
import typings.browserfs.browserfsStrings.process
import typings.browserfs.emscriptenFsMod.default
import typings.browserfs.fSMod.FSModule
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.browserfs.fileSystemMod.FileSystem
import typings.browserfs.fileSystemMod.FileSystemConstructor
import typings.browserfs.indexedDBMod.IndexedDBFileSystem
import typings.browserfs.zipFSMod.ZipTOC
import typings.dropboxjs.Dropbox.Client
import typings.node.Buffer
import typings.node.pathMod.PlatformPath
import typings.node.processMod.global.NodeJS.Process
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserfsMod {
  
  @JSImport("browserfs/dist/node/core/browserfs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("browserfs/dist/node/core/browserfs", "BFSRequire")
  @js.native
  def BFSRequire(module: String): js.Any = js.native
  @JSImport("browserfs/dist/node/core/browserfs", "BFSRequire")
  @js.native
  def BFSRequire_bfsutils(module: bfs_utils): TypeofBFSUtils = js.native
  @JSImport("browserfs/dist/node/core/browserfs", "BFSRequire")
  @js.native
  def BFSRequire_buffer(module: buffer): Typeofbuffer = js.native
  @JSImport("browserfs/dist/node/core/browserfs", "BFSRequire")
  @js.native
  def BFSRequire_fs(module: fs): FSModule = js.native
  @JSImport("browserfs/dist/node/core/browserfs", "BFSRequire")
  @js.native
  def BFSRequire_path(module: path): PlatformPath = js.native
  @JSImport("browserfs/dist/node/core/browserfs", "BFSRequire")
  @js.native
  def BFSRequire_process(module: process): Process = js.native
  
  @JSImport("browserfs/dist/node/core/browserfs", "EmscriptenFS")
  @js.native
  class EmscriptenFS () extends default {
    def this(_FS: js.Any) = this()
    def this(_FS: js.UndefOr[scala.Nothing], _PATH: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.Any) = this()
    def this(_FS: js.UndefOr[scala.Nothing], _PATH: js.UndefOr[scala.Nothing], _ERRNO_CODES: js.Any) = this()
    def this(_FS: js.UndefOr[scala.Nothing], _PATH: js.Any, _ERRNO_CODES: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.UndefOr[scala.Nothing], _ERRNO_CODES: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.Any) = this()
    def this(
      _FS: js.UndefOr[scala.Nothing],
      _PATH: js.UndefOr[scala.Nothing],
      _ERRNO_CODES: js.UndefOr[scala.Nothing],
      nodefs: typings.browserfs.fSMod.default
    ) = this()
    def this(
      _FS: js.UndefOr[scala.Nothing],
      _PATH: js.UndefOr[scala.Nothing],
      _ERRNO_CODES: js.Any,
      nodefs: typings.browserfs.fSMod.default
    ) = this()
    def this(
      _FS: js.UndefOr[scala.Nothing],
      _PATH: js.Any,
      _ERRNO_CODES: js.UndefOr[scala.Nothing],
      nodefs: typings.browserfs.fSMod.default
    ) = this()
    def this(
      _FS: js.UndefOr[scala.Nothing],
      _PATH: js.Any,
      _ERRNO_CODES: js.Any,
      nodefs: typings.browserfs.fSMod.default
    ) = this()
    def this(
      _FS: js.Any,
      _PATH: js.UndefOr[scala.Nothing],
      _ERRNO_CODES: js.UndefOr[scala.Nothing],
      nodefs: typings.browserfs.fSMod.default
    ) = this()
    def this(
      _FS: js.Any,
      _PATH: js.UndefOr[scala.Nothing],
      _ERRNO_CODES: js.Any,
      nodefs: typings.browserfs.fSMod.default
    ) = this()
    def this(
      _FS: js.Any,
      _PATH: js.Any,
      _ERRNO_CODES: js.UndefOr[scala.Nothing],
      nodefs: typings.browserfs.fSMod.default
    ) = this()
    def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.Any, nodefs: typings.browserfs.fSMod.default) = this()
  }
  
  object Errors {
    
    @JSImport("browserfs/dist/node/core/browserfs", "Errors.ApiError")
    @js.native
    class ApiError protected ()
      extends typings.browserfs.apiErrorMod.ApiError {
      /**
        * Represents a BrowserFS error. Passed back to applications after a failed
        * call to the BrowserFS API.
        *
        * Error codes mirror those returned by regular Unix file operations, which is
        * what Node returns.
        * @constructor ApiError
        * @param type The type of the error.
        * @param [message] A descriptive error message.
        */
      def this(`type`: ErrorCode) = this()
      def this(`type`: ErrorCode, message: String) = this()
      def this(`type`: ErrorCode, message: js.UndefOr[scala.Nothing], path: String) = this()
      def this(`type`: ErrorCode, message: String, path: String) = this()
    }
    /* static members */
    object ApiError {
      
      @JSImport("browserfs/dist/node/core/browserfs", "Errors.ApiError.EEXIST")
      @js.native
      def EEXIST(path: String): typings.browserfs.apiErrorMod.ApiError = js.native
      
      @JSImport("browserfs/dist/node/core/browserfs", "Errors.ApiError.EISDIR")
      @js.native
      def EISDIR(path: String): typings.browserfs.apiErrorMod.ApiError = js.native
      
      @JSImport("browserfs/dist/node/core/browserfs", "Errors.ApiError.ENOENT")
      @js.native
      def ENOENT(path: String): typings.browserfs.apiErrorMod.ApiError = js.native
      
      @JSImport("browserfs/dist/node/core/browserfs", "Errors.ApiError.ENOTDIR")
      @js.native
      def ENOTDIR(path: String): typings.browserfs.apiErrorMod.ApiError = js.native
      
      @JSImport("browserfs/dist/node/core/browserfs", "Errors.ApiError.ENOTEMPTY")
      @js.native
      def ENOTEMPTY(path: String): typings.browserfs.apiErrorMod.ApiError = js.native
      
      @JSImport("browserfs/dist/node/core/browserfs", "Errors.ApiError.EPERM")
      @js.native
      def EPERM(path: String): typings.browserfs.apiErrorMod.ApiError = js.native
      
      @JSImport("browserfs/dist/node/core/browserfs", "Errors.ApiError.FileError")
      @js.native
      def FileError(code: ErrorCode, p: String): typings.browserfs.apiErrorMod.ApiError = js.native
      
      /**
        * Creates an ApiError object from a buffer.
        */
      @JSImport("browserfs/dist/node/core/browserfs", "Errors.ApiError.fromBuffer")
      @js.native
      def fromBuffer(buffer: Buffer): typings.browserfs.apiErrorMod.ApiError = js.native
      @JSImport("browserfs/dist/node/core/browserfs", "Errors.ApiError.fromBuffer")
      @js.native
      def fromBuffer(buffer: Buffer, i: Double): typings.browserfs.apiErrorMod.ApiError = js.native
      
      @JSImport("browserfs/dist/node/core/browserfs", "Errors.ApiError.fromJSON")
      @js.native
      def fromJSON(json: js.Any): typings.browserfs.apiErrorMod.ApiError = js.native
    }
    
    @JSImport("browserfs/dist/node/core/browserfs", "Errors.ErrorCode")
    @js.native
    object ErrorCode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.browserfs.apiErrorMod.ErrorCode with Double] = js.native
      
      /* 13 */ val EACCES: typings.browserfs.apiErrorMod.ErrorCode.EACCES with Double = js.native
      
      /* 9 */ val EBADF: typings.browserfs.apiErrorMod.ErrorCode.EBADF with Double = js.native
      
      /* 16 */ val EBUSY: typings.browserfs.apiErrorMod.ErrorCode.EBUSY with Double = js.native
      
      /* 17 */ val EEXIST: typings.browserfs.apiErrorMod.ErrorCode.EEXIST with Double = js.native
      
      /* 27 */ val EFBIG: typings.browserfs.apiErrorMod.ErrorCode.EFBIG with Double = js.native
      
      /* 22 */ val EINVAL: typings.browserfs.apiErrorMod.ErrorCode.EINVAL with Double = js.native
      
      /* 5 */ val EIO: typings.browserfs.apiErrorMod.ErrorCode.EIO with Double = js.native
      
      /* 21 */ val EISDIR: typings.browserfs.apiErrorMod.ErrorCode.EISDIR with Double = js.native
      
      /* 2 */ val ENOENT: typings.browserfs.apiErrorMod.ErrorCode.ENOENT with Double = js.native
      
      /* 28 */ val ENOSPC: typings.browserfs.apiErrorMod.ErrorCode.ENOSPC with Double = js.native
      
      /* 20 */ val ENOTDIR: typings.browserfs.apiErrorMod.ErrorCode.ENOTDIR with Double = js.native
      
      /* 39 */ val ENOTEMPTY: typings.browserfs.apiErrorMod.ErrorCode.ENOTEMPTY with Double = js.native
      
      /* 95 */ val ENOTSUP: typings.browserfs.apiErrorMod.ErrorCode.ENOTSUP with Double = js.native
      
      /* 1 */ val EPERM: typings.browserfs.apiErrorMod.ErrorCode.EPERM with Double = js.native
      
      /* 30 */ val EROFS: typings.browserfs.apiErrorMod.ErrorCode.EROFS with Double = js.native
    }
  }
  
  /**
    * @hidden
    */
  /**
    * @hidden
    */
  object FileSystem {
    
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.AsyncMirror")
    @js.native
    class AsyncMirror protected ()
      extends typings.browserfs.asyncMirrorMod.default {
      /**
        * **Deprecated; use AsyncMirror.Create() method instead.**
        *
        * Mirrors the synchronous file system into the asynchronous file system.
        *
        * **IMPORTANT**: You must call `initialize` on the file system before it can be used.
        * @param sync The synchronous file system to mirror the asynchronous file system to.
        * @param async The asynchronous file system to mirror.
        */
      def this(
        sync: typings.browserfs.fileSystemMod.FileSystem,
        async: typings.browserfs.fileSystemMod.FileSystem
      ) = this()
      def this(
        sync: typings.browserfs.fileSystemMod.FileSystem,
        async: typings.browserfs.fileSystemMod.FileSystem,
        deprecateMsg: Boolean
      ) = this()
    }
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.AsyncMirror")
    @js.native
    def AsyncMirror: TypeofAsyncMirror = js.native
    @scala.inline
    def AsyncMirror_=(x: TypeofAsyncMirror): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsyncMirror")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.Dropbox")
    @js.native
    class Dropbox protected ()
      extends typings.browserfs.dropboxMod.default {
      /**
        * **Deprecated. Please use Dropbox.Create() method instead.**
        *
        * Constructs a Dropbox-backed file system using the *authenticated* DropboxJS client.
        *
        * Note that you must use the old v0.10 version of the Dropbox JavaScript SDK.
        */
      def this(client: Client) = this()
      def this(client: Client, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.Dropbox")
    @js.native
    def Dropbox: TypeofDropbox = js.native
    @scala.inline
    def Dropbox_=(x: TypeofDropbox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dropbox")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.Emscripten")
    @js.native
    class Emscripten protected ()
      extends typings.browserfs.emscriptenMod.default {
      /**
        * Creates a BrowserFS file system for the given Emscripten file system.
        * @param _FS The Emscripten file system (`FS`).
        */
      def this(_FS: js.Any) = this()
    }
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.Emscripten")
    @js.native
    def Emscripten: TypeofEmscripten = js.native
    @scala.inline
    def Emscripten_=(x: TypeofEmscripten): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Emscripten")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.FolderAdapter")
    @js.native
    class FolderAdapter protected ()
      extends typings.browserfs.folderAdapterMod.default {
      /**
        * Wraps a file system, and uses the given folder as its root.
        *
        * @param folder The folder to use as the root directory.
        * @param wrapped The file system to wrap.
        */
      def this(folder: String, wrapped: typings.browserfs.fileSystemMod.FileSystem) = this()
    }
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.FolderAdapter")
    @js.native
    def FolderAdapter: TypeofFolderAdapter = js.native
    @scala.inline
    def FolderAdapter_=(x: TypeofFolderAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FolderAdapter")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.HTML5FS")
    @js.native
    /**
      * **Deprecated. Please use HTML5FS.Create() method instead.**
      *
      * Creates a new HTML5 FileSystem-backed BrowserFS file system of the given size
      * and storage type.
      *
      * **IMPORTANT**: You must call `allocate` on the resulting object before the file system
      * can be used.
      *
      * @param size storage quota to request, in megabytes. Allocated value may be less.
      * @param type window.PERSISTENT or window.TEMPORARY. Defaults to PERSISTENT.
      */
    class HTML5FS ()
      extends typings.browserfs.html5fsMod.default {
      def this(size: Double) = this()
      def this(size: js.UndefOr[scala.Nothing], `type`: Double) = this()
      def this(size: Double, `type`: Double) = this()
      def this(size: js.UndefOr[scala.Nothing], `type`: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(size: js.UndefOr[scala.Nothing], `type`: Double, deprecateMsg: Boolean) = this()
      def this(size: Double, `type`: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(size: Double, `type`: Double, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.HTML5FS")
    @js.native
    def HTML5FS: TypeofHTML5FS = js.native
    @scala.inline
    def HTML5FS_=(x: TypeofHTML5FS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTML5FS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.InMemory")
    @js.native
    class InMemory ()
      extends typings.browserfs.inMemoryMod.default
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.InMemory")
    @js.native
    def InMemory: TypeofInMemory = js.native
    @scala.inline
    def InMemory_=(x: TypeofInMemory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InMemory")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.IndexedDB")
    @js.native
    class IndexedDB protected ()
      extends typings.browserfs.indexedDBMod.default {
      /**
        * **Deprecated. Use IndexedDB.Create() method instead.**
        *
        * Constructs an IndexedDB file system.
        * @param cb Called once the database is instantiated and ready for use.
        *   Passes an error if there was an issue instantiating the database.
        * @param storeName The name of this file system. You can have
        *   multiple IndexedDB file systems operating at once, but each must have
        *   a different name.
        */
      def this(cb: BFSCallback[IndexedDBFileSystem]) = this()
      def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String) = this()
      def this(cb: BFSCallback[IndexedDBFileSystem], storeName: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.IndexedDB")
    @js.native
    def IndexedDB: TypeofIndexedDB = js.native
    @scala.inline
    def IndexedDB_=(x: TypeofIndexedDB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndexedDB")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.IsoFS")
    @js.native
    class IsoFS protected ()
      extends typings.browserfs.isoFSMod.default {
      /**
        * **Deprecated. Please use IsoFS.Create() method instead.**
        *
        * Constructs a read-only file system from the given ISO.
        * @param data The ISO file in a buffer.
        * @param name The name of the ISO (optional; used for debug messages / identification via getName()).
        */
      def this(data: Buffer) = this()
      def this(data: Buffer, name: String) = this()
      def this(data: Buffer, name: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(data: Buffer, name: String, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.IsoFS")
    @js.native
    def IsoFS: TypeofIsoFS = js.native
    @scala.inline
    def IsoFS_=(x: TypeofIsoFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsoFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.LocalStorage")
    @js.native
    /**
      * Creates a new LocalStorage file system using the contents of `localStorage`.
      */
    class LocalStorage ()
      extends typings.browserfs.localStorageMod.default
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.LocalStorage")
    @js.native
    def LocalStorage: TypeofLocalStorage = js.native
    @scala.inline
    def LocalStorage_=(x: TypeofLocalStorage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocalStorage")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.MountableFileSystem")
    @js.native
    /**
      * Creates a new, empty MountableFileSystem.
      */
    class MountableFileSystem ()
      extends typings.browserfs.mountableFileSystemMod.default
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.MountableFileSystem")
    @js.native
    def MountableFileSystem: TypeofMountableFileSystem = js.native
    @scala.inline
    def MountableFileSystem_=(x: TypeofMountableFileSystem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MountableFileSystem")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.OverlayFS")
    @js.native
    class OverlayFS protected ()
      extends typings.browserfs.overlayFSMod.default {
      /**
        * **Deprecated. Please use OverlayFS.Create() method instead.**
        * @param writable The file system to write modified files to.
        * @param readable The file system that initially populates this file system.
        */
      def this(
        writable: typings.browserfs.fileSystemMod.FileSystem,
        readable: typings.browserfs.fileSystemMod.FileSystem
      ) = this()
      def this(
        writable: typings.browserfs.fileSystemMod.FileSystem,
        readable: typings.browserfs.fileSystemMod.FileSystem,
        deprecateMsg: Boolean
      ) = this()
    }
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.OverlayFS")
    @js.native
    def OverlayFS: TypeofOverlayFS = js.native
    @scala.inline
    def OverlayFS_=(x: TypeofOverlayFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OverlayFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.WorkerFS")
    @js.native
    class WorkerFS protected ()
      extends typings.browserfs.workerFSMod.default {
      /**
        * **Deprecated. Please use WorkerFS.Create() method instead.**
        *
        * Constructs a new WorkerFS instance that connects with BrowserFS running on
        * the specified worker.
        */
      def this(worker: Worker) = this()
      def this(worker: Worker, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.WorkerFS")
    @js.native
    def WorkerFS: TypeofWorkerFS = js.native
    @scala.inline
    def WorkerFS_=(x: TypeofWorkerFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WorkerFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.XmlHttpRequest")
    @js.native
    class XmlHttpRequest protected ()
      extends typings.browserfs.xmlHttpRequestMod.default {
      /**
        * **Deprecated. Please use XmlHttpRequest.Create() method instead to construct XmlHttpRequest objects.**
        *
        * Constructs the file system. You must provide the directory listing as a JSON object
        * produced by the `make_xhrfs_index` script.
        *
        * **DEPRECATED:** You may pass a URL to the file index to the constructor, which will fetch the file index
        * *synchronously* and may freeze up the web page. This behavior will be removed in the next major version
        * of BrowserFS.
        *
        * @param listingUrlOrObj index object or the path to the JSON file index generated by
        *   `make_xhrfs_index`.
        * @param prefixUrl URL that is prepended to any file locations in the file index. e.g. if `prefixUrl = 'data/`, and the user wants to open the file `/foo.txt`,
        * the file system will fetch file `data/foo.txt`. The browser will access the file relative to the currrent webpage
        * URL.
        */
      def this(listingUrlOrObj: String) = this()
      def this(listingUrlOrObj: js.Object) = this()
      def this(listingUrlOrObj: String, prefixUrl: String) = this()
      def this(listingUrlOrObj: js.Object, prefixUrl: String) = this()
      def this(listingUrlOrObj: String, prefixUrl: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(listingUrlOrObj: String, prefixUrl: String, deprecateMsg: Boolean) = this()
      def this(listingUrlOrObj: js.Object, prefixUrl: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(listingUrlOrObj: js.Object, prefixUrl: String, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.XmlHttpRequest")
    @js.native
    def XmlHttpRequest: TypeofXmlHttpRequest = js.native
    @scala.inline
    def XmlHttpRequest_=(x: TypeofXmlHttpRequest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XmlHttpRequest")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.ZipFS")
    @js.native
    class ZipFS protected ()
      extends typings.browserfs.zipFSMod.default {
      def this(input: ZipTOC) = this()
      /**
        * **Deprecated. Please use ZipFS.Create() method to construct ZipFS objects.**
        */
      def this(input: Buffer) = this()
      def this(input: ZipTOC, name: String) = this()
      def this(input: Buffer, name: String) = this()
      def this(input: ZipTOC, name: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(input: ZipTOC, name: String, deprecateMsg: Boolean) = this()
      def this(input: Buffer, name: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
      def this(input: Buffer, name: String, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node/core/browserfs", "FileSystem.ZipFS")
    @js.native
    def ZipFS: TypeofZipFS = js.native
    @scala.inline
    def ZipFS_=(x: TypeofZipFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZipFS")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("browserfs/dist/node/core/browserfs", "configure")
  @js.native
  def configure(config: FileSystemConfiguration, cb: BFSOneArgCallback): Unit = js.native
  
  @JSImport("browserfs/dist/node/core/browserfs", "getFileSystem")
  @js.native
  def getFileSystem(config: FileSystemConfiguration, cb: BFSCallback[FileSystem]): Unit = js.native
  
  @JSImport("browserfs/dist/node/core/browserfs", "initialize")
  @js.native
  def initialize(rootfs: FileSystem): FileSystem = js.native
  
  @JSImport("browserfs/dist/node/core/browserfs", "install")
  @js.native
  def install(obj: js.Any): Unit = js.native
  
  @JSImport("browserfs/dist/node/core/browserfs", "registerFileSystem")
  @js.native
  def registerFileSystem(name: String, fs: FileSystemConstructor): Unit = js.native
  
  @JSImport("browserfs/dist/node/core/browserfs", "setImmediate")
  @js.native
  def setImmediate: js.Function1[/* cb */ js.Function, js.Any] = js.native
  @scala.inline
  def setImmediate_=(x: js.Function1[/* cb */ js.Function, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setImmediate")(x.asInstanceOf[js.Any])
  
  @js.native
  trait FileSystemConfiguration extends StObject {
    
    var fs: String = js.native
    
    var options: js.Any = js.native
  }
  object FileSystemConfiguration {
    
    @scala.inline
    def apply(fs: String, options: js.Any): FileSystemConfiguration = {
      val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSystemConfiguration]
    }
    
    @scala.inline
    implicit class FileSystemConfigurationMutableBuilder[Self <: FileSystemConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFs(value: String): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
