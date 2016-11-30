package com.pay.eport.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.apache.commons.lang.StringUtils;

public final class AmountUtils
{
	private static final int SCALE_HUNDREDTH = 2;
	private static final int DECIMAL_THOUSAND = 3;

	private AmountUtils( )
	{}

	public static BigDecimal toBigDecimalWithDefaultValue( String amount )
	{
		if ( StringUtils.isBlank( amount ) )
		{
			return BigDecimal.ZERO;
		}
		else if ( !StringUtils.isNumeric( amount ) )
		{
			throw new IllegalArgumentException( "This is not a number string: " + amount );
		}

		return new BigDecimal( amount ).movePointLeft( DECIMAL_THOUSAND ).setScale(
				SCALE_HUNDREDTH, RoundingMode.HALF_UP );
	}

	public static BigDecimal toBigDecimalWithDefaultValue( Long amount )
	{
		return new BigDecimal( amount ).movePointLeft( DECIMAL_THOUSAND ).setScale(
				SCALE_HUNDREDTH, RoundingMode.HALF_UP );
	}
}