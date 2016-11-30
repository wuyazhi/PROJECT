package com.pay.eport.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 【电子口岸】报关响应历史
 */
public class EPortClearanceReponse implements Serializable
{
	/**
	 * 记录编号
	 */
	private BigDecimal recordNo;

	/**
	 * 系统跟踪号
	 */
	private String sysTraceNo;

	/**
	 * 电子口岸代码
	 */
	private String eportCode;

	/**
	 * 报关订单号
	 */
	private String orderNo;

	/**
	 * 报关流水号
	 */
	private String businessNo;

	/**
	 * 处理结果<br>
	 * 1：处理成功<br>
	 * 2：处理失败<br>
	 * 3：已存在
	 */
	private String chkMark;

	/**
	 * 创建时间
	 */
	private Date createDate;

	/**
	 * 保留字段1
	 */
	private String resvFld1;

	/**
	 * 保留字段2
	 */
	private String resvFld2;

	/**
	 * 完整报文
	 */
	private String responseContext;

	private static final long serialVersionUID = 1L;

	/**
	 * <b>获取</b> 记录编号
	 */
	public BigDecimal getRecordNo( )
	{
		return recordNo;
	}

	/**
	 * <b>设置</b> 记录编号
	 */
	public void setRecordNo( BigDecimal recordNo )
	{
		this.recordNo = recordNo;
	}

	/**
	 * <b>获取</b> 系统跟踪号
	 */
	public String getSysTraceNo( )
	{
		return sysTraceNo;
	}

	/**
	 * <b>设置</b> 系统跟踪号
	 */
	public void setSysTraceNo( String sysTraceNo )
	{
		this.sysTraceNo = sysTraceNo;
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
	 * <b>获取</b> 报关订单号
	 */
	public String getOrderNo( )
	{
		return orderNo;
	}

	/**
	 * <b>设置</b> 报关订单号
	 */
	public void setOrderNo( String orderNo )
	{
		this.orderNo = orderNo;
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
	 * <b>获取</b> 处理结果<br>
	 * 1：处理成功<br>
	 * 2：处理失败<br>
	 * 3：已存在
	 */
	public String getChkMark( )
	{
		return chkMark;
	}

	/**
	 * <b>设置</b> 处理结果<br>
	 * 1：处理成功<br>
	 * 2：处理失败<br>
	 * 3：已存在
	 */
	public void setChkMark( String chkMark )
	{
		this.chkMark = chkMark;
	}

	/**
	 * <b>获取</b> 创建时间
	 */
	public Date getCreateDate( )
	{
		return createDate;
	}

	/**
	 * <b>设置</b> 创建时间
	 */
	public void setCreateDate( Date createDate )
	{
		this.createDate = createDate;
	}

	/**
	 * <b>获取</b> 保留字段1
	 */
	public String getResvFld1( )
	{
		return resvFld1;
	}

	/**
	 * <b>设置</b> 保留字段1
	 */
	public void setResvFld1( String resvFld1 )
	{
		this.resvFld1 = resvFld1;
	}

	/**
	 * <b>获取</b> 保留字段2
	 */
	public String getResvFld2( )
	{
		return resvFld2;
	}

	/**
	 * <b>设置</b> 保留字段2
	 */
	public void setResvFld2( String resvFld2 )
	{
		this.resvFld2 = resvFld2;
	}

	/**
	 * <b>获取</b> 完整报文
	 */
	public String getResponseContext( )
	{
		return responseContext;
	}

	/**
	 * <b>设置</b> 完整报文
	 */
	public void setResponseContext( String responseContext )
	{
		this.responseContext = responseContext;
	}
}