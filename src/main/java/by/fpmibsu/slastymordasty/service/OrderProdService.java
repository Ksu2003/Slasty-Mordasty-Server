package by.fpmibsu.slastymordasty.service;

import by.fpmibsu.slastymordasty.dao.OrderProdDao;
import by.fpmibsu.slastymordasty.entity.Item;
import by.fpmibsu.slastymordasty.entity.Order;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class OrderProdService {
    private static final Logger log = Logger.getLogger(OrderProdService.class);
    private OrderProdDao orderProdDao;

    public OrderProdService()  {
        log.info("Call constructor");
        orderProdDao = new OrderProdDao();


    }


    public List<Item> getAllOrdersById(long id)  {
        log.warn("method getAllOrdersById");
        try {
            return orderProdDao.getAllOrdersById(id);
        }  catch (SQLException | InterruptedException e) {
            log.warn(e.getMessage());
        }
        return null;
    }




}
