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
                "Торт «Сникерс»", "масло сливочное, молоко пастеризованное, арахис жареный, сахар, молоко сгущенное вареное (нормализованное молоко, сахар), сметана, мука пшеничная, яйца куриные, кукурузный крахмал, какао-порошок, разрыхлитель: карбонат натрия, ароматизатор: ванилин.", 65);

        Cake test = cakeDao.getById(id);

        assertEquals(test,expectObject);
    }

    @Test()
    void getByIdTest1() throws InterruptedException {
        long id = 1;
        Cake expectObject = new Cake(1,new NutritionalValue(1,6,
                19, 21, 1118, 267),
                new Image(1,"1.jpg"),
                "Чизкейк «НЬЮ-ЙОРК»", "сыр сливочный (сливки пастеризованные, молоко пастеризованное, регулятор кислотности - лимонная кислота, лактоза, антиокислитель -натуральный экстракт розмарина), печенье сахарное (мука пшеничная, сахар, маргарин (масла растительные рафинированные дезодорированные, вода, соль пищевая поваренная йодированная (йодат калия, агент антислеживающий: ферроцианид калия), эмульгаторы (лецитин соевый, моно- и диглицериды жирных кислот, антиокислитель: кислота лимонная), сыворотка молочная сухая, консервант: сорбат калия, краситель: бета-каротин, ароматизатор, антиокислитель: концентрат смеси токоферолов)), сыворотка молочная сухая, ароматизатор); яйца куриные, сливки, сахар, масло сливочное.\n" +
                "Может содержать следы арахиса, кунжута, корицы и мёда.", 55);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }



    @Test()
    void getByIdTest7() throws InterruptedException {
        long id = 7;
        Cake expectObject = new Cake(7,new NutritionalValue(7,5,
                17, 21, 1081, 258),
                new Image(7,"7.jpg"),
                "Торт «Дамские пальчики»", "сметана, яйца куриные, сахар, мука пшеничная, молоко пастеризованное, вода питьевая, масло сливочное, шоколад темный (какое тертое, какао-порошок, сахар, какао-масло, эмульгатор лецитин соевый, ароматизатор: ванилин), соль, ароматизатор: ванилин.", 50);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest5() throws InterruptedException {
        long id = 5;
        Cake expectObject = new Cake(5,new NutritionalValue(5,5,
                25, 24, 1412, 337),
                new Image(5,"5.jpg"),
                "Торт «Клюквенный с маскарпоне»", " сыр сливочный (сливки пастеризованные, молоко пастеризованное, регулятор кислотности - лимонная кислота, лактоза, антиокислитель -натуральный экстракт розмарина), сахар, сливки, клюква свежая, яйца куриные, мука пшеничная, масло сливочное, крахмал кукурузный, агент желеобразующий: пектин, корица.", 60);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest9() throws InterruptedException {
        long id = 9;
        Cake expectObject = new Cake(9,new NutritionalValue(9,5,
                11, 43, 1278, 305),
                new Image(9,"9.jpg"),
                "Торт «Медовик»", "сметана, мука пшеничная, сахар, сливочное масло, сливочное масло, шоколад горький (какое тертое, какао-порошок, сахар, какао-масло, эмульгатор лецитин соевый, ароматизатор: ванилин), сливки, какао-порошок, разрыхлитель: карбонат натрия.", 50);

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
                "Торт «Мишка на севере»", "сметана, мука пшеничная, сахар, сливочное масло, сливочное масло, шоколад горький (какое тертое, какао-порошок, сахар, какао-масло, эмульгатор лецитин соевый, ароматизатор: ванилин), сливки, какао-порошок, разрыхлитель: карбонат натрия", 55);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest2() throws InterruptedException {
        long id = 2;
        Cake expectObject = new Cake(2,new NutritionalValue(2,6,
                26, 42, 1865, 445),
                new Image(2,"2.jpg"),
                "Морковный торт", "сметана, морковь свежая, сахар, мука пшеничная, яйца куриные, разрыхлитель: карбонат натрия, ароматизатор: ванилин.", 45);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest6() throws InterruptedException {
        long id = 6;
        Cake expectObject = new Cake(6,new NutritionalValue(6,5,
                21, 28, 1337, 319),
                new Image(6,"6.jpg"),
                "Торт «Наполеон»", "молоко, мука пшеничная, маргарин (масла растительные рафинированные дезодорированные, вода, соль пищевая поваренная йодированная (йодат калия, агент антислеживающий: ферроцианид калия), эмульгаторы (лецитин соевый, моно- и диглицериды жирных кислот, антиокислитель: кислота лимонная), масло сливочное, яйца куриные (желтки), вода питьевая, разрыхлитель: карбонат натрия.", 55);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest4() throws InterruptedException {
        long id = 4;
        Cake expectObject = new Cake(4,new NutritionalValue(4,7,
                26, 32, 1647, 393),
                new Image(4,"4.jpg"),
                "Торт «Прага»", "яйца куриные, масло сливочное, сахар, шоколад горький (какое тертое, какао-порошок, сахар, какао-масло, эмульгатор лецитин соевый, ароматизатор: ванилин), молоко сгущенное (нормализованное молоко, сахар), мука пшеничная, сливки, какао-порошок, джем абрикосовый (абрикос свежий, сахар, загуститель: пектин, регулятор кислотности: лимонная кислота), разрыхлитель: карбонат натрия.", 50);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest11() throws InterruptedException {
        long id = 11;
        Cake expectObject = new Cake(11,new NutritionalValue(11,3,
                22, 59, 1906, 455),
                new Image(11,"11.jpg"),
                "Торт «Птичье молоко»", "сахар, масло сливочное, яйца куриные, вода питьевая, мука пшеничная, молоко сгущенное (нормализованное молоко, сахар), шоколад горький (какое тертое, какао-порошок, сахар, какао-масло, эмульгатор лецитин соевый, ароматизатор: ванилин), сок лимонный, агент желеобразующий: агар-агар, ароматизатор: ванилин.", 50);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

    @Test()
    void getByIdTest3() throws InterruptedException {
        long id = 3;
        Cake expectObject = new Cake(3,new NutritionalValue(3,4,
                22, 37, 1500, 358),
                new Image(3,"3.jpg"),
                "Торт «Красный бархат»", "сахар, масло сливочное, мука пшеничная, сыр сливочный (сливки пастеризованные, молоко пастеризованное, регулятор кислотности - лимонная кислота, лактоза, антиокислитель -натуральный экстракт розмарина), кефир, яйца куриные, какао-порошок, сок лимонный, краситель пищевой «Красный бархат» (вода дистиллированная очищенная, красители: понсо 4R, желтый \"солнечный закат\", азорубин, стабилизатор: пропиленгликоль), ароматизатор: ванилин.\n" +
                "Может содержать следы арахиса, кунжута, корицы и мёда.\n" +
                "Содержит красители, которые могут оказывать отрицательное влияние на активность и внимание детей.\n", 60);

        Cake test = cakeDao.getById(id);

        assertEquals(cakeDao.getById(id),expectObject);
    }

}