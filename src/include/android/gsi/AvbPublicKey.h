/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /los-21/prebuilts/build-tools/linux-x86/bin/aidl --lang=cpp -I aidl -h gen/include -o gen/src aidl/android/gsi/AvbPublicKey.aidl
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
class AvbPublicKey : public ::android::Parcelable {
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
    static const ::android::StaticString16 DESCRIPTOR (u"android.gsi.AvbPublicKey");
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
