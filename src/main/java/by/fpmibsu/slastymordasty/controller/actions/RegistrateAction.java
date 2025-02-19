package by.fpmibsu.slastymordasty.controller.actions;

import by.fpmibsu.slastymordasty.entity.User;
import by.fpmibsu.slastymordasty.service.UserService;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class RegistrateAction extends AbstractAction{

    private static final Logger log = Logger.getLogger(RegistrateAction.class);

    public RegistrateAction(HttpServletRequest req, HttpServletResponse res) {
        super(req, res);
        log.info("Call constructor");
    }

    @Override
    public void doAction() throws ServletException, IOException {
        log.info("method doAction");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String street = req.getParameter("street");
        String phone = req.getParameter("phone");
        String houseFlat = req.getParameter("houseFlat");

        UserService userService = new UserService();



        try {
            if (userService.isExistByEmailPas(email, password)) {
                req.getRequestDispatcher("/view/login.jsp").forward(req, res);
            } else if (name != null) {
                userService.insertNew(new User(name, email, phone, password, 0, street, houseFlat));
                req.getRequestDispatcher("/view/login.jsp").forward(req, res);
            }
        } catch (ServletException | IOException e){
            log.info(e.getMessage());
        }

    }
}
