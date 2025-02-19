package by.fpmibsu.slastymordasty.dao;

import by.fpmibsu.slastymordasty.dao.pool.ConnectionPool;
import by.fpmibsu.slastymordasty.entity.Cake;
import by.fpmibsu.slastymordasty.entity.Item;
import by.fpmibsu.slastymordasty.entity.Order;
import by.fpmibsu.slastymordasty.entity.User;

import javax.servlet.RequestDispatcher;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {
    Connection connection;

    public static final String DELETE_ID ="DELETE FROM orders WHERE ORDERID =?";
    // public static final Long GET_USER_ID = "SELECT * FROM orderProd WHERE USER "

    public static final String GET_ALL_ORDERS_BY_USERID = "SELECT * FROM orders WHERE USERID =? ";
    // public  static final double GET_COST = "SELECT * FROM
    public static final String INSERT_NEW = "INSERT INTO orders(userId, cost, comment, orderDate, deliveryDate) VALUES(?,?,?,?,?)";
    public OrderDao(){
    }
    public void deleteOrderById(long id) throws InterruptedException {
        connection = ConnectionPool.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(DELETE_ID);
            ps.setLong(1, id);
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ConnectionPool.closeConnection(connection);
    }
    public List<Order> getAllOrdersOfUser(long id) throws InterruptedException {
        connection = ConnectionPool.getConnection();
        List<Order> list = new ArrayList<>();


        try {
            PreparedStatement ps = connection.prepareStatement(GET_ALL_ORDERS_BY_USERID);
            ps.setLong(1,id);
            ResultSet rs = ps.executeQuery();

            OrderProdDao orderProdDao = new OrderProdDao();

            while(rs.next()){
                Order order = new Order();
                order.setId(rs.getInt("OrderId"));

                order.setBasket(orderProdDao.getAllOrdersById(order.getId()));

                double coast = 0;

                for(Item item:order.getBasket()){
                    coast += ((Cake)item).getPrice() * ((Cake)item).getQuantity();
                }

                order.setCost(coast);

                order.setComment(rs.getString("comment"));
                //order.setOrderDate(rs.getDate("orderDate"));
                //order.setDeliveryDate(rs.getDate("deliveryDate"));
                list.add(order);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ConnectionPool.closeConnection(connection);
        return list;
    }

    public void insertOrder(Order order) throws InterruptedException {
        connection = ConnectionPool.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(INSERT_NEW);

            ps.setLong(1, order.getUserId());
            ps.setDouble(2, order.getCost());
            ps.setString(3, order.getComment());
            //   ps.setDate(4, order.getOrderDate());
            // ps.setDate(5, order.getDeliveryDate());

            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ConnectionPool.closeConnection(connection);
    }


}
