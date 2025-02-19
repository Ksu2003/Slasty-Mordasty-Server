package by.fpmibsu.slastymordasty.service;

import by.fpmibsu.slastymordasty.dao.ImageDao;
import by.fpmibsu.slastymordasty.dao.NutritionalValueDao;
import by.fpmibsu.slastymordasty.entity.NutritionalValue;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class NutritionalValueService {

    private static final Logger log = Logger.getLogger(NutritionalValueService.class);

    private NutritionalValueDao nutritionalValueDao;

    public NutritionalValueService()  {
        log.info("Call constructor");
        try {
            nutritionalValueDao = new NutritionalValueDao();
        } catch (SQLException | InterruptedException e) {
            log.warn(e.getMessage());
        }

    }
    public List<NutritionalValue> getAll()  {
        log.warn("method getAll");
        try {
            return nutritionalValueDao.getAll();
        } catch (InterruptedException e) {
            log.warn(e.getMessage());
        }
        return null;
    }

    public NutritionalValue getById(long id)  {
        log.warn("method getById");
        try {
            return nutritionalValueDao.getById(id);
        } catch (InterruptedException e) {
            log.warn(e.getMessage());
        }
        return null;
    }
}
