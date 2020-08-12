/*
 * This file is generated by jOOQ.
 */
package is.toxic.db.identity.tables;


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

import is.toxic.db.identity.Indexes;
import is.toxic.db.identity.Keys;
import is.toxic.db.identity.Public;
import is.toxic.db.identity.tables.records.TelegramStatesRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TelegramStates extends TableImpl<TelegramStatesRecord> {

    private static final long serialVersionUID = 745509702;

    /**
     * The reference instance of <code>public.telegram_states</code>
     */
    public static final TelegramStates TELEGRAM_STATES = new TelegramStates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TelegramStatesRecord> getRecordType() {
        return TelegramStatesRecord.class;
    }

    /**
     * The column <code>public.telegram_states.id</code>.
     */
    public final TableField<TelegramStatesRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.telegram_states.telegram_user_id</code>.
     */
    public final TableField<TelegramStatesRecord, Integer> TELEGRAM_USER_ID = createField(DSL.name("telegram_user_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.telegram_states.data</code>.
     */
    public final TableField<TelegramStatesRecord, String> DATA = createField(DSL.name("data"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.telegram_states.active_deal_id</code>.
     */
    public final TableField<TelegramStatesRecord, Long> ACTIVE_DEAL_ID = createField(DSL.name("active_deal_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.telegram_states.user_id</code>.
     */
    public final TableField<TelegramStatesRecord, String> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.telegram_states</code> table reference
     */
    public TelegramStates() {
        this(DSL.name("telegram_states"), null);
    }

    /**
     * Create an aliased <code>public.telegram_states</code> table reference
     */
    public TelegramStates(String alias) {
        this(DSL.name(alias), TELEGRAM_STATES);
    }

    /**
     * Create an aliased <code>public.telegram_states</code> table reference
     */
    public TelegramStates(Name alias) {
        this(alias, TELEGRAM_STATES);
    }

    private TelegramStates(Name alias, Table<TelegramStatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TelegramStates(Name alias, Table<TelegramStatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TelegramStates(Table<O> child, ForeignKey<O, TelegramStatesRecord> key) {
        super(child, key, TELEGRAM_STATES);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IX_TELEGRAM_STATES_TELEGRAM_USER_ID, Indexes.IX_TELEGRAM_STATES_USER_ID);
    }

    @Override
    public Identity<TelegramStatesRecord, Long> getIdentity() {
        return Keys.IDENTITY_TELEGRAM_STATES;
    }

    @Override
    public UniqueKey<TelegramStatesRecord> getPrimaryKey() {
        return Keys.PK_TELEGRAM_STATES;
    }

    @Override
    public List<UniqueKey<TelegramStatesRecord>> getKeys() {
        return Arrays.<UniqueKey<TelegramStatesRecord>>asList(Keys.PK_TELEGRAM_STATES);
    }

    @Override
    public TelegramStates as(String alias) {
        return new TelegramStates(DSL.name(alias), this);
    }

    @Override
    public TelegramStates as(Name alias) {
        return new TelegramStates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TelegramStates rename(String name) {
        return new TelegramStates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TelegramStates rename(Name name) {
        return new TelegramStates(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Integer, String, Long, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}