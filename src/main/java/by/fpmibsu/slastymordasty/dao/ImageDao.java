package by.fpmibsu.slastymordasty.dao;

import by.fpmibsu.slastymordasty.dao.pool.ConnectionPool;
import by.fpmibsu.slastymordasty.entity.Image;
import by.fpmibsu.slastymordasty.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ImageDao {
    Connection connection;

    public static final String GET_ALL  = "SELECT * FROM image";
    public static final String GET_BY_ID = "SELECT * FROM image WHERE idImage =?";

    public static final String INSERT_NEW = "INSERT INTO image (path) VALUES (?)";

    public static final String UPDATE_PATH = "UPDATE image SET PATH =? WHERE idImage =?";

    public ImageDao() throws SQLException, InterruptedException {

    }


    public List<Image> getAllImages() throws InterruptedException {
        connection = ConnectionPool.getConnection();
        List<Image> list = new ArrayList<>();


        try {
            PreparedStatement ps = connection.prepareStatement(GET_ALL);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                Image image = new Image();
                image.setId(rs.getInt("idImage"));
                image.setPath(rs.getString("path"));
                list.add(image);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ConnectionPool.closeConnection(connection);
        return list;
    }

    public Image getImageById(long id) throws InterruptedException {
        connection = ConnectionPool.getConnection();
        Image image = new Image();

        try {
            PreparedStatement ps = connection.prepareStatement(GET_BY_ID);
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                image.setId(rs.getInt("idImage"));
                image.setPath(rs.getString("path"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ConnectionPool.closeConnection(connection);
        return image;
    }


    public void insertImage(Image image) throws InterruptedException {
        connection = ConnectionPool.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(INSERT_NEW);
            ps.setString(1, image.getPath());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ConnectionPool.closeConnection(connection);
    }

    public void updateImage(Image image) throws InterruptedException {
        connection = ConnectionPool.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement(UPDATE_PATH);
            ps.setString(1, image.getPath());
            ps.setLong(2, image.getId());
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ConnectionPool.closeConnection(connection);
    }


}
