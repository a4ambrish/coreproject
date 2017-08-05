package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/postgres";
	private static final String DB_USER = "postgres";
	private static final String DB_PASSWORD = "postgres";

	public static Connection getConnection() {
		Connection con = null;
		try {

			Class.forName("org.postgresql.Driver");

			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

		return con;

	}

}
