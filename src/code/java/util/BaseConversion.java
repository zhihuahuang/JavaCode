package code.java.util;

public class BaseConversion {
	/**
	 * Convert a btye array to hex string.
	 * @param bytes is a btye array
	 * @return A hex string
	 */
	public static String bytesToHexString(byte[] bytes){
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < bytes.length; i++) {
			String hex = Integer.toHexString(bytes[i] & 0xFF);
			if (hex.length() == 1) {
				hex = '0' + hex;
			}
			buffer.append(hex.toLowerCase());
		}
		return buffer.toString();
	}
}
