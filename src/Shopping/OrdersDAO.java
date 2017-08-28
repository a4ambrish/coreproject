package Shopping;

import java.util.List;

import Shopping.beans.Orders;

public interface OrdersDAO {
	
	public int addNewOrders(Orders order);
	public List<Orders> listAllOrders();
	public Orders findByOrdersId(int orderId);
	public int editOrdersDetails(Orders order);
	public int deleteOrders(int orderId);
	

}

