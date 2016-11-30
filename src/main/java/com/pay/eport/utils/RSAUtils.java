package com.pay.eport.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import org.apache.commons.lang.CharEncoding;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.net.util.Base64;

public final class RSAUtils
{
	private static final String CIPHER_ALGORITHM_RSA = "RSA/ECB/PKCS1Padding";

	private static final String KEY_ALGORITHM_RSA = "RSA";

	private static final String SIGNATURE_ALGORITHM = "SHA1withRSA";

	private RSAUtils( )
	{}

	public static byte[ ] encryptWithPublicKey( final Key publicKey, final byte[ ] data )
			throws GeneralSecurityException
	{
		if ( publicKey == null )
		{
			throw new IllegalArgumentException( "公钥不能为空" );
		}
		else if ( data == null || data.length == 0 )
		{
			return new byte[ 0 ];
		}

		Cipher cipher = Cipher.getInstance( CIPHER_ALGORITHM_RSA );
		cipher.init( Cipher.ENCRYPT_MODE, publicKey );
		return cipher.doFinal( data );
	}

	public static String encryptWithPublicKey( final String publicKey, final String data )
			throws GeneralSecurityException, UnsupportedEncodingException
	{
		byte[ ] encryptData = encryptWithPublicKey( generatePublicKeyFromBase64String( publicKey ),
				data.getBytes( CharsetUtils.UTF_8 ) );
		final String encodeData = URLEncoder.encode( Base64.encodeBase64String( encryptData ),
				CharEncoding.UTF_8 );

		return Base64.encodeBase64String( encodeData.getBytes( CharsetUtils.UTF_8 ) );
	}

	public static byte[ ] decryptWithPublicKey( final Key publicKey, final byte[ ] data )
			throws GeneralSecurityException
	{
		if ( publicKey == null )
		{
			throw new IllegalArgumentException( "公钥不能为空" );
		}
		else if ( data == null || data.length == 0 )
		{
			return new byte[ 0 ];
		}

		Cipher cipher = Cipher.getInstance( CIPHER_ALGORITHM_RSA );
		cipher.init( Cipher.DECRYPT_MODE, publicKey );
		return cipher.doFinal( data );
	}

	public static byte[ ] decryptWithPublicKey( final String publicKey, final String data )
			throws GeneralSecurityException
	{
		return decryptWithPublicKey( generatePublicKeyFromBase64String( publicKey ),
				data.getBytes( CharsetUtils.UTF_8 ) );
	}

	public static PublicKey generatePublicKeyFromBase64String( String keyString )
			throws GeneralSecurityException
	{
		if ( StringUtils.isBlank( keyString ) )
		{
			throw new IllegalArgumentException( "公钥串不能为空" );
		}

		return KeyFactory.getInstance( KEY_ALGORITHM_RSA ).generatePublic(
				new X509EncodedKeySpec( Base64.decodeBase64( keyString ) ) );
	}

	public static boolean verifySignature( String utf8Content, String base64EncodedKey,
			String base64EncodedSignature ) throws GeneralSecurityException
	{
		return verifySignature( utf8Content.getBytes( CharsetUtils.UTF_8 ),
				generatePublicKeyFromBase64String( base64EncodedKey ),
				Base64.decodeBase64( base64EncodedSignature ) );
	}

	public static boolean verifySignature( byte[ ] contentBytes, PublicKey publicKey,
			byte[ ] originalSignature ) throws GeneralSecurityException
	{
		Signature signature = Signature.getInstance( SIGNATURE_ALGORITHM );
		signature.initVerify( publicKey );
		signature.update( contentBytes, 0, contentBytes.length );

		return signature.verify( originalSignature );
	}
}