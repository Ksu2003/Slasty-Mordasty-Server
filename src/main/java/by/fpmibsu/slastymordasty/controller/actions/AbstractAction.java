package by.fpmibsu.slastymordasty.controller.actions;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public abstract class AbstractAction {

    protected HttpServletRequest req;
    protected HttpServletResponse res;

    AbstractAction(HttpServletRequest req, HttpServletResponse res){
        this.req = req;
        this.res = res;
    }

    public void doAction() throws IOException, SQLException, ServletException, InterruptedException {

    }

}
