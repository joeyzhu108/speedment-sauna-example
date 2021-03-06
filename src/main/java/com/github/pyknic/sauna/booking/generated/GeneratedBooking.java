package com.github.pyknic.sauna.booking.generated;

import com.github.pyknic.sauna.booking.Booking;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.LongField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import java.sql.Date;
import java.util.Optional;
import java.util.OptionalInt;
import javax.annotation.Generated;

/**
 * The generated base for the {@link
 * com.github.pyknic.sauna.booking.Booking}-interface representing entities of
 * the {@code booking}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@Generated("Speedment")
public interface GeneratedBooking {
    
    /**
     * This Field corresponds to the {@link Booking} field that can be obtained
     * using the {@link Booking#getId()} method.
     */
    final LongField<Booking, Long> ID = LongField.create(Identifier.ID, Booking::getId, Booking::setId, TypeMapper.primitive(), true);
    /**
     * This Field corresponds to the {@link Booking} field that can be obtained
     * using the {@link Booking#getBookingId()} method.
     */
    final LongField<Booking, Long> BOOKING_ID = LongField.create(Identifier.BOOKING_ID, Booking::getBookingId, Booking::setBookingId, TypeMapper.primitive(), false);
    /**
     * This Field corresponds to the {@link Booking} field that can be obtained
     * using the {@link Booking#getEventType()} method.
     */
    final StringField<Booking, String> EVENT_TYPE = StringField.create(Identifier.EVENT_TYPE, Booking::getEventType, Booking::setEventType, TypeMapper.identity(), false);
    /**
     * This Field corresponds to the {@link Booking} field that can be obtained
     * using the {@link Booking#getTenant()} method.
     */
    final ComparableField<Booking, Integer, Integer> TENANT = ComparableField.create(Identifier.TENANT, o -> OptionalUtil.unwrap(o.getTenant()), Booking::setTenant, TypeMapper.identity(), false);
    /**
     * This Field corresponds to the {@link Booking} field that can be obtained
     * using the {@link Booking#getSauna()} method.
     */
    final ComparableField<Booking, Integer, Integer> SAUNA = ComparableField.create(Identifier.SAUNA, o -> OptionalUtil.unwrap(o.getSauna()), Booking::setSauna, TypeMapper.identity(), false);
    /**
     * This Field corresponds to the {@link Booking} field that can be obtained
     * using the {@link Booking#getBookedFrom()} method.
     */
    final ComparableField<Booking, Date, Date> BOOKED_FROM = ComparableField.create(Identifier.BOOKED_FROM, o -> OptionalUtil.unwrap(o.getBookedFrom()), Booking::setBookedFrom, TypeMapper.identity(), false);
    /**
     * This Field corresponds to the {@link Booking} field that can be obtained
     * using the {@link Booking#getBookedTo()} method.
     */
    final ComparableField<Booking, Date, Date> BOOKED_TO = ComparableField.create(Identifier.BOOKED_TO, o -> OptionalUtil.unwrap(o.getBookedTo()), Booking::setBookedTo, TypeMapper.identity(), false);
    
    /**
     * Returns the id of this Booking. The id field corresponds to the database
     * column db0.sauna.booking.id.
     * 
     * @return the id of this Booking
     */
    long getId();
    
    /**
     * Returns the bookingId of this Booking. The bookingId field corresponds to
     * the database column db0.sauna.booking.booking_id.
     * 
     * @return the bookingId of this Booking
     */
    long getBookingId();
    
    /**
     * Returns the eventType of this Booking. The eventType field corresponds to
     * the database column db0.sauna.booking.event_type.
     * 
     * @return the eventType of this Booking
     */
    String getEventType();
    
    /**
     * Returns the tenant of this Booking. The tenant field corresponds to the
     * database column db0.sauna.booking.tenant.
     * 
     * @return the tenant of this Booking
     */
    OptionalInt getTenant();
    
    /**
     * Returns the sauna of this Booking. The sauna field corresponds to the
     * database column db0.sauna.booking.sauna.
     * 
     * @return the sauna of this Booking
     */
    OptionalInt getSauna();
    
    /**
     * Returns the bookedFrom of this Booking. The bookedFrom field corresponds
     * to the database column db0.sauna.booking.booked_from.
     * 
     * @return the bookedFrom of this Booking
     */
    Optional<Date> getBookedFrom();
    
    /**
     * Returns the bookedTo of this Booking. The bookedTo field corresponds to
     * the database column db0.sauna.booking.booked_to.
     * 
     * @return the bookedTo of this Booking
     */
    Optional<Date> getBookedTo();
    
    /**
     * Sets the id of this Booking. The id field corresponds to the database
     * column db0.sauna.booking.id.
     * 
     * @param id to set of this Booking
     * @return   this Booking instance
     */
    Booking setId(long id);
    
    /**
     * Sets the bookingId of this Booking. The bookingId field corresponds to
     * the database column db0.sauna.booking.booking_id.
     * 
     * @param bookingId to set of this Booking
     * @return          this Booking instance
     */
    Booking setBookingId(long bookingId);
    
    /**
     * Sets the eventType of this Booking. The eventType field corresponds to
     * the database column db0.sauna.booking.event_type.
     * 
     * @param eventType to set of this Booking
     * @return          this Booking instance
     */
    Booking setEventType(String eventType);
    
    /**
     * Sets the tenant of this Booking. The tenant field corresponds to the
     * database column db0.sauna.booking.tenant.
     * 
     * @param tenant to set of this Booking
     * @return       this Booking instance
     */
    Booking setTenant(Integer tenant);
    
    /**
     * Sets the sauna of this Booking. The sauna field corresponds to the
     * database column db0.sauna.booking.sauna.
     * 
     * @param sauna to set of this Booking
     * @return      this Booking instance
     */
    Booking setSauna(Integer sauna);
    
    /**
     * Sets the bookedFrom of this Booking. The bookedFrom field corresponds to
     * the database column db0.sauna.booking.booked_from.
     * 
     * @param bookedFrom to set of this Booking
     * @return           this Booking instance
     */
    Booking setBookedFrom(Date bookedFrom);
    
    /**
     * Sets the bookedTo of this Booking. The bookedTo field corresponds to the
     * database column db0.sauna.booking.booked_to.
     * 
     * @param bookedTo to set of this Booking
     * @return         this Booking instance
     */
    Booking setBookedTo(Date bookedTo);
    
    enum Identifier implements ColumnIdentifier<Booking> {
        
        ID ("id"),
        BOOKING_ID ("booking_id"),
        EVENT_TYPE ("event_type"),
        TENANT ("tenant"),
        SAUNA ("sauna"),
        BOOKED_FROM ("booked_from"),
        BOOKED_TO ("booked_to");
        
        private final String columnName;
        private final TableIdentifier<Booking> tableIdentifier;
        
        Identifier(String columnName) {
            this.columnName = columnName;
            this.tableIdentifier = TableIdentifier.of(getDbmsName(), getSchemaName(), getTableName());
        }
        
        @Override
        public String getDbmsName() {
            return "db0";
        }
        
        @Override
        public String getSchemaName() {
            return "sauna";
        }
        
        @Override
        public String getTableName() {
            return "booking";
        }
        
        @Override
        public String getColumnName() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<Booking> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}