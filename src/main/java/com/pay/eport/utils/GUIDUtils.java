package com.pay.eport.utils;

import java.util.UUID;
import org.apache.commons.lang.StringUtils;

public final class GUIDUtils
{
	private GUIDUtils( )
	{}

	public static String generateGUID( String seed )
	{
		seed = StringUtils.trimToEmpty( seed );
		if ( StringUtils.isNotEmpty( seed ) )
		{
			return StringUtils.upperCase( UUID.nameUUIDFromBytes( seed.getBytes( ) )
					.toString( ) );
		}
		else
		{
			return StringUtils.upperCase( UUID.randomUUID( ).toString( ) );
		}
	}

	public static String generateGUID( )
	{
		return StringUtils.upperCase( UUID.randomUUID( ).toString( ) );
	}
}