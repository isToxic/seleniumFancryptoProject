/*
 * This file is generated by jOOQ.
 */
package is.toxic.db.data.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;

import is.toxic.db.data.tables.AdvertisementSnapshot;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdvertisementSnapshotRecord extends UpdatableRecordImpl<AdvertisementSnapshotRecord> implements Record21<Long, Long, String, BigDecimal, BigDecimal, String, LocalDateTime, Integer, Integer, Integer, Integer, Boolean, Long, Boolean, Boolean, Boolean, Boolean, String, Long, Boolean, Long> {

    private static final long serialVersionUID = -478422254;

    /**
     * Setter for <code>public.advertisement_snapshot.key</code>.
     */
    public void setKey(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.key</code>.
     */
    public Long getKey() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.id</code>.
     */
    public void setId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.id</code>.
     */
    public Long getId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.equation</code>.
     */
    public void setEquation(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.equation</code>.
     */
    public String getEquation() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.min_amount</code>.
     */
    public void setMinAmount(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.min_amount</code>.
     */
    public BigDecimal getMinAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.max_amount</code>.
     */
    public void setMaxAmount(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.max_amount</code>.
     */
    public BigDecimal getMaxAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.message</code>.
     */
    public void setMessage(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.message</code>.
     */
    public String getMessage() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.country</code>.
     */
    public void setCountry(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.country</code>.
     */
    public Integer getCountry() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.payment_type</code>.
     */
    public void setPaymentType(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.payment_type</code>.
     */
    public Integer getPaymentType() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.fiat_currency</code>.
     */
    public void setFiatCurrency(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.fiat_currency</code>.
     */
    public Integer getFiatCurrency() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.crypto_currency</code>.
     */
    public void setCryptoCurrency(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.crypto_currency</code>.
     */
    public Integer getCryptoCurrency() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.is_buy</code>.
     */
    public void setIsBuy(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.is_buy</code>.
     */
    public Boolean getIsBuy() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.owner_key</code>.
     */
    public void setOwnerKey(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.owner_key</code>.
     */
    public Long getOwnerKey() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.monitor_liquidity</code>.
     */
    public void setMonitorLiquidity(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.monitor_liquidity</code>.
     */
    public Boolean getMonitorLiquidity() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.not_anonymous</code>.
     */
    public void setNotAnonymous(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.not_anonymous</code>.
     */
    public Boolean getNotAnonymous() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.phone_confirmed</code>.
     */
    public void setPhoneConfirmed(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.phone_confirmed</code>.
     */
    public Boolean getPhoneConfirmed() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.trusted</code>.
     */
    public void setTrusted(Boolean value) {
        set(16, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.trusted</code>.
     */
    public Boolean getTrusted() {
        return (Boolean) get(16);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.title</code>.
     */
    public void setTitle(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.title</code>.
     */
    public String getTitle() {
        return (String) get(17);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.window</code>.
     */
    public void setWindow(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.window</code>.
     */
    public Long getWindow() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.is_enabled</code>.
     */
    public void setIsEnabled(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.is_enabled</code>.
     */
    public Boolean getIsEnabled() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>public.advertisement_snapshot.metadata_key</code>.
     */
    public void setMetadataKey(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>public.advertisement_snapshot.metadata_key</code>.
     */
    public Long getMetadataKey() {
        return (Long) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row21<Long, Long, String, BigDecimal, BigDecimal, String, LocalDateTime, Integer, Integer, Integer, Integer, Boolean, Long, Boolean, Boolean, Boolean, Boolean, String, Long, Boolean, Long> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<Long, Long, String, BigDecimal, BigDecimal, String, LocalDateTime, Integer, Integer, Integer, Integer, Boolean, Long, Boolean, Boolean, Boolean, Boolean, String, Long, Boolean, Long> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.KEY;
    }

    @Override
    public Field<Long> field2() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.ID;
    }

    @Override
    public Field<String> field3() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.EQUATION;
    }

    @Override
    public Field<BigDecimal> field4() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.MIN_AMOUNT;
    }

    @Override
    public Field<BigDecimal> field5() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.MAX_AMOUNT;
    }

    @Override
    public Field<String> field6() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.MESSAGE;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.CREATED_AT;
    }

    @Override
    public Field<Integer> field8() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.COUNTRY;
    }

    @Override
    public Field<Integer> field9() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.PAYMENT_TYPE;
    }

    @Override
    public Field<Integer> field10() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.FIAT_CURRENCY;
    }

    @Override
    public Field<Integer> field11() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.CRYPTO_CURRENCY;
    }

    @Override
    public Field<Boolean> field12() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.IS_BUY;
    }

    @Override
    public Field<Long> field13() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.OWNER_KEY;
    }

    @Override
    public Field<Boolean> field14() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.MONITOR_LIQUIDITY;
    }

    @Override
    public Field<Boolean> field15() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.NOT_ANONYMOUS;
    }

    @Override
    public Field<Boolean> field16() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.PHONE_CONFIRMED;
    }

    @Override
    public Field<Boolean> field17() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.TRUSTED;
    }

    @Override
    public Field<String> field18() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.TITLE;
    }

    @Override
    public Field<Long> field19() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.WINDOW;
    }

    @Override
    public Field<Boolean> field20() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.IS_ENABLED;
    }

    @Override
    public Field<Long> field21() {
        return AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT.METADATA_KEY;
    }

    @Override
    public Long component1() {
        return getKey();
    }

    @Override
    public Long component2() {
        return getId();
    }

    @Override
    public String component3() {
        return getEquation();
    }

    @Override
    public BigDecimal component4() {
        return getMinAmount();
    }

    @Override
    public BigDecimal component5() {
        return getMaxAmount();
    }

    @Override
    public String component6() {
        return getMessage();
    }

    @Override
    public LocalDateTime component7() {
        return getCreatedAt();
    }

    @Override
    public Integer component8() {
        return getCountry();
    }

    @Override
    public Integer component9() {
        return getPaymentType();
    }

    @Override
    public Integer component10() {
        return getFiatCurrency();
    }

    @Override
    public Integer component11() {
        return getCryptoCurrency();
    }

    @Override
    public Boolean component12() {
        return getIsBuy();
    }

    @Override
    public Long component13() {
        return getOwnerKey();
    }

    @Override
    public Boolean component14() {
        return getMonitorLiquidity();
    }

    @Override
    public Boolean component15() {
        return getNotAnonymous();
    }

    @Override
    public Boolean component16() {
        return getPhoneConfirmed();
    }

    @Override
    public Boolean component17() {
        return getTrusted();
    }

    @Override
    public String component18() {
        return getTitle();
    }

    @Override
    public Long component19() {
        return getWindow();
    }

    @Override
    public Boolean component20() {
        return getIsEnabled();
    }

    @Override
    public Long component21() {
        return getMetadataKey();
    }

    @Override
    public Long value1() {
        return getKey();
    }

    @Override
    public Long value2() {
        return getId();
    }

    @Override
    public String value3() {
        return getEquation();
    }

    @Override
    public BigDecimal value4() {
        return getMinAmount();
    }

    @Override
    public BigDecimal value5() {
        return getMaxAmount();
    }

    @Override
    public String value6() {
        return getMessage();
    }

    @Override
    public LocalDateTime value7() {
        return getCreatedAt();
    }

    @Override
    public Integer value8() {
        return getCountry();
    }

    @Override
    public Integer value9() {
        return getPaymentType();
    }

    @Override
    public Integer value10() {
        return getFiatCurrency();
    }

    @Override
    public Integer value11() {
        return getCryptoCurrency();
    }

    @Override
    public Boolean value12() {
        return getIsBuy();
    }

    @Override
    public Long value13() {
        return getOwnerKey();
    }

    @Override
    public Boolean value14() {
        return getMonitorLiquidity();
    }

    @Override
    public Boolean value15() {
        return getNotAnonymous();
    }

    @Override
    public Boolean value16() {
        return getPhoneConfirmed();
    }

    @Override
    public Boolean value17() {
        return getTrusted();
    }

    @Override
    public String value18() {
        return getTitle();
    }

    @Override
    public Long value19() {
        return getWindow();
    }

    @Override
    public Boolean value20() {
        return getIsEnabled();
    }

    @Override
    public Long value21() {
        return getMetadataKey();
    }

    @Override
    public AdvertisementSnapshotRecord value1(Long value) {
        setKey(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value2(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value3(String value) {
        setEquation(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value4(BigDecimal value) {
        setMinAmount(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value5(BigDecimal value) {
        setMaxAmount(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value6(String value) {
        setMessage(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value7(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value8(Integer value) {
        setCountry(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value9(Integer value) {
        setPaymentType(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value10(Integer value) {
        setFiatCurrency(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value11(Integer value) {
        setCryptoCurrency(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value12(Boolean value) {
        setIsBuy(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value13(Long value) {
        setOwnerKey(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value14(Boolean value) {
        setMonitorLiquidity(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value15(Boolean value) {
        setNotAnonymous(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value16(Boolean value) {
        setPhoneConfirmed(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value17(Boolean value) {
        setTrusted(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value18(String value) {
        setTitle(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value19(Long value) {
        setWindow(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value20(Boolean value) {
        setIsEnabled(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord value21(Long value) {
        setMetadataKey(value);
        return this;
    }

    @Override
    public AdvertisementSnapshotRecord values(Long value1, Long value2, String value3, BigDecimal value4, BigDecimal value5, String value6, LocalDateTime value7, Integer value8, Integer value9, Integer value10, Integer value11, Boolean value12, Long value13, Boolean value14, Boolean value15, Boolean value16, Boolean value17, String value18, Long value19, Boolean value20, Long value21) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdvertisementSnapshotRecord
     */
    public AdvertisementSnapshotRecord() {
        super(AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT);
    }

    /**
     * Create a detached, initialised AdvertisementSnapshotRecord
     */
    public AdvertisementSnapshotRecord(Long key, Long id, String equation, BigDecimal minAmount, BigDecimal maxAmount, String message, LocalDateTime createdAt, Integer country, Integer paymentType, Integer fiatCurrency, Integer cryptoCurrency, Boolean isBuy, Long ownerKey, Boolean monitorLiquidity, Boolean notAnonymous, Boolean phoneConfirmed, Boolean trusted, String title, Long window, Boolean isEnabled, Long metadataKey) {
        super(AdvertisementSnapshot.ADVERTISEMENT_SNAPSHOT);

        set(0, key);
        set(1, id);
        set(2, equation);
        set(3, minAmount);
        set(4, maxAmount);
        set(5, message);
        set(6, createdAt);
        set(7, country);
        set(8, paymentType);
        set(9, fiatCurrency);
        set(10, cryptoCurrency);
        set(11, isBuy);
        set(12, ownerKey);
        set(13, monitorLiquidity);
        set(14, notAnonymous);
        set(15, phoneConfirmed);
        set(16, trusted);
        set(17, title);
        set(18, window);
        set(19, isEnabled);
        set(20, metadataKey);
    }
}