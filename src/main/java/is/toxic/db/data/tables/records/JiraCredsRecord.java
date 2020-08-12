/*
 * This file is generated by jOOQ.
 */
package is.toxic.db.data.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;

import is.toxic.db.data.tables.JiraCreds;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JiraCredsRecord extends UpdatableRecordImpl<JiraCredsRecord> implements Record4<Long, String, String, String> {

    private static final long serialVersionUID = -799200028;

    /**
     * Setter for <code>public.jira_creds.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.jira_creds.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.jira_creds.username</code>.
     */
    public void setUsername(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.jira_creds.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.jira_creds.key</code>.
     */
    public void setKey(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.jira_creds.key</code>.
     */
    public String getKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.jira_creds.password</code>.
     */
    public void setPassword(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.jira_creds.password</code>.
     */
    public String getPassword() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return JiraCreds.JIRA_CREDS.ID;
    }

    @Override
    public Field<String> field2() {
        return JiraCreds.JIRA_CREDS.USERNAME;
    }

    @Override
    public Field<String> field3() {
        return JiraCreds.JIRA_CREDS.KEY;
    }

    @Override
    public Field<String> field4() {
        return JiraCreds.JIRA_CREDS.PASSWORD;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUsername();
    }

    @Override
    public String component3() {
        return getKey();
    }

    @Override
    public String component4() {
        return getPassword();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUsername();
    }

    @Override
    public String value3() {
        return getKey();
    }

    @Override
    public String value4() {
        return getPassword();
    }

    @Override
    public JiraCredsRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public JiraCredsRecord value2(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public JiraCredsRecord value3(String value) {
        setKey(value);
        return this;
    }

    @Override
    public JiraCredsRecord value4(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public JiraCredsRecord values(Long value1, String value2, String value3, String value4) {
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
     * Create a detached JiraCredsRecord
     */
    public JiraCredsRecord() {
        super(JiraCreds.JIRA_CREDS);
    }

    /**
     * Create a detached, initialised JiraCredsRecord
     */
    public JiraCredsRecord(Long id, String username, String key, String password) {
        super(JiraCreds.JIRA_CREDS);

        set(0, id);
        set(1, username);
        set(2, key);
        set(3, password);
    }
}