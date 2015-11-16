package code.java.util;

/**
 * A Converter Class. It can be easy to convert a type to another type.
 * @author Zevo
 * @modified 2014-08-06
 */
public class Converter {
	public enum Radix{
		BINARY(0x2),
		OCTAL(0x8),
		HEX(0x10),
		DECIMAL(0xa);
		Radix(int v){value=v;}
		int value = 0;
		public int value(){return value;}
	}
	
	private Converter() {
	}

        public static String toString(int integer, Radix r) {
		return Integer.toString(integer, r.value());
	}

	public static String toBinaryString(int integer) {
		return Integer.toBinaryString(integer);
	}

	public static String toOctalString(int integer) {
		return Integer.toOctalString(integer);
	}

	public static String toHexString(int integer) {
		return Integer.toHexString(integer);
	}

	public static int toInteger(String string, Radix r) {
		return Integer.parseInt(string, r.value());
	}

	public static int binaryToInteger(String string) {
		return Integer.parseInt(string, 2);
	}

	public static int octalToInteger(String string) {
		return Integer.parseInt(string, 8);
	}

	public static int hexToInteger(String string) {
		return Integer.parseInt(string, 16);
	}

	public static int decimalToInteger(String string) {
		return Integer.parseInt(string, 10);
	}

	/* HEX */

	public static String toHexString(byte[] bytes) {
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
