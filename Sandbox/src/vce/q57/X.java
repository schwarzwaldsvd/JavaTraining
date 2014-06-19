package vce.q57;

public class X implements Z {
	public String toString(){
		return "I am X";
	}
	public static void main(String[] args){
		Y myY = new Y();
		X myX = myY;
		Z myZ = myX;
		System.out.println(myZ);
	}
}
