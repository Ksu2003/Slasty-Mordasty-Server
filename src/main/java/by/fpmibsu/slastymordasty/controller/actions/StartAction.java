package by.fpmibsu.slastymordasty.controller.actions;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StartAction extends AbstractAction{
    private static final Logger log = Logger.getLogger(StartAction.class);
    public StartAction(HttpServletRequest req, HttpServletResponse res) {
        super(req, res);
        log.info("Call constructor");

    }

    @Override
    public void doAction() {
        log.warn("method doAction");

        try{
            req.getRequestDispatcher("/view/index.jsp").forward(req, res);
        } catch (ServletException | IOException e) {
            log.info(e.getMessage());
        }
    }
}
