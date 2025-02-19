package by.fpmibsu.slastymordasty.controller;

import by.fpmibsu.slastymordasty.controller.actions.AbstractAction;
import by.fpmibsu.slastymordasty.controller.filters.ActionFilter;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;



public class MainServlet extends HttpServlet {

    private static final Logger log = Logger.getLogger(MainServlet.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        AbstractAction action = (AbstractAction) req.getAttribute("action");
        try {
            log.info("Process " + action.getClass());
            action.doAction();
        } catch (SQLException | InterruptedException e) {
            log.error(e.getMessage());
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AbstractAction action = (AbstractAction) req.getAttribute("action");
        try {
            log.info("Process " + action.getClass());
            action.doAction();
        } catch (SQLException | InterruptedException e) {
            log.error(e.getMessage());
        }
    }
}
