package code.java.digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import code.java.util.BaseConversion;

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
		return messageDigest.digest(); // SHA-1
	}

	/**
	 * Generate a lower case hex string by SHA-1.
	 * 
	 * @param input
	 *            is a byte array
	 * @return A lower case hex string
	 * @throws NoSuchAlgorithmException
	 */
	public static String generateHexString(byte[] input)
			throws NoSuchAlgorithmException {
		return BaseConversion.bytesToHexString(generate(input));
	}
}
