package com.pay.eport.dto;

import org.apache.commons.lang.StringUtils;

public final class EPortOrderUpdateItem
{
	private String orderNo; // 报关订单号

	private String chkMark; // 报关处理结果

	private String detail; // 处理结果详细信息

	public EPortOrderUpdateItem( )
	{}

	public EPortOrderUpdateItem( String orderNo, String chkMark )
	{
		this.orderNo = orderNo;
		this.chkMark = chkMark;
	}

	public EPortOrderUpdateItem( String orderNo, String chkMark, String detail )
	{
		this.orderNo = orderNo;
		this.chkMark = chkMark;
		this.detail = detail;
	}

	public String getOrderNo( )
	{
		return StringUtils.trimToEmpty( this.orderNo );
	}

	public void setOrderNo( String orderNo )
	{
		this.orderNo = orderNo;
	}

	public String getChkMark( )
	{
		return StringUtils.trimToEmpty( this.chkMark );
	}

	public void setChkMark( String chkMark )
	{
		this.chkMark = chkMark;
	}

	public String getDetail( )
	{
		return StringUtils.trimToEmpty( this.detail );
	}

	public void setDetail( String detail )
	{
		this.detail = detail;
	}
}