package typings.pulumiKubernetes.inputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PersistentVolumeSpec is the specification of a persistent volume.
  */
@js.native
trait PersistentVolumeSpec extends StObject {
  
  /**
    * AccessModes contains all ways the volume can be mounted. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes
    */
  var accessModes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * AWSElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
    */
  var awsElasticBlockStore: js.UndefOr[Input[AWSElasticBlockStoreVolumeSource]] = js.native
  
  /**
    * AzureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
    */
  var azureDisk: js.UndefOr[Input[AzureDiskVolumeSource]] = js.native
  
  /**
    * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
    */
  var azureFile: js.UndefOr[Input[AzureFilePersistentVolumeSource]] = js.native
  
  /**
    * A description of the persistent volume's resources and capacity. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#capacity
    */
  var capacity: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * CephFS represents a Ceph FS mount on the host that shares a pod's lifetime
    */
  var cephfs: js.UndefOr[Input[CephFSPersistentVolumeSource]] = js.native
  
  /**
    * Cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
    */
  var cinder: js.UndefOr[Input[CinderPersistentVolumeSource]] = js.native
  
  /**
    * ClaimRef is part of a bi-directional binding between PersistentVolume and PersistentVolumeClaim. Expected to be non-nil when bound. claim.VolumeName is the authoritative bind between PV and PVC. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#binding
    */
  var claimRef: js.UndefOr[Input[ObjectReference]] = js.native
  
  /**
    * CSI represents storage that is handled by an external CSI driver (Beta feature).
    */
  var csi: js.UndefOr[Input[CSIPersistentVolumeSource]] = js.native
  
  /**
    * FC represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
    */
  var fc: js.UndefOr[Input[FCVolumeSource]] = js.native
  
  /**
    * FlexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
    */
  var flexVolume: js.UndefOr[Input[FlexPersistentVolumeSource]] = js.native
  
  /**
    * Flocker represents a Flocker volume attached to a kubelet's host machine and exposed to the pod for its usage. This depends on the Flocker control service being running
    */
  var flocker: js.UndefOr[Input[FlockerVolumeSource]] = js.native
  
  /**
    * GCEPersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
    */
  var gcePersistentDisk: js.UndefOr[Input[GCEPersistentDiskVolumeSource]] = js.native
  
  /**
    * Glusterfs represents a Glusterfs volume that is attached to a host and exposed to the pod. Provisioned by an admin. More info: https://examples.k8s.io/volumes/glusterfs/README.md
    */
  var glusterfs: js.UndefOr[Input[GlusterfsPersistentVolumeSource]] = js.native
  
  /**
    * HostPath represents a directory on the host. Provisioned by a developer or tester. This is useful for single-node development and testing only! On-host storage is not supported in any way and WILL NOT WORK in a multi-node cluster. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
    */
  var hostPath: js.UndefOr[Input[HostPathVolumeSource]] = js.native
  
  /**
    * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. Provisioned by an admin.
    */
  var iscsi: js.UndefOr[Input[ISCSIPersistentVolumeSource]] = js.native
  
  /**
    * Local represents directly-attached storage with node affinity
    */
  var local: js.UndefOr[Input[LocalVolumeSource]] = js.native
  
  /**
    * A list of mount options, e.g. ["ro", "soft"]. Not validated - mount will simply fail if one is invalid. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes/#mount-options
    */
  var mountOptions: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * NFS represents an NFS mount on the host. Provisioned by an admin. More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
    */
  var nfs: js.UndefOr[Input[NFSVolumeSource]] = js.native
  
  /**
    * NodeAffinity defines constraints that limit what nodes this volume can be accessed from. This field influences the scheduling of pods that use this volume.
    */
  var nodeAffinity: js.UndefOr[Input[VolumeNodeAffinity]] = js.native
  
  /**
    * What happens to a persistent volume when released from its claim. Valid options are Retain (default for manually created PersistentVolumes), Delete (default for dynamically provisioned PersistentVolumes), and Recycle (deprecated). Recycle must be supported by the volume plugin underlying this PersistentVolume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#reclaiming
    */
  var persistentVolumeReclaimPolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * PhotonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
    */
  var photonPersistentDisk: js.UndefOr[Input[PhotonPersistentDiskVolumeSource]] = js.native
  
  /**
    * PortworxVolume represents a portworx volume attached and mounted on kubelets host machine
    */
  var portworxVolume: js.UndefOr[Input[PortworxVolumeSource]] = js.native
  
  /**
    * Quobyte represents a Quobyte mount on the host that shares a pod's lifetime
    */
  var quobyte: js.UndefOr[Input[QuobyteVolumeSource]] = js.native
  
  /**
    * RBD represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
    */
  var rbd: js.UndefOr[Input[RBDPersistentVolumeSource]] = js.native
  
  /**
    * ScaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
    */
  var scaleIO: js.UndefOr[Input[ScaleIOPersistentVolumeSource]] = js.native
  
  /**
    * Name of StorageClass to which this persistent volume belongs. Empty value means that this volume does not belong to any StorageClass.
    */
  var storageClassName: js.UndefOr[Input[String]] = js.native
  
  /**
    * StorageOS represents a StorageOS volume that is attached to the kubelet's host machine and mounted into the pod More info: https://examples.k8s.io/volumes/storageos/README.md
    */
  var storageos: js.UndefOr[Input[StorageOSPersistentVolumeSource]] = js.native
  
  /**
    * volumeMode defines if a volume is intended to be used with a formatted filesystem or to remain in raw block state. Value of Filesystem is implied when not included in spec.
    */
  var volumeMode: js.UndefOr[Input[String]] = js.native
  
  /**
    * VsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
    */
  var vsphereVolume: js.UndefOr[Input[VsphereVirtualDiskVolumeSource]] = js.native
}
object PersistentVolumeSpec {
  
  @scala.inline
  def apply(): PersistentVolumeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistentVolumeSpec]
  }
  
  @scala.inline
  implicit class PersistentVolumeSpecMutableBuilder[Self <: PersistentVolumeSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessModes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "accessModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessModesUndefined: Self = StObject.set(x, "accessModes", js.undefined)
    
    @scala.inline
    def setAccessModesVarargs(value: Input[String]*): Self = StObject.set(x, "accessModes", js.Array(value :_*))
    
    @scala.inline
    def setAwsElasticBlockStore(value: Input[AWSElasticBlockStoreVolumeSource]): Self = StObject.set(x, "awsElasticBlockStore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsElasticBlockStoreUndefined: Self = StObject.set(x, "awsElasticBlockStore", js.undefined)
    
    @scala.inline
    def setAzureDisk(value: Input[AzureDiskVolumeSource]): Self = StObject.set(x, "azureDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureDiskUndefined: Self = StObject.set(x, "azureDisk", js.undefined)
    
    @scala.inline
    def setAzureFile(value: Input[AzureFilePersistentVolumeSource]): Self = StObject.set(x, "azureFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAzureFileUndefined: Self = StObject.set(x, "azureFile", js.undefined)
    
    @scala.inline
    def setCapacity(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    @scala.inline
    def setCephfs(value: Input[CephFSPersistentVolumeSource]): Self = StObject.set(x, "cephfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCephfsUndefined: Self = StObject.set(x, "cephfs", js.undefined)
    
    @scala.inline
    def setCinder(value: Input[CinderPersistentVolumeSource]): Self = StObject.set(x, "cinder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCinderUndefined: Self = StObject.set(x, "cinder", js.undefined)
    
    @scala.inline
    def setClaimRef(value: Input[ObjectReference]): Self = StObject.set(x, "claimRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimRefUndefined: Self = StObject.set(x, "claimRef", js.undefined)
    
    @scala.inline
    def setCsi(value: Input[CSIPersistentVolumeSource]): Self = StObject.set(x, "csi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsiUndefined: Self = StObject.set(x, "csi", js.undefined)
    
    @scala.inline
    def setFc(value: Input[FCVolumeSource]): Self = StObject.set(x, "fc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFcUndefined: Self = StObject.set(x, "fc", js.undefined)
    
    @scala.inline
    def setFlexVolume(value: Input[FlexPersistentVolumeSource]): Self = StObject.set(x, "flexVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexVolumeUndefined: Self = StObject.set(x, "flexVolume", js.undefined)
    
    @scala.inline
    def setFlocker(value: Input[FlockerVolumeSource]): Self = StObject.set(x, "flocker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlockerUndefined: Self = StObject.set(x, "flocker", js.undefined)
    
    @scala.inline
    def setGcePersistentDisk(value: Input[GCEPersistentDiskVolumeSource]): Self = StObject.set(x, "gcePersistentDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcePersistentDiskUndefined: Self = StObject.set(x, "gcePersistentDisk", js.undefined)
    
    @scala.inline
    def setGlusterfs(value: Input[GlusterfsPersistentVolumeSource]): Self = StObject.set(x, "glusterfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlusterfsUndefined: Self = StObject.set(x, "glusterfs", js.undefined)
    
    @scala.inline
    def setHostPath(value: Input[HostPathVolumeSource]): Self = StObject.set(x, "hostPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostPathUndefined: Self = StObject.set(x, "hostPath", js.undefined)
    
    @scala.inline
    def setIscsi(value: Input[ISCSIPersistentVolumeSource]): Self = StObject.set(x, "iscsi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIscsiUndefined: Self = StObject.set(x, "iscsi", js.undefined)
    
    @scala.inline
    def setLocal(value: Input[LocalVolumeSource]): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setMountOptions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "mountOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountOptionsUndefined: Self = StObject.set(x, "mountOptions", js.undefined)
    
    @scala.inline
    def setMountOptionsVarargs(value: Input[String]*): Self = StObject.set(x, "mountOptions", js.Array(value :_*))
    
    @scala.inline
    def setNfs(value: Input[NFSVolumeSource]): Self = StObject.set(x, "nfs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNfsUndefined: Self = StObject.set(x, "nfs", js.undefined)
    
    @scala.inline
    def setNodeAffinity(value: Input[VolumeNodeAffinity]): Self = StObject.set(x, "nodeAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeAffinityUndefined: Self = StObject.set(x, "nodeAffinity", js.undefined)
    
    @scala.inline
    def setPersistentVolumeReclaimPolicy(value: Input[String]): Self = StObject.set(x, "persistentVolumeReclaimPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistentVolumeReclaimPolicyUndefined: Self = StObject.set(x, "persistentVolumeReclaimPolicy", js.undefined)
    
    @scala.inline
    def setPhotonPersistentDisk(value: Input[PhotonPersistentDiskVolumeSource]): Self = StObject.set(x, "photonPersistentDisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotonPersistentDiskUndefined: Self = StObject.set(x, "photonPersistentDisk", js.undefined)
    
    @scala.inline
    def setPortworxVolume(value: Input[PortworxVolumeSource]): Self = StObject.set(x, "portworxVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortworxVolumeUndefined: Self = StObject.set(x, "portworxVolume", js.undefined)
    
    @scala.inline
    def setQuobyte(value: Input[QuobyteVolumeSource]): Self = StObject.set(x, "quobyte", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuobyteUndefined: Self = StObject.set(x, "quobyte", js.undefined)
    
    @scala.inline
    def setRbd(value: Input[RBDPersistentVolumeSource]): Self = StObject.set(x, "rbd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRbdUndefined: Self = StObject.set(x, "rbd", js.undefined)
    
    @scala.inline
    def setScaleIO(value: Input[ScaleIOPersistentVolumeSource]): Self = StObject.set(x, "scaleIO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleIOUndefined: Self = StObject.set(x, "scaleIO", js.undefined)
    
    @scala.inline
    def setStorageClassName(value: Input[String]): Self = StObject.set(x, "storageClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassNameUndefined: Self = StObject.set(x, "storageClassName", js.undefined)
    
    @scala.inline
    def setStorageos(value: Input[StorageOSPersistentVolumeSource]): Self = StObject.set(x, "storageos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageosUndefined: Self = StObject.set(x, "storageos", js.undefined)
    
    @scala.inline
    def setVolumeMode(value: Input[String]): Self = StObject.set(x, "volumeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeModeUndefined: Self = StObject.set(x, "volumeMode", js.undefined)
    
    @scala.inline
    def setVsphereVolume(value: Input[VsphereVirtualDiskVolumeSource]): Self = StObject.set(x, "vsphereVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVsphereVolumeUndefined: Self = StObject.set(x, "vsphereVolume", js.undefined)
  }
}
