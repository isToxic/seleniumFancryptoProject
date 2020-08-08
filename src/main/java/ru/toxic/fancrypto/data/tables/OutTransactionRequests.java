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
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.toxic.fancrypto.data.Indexes;
import ru.toxic.fancrypto.data.Keys;
import ru.toxic.fancrypto.data.Public;
import ru.toxic.fancrypto.data.tables.records.OutTransactionRequestsRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OutTransactionRequests extends TableImpl<OutTransactionRequestsRecord> {

    private static final long serialVersionUID = -136558480;

    /**
     * The reference instance of <code>public.out_transaction_requests</code>
     */
    public static final OutTransactionRequests OUT_TRANSACTION_REQUESTS = new OutTransactionRequests();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OutTransactionRequestsRecord> getRecordType() {
        return OutTransactionRequestsRecord.class;
    }

    /**
     * The column <code>public.out_transaction_requests.id</code>.
     */
    public final TableField<OutTransactionRequestsRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.out_transaction_requests.currency</code>.
     */
    public final TableField<OutTransactionRequestsRecord, Integer> CURRENCY = createField(DSL.name("currency"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.out_transaction_requests.amount</code>.
     */
    public final TableField<OutTransactionRequestsRecord, BigDecimal> AMOUNT = createField(DSL.name("amount"), org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.out_transaction_requests.fee</code>.
     */
    public final TableField<OutTransactionRequestsRecord, BigDecimal> FEE = createField(DSL.name("fee"), org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.out_transaction_requests.address</code>.
     */
    public final TableField<OutTransactionRequestsRecord, String> ADDRESS = createField(DSL.name("address"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.out_transaction_requests.owner_id</code>.
     */
    public final TableField<OutTransactionRequestsRecord, Long> OWNER_ID = createField(DSL.name("owner_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.out_transaction_requests.created_at</code>.
     */
    public final TableField<OutTransactionRequestsRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>public.out_transaction_requests.is_started</code>.
     */
    public final TableField<OutTransactionRequestsRecord, Boolean> IS_STARTED = createField(DSL.name("is_started"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.out_transaction_requests.subtract_fee_from_amount</code>.
     */
    public final TableField<OutTransactionRequestsRecord, Boolean> SUBTRACT_FEE_FROM_AMOUNT = createField(DSL.name("subtract_fee_from_amount"), org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.out_transaction_requests.btc_core_wallet_private_key</code>.
     */
    public final TableField<OutTransactionRequestsRecord, String> BTC_CORE_WALLET_PRIVATE_KEY = createField(DSL.name("btc_core_wallet_private_key"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.out_transaction_requests</code> table reference
     */
    public OutTransactionRequests() {
        this(DSL.name("out_transaction_requests"), null);
    }

    /**
     * Create an aliased <code>public.out_transaction_requests</code> table reference
     */
    public OutTransactionRequests(String alias) {
        this(DSL.name(alias), OUT_TRANSACTION_REQUESTS);
    }

    /**
     * Create an aliased <code>public.out_transaction_requests</code> table reference
     */
    public OutTransactionRequests(Name alias) {
        this(alias, OUT_TRANSACTION_REQUESTS);
    }

    private OutTransactionRequests(Name alias, Table<OutTransactionRequestsRecord> aliased) {
        this(alias, aliased, null);
    }

    private OutTransactionRequests(Name alias, Table<OutTransactionRequestsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> OutTransactionRequests(Table<O> child, ForeignKey<O, OutTransactionRequestsRecord> key) {
        super(child, key, OUT_TRANSACTION_REQUESTS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IX_OUT_TRANSACTION_REQUESTS_BTC_CORE_WALLET_PRIVATE_KEY, Indexes.IX_OUT_TRANSACTION_REQUESTS_CURRENCY, Indexes.IX_OUT_TRANSACTION_REQUESTS_OWNER_ID);
    }

    @Override
    public Identity<OutTransactionRequestsRecord, Long> getIdentity() {
        return Keys.IDENTITY_OUT_TRANSACTION_REQUESTS;
    }

    @Override
    public UniqueKey<OutTransactionRequestsRecord> getPrimaryKey() {
        return Keys.PK_OUT_TRANSACTION_REQUESTS;
    }

    @Override
    public List<UniqueKey<OutTransactionRequestsRecord>> getKeys() {
        return Arrays.<UniqueKey<OutTransactionRequestsRecord>>asList(Keys.PK_OUT_TRANSACTION_REQUESTS);
    }

    @Override
    public List<ForeignKey<OutTransactionRequestsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OutTransactionRequestsRecord, ?>>asList(Keys.OUT_TRANSACTION_REQUESTS__FK_OUT_TRANSACTION_REQUESTS_USER_DATAS_OWNER_ID, Keys.OUT_TRANSACTION_REQUESTS__FK_OUT_TRANSACTION_REQUESTS_BTC_CORE_WALLETS_BTC_CORE_WALLET_P_7e);
    }

    public UserDatas userDatas() {
        return new UserDatas(this, Keys.OUT_TRANSACTION_REQUESTS__FK_OUT_TRANSACTION_REQUESTS_USER_DATAS_OWNER_ID);
    }

    public BtcCoreWallets btcCoreWallets() {
        return new BtcCoreWallets(this, Keys.OUT_TRANSACTION_REQUESTS__FK_OUT_TRANSACTION_REQUESTS_BTC_CORE_WALLETS_BTC_CORE_WALLET_P_7e);
    }

    @Override
    public OutTransactionRequests as(String alias) {
        return new OutTransactionRequests(DSL.name(alias), this);
    }

    @Override
    public OutTransactionRequests as(Name alias) {
        return new OutTransactionRequests(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OutTransactionRequests rename(String name) {
        return new OutTransactionRequests(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OutTransactionRequests rename(Name name) {
        return new OutTransactionRequests(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Integer, BigDecimal, BigDecimal, String, Long, LocalDateTime, Boolean, Boolean, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}