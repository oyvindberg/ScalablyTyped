package typings.slackMock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(): typings.slackMock.mod.Instance_ = typings.slackMock.mod.^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.slackMock.mod.Instance_]
  @scala.inline
  def apply(config: typings.slackMock.mod.ConfigOptions): typings.slackMock.mod.Instance_ = typings.slackMock.mod.^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[typings.slackMock.mod.Instance_]
  
  type EventHttpHeaders = typings.node.httpMod.IncomingHttpHeaders
  
  // Events
  type EventUrl = java.lang.String | typings.node.urlMod.Url
  
  type IncomingWebhookHttpHeaders = typings.nock.mod.ReplyHeaders
  
  // Incoming Webhooks
  type IncomingWebhookUrl = java.lang.String
  
  type InteractiveButtonHttpHeaders = typings.nock.mod.ReplyHeaders
  
  // Interactive Buttons
  type InteractiveButtonUrl = java.lang.String | typings.node.urlMod.Url
  
  type OutgoingWebhookHttpHeaders = typings.node.httpMod.IncomingHttpHeaders
  
  // Outgoing Webhooks
  type OutgoingWebhookUrl = java.lang.String | typings.node.urlMod.Url
  
  type SlashCommandHttpHeaders = typings.node.httpMod.IncomingHttpHeaders
  
  // Slash Commands
  type SlashCommandUrl = java.lang.String | typings.node.urlMod.Url
  
  type WebHttpHeaders = typings.nock.mod.ReplyHeaders
  
  // Web
  type WebUrl = java.lang.String
  
  @scala.inline
  def instance: typings.slackMock.mod.Instance_ = typings.slackMock.mod.^.asInstanceOf[js.Dynamic].selectDynamic("instance").asInstanceOf[typings.slackMock.mod.Instance_]
  @scala.inline
  def instance_=(x: typings.slackMock.mod.Instance_): scala.Unit = typings.slackMock.mod.^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
}
