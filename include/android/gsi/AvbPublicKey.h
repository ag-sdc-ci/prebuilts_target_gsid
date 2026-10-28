/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /usr/sbin/aidl --lang=cpp -I aidl -h gen/include -o gen/src aidl/android/gsi/AvbPublicKey.aidl
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
#include <tuple>
#include <utils/String16.h>
#include <vector>

namespace android {
namespace gsi {
class LIBBINDER_EXPORTED AvbPublicKey : public ::android::Parcelable {
public:
  ::std::vector<uint8_t> bytes;
  ::std::vector<uint8_t> sha1;
  inline bool operator==(const AvbPublicKey& _rhs) const {
    return std::tie(bytes, sha1) == std::tie(_rhs.bytes, _rhs.sha1);
  }
  inline bool operator<(const AvbPublicKey& _rhs) const {
    return std::tie(bytes, sha1) < std::tie(_rhs.bytes, _rhs.sha1);
  }
  inline bool operator!=(const AvbPublicKey& _rhs) const {
    return !(*this == _rhs);
  }
  inline bool operator>(const AvbPublicKey& _rhs) const {
    return _rhs < *this;
  }
  inline bool operator>=(const AvbPublicKey& _rhs) const {
    return !(*this < _rhs);
  }
  inline bool operator<=(const AvbPublicKey& _rhs) const {
    return !(_rhs < *this);
  }

  ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
  ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
  static const ::android::String16& getParcelableDescriptor() {
    [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gsi.AvbPublicKey");
    return DESCRIPTOR;
  }
  inline std::string toString() const {
    std::ostringstream _aidl_os;
    _aidl_os << "AvbPublicKey{";
    _aidl_os << "bytes: " << ::android::internal::ToString(bytes);
    _aidl_os << ", sha1: " << ::android::internal::ToString(sha1);
    _aidl_os << "}";
    return _aidl_os.str();
  }
};  // class AvbPublicKey
}  // namespace gsi
}  // namespace android
