package by.fpmibsu.slastymordasty.controller.actions;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class ToBasketPageAction extends AbstractAction{

    public ToBasketPageAction(HttpServletRequest req, HttpServletResponse res) {
        super(req, res);
    }

    @Override
    public void doAction() throws IOException, SQLException, ServletException, InterruptedException {
        req.getRequestDispatcher("view/basket.jsp").forward(req,res);
    }
}
