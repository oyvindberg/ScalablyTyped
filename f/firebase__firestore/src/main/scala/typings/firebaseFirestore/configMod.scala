package typings.firebaseFirestore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseFirestore.apiDatabaseMod.CollectionReference
import typings.firebaseFirestore.apiDatabaseMod.DocumentReference
import typings.firebaseFirestore.apiDatabaseMod.DocumentSnapshot
import typings.firebaseFirestore.apiDatabaseMod.Firestore
import typings.firebaseFirestore.apiDatabaseMod.FirestoreDatabase
import typings.firebaseFirestore.apiDatabaseMod.QueryDocumentSnapshot
import typings.firebaseFirestore.apiDatabaseMod.QuerySnapshot
import typings.firebaseFirestore.apiDatabaseMod.WriteBatch
import typings.firebaseFirestore.apiFieldValueMod.FieldValue
import typings.firebaseFirestore.blobMod.Blob
import typings.firebaseFirestore.byteStringMod.ByteString
import typings.firebaseFirestore.componentProviderMod.ComponentProvider
import typings.firebaseFirestore.coreTransactionMod.Transaction
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestore.mod.FirebaseApp
import typings.firebaseFirestore.mod.FirebaseNamespace
import typings.firebaseFirestore.pathMod.ResourcePath
import typings.firebaseFirestore.queryMod.Query
import typings.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import typings.firebaseFirestoreTypes.mod.FirestoreDataConverter
import typings.firebaseFirestoreTypes.mod.LogLevel
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/config", JSImport.Namespace)
@js.native
object configMod extends js.Object {
  @js.native
  class PublicBlob protected () extends Blob {
    def this(byteString: ByteString) = this()
  }
  
  @js.native
  class PublicDocumentReference[T] protected () extends DocumentReference[T] {
    def this(_key: DocumentKey, firestore: Firestore) = this()
    def this(
      _key: DocumentKey,
      firestore: Firestore,
      _converter: FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ _]
    ) = this()
  }
  
  @js.native
  class PublicFieldValue () extends FieldValue
  
  @js.native
  class PublicFirestore protected () extends Firestore {
    def this(databaseIdOrApp: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
    def this(databaseIdOrApp: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]) = this()
    def this(
      databaseIdOrApp: FirestoreDatabase,
      authProvider: Provider[FirebaseAuthInternalName],
      componentProvider: ComponentProvider
    ) = this()
    def this(
      databaseIdOrApp: FirebaseApp,
      authProvider: Provider[FirebaseAuthInternalName],
      componentProvider: ComponentProvider
    ) = this()
  }
  
  val PublicCollectionReference: Instantiable3[
    /* _path */ ResourcePath, 
    /* firestore */ Firestore, 
    /* _converter */ (FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]) | Null, 
    CollectionReference[js.Object]
  ] = js.native
  val PublicDocumentSnapshot: Instantiable6[
    /* _firestore */ Firestore, 
    /* _key */ DocumentKey, 
    /* _document */ Document | Null, 
    /* _fromCache */ Boolean, 
    /* _hasPendingWrites */ Boolean, 
    /* _converter */ (FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]) | Null, 
    DocumentSnapshot[js.Object]
  ] = js.native
  val PublicQuery: Instantiable3[
    /* _query */ Query, 
    /* firestore */ Firestore, 
    /* _converter */ (FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]) | Null, 
    typings.firebaseFirestore.apiDatabaseMod.Query[js.Object]
  ] = js.native
  val PublicQueryDocumentSnapshot: Instantiable0[QueryDocumentSnapshot[js.Object]] = js.native
  val PublicQuerySnapshot: Instantiable4[
    /* _firestore */ Firestore, 
    /* _originalQuery */ Query, 
    /* _snapshot */ ViewSnapshot, 
    /* _converter */ (FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]) | Null, 
    QuerySnapshot[js.Object]
  ] = js.native
  val PublicTransaction: Instantiable2[
    /* _firestore */ Firestore, 
    /* _transaction */ Transaction, 
    typings.firebaseFirestore.apiDatabaseMod.Transaction
  ] = js.native
  val PublicWriteBatch: Instantiable1[/* _firestore */ Firestore, WriteBatch] = js.native
  def configureForFirebase(
    firebase: FirebaseNamespace,
    firestoreFactory: js.Function2[/* app */ FirebaseApp, /* auth */ Provider[FirebaseAuthInternalName], Firestore]
  ): Unit = js.native
  @js.native
  object PublicBlob extends Instantiable1[/* byteString */ ByteString, Blob] {
    def fromBase64String(base64: String): Blob = js.native
    def fromUint8Array(array: Uint8Array): Blob = js.native
  }
  
  @js.native
  object PublicDocumentReference
    extends Instantiable2[/* _key */ DocumentKey, /* firestore */ Firestore, DocumentReference[js.Object]]
       with Instantiable3[
          /* _key */ DocumentKey, 
          /* firestore */ Firestore, 
          /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          DocumentReference[js.Object]
        ] {
    def forPath[U](path: ResourcePath, firestore: Firestore): DocumentReference[U] = js.native
    def forPath[U](path: ResourcePath, firestore: Firestore, converter: FirestoreDataConverter[U]): DocumentReference[U] = js.native
  }
  
  @js.native
  object PublicFieldValue extends Instantiable0[FieldValue] {
    def arrayRemove(elements: js.Any*): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
    def arrayUnion(elements: js.Any*): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
    def delete(): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
    def increment(n: Double): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
    def serverTimestamp(): typings.firebaseFirestoreTypes.mod.FieldValue = js.native
  }
  
  @js.native
  object PublicFirestore
    extends Instantiable2[
          (/* databaseIdOrApp */ FirebaseApp) | (/* databaseIdOrApp */ FirestoreDatabase), 
          /* authProvider */ Provider[FirebaseAuthInternalName], 
          Firestore
        ]
       with Instantiable3[
          (/* databaseIdOrApp */ FirebaseApp) | (/* databaseIdOrApp */ FirestoreDatabase), 
          /* authProvider */ Provider[FirebaseAuthInternalName], 
          /* componentProvider */ ComponentProvider, 
          Firestore
        ] {
    var databaseIdFromApp: js.Any = js.native
    def logLevel: LogLevel = js.native
    def setLogLevel(level: LogLevel): Unit = js.native
  }
  
}

