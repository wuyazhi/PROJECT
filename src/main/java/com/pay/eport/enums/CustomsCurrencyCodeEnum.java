package com.pay.eport.enums;

public enum CustomsCurrencyCodeEnum {

	// 亚洲
	CNY( "142", "人民币" ), 
	HKD( "110", "港元" ), 
	IRR( "113", "伊朗里亚尔" ), 
	JPY( "116", "日元" ), 
	//KRW( "KRW", "韩元" ), 
	KWD( "118", "科威特第纳尔" ), 
	MOP( "121", "澳门元" ), 
	MYR( "122", "马来西亚林吉特" ), 
	PHP( "129", "菲律宾比索" ), 
	PRK( "127", "巴基斯坦卢比" ), 
	SGD( "132", "新加坡元" ), 
	THB( "136", "泰铢" ), 
	TWD( "143", "台币" ), 

	//欧洲
	CHF( "331", "瑞士法郎" ), 
	DKK( "302", "丹麦克朗" ), 
	EUR( "300", "欧元" ), 
	GBP( "303", "英镑" ), 
	NOK( "326", "挪威克朗" ), 
	//RUB( "RUB", "俄罗斯卢布" ), 
	SEK( "330", "瑞典克朗" ), 

	//北美洲
	CAD( "501", "加拿大元" ), 
	USD( "502", "美元" ),

	//大洋洲
	AUD( "601", "澳大利亚元" ), 
	NZD( "609", "新西兰元" );

	private final String code;
	private final String name;

	private CustomsCurrencyCodeEnum( String code, String name )
	{
		this.code = code;
		this.name = name;
	}

	public String getCode( )
	{
		return this.code;
	}

	public String getName( )
	{
		return this.name;
	}
}