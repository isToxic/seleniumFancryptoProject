/*
 * This file is generated by jOOQ.
 */
package is.toxic.db.data.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import is.toxic.db.data.Keys;
import is.toxic.db.data.Public;
import is.toxic.db.data.tables.records.VariablesMetadataRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VariablesMetadata extends TableImpl<VariablesMetadataRecord> {

    private static final long serialVersionUID = 1599302253;

    /**
     * The reference instance of <code>public.variables_metadata</code>
     */
    public static final VariablesMetadata VARIABLES_METADATA = new VariablesMetadata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VariablesMetadataRecord> getRecordType() {
        return VariablesMetadataRecord.class;
    }

    /**
     * The column <code>public.variables_metadata.id</code>.
     */
    public final TableField<VariablesMetadataRecord, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.variables_metadata.updated_at</code>.
     */
    public final TableField<VariablesMetadataRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * Create a <code>public.variables_metadata</code> table reference
     */
    public VariablesMetadata() {
        this(DSL.name("variables_metadata"), null);
    }

    /**
     * Create an aliased <code>public.variables_metadata</code> table reference
     */
    public VariablesMetadata(String alias) {
        this(DSL.name(alias), VARIABLES_METADATA);
    }

    /**
     * Create an aliased <code>public.variables_metadata</code> table reference
     */
    public VariablesMetadata(Name alias) {
        this(alias, VARIABLES_METADATA);
    }

    private VariablesMetadata(Name alias, Table<VariablesMetadataRecord> aliased) {
        this(alias, aliased, null);
    }

    private VariablesMetadata(Name alias, Table<VariablesMetadataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> VariablesMetadata(Table<O> child, ForeignKey<O, VariablesMetadataRecord> key) {
        super(child, key, VARIABLES_METADATA);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<VariablesMetadataRecord, Integer> getIdentity() {
        return Keys.IDENTITY_VARIABLES_METADATA;
    }

    @Override
    public UniqueKey<VariablesMetadataRecord> getPrimaryKey() {
        return Keys.PK_VARIABLES_METADATA;
    }

    @Override
    public List<UniqueKey<VariablesMetadataRecord>> getKeys() {
        return Arrays.<UniqueKey<VariablesMetadataRecord>>asList(Keys.PK_VARIABLES_METADATA);
    }

    @Override
    public VariablesMetadata as(String alias) {
        return new VariablesMetadata(DSL.name(alias), this);
    }

    @Override
    public VariablesMetadata as(Name alias) {
        return new VariablesMetadata(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VariablesMetadata rename(String name) {
        return new VariablesMetadata(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VariablesMetadata rename(Name name) {
        return new VariablesMetadata(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, LocalDateTime> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}