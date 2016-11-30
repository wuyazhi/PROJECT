package com.pay.eport.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

/**
 * 【电子口岸】报关订单
 */
public class TEportOrder implements Serializable
{
	/**
	 * 订单号
	 */
	private String orderNo;

	/**
	 * 系统跟踪号
	 */
	private String sysTraceNo;

	/**
	 * 商户号
	 */
	private BigDecimal partnerId;

	/**
	 * 电子口岸代码
	 */
	private String eportCode;

	/**
	 * 平台商户号
	 */
	private String platformId;

	/**
	 * 订单类型: 0-新生平台支付订单; 1-其它平台支付订单; 2-支付单报送订单
	 */
	private String orderType;

	/**
	 * 商户报关请求序列号
	 */
	private String pEportOrderId;

	/**
	 * 商户报关订单号
	 */
	private String pPayOrderNo;

	/**
	 * 支付交易号
	 */
	private String payTransactionNo;

	/**
	 * 电商平台备案号
	 */
	private String eCompanyCode;

	/**
	 * 新生备案号
	 */
	private String payCompanyCode;

	/**
	 * 支付币种
	 */
	private String currCode;

	/**
	 * 支付金额。支付金额=货款+税款+运费。
	 */
	private BigDecimal payAmount;

	/**
	 * 支付时间
	 */
	private Date payTimeStr;

	/**
	 * 支付人姓名
	 */
	private String payerName;

	/**
	 * 支付人证件类型
	 */
	private String paperType;

	/**
	 * 支付人证件号码
	 */
	private String paperNumber;

	/**
	 * 订单状态: 0-未报关; 1-报关中; 2-已报关; 3-超时; 9-已重发
	 */
	private String status;

	/**
	 * 报关流水号
	 */
	private String businessNo;

	/**
	 * 报关结果<br>
	 * 0：未受理<br>
	 * 1：已受理<br>
	 * 2：处理失败<br>
	 * 3：处理成功
	 */
	private String result;

	/**
	 * 失败信息
	 */
	private String failInfo;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 异步通知地址
	 */
	private String bgUrl;

	/**
	 * 保留字段1
	 */
	private String resvFld1;

	/**
	 * 保留字段2
	 */
	private String resvFld2;

	/**
	 * 支付货款
	 */
	private BigDecimal payGoodsAmount;

	/**
	 * 支付税款
	 */
	private BigDecimal payTaxAmount;

	/**
	 * 支付运费
	 */
	private BigDecimal payFeeAmount;

	/**
	 * 发卡行
	 */
	private String bankName;

	/**
	 * 银行卡号
	 */
	private String bankNo;

	/**
	 * 支付ID，例如支付宝帐号
	 */
	private String payAccount;

	/**
	 * 支付人手机号
	 */
	private String payerPhoneNumber;

	/**
	 * 报关手续费，收费币种为人民币
	 */
	private BigDecimal declareFee;

	/**
	 * 商户名称
	 */
	private String partnerName;

	/**
	 * 商户备案名称
	 */
	private String eCompanyName;

	private static final long serialVersionUID = 1L;

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
	 * <b>获取</b> 商户号
	 */
	public String getPartnerIdString( )
	{
		return ( this.partnerId != null ) ? this.partnerId.toString( ) : "";
	}

	/**
	 * <b>获取</b> 商户号
	 */
	public BigDecimal getPartnerId( )
	{
		return partnerId;
	}

	/**
	 * <b>设置</b> 商户号
	 */
	public void setPartnerId( BigDecimal partnerId )
	{
		this.partnerId = partnerId;
	}

	/**
	 * <b>设置</b> 商户号
	 */
	public void setPartnerId( String partnerId )
	{
		if ( StringUtils.isNotBlank( partnerId ) && StringUtils.isNumeric( partnerId ) )
		{
			this.partnerId = new BigDecimal( partnerId );
		}
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
	 * <b>获取</b> 平台商户号
	 */
	public String getPlatformId( )
	{
		return platformId;
	}

	/**
	 * <b>设置</b> 平台商户号
	 */
	public void setPlatformId( String platformId )
	{
		this.platformId = platformId;
	}

	/**
	 * <b>获取</b> 订单类型: 0-新生平台支付订单; 1-其它平台支付订单; 2-支付单报送订单
	 */
	public String getOrderType( )
	{
		return orderType;
	}

	/**
	 * <b>设置</b> 订单类型: 0-新生平台支付订单; 1-其它平台支付订单; 2-支付单报送订单
	 */
	public void setOrderType( String orderType )
	{
		this.orderType = orderType;
	}

	/**
	 * <b>获取</b> 商户报关请求序列号
	 */
	public String getpEportOrderId( )
	{
		return pEportOrderId;
	}

	/**
	 * <b>设置</b> 商户报关请求序列号
	 */
	public void setpEportOrderId( String pEportOrderId )
	{
		this.pEportOrderId = pEportOrderId;
	}

	/**
	 * <b>获取</b> 商户报关订单号
	 */
	public String getpPayOrderNo( )
	{
		return pPayOrderNo;
	}

	/**
	 * <b>设置</b> 商户报关订单号
	 */
	public void setpPayOrderNo( String pPayOrderNo )
	{
		this.pPayOrderNo = pPayOrderNo;
	}

	/**
	 * <b>获取</b> 支付交易号
	 */
	public String getPayTransactionNo( )
	{
		return payTransactionNo;
	}

	/**
	 * <b>设置</b> 支付交易号
	 */
	public void setPayTransactionNo( String payTransactionNo )
	{
		this.payTransactionNo = payTransactionNo;
	}

	/**
	 * <b>获取</b> 电商平台备案号
	 */
	public String geteCompanyCode( )
	{
		return eCompanyCode;
	}

	/**
	 * <b>设置</b> 电商平台备案号
	 */
	public void seteCompanyCode( String eCompanyCode )
	{
		this.eCompanyCode = eCompanyCode;
	}

	/**
	 * <b>获取</b> 新生备案号
	 */
	public String getPayCompanyCode( )
	{
		return payCompanyCode;
	}

	/**
	 * <b>设置</b> 新生备案号
	 */
	public void setPayCompanyCode( String payCompanyCode )
	{
		this.payCompanyCode = payCompanyCode;
	}

	/**
	 * <b>获取</b> 支付币种
	 */
	public String getCurrCode( )
	{
		return currCode;
	}

	/**
	 * <b>设置</b> 支付币种
	 */
	public void setCurrCode( String currCode )
	{
		this.currCode = currCode;
	}

	/**
	 * <b>获取</b> 支付金额。支付金额=货款+税款+运费。
	 */
	public BigDecimal getPayAmount( )
	{
		return payAmount;
	}

	/**
	 * <b>设置</b> 支付金额。支付金额=货款+税款+运费。
	 */
	public void setPayAmount( BigDecimal payAmount )
	{
		this.payAmount = payAmount;
	}

	/**
	 * <b>获取</b> 支付时间
	 */
	public Date getPayTimeStr( )
	{
		return payTimeStr;
	}

	/**
	 * <b>设置</b> 支付时间
	 */
	public void setPayTimeStr( Date payTimeStr )
	{
		this.payTimeStr = payTimeStr;
	}

	/**
	 * <b>获取</b> 支付人姓名
	 */
	public String getPayerName( )
	{
		return payerName;
	}

	/**
	 * <b>设置</b> 支付人姓名
	 */
	public void setPayerName( String payerName )
	{
		this.payerName = payerName;
	}

	/**
	 * <b>获取</b> 支付人证件类型
	 */
	public String getPaperType( )
	{
		return paperType;
	}

	/**
	 * <b>设置</b> 支付人证件类型
	 */
	public void setPaperType( String paperType )
	{
		this.paperType = paperType;
	}

	/**
	 * <b>获取</b> 支付人证件号码
	 */
	public String getPaperNumber( )
	{
		return paperNumber;
	}

	/**
	 * <b>设置</b> 支付人证件号码
	 */
	public void setPaperNumber( String paperNumber )
	{
		this.paperNumber = paperNumber;
	}

	/**
	 * <b>获取</b> 订单状态: 0-未报关; 1-报关中; 2-已报关; 3-超时; 9-已重发
	 */
	public String getStatus( )
	{
		return status;
	}

	/**
	 * <b>设置</b> 订单状态: 0-未报关; 1-报关中; 2-已报关; 3-超时; 9-已重发
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

	/**
	 * <b>获取</b> 失败信息
	 */
	public String getFailInfo( )
	{
		return failInfo;
	}

	/**
	 * <b>设置</b> 失败信息
	 */
	public void setFailInfo( String failInfo )
	{
		this.failInfo = failInfo;
	}

	/**
	 * <b>获取</b> 创建时间
	 */
	public Date getCreateTime( )
	{
		return createTime;
	}

	/**
	 * <b>设置</b> 创建时间
	 */
	public void setCreateTime( Date createTime )
	{
		this.createTime = createTime;
	}

	/**
	 * <b>获取</b> 更新时间
	 */
	public Date getUpdateTime( )
	{
		return updateTime;
	}

	/**
	 * <b>设置</b> 更新时间
	 */
	public void setUpdateTime( Date updateTime )
	{
		this.updateTime = updateTime;
	}

	/**
	 * <b>获取</b> 异步通知地址
	 */
	public String getBgUrl( )
	{
		return bgUrl;
	}

	/**
	 * <b>设置</b> 异步通知地址
	 */
	public void setBgUrl( String bgUrl )
	{
		this.bgUrl = bgUrl;
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
	 * <b>获取</b> 支付货款
	 */
	public BigDecimal getPayGoodsAmount( )
	{
		return payGoodsAmount;
	}

	/**
	 * <b>设置</b> 支付货款
	 */
	public void setPayGoodsAmount( BigDecimal payGoodsAmount )
	{
		this.payGoodsAmount = payGoodsAmount;
	}

	/**
	 * <b>获取</b> 支付税款
	 */
	public BigDecimal getPayTaxAmount( )
	{
		return payTaxAmount;
	}

	/**
	 * <b>设置</b> 支付税款
	 */
	public void setPayTaxAmount( BigDecimal payTaxAmount )
	{
		this.payTaxAmount = payTaxAmount;
	}

	/**
	 * <b>获取</b> 支付运费
	 */
	public BigDecimal getPayFeeAmount( )
	{
		return payFeeAmount;
	}

	/**
	 * <b>设置</b> 支付运费
	 */
	public void setPayFeeAmount( BigDecimal payFeeAmount )
	{
		this.payFeeAmount = payFeeAmount;
	}

	/**
	 * <b>获取</b> 发卡行
	 */
	public String getBankName( )
	{
		return bankName;
	}

	/**
	 * <b>设置</b> 发卡行
	 */
	public void setBankName( String bankName )
	{
		this.bankName = bankName;
	}

	/**
	 * <b>获取</b> 银行卡号
	 */
	public String getBankNo( )
	{
		return bankNo;
	}

	/**
	 * <b>设置</b> 银行卡号
	 */
	public void setBankNo( String bankNo )
	{
		this.bankNo = bankNo;
	}

	/**
	 * <b>获取</b> 支付ID，例如支付宝帐号
	 */
	public String getPayAccount( )
	{
		return payAccount;
	}

	/**
	 * <b>设置</b> 支付ID，例如支付宝帐号
	 */
	public void setPayAccount( String payAccount )
	{
		this.payAccount = payAccount;
	}

	/**
	 * <b>获取</b> 支付人手机号
	 */
	public String getPayerPhoneNumber( )
	{
		return payerPhoneNumber;
	}

	/**
	 * <b>设置</b> 支付人手机号
	 */
	public void setPayerPhoneNumber( String payerPhoneNumber )
	{
		this.payerPhoneNumber = payerPhoneNumber;
	}

	/**
	 * <b>获取</b> 报关手续费，收费币种为人民币
	 */
	public BigDecimal getDeclareFee( )
	{
		return declareFee;
	}

	/**
	 * <b>设置</b> 报关手续费，收费币种为人民币
	 */
	public void setDeclareFee( BigDecimal declareFee )
	{
		this.declareFee = declareFee;
	}

	/**
	 * <b>获取</b> 商户名称
	 */
	public String getPartnerName( )
	{
		return partnerName;
	}

	/**
	 * <b>设置</b> 商户名称
	 */
	public void setPartnerName( String partnerName )
	{
		this.partnerName = partnerName;
	}

	/**
	 * <b>获取</b> 商户备案名称
	 */
	public String geteCompanyName( )
	{
		return eCompanyName;
	}

	/**
	 * <b>设置</b> 商户备案名称
	 */
	public void seteCompanyName( String eCompanyName )
	{
		this.eCompanyName = eCompanyName;
	}
}