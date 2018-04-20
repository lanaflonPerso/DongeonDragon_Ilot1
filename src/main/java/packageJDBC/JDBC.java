package packageJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	public static Connection conn=null;

	public static void jdbc(String pUrl, String pUser, String pMdp) {
		try {
			conn = DriverManager.getConnection(pUrl, pUser, pMdp);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	


}
