package com.pay.eport.dto;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

import com.pay.util.DateUtil;

public final class EPortDeclareRequestDto
{
	private String sysTraceNo;

	/** 报关订单号 */
	private String eportOrderNo;

	/** 电子口岸代码 */
	private String eportCode;

	/** 电商平台备案号 */
	private String eCompanyCode;

	/** 电商平台备案名称 */
	private String eCompanyName;

	/** 商户支付订单编号 */
	private String orderNo;

	/** 支付商家编号 */
	private String payMerchantCode;

	/** 支付商家名称 */
	private String payMerchantName;

	/** 支付交易号 */
	private String payTransactionNo;

	/** 支付金额 */
	private String payAmount;

	/** 支付货款 */
	private String payGoodsAmount;

	/** 支付税款 */
	private String payTaxAmount;

	/** 支付运费 */
	private String payFeeAmount;

	/** 付款时间 yyyy-MM-dd HH:mm:ss */
	private String payTimeStr;

	/** 支付币种 */
	private String currCode;

	/** 发卡行 */
	private String bankName;

	/** 银行卡号 */
	private String bankNo;

	/** 支付ID */
	private String payAccount;

	/** 支付人姓名 */
	private String payerName;

	/** 支付人证件类型 */
	private String paperType;

	/** 支付人证件号码 */
	private String paperNumber;

	/** 支付人手机号 */
	private String payerPhoneNumber;

	/** 是否重发 */
	private boolean isRedeclare;

	public EPortDeclareRequestDto( )
	{}

	public String getSysTraceNo( )
	{
		return StringUtils.trimToEmpty( this.sysTraceNo );
	}

	public void setSysTraceNo( String sysTraceNo )
	{
		this.sysTraceNo = sysTraceNo;
	}

	public String getEportOrderNo( )
	{
		return StringUtils.trimToEmpty( this.eportOrderNo );
	}

	public void setEportOrderNo( String eportOrderNo )
	{
		this.eportOrderNo = eportOrderNo;
	}

	public String getEportCode( )
	{
		return StringUtils.trimToEmpty( this.eportCode );
	}

	public void setEportCode( String eportCode )
	{
		this.eportCode = eportCode;
	}

	public String geteCompanyCode( )
	{
		return StringUtils.trimToEmpty( this.eCompanyCode );
	}

	public void seteCompanyCode( String eCompanyCode )
	{
		this.eCompanyCode = eCompanyCode;
	}

	public String geteCompanyName( )
	{
		return StringUtils.trimToEmpty( this.eCompanyName );
	}

	public void seteCompanyName( String eCompanyName )
	{
		this.eCompanyName = eCompanyName;
	}

	public String getOrderNo( )
	{
		return StringUtils.trimToEmpty( this.orderNo );
	}

	public void setOrderNo( String orderNo )
	{
		this.orderNo = orderNo;
	}

	public String getPayMerchantCode( )
	{
		return StringUtils.trimToEmpty( this.payMerchantCode );
	}

	public void setPayMerchantCode( String payMerchantCode )
	{
		this.payMerchantCode = payMerchantCode;
	}

	public String getPayMerchantName( )
	{
		return StringUtils.trimToEmpty( this.payMerchantName );
	}

	public void setPayMerchantName( String payMerchantName )
	{
		this.payMerchantName = payMerchantName;
	}

	public String getPayTransactionNo( )
	{
		return StringUtils.trimToEmpty( this.payTransactionNo );
	}

	public void setPayTransactionNo( String payTransactionNo )
	{
		this.payTransactionNo = payTransactionNo;
	}

	public String getPayAmount( )
	{
		return StringUtils.trimToEmpty( this.payAmount );
	}

	public void setPayAmount( String payAmount )
	{
		this.payAmount = payAmount;
	}

	public String getPayGoodsAmount( )
	{
		return StringUtils.trimToEmpty( this.payGoodsAmount );
	}

	public void setPayGoodsAmount( String payGoodsAmount )
	{
		this.payGoodsAmount = payGoodsAmount;
	}

	public String getPayTaxAmount( )
	{
		return StringUtils.trimToEmpty( this.payTaxAmount );
	}

	public void setPayTaxAmount( String payTaxAmount )
	{
		this.payTaxAmount = payTaxAmount;
	}

	public String getPayFeeAmount( )
	{
		return StringUtils.trimToEmpty( this.payFeeAmount );
	}

	public void setPayFeeAmount( String payFeeAmount )
	{
		this.payFeeAmount = payFeeAmount;
	}

	public String getPayTimeStr( )
	{
		return StringUtils.trimToEmpty( this.payTimeStr );
	}

	public Date getPayTime( )
	{
		return DateUtil.parse( DateUtil.DEFAULT_DATE_FROMAT, this.getPayTimeStr( ) );
	}

	public void setPayTimeStr( String payTimeStr )
	{
		this.payTimeStr = payTimeStr;
	}

	public String getCurrCode( )
	{
		return StringUtils.trimToEmpty( this.currCode );
	}

	public void setCurrCode( String currCode )
	{
		this.currCode = currCode;
	}

	public String getBankName( )
	{
		return StringUtils.trimToEmpty( this.bankName );
	}

	public void setBankName( String bankName )
	{
		this.bankName = bankName;
	}

	public String getBankNo( )
	{
		return StringUtils.trimToEmpty( this.bankNo );
	}

	public void setBankNo( String bankNo )
	{
		this.bankNo = bankNo;
	}

	public String getPayAccount( )
	{
		return StringUtils.trimToEmpty( this.payAccount );
	}

	public void setPayAccount( String payAccount )
	{
		this.payAccount = payAccount;
	}

	public String getPayerName( )
	{
		return StringUtils.trimToEmpty( this.payerName );
	}

	public void setPayerName( String payerName )
	{
		this.payerName = payerName;
	}

	public String getPaperType( )
	{
		return StringUtils.trimToEmpty( this.paperType );
	}

	public void setPaperType( String paperType )
	{
		this.paperType = paperType;
	}

	public String getPaperNumber( )
	{
		return StringUtils.trimToEmpty( this.paperNumber );
	}

	public void setPaperNumber( String paperNumber )
	{
		this.paperNumber = paperNumber;
	}

	public String getPayerPhoneNumber( )
	{
		return StringUtils.trimToEmpty( this.payerPhoneNumber );
	}

	public void setPayerPhoneNumber( String payerPhoneNumber )
	{
		this.payerPhoneNumber = payerPhoneNumber;
	}

	public boolean isRedeclare( )
	{
		return this.isRedeclare;
	}

	public void setRedeclare( boolean isRedeclare )
	{
		this.isRedeclare = isRedeclare;
	}

	@Override
	public String toString( )
	{
		return "EPortDeclareRequestDto [sysTraceNo=" + sysTraceNo + ", eportOrderNo="
				+ eportOrderNo + ", eportCode=" + eportCode + ", eCompanyCode=" + eCompanyCode
				+ ", eCompanyName=" + eCompanyName + ", orderNo=" + orderNo + ", payMerchantCode="
				+ payMerchantCode + ", payMerchantName=" + payMerchantName + ", payTransactionNo="
				+ payTransactionNo + ", payAmount=" + payAmount + ", payGoodsAmount="
				+ payGoodsAmount + ", payTaxAmount=" + payTaxAmount + ", payFeeAmount="
				+ payFeeAmount + ", payTimeStr=" + payTimeStr + ", currCode=" + currCode
				+ ", bankName=" + bankName + ", bankNo=" + bankNo + ", payAccount=" + payAccount
				+ ", payerName=" + payerName + ", paperType=" + paperType + ", paperNumber="
				+ paperNumber + ", payerPhoneNumber=" + payerPhoneNumber + "]";
	}
}