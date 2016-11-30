package com.pay.eport.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EPortClearanceReponseCriteria
{
	protected String orderByClause;

	protected boolean distinct;

	protected Object record;

	protected List< Criteria > oredCriteria;

	public EPortClearanceReponseCriteria( )
	{
		oredCriteria = new ArrayList< Criteria >( );
	}

	protected EPortClearanceReponseCriteria( EPortClearanceReponseCriteria example )
	{
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
		this.distinct = example.distinct;
	}

	public void setOrderByClause( String orderByClause )
	{
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause( )
	{
		return orderByClause;
	}

	public void setDistinct( boolean distinct )
	{
		this.distinct = distinct;
	}

	public boolean isDistinct( )
	{
		return distinct;
	}

	public void setRecord( Object record )
	{
		this.record = record;
	}

	public Object getRecord( )
	{
		return record;
	}

	public List< Criteria > getOredCriteria( )
	{
		return oredCriteria;
	}

	public void or( Criteria criteria )
	{
		oredCriteria.add( criteria );
	}

	public Criteria or( )
	{
		Criteria criteria = createCriteriaInternal( );
		oredCriteria.add( criteria );
		return criteria;
	}

	public Criteria createCriteria( )
	{
		Criteria criteria = createCriteriaInternal( );
		if ( oredCriteria.size( ) == 0 )
		{
			oredCriteria.add( criteria );
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal( )
	{
		Criteria criteria = new Criteria( );
		return criteria;
	}

	public void clear( )
	{
		oredCriteria.clear( );
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria
	{
		protected List< String > criteriaWithoutValue;

		protected List< Map< String, Object >> criteriaWithSingleValue;

		protected List< Map< String, Object >> criteriaWithListValue;

		protected List< Map< String, Object >> criteriaWithBetweenValue;

		protected GeneratedCriteria( )
		{
			super( );
			criteriaWithoutValue = new ArrayList< String >( );
			criteriaWithSingleValue = new ArrayList< Map< String, Object >>( );
			criteriaWithListValue = new ArrayList< Map< String, Object >>( );
			criteriaWithBetweenValue = new ArrayList< Map< String, Object >>( );
		}

		public boolean isValid( )
		{
			return criteriaWithoutValue.size( ) > 0 || criteriaWithSingleValue.size( ) > 0
					|| criteriaWithListValue.size( ) > 0 || criteriaWithBetweenValue.size( ) > 0;
		}

		public List< String > getCriteriaWithoutValue( )
		{
			return criteriaWithoutValue;
		}

		public void setCriteriaWithoutValue( List< String > criteriaWithoutValue )
		{
			this.criteriaWithoutValue = criteriaWithoutValue;
		}

		public List< Map< String, Object >> getCriteriaWithSingleValue( )
		{
			return criteriaWithSingleValue;
		}

		public void setCriteriaWithSingleValue( List< Map< String, Object >> criteriaWithSingleValue )
		{
			this.criteriaWithSingleValue = criteriaWithSingleValue;
		}

		public List< Map< String, Object >> getCriteriaWithListValue( )
		{
			return criteriaWithListValue;
		}

		public void setCriteriaWithListValue( List< Map< String, Object >> criteriaWithListValue )
		{
			this.criteriaWithListValue = criteriaWithListValue;
		}

		public List< Map< String, Object >> getCriteriaWithBetweenValue( )
		{
			return criteriaWithBetweenValue;
		}

		public void setCriteriaWithBetweenValue(
				List< Map< String, Object >> criteriaWithBetweenValue )
		{
			this.criteriaWithBetweenValue = criteriaWithBetweenValue;
		}

		protected void addCriterion( String condition )
		{
			if ( condition == null )
			{
				throw new RuntimeException( "Value for condition cannot be null" );
			}
			criteriaWithoutValue.add( condition );
		}

		protected void addCriterion( String condition, Object value, String property )
		{
			if ( value == null )
			{
				throw new RuntimeException( "Value for " + property + " cannot be null" );
			}
			Map< String, Object > map = new HashMap< String, Object >( );
			map.put( "condition", condition );
			map.put( "value", value );
			criteriaWithSingleValue.add( map );
		}

		protected void addCriterion( String condition, List< ? extends Object > values,
				String property )
		{
			if ( values == null || values.size( ) == 0 )
			{
				throw new RuntimeException( "Value list for " + property
						+ " cannot be null or empty" );
			}
			Map< String, Object > map = new HashMap< String, Object >( );
			map.put( "condition", condition );
			map.put( "values", values );
			criteriaWithListValue.add( map );
		}

		protected void addCriterion( String condition, Object value1, Object value2, String property )
		{
			if ( value1 == null || value2 == null )
			{
				throw new RuntimeException( "Between values for " + property + " cannot be null" );
			}
			List< Object > list = new ArrayList< Object >( );
			list.add( value1 );
			list.add( value2 );
			Map< String, Object > map = new HashMap< String, Object >( );
			map.put( "condition", condition );
			map.put( "values", list );
			criteriaWithBetweenValue.add( map );
		}

		public Criteria andRecordNoIsNull( )
		{
			addCriterion( "RECORD_NO is null" );
			return ( Criteria ) this;
		}

		public Criteria andRecordNoIsNotNull( )
		{
			addCriterion( "RECORD_NO is not null" );
			return ( Criteria ) this;
		}

		public Criteria andRecordNoEqualTo( BigDecimal value )
		{
			addCriterion( "RECORD_NO =", value, "recordNo" );
			return ( Criteria ) this;
		}

		public Criteria andRecordNoNotEqualTo( BigDecimal value )
		{
			addCriterion( "RECORD_NO <>", value, "recordNo" );
			return ( Criteria ) this;
		}

		public Criteria andRecordNoGreaterThan( BigDecimal value )
		{
			addCriterion( "RECORD_NO >", value, "recordNo" );
			return ( Criteria ) this;
		}

		public Criteria andRecordNoGreaterThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "RECORD_NO >=", value, "recordNo" );
			return ( Criteria ) this;
		}

		public Criteria andRecordNoLessThan( BigDecimal value )
		{
			addCriterion( "RECORD_NO <", value, "recordNo" );
			return ( Criteria ) this;
		}

		public Criteria andRecordNoLessThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "RECORD_NO <=", value, "recordNo" );
			return ( Criteria ) this;
		}

		public Criteria andRecordNoIn( List< BigDecimal > values )
		{
			addCriterion( "RECORD_NO in", values, "recordNo" );
			return ( Criteria ) this;
		}

		public Criteria andRecordNoNotIn( List< BigDecimal > values )
		{
			addCriterion( "RECORD_NO not in", values, "recordNo" );
			return ( Criteria ) this;
		}

		public Criteria andRecordNoBetween( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "RECORD_NO between", value1, value2, "recordNo" );
			return ( Criteria ) this;
		}

		public Criteria andRecordNoNotBetween( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "RECORD_NO not between", value1, value2, "recordNo" );
			return ( Criteria ) this;
		}

		public Criteria andSysTraceNoIsNull( )
		{
			addCriterion( "SYS_TRACE_NO is null" );
			return ( Criteria ) this;
		}

		public Criteria andSysTraceNoIsNotNull( )
		{
			addCriterion( "SYS_TRACE_NO is not null" );
			return ( Criteria ) this;
		}

		public Criteria andSysTraceNoEqualTo( String value )
		{
			addCriterion( "SYS_TRACE_NO =", value, "sysTraceNo" );
			return ( Criteria ) this;
		}

		public Criteria andSysTraceNoNotEqualTo( String value )
		{
			addCriterion( "SYS_TRACE_NO <>", value, "sysTraceNo" );
			return ( Criteria ) this;
		}

		public Criteria andSysTraceNoGreaterThan( String value )
		{
			addCriterion( "SYS_TRACE_NO >", value, "sysTraceNo" );
			return ( Criteria ) this;
		}

		public Criteria andSysTraceNoGreaterThanOrEqualTo( String value )
		{
			addCriterion( "SYS_TRACE_NO >=", value, "sysTraceNo" );
			return ( Criteria ) this;
		}

		public Criteria andSysTraceNoLessThan( String value )
		{
			addCriterion( "SYS_TRACE_NO <", value, "sysTraceNo" );
			return ( Criteria ) this;
		}

		public Criteria andSysTraceNoLessThanOrEqualTo( String value )
		{
			addCriterion( "SYS_TRACE_NO <=", value, "sysTraceNo" );
			return ( Criteria ) this;
		}

		public Criteria andSysTraceNoLike( String value )
		{
			addCriterion( "SYS_TRACE_NO like", value, "sysTraceNo" );
			return ( Criteria ) this;
		}

		public Criteria andSysTraceNoNotLike( String value )
		{
			addCriterion( "SYS_TRACE_NO not like", value, "sysTraceNo" );
			return ( Criteria ) this;
		}

		public Criteria andSysTraceNoIn( List< String > values )
		{
			addCriterion( "SYS_TRACE_NO in", values, "sysTraceNo" );
			return ( Criteria ) this;
		}

		public Criteria andSysTraceNoNotIn( List< String > values )
		{
			addCriterion( "SYS_TRACE_NO not in", values, "sysTraceNo" );
			return ( Criteria ) this;
		}

		public Criteria andSysTraceNoBetween( String value1, String value2 )
		{
			addCriterion( "SYS_TRACE_NO between", value1, value2, "sysTraceNo" );
			return ( Criteria ) this;
		}

		public Criteria andSysTraceNoNotBetween( String value1, String value2 )
		{
			addCriterion( "SYS_TRACE_NO not between", value1, value2, "sysTraceNo" );
			return ( Criteria ) this;
		}

		public Criteria andEportCodeIsNull( )
		{
			addCriterion( "EPORT_CODE is null" );
			return ( Criteria ) this;
		}

		public Criteria andEportCodeIsNotNull( )
		{
			addCriterion( "EPORT_CODE is not null" );
			return ( Criteria ) this;
		}

		public Criteria andEportCodeEqualTo( String value )
		{
			addCriterion( "EPORT_CODE =", value, "eportCode" );
			return ( Criteria ) this;
		}

		public Criteria andEportCodeNotEqualTo( String value )
		{
			addCriterion( "EPORT_CODE <>", value, "eportCode" );
			return ( Criteria ) this;
		}

		public Criteria andEportCodeGreaterThan( String value )
		{
			addCriterion( "EPORT_CODE >", value, "eportCode" );
			return ( Criteria ) this;
		}

		public Criteria andEportCodeGreaterThanOrEqualTo( String value )
		{
			addCriterion( "EPORT_CODE >=", value, "eportCode" );
			return ( Criteria ) this;
		}

		public Criteria andEportCodeLessThan( String value )
		{
			addCriterion( "EPORT_CODE <", value, "eportCode" );
			return ( Criteria ) this;
		}

		public Criteria andEportCodeLessThanOrEqualTo( String value )
		{
			addCriterion( "EPORT_CODE <=", value, "eportCode" );
			return ( Criteria ) this;
		}

		public Criteria andEportCodeLike( String value )
		{
			addCriterion( "EPORT_CODE like", value, "eportCode" );
			return ( Criteria ) this;
		}

		public Criteria andEportCodeNotLike( String value )
		{
			addCriterion( "EPORT_CODE not like", value, "eportCode" );
			return ( Criteria ) this;
		}

		public Criteria andEportCodeIn( List< String > values )
		{
			addCriterion( "EPORT_CODE in", values, "eportCode" );
			return ( Criteria ) this;
		}

		public Criteria andEportCodeNotIn( List< String > values )
		{
			addCriterion( "EPORT_CODE not in", values, "eportCode" );
			return ( Criteria ) this;
		}

		public Criteria andEportCodeBetween( String value1, String value2 )
		{
			addCriterion( "EPORT_CODE between", value1, value2, "eportCode" );
			return ( Criteria ) this;
		}

		public Criteria andEportCodeNotBetween( String value1, String value2 )
		{
			addCriterion( "EPORT_CODE not between", value1, value2, "eportCode" );
			return ( Criteria ) this;
		}

		public Criteria andOrderNoIsNull( )
		{
			addCriterion( "ORDER_NO is null" );
			return ( Criteria ) this;
		}

		public Criteria andOrderNoIsNotNull( )
		{
			addCriterion( "ORDER_NO is not null" );
			return ( Criteria ) this;
		}

		public Criteria andOrderNoEqualTo( String value )
		{
			addCriterion( "ORDER_NO =", value, "orderNo" );
			return ( Criteria ) this;
		}

		public Criteria andOrderNoNotEqualTo( String value )
		{
			addCriterion( "ORDER_NO <>", value, "orderNo" );
			return ( Criteria ) this;
		}

		public Criteria andOrderNoGreaterThan( String value )
		{
			addCriterion( "ORDER_NO >", value, "orderNo" );
			return ( Criteria ) this;
		}

		public Criteria andOrderNoGreaterThanOrEqualTo( String value )
		{
			addCriterion( "ORDER_NO >=", value, "orderNo" );
			return ( Criteria ) this;
		}

		public Criteria andOrderNoLessThan( String value )
		{
			addCriterion( "ORDER_NO <", value, "orderNo" );
			return ( Criteria ) this;
		}

		public Criteria andOrderNoLessThanOrEqualTo( String value )
		{
			addCriterion( "ORDER_NO <=", value, "orderNo" );
			return ( Criteria ) this;
		}

		public Criteria andOrderNoLike( String value )
		{
			addCriterion( "ORDER_NO like", value, "orderNo" );
			return ( Criteria ) this;
		}

		public Criteria andOrderNoNotLike( String value )
		{
			addCriterion( "ORDER_NO not like", value, "orderNo" );
			return ( Criteria ) this;
		}

		public Criteria andOrderNoIn( List< String > values )
		{
			addCriterion( "ORDER_NO in", values, "orderNo" );
			return ( Criteria ) this;
		}

		public Criteria andOrderNoNotIn( List< String > values )
		{
			addCriterion( "ORDER_NO not in", values, "orderNo" );
			return ( Criteria ) this;
		}

		public Criteria andOrderNoBetween( String value1, String value2 )
		{
			addCriterion( "ORDER_NO between", value1, value2, "orderNo" );
			return ( Criteria ) this;
		}

		public Criteria andOrderNoNotBetween( String value1, String value2 )
		{
			addCriterion( "ORDER_NO not between", value1, value2, "orderNo" );
			return ( Criteria ) this;
		}

		public Criteria andBusinessNoIsNull( )
		{
			addCriterion( "BUSINESS_NO is null" );
			return ( Criteria ) this;
		}

		public Criteria andBusinessNoIsNotNull( )
		{
			addCriterion( "BUSINESS_NO is not null" );
			return ( Criteria ) this;
		}

		public Criteria andBusinessNoEqualTo( String value )
		{
			addCriterion( "BUSINESS_NO =", value, "businessNo" );
			return ( Criteria ) this;
		}

		public Criteria andBusinessNoNotEqualTo( String value )
		{
			addCriterion( "BUSINESS_NO <>", value, "businessNo" );
			return ( Criteria ) this;
		}

		public Criteria andBusinessNoGreaterThan( String value )
		{
			addCriterion( "BUSINESS_NO >", value, "businessNo" );
			return ( Criteria ) this;
		}

		public Criteria andBusinessNoGreaterThanOrEqualTo( String value )
		{
			addCriterion( "BUSINESS_NO >=", value, "businessNo" );
			return ( Criteria ) this;
		}

		public Criteria andBusinessNoLessThan( String value )
		{
			addCriterion( "BUSINESS_NO <", value, "businessNo" );
			return ( Criteria ) this;
		}

		public Criteria andBusinessNoLessThanOrEqualTo( String value )
		{
			addCriterion( "BUSINESS_NO <=", value, "businessNo" );
			return ( Criteria ) this;
		}

		public Criteria andBusinessNoLike( String value )
		{
			addCriterion( "BUSINESS_NO like", value, "businessNo" );
			return ( Criteria ) this;
		}

		public Criteria andBusinessNoNotLike( String value )
		{
			addCriterion( "BUSINESS_NO not like", value, "businessNo" );
			return ( Criteria ) this;
		}

		public Criteria andBusinessNoIn( List< String > values )
		{
			addCriterion( "BUSINESS_NO in", values, "businessNo" );
			return ( Criteria ) this;
		}

		public Criteria andBusinessNoNotIn( List< String > values )
		{
			addCriterion( "BUSINESS_NO not in", values, "businessNo" );
			return ( Criteria ) this;
		}

		public Criteria andBusinessNoBetween( String value1, String value2 )
		{
			addCriterion( "BUSINESS_NO between", value1, value2, "businessNo" );
			return ( Criteria ) this;
		}

		public Criteria andBusinessNoNotBetween( String value1, String value2 )
		{
			addCriterion( "BUSINESS_NO not between", value1, value2, "businessNo" );
			return ( Criteria ) this;
		}

		public Criteria andChkMarkIsNull( )
		{
			addCriterion( "CHK_MARK is null" );
			return ( Criteria ) this;
		}

		public Criteria andChkMarkIsNotNull( )
		{
			addCriterion( "CHK_MARK is not null" );
			return ( Criteria ) this;
		}

		public Criteria andChkMarkEqualTo( String value )
		{
			addCriterion( "CHK_MARK =", value, "chkMark" );
			return ( Criteria ) this;
		}

		public Criteria andChkMarkNotEqualTo( String value )
		{
			addCriterion( "CHK_MARK <>", value, "chkMark" );
			return ( Criteria ) this;
		}

		public Criteria andChkMarkGreaterThan( String value )
		{
			addCriterion( "CHK_MARK >", value, "chkMark" );
			return ( Criteria ) this;
		}

		public Criteria andChkMarkGreaterThanOrEqualTo( String value )
		{
			addCriterion( "CHK_MARK >=", value, "chkMark" );
			return ( Criteria ) this;
		}

		public Criteria andChkMarkLessThan( String value )
		{
			addCriterion( "CHK_MARK <", value, "chkMark" );
			return ( Criteria ) this;
		}

		public Criteria andChkMarkLessThanOrEqualTo( String value )
		{
			addCriterion( "CHK_MARK <=", value, "chkMark" );
			return ( Criteria ) this;
		}

		public Criteria andChkMarkLike( String value )
		{
			addCriterion( "CHK_MARK like", value, "chkMark" );
			return ( Criteria ) this;
		}

		public Criteria andChkMarkNotLike( String value )
		{
			addCriterion( "CHK_MARK not like", value, "chkMark" );
			return ( Criteria ) this;
		}

		public Criteria andChkMarkIn( List< String > values )
		{
			addCriterion( "CHK_MARK in", values, "chkMark" );
			return ( Criteria ) this;
		}

		public Criteria andChkMarkNotIn( List< String > values )
		{
			addCriterion( "CHK_MARK not in", values, "chkMark" );
			return ( Criteria ) this;
		}

		public Criteria andChkMarkBetween( String value1, String value2 )
		{
			addCriterion( "CHK_MARK between", value1, value2, "chkMark" );
			return ( Criteria ) this;
		}

		public Criteria andChkMarkNotBetween( String value1, String value2 )
		{
			addCriterion( "CHK_MARK not between", value1, value2, "chkMark" );
			return ( Criteria ) this;
		}

		public Criteria andCreateDateIsNull( )
		{
			addCriterion( "CREATE_DATE is null" );
			return ( Criteria ) this;
		}

		public Criteria andCreateDateIsNotNull( )
		{
			addCriterion( "CREATE_DATE is not null" );
			return ( Criteria ) this;
		}

		public Criteria andCreateDateEqualTo( Date value )
		{
			addCriterion( "CREATE_DATE =", value, "createDate" );
			return ( Criteria ) this;
		}

		public Criteria andCreateDateNotEqualTo( Date value )
		{
			addCriterion( "CREATE_DATE <>", value, "createDate" );
			return ( Criteria ) this;
		}

		public Criteria andCreateDateGreaterThan( Date value )
		{
			addCriterion( "CREATE_DATE >", value, "createDate" );
			return ( Criteria ) this;
		}

		public Criteria andCreateDateGreaterThanOrEqualTo( Date value )
		{
			addCriterion( "CREATE_DATE >=", value, "createDate" );
			return ( Criteria ) this;
		}

		public Criteria andCreateDateLessThan( Date value )
		{
			addCriterion( "CREATE_DATE <", value, "createDate" );
			return ( Criteria ) this;
		}

		public Criteria andCreateDateLessThanOrEqualTo( Date value )
		{
			addCriterion( "CREATE_DATE <=", value, "createDate" );
			return ( Criteria ) this;
		}

		public Criteria andCreateDateIn( List< Date > values )
		{
			addCriterion( "CREATE_DATE in", values, "createDate" );
			return ( Criteria ) this;
		}

		public Criteria andCreateDateNotIn( List< Date > values )
		{
			addCriterion( "CREATE_DATE not in", values, "createDate" );
			return ( Criteria ) this;
		}

		public Criteria andCreateDateBetween( Date value1, Date value2 )
		{
			addCriterion( "CREATE_DATE between", value1, value2, "createDate" );
			return ( Criteria ) this;
		}

		public Criteria andCreateDateNotBetween( Date value1, Date value2 )
		{
			addCriterion( "CREATE_DATE not between", value1, value2, "createDate" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld1IsNull( )
		{
			addCriterion( "RESV_FLD1 is null" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld1IsNotNull( )
		{
			addCriterion( "RESV_FLD1 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld1EqualTo( String value )
		{
			addCriterion( "RESV_FLD1 =", value, "resvFld1" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld1NotEqualTo( String value )
		{
			addCriterion( "RESV_FLD1 <>", value, "resvFld1" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld1GreaterThan( String value )
		{
			addCriterion( "RESV_FLD1 >", value, "resvFld1" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld1GreaterThanOrEqualTo( String value )
		{
			addCriterion( "RESV_FLD1 >=", value, "resvFld1" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld1LessThan( String value )
		{
			addCriterion( "RESV_FLD1 <", value, "resvFld1" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld1LessThanOrEqualTo( String value )
		{
			addCriterion( "RESV_FLD1 <=", value, "resvFld1" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld1Like( String value )
		{
			addCriterion( "RESV_FLD1 like", value, "resvFld1" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld1NotLike( String value )
		{
			addCriterion( "RESV_FLD1 not like", value, "resvFld1" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld1In( List< String > values )
		{
			addCriterion( "RESV_FLD1 in", values, "resvFld1" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld1NotIn( List< String > values )
		{
			addCriterion( "RESV_FLD1 not in", values, "resvFld1" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld1Between( String value1, String value2 )
		{
			addCriterion( "RESV_FLD1 between", value1, value2, "resvFld1" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld1NotBetween( String value1, String value2 )
		{
			addCriterion( "RESV_FLD1 not between", value1, value2, "resvFld1" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld2IsNull( )
		{
			addCriterion( "RESV_FLD2 is null" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld2IsNotNull( )
		{
			addCriterion( "RESV_FLD2 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld2EqualTo( String value )
		{
			addCriterion( "RESV_FLD2 =", value, "resvFld2" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld2NotEqualTo( String value )
		{
			addCriterion( "RESV_FLD2 <>", value, "resvFld2" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld2GreaterThan( String value )
		{
			addCriterion( "RESV_FLD2 >", value, "resvFld2" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld2GreaterThanOrEqualTo( String value )
		{
			addCriterion( "RESV_FLD2 >=", value, "resvFld2" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld2LessThan( String value )
		{
			addCriterion( "RESV_FLD2 <", value, "resvFld2" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld2LessThanOrEqualTo( String value )
		{
			addCriterion( "RESV_FLD2 <=", value, "resvFld2" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld2Like( String value )
		{
			addCriterion( "RESV_FLD2 like", value, "resvFld2" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld2NotLike( String value )
		{
			addCriterion( "RESV_FLD2 not like", value, "resvFld2" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld2In( List< String > values )
		{
			addCriterion( "RESV_FLD2 in", values, "resvFld2" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld2NotIn( List< String > values )
		{
			addCriterion( "RESV_FLD2 not in", values, "resvFld2" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld2Between( String value1, String value2 )
		{
			addCriterion( "RESV_FLD2 between", value1, value2, "resvFld2" );
			return ( Criteria ) this;
		}

		public Criteria andResvFld2NotBetween( String value1, String value2 )
		{
			addCriterion( "RESV_FLD2 not between", value1, value2, "resvFld2" );
			return ( Criteria ) this;
		}
	}

	public static class Criteria extends GeneratedCriteria
	{

		protected Criteria( )
		{
			super( );
		}
	}
}