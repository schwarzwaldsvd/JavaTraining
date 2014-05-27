package sandbox;
public class Run {

	/**
	 * @param args
	 * @throws Exception 
	 */
	
    public static void main(String[] args) throws Exception {
        /*Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());*/
    	MySQLAccess acc = new MySQLAccess();
    	acc.readDataBase();
    }


}
