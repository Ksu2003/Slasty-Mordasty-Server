package test.fpmibsu.slastymordasty.dao;

import by.fpmibsu.slastymordasty.entity.User;
import by.fpmibsu.slastymordasty.service.UserService;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertEquals;

public class UserServiceTest {
    UserService userService = new UserService();

    public UserServiceTest() throws SQLException, InterruptedException {
    }

    @Test()
    void getByEmail1Password() throws SQLException, InterruptedException {
        long id = 1;
        User user = new User(1,"Анатолий","anatolyM@gmail.com","+375296772344","tolik",0,"Корженевского","23 12");
        assertEquals(userService.getUserByEmailPassword("anatolyM@gmail.com","tolik"),user);
    }

    @Test()
    void getByEmail2Password() throws SQLException, InterruptedException {
        long id = 2;
        User user = new User(2,"Петр","petrFilkevich@mail.com","+375297112647","prf646",0,"Толстого","10 25");
        assertEquals(userService.getUserByEmailPassword("petrFilkevich@mail.com","prf646"),user);
    }

    @Test()
    void getByEmail3Password() throws SQLException, InterruptedException {
        long id = 3;
        User user = new User(3,"Кристина","krisTy@gmail.com","+375443456212","234532",0,"Московская","21 54");
        assertEquals(userService.getUserByEmailPassword("krisTy@gmail.com","234532"),user);

    }

    @Test()
    void getByEmail4Password() throws SQLException, InterruptedException {
        long id = 4;
        User user = new User(4,"Елена","LenaM@gmail.com","+375295176532","PasEl2",0,"Денисовская","3 14");
        assertEquals(userService.getUserByEmailPassword("LenaM@gmail.com","PasEl2"),user);
    }

    @Test()
    void getByEmail5Password() throws SQLException, InterruptedException {
        long id = 5;
        User user = new User(5,"Дмитрий","panchukD@gmail.com","+375298912324","noPass",1,"Октябрьская","10 1");
        assertEquals(userService.getUserByEmailPassword("panchukD@gmail.com","noPass"),user);
    }


}

