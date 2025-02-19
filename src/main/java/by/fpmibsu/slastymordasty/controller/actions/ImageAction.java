package by.fpmibsu.slastymordasty.controller.actions;

import by.fpmibsu.slastymordasty.controller.MainServlet;
import org.apache.log4j.Logger;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ImageAction extends AbstractAction{

    private static final Logger log = Logger.getLogger(ImageAction.class);

    public ImageAction(HttpServletRequest req, HttpServletResponse res) {
        super(req, res);
        log.info("Call constructor");
    }

    @Override
    public void doAction() {

        log.info("method doAction");
        Scanner sc = new Scanner(req.getRequestURI());
        sc.useDelimiter("/");



        String imageName = "";

        while (sc.hasNext()){
            imageName = sc.next();
        }


        File file = new File("D:\\TP\\Slasty-Mordasty\\src\\main\\webapp\\img\\" + imageName);
        BufferedImage image = null;
        try {
            image = ImageIO.read(file);
            ImageIO.write(image, "JPG", res.getOutputStream());
        } catch (IOException e) {
            log.info(e.getMessage());
        }

    }
}
