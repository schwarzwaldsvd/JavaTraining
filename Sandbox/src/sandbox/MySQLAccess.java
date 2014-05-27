package sandbox;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQLAccess {
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	
	public void readDataBase() throws Exception {

        String url = "jdbc:mysql://localhost:9306/sandbox";
        String user = "sandbox";
        String password = "sandbox";

        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("select data from ts_test3");

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(MySQLAccess.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(MySQLAccess.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        }
	}
}
