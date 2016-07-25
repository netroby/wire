// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: google/protobuf/descriptor.proto at 637:1
package com.google.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.List;
import okio.ByteString;

/**
 * ===================================================================
 * Optional source code info
 * Encapsulates information about the original source file from which a
 * FileDescriptorProto was generated.
 */
public final class SourceCodeInfo extends Message<SourceCodeInfo, SourceCodeInfo.Builder> {
  public static final ProtoAdapter<SourceCodeInfo> ADAPTER = new ProtoAdapter_SourceCodeInfo();

  private static final long serialVersionUID = 0L;

  /**
   * A Location identifies a piece of source code in a .proto file which
   * corresponds to a particular definition.  This information is intended
   * to be useful to IDEs, code indexers, documentation generators, and similar
   * tools.
   *
   * For example, say we have a file like:
   *   message Foo {
   *     optional string foo = 1;
   *   }
   * Let's look at just the field definition:
   *   optional string foo = 1;
   *   ^       ^^     ^^  ^  ^^^
   *   a       bc     de  f  ghi
   * We have the following locations:
   *   span   path               represents
   *   [a,i)  [ 4, 0, 2, 0 ]     The whole field definition.
   *   [a,b)  [ 4, 0, 2, 0, 4 ]  The label (optional).
   *   [c,d)  [ 4, 0, 2, 0, 5 ]  The type (string).
   *   [e,f)  [ 4, 0, 2, 0, 1 ]  The name (foo).
   *   [g,h)  [ 4, 0, 2, 0, 3 ]  The number (1).
   *
   * Notes:
   * - A location may refer to a repeated field itself (i.e. not to any
   *   particular index within it).  This is used whenever a set of elements are
   *   logically enclosed in a single code segment.  For example, an entire
   *   extend block (possibly containing multiple extension definitions) will
   *   have an outer location whose path refers to the "extensions" repeated
   *   field without an index.
   * - Multiple locations may have the same path.  This happens when a single
   *   logical declaration is spread out across multiple places.  The most
   *   obvious example is the "extend" block again -- there may be multiple
   *   extend blocks in the same scope, each of which will have the same path.
   * - A location's span is not always a subset of its parent's span.  For
   *   example, the "extendee" of an extension declaration appears at the
   *   beginning of the "extend" block and is shared by all extensions within
   *   the block.
   * - Just because a location's span is a subset of some other location's span
   *   does not mean that it is a descendent.  For example, a "group" defines
   *   both a type and a field in a single declaration.  Thus, the locations
   *   corresponding to the type and field and their components will overlap.
   * - Code which tries to interpret locations should probably be designed to
   *   ignore those that it doesn't understand, as more types of locations could
   *   be recorded in the future.
   */
  @WireField(
      tag = 1,
      adapter = "com.google.protobuf.SourceCodeInfo$Location#ADAPTER",
      label = WireField.Label.REPEATED
  )
  public final List<Location> location;

  public SourceCodeInfo(List<Location> location) {
    this(location, ByteString.EMPTY);
  }

  public SourceCodeInfo(List<Location> location, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.location = Internal.immutableCopyOf("location", location);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.location = Internal.copyOf("location", location);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SourceCodeInfo)) return false;
    SourceCodeInfo o = (SourceCodeInfo) other;
    return unknownFields().equals(o.unknownFields())
        && location.equals(o.location);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + location.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (!location.isEmpty()) builder.append(", location=").append(location);
    return builder.replace(0, 2, "SourceCodeInfo{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<SourceCodeInfo, Builder> {
    public List<Location> location;

    public Builder() {
      location = Internal.newMutableList();
    }

    /**
     * A Location identifies a piece of source code in a .proto file which
     * corresponds to a particular definition.  This information is intended
     * to be useful to IDEs, code indexers, documentation generators, and similar
     * tools.
     *
     * For example, say we have a file like:
     *   message Foo {
     *     optional string foo = 1;
     *   }
     * Let's look at just the field definition:
     *   optional string foo = 1;
     *   ^       ^^     ^^  ^  ^^^
     *   a       bc     de  f  ghi
     * We have the following locations:
     *   span   path               represents
     *   [a,i)  [ 4, 0, 2, 0 ]     The whole field definition.
     *   [a,b)  [ 4, 0, 2, 0, 4 ]  The label (optional).
     *   [c,d)  [ 4, 0, 2, 0, 5 ]  The type (string).
     *   [e,f)  [ 4, 0, 2, 0, 1 ]  The name (foo).
     *   [g,h)  [ 4, 0, 2, 0, 3 ]  The number (1).
     *
     * Notes:
     * - A location may refer to a repeated field itself (i.e. not to any
     *   particular index within it).  This is used whenever a set of elements are
     *   logically enclosed in a single code segment.  For example, an entire
     *   extend block (possibly containing multiple extension definitions) will
     *   have an outer location whose path refers to the "extensions" repeated
     *   field without an index.
     * - Multiple locations may have the same path.  This happens when a single
     *   logical declaration is spread out across multiple places.  The most
     *   obvious example is the "extend" block again -- there may be multiple
     *   extend blocks in the same scope, each of which will have the same path.
     * - A location's span is not always a subset of its parent's span.  For
     *   example, the "extendee" of an extension declaration appears at the
     *   beginning of the "extend" block and is shared by all extensions within
     *   the block.
     * - Just because a location's span is a subset of some other location's span
     *   does not mean that it is a descendent.  For example, a "group" defines
     *   both a type and a field in a single declaration.  Thus, the locations
     *   corresponding to the type and field and their components will overlap.
     * - Code which tries to interpret locations should probably be designed to
     *   ignore those that it doesn't understand, as more types of locations could
     *   be recorded in the future.
     */
    public Builder location(List<Location> location) {
      Internal.checkElementsNotNull(location);
      this.location = location;
      return this;
    }

    @Override
    public SourceCodeInfo build() {
      return new SourceCodeInfo(location, super.buildUnknownFields());
    }
  }

  public static final class Location extends Message<Location, Location.Builder> {
    public static final ProtoAdapter<Location> ADAPTER = new ProtoAdapter_Location();

    private static final long serialVersionUID = 0L;

    public static final String DEFAULT_LEADING_COMMENTS = "";

    public static final String DEFAULT_TRAILING_COMMENTS = "";

    /**
     * Identifies which part of the FileDescriptorProto was defined at this
     * location.
     *
     * Each element is a field number or an index.  They form a path from
     * the root FileDescriptorProto to the place where the definition.  For
     * example, this path:
     *   [ 4, 3, 2, 7, 1 ]
     * refers to:
     *   file.message_type(3)  // 4, 3
     *       .field(7)         // 2, 7
     *       .name()           // 1
     * This is because FileDescriptorProto.message_type has field number 4:
     *   repeated DescriptorProto message_type = 4;
     * and DescriptorProto.field has field number 2:
     *   repeated FieldDescriptorProto field = 2;
     * and FieldDescriptorProto.name has field number 1:
     *   optional string name = 1;
     *
     * Thus, the above path gives the location of a field name.  If we removed
     * the last element:
     *   [ 4, 3, 2, 7 ]
     * this path refers to the whole field declaration (from the beginning
     * of the label to the terminating semicolon).
     */
    @WireField(
        tag = 1,
        adapter = "com.squareup.wire.ProtoAdapter#INT32",
        label = WireField.Label.PACKED
    )
    public final List<Integer> path;

    /**
     * Always has exactly three or four elements: start line, start column,
     * end line (optional, otherwise assumed same as start line), end column.
     * These are packed into a single field for efficiency.  Note that line
     * and column numbers are zero-based -- typically you will want to add
     * 1 to each before displaying to a user.
     */
    @WireField(
        tag = 2,
        adapter = "com.squareup.wire.ProtoAdapter#INT32",
        label = WireField.Label.PACKED
    )
    public final List<Integer> span;

    /**
     * If this SourceCodeInfo represents a complete declaration, these are any
     * comments appearing before and after the declaration which appear to be
     * attached to the declaration.
     *
     * A series of line comments appearing on consecutive lines, with no other
     * tokens appearing on those lines, will be treated as a single comment.
     *
     * leading_detached_comments will keep paragraphs of comments that appear
     * before (but not connected to) the current element. Each paragraph,
     * separated by empty lines, will be one comment element in the repeated
     * field.
     *
     * Only the comment content is provided; comment markers (e.g. //) are
     * stripped out.  For block comments, leading whitespace and an asterisk
     * will be stripped from the beginning of each line other than the first.
     * Newlines are included in the output.
     *
     * Examples:
     *
     *   optional int32 foo = 1;  // Comment attached to foo.
     *   // Comment attached to bar.
     *   optional int32 bar = 2;
     *
     *   optional string baz = 3;
     *   // Comment attached to baz.
     *   // Another line attached to baz.
     *
     *   // Comment attached to qux.
     *   //
     *   // Another line attached to qux.
     *   optional double qux = 4;
     *
     *   // Detached comment for corge. This is not leading or trailing comments
     *   // to qux or corge because there are blank lines separating it from
     *   // both.
     *
     *   // Detached comment for corge paragraph 2.
     *
     *   optional string corge = 5;
     *   /* Block comment attached
     *    * to corge.  Leading asterisks
     *    * will be removed. &#42;/
     *   /* Block comment attached to
     *    * grault. &#42;/
     *   optional int32 grault = 6;
     *
     *   // ignored detached comments.
     */
    @WireField(
        tag = 3,
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
    )
    public final String leading_comments;

    @WireField(
        tag = 4,
        adapter = "com.squareup.wire.ProtoAdapter#STRING"
    )
    public final String trailing_comments;

    @WireField(
        tag = 6,
        adapter = "com.squareup.wire.ProtoAdapter#STRING",
        label = WireField.Label.REPEATED
    )
    public final List<String> leading_detached_comments;

    public Location(List<Integer> path, List<Integer> span, String leading_comments, String trailing_comments, List<String> leading_detached_comments) {
      this(path, span, leading_comments, trailing_comments, leading_detached_comments, ByteString.EMPTY);
    }

    public Location(List<Integer> path, List<Integer> span, String leading_comments, String trailing_comments, List<String> leading_detached_comments, ByteString unknownFields) {
      super(ADAPTER, unknownFields);
      this.path = Internal.immutableCopyOf("path", path);
      this.span = Internal.immutableCopyOf("span", span);
      this.leading_comments = leading_comments;
      this.trailing_comments = trailing_comments;
      this.leading_detached_comments = Internal.immutableCopyOf("leading_detached_comments", leading_detached_comments);
    }

    @Override
    public Builder newBuilder() {
      Builder builder = new Builder();
      builder.path = Internal.copyOf("path", path);
      builder.span = Internal.copyOf("span", span);
      builder.leading_comments = leading_comments;
      builder.trailing_comments = trailing_comments;
      builder.leading_detached_comments = Internal.copyOf("leading_detached_comments", leading_detached_comments);
      builder.addUnknownFields(unknownFields());
      return builder;
    }

    @Override
    public boolean equals(Object other) {
      if (other == this) return true;
      if (!(other instanceof Location)) return false;
      Location o = (Location) other;
      return unknownFields().equals(o.unknownFields())
          && path.equals(o.path)
          && span.equals(o.span)
          && Internal.equals(leading_comments, o.leading_comments)
          && Internal.equals(trailing_comments, o.trailing_comments)
          && leading_detached_comments.equals(o.leading_detached_comments);
    }

    @Override
    public int hashCode() {
      int result = super.hashCode;
      if (result == 0) {
        result = unknownFields().hashCode();
        result = result * 37 + path.hashCode();
        result = result * 37 + span.hashCode();
        result = result * 37 + (leading_comments != null ? leading_comments.hashCode() : 0);
        result = result * 37 + (trailing_comments != null ? trailing_comments.hashCode() : 0);
        result = result * 37 + leading_detached_comments.hashCode();
        super.hashCode = result;
      }
      return result;
    }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
      if (!path.isEmpty()) builder.append(", path=").append(path);
      if (!span.isEmpty()) builder.append(", span=").append(span);
      if (leading_comments != null) builder.append(", leading_comments=").append(leading_comments);
      if (trailing_comments != null) builder.append(", trailing_comments=").append(trailing_comments);
      if (!leading_detached_comments.isEmpty()) builder.append(", leading_detached_comments=").append(leading_detached_comments);
      return builder.replace(0, 2, "Location{").append('}').toString();
    }

    public static final class Builder extends Message.Builder<Location, Builder> {
      public List<Integer> path;

      public List<Integer> span;

      public String leading_comments;

      public String trailing_comments;

      public List<String> leading_detached_comments;

      public Builder() {
        path = Internal.newMutableList();
        span = Internal.newMutableList();
        leading_detached_comments = Internal.newMutableList();
      }

      /**
       * Identifies which part of the FileDescriptorProto was defined at this
       * location.
       *
       * Each element is a field number or an index.  They form a path from
       * the root FileDescriptorProto to the place where the definition.  For
       * example, this path:
       *   [ 4, 3, 2, 7, 1 ]
       * refers to:
       *   file.message_type(3)  // 4, 3
       *       .field(7)         // 2, 7
       *       .name()           // 1
       * This is because FileDescriptorProto.message_type has field number 4:
       *   repeated DescriptorProto message_type = 4;
       * and DescriptorProto.field has field number 2:
       *   repeated FieldDescriptorProto field = 2;
       * and FieldDescriptorProto.name has field number 1:
       *   optional string name = 1;
       *
       * Thus, the above path gives the location of a field name.  If we removed
       * the last element:
       *   [ 4, 3, 2, 7 ]
       * this path refers to the whole field declaration (from the beginning
       * of the label to the terminating semicolon).
       */
      public Builder path(List<Integer> path) {
        Internal.checkElementsNotNull(path);
        this.path = path;
        return this;
      }

      /**
       * Always has exactly three or four elements: start line, start column,
       * end line (optional, otherwise assumed same as start line), end column.
       * These are packed into a single field for efficiency.  Note that line
       * and column numbers are zero-based -- typically you will want to add
       * 1 to each before displaying to a user.
       */
      public Builder span(List<Integer> span) {
        Internal.checkElementsNotNull(span);
        this.span = span;
        return this;
      }

      /**
       * If this SourceCodeInfo represents a complete declaration, these are any
       * comments appearing before and after the declaration which appear to be
       * attached to the declaration.
       *
       * A series of line comments appearing on consecutive lines, with no other
       * tokens appearing on those lines, will be treated as a single comment.
       *
       * leading_detached_comments will keep paragraphs of comments that appear
       * before (but not connected to) the current element. Each paragraph,
       * separated by empty lines, will be one comment element in the repeated
       * field.
       *
       * Only the comment content is provided; comment markers (e.g. //) are
       * stripped out.  For block comments, leading whitespace and an asterisk
       * will be stripped from the beginning of each line other than the first.
       * Newlines are included in the output.
       *
       * Examples:
       *
       *   optional int32 foo = 1;  // Comment attached to foo.
       *   // Comment attached to bar.
       *   optional int32 bar = 2;
       *
       *   optional string baz = 3;
       *   // Comment attached to baz.
       *   // Another line attached to baz.
       *
       *   // Comment attached to qux.
       *   //
       *   // Another line attached to qux.
       *   optional double qux = 4;
       *
       *   // Detached comment for corge. This is not leading or trailing comments
       *   // to qux or corge because there are blank lines separating it from
       *   // both.
       *
       *   // Detached comment for corge paragraph 2.
       *
       *   optional string corge = 5;
       *   /* Block comment attached
       *    * to corge.  Leading asterisks
       *    * will be removed. &#42;/
       *   /* Block comment attached to
       *    * grault. &#42;/
       *   optional int32 grault = 6;
       *
       *   // ignored detached comments.
       */
      public Builder leading_comments(String leading_comments) {
        this.leading_comments = leading_comments;
        return this;
      }

      public Builder trailing_comments(String trailing_comments) {
        this.trailing_comments = trailing_comments;
        return this;
      }

      public Builder leading_detached_comments(List<String> leading_detached_comments) {
        Internal.checkElementsNotNull(leading_detached_comments);
        this.leading_detached_comments = leading_detached_comments;
        return this;
      }

      @Override
      public Location build() {
        return new Location(path, span, leading_comments, trailing_comments, leading_detached_comments, super.buildUnknownFields());
      }
    }

    private static final class ProtoAdapter_Location extends ProtoAdapter<Location> {
      public ProtoAdapter_Location() {
        super(FieldEncoding.LENGTH_DELIMITED, Location.class);
      }

      @Override
      public int encodedSize(Location value) {
        return ProtoAdapter.INT32.asPacked().encodedSizeWithTag(1, value.path)
            + ProtoAdapter.INT32.asPacked().encodedSizeWithTag(2, value.span)
            + ProtoAdapter.STRING.encodedSizeWithTag(3, value.leading_comments)
            + ProtoAdapter.STRING.encodedSizeWithTag(4, value.trailing_comments)
            + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, value.leading_detached_comments)
            + value.unknownFields().size();
      }

      @Override
      public void encode(ProtoWriter writer, Location value) throws IOException {
        ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 1, value.path);
        ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 2, value.span);
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.leading_comments);
        ProtoAdapter.STRING.encodeWithTag(writer, 4, value.trailing_comments);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 6, value.leading_detached_comments);
        writer.writeBytes(value.unknownFields());
      }

      @Override
      public Location decode(ProtoReader reader) throws IOException {
        Builder builder = new Builder();
        long token = reader.beginMessage();
        for (int tag; (tag = reader.nextTag()) != -1;) {
          switch (tag) {
            case 1: builder.path.add(ProtoAdapter.INT32.decode(reader)); break;
            case 2: builder.span.add(ProtoAdapter.INT32.decode(reader)); break;
            case 3: builder.leading_comments(ProtoAdapter.STRING.decode(reader)); break;
            case 4: builder.trailing_comments(ProtoAdapter.STRING.decode(reader)); break;
            case 6: builder.leading_detached_comments.add(ProtoAdapter.STRING.decode(reader)); break;
            default: {
              FieldEncoding fieldEncoding = reader.peekFieldEncoding();
              Object value = fieldEncoding.rawProtoAdapter().decode(reader);
              builder.addUnknownField(tag, fieldEncoding, value);
            }
          }
        }
        reader.endMessage(token);
        return builder.build();
      }

      @Override
      public Location redact(Location value) {
        Builder builder = value.newBuilder();
        builder.clearUnknownFields();
        return builder.build();
      }
    }
  }

  private static final class ProtoAdapter_SourceCodeInfo extends ProtoAdapter<SourceCodeInfo> {
    public ProtoAdapter_SourceCodeInfo() {
      super(FieldEncoding.LENGTH_DELIMITED, SourceCodeInfo.class);
    }

    @Override
    public int encodedSize(SourceCodeInfo value) {
      return Location.ADAPTER.asRepeated().encodedSizeWithTag(1, value.location)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SourceCodeInfo value) throws IOException {
      Location.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.location);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SourceCodeInfo decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.location.add(Location.ADAPTER.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public SourceCodeInfo redact(SourceCodeInfo value) {
      Builder builder = value.newBuilder();
      Internal.redactElements(builder.location, Location.ADAPTER);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
