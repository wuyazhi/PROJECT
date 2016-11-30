package com.pay.eport.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class EPortOrderUpdateDto
{
	private String updateType; // 更新类型

	private List< EPortOrderUpdateItem > eportOrderList;

	public EPortOrderUpdateDto( )
	{}

	public String getUpdateType( )
	{
		return updateType;
	}

	public void setUpdateType( String updateType )
	{
		this.updateType = updateType;
	}

	public List< EPortOrderUpdateItem > getEportOrderList( )
	{
		if ( this.eportOrderList != null )
		{
			return this.eportOrderList;
		}
		else
		{
			return Collections.emptyList( );
		}
	}

	public void addEPortOrderUpdateItem( List< EPortOrderUpdateItem > eportOrderList )
	{
		if ( eportOrderList == null || eportOrderList.isEmpty( ) )
		{
			return;
		}

		if ( this.eportOrderList == null )
		{
			this.eportOrderList = new ArrayList< EPortOrderUpdateItem >( eportOrderList.size( ) );
		}

		this.eportOrderList.addAll( eportOrderList );
	}

	public void addEPortOrderUpdateItem( EPortOrderUpdateItem orderItem )
	{
		if ( orderItem == null )
		{
			return;
		}

		if ( this.eportOrderList == null )
		{
			this.eportOrderList = new ArrayList< EPortOrderUpdateItem >( );
		}

		this.eportOrderList.add( orderItem );
	}
}