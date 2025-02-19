package by.fpmibsu.slastymordasty.dao;

import by.fpmibsu.slastymordasty.dao.pool.ConnectionPool;
import by.fpmibsu.slastymordasty.entity.NutritionalValue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NutritionalValueDao {

    Connection connection;

    public static final String GET_ALL = "SELECT * FROM nutritionalvalue";
    public static final String GET_BY_ID = "SELECT * FROM nutritionalvalue WHERE idNutritionalValue =?";

    public NutritionalValueDao() throws SQLException, InterruptedException {

    }

    public List<NutritionalValue> getAll() throws InterruptedException {
        connection = ConnectionPool.getConnection();
        List<NutritionalValue> list = new ArrayList<>();
        try{

            PreparedStatement ps = connection.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                NutritionalValue nutritionalValue = new NutritionalValue();
                nutritionalValue.setId(rs.getLong("idNutritionalValue"));
                nutritionalValue.setProteins(rs.getDouble("proteins"));
                nutritionalValue.setFats(rs.getDouble("fats"));
                nutritionalValue.setCarbohydrates(rs.getDouble("carbohydrates"));
                nutritionalValue.setCaloriesKJoules(rs.getDouble("caloriesKJoules"));
                nutritionalValue.setCaloriesKcal(rs.getDouble("caloriesKcal"));
                list.add(nutritionalValue);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ConnectionPool.closeConnection(connection);
        return list;
    }

    public NutritionalValue getById(long id) throws InterruptedException {
        connection = ConnectionPool.getConnection();
        NutritionalValue nutritionalValue = new NutritionalValue();
        try {
            PreparedStatement ps = connection.prepareStatement(GET_BY_ID);
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){

                nutritionalValue.setId(rs.getLong("idNutritionalValue"));
                nutritionalValue.setProteins(rs.getDouble("proteins"));
                nutritionalValue.setFats(rs.getDouble("fats"));
                nutritionalValue.setCarbohydrates(rs.getDouble("carbohydrates"));
                nutritionalValue.setCaloriesKJoules(rs.getDouble("caloriesKJoules"));
                nutritionalValue.setCaloriesKcal(rs.getDouble("caloriesKcal"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ConnectionPool.closeConnection(connection);
        return nutritionalValue;
    }
}
