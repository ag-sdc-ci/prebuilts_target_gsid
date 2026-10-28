/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /usr/sbin/aidl --lang=cpp -I aidl -h gen/include -o gen/src aidl/android/gsi/GsiProgress.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <android/binder_to_string.h>
#include <binder/Parcel.h>
#include <binder/Status.h>
#include <cstdint>
#include <string>
#include <tuple>
#include <utils/String16.h>

namespace android {
namespace gsi {
class LIBBINDER_EXPORTED GsiProgress : public ::android::Parcelable {
public:
  ::std::string step;
  int32_t status = 0;
  int64_t bytes_processed = 0L;
  int64_t total_bytes = 0L;
  inline bool operator==(const GsiProgress& _rhs) const {
    return std::tie(step, status, bytes_processed, total_bytes) == std::tie(_rhs.step, _rhs.status, _rhs.bytes_processed, _rhs.total_bytes);
  }
  inline bool operator<(const GsiProgress& _rhs) const {
    return std::tie(step, status, bytes_processed, total_bytes) < std::tie(_rhs.step, _rhs.status, _rhs.bytes_processed, _rhs.total_bytes);
  }
  inline bool operator!=(const GsiProgress& _rhs) const {
    return !(*this == _rhs);
  }
  inline bool operator>(const GsiProgress& _rhs) const {
    return _rhs < *this;
  }
  inline bool operator>=(const GsiProgress& _rhs) const {
    return !(*this < _rhs);
  }
  inline bool operator<=(const GsiProgress& _rhs) const {
    return !(_rhs < *this);
  }

  ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
  ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
  static const ::android::String16& getParcelableDescriptor() {
    [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gsi.GsiProgress");
    return DESCRIPTOR;
  }
  inline std::string toString() const {
    std::ostringstream _aidl_os;
    _aidl_os << "GsiProgress{";
    _aidl_os << "step: " << ::android::internal::ToString(step);
    _aidl_os << ", status: " << ::android::internal::ToString(status);
    _aidl_os << ", bytes_processed: " << ::android::internal::ToString(bytes_processed);
    _aidl_os << ", total_bytes: " << ::android::internal::ToString(total_bytes);
    _aidl_os << "}";
    return _aidl_os.str();
  }
};  // class GsiProgress
}  // namespace gsi
}  // namespace android
