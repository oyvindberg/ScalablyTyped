package typings.firebase.mod.default

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object firestore {
  
  @scala.inline
  def apply(): typings.firebase.mod.firebase.firestore.Firestore = typings.firebase.mod.default.firestore.^.asInstanceOf[js.Dynamic].applyDynamic("firestore")().asInstanceOf[typings.firebase.mod.firebase.firestore.Firestore]
  @scala.inline
  def apply(app: typings.firebase.mod.firebase.app.App): typings.firebase.mod.firebase.firestore.Firestore = typings.firebase.mod.default.firestore.^.asInstanceOf[js.Dynamic].applyDynamic("firestore")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebase.mod.firebase.firestore.Firestore]
  
  @scala.inline
  def CACHE_SIZE_UNLIMITED: scala.Double = typings.firebase.mod.default.firestore.^.asInstanceOf[js.Dynamic].selectDynamic("CACHE_SIZE_UNLIMITED").asInstanceOf[scala.Double]
  
  type DocumentData = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type UpdateData = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  @scala.inline
  def setLogLevel(logLevel: typings.firebase.mod.firebase.firestore.LogLevel): scala.Unit = typings.firebase.mod.default.firestore.^.asInstanceOf[js.Dynamic].applyDynamic("setLogLevel")(logLevel.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
