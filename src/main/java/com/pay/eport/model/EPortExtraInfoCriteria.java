package com.pay.eport.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EPortExtraInfoCriteria
{
	protected String orderByClause;

	protected boolean distinct;

	protected Object record;

	protected List< Criteria > oredCriteria;

	public EPortExtraInfoCriteria( )
	{
		oredCriteria = new ArrayList< Criteria >( );
	}

	protected EPortExtraInfoCriteria( EPortExtraInfoCriteria example )
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

		public Criteria andEportOrderNoIsNull( )
		{
			addCriterion( "EPORT_ORDER_NO is null" );
			return ( Criteria ) this;
		}

		public Criteria andEportOrderNoIsNotNull( )
		{
			addCriterion( "EPORT_ORDER_NO is not null" );
			return ( Criteria ) this;
		}

		public Criteria andEportOrderNoEqualTo( BigDecimal value )
		{
			addCriterion( "EPORT_ORDER_NO =", value, "eportOrderNo" );
			return ( Criteria ) this;
		}

		public Criteria andEportOrderNoNotEqualTo( BigDecimal value )
		{
			addCriterion( "EPORT_ORDER_NO <>", value, "eportOrderNo" );
			return ( Criteria ) this;
		}

		public Criteria andEportOrderNoGreaterThan( BigDecimal value )
		{
			addCriterion( "EPORT_ORDER_NO >", value, "eportOrderNo" );
			return ( Criteria ) this;
		}

		public Criteria andEportOrderNoGreaterThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EPORT_ORDER_NO >=", value, "eportOrderNo" );
			return ( Criteria ) this;
		}

		public Criteria andEportOrderNoLessThan( BigDecimal value )
		{
			addCriterion( "EPORT_ORDER_NO <", value, "eportOrderNo" );
			return ( Criteria ) this;
		}

		public Criteria andEportOrderNoLessThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EPORT_ORDER_NO <=", value, "eportOrderNo" );
			return ( Criteria ) this;
		}

		public Criteria andEportOrderNoIn( List< BigDecimal > values )
		{
			addCriterion( "EPORT_ORDER_NO in", values, "eportOrderNo" );
			return ( Criteria ) this;
		}

		public Criteria andEportOrderNoNotIn( List< BigDecimal > values )
		{
			addCriterion( "EPORT_ORDER_NO not in", values, "eportOrderNo" );
			return ( Criteria ) this;
		}

		public Criteria andEportOrderNoBetween( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EPORT_ORDER_NO between", value1, value2, "eportOrderNo" );
			return ( Criteria ) this;
		}

		public Criteria andEportOrderNoNotBetween( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EPORT_ORDER_NO not between", value1, value2, "eportOrderNo" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo1IsNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_1 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo1IsNotNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_1 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo1EqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_1 =", value, "extraCharInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo1NotEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_1 <>", value, "extraCharInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo1GreaterThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_1 >", value, "extraCharInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo1GreaterThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_1 >=", value, "extraCharInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo1LessThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_1 <", value, "extraCharInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo1LessThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_1 <=", value, "extraCharInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo1Like( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_1 like", value, "extraCharInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo1NotLike( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_1 not like", value, "extraCharInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo1In( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_1 in", values, "extraCharInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo1NotIn( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_1 not in", values, "extraCharInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo1Between( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_1 between", value1, value2, "extraCharInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo1NotBetween( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_1 not between", value1, value2, "extraCharInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo2IsNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_2 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo2IsNotNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_2 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo2EqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_2 =", value, "extraCharInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo2NotEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_2 <>", value, "extraCharInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo2GreaterThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_2 >", value, "extraCharInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo2GreaterThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_2 >=", value, "extraCharInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo2LessThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_2 <", value, "extraCharInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo2LessThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_2 <=", value, "extraCharInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo2Like( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_2 like", value, "extraCharInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo2NotLike( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_2 not like", value, "extraCharInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo2In( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_2 in", values, "extraCharInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo2NotIn( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_2 not in", values, "extraCharInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo2Between( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_2 between", value1, value2, "extraCharInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo2NotBetween( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_2 not between", value1, value2, "extraCharInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo3IsNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_3 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo3IsNotNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_3 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo3EqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_3 =", value, "extraCharInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo3NotEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_3 <>", value, "extraCharInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo3GreaterThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_3 >", value, "extraCharInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo3GreaterThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_3 >=", value, "extraCharInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo3LessThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_3 <", value, "extraCharInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo3LessThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_3 <=", value, "extraCharInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo3Like( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_3 like", value, "extraCharInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo3NotLike( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_3 not like", value, "extraCharInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo3In( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_3 in", values, "extraCharInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo3NotIn( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_3 not in", values, "extraCharInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo3Between( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_3 between", value1, value2, "extraCharInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo3NotBetween( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_3 not between", value1, value2, "extraCharInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo4IsNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_4 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo4IsNotNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_4 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo4EqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_4 =", value, "extraCharInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo4NotEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_4 <>", value, "extraCharInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo4GreaterThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_4 >", value, "extraCharInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo4GreaterThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_4 >=", value, "extraCharInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo4LessThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_4 <", value, "extraCharInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo4LessThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_4 <=", value, "extraCharInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo4Like( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_4 like", value, "extraCharInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo4NotLike( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_4 not like", value, "extraCharInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo4In( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_4 in", values, "extraCharInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo4NotIn( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_4 not in", values, "extraCharInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo4Between( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_4 between", value1, value2, "extraCharInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo4NotBetween( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_4 not between", value1, value2, "extraCharInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo5IsNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_5 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo5IsNotNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_5 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo5EqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_5 =", value, "extraCharInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo5NotEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_5 <>", value, "extraCharInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo5GreaterThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_5 >", value, "extraCharInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo5GreaterThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_5 >=", value, "extraCharInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo5LessThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_5 <", value, "extraCharInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo5LessThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_5 <=", value, "extraCharInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo5Like( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_5 like", value, "extraCharInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo5NotLike( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_5 not like", value, "extraCharInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo5In( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_5 in", values, "extraCharInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo5NotIn( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_5 not in", values, "extraCharInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo5Between( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_5 between", value1, value2, "extraCharInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo5NotBetween( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_5 not between", value1, value2, "extraCharInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo6IsNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_6 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo6IsNotNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_6 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo6EqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_6 =", value, "extraCharInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo6NotEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_6 <>", value, "extraCharInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo6GreaterThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_6 >", value, "extraCharInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo6GreaterThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_6 >=", value, "extraCharInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo6LessThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_6 <", value, "extraCharInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo6LessThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_6 <=", value, "extraCharInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo6Like( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_6 like", value, "extraCharInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo6NotLike( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_6 not like", value, "extraCharInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo6In( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_6 in", values, "extraCharInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo6NotIn( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_6 not in", values, "extraCharInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo6Between( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_6 between", value1, value2, "extraCharInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo6NotBetween( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_6 not between", value1, value2, "extraCharInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo7IsNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_7 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo7IsNotNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_7 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo7EqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_7 =", value, "extraCharInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo7NotEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_7 <>", value, "extraCharInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo7GreaterThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_7 >", value, "extraCharInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo7GreaterThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_7 >=", value, "extraCharInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo7LessThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_7 <", value, "extraCharInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo7LessThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_7 <=", value, "extraCharInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo7Like( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_7 like", value, "extraCharInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo7NotLike( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_7 not like", value, "extraCharInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo7In( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_7 in", values, "extraCharInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo7NotIn( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_7 not in", values, "extraCharInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo7Between( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_7 between", value1, value2, "extraCharInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo7NotBetween( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_7 not between", value1, value2, "extraCharInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo8IsNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_8 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo8IsNotNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_8 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo8EqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_8 =", value, "extraCharInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo8NotEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_8 <>", value, "extraCharInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo8GreaterThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_8 >", value, "extraCharInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo8GreaterThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_8 >=", value, "extraCharInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo8LessThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_8 <", value, "extraCharInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo8LessThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_8 <=", value, "extraCharInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo8Like( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_8 like", value, "extraCharInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo8NotLike( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_8 not like", value, "extraCharInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo8In( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_8 in", values, "extraCharInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo8NotIn( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_8 not in", values, "extraCharInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo8Between( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_8 between", value1, value2, "extraCharInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo8NotBetween( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_8 not between", value1, value2, "extraCharInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo9IsNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_9 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo9IsNotNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_9 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo9EqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_9 =", value, "extraCharInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo9NotEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_9 <>", value, "extraCharInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo9GreaterThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_9 >", value, "extraCharInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo9GreaterThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_9 >=", value, "extraCharInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo9LessThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_9 <", value, "extraCharInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo9LessThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_9 <=", value, "extraCharInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo9Like( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_9 like", value, "extraCharInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo9NotLike( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_9 not like", value, "extraCharInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo9In( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_9 in", values, "extraCharInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo9NotIn( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_9 not in", values, "extraCharInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo9Between( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_9 between", value1, value2, "extraCharInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo9NotBetween( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_9 not between", value1, value2, "extraCharInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo10IsNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_10 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo10IsNotNull( )
		{
			addCriterion( "EXTRA_CHAR_INFO_10 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo10EqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_10 =", value, "extraCharInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo10NotEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_10 <>", value, "extraCharInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo10GreaterThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_10 >", value, "extraCharInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo10GreaterThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_10 >=", value, "extraCharInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo10LessThan( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_10 <", value, "extraCharInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo10LessThanOrEqualTo( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_10 <=", value, "extraCharInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo10Like( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_10 like", value, "extraCharInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo10NotLike( String value )
		{
			addCriterion( "EXTRA_CHAR_INFO_10 not like", value, "extraCharInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo10In( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_10 in", values, "extraCharInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo10NotIn( List< String > values )
		{
			addCriterion( "EXTRA_CHAR_INFO_10 not in", values, "extraCharInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo10Between( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_10 between", value1, value2, "extraCharInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraCharInfo10NotBetween( String value1, String value2 )
		{
			addCriterion( "EXTRA_CHAR_INFO_10 not between", value1, value2, "extraCharInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo1IsNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_1 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo1IsNotNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_1 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo1EqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_1 =", value, "extraNumInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo1NotEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_1 <>", value, "extraNumInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo1GreaterThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_1 >", value, "extraNumInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo1GreaterThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_1 >=", value, "extraNumInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo1LessThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_1 <", value, "extraNumInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo1LessThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_1 <=", value, "extraNumInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo1In( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_1 in", values, "extraNumInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo1NotIn( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_1 not in", values, "extraNumInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo1Between( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_1 between", value1, value2, "extraNumInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo1NotBetween( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_1 not between", value1, value2, "extraNumInfo1" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo2IsNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_2 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo2IsNotNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_2 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo2EqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_2 =", value, "extraNumInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo2NotEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_2 <>", value, "extraNumInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo2GreaterThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_2 >", value, "extraNumInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo2GreaterThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_2 >=", value, "extraNumInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo2LessThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_2 <", value, "extraNumInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo2LessThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_2 <=", value, "extraNumInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo2In( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_2 in", values, "extraNumInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo2NotIn( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_2 not in", values, "extraNumInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo2Between( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_2 between", value1, value2, "extraNumInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo2NotBetween( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_2 not between", value1, value2, "extraNumInfo2" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo3IsNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_3 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo3IsNotNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_3 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo3EqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_3 =", value, "extraNumInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo3NotEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_3 <>", value, "extraNumInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo3GreaterThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_3 >", value, "extraNumInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo3GreaterThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_3 >=", value, "extraNumInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo3LessThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_3 <", value, "extraNumInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo3LessThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_3 <=", value, "extraNumInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo3In( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_3 in", values, "extraNumInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo3NotIn( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_3 not in", values, "extraNumInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo3Between( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_3 between", value1, value2, "extraNumInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo3NotBetween( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_3 not between", value1, value2, "extraNumInfo3" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo4IsNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_4 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo4IsNotNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_4 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo4EqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_4 =", value, "extraNumInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo4NotEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_4 <>", value, "extraNumInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo4GreaterThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_4 >", value, "extraNumInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo4GreaterThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_4 >=", value, "extraNumInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo4LessThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_4 <", value, "extraNumInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo4LessThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_4 <=", value, "extraNumInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo4In( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_4 in", values, "extraNumInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo4NotIn( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_4 not in", values, "extraNumInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo4Between( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_4 between", value1, value2, "extraNumInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo4NotBetween( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_4 not between", value1, value2, "extraNumInfo4" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo5IsNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_5 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo5IsNotNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_5 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo5EqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_5 =", value, "extraNumInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo5NotEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_5 <>", value, "extraNumInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo5GreaterThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_5 >", value, "extraNumInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo5GreaterThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_5 >=", value, "extraNumInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo5LessThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_5 <", value, "extraNumInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo5LessThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_5 <=", value, "extraNumInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo5In( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_5 in", values, "extraNumInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo5NotIn( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_5 not in", values, "extraNumInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo5Between( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_5 between", value1, value2, "extraNumInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo5NotBetween( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_5 not between", value1, value2, "extraNumInfo5" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo6IsNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_6 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo6IsNotNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_6 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo6EqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_6 =", value, "extraNumInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo6NotEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_6 <>", value, "extraNumInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo6GreaterThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_6 >", value, "extraNumInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo6GreaterThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_6 >=", value, "extraNumInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo6LessThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_6 <", value, "extraNumInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo6LessThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_6 <=", value, "extraNumInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo6In( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_6 in", values, "extraNumInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo6NotIn( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_6 not in", values, "extraNumInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo6Between( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_6 between", value1, value2, "extraNumInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo6NotBetween( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_6 not between", value1, value2, "extraNumInfo6" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo7IsNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_7 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo7IsNotNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_7 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo7EqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_7 =", value, "extraNumInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo7NotEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_7 <>", value, "extraNumInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo7GreaterThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_7 >", value, "extraNumInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo7GreaterThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_7 >=", value, "extraNumInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo7LessThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_7 <", value, "extraNumInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo7LessThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_7 <=", value, "extraNumInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo7In( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_7 in", values, "extraNumInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo7NotIn( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_7 not in", values, "extraNumInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo7Between( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_7 between", value1, value2, "extraNumInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo7NotBetween( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_7 not between", value1, value2, "extraNumInfo7" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo8IsNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_8 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo8IsNotNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_8 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo8EqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_8 =", value, "extraNumInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo8NotEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_8 <>", value, "extraNumInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo8GreaterThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_8 >", value, "extraNumInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo8GreaterThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_8 >=", value, "extraNumInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo8LessThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_8 <", value, "extraNumInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo8LessThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_8 <=", value, "extraNumInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo8In( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_8 in", values, "extraNumInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo8NotIn( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_8 not in", values, "extraNumInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo8Between( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_8 between", value1, value2, "extraNumInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo8NotBetween( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_8 not between", value1, value2, "extraNumInfo8" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo9IsNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_9 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo9IsNotNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_9 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo9EqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_9 =", value, "extraNumInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo9NotEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_9 <>", value, "extraNumInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo9GreaterThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_9 >", value, "extraNumInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo9GreaterThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_9 >=", value, "extraNumInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo9LessThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_9 <", value, "extraNumInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo9LessThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_9 <=", value, "extraNumInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo9In( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_9 in", values, "extraNumInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo9NotIn( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_9 not in", values, "extraNumInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo9Between( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_9 between", value1, value2, "extraNumInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo9NotBetween( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_9 not between", value1, value2, "extraNumInfo9" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo10IsNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_10 is null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo10IsNotNull( )
		{
			addCriterion( "EXTRA_NUM_INFO_10 is not null" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo10EqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_10 =", value, "extraNumInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo10NotEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_10 <>", value, "extraNumInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo10GreaterThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_10 >", value, "extraNumInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo10GreaterThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_10 >=", value, "extraNumInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo10LessThan( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_10 <", value, "extraNumInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo10LessThanOrEqualTo( BigDecimal value )
		{
			addCriterion( "EXTRA_NUM_INFO_10 <=", value, "extraNumInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo10In( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_10 in", values, "extraNumInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo10NotIn( List< BigDecimal > values )
		{
			addCriterion( "EXTRA_NUM_INFO_10 not in", values, "extraNumInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo10Between( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_10 between", value1, value2, "extraNumInfo10" );
			return ( Criteria ) this;
		}

		public Criteria andExtraNumInfo10NotBetween( BigDecimal value1, BigDecimal value2 )
		{
			addCriterion( "EXTRA_NUM_INFO_10 not between", value1, value2, "extraNumInfo10" );
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

		public Criteria andUpdateDateIsNull( )
		{
			addCriterion( "UPDATE_DATE is null" );
			return ( Criteria ) this;
		}

		public Criteria andUpdateDateIsNotNull( )
		{
			addCriterion( "UPDATE_DATE is not null" );
			return ( Criteria ) this;
		}

		public Criteria andUpdateDateEqualTo( Date value )
		{
			addCriterion( "UPDATE_DATE =", value, "updateDate" );
			return ( Criteria ) this;
		}

		public Criteria andUpdateDateNotEqualTo( Date value )
		{
			addCriterion( "UPDATE_DATE <>", value, "updateDate" );
			return ( Criteria ) this;
		}

		public Criteria andUpdateDateGreaterThan( Date value )
		{
			addCriterion( "UPDATE_DATE >", value, "updateDate" );
			return ( Criteria ) this;
		}

		public Criteria andUpdateDateGreaterThanOrEqualTo( Date value )
		{
			addCriterion( "UPDATE_DATE >=", value, "updateDate" );
			return ( Criteria ) this;
		}

		public Criteria andUpdateDateLessThan( Date value )
		{
			addCriterion( "UPDATE_DATE <", value, "updateDate" );
			return ( Criteria ) this;
		}

		public Criteria andUpdateDateLessThanOrEqualTo( Date value )
		{
			addCriterion( "UPDATE_DATE <=", value, "updateDate" );
			return ( Criteria ) this;
		}

		public Criteria andUpdateDateIn( List< Date > values )
		{
			addCriterion( "UPDATE_DATE in", values, "updateDate" );
			return ( Criteria ) this;
		}

		public Criteria andUpdateDateNotIn( List< Date > values )
		{
			addCriterion( "UPDATE_DATE not in", values, "updateDate" );
			return ( Criteria ) this;
		}

		public Criteria andUpdateDateBetween( Date value1, Date value2 )
		{
			addCriterion( "UPDATE_DATE between", value1, value2, "updateDate" );
			return ( Criteria ) this;
		}

		public Criteria andUpdateDateNotBetween( Date value1, Date value2 )
		{
			addCriterion( "UPDATE_DATE not between", value1, value2, "updateDate" );
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