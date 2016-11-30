package com.pay.eport.config;

public class MessageTemplateConfig
{
	private String loadingDiretory;

	private String filePath;

	public MessageTemplateConfig( )
	{}

	public String getLoadingDiretory( )
	{
		return this.loadingDiretory;
	}

	public void setLoadingDiretory( String loadingDiretory )
	{
		this.loadingDiretory = loadingDiretory;
	}

	public String getFilePath( )
	{
		return this.filePath;
	}

	public void setFilePath( String filePath )
	{
		this.filePath = filePath;
	}
}