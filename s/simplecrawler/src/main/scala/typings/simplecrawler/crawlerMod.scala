package typings.simplecrawler

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.Agent
import typings.node.httpMod.IncomingMessage
import typings.simplecrawler.anon.Dictkey
import typings.simplecrawler.cacheMod.default
import typings.simplecrawler.queueMod.QueueItem
import typings.simplecrawler.simplecrawlerStrings.complete
import typings.simplecrawler.simplecrawlerStrings.cookieerror
import typings.simplecrawler.simplecrawlerStrings.crawlstart
import typings.simplecrawler.simplecrawlerStrings.discoverycomplete
import typings.simplecrawler.simplecrawlerStrings.downloadconditionerror
import typings.simplecrawler.simplecrawlerStrings.downloadprevented
import typings.simplecrawler.simplecrawlerStrings.fetch404
import typings.simplecrawler.simplecrawlerStrings.fetch410
import typings.simplecrawler.simplecrawlerStrings.fetchclienterror
import typings.simplecrawler.simplecrawlerStrings.fetchcomplete
import typings.simplecrawler.simplecrawlerStrings.fetchconditionerror
import typings.simplecrawler.simplecrawlerStrings.fetchdataerror
import typings.simplecrawler.simplecrawlerStrings.fetchdisallowed
import typings.simplecrawler.simplecrawlerStrings.fetcherror
import typings.simplecrawler.simplecrawlerStrings.fetchheaders
import typings.simplecrawler.simplecrawlerStrings.fetchprevented
import typings.simplecrawler.simplecrawlerStrings.fetchredirect
import typings.simplecrawler.simplecrawlerStrings.fetchstart
import typings.simplecrawler.simplecrawlerStrings.fetchtimeout
import typings.simplecrawler.simplecrawlerStrings.gziperror
import typings.simplecrawler.simplecrawlerStrings.invaliddomain
import typings.simplecrawler.simplecrawlerStrings.notmodified
import typings.simplecrawler.simplecrawlerStrings.queueadd
import typings.simplecrawler.simplecrawlerStrings.queueduplicate
import typings.simplecrawler.simplecrawlerStrings.queueerror
import typings.simplecrawler.simplecrawlerStrings.robotstxterror
import typings.std.Date
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crawlerMod {
  
  @JSImport("simplecrawler/crawler", JSImport.Namespace)
  @js.native
  class ^ protected () extends Crawler {
    def this(initialURL: String) = this()
  }
  
  @js.native
  trait Crawler extends EventEmitter {
    
    var acceptCookies: Boolean = js.native
    
    def addDownloadCondition(callback: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]): Double = js.native
    
    def addFetchCondition(callback: js.Function2[/* queueItem */ QueueItem, /* referrerQueueItem */ QueueItem, Unit]): Double = js.native
    
    var allowInitialDomainChange: Boolean = js.native
    
    var allowedProtocols: js.Array[RegExp] = js.native
    
    var authPass: js.UndefOr[String] = js.native
    
    var authUser: js.UndefOr[String] = js.native
    
    var cache: js.UndefOr[default] = js.native
    
    def cleanExpandResources(urlMatch: js.Array[String], queueItem: QueueItem): js.Array[String] = js.native
    
    def cleanURL(url: String, queueItem: QueueItem): String = js.native
    
    var cookies: typings.simplecrawler.cookiesMod.default = js.native
    
    /**
      * @deprecated
      */
    def crawl(): scala.Nothing = js.native
    
    var customHeaders: js.Object = js.native
    
    def decodeBuffer(buffer: Buffer): String = js.native
    def decodeBuffer(buffer: Buffer, contentTypeHeader: String): String = js.native
    
    var decodeResponses: Boolean = js.native
    
    var decompressResponses: Boolean = js.native
    
    var discoverRegex: js.Array[js.Function0[Unit] | RegExp] = js.native
    
    def discoverResources(resourceText: String): js.Array[String] = js.native
    
    def domainValid(host: String): Boolean = js.native
    
    var domainWhitelist: js.Array[String] = js.native
    
    var downloadUnsupported: Boolean = js.native
    
    def fetchQueueItem(queueItem: QueueItem): this.type = js.native
    
    var filterByDomain: Boolean = js.native
    
    def getRequestOptions(queueItem: QueueItem): RequestOptions = js.native
    
    def getRobotsTxt(
      url: String,
      callback: js.Function3[
          /* error */ js.UndefOr[Error], 
          /* href */ js.UndefOr[String], 
          /* responseBody */ js.UndefOr[String], 
          Unit
        ]
    ): this.type = js.native
    
    def handleResponse(queueItem: QueueItem, response: IncomingMessage): String = js.native
    def handleResponse(queueItem: QueueItem, response: IncomingMessage, timeCommenced: Date): String = js.native
    
    var host: String = js.native
    
    var httpAgent: Agent = js.native
    
    var httpsAgent: typings.node.httpsMod.Agent = js.native
    
    var ignoreInvalidSSL: Boolean = js.native
    
    var ignoreWWWDomain: Boolean = js.native
    
    var initialURL: String = js.native
    
    var interval: Double = js.native
    
    var listenerTTL: Double = js.native
    
    var maxConcurrency: Double = js.native
    
    var maxDepth: Double = js.native
    
    var maxResourceSize: Double = js.native
    
    def mimeTypeSupported(mimetype: String): Boolean = js.native
    
    var needsAuth: Boolean = js.native
    
    @JSName("on")
    def on_complete(event: complete, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_cookieerror(
      event: cookieerror,
      listener: js.Function3[/* queueItem */ QueueItem, /* error */ Error, /* cookie */ String, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_crawlstart(event: crawlstart, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_discoverycomplete(
      event: discoverycomplete,
      listener: js.Function2[/* queueItem */ QueueItem, /* resources */ js.Array[String], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_downloadconditionerror(
      event: downloadconditionerror,
      listener: js.Function2[/* queueItem */ QueueItem, /* error */ js.Any, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_downloadprevented(
      event: downloadprevented,
      listener: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetch404(
      event: fetch404,
      listener: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetch410(
      event: fetch410,
      listener: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchclienterror(
      event: fetchclienterror,
      listener: js.Function2[/* queueItem */ QueueItem, /* error */ js.UndefOr[js.Object], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchcomplete(
      event: fetchcomplete,
      listener: js.Function3[
          /* queueItem */ QueueItem, 
          /* responseBody */ String | Buffer, 
          /* response */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_fetchconditionerror(
      event: fetchconditionerror,
      listener: js.Function2[/* queueItem */ QueueItem, /* error */ js.Any, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchdataerror(
      event: fetchdataerror,
      listener: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchdisallowed(event: fetchdisallowed, listener: js.Function1[/* queueItem */ QueueItem, Unit]): this.type = js.native
    @JSName("on")
    def on_fetcherror(
      event: fetcherror,
      listener: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchheaders(
      event: fetchheaders,
      listener: js.Function2[/* queueItem */ QueueItem, /* response */ IncomingMessage, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchprevented(
      event: fetchprevented,
      listener: js.Function2[/* queueItem */ QueueItem, /* fetchCondition */ js.Function0[Boolean], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchredirect(
      event: fetchredirect,
      listener: js.Function3[
          /* queueItem */ QueueItem, 
          /* redirectQueueItem */ QueueItem, 
          /* response */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_fetchstart(
      event: fetchstart,
      listener: js.Function2[/* queueItem */ QueueItem, /* requestOptions */ RequestOptions, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fetchtimeout(event: fetchtimeout, listener: js.Function2[/* queueItem */ QueueItem, /* timeout */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_gziperror(
      event: gziperror,
      listener: js.Function3[
          /* queueItem */ QueueItem, 
          /* responseBody */ String | Buffer, 
          /* response */ IncomingMessage, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_invaliddomain(event: invaliddomain, listener: js.Function1[/* queueItem */ QueueItem, Unit]): this.type = js.native
    @JSName("on")
    def on_notmodified(
      event: notmodified,
      listener: js.Function3[
          /* queueItem */ QueueItem, 
          /* response */ IncomingMessage, 
          /* cacheObject */ default, 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_queueadd(
      event: queueadd,
      listener: js.Function2[/* queueItem */ js.UndefOr[QueueItem], /* referrer */ js.UndefOr[QueueItem], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_queueduplicate(event: queueduplicate, listener: js.Function1[/* queueItem */ QueueItem, Unit]): this.type = js.native
    @JSName("on")
    def on_queueerror(
      event: queueerror,
      listener: js.Function2[/* error */ js.UndefOr[QueueItem], /* queueItem */ js.UndefOr[QueueItem], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_robotstxterror(event: robotstxterror, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
    
    var parseHTMLComments: Boolean = js.native
    
    var parseScriptTags: Boolean = js.native
    
    def processURL(url: String): QueueItem = js.native
    def processURL(url: String, referer: QueueItem): QueueItem = js.native
    
    def protocolSupported(url: String): Boolean = js.native
    
    var proxyHostname: String = js.native
    
    var proxyPass: js.UndefOr[String] = js.native
    
    var proxyPort: Double = js.native
    
    var proxyUser: js.UndefOr[String] = js.native
    
    var queue: typings.simplecrawler.queueMod.default = js.native
    
    def queueLinkedItems(resourceData: String, queueItem: QueueItem): this.type = js.native
    def queueLinkedItems(resourceData: Buffer, queueItem: QueueItem): this.type = js.native
    
    def queueURL(url: String): Boolean = js.native
    def queueURL(url: String, referrer: js.UndefOr[scala.Nothing], force: Boolean): Boolean = js.native
    def queueURL(url: String, referrer: QueueItem): Boolean = js.native
    def queueURL(url: String, referrer: QueueItem, force: Boolean): Boolean = js.native
    
    def removeDownloadCondition(id: js.Function0[Unit]): Boolean = js.native
    def removeDownloadCondition(id: Double): Boolean = js.native
    
    def removeFetchCondition(id: js.Function0[Unit]): Boolean = js.native
    def removeFetchCondition(id: Double): Boolean = js.native
    
    var respectRobotsTxt: Boolean = js.native
    
    var scanSubdomains: Boolean = js.native
    
    var sortQueryParameters: Boolean = js.native
    
    def start(): this.type = js.native
    
    def stop(): this.type = js.native
    def stop(abortRequestsInFlight: Boolean): this.type = js.native
    
    var stripQuerystring: Boolean = js.native
    
    var stripWWWDomain: Boolean = js.native
    
    var supportedMimeTypes: js.Array[String | RegExp] = js.native
    
    var timeout: Double = js.native
    
    var urlEncoding: String = js.native
    
    def urlIsAllowed(url: String): Boolean = js.native
    
    var useProxy: Boolean = js.native
    
    var userAgent: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.simplecrawler.simplecrawlerStrings.GET
    - typings.simplecrawler.simplecrawlerStrings.POST
    - typings.simplecrawler.simplecrawlerStrings.HEAD
    - typings.simplecrawler.simplecrawlerStrings.PUT
    - typings.simplecrawler.simplecrawlerStrings.DELETE
    - typings.simplecrawler.simplecrawlerStrings.CONNECT
    - typings.simplecrawler.simplecrawlerStrings.OPTIONS
    - typings.simplecrawler.simplecrawlerStrings.TRACE
    - typings.simplecrawler.simplecrawlerStrings.PATCH
  */
  trait HTTPMethods extends StObject
  object HTTPMethods {
    
    @scala.inline
    def CONNECT: typings.simplecrawler.simplecrawlerStrings.CONNECT = "CONNECT".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.CONNECT]
    
    @scala.inline
    def DELETE: typings.simplecrawler.simplecrawlerStrings.DELETE = "DELETE".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.DELETE]
    
    @scala.inline
    def GET: typings.simplecrawler.simplecrawlerStrings.GET = "GET".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.GET]
    
    @scala.inline
    def HEAD: typings.simplecrawler.simplecrawlerStrings.HEAD = "HEAD".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.HEAD]
    
    @scala.inline
    def OPTIONS: typings.simplecrawler.simplecrawlerStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.OPTIONS]
    
    @scala.inline
    def PATCH: typings.simplecrawler.simplecrawlerStrings.PATCH = "PATCH".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.PATCH]
    
    @scala.inline
    def POST: typings.simplecrawler.simplecrawlerStrings.POST = "POST".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.POST]
    
    @scala.inline
    def PUT: typings.simplecrawler.simplecrawlerStrings.PUT = "PUT".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.PUT]
    
    @scala.inline
    def TRACE: typings.simplecrawler.simplecrawlerStrings.TRACE = "TRACE".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.TRACE]
  }
  
  @js.native
  trait RequestOptions extends StObject {
    
    var agent: Agent | typings.node.httpsMod.Agent = js.native
    
    var headers: Dictkey = js.native
    
    var host: String = js.native
    
    var method: HTTPMethods = js.native
    
    var port: js.UndefOr[Double] = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply(agent: Agent | typings.node.httpsMod.Agent, headers: Dictkey, host: String, method: HTTPMethods): RequestOptions = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | typings.node.httpsMod.Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Dictkey): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: HTTPMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
}
