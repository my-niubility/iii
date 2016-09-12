package com.nbl.service.business.constant;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Donald
 * @createdate 2016年5月9日
 * @version 1.0 
 * @description :工作日标识
 */
public enum WorkDayType {
	YES( 1, "工作日" ), 
	NO( 0, "非工作日" );

	private final Integer value;
	private final String displayName;

	private static Map<Integer, WorkDayType> valueMap = new HashMap<Integer, WorkDayType>();

	static {
		for ( WorkDayType _enum : WorkDayType.values() ) {
			valueMap.put( _enum.value, _enum );
		}
	}

	WorkDayType( int value, String displayName ) {
		this.value = value;
		this.displayName = displayName;
	}

	public Integer getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}

	public WorkDayType getEnum( Integer value ) {
		return valueMap.get( value );
	}

	public Map<Integer, WorkDayType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}

	public static WorkDayType returnEnum( Integer value ) {
		return valueMap.get( value );
	}
}
