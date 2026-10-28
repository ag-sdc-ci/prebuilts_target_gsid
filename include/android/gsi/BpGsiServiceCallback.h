/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /usr/sbin/aidl --lang=cpp -I aidl -h gen/include -o gen/src aidl/android/gsi/IGsiServiceCallback.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <binder/IBinder.h>
#include <binder/IInterface.h>
#include <utils/Errors.h>
#include <android/gsi/IGsiServiceCallback.h>

namespace android {
namespace gsi {
class LIBBINDER_EXPORTED BpGsiServiceCallback : public ::android::BpInterface<IGsiServiceCallback> {
public:
  explicit BpGsiServiceCallback(const ::android::sp<::android::IBinder>& _aidl_impl);
  virtual ~BpGsiServiceCallback() = default;
  ::android::binder::Status onResult(int32_t result) override;
};  // class BpGsiServiceCallback
}  // namespace gsi
}  // namespace android
