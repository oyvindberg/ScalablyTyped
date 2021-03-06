package typings.fileType

import typings.fileType.fileTypeStrings.close
import typings.fileType.fileTypeStrings.data
import typings.fileType.fileTypeStrings.end
import typings.fileType.fileTypeStrings.error
import typings.fileType.fileTypeStrings.pause
import typings.fileType.fileTypeStrings.readable
import typings.fileType.fileTypeStrings.resume
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.eventsMod.EventEmitterOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.ReadableOptions
import typings.std.ArrayBuffer
import typings.std.Error
import typings.std.Set
import typings.std.Uint8Array
import typings.strtok3.typesMod.ITokenizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  /**
  	Supported file extensions.
  	*/
  @JSImport("file-type/core", "extensions")
  @js.native
  val extensions: Set[FileExtension] = js.native
  
  /**
  	Detect the file type of a `Buffer`, `Uint8Array`, or `ArrayBuffer`.
  	The file type is detected by checking the [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
  	If file access is available, it is recommended to use `.fromFile()` instead.
  	@param buffer - A buffer representing file data. It works best if the buffer contains the entire file, it may work with a smaller portion as well.
  	@returns The detected file type and MIME type, or `undefined` when there is no match.
  	*/
  @JSImport("file-type/core", "fromBuffer")
  @js.native
  def fromBuffer(buffer: Buffer): js.Promise[js.UndefOr[FileTypeResult]] = js.native
  @JSImport("file-type/core", "fromBuffer")
  @js.native
  def fromBuffer(buffer: ArrayBuffer): js.Promise[js.UndefOr[FileTypeResult]] = js.native
  @JSImport("file-type/core", "fromBuffer")
  @js.native
  def fromBuffer(buffer: Uint8Array): js.Promise[js.UndefOr[FileTypeResult]] = js.native
  
  /**
  	Detect the file type of a Node.js [readable stream](https://nodejs.org/api/stream.html#stream_class_stream_readable).
  	The file type is detected by checking the [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
  	@param stream - A readable stream representing file data.
  	@returns The detected file type and MIME type, or `undefined` when there is no match.
  	*/
  @JSImport("file-type/core", "fromStream")
  @js.native
  def fromStream(stream: Readable): js.Promise[js.UndefOr[FileTypeResult]] = js.native
  
  /**
  	Detect the file type from an [`ITokenizer`](https://github.com/Borewit/strtok3#tokenizer) source.
  	This method is used internally, but can also be used for a special "tokenizer" reader.
  	A tokenizer propagates the internal read functions, allowing alternative transport mechanisms, to access files, to be implemented and used.
  	An example is [`@tokenizer/http`](https://github.com/Borewit/tokenizer-http), which requests data using [HTTP-range-requests](https://developer.mozilla.org/en-US/docs/Web/HTTP/Range_requests). A difference with a conventional stream and the [*tokenizer*](https://github.com/Borewit/strtok3#tokenizer), is that it is able to *ignore* (seek, fast-forward) in the stream. For example, you may only need and read the first 6 bytes, and the last 128 bytes, which may be an advantage in case reading the entire file would take longer.
  	```
  	import {makeTokenizer} = require('@tokenizer/http');
  	import FileType = require('file-type');
  	const audioTrackUrl = 'https://test-audio.netlify.com/Various%20Artists%20-%202009%20-%20netBloc%20Vol%2024_%20tiuqottigeloot%20%5BMP3-V2%5D/01%20-%20Diablo%20Swing%20Orchestra%20-%20Heroines.mp3';
  	(async () => {
  		const httpTokenizer = await makeTokenizer(audioTrackUrl);
  		const fileType = await FileType.fromTokenizer(httpTokenizer);
  		console.log(fileType);
  		//=> {ext: 'mp3', mime: 'audio/mpeg'}
  	})();
  	```
  	@param tokenizer - File source implementing the tokenizer interface.
  	@returns The detected file type and MIME type, or `undefined` when there is no match.
  	*/
  @JSImport("file-type/core", "fromTokenizer")
  @js.native
  def fromTokenizer(tokenizer: ITokenizer): js.Promise[js.UndefOr[FileTypeResult]] = js.native
  
  /**
  	Supported MIME types.
  	*/
  @JSImport("file-type/core", "mimeTypes")
  @js.native
  val mimeTypes: js.Array[MimeType] = js.native
  
  /**
  	Detect the file type of a readable stream.
  	@param readableStream - A [readable stream](https://nodejs.org/api/stream.html#stream_class_stream_readable) containing a file to examine.
  	@returns A `Promise` which resolves to the original readable stream argument, but with an added `fileType` property, which is an object like the one returned from `FileType.fromFile()`.
  	@example
  	```
  	import * as fs from 'fs';
  	import * as crypto from 'crypto';
  	import fileType = require('file-type');
  	(async () => {
  		const read = fs.createReadStream('encrypted.enc');
  		const decipher = crypto.createDecipheriv(alg, key, iv);
  		const stream = await fileType.stream(read.pipe(decipher));
  		console.log(stream.fileType);
  		//=> {ext: 'mov', mime: 'video/quicktime'}
  		const write = fs.createWriteStream(`decrypted.${stream.fileType.ext}`);
  		stream.pipe(write);
  	})();
  	```
  	*/
  @JSImport("file-type/core", "stream")
  @js.native
  def stream(readableStream: Readable): js.Promise[ReadableStreamWithFileType] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.fileType.fileTypeStrings.jpg
    - typings.fileType.fileTypeStrings.png
    - typings.fileType.fileTypeStrings.apng
    - typings.fileType.fileTypeStrings.gif
    - typings.fileType.fileTypeStrings.webp
    - typings.fileType.fileTypeStrings.flif
    - typings.fileType.fileTypeStrings.cr2
    - typings.fileType.fileTypeStrings.cr3
    - typings.fileType.fileTypeStrings.orf
    - typings.fileType.fileTypeStrings.arw
    - typings.fileType.fileTypeStrings.dng
    - typings.fileType.fileTypeStrings.nef
    - typings.fileType.fileTypeStrings.rw2
    - typings.fileType.fileTypeStrings.raf
    - typings.fileType.fileTypeStrings.tif
    - typings.fileType.fileTypeStrings.bmp
    - typings.fileType.fileTypeStrings.icns
    - typings.fileType.fileTypeStrings.jxr
    - typings.fileType.fileTypeStrings.psd
    - typings.fileType.fileTypeStrings.indd
    - typings.fileType.fileTypeStrings.zip
    - typings.fileType.fileTypeStrings.tar
    - typings.fileType.fileTypeStrings.rar
    - typings.fileType.fileTypeStrings.gz
    - typings.fileType.fileTypeStrings.bz2
    - typings.fileType.fileTypeStrings.`7z`
    - typings.fileType.fileTypeStrings.dmg
    - typings.fileType.fileTypeStrings.mp4
    - typings.fileType.fileTypeStrings.mid
    - typings.fileType.fileTypeStrings.mkv
    - typings.fileType.fileTypeStrings.webm
    - typings.fileType.fileTypeStrings.mov
    - typings.fileType.fileTypeStrings.avi
    - typings.fileType.fileTypeStrings.mpg
    - typings.fileType.fileTypeStrings.mp2
    - typings.fileType.fileTypeStrings.mp3
    - typings.fileType.fileTypeStrings.m4a
    - typings.fileType.fileTypeStrings.ogg
    - typings.fileType.fileTypeStrings.opus
    - typings.fileType.fileTypeStrings.flac
    - typings.fileType.fileTypeStrings.wav
    - typings.fileType.fileTypeStrings.qcp
    - typings.fileType.fileTypeStrings.amr
    - typings.fileType.fileTypeStrings.pdf
    - typings.fileType.fileTypeStrings.epub
    - typings.fileType.fileTypeStrings.mobi
    - typings.fileType.fileTypeStrings.exe
    - typings.fileType.fileTypeStrings.swf
    - typings.fileType.fileTypeStrings.rtf
    - typings.fileType.fileTypeStrings.woff
    - typings.fileType.fileTypeStrings.woff2
    - typings.fileType.fileTypeStrings.eot
    - typings.fileType.fileTypeStrings.ttf
    - typings.fileType.fileTypeStrings.otf
    - typings.fileType.fileTypeStrings.ico
    - typings.fileType.fileTypeStrings.flv
    - typings.fileType.fileTypeStrings.ps
    - typings.fileType.fileTypeStrings.xz
    - typings.fileType.fileTypeStrings.sqlite
    - typings.fileType.fileTypeStrings.nes
    - typings.fileType.fileTypeStrings.crx
    - typings.fileType.fileTypeStrings.xpi
    - typings.fileType.fileTypeStrings.cab
    - typings.fileType.fileTypeStrings.deb
    - typings.fileType.fileTypeStrings.ar
    - typings.fileType.fileTypeStrings.rpm
    - typings.fileType.fileTypeStrings.Z
    - typings.fileType.fileTypeStrings.lz
    - typings.fileType.fileTypeStrings.cfb
    - typings.fileType.fileTypeStrings.mxf
    - typings.fileType.fileTypeStrings.mts
    - typings.fileType.fileTypeStrings.wasm
    - typings.fileType.fileTypeStrings.blend
    - typings.fileType.fileTypeStrings.bpg
    - typings.fileType.fileTypeStrings.docx
    - typings.fileType.fileTypeStrings.pptx
    - typings.fileType.fileTypeStrings.xlsx
    - typings.fileType.fileTypeStrings.`3gp`
    - typings.fileType.fileTypeStrings.`3g2`
    - typings.fileType.fileTypeStrings.jp2
    - typings.fileType.fileTypeStrings.jpm
    - typings.fileType.fileTypeStrings.jpx
    - typings.fileType.fileTypeStrings.mj2
    - typings.fileType.fileTypeStrings.aif
    - typings.fileType.fileTypeStrings.odt
    - typings.fileType.fileTypeStrings.ods
    - typings.fileType.fileTypeStrings.odp
    - typings.fileType.fileTypeStrings.xml
    - typings.fileType.fileTypeStrings.heic
    - typings.fileType.fileTypeStrings.cur
    - typings.fileType.fileTypeStrings.ktx
    - typings.fileType.fileTypeStrings.ape
    - typings.fileType.fileTypeStrings.wv
    - typings.fileType.fileTypeStrings.asf
    - typings.fileType.fileTypeStrings.dcm
    - typings.fileType.fileTypeStrings.mpc
    - typings.fileType.fileTypeStrings.ics
    - typings.fileType.fileTypeStrings.glb
    - typings.fileType.fileTypeStrings.pcap
    - typings.fileType.fileTypeStrings.dsf
    - typings.fileType.fileTypeStrings.lnk
    - typings.fileType.fileTypeStrings.alias
    - typings.fileType.fileTypeStrings.voc
    - typings.fileType.fileTypeStrings.ac3
    - typings.fileType.fileTypeStrings.m4b
    - typings.fileType.fileTypeStrings.m4p
    - typings.fileType.fileTypeStrings.m4v
    - typings.fileType.fileTypeStrings.f4a
    - typings.fileType.fileTypeStrings.f4b
    - typings.fileType.fileTypeStrings.f4p
    - typings.fileType.fileTypeStrings.f4v
    - typings.fileType.fileTypeStrings.mie
    - typings.fileType.fileTypeStrings.ogv
    - typings.fileType.fileTypeStrings.ogm
    - typings.fileType.fileTypeStrings.oga
    - typings.fileType.fileTypeStrings.spx
    - typings.fileType.fileTypeStrings.ogx
    - typings.fileType.fileTypeStrings.arrow
    - typings.fileType.fileTypeStrings.shp
    - typings.fileType.fileTypeStrings.aac
    - typings.fileType.fileTypeStrings.mp1
    - typings.fileType.fileTypeStrings.it
    - typings.fileType.fileTypeStrings.s3m
    - typings.fileType.fileTypeStrings.xm
    - typings.fileType.fileTypeStrings.ai
    - typings.fileType.fileTypeStrings.skp
    - typings.fileType.fileTypeStrings.avif
    - typings.fileType.fileTypeStrings.eps
    - typings.fileType.fileTypeStrings.lzh
    - typings.fileType.fileTypeStrings.pgp
    - typings.fileType.fileTypeStrings.asar
    - typings.fileType.fileTypeStrings.stl
  */
  trait FileExtension extends StObject
  object FileExtension {
    
    @scala.inline
    def `3g2`: typings.fileType.fileTypeStrings.`3g2` = "3g2".asInstanceOf[typings.fileType.fileTypeStrings.`3g2`]
    
    @scala.inline
    def `3gp`: typings.fileType.fileTypeStrings.`3gp` = "3gp".asInstanceOf[typings.fileType.fileTypeStrings.`3gp`]
    
    @scala.inline
    def `7z`: typings.fileType.fileTypeStrings.`7z` = "7z".asInstanceOf[typings.fileType.fileTypeStrings.`7z`]
    
    @scala.inline
    def Z: typings.fileType.fileTypeStrings.Z = "Z".asInstanceOf[typings.fileType.fileTypeStrings.Z]
    
    @scala.inline
    def aac: typings.fileType.fileTypeStrings.aac = "aac".asInstanceOf[typings.fileType.fileTypeStrings.aac]
    
    @scala.inline
    def ac3: typings.fileType.fileTypeStrings.ac3 = "ac3".asInstanceOf[typings.fileType.fileTypeStrings.ac3]
    
    @scala.inline
    def ai: typings.fileType.fileTypeStrings.ai = "ai".asInstanceOf[typings.fileType.fileTypeStrings.ai]
    
    @scala.inline
    def aif: typings.fileType.fileTypeStrings.aif = "aif".asInstanceOf[typings.fileType.fileTypeStrings.aif]
    
    @scala.inline
    def alias: typings.fileType.fileTypeStrings.alias = "alias".asInstanceOf[typings.fileType.fileTypeStrings.alias]
    
    @scala.inline
    def amr: typings.fileType.fileTypeStrings.amr = "amr".asInstanceOf[typings.fileType.fileTypeStrings.amr]
    
    @scala.inline
    def ape: typings.fileType.fileTypeStrings.ape = "ape".asInstanceOf[typings.fileType.fileTypeStrings.ape]
    
    @scala.inline
    def apng: typings.fileType.fileTypeStrings.apng = "apng".asInstanceOf[typings.fileType.fileTypeStrings.apng]
    
    @scala.inline
    def ar: typings.fileType.fileTypeStrings.ar = "ar".asInstanceOf[typings.fileType.fileTypeStrings.ar]
    
    @scala.inline
    def arrow: typings.fileType.fileTypeStrings.arrow = "arrow".asInstanceOf[typings.fileType.fileTypeStrings.arrow]
    
    @scala.inline
    def arw: typings.fileType.fileTypeStrings.arw = "arw".asInstanceOf[typings.fileType.fileTypeStrings.arw]
    
    @scala.inline
    def asar: typings.fileType.fileTypeStrings.asar = "asar".asInstanceOf[typings.fileType.fileTypeStrings.asar]
    
    @scala.inline
    def asf: typings.fileType.fileTypeStrings.asf = "asf".asInstanceOf[typings.fileType.fileTypeStrings.asf]
    
    @scala.inline
    def avi: typings.fileType.fileTypeStrings.avi = "avi".asInstanceOf[typings.fileType.fileTypeStrings.avi]
    
    @scala.inline
    def avif: typings.fileType.fileTypeStrings.avif = "avif".asInstanceOf[typings.fileType.fileTypeStrings.avif]
    
    @scala.inline
    def blend: typings.fileType.fileTypeStrings.blend = "blend".asInstanceOf[typings.fileType.fileTypeStrings.blend]
    
    @scala.inline
    def bmp: typings.fileType.fileTypeStrings.bmp = "bmp".asInstanceOf[typings.fileType.fileTypeStrings.bmp]
    
    @scala.inline
    def bpg: typings.fileType.fileTypeStrings.bpg = "bpg".asInstanceOf[typings.fileType.fileTypeStrings.bpg]
    
    @scala.inline
    def bz2: typings.fileType.fileTypeStrings.bz2 = "bz2".asInstanceOf[typings.fileType.fileTypeStrings.bz2]
    
    @scala.inline
    def cab: typings.fileType.fileTypeStrings.cab = "cab".asInstanceOf[typings.fileType.fileTypeStrings.cab]
    
    @scala.inline
    def cfb: typings.fileType.fileTypeStrings.cfb = "cfb".asInstanceOf[typings.fileType.fileTypeStrings.cfb]
    
    @scala.inline
    def cr2: typings.fileType.fileTypeStrings.cr2 = "cr2".asInstanceOf[typings.fileType.fileTypeStrings.cr2]
    
    @scala.inline
    def cr3: typings.fileType.fileTypeStrings.cr3 = "cr3".asInstanceOf[typings.fileType.fileTypeStrings.cr3]
    
    @scala.inline
    def crx: typings.fileType.fileTypeStrings.crx = "crx".asInstanceOf[typings.fileType.fileTypeStrings.crx]
    
    @scala.inline
    def cur: typings.fileType.fileTypeStrings.cur = "cur".asInstanceOf[typings.fileType.fileTypeStrings.cur]
    
    @scala.inline
    def dcm: typings.fileType.fileTypeStrings.dcm = "dcm".asInstanceOf[typings.fileType.fileTypeStrings.dcm]
    
    @scala.inline
    def deb: typings.fileType.fileTypeStrings.deb = "deb".asInstanceOf[typings.fileType.fileTypeStrings.deb]
    
    @scala.inline
    def dmg: typings.fileType.fileTypeStrings.dmg = "dmg".asInstanceOf[typings.fileType.fileTypeStrings.dmg]
    
    @scala.inline
    def dng: typings.fileType.fileTypeStrings.dng = "dng".asInstanceOf[typings.fileType.fileTypeStrings.dng]
    
    @scala.inline
    def docx: typings.fileType.fileTypeStrings.docx = "docx".asInstanceOf[typings.fileType.fileTypeStrings.docx]
    
    @scala.inline
    def dsf: typings.fileType.fileTypeStrings.dsf = "dsf".asInstanceOf[typings.fileType.fileTypeStrings.dsf]
    
    @scala.inline
    def eot: typings.fileType.fileTypeStrings.eot = "eot".asInstanceOf[typings.fileType.fileTypeStrings.eot]
    
    @scala.inline
    def eps: typings.fileType.fileTypeStrings.eps = "eps".asInstanceOf[typings.fileType.fileTypeStrings.eps]
    
    @scala.inline
    def epub: typings.fileType.fileTypeStrings.epub = "epub".asInstanceOf[typings.fileType.fileTypeStrings.epub]
    
    @scala.inline
    def exe: typings.fileType.fileTypeStrings.exe = "exe".asInstanceOf[typings.fileType.fileTypeStrings.exe]
    
    @scala.inline
    def f4a: typings.fileType.fileTypeStrings.f4a = "f4a".asInstanceOf[typings.fileType.fileTypeStrings.f4a]
    
    @scala.inline
    def f4b: typings.fileType.fileTypeStrings.f4b = "f4b".asInstanceOf[typings.fileType.fileTypeStrings.f4b]
    
    @scala.inline
    def f4p: typings.fileType.fileTypeStrings.f4p = "f4p".asInstanceOf[typings.fileType.fileTypeStrings.f4p]
    
    @scala.inline
    def f4v: typings.fileType.fileTypeStrings.f4v = "f4v".asInstanceOf[typings.fileType.fileTypeStrings.f4v]
    
    @scala.inline
    def flac: typings.fileType.fileTypeStrings.flac = "flac".asInstanceOf[typings.fileType.fileTypeStrings.flac]
    
    @scala.inline
    def flif: typings.fileType.fileTypeStrings.flif = "flif".asInstanceOf[typings.fileType.fileTypeStrings.flif]
    
    @scala.inline
    def flv: typings.fileType.fileTypeStrings.flv = "flv".asInstanceOf[typings.fileType.fileTypeStrings.flv]
    
    @scala.inline
    def gif: typings.fileType.fileTypeStrings.gif = "gif".asInstanceOf[typings.fileType.fileTypeStrings.gif]
    
    @scala.inline
    def glb: typings.fileType.fileTypeStrings.glb = "glb".asInstanceOf[typings.fileType.fileTypeStrings.glb]
    
    @scala.inline
    def gz: typings.fileType.fileTypeStrings.gz = "gz".asInstanceOf[typings.fileType.fileTypeStrings.gz]
    
    @scala.inline
    def heic: typings.fileType.fileTypeStrings.heic = "heic".asInstanceOf[typings.fileType.fileTypeStrings.heic]
    
    @scala.inline
    def icns: typings.fileType.fileTypeStrings.icns = "icns".asInstanceOf[typings.fileType.fileTypeStrings.icns]
    
    @scala.inline
    def ico: typings.fileType.fileTypeStrings.ico = "ico".asInstanceOf[typings.fileType.fileTypeStrings.ico]
    
    @scala.inline
    def ics: typings.fileType.fileTypeStrings.ics = "ics".asInstanceOf[typings.fileType.fileTypeStrings.ics]
    
    @scala.inline
    def indd: typings.fileType.fileTypeStrings.indd = "indd".asInstanceOf[typings.fileType.fileTypeStrings.indd]
    
    @scala.inline
    def it: typings.fileType.fileTypeStrings.it = "it".asInstanceOf[typings.fileType.fileTypeStrings.it]
    
    @scala.inline
    def jp2: typings.fileType.fileTypeStrings.jp2 = "jp2".asInstanceOf[typings.fileType.fileTypeStrings.jp2]
    
    @scala.inline
    def jpg: typings.fileType.fileTypeStrings.jpg = "jpg".asInstanceOf[typings.fileType.fileTypeStrings.jpg]
    
    @scala.inline
    def jpm: typings.fileType.fileTypeStrings.jpm = "jpm".asInstanceOf[typings.fileType.fileTypeStrings.jpm]
    
    @scala.inline
    def jpx: typings.fileType.fileTypeStrings.jpx = "jpx".asInstanceOf[typings.fileType.fileTypeStrings.jpx]
    
    @scala.inline
    def jxr: typings.fileType.fileTypeStrings.jxr = "jxr".asInstanceOf[typings.fileType.fileTypeStrings.jxr]
    
    @scala.inline
    def ktx: typings.fileType.fileTypeStrings.ktx = "ktx".asInstanceOf[typings.fileType.fileTypeStrings.ktx]
    
    @scala.inline
    def lnk: typings.fileType.fileTypeStrings.lnk = "lnk".asInstanceOf[typings.fileType.fileTypeStrings.lnk]
    
    @scala.inline
    def lz: typings.fileType.fileTypeStrings.lz = "lz".asInstanceOf[typings.fileType.fileTypeStrings.lz]
    
    @scala.inline
    def lzh: typings.fileType.fileTypeStrings.lzh = "lzh".asInstanceOf[typings.fileType.fileTypeStrings.lzh]
    
    @scala.inline
    def m4a: typings.fileType.fileTypeStrings.m4a = "m4a".asInstanceOf[typings.fileType.fileTypeStrings.m4a]
    
    @scala.inline
    def m4b: typings.fileType.fileTypeStrings.m4b = "m4b".asInstanceOf[typings.fileType.fileTypeStrings.m4b]
    
    @scala.inline
    def m4p: typings.fileType.fileTypeStrings.m4p = "m4p".asInstanceOf[typings.fileType.fileTypeStrings.m4p]
    
    @scala.inline
    def m4v: typings.fileType.fileTypeStrings.m4v = "m4v".asInstanceOf[typings.fileType.fileTypeStrings.m4v]
    
    @scala.inline
    def mid: typings.fileType.fileTypeStrings.mid = "mid".asInstanceOf[typings.fileType.fileTypeStrings.mid]
    
    @scala.inline
    def mie: typings.fileType.fileTypeStrings.mie = "mie".asInstanceOf[typings.fileType.fileTypeStrings.mie]
    
    @scala.inline
    def mj2: typings.fileType.fileTypeStrings.mj2 = "mj2".asInstanceOf[typings.fileType.fileTypeStrings.mj2]
    
    @scala.inline
    def mkv: typings.fileType.fileTypeStrings.mkv = "mkv".asInstanceOf[typings.fileType.fileTypeStrings.mkv]
    
    @scala.inline
    def mobi: typings.fileType.fileTypeStrings.mobi = "mobi".asInstanceOf[typings.fileType.fileTypeStrings.mobi]
    
    @scala.inline
    def mov: typings.fileType.fileTypeStrings.mov = "mov".asInstanceOf[typings.fileType.fileTypeStrings.mov]
    
    @scala.inline
    def mp1: typings.fileType.fileTypeStrings.mp1 = "mp1".asInstanceOf[typings.fileType.fileTypeStrings.mp1]
    
    @scala.inline
    def mp2: typings.fileType.fileTypeStrings.mp2 = "mp2".asInstanceOf[typings.fileType.fileTypeStrings.mp2]
    
    @scala.inline
    def mp3: typings.fileType.fileTypeStrings.mp3 = "mp3".asInstanceOf[typings.fileType.fileTypeStrings.mp3]
    
    @scala.inline
    def mp4: typings.fileType.fileTypeStrings.mp4 = "mp4".asInstanceOf[typings.fileType.fileTypeStrings.mp4]
    
    @scala.inline
    def mpc: typings.fileType.fileTypeStrings.mpc = "mpc".asInstanceOf[typings.fileType.fileTypeStrings.mpc]
    
    @scala.inline
    def mpg: typings.fileType.fileTypeStrings.mpg = "mpg".asInstanceOf[typings.fileType.fileTypeStrings.mpg]
    
    @scala.inline
    def mts: typings.fileType.fileTypeStrings.mts = "mts".asInstanceOf[typings.fileType.fileTypeStrings.mts]
    
    @scala.inline
    def mxf: typings.fileType.fileTypeStrings.mxf = "mxf".asInstanceOf[typings.fileType.fileTypeStrings.mxf]
    
    @scala.inline
    def nef: typings.fileType.fileTypeStrings.nef = "nef".asInstanceOf[typings.fileType.fileTypeStrings.nef]
    
    @scala.inline
    def nes: typings.fileType.fileTypeStrings.nes = "nes".asInstanceOf[typings.fileType.fileTypeStrings.nes]
    
    @scala.inline
    def odp: typings.fileType.fileTypeStrings.odp = "odp".asInstanceOf[typings.fileType.fileTypeStrings.odp]
    
    @scala.inline
    def ods: typings.fileType.fileTypeStrings.ods = "ods".asInstanceOf[typings.fileType.fileTypeStrings.ods]
    
    @scala.inline
    def odt: typings.fileType.fileTypeStrings.odt = "odt".asInstanceOf[typings.fileType.fileTypeStrings.odt]
    
    @scala.inline
    def oga: typings.fileType.fileTypeStrings.oga = "oga".asInstanceOf[typings.fileType.fileTypeStrings.oga]
    
    @scala.inline
    def ogg: typings.fileType.fileTypeStrings.ogg = "ogg".asInstanceOf[typings.fileType.fileTypeStrings.ogg]
    
    @scala.inline
    def ogm: typings.fileType.fileTypeStrings.ogm = "ogm".asInstanceOf[typings.fileType.fileTypeStrings.ogm]
    
    @scala.inline
    def ogv: typings.fileType.fileTypeStrings.ogv = "ogv".asInstanceOf[typings.fileType.fileTypeStrings.ogv]
    
    @scala.inline
    def ogx: typings.fileType.fileTypeStrings.ogx = "ogx".asInstanceOf[typings.fileType.fileTypeStrings.ogx]
    
    @scala.inline
    def opus: typings.fileType.fileTypeStrings.opus = "opus".asInstanceOf[typings.fileType.fileTypeStrings.opus]
    
    @scala.inline
    def orf: typings.fileType.fileTypeStrings.orf = "orf".asInstanceOf[typings.fileType.fileTypeStrings.orf]
    
    @scala.inline
    def otf: typings.fileType.fileTypeStrings.otf = "otf".asInstanceOf[typings.fileType.fileTypeStrings.otf]
    
    @scala.inline
    def pcap: typings.fileType.fileTypeStrings.pcap = "pcap".asInstanceOf[typings.fileType.fileTypeStrings.pcap]
    
    @scala.inline
    def pdf: typings.fileType.fileTypeStrings.pdf = "pdf".asInstanceOf[typings.fileType.fileTypeStrings.pdf]
    
    @scala.inline
    def pgp: typings.fileType.fileTypeStrings.pgp = "pgp".asInstanceOf[typings.fileType.fileTypeStrings.pgp]
    
    @scala.inline
    def png: typings.fileType.fileTypeStrings.png = "png".asInstanceOf[typings.fileType.fileTypeStrings.png]
    
    @scala.inline
    def pptx: typings.fileType.fileTypeStrings.pptx = "pptx".asInstanceOf[typings.fileType.fileTypeStrings.pptx]
    
    @scala.inline
    def ps: typings.fileType.fileTypeStrings.ps = "ps".asInstanceOf[typings.fileType.fileTypeStrings.ps]
    
    @scala.inline
    def psd: typings.fileType.fileTypeStrings.psd = "psd".asInstanceOf[typings.fileType.fileTypeStrings.psd]
    
    @scala.inline
    def qcp: typings.fileType.fileTypeStrings.qcp = "qcp".asInstanceOf[typings.fileType.fileTypeStrings.qcp]
    
    @scala.inline
    def raf: typings.fileType.fileTypeStrings.raf = "raf".asInstanceOf[typings.fileType.fileTypeStrings.raf]
    
    @scala.inline
    def rar: typings.fileType.fileTypeStrings.rar = "rar".asInstanceOf[typings.fileType.fileTypeStrings.rar]
    
    @scala.inline
    def rpm: typings.fileType.fileTypeStrings.rpm = "rpm".asInstanceOf[typings.fileType.fileTypeStrings.rpm]
    
    @scala.inline
    def rtf: typings.fileType.fileTypeStrings.rtf = "rtf".asInstanceOf[typings.fileType.fileTypeStrings.rtf]
    
    @scala.inline
    def rw2: typings.fileType.fileTypeStrings.rw2 = "rw2".asInstanceOf[typings.fileType.fileTypeStrings.rw2]
    
    @scala.inline
    def s3m: typings.fileType.fileTypeStrings.s3m = "s3m".asInstanceOf[typings.fileType.fileTypeStrings.s3m]
    
    @scala.inline
    def shp: typings.fileType.fileTypeStrings.shp = "shp".asInstanceOf[typings.fileType.fileTypeStrings.shp]
    
    @scala.inline
    def skp: typings.fileType.fileTypeStrings.skp = "skp".asInstanceOf[typings.fileType.fileTypeStrings.skp]
    
    @scala.inline
    def spx: typings.fileType.fileTypeStrings.spx = "spx".asInstanceOf[typings.fileType.fileTypeStrings.spx]
    
    @scala.inline
    def sqlite: typings.fileType.fileTypeStrings.sqlite = "sqlite".asInstanceOf[typings.fileType.fileTypeStrings.sqlite]
    
    @scala.inline
    def stl: typings.fileType.fileTypeStrings.stl = "stl".asInstanceOf[typings.fileType.fileTypeStrings.stl]
    
    @scala.inline
    def swf: typings.fileType.fileTypeStrings.swf = "swf".asInstanceOf[typings.fileType.fileTypeStrings.swf]
    
    @scala.inline
    def tar: typings.fileType.fileTypeStrings.tar = "tar".asInstanceOf[typings.fileType.fileTypeStrings.tar]
    
    @scala.inline
    def tif: typings.fileType.fileTypeStrings.tif = "tif".asInstanceOf[typings.fileType.fileTypeStrings.tif]
    
    @scala.inline
    def ttf: typings.fileType.fileTypeStrings.ttf = "ttf".asInstanceOf[typings.fileType.fileTypeStrings.ttf]
    
    @scala.inline
    def voc: typings.fileType.fileTypeStrings.voc = "voc".asInstanceOf[typings.fileType.fileTypeStrings.voc]
    
    @scala.inline
    def wasm: typings.fileType.fileTypeStrings.wasm = "wasm".asInstanceOf[typings.fileType.fileTypeStrings.wasm]
    
    @scala.inline
    def wav: typings.fileType.fileTypeStrings.wav = "wav".asInstanceOf[typings.fileType.fileTypeStrings.wav]
    
    @scala.inline
    def webm: typings.fileType.fileTypeStrings.webm = "webm".asInstanceOf[typings.fileType.fileTypeStrings.webm]
    
    @scala.inline
    def webp: typings.fileType.fileTypeStrings.webp = "webp".asInstanceOf[typings.fileType.fileTypeStrings.webp]
    
    @scala.inline
    def woff: typings.fileType.fileTypeStrings.woff = "woff".asInstanceOf[typings.fileType.fileTypeStrings.woff]
    
    @scala.inline
    def woff2: typings.fileType.fileTypeStrings.woff2 = "woff2".asInstanceOf[typings.fileType.fileTypeStrings.woff2]
    
    @scala.inline
    def wv: typings.fileType.fileTypeStrings.wv = "wv".asInstanceOf[typings.fileType.fileTypeStrings.wv]
    
    @scala.inline
    def xlsx: typings.fileType.fileTypeStrings.xlsx = "xlsx".asInstanceOf[typings.fileType.fileTypeStrings.xlsx]
    
    @scala.inline
    def xm: typings.fileType.fileTypeStrings.xm = "xm".asInstanceOf[typings.fileType.fileTypeStrings.xm]
    
    @scala.inline
    def xml: typings.fileType.fileTypeStrings.xml = "xml".asInstanceOf[typings.fileType.fileTypeStrings.xml]
    
    @scala.inline
    def xpi: typings.fileType.fileTypeStrings.xpi = "xpi".asInstanceOf[typings.fileType.fileTypeStrings.xpi]
    
    @scala.inline
    def xz: typings.fileType.fileTypeStrings.xz = "xz".asInstanceOf[typings.fileType.fileTypeStrings.xz]
    
    @scala.inline
    def zip: typings.fileType.fileTypeStrings.zip = "zip".asInstanceOf[typings.fileType.fileTypeStrings.zip]
  }
  
  @js.native
  trait FileTypeResult extends StObject {
    
    /**
    		One of the supported [file types](https://github.com/sindresorhus/file-type#supported-file-types).
    		*/
    val ext: FileExtension = js.native
    
    /**
    		The detected [MIME type](https://en.wikipedia.org/wiki/Internet_media_type).
    		*/
    val mime: MimeType = js.native
  }
  object FileTypeResult {
    
    @scala.inline
    def apply(ext: FileExtension, mime: MimeType): FileTypeResult = {
      val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileTypeResult]
    }
    
    @scala.inline
    implicit class FileTypeResultMutableBuilder[Self <: FileTypeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExt(value: FileExtension): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMime(value: MimeType): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fileType.fileTypeStrings.imageSlashjpeg
    - typings.fileType.fileTypeStrings.imageSlashpng
    - typings.fileType.fileTypeStrings.imageSlashgif
    - typings.fileType.fileTypeStrings.imageSlashwebp
    - typings.fileType.fileTypeStrings.imageSlashflif
    - typings.fileType.fileTypeStrings.`imageSlashx-canon-cr2`
    - typings.fileType.fileTypeStrings.`imageSlashx-canon-cr3`
    - typings.fileType.fileTypeStrings.imageSlashtiff
    - typings.fileType.fileTypeStrings.imageSlashbmp
    - typings.fileType.fileTypeStrings.imageSlashicns
    - typings.fileType.fileTypeStrings.`imageSlashvndDotms-photo`
    - typings.fileType.fileTypeStrings.imageSlashvndDotadobeDotphotoshop
    - typings.fileType.fileTypeStrings.`applicationSlashx-indesign`
    - typings.fileType.fileTypeStrings.applicationSlashepubPlussignzip
    - typings.fileType.fileTypeStrings.`applicationSlashx-xpinstall`
    - typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDottext
    - typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotspreadsheet
    - typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotpresentation
    - typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotwordprocessingmlDotdocument`
    - typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotpresentationmlDotpresentation`
    - typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotspreadsheetmlDotsheet`
    - typings.fileType.fileTypeStrings.applicationSlashzip
    - typings.fileType.fileTypeStrings.`applicationSlashx-tar`
    - typings.fileType.fileTypeStrings.`applicationSlashx-rar-compressed`
    - typings.fileType.fileTypeStrings.applicationSlashgzip
    - typings.fileType.fileTypeStrings.`applicationSlashx-bzip2`
    - typings.fileType.fileTypeStrings.`applicationSlashx-7z-compressed`
    - typings.fileType.fileTypeStrings.`applicationSlashx-apple-diskimage`
    - typings.fileType.fileTypeStrings.videoSlashmp4
    - typings.fileType.fileTypeStrings.audioSlashmidi
    - typings.fileType.fileTypeStrings.`videoSlashx-matroska`
    - typings.fileType.fileTypeStrings.videoSlashwebm
    - typings.fileType.fileTypeStrings.videoSlashquicktime
    - typings.fileType.fileTypeStrings.videoSlashvndDotavi
    - typings.fileType.fileTypeStrings.audioSlashvndDotwave
    - typings.fileType.fileTypeStrings.audioSlashqcelp
    - typings.fileType.fileTypeStrings.`audioSlashx-ms-asf`
    - typings.fileType.fileTypeStrings.`videoSlashx-ms-asf`
    - typings.fileType.fileTypeStrings.`applicationSlashvndDotms-asf`
    - typings.fileType.fileTypeStrings.videoSlashmpeg
    - typings.fileType.fileTypeStrings.videoSlash3gpp
    - typings.fileType.fileTypeStrings.audioSlashmpeg
    - typings.fileType.fileTypeStrings.audioSlashmp4
    - typings.fileType.fileTypeStrings.audioSlashopus
    - typings.fileType.fileTypeStrings.videoSlashogg
    - typings.fileType.fileTypeStrings.audioSlashogg
    - typings.fileType.fileTypeStrings.applicationSlashogg
    - typings.fileType.fileTypeStrings.`audioSlashx-flac`
    - typings.fileType.fileTypeStrings.audioSlashape
    - typings.fileType.fileTypeStrings.audioSlashwavpack
    - typings.fileType.fileTypeStrings.audioSlashamr
    - typings.fileType.fileTypeStrings.applicationSlashpdf
    - typings.fileType.fileTypeStrings.`applicationSlashx-msdownload`
    - typings.fileType.fileTypeStrings.`applicationSlashx-shockwave-flash`
    - typings.fileType.fileTypeStrings.applicationSlashrtf
    - typings.fileType.fileTypeStrings.applicationSlashwasm
    - typings.fileType.fileTypeStrings.fontSlashwoff
    - typings.fileType.fileTypeStrings.fontSlashwoff2
    - typings.fileType.fileTypeStrings.`applicationSlashvndDotms-fontobject`
    - typings.fileType.fileTypeStrings.fontSlashttf
    - typings.fileType.fileTypeStrings.fontSlashotf
    - typings.fileType.fileTypeStrings.`imageSlashx-icon`
    - typings.fileType.fileTypeStrings.`videoSlashx-flv`
    - typings.fileType.fileTypeStrings.applicationSlashpostscript
    - typings.fileType.fileTypeStrings.applicationSlasheps
    - typings.fileType.fileTypeStrings.`applicationSlashx-xz`
    - typings.fileType.fileTypeStrings.`applicationSlashx-sqlite3`
    - typings.fileType.fileTypeStrings.`applicationSlashx-nintendo-nes-rom`
    - typings.fileType.fileTypeStrings.`applicationSlashx-google-chrome-extension`
    - typings.fileType.fileTypeStrings.`applicationSlashvndDotms-cab-compressed`
    - typings.fileType.fileTypeStrings.`applicationSlashx-deb`
    - typings.fileType.fileTypeStrings.`applicationSlashx-unix-archive`
    - typings.fileType.fileTypeStrings.`applicationSlashx-rpm`
    - typings.fileType.fileTypeStrings.`applicationSlashx-compress`
    - typings.fileType.fileTypeStrings.`applicationSlashx-lzip`
    - typings.fileType.fileTypeStrings.`applicationSlashx-cfb`
    - typings.fileType.fileTypeStrings.`applicationSlashx-mie`
    - typings.fileType.fileTypeStrings.`applicationSlashx-apache-arrow`
    - typings.fileType.fileTypeStrings.applicationSlashmxf
    - typings.fileType.fileTypeStrings.videoSlashmp2t
    - typings.fileType.fileTypeStrings.`applicationSlashx-blender`
    - typings.fileType.fileTypeStrings.imageSlashbpg
    - typings.fileType.fileTypeStrings.imageSlashjp2
    - typings.fileType.fileTypeStrings.imageSlashjpx
    - typings.fileType.fileTypeStrings.imageSlashjpm
    - typings.fileType.fileTypeStrings.imageSlashmj2
    - typings.fileType.fileTypeStrings.audioSlashaiff
    - typings.fileType.fileTypeStrings.applicationSlashxml
    - typings.fileType.fileTypeStrings.`applicationSlashx-mobipocket-ebook`
    - typings.fileType.fileTypeStrings.imageSlashheif
    - typings.fileType.fileTypeStrings.`imageSlashheif-sequence`
    - typings.fileType.fileTypeStrings.imageSlashheic
    - typings.fileType.fileTypeStrings.`imageSlashheic-sequence`
    - typings.fileType.fileTypeStrings.imageSlashktx
    - typings.fileType.fileTypeStrings.applicationSlashdicom
    - typings.fileType.fileTypeStrings.`audioSlashx-musepack`
    - typings.fileType.fileTypeStrings.textSlashcalendar
    - typings.fileType.fileTypeStrings.`modelSlashgltf-binary`
    - typings.fileType.fileTypeStrings.applicationSlashvndDottcpdumpDotpcap
    - typings.fileType.fileTypeStrings.`audioSlashx-dsf`
    - typings.fileType.fileTypeStrings.applicationSlashxDotmsDotshortcut
    - typings.fileType.fileTypeStrings.applicationSlashxDotappleDotalias
    - typings.fileType.fileTypeStrings.`audioSlashx-voc`
    - typings.fileType.fileTypeStrings.`audioSlashvndDotdolbyDotdd-raw`
    - typings.fileType.fileTypeStrings.`audioSlashx-m4a`
    - typings.fileType.fileTypeStrings.imageSlashapng
    - typings.fileType.fileTypeStrings.`imageSlashx-olympus-orf`
    - typings.fileType.fileTypeStrings.`imageSlashx-sony-arw`
    - typings.fileType.fileTypeStrings.`imageSlashx-adobe-dng`
    - typings.fileType.fileTypeStrings.`imageSlashx-nikon-nef`
    - typings.fileType.fileTypeStrings.`imageSlashx-panasonic-rw2`
    - typings.fileType.fileTypeStrings.`imageSlashx-fujifilm-raf`
    - typings.fileType.fileTypeStrings.`videoSlashx-m4v`
    - typings.fileType.fileTypeStrings.videoSlash3gpp2
    - typings.fileType.fileTypeStrings.`applicationSlashx-esri-shape`
    - typings.fileType.fileTypeStrings.audioSlashaac
    - typings.fileType.fileTypeStrings.`audioSlashx-it`
    - typings.fileType.fileTypeStrings.`audioSlashx-s3m`
    - typings.fileType.fileTypeStrings.`audioSlashx-xm`
    - typings.fileType.fileTypeStrings.videoSlashMP1S
    - typings.fileType.fileTypeStrings.videoSlashMP2P
    - typings.fileType.fileTypeStrings.applicationSlashvndDotsketchupDotskp
    - typings.fileType.fileTypeStrings.imageSlashavif
    - typings.fileType.fileTypeStrings.`applicationSlashx-lzh-compressed`
    - typings.fileType.fileTypeStrings.`applicationSlashpgp-encrypted`
    - typings.fileType.fileTypeStrings.`applicationSlashx-asar`
    - typings.fileType.fileTypeStrings.modelSlashstl
  */
  trait MimeType extends StObject
  object MimeType {
    
    @scala.inline
    def applicationSlashdicom: typings.fileType.fileTypeStrings.applicationSlashdicom = "application/dicom".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashdicom]
    
    @scala.inline
    def applicationSlasheps: typings.fileType.fileTypeStrings.applicationSlasheps = "application/eps".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlasheps]
    
    @scala.inline
    def applicationSlashepubPlussignzip: typings.fileType.fileTypeStrings.applicationSlashepubPlussignzip = "application/epub+zip".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashepubPlussignzip]
    
    @scala.inline
    def applicationSlashgzip: typings.fileType.fileTypeStrings.applicationSlashgzip = "application/gzip".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashgzip]
    
    @scala.inline
    def applicationSlashmxf: typings.fileType.fileTypeStrings.applicationSlashmxf = "application/mxf".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashmxf]
    
    @scala.inline
    def applicationSlashogg: typings.fileType.fileTypeStrings.applicationSlashogg = "application/ogg".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashogg]
    
    @scala.inline
    def applicationSlashpdf: typings.fileType.fileTypeStrings.applicationSlashpdf = "application/pdf".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashpdf]
    
    @scala.inline
    def `applicationSlashpgp-encrypted`: typings.fileType.fileTypeStrings.`applicationSlashpgp-encrypted` = "application/pgp-encrypted".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashpgp-encrypted`]
    
    @scala.inline
    def applicationSlashpostscript: typings.fileType.fileTypeStrings.applicationSlashpostscript = "application/postscript".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashpostscript]
    
    @scala.inline
    def applicationSlashrtf: typings.fileType.fileTypeStrings.applicationSlashrtf = "application/rtf".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashrtf]
    
    @scala.inline
    def `applicationSlashvndDotms-asf`: typings.fileType.fileTypeStrings.`applicationSlashvndDotms-asf` = "application/vnd.ms-asf".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashvndDotms-asf`]
    
    @scala.inline
    def `applicationSlashvndDotms-cab-compressed`: typings.fileType.fileTypeStrings.`applicationSlashvndDotms-cab-compressed` = "application/vnd.ms-cab-compressed".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashvndDotms-cab-compressed`]
    
    @scala.inline
    def `applicationSlashvndDotms-fontobject`: typings.fileType.fileTypeStrings.`applicationSlashvndDotms-fontobject` = "application/vnd.ms-fontobject".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashvndDotms-fontobject`]
    
    @scala.inline
    def applicationSlashvndDotoasisDotopendocumentDotpresentation: typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotpresentation = "application/vnd.oasis.opendocument.presentation".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotpresentation]
    
    @scala.inline
    def applicationSlashvndDotoasisDotopendocumentDotspreadsheet: typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotspreadsheet = "application/vnd.oasis.opendocument.spreadsheet".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDotspreadsheet]
    
    @scala.inline
    def applicationSlashvndDotoasisDotopendocumentDottext: typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDottext = "application/vnd.oasis.opendocument.text".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashvndDotoasisDotopendocumentDottext]
    
    @scala.inline
    def `applicationSlashvndDotopenxmlformats-officedocumentDotpresentationmlDotpresentation`: typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotpresentationmlDotpresentation` = "application/vnd.openxmlformats-officedocument.presentationml.presentation".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotpresentationmlDotpresentation`]
    
    @scala.inline
    def `applicationSlashvndDotopenxmlformats-officedocumentDotspreadsheetmlDotsheet`: typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotspreadsheetmlDotsheet` = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotspreadsheetmlDotsheet`]
    
    @scala.inline
    def `applicationSlashvndDotopenxmlformats-officedocumentDotwordprocessingmlDotdocument`: typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotwordprocessingmlDotdocument` = "application/vnd.openxmlformats-officedocument.wordprocessingml.document".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashvndDotopenxmlformats-officedocumentDotwordprocessingmlDotdocument`]
    
    @scala.inline
    def applicationSlashvndDotsketchupDotskp: typings.fileType.fileTypeStrings.applicationSlashvndDotsketchupDotskp = "application/vnd.sketchup.skp".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashvndDotsketchupDotskp]
    
    @scala.inline
    def applicationSlashvndDottcpdumpDotpcap: typings.fileType.fileTypeStrings.applicationSlashvndDottcpdumpDotpcap = "application/vnd.tcpdump.pcap".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashvndDottcpdumpDotpcap]
    
    @scala.inline
    def applicationSlashwasm: typings.fileType.fileTypeStrings.applicationSlashwasm = "application/wasm".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashwasm]
    
    @scala.inline
    def `applicationSlashx-7z-compressed`: typings.fileType.fileTypeStrings.`applicationSlashx-7z-compressed` = "application/x-7z-compressed".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-7z-compressed`]
    
    @scala.inline
    def `applicationSlashx-apache-arrow`: typings.fileType.fileTypeStrings.`applicationSlashx-apache-arrow` = "application/x-apache-arrow".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-apache-arrow`]
    
    @scala.inline
    def `applicationSlashx-apple-diskimage`: typings.fileType.fileTypeStrings.`applicationSlashx-apple-diskimage` = "application/x-apple-diskimage".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-apple-diskimage`]
    
    @scala.inline
    def `applicationSlashx-asar`: typings.fileType.fileTypeStrings.`applicationSlashx-asar` = "application/x-asar".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-asar`]
    
    @scala.inline
    def `applicationSlashx-blender`: typings.fileType.fileTypeStrings.`applicationSlashx-blender` = "application/x-blender".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-blender`]
    
    @scala.inline
    def `applicationSlashx-bzip2`: typings.fileType.fileTypeStrings.`applicationSlashx-bzip2` = "application/x-bzip2".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-bzip2`]
    
    @scala.inline
    def `applicationSlashx-cfb`: typings.fileType.fileTypeStrings.`applicationSlashx-cfb` = "application/x-cfb".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-cfb`]
    
    @scala.inline
    def `applicationSlashx-compress`: typings.fileType.fileTypeStrings.`applicationSlashx-compress` = "application/x-compress".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-compress`]
    
    @scala.inline
    def `applicationSlashx-deb`: typings.fileType.fileTypeStrings.`applicationSlashx-deb` = "application/x-deb".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-deb`]
    
    @scala.inline
    def `applicationSlashx-esri-shape`: typings.fileType.fileTypeStrings.`applicationSlashx-esri-shape` = "application/x-esri-shape".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-esri-shape`]
    
    @scala.inline
    def `applicationSlashx-google-chrome-extension`: typings.fileType.fileTypeStrings.`applicationSlashx-google-chrome-extension` = "application/x-google-chrome-extension".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-google-chrome-extension`]
    
    @scala.inline
    def `applicationSlashx-indesign`: typings.fileType.fileTypeStrings.`applicationSlashx-indesign` = "application/x-indesign".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-indesign`]
    
    @scala.inline
    def `applicationSlashx-lzh-compressed`: typings.fileType.fileTypeStrings.`applicationSlashx-lzh-compressed` = "application/x-lzh-compressed".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-lzh-compressed`]
    
    @scala.inline
    def `applicationSlashx-lzip`: typings.fileType.fileTypeStrings.`applicationSlashx-lzip` = "application/x-lzip".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-lzip`]
    
    @scala.inline
    def `applicationSlashx-mie`: typings.fileType.fileTypeStrings.`applicationSlashx-mie` = "application/x-mie".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-mie`]
    
    @scala.inline
    def `applicationSlashx-mobipocket-ebook`: typings.fileType.fileTypeStrings.`applicationSlashx-mobipocket-ebook` = "application/x-mobipocket-ebook".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-mobipocket-ebook`]
    
    @scala.inline
    def `applicationSlashx-msdownload`: typings.fileType.fileTypeStrings.`applicationSlashx-msdownload` = "application/x-msdownload".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-msdownload`]
    
    @scala.inline
    def `applicationSlashx-nintendo-nes-rom`: typings.fileType.fileTypeStrings.`applicationSlashx-nintendo-nes-rom` = "application/x-nintendo-nes-rom".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-nintendo-nes-rom`]
    
    @scala.inline
    def `applicationSlashx-rar-compressed`: typings.fileType.fileTypeStrings.`applicationSlashx-rar-compressed` = "application/x-rar-compressed".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-rar-compressed`]
    
    @scala.inline
    def `applicationSlashx-rpm`: typings.fileType.fileTypeStrings.`applicationSlashx-rpm` = "application/x-rpm".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-rpm`]
    
    @scala.inline
    def `applicationSlashx-shockwave-flash`: typings.fileType.fileTypeStrings.`applicationSlashx-shockwave-flash` = "application/x-shockwave-flash".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-shockwave-flash`]
    
    @scala.inline
    def `applicationSlashx-sqlite3`: typings.fileType.fileTypeStrings.`applicationSlashx-sqlite3` = "application/x-sqlite3".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-sqlite3`]
    
    @scala.inline
    def `applicationSlashx-tar`: typings.fileType.fileTypeStrings.`applicationSlashx-tar` = "application/x-tar".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-tar`]
    
    @scala.inline
    def `applicationSlashx-unix-archive`: typings.fileType.fileTypeStrings.`applicationSlashx-unix-archive` = "application/x-unix-archive".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-unix-archive`]
    
    @scala.inline
    def `applicationSlashx-xpinstall`: typings.fileType.fileTypeStrings.`applicationSlashx-xpinstall` = "application/x-xpinstall".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-xpinstall`]
    
    @scala.inline
    def `applicationSlashx-xz`: typings.fileType.fileTypeStrings.`applicationSlashx-xz` = "application/x-xz".asInstanceOf[typings.fileType.fileTypeStrings.`applicationSlashx-xz`]
    
    @scala.inline
    def applicationSlashxDotappleDotalias: typings.fileType.fileTypeStrings.applicationSlashxDotappleDotalias = "application/x.apple.alias".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashxDotappleDotalias]
    
    @scala.inline
    def applicationSlashxDotmsDotshortcut: typings.fileType.fileTypeStrings.applicationSlashxDotmsDotshortcut = "application/x.ms.shortcut".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashxDotmsDotshortcut]
    
    @scala.inline
    def applicationSlashxml: typings.fileType.fileTypeStrings.applicationSlashxml = "application/xml".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashxml]
    
    @scala.inline
    def applicationSlashzip: typings.fileType.fileTypeStrings.applicationSlashzip = "application/zip".asInstanceOf[typings.fileType.fileTypeStrings.applicationSlashzip]
    
    @scala.inline
    def audioSlashaac: typings.fileType.fileTypeStrings.audioSlashaac = "audio/aac".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashaac]
    
    @scala.inline
    def audioSlashaiff: typings.fileType.fileTypeStrings.audioSlashaiff = "audio/aiff".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashaiff]
    
    @scala.inline
    def audioSlashamr: typings.fileType.fileTypeStrings.audioSlashamr = "audio/amr".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashamr]
    
    @scala.inline
    def audioSlashape: typings.fileType.fileTypeStrings.audioSlashape = "audio/ape".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashape]
    
    @scala.inline
    def audioSlashmidi: typings.fileType.fileTypeStrings.audioSlashmidi = "audio/midi".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashmidi]
    
    @scala.inline
    def audioSlashmp4: typings.fileType.fileTypeStrings.audioSlashmp4 = "audio/mp4".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashmp4]
    
    @scala.inline
    def audioSlashmpeg: typings.fileType.fileTypeStrings.audioSlashmpeg = "audio/mpeg".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashmpeg]
    
    @scala.inline
    def audioSlashogg: typings.fileType.fileTypeStrings.audioSlashogg = "audio/ogg".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashogg]
    
    @scala.inline
    def audioSlashopus: typings.fileType.fileTypeStrings.audioSlashopus = "audio/opus".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashopus]
    
    @scala.inline
    def audioSlashqcelp: typings.fileType.fileTypeStrings.audioSlashqcelp = "audio/qcelp".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashqcelp]
    
    @scala.inline
    def `audioSlashvndDotdolbyDotdd-raw`: typings.fileType.fileTypeStrings.`audioSlashvndDotdolbyDotdd-raw` = "audio/vnd.dolby.dd-raw".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashvndDotdolbyDotdd-raw`]
    
    @scala.inline
    def audioSlashvndDotwave: typings.fileType.fileTypeStrings.audioSlashvndDotwave = "audio/vnd.wave".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashvndDotwave]
    
    @scala.inline
    def audioSlashwavpack: typings.fileType.fileTypeStrings.audioSlashwavpack = "audio/wavpack".asInstanceOf[typings.fileType.fileTypeStrings.audioSlashwavpack]
    
    @scala.inline
    def `audioSlashx-dsf`: typings.fileType.fileTypeStrings.`audioSlashx-dsf` = "audio/x-dsf".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-dsf`]
    
    @scala.inline
    def `audioSlashx-flac`: typings.fileType.fileTypeStrings.`audioSlashx-flac` = "audio/x-flac".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-flac`]
    
    @scala.inline
    def `audioSlashx-it`: typings.fileType.fileTypeStrings.`audioSlashx-it` = "audio/x-it".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-it`]
    
    @scala.inline
    def `audioSlashx-m4a`: typings.fileType.fileTypeStrings.`audioSlashx-m4a` = "audio/x-m4a".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-m4a`]
    
    @scala.inline
    def `audioSlashx-ms-asf`: typings.fileType.fileTypeStrings.`audioSlashx-ms-asf` = "audio/x-ms-asf".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-ms-asf`]
    
    @scala.inline
    def `audioSlashx-musepack`: typings.fileType.fileTypeStrings.`audioSlashx-musepack` = "audio/x-musepack".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-musepack`]
    
    @scala.inline
    def `audioSlashx-s3m`: typings.fileType.fileTypeStrings.`audioSlashx-s3m` = "audio/x-s3m".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-s3m`]
    
    @scala.inline
    def `audioSlashx-voc`: typings.fileType.fileTypeStrings.`audioSlashx-voc` = "audio/x-voc".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-voc`]
    
    @scala.inline
    def `audioSlashx-xm`: typings.fileType.fileTypeStrings.`audioSlashx-xm` = "audio/x-xm".asInstanceOf[typings.fileType.fileTypeStrings.`audioSlashx-xm`]
    
    @scala.inline
    def fontSlashotf: typings.fileType.fileTypeStrings.fontSlashotf = "font/otf".asInstanceOf[typings.fileType.fileTypeStrings.fontSlashotf]
    
    @scala.inline
    def fontSlashttf: typings.fileType.fileTypeStrings.fontSlashttf = "font/ttf".asInstanceOf[typings.fileType.fileTypeStrings.fontSlashttf]
    
    @scala.inline
    def fontSlashwoff: typings.fileType.fileTypeStrings.fontSlashwoff = "font/woff".asInstanceOf[typings.fileType.fileTypeStrings.fontSlashwoff]
    
    @scala.inline
    def fontSlashwoff2: typings.fileType.fileTypeStrings.fontSlashwoff2 = "font/woff2".asInstanceOf[typings.fileType.fileTypeStrings.fontSlashwoff2]
    
    @scala.inline
    def imageSlashapng: typings.fileType.fileTypeStrings.imageSlashapng = "image/apng".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashapng]
    
    @scala.inline
    def imageSlashavif: typings.fileType.fileTypeStrings.imageSlashavif = "image/avif".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashavif]
    
    @scala.inline
    def imageSlashbmp: typings.fileType.fileTypeStrings.imageSlashbmp = "image/bmp".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashbmp]
    
    @scala.inline
    def imageSlashbpg: typings.fileType.fileTypeStrings.imageSlashbpg = "image/bpg".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashbpg]
    
    @scala.inline
    def imageSlashflif: typings.fileType.fileTypeStrings.imageSlashflif = "image/flif".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashflif]
    
    @scala.inline
    def imageSlashgif: typings.fileType.fileTypeStrings.imageSlashgif = "image/gif".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashgif]
    
    @scala.inline
    def imageSlashheic: typings.fileType.fileTypeStrings.imageSlashheic = "image/heic".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashheic]
    
    @scala.inline
    def `imageSlashheic-sequence`: typings.fileType.fileTypeStrings.`imageSlashheic-sequence` = "image/heic-sequence".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashheic-sequence`]
    
    @scala.inline
    def imageSlashheif: typings.fileType.fileTypeStrings.imageSlashheif = "image/heif".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashheif]
    
    @scala.inline
    def `imageSlashheif-sequence`: typings.fileType.fileTypeStrings.`imageSlashheif-sequence` = "image/heif-sequence".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashheif-sequence`]
    
    @scala.inline
    def imageSlashicns: typings.fileType.fileTypeStrings.imageSlashicns = "image/icns".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashicns]
    
    @scala.inline
    def imageSlashjp2: typings.fileType.fileTypeStrings.imageSlashjp2 = "image/jp2".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashjp2]
    
    @scala.inline
    def imageSlashjpeg: typings.fileType.fileTypeStrings.imageSlashjpeg = "image/jpeg".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashjpeg]
    
    @scala.inline
    def imageSlashjpm: typings.fileType.fileTypeStrings.imageSlashjpm = "image/jpm".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashjpm]
    
    @scala.inline
    def imageSlashjpx: typings.fileType.fileTypeStrings.imageSlashjpx = "image/jpx".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashjpx]
    
    @scala.inline
    def imageSlashktx: typings.fileType.fileTypeStrings.imageSlashktx = "image/ktx".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashktx]
    
    @scala.inline
    def imageSlashmj2: typings.fileType.fileTypeStrings.imageSlashmj2 = "image/mj2".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashmj2]
    
    @scala.inline
    def imageSlashpng: typings.fileType.fileTypeStrings.imageSlashpng = "image/png".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashpng]
    
    @scala.inline
    def imageSlashtiff: typings.fileType.fileTypeStrings.imageSlashtiff = "image/tiff".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashtiff]
    
    @scala.inline
    def imageSlashvndDotadobeDotphotoshop: typings.fileType.fileTypeStrings.imageSlashvndDotadobeDotphotoshop = "image/vnd.adobe.photoshop".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashvndDotadobeDotphotoshop]
    
    @scala.inline
    def `imageSlashvndDotms-photo`: typings.fileType.fileTypeStrings.`imageSlashvndDotms-photo` = "image/vnd.ms-photo".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashvndDotms-photo`]
    
    @scala.inline
    def imageSlashwebp: typings.fileType.fileTypeStrings.imageSlashwebp = "image/webp".asInstanceOf[typings.fileType.fileTypeStrings.imageSlashwebp]
    
    @scala.inline
    def `imageSlashx-adobe-dng`: typings.fileType.fileTypeStrings.`imageSlashx-adobe-dng` = "image/x-adobe-dng".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-adobe-dng`]
    
    @scala.inline
    def `imageSlashx-canon-cr2`: typings.fileType.fileTypeStrings.`imageSlashx-canon-cr2` = "image/x-canon-cr2".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-canon-cr2`]
    
    @scala.inline
    def `imageSlashx-canon-cr3`: typings.fileType.fileTypeStrings.`imageSlashx-canon-cr3` = "image/x-canon-cr3".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-canon-cr3`]
    
    @scala.inline
    def `imageSlashx-fujifilm-raf`: typings.fileType.fileTypeStrings.`imageSlashx-fujifilm-raf` = "image/x-fujifilm-raf".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-fujifilm-raf`]
    
    @scala.inline
    def `imageSlashx-icon`: typings.fileType.fileTypeStrings.`imageSlashx-icon` = "image/x-icon".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-icon`]
    
    @scala.inline
    def `imageSlashx-nikon-nef`: typings.fileType.fileTypeStrings.`imageSlashx-nikon-nef` = "image/x-nikon-nef".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-nikon-nef`]
    
    @scala.inline
    def `imageSlashx-olympus-orf`: typings.fileType.fileTypeStrings.`imageSlashx-olympus-orf` = "image/x-olympus-orf".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-olympus-orf`]
    
    @scala.inline
    def `imageSlashx-panasonic-rw2`: typings.fileType.fileTypeStrings.`imageSlashx-panasonic-rw2` = "image/x-panasonic-rw2".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-panasonic-rw2`]
    
    @scala.inline
    def `imageSlashx-sony-arw`: typings.fileType.fileTypeStrings.`imageSlashx-sony-arw` = "image/x-sony-arw".asInstanceOf[typings.fileType.fileTypeStrings.`imageSlashx-sony-arw`]
    
    @scala.inline
    def `modelSlashgltf-binary`: typings.fileType.fileTypeStrings.`modelSlashgltf-binary` = "model/gltf-binary".asInstanceOf[typings.fileType.fileTypeStrings.`modelSlashgltf-binary`]
    
    @scala.inline
    def modelSlashstl: typings.fileType.fileTypeStrings.modelSlashstl = "model/stl".asInstanceOf[typings.fileType.fileTypeStrings.modelSlashstl]
    
    @scala.inline
    def textSlashcalendar: typings.fileType.fileTypeStrings.textSlashcalendar = "text/calendar".asInstanceOf[typings.fileType.fileTypeStrings.textSlashcalendar]
    
    @scala.inline
    def videoSlash3gpp: typings.fileType.fileTypeStrings.videoSlash3gpp = "video/3gpp".asInstanceOf[typings.fileType.fileTypeStrings.videoSlash3gpp]
    
    @scala.inline
    def videoSlash3gpp2: typings.fileType.fileTypeStrings.videoSlash3gpp2 = "video/3gpp2".asInstanceOf[typings.fileType.fileTypeStrings.videoSlash3gpp2]
    
    @scala.inline
    def videoSlashMP1S: typings.fileType.fileTypeStrings.videoSlashMP1S = "video/MP1S".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashMP1S]
    
    @scala.inline
    def videoSlashMP2P: typings.fileType.fileTypeStrings.videoSlashMP2P = "video/MP2P".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashMP2P]
    
    @scala.inline
    def videoSlashmp2t: typings.fileType.fileTypeStrings.videoSlashmp2t = "video/mp2t".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashmp2t]
    
    @scala.inline
    def videoSlashmp4: typings.fileType.fileTypeStrings.videoSlashmp4 = "video/mp4".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashmp4]
    
    @scala.inline
    def videoSlashmpeg: typings.fileType.fileTypeStrings.videoSlashmpeg = "video/mpeg".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashmpeg]
    
    @scala.inline
    def videoSlashogg: typings.fileType.fileTypeStrings.videoSlashogg = "video/ogg".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashogg]
    
    @scala.inline
    def videoSlashquicktime: typings.fileType.fileTypeStrings.videoSlashquicktime = "video/quicktime".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashquicktime]
    
    @scala.inline
    def videoSlashvndDotavi: typings.fileType.fileTypeStrings.videoSlashvndDotavi = "video/vnd.avi".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashvndDotavi]
    
    @scala.inline
    def videoSlashwebm: typings.fileType.fileTypeStrings.videoSlashwebm = "video/webm".asInstanceOf[typings.fileType.fileTypeStrings.videoSlashwebm]
    
    @scala.inline
    def `videoSlashx-flv`: typings.fileType.fileTypeStrings.`videoSlashx-flv` = "video/x-flv".asInstanceOf[typings.fileType.fileTypeStrings.`videoSlashx-flv`]
    
    @scala.inline
    def `videoSlashx-m4v`: typings.fileType.fileTypeStrings.`videoSlashx-m4v` = "video/x-m4v".asInstanceOf[typings.fileType.fileTypeStrings.`videoSlashx-m4v`]
    
    @scala.inline
    def `videoSlashx-matroska`: typings.fileType.fileTypeStrings.`videoSlashx-matroska` = "video/x-matroska".asInstanceOf[typings.fileType.fileTypeStrings.`videoSlashx-matroska`]
    
    @scala.inline
    def `videoSlashx-ms-asf`: typings.fileType.fileTypeStrings.`videoSlashx-ms-asf` = "video/x-ms-asf".asInstanceOf[typings.fileType.fileTypeStrings.`videoSlashx-ms-asf`]
  }
  
  /* Inlined node.stream.Readable & { readonly fileType :file-type.file-type/core.FileTypeResult | undefined} */
  @js.native
  trait ReadableStreamWithFileType extends StObject {
    
    def _destroy(error: Null, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    def _destroy(error: Error, callback: js.Function1[/* error */ js.UndefOr[Error | Null], Unit]): Unit = js.native
    
    def _read(size: Double): Unit = js.native
    
    def addListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    /**
      * Event emitter
      * The defined events on documents including:
      * 1. close
      * 2. data
      * 3. end
      * 4. error
      * 5. pause
      * 6. readable
      * 7. resume
      */
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def destroy(): Unit = js.native
    def destroy(error: Error): Unit = js.native
    
    var destroyed: Boolean = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_data(event: data, chunk: js.Any): Boolean = js.native
    @JSName("emit")
    def emit_end(event: end): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: Error): Boolean = js.native
    @JSName("emit")
    def emit_pause(event: pause): Boolean = js.native
    @JSName("emit")
    def emit_readable(event: readable): Boolean = js.native
    @JSName("emit")
    def emit_resume(event: resume): Boolean = js.native
    
    def eventNames(): js.Array[String | js.Symbol] = js.native
    
    val fileType: js.UndefOr[FileTypeResult] = js.native
    
    def getMaxListeners(): Double = js.native
    
    def isPaused(): Boolean = js.native
    
    def listenerCount(event: String): Double = js.native
    def listenerCount(event: js.Symbol): Double = js.native
    
    def listeners(event: String): js.Array[js.Function] = js.native
    def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def once(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("once")
    def once_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("once")
    def once_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def pause(): this.type = js.native
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    def prependListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def prependOnceListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: BufferEncoding): Boolean = js.native
    
    def rawListeners(event: String): js.Array[js.Function] = js.native
    def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    
    def read(): js.Any = js.native
    def read(size: Double): js.Any = js.native
    @JSName("read")
    def read_Union(): String | Buffer = js.native
    @JSName("read")
    def read_Union(size: Double): String | Buffer = js.native
    
    var readable: Boolean = js.native
    
    val readableEncoding: BufferEncoding | Null = js.native
    
    val readableEnded: Boolean = js.native
    
    val readableFlowing: Boolean | Null = js.native
    
    val readableHighWaterMark: Double = js.native
    
    val readableLength: Double = js.native
    
    val readableObjectMode: Boolean = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    def removeAllListeners(event: js.Symbol): this.type = js.native
    
    def removeListener(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_data(event: data, listener: js.Function1[/* chunk */ js.Any, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_end(event: end, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_pause(event: pause, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_resume(event: resume, listener: js.Function0[Unit]): this.type = js.native
    
    def resume(): this.type = js.native
    
    def setEncoding(encoding: BufferEncoding): this.type = js.native
    
    def setMaxListeners(n: Double): this.type = js.native
    
    def unpipe(): this.type = js.native
    def unpipe(destination: WritableStream): this.type = js.native
    
    def unshift(chunk: String): Unit = js.native
    def unshift(chunk: String, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: js.Any): Unit = js.native
    def unshift(chunk: js.Any, encoding: BufferEncoding): Unit = js.native
    def unshift(chunk: Uint8Array): Unit = js.native
    def unshift(chunk: Uint8Array, encoding: BufferEncoding): Unit = js.native
    
    def wrap(oldStream: ReadableStream): this.type = js.native
  }
}
