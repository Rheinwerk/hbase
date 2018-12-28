/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hbase.thrift.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * An Append object is used to specify the parameters for performing the append operation.
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2018-12-28")
public class TAppend implements org.apache.thrift.TBase<TAppend, TAppend._Fields>, java.io.Serializable, Cloneable, Comparable<TAppend> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAppend");

  private static final org.apache.thrift.protocol.TField TABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("table", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField ROW_FIELD_DESC = new org.apache.thrift.protocol.TField("row", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COLUMNS_FIELD_DESC = new org.apache.thrift.protocol.TField("columns", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField VALUES_FIELD_DESC = new org.apache.thrift.protocol.TField("values", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAppendStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAppendTupleSchemeFactory());
  }

  public ByteBuffer table; // required
  public ByteBuffer row; // required
  public List<ByteBuffer> columns; // required
  public List<ByteBuffer> values; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLE((short)1, "table"),
    ROW((short)2, "row"),
    COLUMNS((short)3, "columns"),
    VALUES((short)4, "values");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TABLE
          return TABLE;
        case 2: // ROW
          return ROW;
        case 3: // COLUMNS
          return COLUMNS;
        case 4: // VALUES
          return VALUES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE, new org.apache.thrift.meta_data.FieldMetaData("table", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    tmpMap.put(_Fields.ROW, new org.apache.thrift.meta_data.FieldMetaData("row", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , "Text")));
    tmpMap.put(_Fields.COLUMNS, new org.apache.thrift.meta_data.FieldMetaData("columns", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , "Text"))));
    tmpMap.put(_Fields.VALUES, new org.apache.thrift.meta_data.FieldMetaData("values", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING            , "Text"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAppend.class, metaDataMap);
  }

  public TAppend() {
  }

  public TAppend(
    ByteBuffer table,
    ByteBuffer row,
    List<ByteBuffer> columns,
    List<ByteBuffer> values)
  {
    this();
    this.table = org.apache.thrift.TBaseHelper.copyBinary(table);
    this.row = org.apache.thrift.TBaseHelper.copyBinary(row);
    this.columns = columns;
    this.values = values;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAppend(TAppend other) {
    if (other.isSetTable()) {
      this.table = other.table;
    }
    if (other.isSetRow()) {
      this.row = other.row;
    }
    if (other.isSetColumns()) {
      List<ByteBuffer> __this__columns = new ArrayList<ByteBuffer>(other.columns.size());
      for (ByteBuffer other_element : other.columns) {
        __this__columns.add(other_element);
      }
      this.columns = __this__columns;
    }
    if (other.isSetValues()) {
      List<ByteBuffer> __this__values = new ArrayList<ByteBuffer>(other.values.size());
      for (ByteBuffer other_element : other.values) {
        __this__values.add(other_element);
      }
      this.values = __this__values;
    }
  }

  public TAppend deepCopy() {
    return new TAppend(this);
  }

  @Override
  public void clear() {
    this.table = null;
    this.row = null;
    this.columns = null;
    this.values = null;
  }

  public byte[] getTable() {
    setTable(org.apache.thrift.TBaseHelper.rightSize(table));
    return table == null ? null : table.array();
  }

  public ByteBuffer bufferForTable() {
    return org.apache.thrift.TBaseHelper.copyBinary(table);
  }

  public TAppend setTable(byte[] table) {
    this.table = table == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(table, table.length));
    return this;
  }

  public TAppend setTable(ByteBuffer table) {
    this.table = org.apache.thrift.TBaseHelper.copyBinary(table);
    return this;
  }

  public void unsetTable() {
    this.table = null;
  }

  /** Returns true if field table is set (has been assigned a value) and false otherwise */
  public boolean isSetTable() {
    return this.table != null;
  }

  public void setTableIsSet(boolean value) {
    if (!value) {
      this.table = null;
    }
  }

  public byte[] getRow() {
    setRow(org.apache.thrift.TBaseHelper.rightSize(row));
    return row == null ? null : row.array();
  }

  public ByteBuffer bufferForRow() {
    return org.apache.thrift.TBaseHelper.copyBinary(row);
  }

  public TAppend setRow(byte[] row) {
    this.row = row == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(row, row.length));
    return this;
  }

  public TAppend setRow(ByteBuffer row) {
    this.row = org.apache.thrift.TBaseHelper.copyBinary(row);
    return this;
  }

  public void unsetRow() {
    this.row = null;
  }

  /** Returns true if field row is set (has been assigned a value) and false otherwise */
  public boolean isSetRow() {
    return this.row != null;
  }

  public void setRowIsSet(boolean value) {
    if (!value) {
      this.row = null;
    }
  }

  public int getColumnsSize() {
    return (this.columns == null) ? 0 : this.columns.size();
  }

  public java.util.Iterator<ByteBuffer> getColumnsIterator() {
    return (this.columns == null) ? null : this.columns.iterator();
  }

  public void addToColumns(ByteBuffer elem) {
    if (this.columns == null) {
      this.columns = new ArrayList<ByteBuffer>();
    }
    this.columns.add(elem);
  }

  public List<ByteBuffer> getColumns() {
    return this.columns;
  }

  public TAppend setColumns(List<ByteBuffer> columns) {
    this.columns = columns;
    return this;
  }

  public void unsetColumns() {
    this.columns = null;
  }

  /** Returns true if field columns is set (has been assigned a value) and false otherwise */
  public boolean isSetColumns() {
    return this.columns != null;
  }

  public void setColumnsIsSet(boolean value) {
    if (!value) {
      this.columns = null;
    }
  }

  public int getValuesSize() {
    return (this.values == null) ? 0 : this.values.size();
  }

  public java.util.Iterator<ByteBuffer> getValuesIterator() {
    return (this.values == null) ? null : this.values.iterator();
  }

  public void addToValues(ByteBuffer elem) {
    if (this.values == null) {
      this.values = new ArrayList<ByteBuffer>();
    }
    this.values.add(elem);
  }

  public List<ByteBuffer> getValues() {
    return this.values;
  }

  public TAppend setValues(List<ByteBuffer> values) {
    this.values = values;
    return this;
  }

  public void unsetValues() {
    this.values = null;
  }

  /** Returns true if field values is set (has been assigned a value) and false otherwise */
  public boolean isSetValues() {
    return this.values != null;
  }

  public void setValuesIsSet(boolean value) {
    if (!value) {
      this.values = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TABLE:
      if (value == null) {
        unsetTable();
      } else {
        setTable((ByteBuffer)value);
      }
      break;

    case ROW:
      if (value == null) {
        unsetRow();
      } else {
        setRow((ByteBuffer)value);
      }
      break;

    case COLUMNS:
      if (value == null) {
        unsetColumns();
      } else {
        setColumns((List<ByteBuffer>)value);
      }
      break;

    case VALUES:
      if (value == null) {
        unsetValues();
      } else {
        setValues((List<ByteBuffer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLE:
      return getTable();

    case ROW:
      return getRow();

    case COLUMNS:
      return getColumns();

    case VALUES:
      return getValues();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TABLE:
      return isSetTable();
    case ROW:
      return isSetRow();
    case COLUMNS:
      return isSetColumns();
    case VALUES:
      return isSetValues();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAppend)
      return this.equals((TAppend)that);
    return false;
  }

  public boolean equals(TAppend that) {
    if (that == null)
      return false;

    boolean this_present_table = true && this.isSetTable();
    boolean that_present_table = true && that.isSetTable();
    if (this_present_table || that_present_table) {
      if (!(this_present_table && that_present_table))
        return false;
      if (!this.table.equals(that.table))
        return false;
    }

    boolean this_present_row = true && this.isSetRow();
    boolean that_present_row = true && that.isSetRow();
    if (this_present_row || that_present_row) {
      if (!(this_present_row && that_present_row))
        return false;
      if (!this.row.equals(that.row))
        return false;
    }

    boolean this_present_columns = true && this.isSetColumns();
    boolean that_present_columns = true && that.isSetColumns();
    if (this_present_columns || that_present_columns) {
      if (!(this_present_columns && that_present_columns))
        return false;
      if (!this.columns.equals(that.columns))
        return false;
    }

    boolean this_present_values = true && this.isSetValues();
    boolean that_present_values = true && that.isSetValues();
    if (this_present_values || that_present_values) {
      if (!(this_present_values && that_present_values))
        return false;
      if (!this.values.equals(that.values))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_table = true && (isSetTable());
    list.add(present_table);
    if (present_table)
      list.add(table);

    boolean present_row = true && (isSetRow());
    list.add(present_row);
    if (present_row)
      list.add(row);

    boolean present_columns = true && (isSetColumns());
    list.add(present_columns);
    if (present_columns)
      list.add(columns);

    boolean present_values = true && (isSetValues());
    list.add(present_values);
    if (present_values)
      list.add(values);

    return list.hashCode();
  }

  @Override
  public int compareTo(TAppend other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTable()).compareTo(other.isSetTable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTable()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.table, other.table);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRow()).compareTo(other.isSetRow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.row, other.row);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumns()).compareTo(other.isSetColumns());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumns()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.columns, other.columns);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValues()).compareTo(other.isSetValues());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValues()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.values, other.values);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TAppend(");
    boolean first = true;

    sb.append("table:");
    if (this.table == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.table, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("row:");
    if (this.row == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.row, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("columns:");
    if (this.columns == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.columns, sb);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("values:");
    if (this.values == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.values, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TAppendStandardSchemeFactory implements SchemeFactory {
    public TAppendStandardScheme getScheme() {
      return new TAppendStandardScheme();
    }
  }

  private static class TAppendStandardScheme extends StandardScheme<TAppend> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAppend struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.table = iprot.readBinary();
              struct.setTableIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ROW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.row = iprot.readBinary();
              struct.setRowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COLUMNS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list34 = iprot.readListBegin();
                struct.columns = new ArrayList<ByteBuffer>(_list34.size);
                ByteBuffer _elem35;
                for (int _i36 = 0; _i36 < _list34.size; ++_i36)
                {
                  _elem35 = iprot.readBinary();
                  struct.columns.add(_elem35);
                }
                iprot.readListEnd();
              }
              struct.setColumnsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VALUES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list37 = iprot.readListBegin();
                struct.values = new ArrayList<ByteBuffer>(_list37.size);
                ByteBuffer _elem38;
                for (int _i39 = 0; _i39 < _list37.size; ++_i39)
                {
                  _elem38 = iprot.readBinary();
                  struct.values.add(_elem38);
                }
                iprot.readListEnd();
              }
              struct.setValuesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAppend struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.table != null) {
        oprot.writeFieldBegin(TABLE_FIELD_DESC);
        oprot.writeBinary(struct.table);
        oprot.writeFieldEnd();
      }
      if (struct.row != null) {
        oprot.writeFieldBegin(ROW_FIELD_DESC);
        oprot.writeBinary(struct.row);
        oprot.writeFieldEnd();
      }
      if (struct.columns != null) {
        oprot.writeFieldBegin(COLUMNS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.columns.size()));
          for (ByteBuffer _iter40 : struct.columns)
          {
            oprot.writeBinary(_iter40);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.values != null) {
        oprot.writeFieldBegin(VALUES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.values.size()));
          for (ByteBuffer _iter41 : struct.values)
          {
            oprot.writeBinary(_iter41);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAppendTupleSchemeFactory implements SchemeFactory {
    public TAppendTupleScheme getScheme() {
      return new TAppendTupleScheme();
    }
  }

  private static class TAppendTupleScheme extends TupleScheme<TAppend> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAppend struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTable()) {
        optionals.set(0);
      }
      if (struct.isSetRow()) {
        optionals.set(1);
      }
      if (struct.isSetColumns()) {
        optionals.set(2);
      }
      if (struct.isSetValues()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTable()) {
        oprot.writeBinary(struct.table);
      }
      if (struct.isSetRow()) {
        oprot.writeBinary(struct.row);
      }
      if (struct.isSetColumns()) {
        {
          oprot.writeI32(struct.columns.size());
          for (ByteBuffer _iter42 : struct.columns)
          {
            oprot.writeBinary(_iter42);
          }
        }
      }
      if (struct.isSetValues()) {
        {
          oprot.writeI32(struct.values.size());
          for (ByteBuffer _iter43 : struct.values)
          {
            oprot.writeBinary(_iter43);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAppend struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.table = iprot.readBinary();
        struct.setTableIsSet(true);
      }
      if (incoming.get(1)) {
        struct.row = iprot.readBinary();
        struct.setRowIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list44 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.columns = new ArrayList<ByteBuffer>(_list44.size);
          ByteBuffer _elem45;
          for (int _i46 = 0; _i46 < _list44.size; ++_i46)
          {
            _elem45 = iprot.readBinary();
            struct.columns.add(_elem45);
          }
        }
        struct.setColumnsIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list47 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.values = new ArrayList<ByteBuffer>(_list47.size);
          ByteBuffer _elem48;
          for (int _i49 = 0; _i49 < _list47.size; ++_i49)
          {
            _elem48 = iprot.readBinary();
            struct.values.add(_elem48);
          }
        }
        struct.setValuesIsSet(true);
      }
    }
  }

}

