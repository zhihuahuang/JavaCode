package code.java.util;

public class Conversion {
	public static final int BINARY = 2;
	public static final int OCTAL = 8;
	public static final int HEX = 16;
	public static final int DECIMAL = 10;

	public static String toString(int integer, int radix) {
		return Integer.toString(integer, radix);
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
	
	public static int toInteger(String string, int radix){
		return Integer.parseInt(string, radix);
	}
	
	public static int binaryToInteger(String string){
		return Integer.parseInt(string, 2);
	}
	
	public static int octalToInteger(String string){
		return Integer.parseInt(string, 8);
	}
	
	public static int hexToInteger(String string){
		return Integer.parseInt(string, 16);
	}
	
	public static int decimalToInteger(String string){
		return Integer.parseInt(string, 10);
	}
	
	public static String toHexString(byte[] bytes){
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
