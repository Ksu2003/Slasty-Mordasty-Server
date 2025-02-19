package by.fpmibsu.slastymordasty.service;

import by.fpmibsu.slastymordasty.dao.ImageDao;
import by.fpmibsu.slastymordasty.dao.OrderDao;
import by.fpmibsu.slastymordasty.entity.Order;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class OrderService {
    private static final Logger log = Logger.getLogger(OrderService.class);
    private OrderDao orderDao;

    public OrderService()  {
        log.info("Call constructor");
       // try {
           orderDao = new OrderDao();
      //  }
      /*  catch (SQLException | InterruptedException e) {
            log.warn(e.getMessage());
        } */

    }
    public void deleteOrderById(long id)  {
        log.info("method deleteOrderById");
        try {
            orderDao.deleteOrderById(id);
        } catch (InterruptedException e) {
            log.warn(e.getMessage());
        }
    }

    public List<Order> getAllOrdersOfUser(long id)  {
        log.info("method getAllOrdersOfUser");
        try {
            return orderDao.getAllOrdersOfUser(id);
        } catch (InterruptedException e) {
            log.warn(e.getMessage());
        }
        return null;
    }
    public void insertOrder(Order order)  {
        log.info("method insertOrder");
        try {
            orderDao.insertOrder(order);
        } catch (InterruptedException e) {
            log.warn(e.getMessage());
        }
    }


}
