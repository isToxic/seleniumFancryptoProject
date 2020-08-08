/*
 * This file is generated by jOOQ.
 */
package ru.toxic.fancrypto.data.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import ru.toxic.fancrypto.data.tables.__Efmigrationshistory;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class __EfmigrationshistoryRecord extends UpdatableRecordImpl<__EfmigrationshistoryRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -512434979;

    /**
     * Setter for <code>public.__EFMigrationsHistory.MigrationId</code>.
     */
    public void setMigrationid(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.__EFMigrationsHistory.MigrationId</code>.
     */
    public String getMigrationid() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.__EFMigrationsHistory.ProductVersion</code>.
     */
    public void setProductversion(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.__EFMigrationsHistory.ProductVersion</code>.
     */
    public String getProductversion() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return __Efmigrationshistory.__EFMIGRATIONSHISTORY.MIGRATIONID;
    }

    @Override
    public Field<String> field2() {
        return __Efmigrationshistory.__EFMIGRATIONSHISTORY.PRODUCTVERSION;
    }

    @Override
    public String component1() {
        return getMigrationid();
    }

    @Override
    public String component2() {
        return getProductversion();
    }

    @Override
    public String value1() {
        return getMigrationid();
    }

    @Override
    public String value2() {
        return getProductversion();
    }

    @Override
    public __EfmigrationshistoryRecord value1(String value) {
        setMigrationid(value);
        return this;
    }

    @Override
    public __EfmigrationshistoryRecord value2(String value) {
        setProductversion(value);
        return this;
    }

    @Override
    public __EfmigrationshistoryRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached __EfmigrationshistoryRecord
     */
    public __EfmigrationshistoryRecord() {
        super(__Efmigrationshistory.__EFMIGRATIONSHISTORY);
    }

    /**
     * Create a detached, initialised __EfmigrationshistoryRecord
     */
    public __EfmigrationshistoryRecord(String migrationid, String productversion) {
        super(__Efmigrationshistory.__EFMIGRATIONSHISTORY);

        set(0, migrationid);
        set(1, productversion);
    }
}
