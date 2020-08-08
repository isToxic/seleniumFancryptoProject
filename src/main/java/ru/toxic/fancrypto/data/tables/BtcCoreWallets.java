/*
 * This file is generated by jOOQ.
 */
package ru.toxic.fancrypto.data.tables;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.toxic.fancrypto.data.Keys;
import ru.toxic.fancrypto.data.Public;
import ru.toxic.fancrypto.data.tables.records.BtcCoreWalletsRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BtcCoreWallets extends TableImpl<BtcCoreWalletsRecord> {

    private static final long serialVersionUID = 168208002;

    /**
     * The reference instance of <code>public.btc_core_wallets</code>
     */
    public static final BtcCoreWallets BTC_CORE_WALLETS = new BtcCoreWallets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BtcCoreWalletsRecord> getRecordType() {
        return BtcCoreWalletsRecord.class;
    }

    /**
     * The column <code>public.btc_core_wallets.private_key</code>.
     */
    public final TableField<BtcCoreWalletsRecord, String> PRIVATE_KEY = createField(DSL.name("private_key"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.btc_core_wallets.fee</code>.
     */
    public final TableField<BtcCoreWalletsRecord, BigDecimal> FEE = createField(DSL.name("fee"), org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.btc_core_wallets.last_block</code>.
     */
    public final TableField<BtcCoreWalletsRecord, LocalDateTime> LAST_BLOCK = createField(DSL.name("last_block"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.btc_core_wallets.balance</code>.
     */
    public final TableField<BtcCoreWalletsRecord, BigDecimal> BALANCE = createField(DSL.name("balance"), org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.btc_core_wallets.unconfirmed_balance</code>.
     */
    public final TableField<BtcCoreWalletsRecord, BigDecimal> UNCONFIRMED_BALANCE = createField(DSL.name("unconfirmed_balance"), org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.btc_core_wallets.max_transactions_time</code>.
     */
    public final TableField<BtcCoreWalletsRecord, LocalDateTime> MAX_TRANSACTIONS_TIME = createField(DSL.name("max_transactions_time"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * Create a <code>public.btc_core_wallets</code> table reference
     */
    public BtcCoreWallets() {
        this(DSL.name("btc_core_wallets"), null);
    }

    /**
     * Create an aliased <code>public.btc_core_wallets</code> table reference
     */
    public BtcCoreWallets(String alias) {
        this(DSL.name(alias), BTC_CORE_WALLETS);
    }

    /**
     * Create an aliased <code>public.btc_core_wallets</code> table reference
     */
    public BtcCoreWallets(Name alias) {
        this(alias, BTC_CORE_WALLETS);
    }

    private BtcCoreWallets(Name alias, Table<BtcCoreWalletsRecord> aliased) {
        this(alias, aliased, null);
    }

    private BtcCoreWallets(Name alias, Table<BtcCoreWalletsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> BtcCoreWallets(Table<O> child, ForeignKey<O, BtcCoreWalletsRecord> key) {
        super(child, key, BTC_CORE_WALLETS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<BtcCoreWalletsRecord> getPrimaryKey() {
        return Keys.PK_BTC_CORE_WALLETS;
    }

    @Override
    public List<UniqueKey<BtcCoreWalletsRecord>> getKeys() {
        return Arrays.<UniqueKey<BtcCoreWalletsRecord>>asList(Keys.PK_BTC_CORE_WALLETS);
    }

    @Override
    public BtcCoreWallets as(String alias) {
        return new BtcCoreWallets(DSL.name(alias), this);
    }

    @Override
    public BtcCoreWallets as(Name alias) {
        return new BtcCoreWallets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BtcCoreWallets rename(String name) {
        return new BtcCoreWallets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BtcCoreWallets rename(Name name) {
        return new BtcCoreWallets(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, BigDecimal, LocalDateTime, BigDecimal, BigDecimal, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
