package sandbox;

public class TestRun {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstLiteral = "Albacore Tuna";
		String secondLiteral = "Albacore Tuna";
		String firstObject = new String("Albacore Tuna");
		if(firstLiteral == secondLiteral) {
		System.out.println(
		"firstLiteral and secondLiteral are the same object");
		} else {
		System.out.println(
		"firstLiteral and secondLiteral are not the same object");
		}
		if(firstLiteral == firstObject) {
		System.out.println(
		"firstLiteral and firstObject are the same object");
		} else {
		System.out.println(
		"firstLiteral and firstObject are not the same object");
		}
		int i, j, k;
		i = j = k = 10;
		System.out.println("Values are: i=" + i +", j=" + j + ", k=" +k);
	}

}
