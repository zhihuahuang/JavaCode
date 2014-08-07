package code.java.digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * A MD5 Class
 * @author Zevo
 * @Modified 2014-08-06
 */
public class MD5 {
	private static MessageDigest messageDigest;
	private static NoSuchAlgorithmException exception;

	static {
		try {
			messageDigest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			exception = e;
		}
	}

	private MD5() {
	}

	/**
	 * Generate a byte array by MD5.
	 * 
	 * @param input
	 *            is a byte array
	 * @return A byte array
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] generate(byte[] input) throws NoSuchAlgorithmException {
		if (exception != null)
			throw exception;

		messageDigest.update(input);
		return messageDigest.digest();
	}
}
