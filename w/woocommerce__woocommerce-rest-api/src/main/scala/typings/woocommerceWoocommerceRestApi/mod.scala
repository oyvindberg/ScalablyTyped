package typings.woocommerceWoocommerceRestApi

import org.scalablytyped.runtime.StringDictionary
import typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`Options Error`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@woocommerce/woocommerce-rest-api", JSImport.Default)
  @js.native
  class default protected () extends WooCommerceRestApi {
    def this(opt: WooCommerceRestApi) = this()
    /**
      * Class constructor.
      */
    def this(opt: WooCommerceRestApiOptions) = this()
  }
  
  @JSImport("@woocommerce/woocommerce-rest-api", "OptionsException")
  @js.native
  class OptionsException protected () extends StObject {
    /**
      * Constructor.
      */
    def this(message: String) = this()
    
    var message: String = js.native
    
    var name: `Options Error` = js.native
  }
  
  @js.native
  trait WooCommerceRestApi extends StObject {
    
    /**
      * Get OAuth
      */
    def _getOAuth(): js.Any = js.native
    
    /**
      * Get URL
      */
    def _getUrl(endpoint: String, params: js.Any): String = js.native
    
    /**
      * Normalize query string for oAuth
      */
    def _normalizeQueryString(url: String, params: js.Any): String = js.native
    
    /**
      * Parse params object.
      */
    def _parseParamsObject(params: js.Any, query: js.Any): WooCommerceRestApiQuery = js.native
    
    /**
      * Do requests
      */
    def _request(method: WooCommerceRestApiMethod, endpoint: String, data: js.Any, params: js.Any): js.Promise[_] = js.native
    
    /**
      * Set default options
      */
    def _setDefaultsOptions(opt: WooCommerceRestApiOptions): Unit = js.native
    
    var axiosConfig: js.Any = js.native
    
    var classVersion: String = js.native
    
    var consumerKey: String = js.native
    
    var consumerSecret: String = js.native
    
    /**
      * DELETE requests
      */
    def delete(endpoint: String): js.Promise[_] = js.native
    def delete(endpoint: String, params: js.Any): js.Promise[_] = js.native
    
    var encoding: WooCommerceRestApiEncoding = js.native
    
    /**
      * GET requests
      */
    def get(endpoint: String): js.Promise[_] = js.native
    def get(endpoint: String, params: js.Any): js.Promise[_] = js.native
    
    /**
      * OPTIONS requests
      */
    def options(endpoint: String): js.Promise[_] = js.native
    def options(endpoint: String, params: js.Any): js.Promise[_] = js.native
    
    var port: Double = js.native
    
    /**
      * POST requests
      */
    def post(endpoint: String, data: js.Any): js.Promise[_] = js.native
    def post(endpoint: String, data: js.Any, params: js.Any): js.Promise[_] = js.native
    
    /**
      * PUT requests
      */
    def put(endpoint: String, data: js.Any): js.Promise[_] = js.native
    def put(endpoint: String, data: js.Any, params: js.Any): js.Promise[_] = js.native
    
    var queryStringAuth: Boolean = js.native
    
    var timeout: Double = js.native
    
    var url: String = js.native
    
    var version: WooCommerceRestApiVersion = js.native
    
    var wpAPIPrefix: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`utf-8`
    - typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.ascii
  */
  trait WooCommerceRestApiEncoding extends StObject
  object WooCommerceRestApiEncoding {
    
    @scala.inline
    def ascii: typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.ascii = "ascii".asInstanceOf[typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.ascii]
    
    @scala.inline
    def `utf-8`: typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`utf-8` = "utf-8".asInstanceOf[typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`utf-8`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.get
    - typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.post
    - typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.put
    - typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.delete
    - typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.options
  */
  trait WooCommerceRestApiMethod extends StObject
  object WooCommerceRestApiMethod {
    
    @scala.inline
    def delete: typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.delete = "delete".asInstanceOf[typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.delete]
    
    @scala.inline
    def get: typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.get = "get".asInstanceOf[typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.get]
    
    @scala.inline
    def options: typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.options = "options".asInstanceOf[typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.options]
    
    @scala.inline
    def post: typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.post = "post".asInstanceOf[typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.post]
    
    @scala.inline
    def put: typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.put = "put".asInstanceOf[typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.put]
  }
  
  @js.native
  trait WooCommerceRestApiOptions extends StObject {
    
    /* Define the custom Axios config, also override this library options */
    var axiosConfig: js.UndefOr[js.Any] = js.native
    
    /* Your API consumer key */
    var consumerKey: String = js.native
    
    /* Your API consumer secret */
    var consumerSecret: String = js.native
    
    /* Encoding, default is 'utf-8' */
    var encoding: js.UndefOr[WooCommerceRestApiEncoding] = js.native
    
    /* Provide support for URLs with ports, eg: `8080` */
    var port: js.UndefOr[Double] = js.native
    
    /* When `true` and using under HTTPS force Basic Authentication as query string, default is `false` */
    var queryStringAuth: js.UndefOr[Boolean] = js.native
    
    /* Define the request timeout */
    var timeout: js.UndefOr[Double] = js.native
    
    /* Your Store URL, example: http://woo.dev/ */
    var url: String = js.native
    
    /* API version, default is `v3` */
    var version: js.UndefOr[WooCommerceRestApiVersion] = js.native
    
    /* Custom WP REST API URL prefix, used to support custom prefixes created with the `rest_url_prefix filter` */
    var wpAPIPrefix: js.UndefOr[String] = js.native
  }
  object WooCommerceRestApiOptions {
    
    @scala.inline
    def apply(consumerKey: String, consumerSecret: String, url: String): WooCommerceRestApiOptions = {
      val __obj = js.Dynamic.literal(consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WooCommerceRestApiOptions]
    }
    
    @scala.inline
    implicit class WooCommerceRestApiOptionsMutableBuilder[Self <: WooCommerceRestApiOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxiosConfig(value: js.Any): Self = StObject.set(x, "axiosConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxiosConfigUndefined: Self = StObject.set(x, "axiosConfig", js.undefined)
      
      @scala.inline
      def setConsumerKey(value: String): Self = StObject.set(x, "consumerKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConsumerSecret(value: String): Self = StObject.set(x, "consumerSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoding(value: WooCommerceRestApiEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setQueryStringAuth(value: Boolean): Self = StObject.set(x, "queryStringAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryStringAuthUndefined: Self = StObject.set(x, "queryStringAuth", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: WooCommerceRestApiVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setWpAPIPrefix(value: String): Self = StObject.set(x, "wpAPIPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWpAPIPrefixUndefined: Self = StObject.set(x, "wpAPIPrefix", js.undefined)
    }
  }
  
  type WooCommerceRestApiQuery = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv3
    - typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv2
    - typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv1
    - typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv3`
    - typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv2`
    - typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv1`
  */
  trait WooCommerceRestApiVersion extends StObject
  object WooCommerceRestApiVersion {
    
    @scala.inline
    def `wc-apiSlashv1`: typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv1` = "wc-api/v1".asInstanceOf[typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv1`]
    
    @scala.inline
    def `wc-apiSlashv2`: typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv2` = "wc-api/v2".asInstanceOf[typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv2`]
    
    @scala.inline
    def `wc-apiSlashv3`: typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv3` = "wc-api/v3".asInstanceOf[typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.`wc-apiSlashv3`]
    
    @scala.inline
    def wcSlashv1: typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv1 = "wc/v1".asInstanceOf[typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv1]
    
    @scala.inline
    def wcSlashv2: typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv2 = "wc/v2".asInstanceOf[typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv2]
    
    @scala.inline
    def wcSlashv3: typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv3 = "wc/v3".asInstanceOf[typings.woocommerceWoocommerceRestApi.woocommerceWoocommerceRestApiStrings.wcSlashv3]
  }
}
