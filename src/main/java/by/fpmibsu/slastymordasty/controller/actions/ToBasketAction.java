package by.fpmibsu.slastymordasty.controller.actions;

import by.fpmibsu.slastymordasty.entity.Cake;
import by.fpmibsu.slastymordasty.service.CakeService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ToBasketAction extends AbstractAction{

    private long cakeId;
    public ToBasketAction(HttpServletRequest req, HttpServletResponse res,long cakeId) {
        super(req, res);
        this.cakeId = cakeId;
    }

    @Override
    public void doAction() throws IOException, SQLException, ServletException, InterruptedException {
        List<Cake> list = (List<Cake>) req.getSession().getAttribute("basket");
        CakeService cakeService = new CakeService();

        if(list == null){
            list = new ArrayList<>();
            list.add(cakeService.getById(cakeId));
        } else{
            list.add(cakeService.getById(cakeId));
        }

        req.getSession().setAttribute("basket",list);
        req.getRequestDispatcher("/view/index.jsp").forward(req,res);

    }
}
