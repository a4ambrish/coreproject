package Shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Shopping.beans.Customer;
import jdbc.DBUtil;

public class CustomerDAOImpl implements CustomerDAO {

	public int addNewCustomer(Customer customer) {

		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "insert into Customer values (?,?)"; 
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, customer.getCustomerId());
			pstmt.setString(2, customer.getCustomerName());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstmt != null) {
					pstmt.close();
				}

			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			try {
				if (con != null) {

					con.close();

				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

		return result;
	}

	
	public List<Customer> listAllCustomers() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		List<Customer> list = new ArrayList<>();
		String query = "select * from Customer";
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				Customer temp = new Customer();
				temp.setCustomerId(rs.getInt(1));
				temp.setCustomerName(rs.getString(2));
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
				
				e.printStackTrace();
			}
			try {
				if (con != null) {

					con.close();

				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public Customer findByCustomerId(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int editCustomerDetails(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCustomer(int customerId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "delete from  Customers where Customerid = ? ";
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, customerId);

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

