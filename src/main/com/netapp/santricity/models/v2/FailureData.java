/**************************************************************************************************************************************************************
 *  The Clear BSD License
 *
 *   Copyright (c) – 2016, NetApp, Inc. All rights reserved.
 *
 *   Redistribution and use in source and binary forms, with or without modification, are permitted (subject to the limitations in the disclaimer below) provided that the following conditions are met:
 *
 *   * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *
 *   * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *   * Neither the name of NetApp, Inc. nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.
 *
 *   NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *************************************************************************************************************************************************************/


package com.netapp.santricity.models.v2;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.netapp.santricity.models.v2.*;
import com.netapp.santricity.models.symbol.*;
import com.netapp.santricity.models.utils.*;
import com.netapp.santricity.Pair;
import com.netapp.santricity.StringUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.util.Date;
import java.util.Objects;


/**
 * A failure currently active on the storage system
 */
@ApiModel(description = "A failure currently active on the storage system")
@javax.annotation.Generated(value = "class com.ni.aa.client.codegen.lang.JavaNetappClientCodegen", date = "2016-08-12T15:32:41.671-05:00")
public class FailureData   {
  

  /**
   * The type of failure
   */
  public enum FailureTypeEnum {
    unknownFailure("unknownFailure"),
    failedFan("failedFan"),
    failedPowerSupply("failedPowerSupply"),
    failedMinihub("failedMinihub"),
    failedEsm("failedEsm"),
    batteryNearExpiration("batteryNearExpiration"),
    failedBattery("failedBattery"),
    nominalTempExceeded("nominalTempExceeded"),
    maxTempExceeded("maxTempExceeded"),
    upsOnBattery("upsOnBattery"),
    nonPreferredPath("nonPreferredPath"),
    memParityError("memParityError"),
    failedDriveScsiChannel("failedDriveScsiChannel"),
    degradedVolume("degradedVolume"),
    failedVolumeInterruptedWrite("failedVolumeInterruptedWrite"),
    failedModifyingVolume("failedModifyingVolume"),
    failedModifyingMultiRaid("failedModifyingMultiRaid"),
    failedVolume("failedVolume"),
    failedVolumeMultiRaid("failedVolumeMultiRaid"),
    impairedVolume("impairedVolume"),
    failedVolumeAwaitingInit("failedVolumeAwaitingInit"),
    volumeHotSpareInUse("volumeHotSpareInUse"),
    offlineVolumeGroup("offlineVolumeGroup"),
    failedDrive("failedDrive"),
    impendingDriveFailureRiskHigh("impendingDriveFailureRiskHigh"),
    impendingDriveFailureRiskMed("impendingDriveFailureRiskMed"),
    impendingDriveFailureRiskLow("impendingDriveFailureRiskLow"),
    uncertifiedDrive("uncertifiedDrive"),
    offlineCtl("offlineCtl"),
    passiveCtl("passiveCtl"),
    partitionsNotCompliant("partitionsNotCompliant"),
    esmCodeVersionMismatch("esmCodeVersionMismatch"),
    lostRedundancyDrive("lostRedundancyDrive"),
    lostRedundancyTray("lostRedundancyTray"),
    lostRedundancyEsm("lostRedundancyEsm"),
    trayidMismatch("trayidMismatch"),
    trayidConflict("trayidConflict"),
    failedTransceiverModule("failedTransceiverModule"),
    channelMiswire("channelMiswire"),
    nonFruBatteryNearExpiration("nonFruBatteryNearExpiration"),
    nonFruFailedBattery("nonFruFailedBattery"),
    rpaErrCtl("rpaErrCtl"),
    repositoryOverThreshold("repositoryOverThreshold"),
    repositoryFull("repositoryFull"),
    snapshotFailed("snapshotFailed"),
    unsupportedMinihub("unsupportedMinihub"),
    esmMiswire("esmMiswire"),
    ghostVolume("ghostVolume"),
    snapshotNotCompliant("snapshotNotCompliant"),
    rvmNotCompliant("rvmNotCompliant"),
    metadataOffline("metadataOffline"),
    mirrorDualPrimary("mirrorDualPrimary"),
    mirrorDualSecondary("mirrorDualSecondary"),
    mirrorUnsynchronized("mirrorUnsynchronized"),
    remoteNoLun("remoteNoLun"),
    remoteNoArray("remoteNoArray"),
    remoteNoFabric("remoteNoFabric"),
    remoteWwnChangeFailed("remoteWwnChangeFailed"),
    fanUnknownStat("fanUnknownStat"),
    powerSupplyUnknownStat("powerSupplyUnknownStat"),
    esmUnknownStat("esmUnknownStat"),
    tempSensorUnknownStat("tempSensorUnknownStat"),
    transModUnknownStat("transModUnknownStat"),
    driveBypassedSpeedMismatch("driveBypassedSpeedMismatch"),
    driveBypassedCauseUnknown("driveBypassedCauseUnknown"),
    minihubSpeedMismatch("minihubSpeedMismatch"),
    removedEsm("removedEsm"),
    removedBattery("removedBattery"),
    nonFruRemovedBattery("nonFruRemovedBattery"),
    volcopyFailed("volcopyFailed"),
    volcopyNotCompliant("volcopyNotCompliant"),
    channelDegraded("channelDegraded"),
    unsupportedTray("unsupportedTray"),
    speedNegError("speedNegError"),
    usmDatabaseFull("usmDatabaseFull"),
    usmUnreadableSectorsExist("usmUnreadableSectorsExist"),
    pathDegraded("pathDegraded"),
    netSetupError("netSetupError"),
    mismatchedDriveType("mismatchedDriveType"),
    ctlMismatch("ctlMismatch"),
    failedDiscreteLine("failedDiscreteLine"),
    channelFailed("channelFailed"),
    linkSpeedDetectionMismatch("linkSpeedDetectionMismatch"),
    uncertifiedEsm("uncertifiedEsm"),
    removedFan("removedFan"),
    removedPowerSupply("removedPowerSupply"),
    removedTempSensor("removedTempSensor"),
    removedIccCru("removedIccCru"),
    removedSupportCru("removedSupportCru"),
    failedIccCru("failedIccCru"),
    failedSupportCru("failedSupportCru"),
    batteryUnknownStat("batteryUnknownStat"),
    driveTraysNotGroupedTogether("driveTraysNotGroupedTogether"),
    goldKeyNotCompliant("goldKeyNotCompliant"),
    mismatchedMdtSettings("mismatchedMdtSettings"),
    mismatchedGoldKeySettings("mismatchedGoldKeySettings"),
    ctlMiswire("ctlMiswire"),
    supportCruNoinput("supportCruNoinput"),
    submodelNotSupported("submodelNotSupported"),
    submodelNotSet("submodelNotSet"),
    submodelMismatch("submodelMismatch"),
    failedBatterySystem("failedBatterySystem"),
    removedBatteryPack("removedBatteryPack"),
    batteryConfigMismatch("batteryConfigMismatch"),
    esmHardwareMismatch("esmHardwareMismatch"),
    hostBoardFault("hostBoardFault"),
    ddcAvailable("ddcAvailable"),
    replacedDriveWrongType("replacedDriveWrongType"),
    redundantPsRequired("redundantPsRequired"),
    driveTraysNotCompliant("driveTraysNotCompliant"),
    sasDeviceLimitExceeded("sasDeviceLimitExceeded"),
    sasPortMiswired("sasPortMiswired"),
    sasPortDegraded("sasPortDegraded"),
    sasPortFailed("sasPortFailed"),
    corruptVpdEeprom("corruptVpdEeprom"),
    failedI2cBus("failedI2cBus"),
    enclosureMisconfigured("enclosureMisconfigured"),
    featureBundleNotCompliant("featureBundleNotCompliant"),
    driveBypassedSinglePort("driveBypassedSinglePort"),
    esmFactoryDefaultsMismatch("esmFactoryDefaultsMismatch"),
    hostBoardUnknownStat("hostBoardUnknownStat"),
    failedHostIoCard("failedHostIoCard"),
    batteryWarn("batteryWarn"),
    volumeGroupPartiallyComplete("volumeGroupPartiallyComplete"),
    volumeGroupIncomplete("volumeGroupIncomplete"),
    volumeGroupMissing("volumeGroupMissing"),
    hotspareDriveMissing("hotspareDriveMissing"),
    driveIncompatibleUprevDacstore("driveIncompatibleUprevDacstore"),
    driveIncompatibleDownrevDacstore("driveIncompatibleDownrevDacstore"),
    iccCruUnknownStat("iccCruUnknownStat"),
    removedAlarm("removedAlarm"),
    supportCruUnknownStat("supportCruUnknownStat"),
    performanceTierNotCompliant("performanceTierNotCompliant"),
    raid6NotCompliant("raid6NotCompliant"),
    driveIncompatibleSectorSize("driveIncompatibleSectorSize"),
    foreignDriveInconsistent("foreignDriveInconsistent"),
    foreignDriveRefersToNativeDrive("foreignDriveRefersToNativeDrive"),
    nativeVgRefersToForeignDrive("nativeVgRefersToForeignDrive"),
    nativeVgForeignDriveMutualRef("nativeVgForeignDriveMutualRef"),
    vgCloned("vgCloned"),
    foreignDriveHasInconsistentRole("foreignDriveHasInconsistentRole"),
    vgDrivePartOfMultipleVgs("vgDrivePartOfMultipleVgs"),
    incompatibleFailedLegacyDrive("incompatibleFailedLegacyDrive"),
    unsupportedCacheMemorySize("unsupportedCacheMemorySize"),
    dedicatedMirrorChannelFailed("dedicatedMirrorChannelFailed"),
    vgHasDrivePartOfMultipleVgs("vgHasDrivePartOfMultipleVgs"),
    ddfDriveOtherVendor("ddfDriveOtherVendor"),
    multipleConfigDatabasesDetected("multipleConfigDatabasesDetected"),
    adoptionFailedRaidLevelUnsupported("adoptionFailedRaidLevelUnsupported"),
    dbAdoptionHardLimitExceeded("dbAdoptionHardLimitExceeded"),
    legacyVgNotOptimal("legacyVgNotOptimal"),
    cacheMemSizeMismatch("cacheMemSizeMismatch"),
    altCtlrBoardIdUnreadable("altCtlrBoardIdUnreadable"),
    cacheBackupDeviceFailed("cacheBackupDeviceFailed"),
    cacheBackupDeviceWriteProtected("cacheBackupDeviceWriteProtected"),
    cacheBackupDeviceInsufficientCapacity("cacheBackupDeviceInsufficientCapacity"),
    expiredBattery("expiredBattery"),
    expiredIntegratedBattery("expiredIntegratedBattery"),
    procMemTooSmallForCache("procMemTooSmallForCache"),
    batteryOvertemp("batteryOvertemp"),
    invalidHostTypeIndex("invalidHostTypeIndex"),
    insufficientProcMemory("insufficientProcMemory"),
    ctlFailedCacheBackupDev("ctlFailedCacheBackupDev"),
    removedController("removedController"),
    degradedHostIoCard("degradedHostIoCard"),
    ldFwVersionMismatch("ldFwVersionMismatch"),
    ldIncompatibleDatabase("ldIncompatibleDatabase"),
    hostBoardIdMismatch("hostBoardIdMismatch"),
    iccMissing("iccMissing"),
    linkSpeedMismatch("linkSpeedMismatch"),
    unsupportedHostBoard("unsupportedHostBoard"),
    writebackCachingDisabled("writebackCachingDisabled"),
    securityGetKey("securityGetKey"),
    securityKeyInconsistent("securityKeyInconsistent"),
    securityNotCompliant("securityNotCompliant"),
    mixedDriveEnclosureMiswire("mixedDriveEnclosureMiswire"),
    unsuccessIsolationRedunMismatch("unsuccessIsolationRedunMismatch"),
    thresExcdedMismatchCorrected("thresExcdedMismatchCorrected"),
    inactiveHostPort("inactiveHostPort"),
    inactiveInitiator("inactiveInitiator"),
    protectionInformationNotCompliant("protectionInformationNotCompliant"),
    protectionInformationNotSupported("protectionInformationNotSupported"),
    replacedInsufficientDriveCapacity("replacedInsufficientDriveCapacity"),
    drawerFailed("drawerFailed"),
    drawerOpened("drawerOpened"),
    ssdNotCompliant("ssdNotCompliant"),
    ssdAtEndOfLife("ssdAtEndOfLife"),
    fibreTrunkMiswire("fibreTrunkMiswire"),
    fibreTrunkIncompatibleEsm("fibreTrunkIncompatibleEsm"),
    driveSlotLimitNotCompliant("driveSlotLimitNotCompliant"),
    securityGetNewKey("securityGetNewKey"),
    externalKmsNotCompliant("externalKmsNotCompliant"),
    sbbValidationFailure("sbbValidationFailure"),
    invalidPowerSupply("invalidPowerSupply"),
    enclosureThermalShutdown("enclosureThermalShutdown"),
    wbCachingForciblyDisabled("wbCachingForciblyDisabled"),
    driveUnsupportedProtocolConnection("driveUnsupportedProtocolConnection"),
    failedTwiBus("failedTwiBus"),
    mismatchedMidplaneEeproms("mismatchedMidplaneEeproms"),
    driveUnsupportedCapacity("driveUnsupportedCapacity"),
    evaluationLicenseExpirationImminent("evaluationLicenseExpirationImminent"),
    externalKmsKeyInvalid("externalKmsKeyInvalid"),
    multipleMismatchedKeyIdsFound("multipleMismatchedKeyIdsFound"),
    securityKeyValidationLock("securityKeyValidationLock"),
    cacheDataLoss("cacheDataLoss"),
    baseControllerDiagFailed("baseControllerDiagFailed"),
    featureNotCompliant("featureNotCompliant"),
    driveIncompatiblePiType("driveIncompatiblePiType"),
    drawerDegraded("drawerDegraded"),
    offlineCtlIocFail("offlineCtlIocFail"),
    invalidSataFlashConfiguration("invalidSataFlashConfiguration"),
    iocDiagFail("iocDiagFail"),
    sasPhyDisabledLocalWidePortDegraded("sasPhyDisabledLocalWidePortDegraded"),
    sasPhyDisabledSharedWidePortDegraded("sasPhyDisabledSharedWidePortDegraded"),
    drawerInvalid("drawerInvalid"),
    drawerRemoved("drawerRemoved"),
    driveUnsupportedInterposerFwVersion("driveUnsupportedInterposerFwVersion"),
    redundancyGroupNotConsistentDuringReconfig("redundancyGroupNotConsistentDuringReconfig"),
    snapshotRollbackPaused("snapshotRollbackPaused"),
    pitRollbackPaused("pitRollbackPaused"),
    pitGroupRepositoryOverThreshold("pitGroupRepositoryOverThreshold"),
    pitViewRepositoryOverThreshold("pitViewRepositoryOverThreshold"),
    pitGroupRepositoryFull("pitGroupRepositoryFull"),
    pitViewRepositoryFull("pitViewRepositoryFull"),
    pitGroupFailed("pitGroupFailed"),
    pitViewFailed("pitViewFailed"),
    pitPurged("pitPurged"),
    arvmDegradedMirrorGroup("arvmDegradedMirrorGroup"),
    arvmFailedMirror("arvmFailedMirror"),
    arvmSyncIntervalTimeOverThreshold("arvmSyncIntervalTimeOverThreshold"),
    arvmRepositoryOverWarnThreshold("arvmRepositoryOverWarnThreshold"),
    arvmMirrorGroupRoleConflict("arvmMirrorGroupRoleConflict"),
    incompatibleVolumeGroupSecurity("incompatibleVolumeGroupSecurity"),
    arvmOrphanGroup("arvmOrphanGroup"),
    arvmOrphanMember("arvmOrphanMember"),
    arvmMirrorGroupRecoveryPointLost("arvmMirrorGroupRecoveryPointLost"),
    diskPoolPartiallyPresent("diskPoolPartiallyPresent"),
    diskPoolIncomplete("diskPoolIncomplete"),
    diskPoolMissing("diskPoolMissing"),
    diskPoolReconstructionDriveCountBelowThreshold("diskPoolReconstructionDriveCountBelowThreshold"),
    diskPoolUtilizationWarning("diskPoolUtilizationWarning"),
    diskPoolUtilizationCritical("diskPoolUtilizationCritical"),
    pendingPitCreationFailed("pendingPitCreationFailed"),
    pendingCgpitCreationFailed("pendingCgpitCreationFailed"),
    tpvRepositoryOverThreshold("tpvRepositoryOverThreshold"),
    tpvRepositoryFull("tpvRepositoryFull"),
    tpvFailed("tpvFailed"),
    arvmSecondaryRepositoryFull("arvmSecondaryRepositoryFull"),
    arvmSyncInternallySuspended("arvmSyncInternallySuspended"),
    databaseRecoveryMode("databaseRecoveryMode"),
    arvmPrimaryRepositoryFull("arvmPrimaryRepositoryFull"),
    incompatibleSataDrive("incompatibleSataDrive"),
    diskPoolCapacityDepleted("diskPoolCapacityDepleted"),
    driveIncompatibleModelNumberUnsupported("driveIncompatibleModelNumberUnsupported"),
    flashCacheNonOptimalDrives("flashCacheNonOptimalDrives"),
    flashCacheHotSpareInUse("flashCacheHotSpareInUse"),
    allDrivesBypassedIncompatibleNvsram("allDrivesBypassedIncompatibleNvsram"),
    diskPoolDriveFailure("diskPoolDriveFailure"),
    diskPoolInsufficientMemory("diskPoolInsufficientMemory"),
    arvmOrphanIncompleteMember("arvmOrphanIncompleteMember"),
    arvmSyncPausedAltState("arvmSyncPausedAltState"),
    arvmRoleChangePaused("arvmRoleChangePaused"),
    driveIncompatibleAlignmentForEmulationDrive("driveIncompatibleAlignmentForEmulationDrive"),
    lossOfExternalRedundancy("lossOfExternalRedundancy"),
    rvmWriteModeInconsistent("rvmWriteModeInconsistent"),
    sasHostMiswire("sasHostMiswire"),
    sasCrossMiswire("sasCrossMiswire"),
    sasLoopMiswire("sasLoopMiswire"),
    copyThenFailWaitingOnHotSpare("copyThenFailWaitingOnHotSpare"),
    missingDriveLockdown("missingDriveLockdown"),
    hicConfigurationOoc("hicConfigurationOoc"),
    copyThenFailWaitingOnDdpCapacity("copyThenFailWaitingOnDdpCapacity"),
    piErrorServiceMode("piErrorServiceMode"),
    piErrorLockdown("piErrorLockdown"),
    sasPortDiscoveryError("sasPortDiscoveryError"),
    netNtpResolutionFail("netNtpResolutionFail"),
    netNtpQueryFail("netNtpQueryFail"),
    netNtpServiceUnavailable("netNtpServiceUnavailable"),
    multipathConfigurationError("multipathConfigurationError"),
    hostRedundancyLost("hostRedundancyLost"),
    excessiveRebootsDetected("excessiveRebootsDetected"),
    cacheNotFlushedOnOnlyCtlr("cacheNotFlushedOnOnlyCtlr"),
    __UNDEFINED("__UNDEFINED");
;
    private String value;

    FailureTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private FailureTypeEnum failureType;

    private String objectRef;


  /**
   * The type of object described in objectData
   */
  public enum ObjectTypeEnum {
    volume("volume"),
    pool("pool"),
    host("host"),
    lunMapping("lunMapping"),
    hostGroup("hostGroup"),
    thinVolume("thinVolume"),
    drive("drive"),
    volumeCopy("volumeCopy"),
    pit("pit"),
    pitView("pitView"),
    snapshotGroup("snapshotGroup"),
    snapshot("snapshot"),
    accessVolume("accessVolume"),
    legacySnapshot("legacySnapshot"),
    hostType("hostType"),
    metadataTag("metadataTag"),
    managementUrl("managementUrl"),
    folder("folder"),
    asyncMirrorGroup("asyncMirrorGroup"),
    asyncMirrorGroupMember("asyncMirrorGroupMember"),
    asyncMirrorGroupIncompleteMember("asyncMirrorGroupIncompleteMember"),
    consistencyGroup("consistencyGroup"),
    consistencyGroupView("consistencyGroupView"),
    fan("fan"),
    battery("battery"),
    storageSystem("storageSystem"),
    controller("controller"),
    powerSupply("powerSupply"),
    minihub("minihub"),
    esm("esm"),
    drawer("drawer"),
    hostBoard("hostBoard"),
    interconnectCRU("interconnectCRU"),
    cacheBackupDevice("cacheBackupDevice"),
    tray("tray"),
    supportCRU("supportCRU"),
    hostPort("hostPort"),
    initiator("initiator"),
    snapshotSchedule("snapshotSchedule"),
    thermalSensor("thermalSensor"),
    sfp("sfp"),
    flashCache("flashCache"),
    featureAttribute("featureAttribute"),
    featureState("featureState"),
    lockKeyId("lockKeyId"),
    remoteVolume("remoteVolume"),
    mirrorVolume("mirrorVolume"),
    vaultMirrorVolume("vaultMirrorVolume"),
    vaultMirrorGroup("vaultMirrorGroup"),
    metadataVolume("metadataVolume"),
    sasPort("sasPort"),
    sasExpander("sasExpander"),
    channelPort("channelPort"),
    speedNegError("speedNegError"),
    snmpAgentBundle("snmpAgentBundle"),
    stagedFirmware("stagedFirmware"),
    workload("workload");
;
    private String value;

    ObjectTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

    private ObjectTypeEnum objectType;

    private Serializable objectData;

    private Serializable extraData;

  
  /**
   * The type of failure
   **/
  public FailureData failureType(FailureTypeEnum failureType) {
    this.failureType = failureType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of failure")
  @JsonProperty("failureType")
  public FailureTypeEnum getFailureType() {
    return failureType;
  }
  
  public void setFailureType(FailureTypeEnum failureType) {
    this.failureType = failureType;
  }

  
  /**
   * The object that has the failure
   **/
  public FailureData objectRef(String objectRef) {
    this.objectRef = objectRef;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The object that has the failure")
  @JsonProperty("objectRef")
  public String getObjectRef() {
    return objectRef;
  }
  
  public void setObjectRef(String objectRef) {
    this.objectRef = objectRef;
  }

  
  /**
   * The type of object described in objectData
   **/
  public FailureData objectType(ObjectTypeEnum objectType) {
    this.objectType = objectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of object described in objectData")
  @JsonProperty("objectType")
  public ObjectTypeEnum getObjectType() {
    return objectType;
  }
  
  public void setObjectType(ObjectTypeEnum objectType) {
    this.objectType = objectType;
  }

  
  /**
   * The data for the object, equivalent to fetching the object via its URL
   **/
  public FailureData objectData(Serializable objectData) {
    this.objectData = objectData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The data for the object, equivalent to fetching the object via its URL")
  @JsonProperty("objectData")
  public Serializable getObjectData() {
    return objectData;
  }
  
  public void setObjectData(Serializable objectData) {
    this.objectData = objectData;
  }

  
  /**
   * Supporting data used to debug the failure.  This will vary by failureType
   **/
  public FailureData extraData(Serializable extraData) {
    this.extraData = extraData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Supporting data used to debug the failure.  This will vary by failureType")
  @JsonProperty("extraData")
  public Serializable getExtraData() {
    return extraData;
  }
  
  public void setExtraData(Serializable extraData) {
    this.extraData = extraData;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailureData failureData = (FailureData) o;
    return Objects.equals(this.failureType, failureData.failureType) &&
        Objects.equals(this.objectRef, failureData.objectRef) &&
        Objects.equals(this.objectType, failureData.objectType) &&
        Objects.equals(this.objectData, failureData.objectData) &&
        Objects.equals(this.extraData, failureData.extraData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failureType, objectRef, objectType, objectData, extraData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailureData {\n");
    
    sb.append("    failureType: ").append(toIndentedString(failureType)).append("\n");
    sb.append("    objectRef: ").append(toIndentedString(objectRef)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    objectData: ").append(toIndentedString(objectData)).append("\n");
    sb.append("    extraData: ").append(toIndentedString(extraData)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

