package Shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Shopping.beans.Orders;
import jdbc.DBUtil;

public class OrdersDAOImpl implements OrdersDAO {
	// Beans/POJO/DO
	// Plain Old Java Object
	// Data Object
	@Override
	public int addNewOrders(Orders order) {

		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "insert into order values (?,?)"; 
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, order.getOrderId());
			pstmt.setInt(2, order.getOrderAmount());

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
	public List<Orders> listAllOrders() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		List<Orders> list = new ArrayList<>();
		String query = "select * from orders";
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(query);

			rs = pstmt.executeQuery();
			while (rs.next()) {
				Orders temp = new Orders();
				temp.setOrderId(rs.getInt(1));
				temp.setOrderAmount(rs.getInt(2));
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
	public Orders findByOrdersId(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int editOrdersDetails(Orders order) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOrders(int orderId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int result = 0;
		String query = "delete from  orders where orderid = ? ";
		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, orderId);

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

