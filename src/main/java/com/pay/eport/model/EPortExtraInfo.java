package com.pay.eport.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 【电子口岸】报关拓展信息
 */
public class EPortExtraInfo implements Serializable
{
	/**
	 * 记录编号
	 */
	private BigDecimal recordNo;

	/**
	 * 报关订单号
	 */
	private BigDecimal eportOrderNo;

	/**
	 * 拓展字符字段1。西安-支付企业名称
	 */
	private String extraCharInfo1;

	/**
	 * 拓展字符字段2。西安-支付类型
	 */
	private String extraCharInfo2;

	/**
	 * 拓展字符字段3。西安-操作类型（1-新增、2-修改、3-删除）
	 */
	private String extraCharInfo3;

	/**
	 * 拓展字符字段4。西安-备注
	 */
	private String extraCharInfo4;

	/**
	 * 拓展字符字段5。西安-接入类型（1-总署、2-地方）
	 */
	private String extraCharInfo5;

	/**
	 * 拓展字符字段6。西安-业务状态（1-暂存、2-申报）
	 */
	private String extraCharInfo6;

	/**
	 * 拓展字符字段7。西安-业务状态（1-暂存、2-申报）
	 */
	private String extraCharInfo7;

	/**
	 * 拓展字符字段8
	 */
	private String extraCharInfo8;

	/**
	 * 拓展字符字段9
	 */
	private String extraCharInfo9;

	/**
	 * 拓展字符字段10
	 */
	private String extraCharInfo10;

	/**
	 * 拓展数字字段1
	 */
	private BigDecimal extraNumInfo1;

	/**
	 * 拓展数字字段2
	 */
	private BigDecimal extraNumInfo2;

	/**
	 * 拓展数字字段3
	 */
	private BigDecimal extraNumInfo3;

	/**
	 * 拓展数字字段4
	 */
	private BigDecimal extraNumInfo4;

	/**
	 * 拓展数字字段5
	 */
	private BigDecimal extraNumInfo5;

	/**
	 * 拓展数字字段6
	 */
	private BigDecimal extraNumInfo6;

	/**
	 * 拓展数字字段7
	 */
	private BigDecimal extraNumInfo7;

	/**
	 * 拓展数字字段8
	 */
	private BigDecimal extraNumInfo8;

	/**
	 * 拓展数字字段9
	 */
	private BigDecimal extraNumInfo9;

	/**
	 * 拓展数字字段10
	 */
	private BigDecimal extraNumInfo10;

	/**
	 * 创建时间
	 */
	private Date createDate;

	/**
	 * 修改时间
	 */
	private Date updateDate;

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
	 * <b>获取</b> 报关订单号
	 */
	public BigDecimal getEportOrderNo( )
	{
		return eportOrderNo;
	}

	/**
	 * <b>设置</b> 报关订单号
	 */
	public void setEportOrderNo( BigDecimal eportOrderNo )
	{
		this.eportOrderNo = eportOrderNo;
	}

	/**
	 * <b>获取</b> 拓展字符字段1。西安-支付企业名称
	 */
	public String getExtraCharInfo1( )
	{
		return extraCharInfo1;
	}

	/**
	 * <b>设置</b> 拓展字符字段1。西安-支付企业名称
	 */
	public void setExtraCharInfo1( String extraCharInfo1 )
	{
		this.extraCharInfo1 = extraCharInfo1;
	}

	/**
	 * <b>获取</b> 拓展字符字段2。西安-支付类型
	 */
	public String getExtraCharInfo2( )
	{
		return extraCharInfo2;
	}

	/**
	 * <b>设置</b> 拓展字符字段2。西安-支付类型
	 */
	public void setExtraCharInfo2( String extraCharInfo2 )
	{
		this.extraCharInfo2 = extraCharInfo2;
	}

	/**
	 * <b>获取</b> 拓展字符字段3。西安-操作类型（1-新增、2-修改、3-删除）
	 */
	public String getExtraCharInfo3( )
	{
		return extraCharInfo3;
	}

	/**
	 * <b>设置</b> 拓展字符字段3。西安-操作类型（1-新增、2-修改、3-删除）
	 */
	public void setExtraCharInfo3( String extraCharInfo3 )
	{
		this.extraCharInfo3 = extraCharInfo3;
	}

	/**
	 * <b>获取</b> 拓展字符字段4。西安-备注
	 */
	public String getExtraCharInfo4( )
	{
		return extraCharInfo4;
	}

	/**
	 * <b>设置</b> 拓展字符字段4。西安-备注
	 */
	public void setExtraCharInfo4( String extraCharInfo4 )
	{
		this.extraCharInfo4 = extraCharInfo4;
	}

	/**
	 * <b>获取</b> 拓展字符字段5。西安-接入类型（1-总署、2-地方）
	 */
	public String getExtraCharInfo5( )
	{
		return extraCharInfo5;
	}

	/**
	 * <b>设置</b> 拓展字符字段5。西安-接入类型（1-总署、2-地方）
	 */
	public void setExtraCharInfo5( String extraCharInfo5 )
	{
		this.extraCharInfo5 = extraCharInfo5;
	}

	/**
	 * <b>获取</b> 拓展字符字段6。西安-业务状态（1-暂存、2-申报）
	 */
	public String getExtraCharInfo6( )
	{
		return extraCharInfo6;
	}

	/**
	 * <b>设置</b> 拓展字符字段6。西安-业务状态（1-暂存、2-申报）
	 */
	public void setExtraCharInfo6( String extraCharInfo6 )
	{
		this.extraCharInfo6 = extraCharInfo6;
	}

	/**
	 * <b>获取</b> 拓展字符字段7。西安-业务状态（1-暂存、2-申报）
	 */
	public String getExtraCharInfo7( )
	{
		return extraCharInfo7;
	}

	/**
	 * <b>设置</b> 拓展字符字段7。西安-业务状态（1-暂存、2-申报）
	 */
	public void setExtraCharInfo7( String extraCharInfo7 )
	{
		this.extraCharInfo7 = extraCharInfo7;
	}

	/**
	 * <b>获取</b> 拓展字符字段8
	 */
	public String getExtraCharInfo8( )
	{
		return extraCharInfo8;
	}

	/**
	 * <b>设置</b> 拓展字符字段8
	 */
	public void setExtraCharInfo8( String extraCharInfo8 )
	{
		this.extraCharInfo8 = extraCharInfo8;
	}

	/**
	 * <b>获取</b> 拓展字符字段9
	 */
	public String getExtraCharInfo9( )
	{
		return extraCharInfo9;
	}

	/**
	 * <b>设置</b> 拓展字符字段9
	 */
	public void setExtraCharInfo9( String extraCharInfo9 )
	{
		this.extraCharInfo9 = extraCharInfo9;
	}

	/**
	 * <b>获取</b> 拓展字符字段10
	 */
	public String getExtraCharInfo10( )
	{
		return extraCharInfo10;
	}

	/**
	 * <b>设置</b> 拓展字符字段10
	 */
	public void setExtraCharInfo10( String extraCharInfo10 )
	{
		this.extraCharInfo10 = extraCharInfo10;
	}

	/**
	 * <b>获取</b> 拓展数字字段1
	 */
	public BigDecimal getExtraNumInfo1( )
	{
		return extraNumInfo1;
	}

	/**
	 * <b>设置</b> 拓展数字字段1
	 */
	public void setExtraNumInfo1( BigDecimal extraNumInfo1 )
	{
		this.extraNumInfo1 = extraNumInfo1;
	}

	/**
	 * <b>获取</b> 拓展数字字段2
	 */
	public BigDecimal getExtraNumInfo2( )
	{
		return extraNumInfo2;
	}

	/**
	 * <b>设置</b> 拓展数字字段2
	 */
	public void setExtraNumInfo2( BigDecimal extraNumInfo2 )
	{
		this.extraNumInfo2 = extraNumInfo2;
	}

	/**
	 * <b>获取</b> 拓展数字字段3
	 */
	public BigDecimal getExtraNumInfo3( )
	{
		return extraNumInfo3;
	}

	/**
	 * <b>设置</b> 拓展数字字段3
	 */
	public void setExtraNumInfo3( BigDecimal extraNumInfo3 )
	{
		this.extraNumInfo3 = extraNumInfo3;
	}

	/**
	 * <b>获取</b> 拓展数字字段4
	 */
	public BigDecimal getExtraNumInfo4( )
	{
		return extraNumInfo4;
	}

	/**
	 * <b>设置</b> 拓展数字字段4
	 */
	public void setExtraNumInfo4( BigDecimal extraNumInfo4 )
	{
		this.extraNumInfo4 = extraNumInfo4;
	}

	/**
	 * <b>获取</b> 拓展数字字段5
	 */
	public BigDecimal getExtraNumInfo5( )
	{
		return extraNumInfo5;
	}

	/**
	 * <b>设置</b> 拓展数字字段5
	 */
	public void setExtraNumInfo5( BigDecimal extraNumInfo5 )
	{
		this.extraNumInfo5 = extraNumInfo5;
	}

	/**
	 * <b>获取</b> 拓展数字字段6
	 */
	public BigDecimal getExtraNumInfo6( )
	{
		return extraNumInfo6;
	}

	/**
	 * <b>设置</b> 拓展数字字段6
	 */
	public void setExtraNumInfo6( BigDecimal extraNumInfo6 )
	{
		this.extraNumInfo6 = extraNumInfo6;
	}

	/**
	 * <b>获取</b> 拓展数字字段7
	 */
	public BigDecimal getExtraNumInfo7( )
	{
		return extraNumInfo7;
	}

	/**
	 * <b>设置</b> 拓展数字字段7
	 */
	public void setExtraNumInfo7( BigDecimal extraNumInfo7 )
	{
		this.extraNumInfo7 = extraNumInfo7;
	}

	/**
	 * <b>获取</b> 拓展数字字段8
	 */
	public BigDecimal getExtraNumInfo8( )
	{
		return extraNumInfo8;
	}

	/**
	 * <b>设置</b> 拓展数字字段8
	 */
	public void setExtraNumInfo8( BigDecimal extraNumInfo8 )
	{
		this.extraNumInfo8 = extraNumInfo8;
	}

	/**
	 * <b>获取</b> 拓展数字字段9
	 */
	public BigDecimal getExtraNumInfo9( )
	{
		return extraNumInfo9;
	}

	/**
	 * <b>设置</b> 拓展数字字段9
	 */
	public void setExtraNumInfo9( BigDecimal extraNumInfo9 )
	{
		this.extraNumInfo9 = extraNumInfo9;
	}

	/**
	 * <b>获取</b> 拓展数字字段10
	 */
	public BigDecimal getExtraNumInfo10( )
	{
		return extraNumInfo10;
	}

	/**
	 * <b>设置</b> 拓展数字字段10
	 */
	public void setExtraNumInfo10( BigDecimal extraNumInfo10 )
	{
		this.extraNumInfo10 = extraNumInfo10;
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
	 * <b>获取</b> 修改时间
	 */
	public Date getUpdateDate( )
	{
		return updateDate;
	}

	/**
	 * <b>设置</b> 修改时间
	 */
	public void setUpdateDate( Date updateDate )
	{
		this.updateDate = updateDate;
	}

	@Override
	public String toString( )
	{
		return "EPortExtraInfo [recordNo=" + recordNo + ", eportOrderNo=" + eportOrderNo
				+ ", extraCharInfo1=" + extraCharInfo1 + ", extraCharInfo2=" + extraCharInfo2
				+ ", extraCharInfo3=" + extraCharInfo3 + ", extraCharInfo4=" + extraCharInfo4
				+ ", extraCharInfo5=" + extraCharInfo5 + ", extraCharInfo6=" + extraCharInfo6
				+ ", extraCharInfo7=" + extraCharInfo7 + ", extraCharInfo8=" + extraCharInfo8
				+ ", extraCharInfo9=" + extraCharInfo9 + ", extraCharInfo10=" + extraCharInfo10
				+ ", extraNumInfo1=" + extraNumInfo1 + ", extraNumInfo2=" + extraNumInfo2
				+ ", extraNumInfo3=" + extraNumInfo3 + ", extraNumInfo4=" + extraNumInfo4
				+ ", extraNumInfo5=" + extraNumInfo5 + ", extraNumInfo6=" + extraNumInfo6
				+ ", extraNumInfo7=" + extraNumInfo7 + ", extraNumInfo8=" + extraNumInfo8
				+ ", extraNumInfo9=" + extraNumInfo9 + ", extraNumInfo10=" + extraNumInfo10
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}
}