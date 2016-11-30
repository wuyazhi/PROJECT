package com.pay.eport.utils;

import java.nio.charset.Charset;
import org.apache.commons.lang.CharEncoding;

public final class CharsetUtils
{
	public static final Charset UTF_8 = Charset.forName( CharEncoding.UTF_8 );

	public static final Charset GBK = Charset.forName( "GBK" );

	private CharsetUtils( )
	{}
}