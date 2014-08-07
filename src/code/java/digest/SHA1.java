package code.java.digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * A SHA-1 Class
 * @author Zevo
 * @modified 2014-08-06
 */
public class SHA1 {
	private static MessageDigest messageDigest;
	private static NoSuchAlgorithmException exception;

	static {
		try {
			messageDigest = MessageDigest.getInstance("SHA-1");
		} catch (NoSuchAlgorithmException e) {
			exception = e;
		}
	}

	private SHA1() {
	}

	/**
	 * Generate a byte array by SHA-1.
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
