import by.fpmibsu.slastymordasty.dao.CakeDao;
import by.fpmibsu.slastymordasty.dao.UserDao;
import by.fpmibsu.slastymordasty.entity.Cake;
import by.fpmibsu.slastymordasty.entity.Item;
import by.fpmibsu.slastymordasty.entity.User;

import java.sql.*;
import java.util.List;

public class Main {



    public static void main(String[] args) throws SQLException, InterruptedException {

        CakeDao cakeDao = new CakeDao();

        for(Cake item : cakeDao.getAll()){
            System.out.println(item.getTitle());
        }

    }


}
