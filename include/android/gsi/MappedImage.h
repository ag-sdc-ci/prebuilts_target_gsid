/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /usr/sbin/aidl --lang=cpp -I aidl -h gen/include -o gen/src aidl/android/gsi/MappedImage.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
#pragma once

#include <android/binder_to_string.h>
#include <binder/Parcel.h>
#include <binder/Status.h>
#include <string>
#include <tuple>
#include <utils/String16.h>

namespace android {
namespace gsi {
class LIBBINDER_EXPORTED MappedImage : public ::android::Parcelable {
public:
  ::std::string path;
  inline bool operator==(const MappedImage& _rhs) const {
    return std::tie(path) == std::tie(_rhs.path);
  }
  inline bool operator<(const MappedImage& _rhs) const {
    return std::tie(path) < std::tie(_rhs.path);
  }
  inline bool operator!=(const MappedImage& _rhs) const {
    return !(*this == _rhs);
  }
  inline bool operator>(const MappedImage& _rhs) const {
    return _rhs < *this;
  }
  inline bool operator>=(const MappedImage& _rhs) const {
    return !(*this < _rhs);
  }
  inline bool operator<=(const MappedImage& _rhs) const {
    return !(_rhs < *this);
  }

  ::android::status_t readFromParcel(const ::android::Parcel* _aidl_parcel) final;
  ::android::status_t writeToParcel(::android::Parcel* _aidl_parcel) const final;
  static const ::android::String16& getParcelableDescriptor() {
    [[clang::no_destroy]] static const ::android::StaticString16 DESCRIPTOR (u"android.gsi.MappedImage");
    return DESCRIPTOR;
  }
  inline std::string toString() const {
    std::ostringstream _aidl_os;
    _aidl_os << "MappedImage{";
    _aidl_os << "path: " << ::android::internal::ToString(path);
    _aidl_os << "}";
    return _aidl_os.str();
  }
};  // class MappedImage
}  // namespace gsi
}  // namespace android
