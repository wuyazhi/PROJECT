package com.pay.eport.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public final class IOStreamUtils
{
	private static final Log logger = LogFactory.getLog( IOStreamUtils.class );

	private static final int DEFAULT_BUFFER_SIZE = 4 * 1024;

	private static final char LINE_FEED = '\n';

	private IOStreamUtils( )
	{}

	/**
	 * 将输入流转换为UTF-8字符串
	 * 
	 * @param ins
	 *            输入流
	 * @param charset
	 *            输入流编码，默认UTF-8
	 * @return
	 * @throws IOException
	 */
	public static String inputStreamToStringUTF8( InputStream ins, String charsetName )
			throws IOException
	{
		return inputStreamToStringUTF8( ins, Charset.forName( charsetName ) );
	}

	/**
	 * 将输入流转换为UTF-8字符串
	 * 
	 * @param ins
	 *            输入流
	 * @param charset
	 *            输入流编码，默认UTF-8
	 * @return
	 * @throws IOException
	 */
	public static String inputStreamToStringUTF8( InputStream ins, Charset charset )
	{
		if ( ins == null )
		{
			return "";
		}

		StringBuilder buffer = null;
		try
		{
			final int length = ins.available( );

			BufferedReader reader = new BufferedReader( new InputStreamReader( ins,
					( charset != null ) ? charset : CharsetUtils.UTF_8 ) );
			buffer = new StringBuilder( ( length > DEFAULT_BUFFER_SIZE ) ? length
					: DEFAULT_BUFFER_SIZE );

			String line = null;
			while ( ( line = reader.readLine( ) ) != null )
			{
				buffer.append( new String( line.getBytes( CharsetUtils.UTF_8 ), CharsetUtils.UTF_8 ) );
				buffer.append( LINE_FEED );
			}
		}
		catch ( IOException e )
		{
			logger.error( "读取输入流异常", e );
		}
		finally
		{
			try
			{
				ins.close( );
			}
			catch ( IOException e )
			{
				logger.error( "关闭输入流异常", e );
			}
		}

		return ( buffer != null ) ? buffer.toString( ) : "";
	}
}