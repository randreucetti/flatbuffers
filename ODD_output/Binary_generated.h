// automatically generated by the FlatBuffers compiler, do not modify

#ifndef FLATBUFFERS_GENERATED_BINARY_ODD_GX840_H_
#define FLATBUFFERS_GENERATED_BINARY_ODD_GX840_H_

#include "flatbuffers/flatbuffers.h"

namespace odd {
namespace Gx840 {

struct Binary;

struct Binary : private flatbuffers::Table {
  const flatbuffers::Vector<int8_t> *data() const { return GetPointer<const flatbuffers::Vector<int8_t> *>(4); }
  bool Verify(const flatbuffers::Verifier &verifier) const {
    return VerifyTable(verifier) &&
           VerifyField<flatbuffers::uoffset_t>(verifier, 4 /* data */) &&
           verifier.Verify(data());
  }
};

struct BinaryBuilder {
  flatbuffers::FlatBufferBuilder &fbb_;
  flatbuffers::uoffset_t start_;
  void add_data(flatbuffers::Offset<flatbuffers::Vector<int8_t>> data) { fbb_.AddOffset(4, data); }
  BinaryBuilder(flatbuffers::FlatBufferBuilder &_fbb) : fbb_(_fbb) { start_ = fbb_.StartTable(); }
  BinaryBuilder &operator=(const BinaryBuilder &);
  flatbuffers::Offset<Binary> Finish() { return flatbuffers::Offset<Binary>(fbb_.EndTable(start_, 1)); }
};

inline flatbuffers::Offset<Binary> CreateBinary(flatbuffers::FlatBufferBuilder &_fbb,
   flatbuffers::Offset<flatbuffers::Vector<int8_t>> data = 0) {
  BinaryBuilder builder_(_fbb);
  builder_.add_data(data);
  return builder_.Finish();
}

};  // namespace odd
};  // namespace Gx840

#endif  // FLATBUFFERS_GENERATED_BINARY_ODD_GX840_H_
