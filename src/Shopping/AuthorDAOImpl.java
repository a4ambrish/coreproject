package Shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Shopping.beans.Author;
import jdbc.DBUtil;

public class AuthorDAOImpl implements AuthorDAO {
	// Beans/POJO/DO
	// Plain Old Java Object
	// Data Object
	@Override
	public int addNewAuthor(Author author) {

		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "insert into author values (?,?)"; // question mark is a
															// placeholder start
															// with 1
		// String normalQuery = "insert into authors values
		// ("+author.getAuthorId()+", '"+author.getAuthorName()+"');";

		// ramesh\\;delete * from author; SQL Injection;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, author.getAuthorId());
			pstmt.setString(2, author.getAuthorName());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (con != null) {

					con.close();

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;
	}

	@Override
	public List<Author> listAllAuthors() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		List<Author> list = new ArrayList<>();
		String query = "select * from authors";
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				Author temp = new Author();
				temp.setAuthorId(rs.getInt(1));
				temp.setAuthorName(rs.getString(2));
				list.add(temp);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (con != null) {

					con.close();

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public Author findByAuthorId(int authorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int editAuthorDetails(Author author) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAuthor(int authorId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "delete from  authors where authorid = ? ";
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, authorId);

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (con != null) {

					con.close();

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return result;
	}

}
