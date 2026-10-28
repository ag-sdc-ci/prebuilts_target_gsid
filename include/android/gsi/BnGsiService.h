/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /usr/sbin/aidl --lang=cpp -I aidl -h gen/include -o gen/src aidl/android/gsi/IGsiService.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <binder/IInterface.h>
#include <android/gsi/IGsiService.h>
#include <android/gsi/BnGsiService.h>
#include <android/gsi/BnGsiServiceCallback.h>
#include <android/gsi/BnImageService.h>
#include <binder/Delegate.h>


namespace android {
namespace gsi {
class LIBBINDER_EXPORTED BnGsiService : public ::android::BnInterface<IGsiService> {
public:
  static constexpr uint32_t TRANSACTION_commitGsiChunkFromStream = ::android::IBinder::FIRST_CALL_TRANSACTION + 0;
  static constexpr uint32_t TRANSACTION_getInstallProgress = ::android::IBinder::FIRST_CALL_TRANSACTION + 1;
  static constexpr uint32_t TRANSACTION_setGsiAshmem = ::android::IBinder::FIRST_CALL_TRANSACTION + 2;
  static constexpr uint32_t TRANSACTION_commitGsiChunkFromAshmem = ::android::IBinder::FIRST_CALL_TRANSACTION + 3;
  static constexpr uint32_t TRANSACTION_enableGsi = ::android::IBinder::FIRST_CALL_TRANSACTION + 4;
  static constexpr uint32_t TRANSACTION_enableGsiAsync = ::android::IBinder::FIRST_CALL_TRANSACTION + 5;
  static constexpr uint32_t TRANSACTION_isGsiEnabled = ::android::IBinder::FIRST_CALL_TRANSACTION + 6;
  static constexpr uint32_t TRANSACTION_cancelGsiInstall = ::android::IBinder::FIRST_CALL_TRANSACTION + 7;
  static constexpr uint32_t TRANSACTION_isGsiInstallInProgress = ::android::IBinder::FIRST_CALL_TRANSACTION + 8;
  static constexpr uint32_t TRANSACTION_removeGsi = ::android::IBinder::FIRST_CALL_TRANSACTION + 9;
  static constexpr uint32_t TRANSACTION_removeGsiAsync = ::android::IBinder::FIRST_CALL_TRANSACTION + 10;
  static constexpr uint32_t TRANSACTION_disableGsi = ::android::IBinder::FIRST_CALL_TRANSACTION + 11;
  static constexpr uint32_t TRANSACTION_isGsiInstalled = ::android::IBinder::FIRST_CALL_TRANSACTION + 12;
  static constexpr uint32_t TRANSACTION_isGsiRunning = ::android::IBinder::FIRST_CALL_TRANSACTION + 13;
  static constexpr uint32_t TRANSACTION_getActiveDsuSlot = ::android::IBinder::FIRST_CALL_TRANSACTION + 14;
  static constexpr uint32_t TRANSACTION_getInstalledGsiImageDir = ::android::IBinder::FIRST_CALL_TRANSACTION + 15;
  static constexpr uint32_t TRANSACTION_getInstalledDsuSlots = ::android::IBinder::FIRST_CALL_TRANSACTION + 16;
  static constexpr uint32_t TRANSACTION_openInstall = ::android::IBinder::FIRST_CALL_TRANSACTION + 17;
  static constexpr uint32_t TRANSACTION_closeInstall = ::android::IBinder::FIRST_CALL_TRANSACTION + 18;
  static constexpr uint32_t TRANSACTION_createPartition = ::android::IBinder::FIRST_CALL_TRANSACTION + 19;
  static constexpr uint32_t TRANSACTION_closePartition = ::android::IBinder::FIRST_CALL_TRANSACTION + 20;
  static constexpr uint32_t TRANSACTION_zeroPartition = ::android::IBinder::FIRST_CALL_TRANSACTION + 21;
  static constexpr uint32_t TRANSACTION_openImageService = ::android::IBinder::FIRST_CALL_TRANSACTION + 22;
  static constexpr uint32_t TRANSACTION_dumpDeviceMapperDevices = ::android::IBinder::FIRST_CALL_TRANSACTION + 23;
  static constexpr uint32_t TRANSACTION_getAvbPublicKey = ::android::IBinder::FIRST_CALL_TRANSACTION + 24;
  static constexpr uint32_t TRANSACTION_suggestScratchSize = ::android::IBinder::FIRST_CALL_TRANSACTION + 25;
  explicit BnGsiService();
  ::android::status_t onTransact(uint32_t _aidl_code, const ::android::Parcel& _aidl_data, ::android::Parcel* _aidl_reply, uint32_t _aidl_flags) override;
};  // class BnGsiService

class LIBBINDER_EXPORTED IGsiServiceDelegator : public BnGsiService {
public:
  explicit IGsiServiceDelegator(const ::android::sp<IGsiService> &impl) : _aidl_delegate(impl) {}

  ::android::sp<IGsiService> getImpl() { return _aidl_delegate; }
  ::android::binder::Status commitGsiChunkFromStream(const ::android::os::ParcelFileDescriptor& stream, int64_t bytes, bool* _aidl_return) override {
    return _aidl_delegate->commitGsiChunkFromStream(stream, bytes, _aidl_return);
  }
  ::android::binder::Status getInstallProgress(::android::gsi::GsiProgress* _aidl_return) override {
    return _aidl_delegate->getInstallProgress(_aidl_return);
  }
  ::android::binder::Status setGsiAshmem(const ::android::os::ParcelFileDescriptor& stream, int64_t size, bool* _aidl_return) override {
    return _aidl_delegate->setGsiAshmem(stream, size, _aidl_return);
  }
  ::android::binder::Status commitGsiChunkFromAshmem(int64_t bytes, bool* _aidl_return) override {
    return _aidl_delegate->commitGsiChunkFromAshmem(bytes, _aidl_return);
  }
  ::android::binder::Status enableGsi(bool oneShot, const ::std::string& dsuSlot, int32_t* _aidl_return) override {
    return _aidl_delegate->enableGsi(oneShot, dsuSlot, _aidl_return);
  }
  ::android::binder::Status enableGsiAsync(bool oneShot, const ::std::string& dsuSlot, const ::android::sp<::android::gsi::IGsiServiceCallback>& result) override {
    ::android::sp<::android::gsi::IGsiServiceCallbackDelegator> _result;
    if (result) {
      _result = ::android::sp<::android::gsi::IGsiServiceCallbackDelegator>::cast(delegate(result));
    }
    return _aidl_delegate->enableGsiAsync(oneShot, dsuSlot, _result);
  }
  ::android::binder::Status isGsiEnabled(bool* _aidl_return) override {
    return _aidl_delegate->isGsiEnabled(_aidl_return);
  }
  ::android::binder::Status cancelGsiInstall(bool* _aidl_return) override {
    return _aidl_delegate->cancelGsiInstall(_aidl_return);
  }
  ::android::binder::Status isGsiInstallInProgress(bool* _aidl_return) override {
    return _aidl_delegate->isGsiInstallInProgress(_aidl_return);
  }
  ::android::binder::Status removeGsi(bool* _aidl_return) override {
    return _aidl_delegate->removeGsi(_aidl_return);
  }
  ::android::binder::Status removeGsiAsync(const ::android::sp<::android::gsi::IGsiServiceCallback>& result) override {
    ::android::sp<::android::gsi::IGsiServiceCallbackDelegator> _result;
    if (result) {
      _result = ::android::sp<::android::gsi::IGsiServiceCallbackDelegator>::cast(delegate(result));
    }
    return _aidl_delegate->removeGsiAsync(_result);
  }
  ::android::binder::Status disableGsi(bool* _aidl_return) override {
    return _aidl_delegate->disableGsi(_aidl_return);
  }
  ::android::binder::Status isGsiInstalled(bool* _aidl_return) override {
    return _aidl_delegate->isGsiInstalled(_aidl_return);
  }
  ::android::binder::Status isGsiRunning(bool* _aidl_return) override {
    return _aidl_delegate->isGsiRunning(_aidl_return);
  }
  ::android::binder::Status getActiveDsuSlot(::std::string* _aidl_return) override {
    return _aidl_delegate->getActiveDsuSlot(_aidl_return);
  }
  ::android::binder::Status getInstalledGsiImageDir(::std::string* _aidl_return) override {
    return _aidl_delegate->getInstalledGsiImageDir(_aidl_return);
  }
  ::android::binder::Status getInstalledDsuSlots(::std::vector<::std::string>* _aidl_return) override {
    return _aidl_delegate->getInstalledDsuSlots(_aidl_return);
  }
  ::android::binder::Status openInstall(const ::std::string& installDir, int32_t* _aidl_return) override {
    return _aidl_delegate->openInstall(installDir, _aidl_return);
  }
  ::android::binder::Status closeInstall(int32_t* _aidl_return) override {
    return _aidl_delegate->closeInstall(_aidl_return);
  }
  ::android::binder::Status createPartition(const ::std::string& name, int64_t size, bool readOnly, int32_t* _aidl_return) override {
    return _aidl_delegate->createPartition(name, size, readOnly, _aidl_return);
  }
  ::android::binder::Status closePartition(int32_t* _aidl_return) override {
    return _aidl_delegate->closePartition(_aidl_return);
  }
  ::android::binder::Status zeroPartition(const ::std::string& name, int32_t* _aidl_return) override {
    return _aidl_delegate->zeroPartition(name, _aidl_return);
  }
  ::android::binder::Status openImageService(const ::std::string& prefix, ::android::sp<::android::gsi::IImageService>* _aidl_return) override {
    auto _status = _aidl_delegate->openImageService(prefix, _aidl_return);
    if (*_aidl_return) {
      *_aidl_return = ::android::sp<::android::gsi::IImageServiceDelegator>::cast(delegate(*_aidl_return));
    }
    return _status;
  }
  ::android::binder::Status dumpDeviceMapperDevices(::std::string* _aidl_return) override {
    return _aidl_delegate->dumpDeviceMapperDevices(_aidl_return);
  }
  ::android::binder::Status getAvbPublicKey(::android::gsi::AvbPublicKey* dst, int32_t* _aidl_return) override {
    return _aidl_delegate->getAvbPublicKey(dst, _aidl_return);
  }
  ::android::binder::Status suggestScratchSize(int64_t* _aidl_return) override {
    return _aidl_delegate->suggestScratchSize(_aidl_return);
  }
private:
  ::android::sp<IGsiService> _aidl_delegate;
};  // class IGsiServiceDelegator
}  // namespace gsi
}  // namespace android
