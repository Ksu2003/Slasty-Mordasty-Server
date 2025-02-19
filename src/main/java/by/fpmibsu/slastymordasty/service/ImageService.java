package by.fpmibsu.slastymordasty.service;


import by.fpmibsu.slastymordasty.dao.ImageDao;
import by.fpmibsu.slastymordasty.entity.Image;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.List;

public class ImageService {
    private static final Logger log = Logger.getLogger(ImageService.class);

    private ImageDao imageDao;

    public ImageService()  {
        log.info("Call constructor");
        try {
            imageDao = new ImageDao();
        } catch (SQLException | InterruptedException e) {
            log.warn(e.getMessage());
        }

    }
    public List<Image> getAllImages()  {
        log.warn("method getAllImages");
        try {
            return imageDao.getAllImages();
        } catch (InterruptedException e) {
            log.warn(e.getMessage());
        }
        return null;
    }

    public Image getImageById(long id)  {
        log.warn("method getImageById");
        try {
            return imageDao.getImageById(id);
        } catch (InterruptedException e) {
            log.warn(e.getMessage());
        }
        return null;
    }
    public void insertImage(Image image) {
        log.warn("method insertImage");
        try {
            imageDao.insertImage(image);
        } catch (InterruptedException e) {
            log.warn(e.getMessage());
        }
    }
    public void updateImage(Image image){
        log.warn("method updateImage");
        try {
            imageDao.updateImage(image);
        } catch (InterruptedException e) {
            log.warn(e.getMessage());
        }
    }
}
