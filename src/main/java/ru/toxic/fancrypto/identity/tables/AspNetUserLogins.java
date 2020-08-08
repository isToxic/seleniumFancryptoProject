/*
 * This file is generated by jOOQ.
 */
package ru.toxic.fancrypto.identity.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import ru.toxic.fancrypto.identity.Indexes;
import ru.toxic.fancrypto.identity.Keys;
import ru.toxic.fancrypto.identity.Public;
import ru.toxic.fancrypto.identity.tables.records.AspNetUserLoginsRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AspNetUserLogins extends TableImpl<AspNetUserLoginsRecord> {

    private static final long serialVersionUID = -2066409315;

    /**
     * The reference instance of <code>public.asp_net_user_logins</code>
     */
    public static final AspNetUserLogins ASP_NET_USER_LOGINS = new AspNetUserLogins();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AspNetUserLoginsRecord> getRecordType() {
        return AspNetUserLoginsRecord.class;
    }

    /**
     * The column <code>public.asp_net_user_logins.login_provider</code>.
     */
    public final TableField<AspNetUserLoginsRecord, String> LOGIN_PROVIDER = createField(DSL.name("login_provider"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.asp_net_user_logins.provider_key</code>.
     */
    public final TableField<AspNetUserLoginsRecord, String> PROVIDER_KEY = createField(DSL.name("provider_key"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.asp_net_user_logins.provider_display_name</code>.
     */
    public final TableField<AspNetUserLoginsRecord, String> PROVIDER_DISPLAY_NAME = createField(DSL.name("provider_display_name"), org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.asp_net_user_logins.user_id</code>.
     */
    public final TableField<AspNetUserLoginsRecord, String> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>public.asp_net_user_logins</code> table reference
     */
    public AspNetUserLogins() {
        this(DSL.name("asp_net_user_logins"), null);
    }

    /**
     * Create an aliased <code>public.asp_net_user_logins</code> table reference
     */
    public AspNetUserLogins(String alias) {
        this(DSL.name(alias), ASP_NET_USER_LOGINS);
    }

    /**
     * Create an aliased <code>public.asp_net_user_logins</code> table reference
     */
    public AspNetUserLogins(Name alias) {
        this(alias, ASP_NET_USER_LOGINS);
    }

    private AspNetUserLogins(Name alias, Table<AspNetUserLoginsRecord> aliased) {
        this(alias, aliased, null);
    }

    private AspNetUserLogins(Name alias, Table<AspNetUserLoginsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> AspNetUserLogins(Table<O> child, ForeignKey<O, AspNetUserLoginsRecord> key) {
        super(child, key, ASP_NET_USER_LOGINS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.IX_ASP_NET_USER_LOGINS_USER_ID);
    }

    @Override
    public UniqueKey<AspNetUserLoginsRecord> getPrimaryKey() {
        return Keys.PK_ASP_NET_USER_LOGINS;
    }

    @Override
    public List<UniqueKey<AspNetUserLoginsRecord>> getKeys() {
        return Arrays.<UniqueKey<AspNetUserLoginsRecord>>asList(Keys.PK_ASP_NET_USER_LOGINS);
    }

    @Override
    public List<ForeignKey<AspNetUserLoginsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AspNetUserLoginsRecord, ?>>asList(Keys.ASP_NET_USER_LOGINS__FK_ASP_NET_USER_LOGINS_ASP_NET_USERS_USER_ID);
    }

    public AspNetUsers aspNetUsers() {
        return new AspNetUsers(this, Keys.ASP_NET_USER_LOGINS__FK_ASP_NET_USER_LOGINS_ASP_NET_USERS_USER_ID);
    }

    @Override
    public AspNetUserLogins as(String alias) {
        return new AspNetUserLogins(DSL.name(alias), this);
    }

    @Override
    public AspNetUserLogins as(Name alias) {
        return new AspNetUserLogins(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AspNetUserLogins rename(String name) {
        return new AspNetUserLogins(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AspNetUserLogins rename(Name name) {
        return new AspNetUserLogins(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
