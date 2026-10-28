/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /usr/sbin/aidl --lang=cpp -I aidl -h gen/include -o gen/src aidl/android/gsi/IProgressCallback.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <binder/IInterface.h>
#include <android/gsi/IProgressCallback.h>
#include <android/gsi/BnProgressCallback.h>
#include <binder/Delegate.h>


namespace android {
namespace gsi {
class LIBBINDER_EXPORTED BnProgressCallback : public ::android::BnInterface<IProgressCallback> {
public:
  static constexpr uint32_t TRANSACTION_onProgress = ::android::IBinder::FIRST_CALL_TRANSACTION + 0;
  explicit BnProgressCallback();
  ::android::status_t onTransact(uint32_t _aidl_code, const ::android::Parcel& _aidl_data, ::android::Parcel* _aidl_reply, uint32_t _aidl_flags) override;
};  // class BnProgressCallback

class LIBBINDER_EXPORTED IProgressCallbackDelegator : public BnProgressCallback {
public:
  explicit IProgressCallbackDelegator(const ::android::sp<IProgressCallback> &impl) : _aidl_delegate(impl) {}

  ::android::sp<IProgressCallback> getImpl() { return _aidl_delegate; }
  ::android::binder::Status onProgress(int64_t current, int64_t total) override {
    return _aidl_delegate->onProgress(current, total);
  }
private:
  ::android::sp<IProgressCallback> _aidl_delegate;
};  // class IProgressCallbackDelegator
}  // namespace gsi
}  // namespace android
