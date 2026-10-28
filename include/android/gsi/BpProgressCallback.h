/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /usr/sbin/aidl --lang=cpp -I aidl -h gen/include -o gen/src aidl/android/gsi/IProgressCallback.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <binder/IBinder.h>
#include <binder/IInterface.h>
#include <utils/Errors.h>
#include <android/gsi/IProgressCallback.h>

namespace android {
namespace gsi {
class LIBBINDER_EXPORTED BpProgressCallback : public ::android::BpInterface<IProgressCallback> {
public:
  explicit BpProgressCallback(const ::android::sp<::android::IBinder>& _aidl_impl);
  virtual ~BpProgressCallback() = default;
  ::android::binder::Status onProgress(int64_t current, int64_t total) override;
};  // class BpProgressCallback
}  // namespace gsi
}  // namespace android
