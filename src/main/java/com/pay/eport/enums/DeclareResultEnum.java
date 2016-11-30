package com.pay.eport.enums;

public enum DeclareResultEnum {

	UNACCEPTTED( "0", "未受理" ), 
	ACCEPPTED( "1", "已受理" ), 
	FAILED( "2", "申报失败" ), 
	SUCCEED( "3", "申报成功" ), 
	OVERTIME( "4", "申报超时" );

	private final String code;
	private final String description;

	private DeclareResultEnum( String code, String description )
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
}