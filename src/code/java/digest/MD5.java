/**
 * @author Zevo
 */
package code.java.digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import code.java.util.BaseConversion;

public class MD5 {
	private static MessageDigest messageDigest;
	private static NoSuchAlgorithmException exception;
	
	static {
		try {
			messageDigest  = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			exception = e;
		}
	}

	/**
	 * Generate a byte array by MD5.
	 * @param input is a byte array
	 * @return A byte array
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] generate(byte[] input) throws NoSuchAlgorithmException {
		if(exception != null)
			throw exception;
		
		messageDigest.update(input);
		return messageDigest.digest(); //MD5
	}
	
	/**
	 * Generate a lower case hex string by MD5.
	 * @param input is a byte array
	 * @return A lower case hex string
	 * @throws NoSuchAlgorithmException
	 */
	public static String generateHexString(byte[] input) throws NoSuchAlgorithmException{
		return BaseConversion.bytesToHexString(generate(input));
	}
}
