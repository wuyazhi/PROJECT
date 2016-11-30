package com.pay.eport.enums;

import org.apache.commons.lang.StringUtils;

public enum PaperTypeEnum {
	ID_CARD( "01", "身份证" ), 
	PASSPORT( "02", "护照" ), 
	OTHER( "03", "其他" );

	private final String code;
	private final String description;

	private PaperTypeEnum( String code, String description )
	{
		this.code = code;
		this.description = description;
	}

	public String getCode( )
	{
		return this.code;
	}

	public String getDescription( )
	{
		return this.description;
	}

	public static PaperTypeEnum fromPaperTypeCode( String paperType )
	{
		if ( StringUtils.isBlank( paperType ) || !StringUtils.isNumeric( paperType ) )
		{
			return null;
		}

		PaperTypeEnum result = null;
		for ( PaperTypeEnum idType : values( ) )
		{
			if ( idType.getCode( ).equals( paperType ) )
			{
				result = idType;
				break;
			}
		}

		return result;
	}

	public static boolean isSupported( String paperType )
	{
		if ( StringUtils.isBlank( paperType ) || !StringUtils.isNumeric( paperType ) )
		{
			return false;
		}

		boolean isSupported = false;
		for ( PaperTypeEnum idType : values( ) )
		{
			if ( idType.getCode( ).equals( paperType ) )
			{
				isSupported = true;
				break;
			}
		}

		return isSupported;
	}
}