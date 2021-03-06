package Shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Shopping.beans.Book;
import jdbc.DBUtil;

public class BookDAOImpl implements BookDAO {
	// Beans/POJO/DO
	// Plain Old Java Object
	// Data Object
	@Override
	public int addNewBook(Book book) {

		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "insert into book values (?,?)"; // question mark is a
															// placeholder start
															// with 1
		// String normalQuery = "insert into book values
		// ("+book.getBookId()+", '"+book.getBookName()+"');";

		// ramesh\\;delete * from book; SQL Injection;
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, book.getBookId());
			pstmt.setString(2, book.getBookName());

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
	public List<Book> listAllBooks() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		List<Book> list = new ArrayList<>();
		String query = "select * from book";
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				Book temp = new Book();
				temp.setBookId(rs.getInt(1));
				temp.setBookName(rs.getString(2));
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
	public Book findByBookId(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int editBookDetails(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBook(int bookId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "delete from  book where bookid = ? ";
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, bookId);

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
