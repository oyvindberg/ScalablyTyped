package typings.ndnJs

import typings.ndnJs.dataMod.Data
import typings.ndnJs.faceMod.Face
import typings.ndnJs.faceMod.ForwardingFlags
import typings.ndnJs.faceMod.InterestFilter
import typings.ndnJs.faceMod.OnInterestCallback
import typings.ndnJs.interestMod.Interest
import typings.ndnJs.nameMod.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryContentCacheMod {
  
  @JSImport("ndn-js/memory-content-cache", "MemoryContentCache")
  @js.native
  class MemoryContentCache protected () extends StObject {
    def this(face: Face) = this()
    def this(face: Face, cleanupIntervalMilliseconds: Double) = this()
    
    def add(data: Data): Unit = js.native
    
    def getMinimumCacheLifetime(): Double = js.native
    
    def getStorePendingInterest(): OnInterestCallback = js.native
    
    def registerPrefix(name: Name, onRegisterFailed: js.Function1[/* prefix */ Name, _]): Unit = js.native
    def registerPrefix(
      name: Name,
      onRegisterFailed: js.Function1[/* prefix */ Name, _],
      onRegisterSuccess: js.UndefOr[scala.Nothing],
      onDataNotFound: js.UndefOr[scala.Nothing],
      flags: ForwardingFlags
    ): Unit = js.native
    def registerPrefix(
      name: Name,
      onRegisterFailed: js.Function1[/* prefix */ Name, _],
      onRegisterSuccess: js.UndefOr[scala.Nothing],
      onDataNotFound: OnInterestCallback
    ): Unit = js.native
    def registerPrefix(
      name: Name,
      onRegisterFailed: js.Function1[/* prefix */ Name, _],
      onRegisterSuccess: js.UndefOr[scala.Nothing],
      onDataNotFound: OnInterestCallback,
      flags: ForwardingFlags
    ): Unit = js.native
    def registerPrefix(
      name: Name,
      onRegisterFailed: js.Function1[/* prefix */ Name, _],
      onRegisterSuccess: js.Function2[/* prefix */ Name, /* registeredPrefixId */ Double, _]
    ): Unit = js.native
    def registerPrefix(
      name: Name,
      onRegisterFailed: js.Function1[/* prefix */ Name, _],
      onRegisterSuccess: js.Function2[/* prefix */ Name, /* registeredPrefixId */ Double, _],
      onDataNotFound: js.UndefOr[scala.Nothing],
      flags: ForwardingFlags
    ): Unit = js.native
    def registerPrefix(
      name: Name,
      onRegisterFailed: js.Function1[/* prefix */ Name, _],
      onRegisterSuccess: js.Function2[/* prefix */ Name, /* registeredPrefixId */ Double, _],
      onDataNotFound: OnInterestCallback
    ): Unit = js.native
    def registerPrefix(
      name: Name,
      onRegisterFailed: js.Function1[/* prefix */ Name, _],
      onRegisterSuccess: js.Function2[/* prefix */ Name, /* registeredPrefixId */ Double, _],
      onDataNotFound: OnInterestCallback,
      flags: ForwardingFlags
    ): Unit = js.native
    
    def setInterestFilter(filter: InterestFilter): Unit = js.native
    def setInterestFilter(filter: InterestFilter, onDataNotFound: OnInterestCallback): Unit = js.native
    def setInterestFilter(filter: Name): Unit = js.native
    def setInterestFilter(filter: Name, onDataNotFound: OnInterestCallback): Unit = js.native
    
    def setMinimumCacheLifetime(minimumCacheLifetime: Double): Unit = js.native
    
    def storePendingInterest(interest: Interest, face: Face): Unit = js.native
    
    def unregisterAll(): Unit = js.native
  }
}
