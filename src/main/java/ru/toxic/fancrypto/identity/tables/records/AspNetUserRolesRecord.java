/*
 * This file is generated by jOOQ.
 */
package ru.toxic.fancrypto.identity.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import ru.toxic.fancrypto.identity.tables.AspNetUserRoles;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AspNetUserRolesRecord extends UpdatableRecordImpl<AspNetUserRolesRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 2057145371;

    /**
     * Setter for <code>public.asp_net_user_roles.user_id</code>.
     */
    public void setUserId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.asp_net_user_roles.user_id</code>.
     */
    public String getUserId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.asp_net_user_roles.role_id</code>.
     */
    public void setRoleId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.asp_net_user_roles.role_id</code>.
     */
    public String getRoleId() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
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
        return AspNetUserRoles.ASP_NET_USER_ROLES.USER_ID;
    }

    @Override
    public Field<String> field2() {
        return AspNetUserRoles.ASP_NET_USER_ROLES.ROLE_ID;
    }

    @Override
    public String component1() {
        return getUserId();
    }

    @Override
    public String component2() {
        return getRoleId();
    }

    @Override
    public String value1() {
        return getUserId();
    }

    @Override
    public String value2() {
        return getRoleId();
    }

    @Override
    public AspNetUserRolesRecord value1(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public AspNetUserRolesRecord value2(String value) {
        setRoleId(value);
        return this;
    }

    @Override
    public AspNetUserRolesRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AspNetUserRolesRecord
     */
    public AspNetUserRolesRecord() {
        super(AspNetUserRoles.ASP_NET_USER_ROLES);
    }

    /**
     * Create a detached, initialised AspNetUserRolesRecord
     */
    public AspNetUserRolesRecord(String userId, String roleId) {
        super(AspNetUserRoles.ASP_NET_USER_ROLES);

        set(0, userId);
        set(1, roleId);
    }
}
