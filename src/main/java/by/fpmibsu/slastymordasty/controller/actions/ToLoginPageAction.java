package by.fpmibsu.slastymordasty.controller.actions;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ToLoginPageAction extends AbstractAction{
    private static final Logger log = Logger.getLogger(ToLoginPageAction.class);

    public ToLoginPageAction(HttpServletRequest req, HttpServletResponse res) {
        super(req, res);
        log.info("Call constructor");
    }

    @Override
    public void doAction() {
        log.info("method doAction");
        try{
            req.getRequestDispatcher("/view/login.jsp").forward(req, res);
        } catch (ServletException | IOException e) {
            log.info(e.getMessage());
        }
    }
}
