package by.fpmibsu.slastymordasty.dao;

import by.fpmibsu.slastymordasty.dao.pool.ConnectionPool;
import by.fpmibsu.slastymordasty.entity.Item;
import by.fpmibsu.slastymordasty.entity.Order;
import by.fpmibsu.slastymordasty.entity.Cake;
import by.fpmibsu.slastymordasty.service.CakeService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static by.fpmibsu.slastymordasty.entity.Item.quantity;


public class OrderProdDao {
    Connection connection;

    public static final String GET_ALL_BY_ID = "SELECT * FROM orderProd WHERE orderId =?";

    public OrderProdDao(){}

    public List<Item> getAllOrdersById(long id) throws SQLException, InterruptedException{
        connection = ConnectionPool.getConnection();
        List<Item> list = new ArrayList<>();
        CakeService cakeService = new CakeService();


        try {
            PreparedStatement ps = connection.prepareStatement(GET_ALL_BY_ID);
            ps.setLong(1,id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){

                Cake cake = cakeService.getById(rs.getLong("idDessert"));
                cake.setQuantity(rs.getInt("quantity"));
                list.add(cake);

            }





        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ConnectionPool.closeConnection(connection);

        return list;
    }
}
