package by.fpmibsu.slastymordasty.controller.actions;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;

public class ToRegPageAction extends AbstractAction {

    private static final Logger log = Logger.getLogger(ToLoginPageAction.class);

    public ToRegPageAction(HttpServletRequest req, HttpServletResponse res) {
        super(req, res);
        log.info("Call constructor");
    }

    public void doAction(){
        log.info("method doAction");
        try{
            req.getRequestDispatcher("/view/reg.jsp").forward(req, res);
        } catch (ServletException | IOException e) {
            log.warn(e.getMessage());
        }
    }
}
