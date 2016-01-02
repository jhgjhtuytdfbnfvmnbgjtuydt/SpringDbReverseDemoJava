/**
 * This class is generated by jOOQ
 */
package com.example.mysql.tables;


import com.example.mysql.Keys;
import com.example.mysql.Mysql;
import com.example.mysql.tables.records.TimeZoneTransitionTypeRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;


/**
 * Time zone transition types
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TimeZoneTransitionType extends TableImpl<TimeZoneTransitionTypeRecord> {

	private static final long serialVersionUID = 1855247347;

	/**
	 * The reference instance of <code>mysql.time_zone_transition_type</code>
	 */
	public static final TimeZoneTransitionType TIME_ZONE_TRANSITION_TYPE = new TimeZoneTransitionType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TimeZoneTransitionTypeRecord> getRecordType() {
		return TimeZoneTransitionTypeRecord.class;
	}

	/**
	 * The column <code>mysql.time_zone_transition_type.Time_zone_id</code>.
	 */
	public final TableField<TimeZoneTransitionTypeRecord, UInteger> TIME_ZONE_ID = createField("Time_zone_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.time_zone_transition_type.Transition_type_id</code>.
	 */
	public final TableField<TimeZoneTransitionTypeRecord, UInteger> TRANSITION_TYPE_ID = createField("Transition_type_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>mysql.time_zone_transition_type.Offset</code>.
	 */
	public final TableField<TimeZoneTransitionTypeRecord, Integer> OFFSET = createField("Offset", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.time_zone_transition_type.Is_DST</code>.
	 */
	public final TableField<TimeZoneTransitionTypeRecord, UByte> IS_DST = createField("Is_DST", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>mysql.time_zone_transition_type.Abbreviation</code>.
	 */
	public final TableField<TimeZoneTransitionTypeRecord, String> ABBREVIATION = createField("Abbreviation", org.jooq.impl.SQLDataType.CHAR.length(8).nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>mysql.time_zone_transition_type</code> table reference
	 */
	public TimeZoneTransitionType() {
		this("time_zone_transition_type", null);
	}

	/**
	 * Create an aliased <code>mysql.time_zone_transition_type</code> table reference
	 */
	public TimeZoneTransitionType(String alias) {
		this(alias, TIME_ZONE_TRANSITION_TYPE);
	}

	private TimeZoneTransitionType(String alias, Table<TimeZoneTransitionTypeRecord> aliased) {
		this(alias, aliased, null);
	}

	private TimeZoneTransitionType(String alias, Table<TimeZoneTransitionTypeRecord> aliased, Field<?>[] parameters) {
		super(alias, Mysql.MYSQL, aliased, parameters, "Time zone transition types");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TimeZoneTransitionTypeRecord> getPrimaryKey() {
		return Keys.KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TimeZoneTransitionTypeRecord>> getKeys() {
		return Arrays.<UniqueKey<TimeZoneTransitionTypeRecord>>asList(Keys.KEY_TIME_ZONE_TRANSITION_TYPE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TimeZoneTransitionType as(String alias) {
		return new TimeZoneTransitionType(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TimeZoneTransitionType rename(String name) {
		return new TimeZoneTransitionType(name, null);
	}
}