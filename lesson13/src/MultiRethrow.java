import java.io.IOException;
import java.sql.SQLException;

public class MultiRethrow {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readSomeData();
		} catch (IOException | SQLException e){
			e.printStackTrace();
		}
	}
	
	static void readSomeData() throws IOException, SQLException {
		try {
			// The code that may generate IOException or SQLException 
			// goes here
			SQLException esql = new SQLException("Table Cust doesn't exist.");
			throw esql;
		} catch (Exception e){
			// re-throw the exception
			throw e;
		}
	}

}
