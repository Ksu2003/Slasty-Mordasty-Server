package by.fpmibsu.slastymordasty.controller.actions;

import by.fpmibsu.slastymordasty.controller.MainServlet;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class ApiAction extends AbstractAction{

    private static final Logger log = Logger.getLogger(ApiAction.class);

    public ApiAction(HttpServletRequest req, HttpServletResponse res) {
        super(req, res);
        log.info("Call constructor");
    }

    @Override
    public void doAction(){
        log.info("method doAction");
        req.getRequestDispatcher("/api/"+req.getAttribute("apiPath"));
    }
}
