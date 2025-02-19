package by.fpmibsu.slastymordasty.controller.actions;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class LogoutAction extends AbstractAction{
    private static final Logger log = Logger.getLogger(LogoutAction.class);
    public LogoutAction(HttpServletRequest req, HttpServletResponse res) {
        super(req, res);
        log.info("Call constructor");
    }

    @Override
    public void doAction() {
        log.info("method doAction");
        req.getSession().setAttribute("id",null);
        req.getSession().setAttribute("role",null);
        req.getSession().setAttribute("email",null);
        req.getSession().setAttribute("password",null);
        try {
            req.getRequestDispatcher("/view/index.jsp").forward(req, res);
        } catch (ServletException | IOException e) {
            log.info(e.getMessage());
        }
    }
}
