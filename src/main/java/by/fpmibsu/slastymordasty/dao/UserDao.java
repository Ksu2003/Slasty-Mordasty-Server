package by.fpmibsu.slastymordasty.dao;

import by.fpmibsu.slastymordasty.dao.pool.ConnectionPool;
import by.fpmibsu.slastymordasty.entity.User;

import javax.servlet.RequestDispatcher;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao{
    Connection connection;

    public static final String GET_ALL = "SELECT * FROM user";
    public static final String INSERT_NEW = "INSERT INTO user(NAME,EMAIL,PHONENUMBER,PASSWORD,ROLE,ADDRESSSTREET,NUMHOUSEFLAT) VALUES(?,?,?,?,?,?,?)";

    public static final String DELETE_ID ="DELETE FROM user WHERE USERID =?";

    public static final String UPDATE_EMAIL = "UPDATE user SET EMAIL =? WHERE USERID =?";
    public static final String UPDATE_PHONE = "UPDATE user SET PHONENUMBER =? WHERE USERID =?";
    public static final String UPDATE_PASSWORD = "UPDATE user SET PASSWORD =? WHERE USERID =?";
    public static final String UPDATE_ADDRESSSTREET = "UPDATE user SET ADDRESSSTREET =? WHERE USERID =?";
    public static final String UPDATE_NUMHOUSEFLAT = "UPDATE user SET NUMHOUSEFLAT =? WHERE USERID =?";

    public static final String GET_BY_EMAIL_PASSWORD = "SELECT * FROM user WHERE email = ? AND password = ?";

    public UserDao() throws SQLException, InterruptedException {
        //connection = ConnectionPool.getConnection();
    }

    public boolean isExistByEmailPas(String email,String password) throws SQLException, InterruptedException {
        connection = ConnectionPool.getConnection();
        PreparedStatement ps = connection.prepareStatement(GET_BY_EMAIL_PASSWORD);

        ps.setString(1,email);
        ps.setString(2,password);
        ResultSet rs = ps.executeQuery();

        ConnectionPool.closeConnection(connection);
        return rs.next();
    }

    public User getUserByEmailPassword(String email,String password) throws SQLException, InterruptedException {
        connection = ConnectionPool.getConnection();
        PreparedStatement ps = connection.prepareStatement(GET_BY_EMAIL_PASSWORD);
        ps.setString(1,email);
        ps.setString(2,password);
        ResultSet rs = ps.executeQuery();

        User user = new User();

        while (rs.next()){
            user.setId(rs.getInt("USERID"));
            user.setName(rs.getString("NAME"));
            user.setEmail(rs.getString("EMAIL"));
            user.setPhoneNumber(rs.getString("PHONENUMBER"));
            user.setPassword(rs.getString("PASSWORD"));
            user.setRole(rs.getInt("ROLE"));
            user.setAddressStreet(rs.getString("ADDRESSSTREET"));
            user.setNumHouseFlat(rs.getString("NUMHOUSEFLAT"));
        }

        ConnectionPool.closeConnection(connection);
        return user;
    }

    public List<User> getAllUsers() throws InterruptedException {
        connection = ConnectionPool.getConnection();
        List<User> list = new ArrayList<>();


        try {
            PreparedStatement ps = connection.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                User user = new User();
                user.setId(rs.getInt("USERID"));
                user.setName(rs.getString("NAME"));
                user.setEmail(rs.getString("EMAIL"));
                user.setPhoneNumber(rs.getString("PHONENUMBER"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setRole(rs.getInt("ROLE"));
                user.setAddressStreet(rs.getString("ADDRESSSTREET"));
                user.setNumHouseFlat(rs.getString("NUMHOUSEFLAT"));
                list.add(user);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ConnectionPool.closeConnection(connection);
        return list;
    }

    public void insertUser(User user) throws InterruptedException {
        connection = ConnectionPool.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(INSERT_NEW);

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPhoneNumber());
            ps.setString(4, user.getPassword());
            ps.setInt(5, user.getRole());
            ps.setString(6, user.getAddressStreet());
            ps.setString(7, user.getNumHouseFlat());

            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ConnectionPool.closeConnection(connection);
    }

    public void deleteUserById(long id) throws InterruptedException {
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

    public void updateUserEmail(long id, String email) throws InterruptedException {
        connection = ConnectionPool.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(UPDATE_EMAIL);
            ps.setString(1, email);
            ps.setLong(2, id);
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ConnectionPool.closeConnection(connection);
    }

    public void updateUserPhone(long id,String phone) throws InterruptedException {
        connection = ConnectionPool.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(UPDATE_PHONE);
            ps.setString(1, phone);
            ps.setLong(2, id);
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ConnectionPool.closeConnection(connection);
    }

    public void updateUserPassword(long id,String password) throws InterruptedException {
        connection = ConnectionPool.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(UPDATE_PASSWORD);
            ps.setString(1, password);
            ps.setLong(2, id);
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ConnectionPool.closeConnection(connection);
    }

    public void updateUserAddress(long id,String addressStreet, String numHouseFlat) throws InterruptedException {
        connection = ConnectionPool.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(UPDATE_ADDRESSSTREET);
            ps.setString(1, addressStreet);
            ps.setLong(2, id);
            ps.execute();

            ps = connection.prepareStatement(UPDATE_NUMHOUSEFLAT);
            ps.setString(1, numHouseFlat);
            ps.setLong(2, id);
            ps.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ConnectionPool.closeConnection(connection);
    }



}

