// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: members.proto
package com.takusemba.gouda.protos;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class Member extends Message<Member, Member.Builder> {
  public static final ProtoAdapter<Member> ADAPTER = new ProtoAdapter_Member();

  private static final long serialVersionUID = 0L;

  public static final Long DEFAULT_ID = 0L;

  public static final Long DEFAULT_AGE = 0L;

  public static final String DEFAULT_EYECOLOR = "";

  public static final String DEFAULT_NAME = "";

  public static final String DEFAULT_GENDER = "";

  public static final String DEFAULT_COMPANY = "";

  public static final String DEFAULT_EMAIL = "";

  public static final String DEFAULT_PHONE = "";

  public static final String DEFAULT_ADDRESS = "";

  public static final String DEFAULT_ABOUT = "";

  public static final String DEFAULT_GREETING = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long id;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#INT64"
  )
  public final Long age;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String eyeColor;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String name;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String gender;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String company;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String email;

  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String phone;

  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String address;

  @WireField(
      tag = 10,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String about;

  @WireField(
      tag = 11,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String greeting;

  public Member(Long id, Long age, String eyeColor, String name, String gender, String company,
      String email, String phone, String address, String about, String greeting) {
    this(id, age, eyeColor, name, gender, company, email, phone, address, about, greeting, ByteString.EMPTY);
  }

  public Member(Long id, Long age, String eyeColor, String name, String gender, String company,
      String email, String phone, String address, String about, String greeting,
      ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.id = id;
    this.age = age;
    this.eyeColor = eyeColor;
    this.name = name;
    this.gender = gender;
    this.company = company;
    this.email = email;
    this.phone = phone;
    this.address = address;
    this.about = about;
    this.greeting = greeting;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.id = id;
    builder.age = age;
    builder.eyeColor = eyeColor;
    builder.name = name;
    builder.gender = gender;
    builder.company = company;
    builder.email = email;
    builder.phone = phone;
    builder.address = address;
    builder.about = about;
    builder.greeting = greeting;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Member)) return false;
    Member o = (Member) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(id, o.id)
        && Internal.equals(age, o.age)
        && Internal.equals(eyeColor, o.eyeColor)
        && Internal.equals(name, o.name)
        && Internal.equals(gender, o.gender)
        && Internal.equals(company, o.company)
        && Internal.equals(email, o.email)
        && Internal.equals(phone, o.phone)
        && Internal.equals(address, o.address)
        && Internal.equals(about, o.about)
        && Internal.equals(greeting, o.greeting);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (id != null ? id.hashCode() : 0);
      result = result * 37 + (age != null ? age.hashCode() : 0);
      result = result * 37 + (eyeColor != null ? eyeColor.hashCode() : 0);
      result = result * 37 + (name != null ? name.hashCode() : 0);
      result = result * 37 + (gender != null ? gender.hashCode() : 0);
      result = result * 37 + (company != null ? company.hashCode() : 0);
      result = result * 37 + (email != null ? email.hashCode() : 0);
      result = result * 37 + (phone != null ? phone.hashCode() : 0);
      result = result * 37 + (address != null ? address.hashCode() : 0);
      result = result * 37 + (about != null ? about.hashCode() : 0);
      result = result * 37 + (greeting != null ? greeting.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (id != null) builder.append(", id=").append(id);
    if (age != null) builder.append(", age=").append(age);
    if (eyeColor != null) builder.append(", eyeColor=").append(eyeColor);
    if (name != null) builder.append(", name=").append(name);
    if (gender != null) builder.append(", gender=").append(gender);
    if (company != null) builder.append(", company=").append(company);
    if (email != null) builder.append(", email=").append(email);
    if (phone != null) builder.append(", phone=").append(phone);
    if (address != null) builder.append(", address=").append(address);
    if (about != null) builder.append(", about=").append(about);
    if (greeting != null) builder.append(", greeting=").append(greeting);
    return builder.replace(0, 2, "Member{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<Member, Builder> {
    public Long id;

    public Long age;

    public String eyeColor;

    public String name;

    public String gender;

    public String company;

    public String email;

    public String phone;

    public String address;

    public String about;

    public String greeting;

    public Builder() {
    }

    public Builder id(Long id) {
      this.id = id;
      return this;
    }

    public Builder age(Long age) {
      this.age = age;
      return this;
    }

    public Builder eyeColor(String eyeColor) {
      this.eyeColor = eyeColor;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder gender(String gender) {
      this.gender = gender;
      return this;
    }

    public Builder company(String company) {
      this.company = company;
      return this;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder phone(String phone) {
      this.phone = phone;
      return this;
    }

    public Builder address(String address) {
      this.address = address;
      return this;
    }

    public Builder about(String about) {
      this.about = about;
      return this;
    }

    public Builder greeting(String greeting) {
      this.greeting = greeting;
      return this;
    }

    @Override
    public Member build() {
      return new Member(id, age, eyeColor, name, gender, company, email, phone, address, about, greeting, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_Member extends ProtoAdapter<Member> {
    public ProtoAdapter_Member() {
      super(FieldEncoding.LENGTH_DELIMITED, Member.class);
    }

    @Override
    public int encodedSize(Member value) {
      return ProtoAdapter.INT64.encodedSizeWithTag(1, value.id)
          + ProtoAdapter.INT64.encodedSizeWithTag(2, value.age)
          + ProtoAdapter.STRING.encodedSizeWithTag(3, value.eyeColor)
          + ProtoAdapter.STRING.encodedSizeWithTag(4, value.name)
          + ProtoAdapter.STRING.encodedSizeWithTag(5, value.gender)
          + ProtoAdapter.STRING.encodedSizeWithTag(6, value.company)
          + ProtoAdapter.STRING.encodedSizeWithTag(7, value.email)
          + ProtoAdapter.STRING.encodedSizeWithTag(8, value.phone)
          + ProtoAdapter.STRING.encodedSizeWithTag(9, value.address)
          + ProtoAdapter.STRING.encodedSizeWithTag(10, value.about)
          + ProtoAdapter.STRING.encodedSizeWithTag(11, value.greeting)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, Member value) throws IOException {
      ProtoAdapter.INT64.encodeWithTag(writer, 1, value.id);
      ProtoAdapter.INT64.encodeWithTag(writer, 2, value.age);
      ProtoAdapter.STRING.encodeWithTag(writer, 3, value.eyeColor);
      ProtoAdapter.STRING.encodeWithTag(writer, 4, value.name);
      ProtoAdapter.STRING.encodeWithTag(writer, 5, value.gender);
      ProtoAdapter.STRING.encodeWithTag(writer, 6, value.company);
      ProtoAdapter.STRING.encodeWithTag(writer, 7, value.email);
      ProtoAdapter.STRING.encodeWithTag(writer, 8, value.phone);
      ProtoAdapter.STRING.encodeWithTag(writer, 9, value.address);
      ProtoAdapter.STRING.encodeWithTag(writer, 10, value.about);
      ProtoAdapter.STRING.encodeWithTag(writer, 11, value.greeting);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public Member decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.id(ProtoAdapter.INT64.decode(reader)); break;
          case 2: builder.age(ProtoAdapter.INT64.decode(reader)); break;
          case 3: builder.eyeColor(ProtoAdapter.STRING.decode(reader)); break;
          case 4: builder.name(ProtoAdapter.STRING.decode(reader)); break;
          case 5: builder.gender(ProtoAdapter.STRING.decode(reader)); break;
          case 6: builder.company(ProtoAdapter.STRING.decode(reader)); break;
          case 7: builder.email(ProtoAdapter.STRING.decode(reader)); break;
          case 8: builder.phone(ProtoAdapter.STRING.decode(reader)); break;
          case 9: builder.address(ProtoAdapter.STRING.decode(reader)); break;
          case 10: builder.about(ProtoAdapter.STRING.decode(reader)); break;
          case 11: builder.greeting(ProtoAdapter.STRING.decode(reader)); break;
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
    public Member redact(Member value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}