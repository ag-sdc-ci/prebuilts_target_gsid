/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /los-21/prebuilts/build-tools/linux-x86/bin/aidl --lang=cpp -I aidl -h gen/include -o gen/src aidl/android/gsi/IProgressCallback.aidl
 */
#pragma once

#include <binder/IBinder.h>
#include <binder/IInterface.h>
#include <binder/Status.h>
#include <cstdint>
#include <utils/StrongPointer.h>

namespace android {
namespace gsi {
class IProgressCallbackDelegator;

class IProgressCallback : public ::android::IInterface {
public:
  typedef IProgressCallbackDelegator DefaultDelegator;
  DECLARE_META_INTERFACE(ProgressCallback)
  virtual ::android::binder::Status onProgress(int64_t current, int64_t total) = 0;
};  // class IProgressCallback

class IProgressCallbackDefault : public IProgressCallback {
public:
  ::android::IBinder* onAsBinder() override {
    return nullptr;
  }
  ::android::binder::Status onProgress(int64_t /*current*/, int64_t /*total*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
};  // class IProgressCallbackDefault
}  // namespace gsi
}  // namespace android
