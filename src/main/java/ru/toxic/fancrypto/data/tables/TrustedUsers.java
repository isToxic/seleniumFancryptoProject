/*
 * This file is generated by jOOQ.
 */
package ru.toxic.fancrypto.data.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
import ru.toxic.fancrypto.data.tables.records.TrustedUsersRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TrustedUsers extends TableImpl<TrustedUsersRecord> {

    private static final long serialVersionUID = -2133999260;

    /**
     * The reference instance of <code>public.trusted_users</code>
     */
    public static final TrustedUsers TRUSTED_USERS = new TrustedUsers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TrustedUsersRecord> getRecordType() {
        return TrustedUsersRecord.class;
    }

    /**
     * The column <code>public.trusted_users.id</code>.
     */
    public final TableField<TrustedUsersRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.trusted_users.owner_id</code>.
     */
    public final TableField<TrustedUsersRecord, Long> OWNER_ID = createField(DSL.name("owner_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.trusted_users.user_id</code>.
     */
    public final TableField<TrustedUsersRecord, Long> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.trusted_users</code> table reference
     */
    public TrustedUsers() {
        this(DSL.name("trusted_users"), null);
    }

    /**
     * Create an aliased <code>public.trusted_users</code> table reference
     */
    public TrustedUsers(String alias) {
        this(DSL.name(alias), TRUSTED_USERS);
    }

    /**
     * Create an aliased <code>public.trusted_users</code> table reference
     */
    public TrustedUsers(Name alias) {
        this(alias, TRUSTED_USERS);
    }

    private TrustedUsers(Name alias, Table<TrustedUsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private TrustedUsers(Name alias, Table<TrustedUsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TrustedUsers(Table<O> child, ForeignKey<O, TrustedUsersRecord> key) {
        super(child, key, TRUSTED_USERS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IX_TRUSTED_USERS_OWNER_ID, Indexes.IX_TRUSTED_USERS_USER_ID);
    }

    @Override
    public Identity<TrustedUsersRecord, Long> getIdentity() {
        return Keys.IDENTITY_TRUSTED_USERS;
    }

    @Override
    public UniqueKey<TrustedUsersRecord> getPrimaryKey() {
        return Keys.PK_TRUSTED_USERS;
    }

    @Override
    public List<UniqueKey<TrustedUsersRecord>> getKeys() {
        return Arrays.<UniqueKey<TrustedUsersRecord>>asList(Keys.PK_TRUSTED_USERS);
    }

    @Override
    public List<ForeignKey<TrustedUsersRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TrustedUsersRecord, ?>>asList(Keys.TRUSTED_USERS__FK_TRUSTED_USERS_USER_DATAS_OWNER_ID, Keys.TRUSTED_USERS__FK_TRUSTED_USERS_USER_DATAS_USER_ID);
    }

    public UserDatas fkTrustedUsersUserDatasOwnerId() {
        return new UserDatas(this, Keys.TRUSTED_USERS__FK_TRUSTED_USERS_USER_DATAS_OWNER_ID);
    }

    public UserDatas fkTrustedUsersUserDatasUserId() {
        return new UserDatas(this, Keys.TRUSTED_USERS__FK_TRUSTED_USERS_USER_DATAS_USER_ID);
    }

    @Override
    public TrustedUsers as(String alias) {
        return new TrustedUsers(DSL.name(alias), this);
    }

    @Override
    public TrustedUsers as(Name alias) {
        return new TrustedUsers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TrustedUsers rename(String name) {
        return new TrustedUsers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TrustedUsers rename(Name name) {
        return new TrustedUsers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
