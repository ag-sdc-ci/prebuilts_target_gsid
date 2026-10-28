/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /usr/sbin/aidl --lang=cpp -I aidl -h gen/include -o gen/src aidl/android/gsi/IImageService.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <android/gsi/AvbPublicKey.h>
#include <android/gsi/IProgressCallback.h>
#include <android/gsi/MappedImage.h>
#include <binder/IBinder.h>
#include <binder/IInterface.h>
#include <binder/Status.h>
#include <cstdint>
#include <optional>
#include <string>
#include <utils/String16.h>
#include <utils/StrongPointer.h>
#include <vector>

namespace android::gsi {
class AvbPublicKey;
class IProgressCallback;
class MappedImage;
}  // namespace android::gsi
namespace android {
namespace gsi {
class LIBBINDER_EXPORTED IImageServiceDelegator;

class LIBBINDER_EXPORTED IImageService : public ::android::IInterface {
public:
  typedef IImageServiceDelegator DefaultDelegator;
  DECLARE_META_INTERFACE(ImageService)
  enum : int32_t { CREATE_IMAGE_DEFAULT = 0 };
  enum : int32_t { CREATE_IMAGE_READONLY = 1 };
  enum : int32_t { CREATE_IMAGE_ZERO_FILL = 2 };
  enum : int32_t { IMAGE_OK = 0 };
  enum : int32_t { IMAGE_ERROR = 1 };
  virtual ::android::binder::Status createBackingImage(const ::std::string& name, int64_t size, int32_t flags, const ::android::sp<::android::gsi::IProgressCallback>& on_progress) = 0;
  virtual ::android::binder::Status deleteBackingImage(const ::std::string& name) = 0;
  virtual ::android::binder::Status mapImageDevice(const ::std::string& name, int32_t timeout_ms, ::android::gsi::MappedImage* mapping) = 0;
  virtual ::android::binder::Status unmapImageDevice(const ::std::string& name) = 0;
  virtual ::android::binder::Status backingImageExists(const ::std::string& name, bool* _aidl_return) = 0;
  virtual ::android::binder::Status isImageMapped(const ::std::string& name, bool* _aidl_return) = 0;
  virtual ::android::binder::Status getAvbPublicKey(const ::std::string& name, ::android::gsi::AvbPublicKey* dst, int32_t* _aidl_return) = 0;
  virtual ::android::binder::Status getAllBackingImages(::std::vector<::std::string>* _aidl_return) = 0;
  virtual ::android::binder::Status zeroFillNewImage(const ::std::string& name, int64_t bytes) = 0;
  virtual ::android::binder::Status removeAllImages() = 0;
  virtual ::android::binder::Status disableImage(const ::std::string& name) = 0;
  virtual ::android::binder::Status removeDisabledImages() = 0;
  virtual ::android::binder::Status isImageDisabled(const ::std::string& name, bool* _aidl_return) = 0;
  virtual ::android::binder::Status getMappedImageDevice(const ::std::string& name, ::std::string* _aidl_return) = 0;
};  // class IImageService

class LIBBINDER_EXPORTED IImageServiceDefault : public IImageService {
public:
  ::android::IBinder* onAsBinder() override {
    return nullptr;
  }
  ::android::binder::Status createBackingImage(const ::std::string& /*name*/, int64_t /*size*/, int32_t /*flags*/, const ::android::sp<::android::gsi::IProgressCallback>& /*on_progress*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status deleteBackingImage(const ::std::string& /*name*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status mapImageDevice(const ::std::string& /*name*/, int32_t /*timeout_ms*/, ::android::gsi::MappedImage* /*mapping*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status unmapImageDevice(const ::std::string& /*name*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status backingImageExists(const ::std::string& /*name*/, bool* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status isImageMapped(const ::std::string& /*name*/, bool* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getAvbPublicKey(const ::std::string& /*name*/, ::android::gsi::AvbPublicKey* /*dst*/, int32_t* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getAllBackingImages(::std::vector<::std::string>* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status zeroFillNewImage(const ::std::string& /*name*/, int64_t /*bytes*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status removeAllImages() override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status disableImage(const ::std::string& /*name*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status removeDisabledImages() override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status isImageDisabled(const ::std::string& /*name*/, bool* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
  ::android::binder::Status getMappedImageDevice(const ::std::string& /*name*/, ::std::string* /*_aidl_return*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
};  // class IImageServiceDefault
}  // namespace gsi
}  // namespace android
