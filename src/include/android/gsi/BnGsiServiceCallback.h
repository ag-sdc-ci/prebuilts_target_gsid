/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /los-21/prebuilts/build-tools/linux-x86/bin/aidl --lang=cpp -I aidl -h gen/include -o gen/src aidl/android/gsi/IGsiServiceCallback.aidl
 */
#pragma once

#include <binder/IInterface.h>
#include <android/gsi/IGsiServiceCallback.h>
#include <android/gsi/BnGsiServiceCallback.h>
#include <binder/Delegate.h>


namespace android {
namespace gsi {
class BnGsiServiceCallback : public ::android::BnInterface<IGsiServiceCallback> {
public:
  static constexpr uint32_t TRANSACTION_onResult = ::android::IBinder::FIRST_CALL_TRANSACTION + 0;
  explicit BnGsiServiceCallback();
  ::android::status_t onTransact(uint32_t _aidl_code, const ::android::Parcel& _aidl_data, ::android::Parcel* _aidl_reply, uint32_t _aidl_flags) override;
};  // class BnGsiServiceCallback

class IGsiServiceCallbackDelegator : public BnGsiServiceCallback {
public:
  explicit IGsiServiceCallbackDelegator(const ::android::sp<IGsiServiceCallback> &impl) : _aidl_delegate(impl) {}

  ::android::sp<IGsiServiceCallback> getImpl() { return _aidl_delegate; }
  ::android::binder::Status onResult(int32_t result) override {
    return _aidl_delegate->onResult(result);
  }
private:
  ::android::sp<IGsiServiceCallback> _aidl_delegate;
};  // class IGsiServiceCallbackDelegator
}  // namespace gsi
}  // namespace android
