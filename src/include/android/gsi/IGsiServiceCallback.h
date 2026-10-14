/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /los-21/prebuilts/build-tools/linux-x86/bin/aidl --lang=cpp -I aidl -h gen/include -o gen/src aidl/android/gsi/IGsiServiceCallback.aidl
 */
#pragma once

#include <binder/IBinder.h>
#include <binder/IInterface.h>
#include <binder/Status.h>
#include <cstdint>
#include <utils/StrongPointer.h>

namespace android {
namespace gsi {
class IGsiServiceCallbackDelegator;

class IGsiServiceCallback : public ::android::IInterface {
public:
  typedef IGsiServiceCallbackDelegator DefaultDelegator;
  DECLARE_META_INTERFACE(GsiServiceCallback)
  virtual ::android::binder::Status onResult(int32_t result) = 0;
};  // class IGsiServiceCallback

class IGsiServiceCallbackDefault : public IGsiServiceCallback {
public:
  ::android::IBinder* onAsBinder() override {
    return nullptr;
  }
  ::android::binder::Status onResult(int32_t /*result*/) override {
    return ::android::binder::Status::fromStatusT(::android::UNKNOWN_TRANSACTION);
  }
};  // class IGsiServiceCallbackDefault
}  // namespace gsi
}  // namespace android
