/**
 * @author Zevo
 */
package code.java.digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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

	public static byte[] hash(byte[] input) throws NoSuchAlgorithmException {
		if(exception != null)
			throw exception;
		
		messageDigest.update(input);
		return messageDigest.digest(); //MD5
	}
}
