package test.fpmibsu.slastymordasty.dao;

import by.fpmibsu.slastymordasty.dao.CakeDao;
import by.fpmibsu.slastymordasty.entity.Cake;
import by.fpmibsu.slastymordasty.entity.Image;
import by.fpmibsu.slastymordasty.entity.NutritionalValue;
import by.fpmibsu.slastymordasty.service.CakeService;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertEquals;


public class CakeServiceTest {

    private CakeService cakeDao = new CakeService();

    public CakeServiceTest() throws SQLException, InterruptedException {
    }

    @Test()
    void getByIdTest8() throws InterruptedException {
        long id = 8;
        Cake expectObject = new Cake(8,new NutritionalValue(8,7,
                28, 28, 1663, 397),
                new Image(8,"8.jpg"),
                "���� ��������", "����� ���������, ������ ���������������, ������ �������, �����, ������ ��������� ������� (��������������� ������, �����), �������, ���� ���������, ���� �������, ���������� �������, �����-�������, ������������: �������� ������, ������������: �������.", 65);

        Cake test = cakeDao.getById(id);

        assertEquals(test,expectObject);
    }

    @Test()
    void getByIdTest1() throws InterruptedException {
        long id = 1;
        Cake expectObject = new Cake(1,new NutritionalValue(1,6,
                19, 21, 1118, 267),
                new Image(1,"1.jpg"),
                "������� ����-���ʻ", "��� ��������� (������ ���������������, ������ ���������������, ��������� ����������� - �������� �������, �������, �������������� -����������� �������� ���������), ������� �������� (���� ���������, �����, �������� (����� ������������ �������������� ����������������, ����, ���� ������� ���������� ������������ (����� �����, ����� ���������������: ����������� �����), ����������� (������� ������, ����- � ����������� ������ ������, ��������������: ������� ��������), ��������� �������� �����, ����������: ������ �����, ���������: ����-�������, ������������, ��������������: ���������� ����� �����������)), ��������� �������� �����, ������������); ���� �������, ������, �����, ����� ���������.\n" +
                "����� ��������� ����� �������, �������, ������ � ���.", 55);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }



    @Test()
    void getByIdTest7() throws InterruptedException {
        long id = 7;
        Cake expectObject = new Cake(7,new NutritionalValue(7,5,
                17, 21, 1081, 258),
                new Image(7,"7.jpg"),
                "���� �������� ��������", "�������, ���� �������, �����, ���� ���������, ������ ���������������, ���� ��������, ����� ���������, ������� ������ (����� ������, �����-�������, �����, �����-�����, ���������� ������� ������, ������������: �������), ����, ������������: �������.", 50);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest5() throws InterruptedException {
        long id = 5;
        Cake expectObject = new Cake(5,new NutritionalValue(5,5,
                25, 24, 1412, 337),
                new Image(5,"5.jpg"),
                "���� ����������� � ����������", " ��� ��������� (������ ���������������, ������ ���������������, ��������� ����������� - �������� �������, �������, �������������� -����������� �������� ���������), �����, ������, ������ ������, ���� �������, ���� ���������, ����� ���������, ������� ����������, ����� ��������������: ������, ������.", 60);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest9() throws InterruptedException {
        long id = 9;
        Cake expectObject = new Cake(9,new NutritionalValue(9,5,
                11, 43, 1278, 305),
                new Image(9,"9.jpg"),
                "���� ��������", "�������, ���� ���������, �����, ��������� �����, ��������� �����, ������� ������� (����� ������, �����-�������, �����, �����-�����, ���������� ������� ������, ������������: �������), ������, �����-�������, ������������: �������� ������.", 50);

        Cake test = cakeDao.getById(id);

        System.out.println(cakeDao.getById(id).getDescription());

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest10() throws InterruptedException {
        long id = 10;
        Cake expectObject = new Cake(10,new NutritionalValue(10,6,
                27, 37, 1756, 419),
                new Image(10,"10.jpg"),
                "���� ������ �� ������", "�������, ���� ���������, �����, ��������� �����, ��������� �����, ������� ������� (����� ������, �����-�������, �����, �����-�����, ���������� ������� ������, ������������: �������), ������, �����-�������, ������������: �������� ������", 55);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest2() throws InterruptedException {
        long id = 2;
        Cake expectObject = new Cake(2,new NutritionalValue(2,6,
                26, 42, 1865, 445),
                new Image(2,"2.jpg"),
                "��������� ����", "�������, ������� ������, �����, ���� ���������, ���� �������, ������������: �������� ������, ������������: �������.", 45);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest6() throws InterruptedException {
        long id = 6;
        Cake expectObject = new Cake(6,new NutritionalValue(6,5,
                21, 28, 1337, 319),
                new Image(6,"6.jpg"),
                "���� ���������", "������, ���� ���������, �������� (����� ������������ �������������� ����������������, ����, ���� ������� ���������� ������������ (����� �����, ����� ���������������: ����������� �����), ����������� (������� ������, ����- � ����������� ������ ������, ��������������: ������� ��������), ����� ���������, ���� ������� (������), ���� ��������, ������������: �������� ������.", 55);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest4() throws InterruptedException {
        long id = 4;
        Cake expectObject = new Cake(4,new NutritionalValue(4,7,
                26, 32, 1647, 393),
                new Image(4,"4.jpg"),
                "���� ������", "���� �������, ����� ���������, �����, ������� ������� (����� ������, �����-�������, �����, �����-�����, ���������� ������� ������, ������������: �������), ������ ��������� (��������������� ������, �����), ���� ���������, ������, �����-�������, ���� ����������� (������� ������, �����, �����������: ������, ��������� �����������: �������� �������), ������������: �������� ������.", 50);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest11() throws InterruptedException {
        long id = 11;
        Cake expectObject = new Cake(11,new NutritionalValue(11,3,
                22, 59, 1906, 455),
                new Image(11,"11.jpg"),
                "���� ������� ������", "�����, ����� ���������, ���� �������, ���� ��������, ���� ���������, ������ ��������� (��������������� ������, �����), ������� ������� (����� ������, �����-�������, �����, �����-�����, ���������� ������� ������, ������������: �������), ��� ��������, ����� ��������������: ����-����, ������������: �������.", 50);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest3() throws InterruptedException {
        long id = 3;
        Cake expectObject = new Cake(3,new NutritionalValue(3,4,
                22, 37, 1500, 358),
                new Image(3,"3.jpg"),
                "���� �������� ������", "�����, ����� ���������, ���� ���������, ��� ��������� (������ ���������������, ������ ���������������, ��������� ����������� - �������� �������, �������, �������������� -����������� �������� ���������), �����, ���� �������, �����-�������, ��� ��������, ��������� ������� �������� ������ (���� ���������������� ���������, ���������: ����� 4R, ������ \"��������� �����\", ��������, ������������: ���������������), ������������: �������.\n" +
                "����� ��������� ����� �������, �������, ������ � ���.\n" +
                "�������� ���������, ������� ����� ��������� ������������� ������� �� ���������� � �������� �����.\n", 60);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

}