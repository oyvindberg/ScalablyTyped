package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ebs extends StObject {
  
  /**
    * Indicates whether the volume is deleted on instance termination. For Amazon EC2 Auto Scaling, the default value is true.
    */
  var DeleteOnTermination: js.UndefOr[BlockDeviceEbsDeleteOnTermination] = js.native
  
  /**
    * Specifies whether the volume should be encrypted. Encrypted EBS volumes can only be attached to instances that support Amazon EBS encryption. For more information, see Supported Instance Types. If your AMI uses encrypted volumes, you can also only launch it on supported instance types.  If you are creating a volume from a snapshot, you cannot specify an encryption value. Volumes that are created from encrypted snapshots are automatically encrypted, and volumes that are created from unencrypted snapshots are automatically unencrypted. By default, encrypted snapshots use the AWS managed CMK that is used for EBS encryption, but you can specify a custom CMK when you create the snapshot. The ability to encrypt a snapshot during copying also allows you to apply a new CMK to an already-encrypted snapshot. Volumes restored from the resulting copy are only accessible using the new CMK. Enabling encryption by default results in all EBS volumes being encrypted with the AWS managed CMK or a customer managed CMK, whether or not the snapshot was encrypted.  For more information, see Using Encryption with EBS-Backed AMIs in the Amazon EC2 User Guide for Linux Instances and Required CMK key policy for use with encrypted volumes in the Amazon EC2 Auto Scaling User Guide.
    */
  var Encrypted: js.UndefOr[BlockDeviceEbsEncrypted] = js.native
  
  /**
    * The number of I/O operations per second (IOPS) to provision for the volume. The maximum ratio of IOPS to volume size (in GiB) is 50:1. For more information, see Amazon EBS Volume Types in the Amazon EC2 User Guide for Linux Instances. Required when the volume type is io1. (Not used with standard, gp2, st1, or sc1 volumes.) 
    */
  var Iops: js.UndefOr[BlockDeviceEbsIops] = js.native
  
  /**
    * The snapshot ID of the volume to use. You must specify either a VolumeSize or a SnapshotId.
    */
  var SnapshotId: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * The volume size, in Gibibytes (GiB). This can be a number from 1-1,024 for standard, 4-16,384 for io1, 1-16,384 for gp2, and 500-16,384 for st1 and sc1. If you specify a snapshot, the volume size must be equal to or larger than the snapshot size. Default: If you create a volume from a snapshot and you don't specify a volume size, the default is the snapshot size. You must specify either a VolumeSize or a SnapshotId. If you specify both SnapshotId and VolumeSize, the volume size must be equal or greater than the size of the snapshot.
    */
  var VolumeSize: js.UndefOr[BlockDeviceEbsVolumeSize] = js.native
  
  /**
    * The volume type, which can be standard for Magnetic, io1 for Provisioned IOPS SSD, gp2 for General Purpose SSD, st1 for Throughput Optimized HDD, or sc1 for Cold HDD. For more information, see Amazon EBS Volume Types in the Amazon EC2 User Guide for Linux Instances. Valid Values: standard | io1 | gp2 | st1 | sc1 
    */
  var VolumeType: js.UndefOr[BlockDeviceEbsVolumeType] = js.native
}
object Ebs {
  
  @scala.inline
  def apply(): Ebs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ebs]
  }
  
  @scala.inline
  implicit class EbsMutableBuilder[Self <: Ebs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteOnTermination(value: BlockDeviceEbsDeleteOnTermination): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    @scala.inline
    def setEncrypted(value: BlockDeviceEbsEncrypted): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    @scala.inline
    def setIops(value: BlockDeviceEbsIops): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: XmlStringMaxLen255): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    @scala.inline
    def setVolumeSize(value: BlockDeviceEbsVolumeSize): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
    
    @scala.inline
    def setVolumeType(value: BlockDeviceEbsVolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
