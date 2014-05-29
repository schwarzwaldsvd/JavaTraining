package sample_questions;

public class TestOCA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte value = (byte) 0b0111_1010;
		byte result = (byte) (value & 0b0000_1111);
		System.out.println("result: " +
		Integer.toBinaryString(result));
	}

}
