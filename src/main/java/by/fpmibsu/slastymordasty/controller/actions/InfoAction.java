package by.fpmibsu.slastymordasty.controller.actions;

import by.fpmibsu.slastymordasty.entity.Cake;
import by.fpmibsu.slastymordasty.service.CakeService;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class InfoAction extends AbstractAction{

    private long cakeId;

    private static final Logger log = Logger.getLogger(InfoAction.class);

    public InfoAction(HttpServletRequest req, HttpServletResponse res,long id) {
        super(req, res);
        this.cakeId = id;
        log.info("Call constructor");
    }

    @Override
    public void doAction(){
        log.info("method doAction");
        CakeService cakeService = new CakeService();
        Cake cake = cakeService.getById(cakeId);
        req.setAttribute("cake",cake);
        try {
            req.getRequestDispatcher("/view/information.jsp").forward(req, res);
        } catch (ServletException | IOException e) {
            log.info(e.getMessage());
        }
    }
}
