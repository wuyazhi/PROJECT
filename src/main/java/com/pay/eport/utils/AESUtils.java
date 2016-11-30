package com.pay.eport.utils;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.net.util.Base64;

public final class AESUtils
{
	private static final String ALGORITHM_AES = "AES";
	private static final String CIPHER_ALGORITHM_AES = "AES/ECB/PKCS5Padding";
	private static final int AES_KEY_SIZE = 128;

	private static final String ALGORITHM_RNG = "SHA1PRNG";

	private AESUtils( )
	{}

	public static byte[ ] encrypt( final String content, final String encryptKey )
			throws UnsupportedEncodingException, GeneralSecurityException
	{
		if ( StringUtils.isBlank( content ) )
		{
			return new byte[ 0 ];
		}
		else if ( StringUtils.isBlank( encryptKey ) )
		{
			throw new IllegalArgumentException( "AES加密密钥不能为空" );
		}

		return encrypt( content.getBytes( CharsetUtils.UTF_8 ),
				encryptKey.getBytes( CharsetUtils.UTF_8 ) );
	}

	public static byte[ ] encrypt( final byte[ ] data, final byte[ ] encryptKeyBytes )
			throws GeneralSecurityException
	{
		if ( data == null || data.length == 0 )
		{
			return new byte[ 0 ];
		}
		else if ( encryptKeyBytes == null || encryptKeyBytes.length == 0 )
		{
			throw new IllegalArgumentException( "AES加密密钥不能为空" );
		}

		final Cipher cipher = Cipher.getInstance( CIPHER_ALGORITHM_AES );
		cipher.init( Cipher.ENCRYPT_MODE, new SecretKeySpec( encryptKeyBytes, ALGORITHM_AES ) );

		return cipher.doFinal( data );
	}

	public static String decrypt( final String base64EncodedEncryptedContent,
			final String base64EncodedKey ) throws GeneralSecurityException
	{
		if ( StringUtils.isBlank( base64EncodedEncryptedContent ) )
		{
			return "";
		}
		else if ( StringUtils.isBlank( base64EncodedKey ) )
		{
			throw new IllegalArgumentException( "AES解密密钥不能为空" );
		}

		return new String(
				decrypt( Base64.decodeBase64( base64EncodedEncryptedContent
						.getBytes( CharsetUtils.UTF_8 ) ), Base64.decodeBase64( base64EncodedKey
						.getBytes( CharsetUtils.UTF_8 ) ) ), CharsetUtils.UTF_8 );
	}

	public static byte[ ] decrypt( final byte[ ] encryptedData, final byte[ ] decryptKeyBytes )
			throws GeneralSecurityException
	{
		if ( encryptedData == null || encryptedData.length == 0 )
		{
			return new byte[ 0 ];
		}
		else if ( decryptKeyBytes == null || decryptKeyBytes.length == 0 )
		{
			throw new IllegalArgumentException( "AES解密密钥不能为空" );
		}

		final Cipher cipher = Cipher.getInstance( CIPHER_ALGORITHM_AES );
		cipher.init( Cipher.DECRYPT_MODE, new SecretKeySpec( decryptKeyBytes, ALGORITHM_AES ) );

		return cipher.doFinal( encryptedData );
	}

	public static String generateEncryptKey( ) throws NoSuchAlgorithmException
	{
		final KeyGenerator keyGenerator = KeyGenerator.getInstance( ALGORITHM_AES );

		SecureRandom secureRandom = SecureRandom.getInstance( ALGORITHM_RNG );
		secureRandom.setSeed( System.currentTimeMillis( ) );
		keyGenerator.init( AES_KEY_SIZE, secureRandom );

		return Base64.encodeBase64URLSafeString( keyGenerator.generateKey( ).getEncoded( ) );
	}
}