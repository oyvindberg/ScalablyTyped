package typings.azureSb

import typings.azureSb.mod.Azure.ServiceBus.Dictionary
import typings.azureSb.mod.Azure.ServiceBus.ListNotificationHubsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wnsserviceMod {
  
  @JSImport("azure-sb/lib/wnsservice", JSImport.Namespace)
  @js.native
  class ^ protected () extends WnsService {
    def this(service: typings.azureSb.notificationhubserviceMod.^) = this()
  }
  
  @js.native
  trait Options extends StObject {
    
    var headers: Dictionary[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(headers: Dictionary[String]): Options = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Dictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<{  text1 :string,   text2 :string,   text3 :string,   text4 :string,   image1src :string,   image1alt :string,   image2src :string,   image2alt :string,   image3src :string,   image3alt :string,   image4src :string,   image4alt :string,   lang :string,   type :string}> */
  @js.native
  trait Payload extends StObject {
    
    var image1alt: js.UndefOr[String] = js.native
    
    var image1src: js.UndefOr[String] = js.native
    
    var image2alt: js.UndefOr[String] = js.native
    
    var image2src: js.UndefOr[String] = js.native
    
    var image3alt: js.UndefOr[String] = js.native
    
    var image3src: js.UndefOr[String] = js.native
    
    var image4alt: js.UndefOr[String] = js.native
    
    var image4src: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var text1: js.UndefOr[String] = js.native
    
    var text2: js.UndefOr[String] = js.native
    
    var text3: js.UndefOr[String] = js.native
    
    var text4: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object Payload {
    
    @scala.inline
    def apply(): Payload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Payload]
    }
    
    @scala.inline
    implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImage1alt(value: String): Self = StObject.set(x, "image1alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage1altUndefined: Self = StObject.set(x, "image1alt", js.undefined)
      
      @scala.inline
      def setImage1src(value: String): Self = StObject.set(x, "image1src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage1srcUndefined: Self = StObject.set(x, "image1src", js.undefined)
      
      @scala.inline
      def setImage2alt(value: String): Self = StObject.set(x, "image2alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage2altUndefined: Self = StObject.set(x, "image2alt", js.undefined)
      
      @scala.inline
      def setImage2src(value: String): Self = StObject.set(x, "image2src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage2srcUndefined: Self = StObject.set(x, "image2src", js.undefined)
      
      @scala.inline
      def setImage3alt(value: String): Self = StObject.set(x, "image3alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage3altUndefined: Self = StObject.set(x, "image3alt", js.undefined)
      
      @scala.inline
      def setImage3src(value: String): Self = StObject.set(x, "image3src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage3srcUndefined: Self = StObject.set(x, "image3src", js.undefined)
      
      @scala.inline
      def setImage4alt(value: String): Self = StObject.set(x, "image4alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage4altUndefined: Self = StObject.set(x, "image4alt", js.undefined)
      
      @scala.inline
      def setImage4src(value: String): Self = StObject.set(x, "image4src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage4srcUndefined: Self = StObject.set(x, "image4src", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setText1(value: String): Self = StObject.set(x, "text1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText1Undefined: Self = StObject.set(x, "text1", js.undefined)
      
      @scala.inline
      def setText2(value: String): Self = StObject.set(x, "text2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText2Undefined: Self = StObject.set(x, "text2", js.undefined)
      
      @scala.inline
      def setText3(value: String): Self = StObject.set(x, "text3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText3Undefined: Self = StObject.set(x, "text3", js.undefined)
      
      @scala.inline
      def setText4(value: String): Self = StObject.set(x, "text4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText4Undefined: Self = StObject.set(x, "text4", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait WnsService extends StObject {
    
    def createNativeRegistration(
      channel: String,
      tags: String,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def createNativeRegistration(
      channel: String,
      tags: String,
      options: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def createNativeRegistration(
      channel: String,
      tags: js.Array[String],
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def createNativeRegistration(
      channel: String,
      tags: js.Array[String],
      options: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def createOrUpdateNativeRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def createOrUpdateNativeRegistration(
      registrationId: String,
      channel: String,
      tags: String,
      options: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def createOrUpdateNativeRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def createOrUpdateNativeRegistration(
      registrationId: String,
      channel: String,
      tags: js.Array[String],
      options: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def listRegistrationsByChannel(
      channel: String,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def listRegistrationsByChannel(
      channel: String,
      options: ListNotificationHubsOptions,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    var notificationHubService: typings.azureSb.notificationhubserviceMod.^ = js.native
    
    def send(tags: String, payload: String, `type`: types): Unit = js.native
    def send(
      tags: String,
      payload: String,
      `type`: types,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def send(
      tags: String,
      payload: String,
      `type`: types,
      options: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def send(tags: js.Array[String], payload: String, `type`: types): Unit = js.native
    def send(
      tags: js.Array[String],
      payload: String,
      `type`: types,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def send(
      tags: js.Array[String],
      payload: String,
      `type`: types,
      options: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendBadge(tags: js.Array[badges], value: String): Unit = js.native
    def sendBadge(
      tags: js.Array[badges],
      value: String,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendBadge(tags: js.Array[badges], value: String, options: Options): Unit = js.native
    def sendBadge(
      tags: js.Array[badges],
      value: String,
      options: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendBadge(tags: js.Array[badges], value: Double): Unit = js.native
    def sendBadge(
      tags: js.Array[badges],
      value: Double,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendBadge(tags: js.Array[badges], value: Double, options: Options): Unit = js.native
    def sendBadge(
      tags: js.Array[badges],
      value: Double,
      options: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendBadge(tags: badges, value: String): Unit = js.native
    def sendBadge(
      tags: badges,
      value: String,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendBadge(tags: badges, value: String, options: Options): Unit = js.native
    def sendBadge(
      tags: badges,
      value: String,
      options: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendBadge(tags: badges, value: Double): Unit = js.native
    def sendBadge(
      tags: badges,
      value: Double,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendBadge(tags: badges, value: Double, options: Options): Unit = js.native
    def sendBadge(
      tags: badges,
      value: Double,
      options: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendRaw(tags: String, payload: js.Any): Unit = js.native
    def sendRaw(
      tags: String,
      payload: js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendRaw(tags: String, payload: js.Any, options: Options): Unit = js.native
    def sendRaw(
      tags: String,
      payload: js.Any,
      options: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendRaw(tags: js.Array[String], payload: js.Any): Unit = js.native
    def sendRaw(
      tags: js.Array[String],
      payload: js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendRaw(tags: js.Array[String], payload: js.Any, options: Options): Unit = js.native
    def sendRaw(
      tags: js.Array[String],
      payload: js.Any,
      options: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileSquareBlock(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareBlock(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareBlock(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquareBlock(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareBlock(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareBlock(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareBlock(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquareBlock(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileSquareImage(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareImage(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareImage(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquareImage(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareImage(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareImage(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareImage(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquareImage(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileSquarePeekImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquarePeekImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquarePeekImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileSquarePeekImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquarePeekImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquarePeekImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileSquarePeekImageAndText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquarePeekImageAndText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquarePeekImageAndText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileSquarePeekImageAndText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquarePeekImageAndText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquarePeekImageAndText04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquarePeekImageAndText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileSquareText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquareText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquareText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileSquareText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquareText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquareText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileSquareText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquareText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquareText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileSquareText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquareText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileSquareText04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileSquareText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideBlockAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideBlockAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideBlockAndText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideBlockAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideBlockAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideBlockAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideBlockAndText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideBlockAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideBlockAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideBlockAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideBlockAndText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideBlockAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideBlockAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideBlockAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideBlockAndText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideBlockAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideImage(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImage(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImage(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideImage(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImage(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImage(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImage(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideImage(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageAndText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageAndText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageAndText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageAndText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideImageCollection(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageCollection(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageCollection(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideImageCollection(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageCollection(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageCollection(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideImageCollection(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideImageCollection(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWidePeekImage01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImage01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImage01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWidePeekImage02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImage02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImage02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWidePeekImage03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImage03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImage03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWidePeekImage04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImage04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImage04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWidePeekImage05(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage05(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage05(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImage05(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage05(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage05(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage05(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImage05(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWidePeekImage06(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage06(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage06(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImage06(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage06(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage06(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImage06(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImage06(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWidePeekImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageAndText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageAndText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWidePeekImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageAndText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageAndText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWidePeekImageCollection01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageCollection01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageCollection01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWidePeekImageCollection02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageCollection02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageCollection02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWidePeekImageCollection03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageCollection03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageCollection03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWidePeekImageCollection04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageCollection04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageCollection04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWidePeekImageCollection05(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection05(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection05(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageCollection05(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection05(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection05(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection05(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageCollection05(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWidePeekImageCollection06(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection06(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection06(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageCollection06(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection06(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection06(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWidePeekImageCollection06(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWidePeekImageCollection06(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideSmallImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideSmallImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideSmallImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideSmallImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideSmallImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideSmallImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideSmallImageAndText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideSmallImageAndText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideSmallImageAndText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideSmallImageAndText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideSmallImageAndText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideSmallImageAndText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideSmallImageAndText05(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText05(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText05(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideSmallImageAndText05(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText05(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText05(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideSmallImageAndText05(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideSmallImageAndText05(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideText05(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText05(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText05(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText05(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText05(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText05(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText05(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText05(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideText06(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText06(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText06(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText06(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText06(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText06(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText06(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText06(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideText07(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText07(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText07(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText07(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText07(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText07(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText07(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText07(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideText08(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText08(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText08(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText08(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText08(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText08(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText08(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText08(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideText09(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText09(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText09(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText09(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText09(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText09(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText09(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText09(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideText10(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText10(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText10(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText10(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText10(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText10(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText10(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText10(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendTileWideText11(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText11(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText11(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText11(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText11(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText11(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendTileWideText11(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendTileWideText11(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendToastImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastImageAndText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastImageAndText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendToastImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastImageAndText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastImageAndText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendToastImageAndText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastImageAndText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastImageAndText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendToastImageAndText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastImageAndText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastImageAndText04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastImageAndText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendToastText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText01(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastText01(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText01(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastText01(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendToastText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText02(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastText02(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText02(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastText02(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendToastText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText03(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastText03(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText03(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastText03(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    
    def sendToastText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText04(tags: String, payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastText04(
      tags: String,
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
    def sendToastText04(tags: js.Array[String], payload: js.Any, optionsOrCallback: Options): Unit = js.native
    def sendToastText04(
      tags: js.Array[String],
      payload: js.Any,
      optionsOrCallback: Options,
      callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Callback */ js.Any
    ): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azureSb.azureSbStrings.none
    - typings.azureSb.azureSbStrings.activity
    - typings.azureSb.azureSbStrings.alert
    - typings.azureSb.azureSbStrings.available
    - typings.azureSb.azureSbStrings.away
    - typings.azureSb.azureSbStrings.busy
    - typings.azureSb.azureSbStrings.newMessage
    - typings.azureSb.azureSbStrings.paused
    - typings.azureSb.azureSbStrings.playing
    - typings.azureSb.azureSbStrings.unavailable
    - typings.azureSb.azureSbStrings.error
    - typings.azureSb.azureSbStrings.attention
  */
  trait badges extends StObject
  object badges {
    
    @scala.inline
    def activity: typings.azureSb.azureSbStrings.activity = "activity".asInstanceOf[typings.azureSb.azureSbStrings.activity]
    
    @scala.inline
    def alert: typings.azureSb.azureSbStrings.alert = "alert".asInstanceOf[typings.azureSb.azureSbStrings.alert]
    
    @scala.inline
    def attention: typings.azureSb.azureSbStrings.attention = "attention".asInstanceOf[typings.azureSb.azureSbStrings.attention]
    
    @scala.inline
    def available: typings.azureSb.azureSbStrings.available = "available".asInstanceOf[typings.azureSb.azureSbStrings.available]
    
    @scala.inline
    def away: typings.azureSb.azureSbStrings.away = "away".asInstanceOf[typings.azureSb.azureSbStrings.away]
    
    @scala.inline
    def busy: typings.azureSb.azureSbStrings.busy = "busy".asInstanceOf[typings.azureSb.azureSbStrings.busy]
    
    @scala.inline
    def error: typings.azureSb.azureSbStrings.error = "error".asInstanceOf[typings.azureSb.azureSbStrings.error]
    
    @scala.inline
    def newMessage: typings.azureSb.azureSbStrings.newMessage = "newMessage".asInstanceOf[typings.azureSb.azureSbStrings.newMessage]
    
    @scala.inline
    def none: typings.azureSb.azureSbStrings.none = "none".asInstanceOf[typings.azureSb.azureSbStrings.none]
    
    @scala.inline
    def paused: typings.azureSb.azureSbStrings.paused = "paused".asInstanceOf[typings.azureSb.azureSbStrings.paused]
    
    @scala.inline
    def playing: typings.azureSb.azureSbStrings.playing = "playing".asInstanceOf[typings.azureSb.azureSbStrings.playing]
    
    @scala.inline
    def unavailable: typings.azureSb.azureSbStrings.unavailable = "unavailable".asInstanceOf[typings.azureSb.azureSbStrings.unavailable]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azureSb.azureSbStrings.wnsSlashtoast
    - typings.azureSb.azureSbStrings.wnsSlashbadge
    - typings.azureSb.azureSbStrings.wnsSlashtile
    - typings.azureSb.azureSbStrings.wnsSlashraw
  */
  trait types extends StObject
  object types {
    
    @scala.inline
    def wnsSlashbadge: typings.azureSb.azureSbStrings.wnsSlashbadge = "wns/badge".asInstanceOf[typings.azureSb.azureSbStrings.wnsSlashbadge]
    
    @scala.inline
    def wnsSlashraw: typings.azureSb.azureSbStrings.wnsSlashraw = "wns/raw".asInstanceOf[typings.azureSb.azureSbStrings.wnsSlashraw]
    
    @scala.inline
    def wnsSlashtile: typings.azureSb.azureSbStrings.wnsSlashtile = "wns/tile".asInstanceOf[typings.azureSb.azureSbStrings.wnsSlashtile]
    
    @scala.inline
    def wnsSlashtoast: typings.azureSb.azureSbStrings.wnsSlashtoast = "wns/toast".asInstanceOf[typings.azureSb.azureSbStrings.wnsSlashtoast]
  }
}
