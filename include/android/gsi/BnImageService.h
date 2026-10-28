/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /usr/sbin/aidl --lang=cpp -I aidl -h gen/include -o gen/src aidl/android/gsi/IImageService.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <binder/IInterface.h>
#include <android/gsi/IImageService.h>
#include <android/gsi/BnImageService.h>
#include <android/gsi/BnProgressCallback.h>
#include <binder/Delegate.h>


namespace android {
namespace gsi {
class LIBBINDER_EXPORTED BnImageService : public ::android::BnInterface<IImageService> {
public:
  static constexpr uint32_t TRANSACTION_createBackingImage = ::android::IBinder::FIRST_CALL_TRANSACTION + 0;
  static constexpr uint32_t TRANSACTION_deleteBackingImage = ::android::IBinder::FIRST_CALL_TRANSACTION + 1;
  static constexpr uint32_t TRANSACTION_mapImageDevice = ::android::IBinder::FIRST_CALL_TRANSACTION + 2;
  static constexpr uint32_t TRANSACTION_unmapImageDevice = ::android::IBinder::FIRST_CALL_TRANSACTION + 3;
  static constexpr uint32_t TRANSACTION_backingImageExists = ::android::IBinder::FIRST_CALL_TRANSACTION + 4;
  static constexpr uint32_t TRANSACTION_isImageMapped = ::android::IBinder::FIRST_CALL_TRANSACTION + 5;
  static constexpr uint32_t TRANSACTION_getAvbPublicKey = ::android::IBinder::FIRST_CALL_TRANSACTION + 6;
  static constexpr uint32_t TRANSACTION_getAllBackingImages = ::android::IBinder::FIRST_CALL_TRANSACTION + 7;
  static constexpr uint32_t TRANSACTION_zeroFillNewImage = ::android::IBinder::FIRST_CALL_TRANSACTION + 8;
  static constexpr uint32_t TRANSACTION_removeAllImages = ::android::IBinder::FIRST_CALL_TRANSACTION + 9;
  static constexpr uint32_t TRANSACTION_disableImage = ::android::IBinder::FIRST_CALL_TRANSACTION + 10;
  static constexpr uint32_t TRANSACTION_removeDisabledImages = ::android::IBinder::FIRST_CALL_TRANSACTION + 11;
  static constexpr uint32_t TRANSACTION_isImageDisabled = ::android::IBinder::FIRST_CALL_TRANSACTION + 12;
  static constexpr uint32_t TRANSACTION_getMappedImageDevice = ::android::IBinder::FIRST_CALL_TRANSACTION + 13;
  explicit BnImageService();
  ::android::status_t onTransact(uint32_t _aidl_code, const ::android::Parcel& _aidl_data, ::android::Parcel* _aidl_reply, uint32_t _aidl_flags) override;
};  // class BnImageService

class LIBBINDER_EXPORTED IImageServiceDelegator : public BnImageService {
public:
  explicit IImageServiceDelegator(const ::android::sp<IImageService> &impl) : _aidl_delegate(impl) {}

  ::android::sp<IImageService> getImpl() { return _aidl_delegate; }
  ::android::binder::Status createBackingImage(const ::std::string& name, int64_t size, int32_t flags, const ::android::sp<::android::gsi::IProgressCallback>& on_progress) override {
    ::android::sp<::android::gsi::IProgressCallbackDelegator> _on_progress;
    if (on_progress) {
      _on_progress = ::android::sp<::android::gsi::IProgressCallbackDelegator>::cast(delegate(on_progress));
    }
    return _aidl_delegate->createBackingImage(name, size, flags, _on_progress);
  }
  ::android::binder::Status deleteBackingImage(const ::std::string& name) override {
    return _aidl_delegate->deleteBackingImage(name);
  }
  ::android::binder::Status mapImageDevice(const ::std::string& name, int32_t timeout_ms, ::android::gsi::MappedImage* mapping) override {
    return _aidl_delegate->mapImageDevice(name, timeout_ms, mapping);
  }
  ::android::binder::Status unmapImageDevice(const ::std::string& name) override {
    return _aidl_delegate->unmapImageDevice(name);
  }
  ::android::binder::Status backingImageExists(const ::std::string& name, bool* _aidl_return) override {
    return _aidl_delegate->backingImageExists(name, _aidl_return);
  }
  ::android::binder::Status isImageMapped(const ::std::string& name, bool* _aidl_return) override {
    return _aidl_delegate->isImageMapped(name, _aidl_return);
  }
  ::android::binder::Status getAvbPublicKey(const ::std::string& name, ::android::gsi::AvbPublicKey* dst, int32_t* _aidl_return) override {
    return _aidl_delegate->getAvbPublicKey(name, dst, _aidl_return);
  }
  ::android::binder::Status getAllBackingImages(::std::vector<::std::string>* _aidl_return) override {
    return _aidl_delegate->getAllBackingImages(_aidl_return);
  }
  ::android::binder::Status zeroFillNewImage(const ::std::string& name, int64_t bytes) override {
    return _aidl_delegate->zeroFillNewImage(name, bytes);
  }
  ::android::binder::Status removeAllImages() override {
    return _aidl_delegate->removeAllImages();
  }
  ::android::binder::Status disableImage(const ::std::string& name) override {
    return _aidl_delegate->disableImage(name);
  }
  ::android::binder::Status removeDisabledImages() override {
    return _aidl_delegate->removeDisabledImages();
  }
  ::android::binder::Status isImageDisabled(const ::std::string& name, bool* _aidl_return) override {
    return _aidl_delegate->isImageDisabled(name, _aidl_return);
  }
  ::android::binder::Status getMappedImageDevice(const ::std::string& name, ::std::string* _aidl_return) override {
    return _aidl_delegate->getMappedImageDevice(name, _aidl_return);
  }
private:
  ::android::sp<IImageService> _aidl_delegate;
};  // class IImageServiceDelegator
}  // namespace gsi
}  // namespace android
