package typings.watsonDeveloperCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object speechToTextV1GeneratedMod {
  
  /** The callback for a service request. */
  type Callback[T] = js.Function3[
    /* error */ js.Any, 
    /* body */ js.UndefOr[T], 
    /* response */ js.UndefOr[typings.axios.mod.AxiosResponse[T]], 
    scala.Unit
  ]
  
  /* static member */
  @scala.inline
  def URL: java.lang.String = typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.^.asInstanceOf[js.Dynamic].selectDynamic("URL").asInstanceOf[java.lang.String]
  @scala.inline
  def URL_=(x: java.lang.String): scala.Unit = typings.watsonDeveloperCloud.speechToTextV1GeneratedMod.^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
}
