package com.pay.eport.dto;

public final class EPortOrderQueryDto
{
	/**
	 * 订单号
	 */
	private String orderNo;

	/**
	 * 电子口岸代码
	 */
	private String eportCode;

	/**
	 * 报关流水号
	 */
	private String businessNo;

	/**
	 * 订单状态<br>
	 * 0-未报关<br>
	 * 1-报关中<br>
	 * 2-已报关<br>
	 * 3-超时
	 */
	private String status;

	/**
	 * 报关结果<br>
	 * 0：未受理<br>
	 * 1：已受理<br>
	 * 2：处理失败<br>
	 * 3：处理成功
	 */
	private String result;

	public EPortOrderQueryDto( )
	{}

	/**
	 * <b>获取</b> 订单号
	 */
	public String getOrderNo( )
	{
		return orderNo;
	}

	/**
	 * <b>设置</b> 订单号
	 */
	public void setOrderNo( String orderNo )
	{
		this.orderNo = orderNo;
	}

	/**
	 * <b>获取</b> 电子口岸代码
	 */
	public String getEportCode( )
	{
		return eportCode;
	}

	/**
	 * <b>设置</b> 电子口岸代码
	 */
	public void setEportCode( String eportCode )
	{
		this.eportCode = eportCode;
	}

	/**
	 * <b>获取</b> 订单状态<br>
	 * 0-未报关<br>
	 * 1-报关中<br>
	 * 2-已报关<br>
	 * 3-超时
	 */
	public String getStatus( )
	{
		return status;
	}

	/**
	 * <b>设置</b> 订单状态<br>
	 * 0-未报关<br>
	 * 1-报关中<br>
	 * 2-已报关<br>
	 * 3-超时
	 */
	public void setStatus( String status )
	{
		this.status = status;
	}

	/**
	 * <b>获取</b> 报关流水号
	 */
	public String getBusinessNo( )
	{
		return businessNo;
	}

	/**
	 * <b>设置</b> 报关流水号
	 */
	public void setBusinessNo( String businessNo )
	{
		this.businessNo = businessNo;
	}

	/**
	 * <b>获取</b> 报关结果<br>
	 * 0：未受理<br>
	 * 1：已受理<br>
	 * 2：处理失败<br>
	 * 3：处理成功
	 */
	public String getResult( )
	{
		return result;
	}

	/**
	 * <b>设置</b> 报关结果<br>
	 * 0：未受理<br>
	 * 1：已受理<br>
	 * 2：处理失败<br>
	 * 3：处理成功
	 */
	public void setResult( String result )
	{
		this.result = result;
	}
}