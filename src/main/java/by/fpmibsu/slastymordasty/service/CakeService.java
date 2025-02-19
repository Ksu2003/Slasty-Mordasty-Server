package by.fpmibsu.slastymordasty.service;

import by.fpmibsu.slastymordasty.dao.CakeDao;
import by.fpmibsu.slastymordasty.entity.Cake;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class CakeService {

    private static final Logger log = Logger.getLogger(CakeService.class);
    private CakeDao cakeDao;

    public CakeService(){
        cakeDao = new CakeDao();
        log.info("Call constructor");
    }


    public List<Cake> getAll(){
        log.warn("method getAll");
        try {
            return cakeDao.getAll();
        } catch (InterruptedException e) {
            log.warn(e.getMessage());
        }
        return null;
    }

    public Cake getById(long id){
        log.warn("method getById");
        try {
            return cakeDao.getById(id);
        } catch (InterruptedException e) {
            log.warn(e.getMessage());
        }
        return null;
    }
}
