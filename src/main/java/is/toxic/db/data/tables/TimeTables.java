/*
 * This file is generated by jOOQ.
 */
package is.toxic.db.data.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import is.toxic.db.data.Indexes;
import is.toxic.db.data.Keys;
import is.toxic.db.data.Public;
import is.toxic.db.data.tables.records.TimeTablesRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeTables extends TableImpl<TimeTablesRecord> {

    private static final long serialVersionUID = -302515514;

    /**
     * The reference instance of <code>public.time_tables</code>
     */
    public static final TimeTables TIME_TABLES = new TimeTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TimeTablesRecord> getRecordType() {
        return TimeTablesRecord.class;
    }

    /**
     * The column <code>public.time_tables.id</code>.
     */
    public final TableField<TimeTablesRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.time_tables.day</code>.
     */
    public final TableField<TimeTablesRecord, Integer> DAY = createField(DSL.name("day"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.time_tables.start</code>.
     */
    public final TableField<TimeTablesRecord, Short> START = createField(DSL.name("start"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.time_tables.end</code>.
     */
    public final TableField<TimeTablesRecord, Short> END = createField(DSL.name("end"), org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>public.time_tables.advertisement_id</code>.
     */
    public final TableField<TimeTablesRecord, Long> ADVERTISEMENT_ID = createField(DSL.name("advertisement_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.time_tables</code> table reference
     */
    public TimeTables() {
        this(DSL.name("time_tables"), null);
    }

    /**
     * Create an aliased <code>public.time_tables</code> table reference
     */
    public TimeTables(String alias) {
        this(DSL.name(alias), TIME_TABLES);
    }

    /**
     * Create an aliased <code>public.time_tables</code> table reference
     */
    public TimeTables(Name alias) {
        this(alias, TIME_TABLES);
    }

    private TimeTables(Name alias, Table<TimeTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TimeTables(Name alias, Table<TimeTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TimeTables(Table<O> child, ForeignKey<O, TimeTablesRecord> key) {
        super(child, key, TIME_TABLES);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IX_TIME_TABLES_ADVERTISEMENT_ID, Indexes.IX_TIME_TABLES_DAY, Indexes.IX_TIME_TABLES_START);
    }

    @Override
    public Identity<TimeTablesRecord, Long> getIdentity() {
        return Keys.IDENTITY_TIME_TABLES;
    }

    @Override
    public UniqueKey<TimeTablesRecord> getPrimaryKey() {
        return Keys.PK_TIME_TABLES;
    }

    @Override
    public List<UniqueKey<TimeTablesRecord>> getKeys() {
        return Arrays.<UniqueKey<TimeTablesRecord>>asList(Keys.PK_TIME_TABLES);
    }

    @Override
    public List<ForeignKey<TimeTablesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TimeTablesRecord, ?>>asList(Keys.TIME_TABLES__FK_TIME_TABLES_ADVERTISEMENTS_ADVERTISEMENT_ID);
    }

    public Advertisements advertisements() {
        return new Advertisements(this, Keys.TIME_TABLES__FK_TIME_TABLES_ADVERTISEMENTS_ADVERTISEMENT_ID);
    }

    @Override
    public TimeTables as(String alias) {
        return new TimeTables(DSL.name(alias), this);
    }

    @Override
    public TimeTables as(Name alias) {
        return new TimeTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TimeTables rename(String name) {
        return new TimeTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TimeTables rename(Name name) {
        return new TimeTables(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Integer, Short, Short, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}