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
#include <binder/Status.h>
#include <cstdint>
#include <utils/StrongPointer.h>

namespace android {
namespace gsi {
class LIBBINDER_EXPORTED IGsiServiceCallbackDelegator;

class LIBBINDER_EXPORTED IGsiServiceCallback : public ::android::IInterface {
public:
  typedef IGsiServiceCallbackDelegator DefaultDelegator;
  DECLARE_META_INTERFACE(GsiServiceCallback)
  virtual ::android::binder::Status onResult(int32_t result) = 0;
};  // class IGsiServiceCallback

class LIBBINDER_EXPORTED IGsiServiceCallbackDefault : public IGsiServiceCallback {
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
