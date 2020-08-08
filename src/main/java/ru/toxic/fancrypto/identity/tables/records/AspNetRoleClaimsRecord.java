/*
 * This file is generated by jOOQ.
 */
package ru.toxic.fancrypto.identity.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import ru.toxic.fancrypto.identity.tables.AspNetRoleClaims;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AspNetRoleClaimsRecord extends UpdatableRecordImpl<AspNetRoleClaimsRecord> implements Record4<Integer, String, String, String> {

    private static final long serialVersionUID = -1524601315;

    /**
     * Setter for <code>public.asp_net_role_claims.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.asp_net_role_claims.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.asp_net_role_claims.role_id</code>.
     */
    public void setRoleId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.asp_net_role_claims.role_id</code>.
     */
    public String getRoleId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.asp_net_role_claims.claim_type</code>.
     */
    public void setClaimType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.asp_net_role_claims.claim_type</code>.
     */
    public String getClaimType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.asp_net_role_claims.claim_value</code>.
     */
    public void setClaimValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.asp_net_role_claims.claim_value</code>.
     */
    public String getClaimValue() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return AspNetRoleClaims.ASP_NET_ROLE_CLAIMS.ID;
    }

    @Override
    public Field<String> field2() {
        return AspNetRoleClaims.ASP_NET_ROLE_CLAIMS.ROLE_ID;
    }

    @Override
    public Field<String> field3() {
        return AspNetRoleClaims.ASP_NET_ROLE_CLAIMS.CLAIM_TYPE;
    }

    @Override
    public Field<String> field4() {
        return AspNetRoleClaims.ASP_NET_ROLE_CLAIMS.CLAIM_VALUE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getRoleId();
    }

    @Override
    public String component3() {
        return getClaimType();
    }

    @Override
    public String component4() {
        return getClaimValue();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getRoleId();
    }

    @Override
    public String value3() {
        return getClaimType();
    }

    @Override
    public String value4() {
        return getClaimValue();
    }

    @Override
    public AspNetRoleClaimsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public AspNetRoleClaimsRecord value2(String value) {
        setRoleId(value);
        return this;
    }

    @Override
    public AspNetRoleClaimsRecord value3(String value) {
        setClaimType(value);
        return this;
    }

    @Override
    public AspNetRoleClaimsRecord value4(String value) {
        setClaimValue(value);
        return this;
    }

    @Override
    public AspNetRoleClaimsRecord values(Integer value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AspNetRoleClaimsRecord
     */
    public AspNetRoleClaimsRecord() {
        super(AspNetRoleClaims.ASP_NET_ROLE_CLAIMS);
    }

    /**
     * Create a detached, initialised AspNetRoleClaimsRecord
     */
    public AspNetRoleClaimsRecord(Integer id, String roleId, String claimType, String claimValue) {
        super(AspNetRoleClaims.ASP_NET_ROLE_CLAIMS);

        set(0, id);
        set(1, roleId);
        set(2, claimType);
        set(3, claimValue);
    }
}