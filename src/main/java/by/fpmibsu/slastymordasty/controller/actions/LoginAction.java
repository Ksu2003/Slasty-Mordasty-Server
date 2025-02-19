package by.fpmibsu.slastymordasty.controller.actions;

import by.fpmibsu.slastymordasty.entity.User;
import by.fpmibsu.slastymordasty.service.UserService;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class LoginAction extends AbstractAction{
    private static final Logger log = Logger.getLogger(LoginAction.class);

    public LoginAction(HttpServletRequest req, HttpServletResponse res) {
        super(req, res);
        log.info("Call constructor");
    }

    @Override
    public void doAction() {
        log.info("method doAction");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        UserService userService = new UserService();


        if(userService.isExistByEmailPas(email,password)){
            User user = userService.getUserByEmailPassword(email,password);
            req.getSession().setAttribute("id",(Long)user.getId());
            req.getSession().setAttribute("role",(Integer)user.getRole());
            req.getSession().setAttribute("email",user.getEmail());
            req.getSession().setAttribute("password",user.getPassword());
            try {
                req.getRequestDispatcher("/view/index.jsp").forward(req, res);
            } catch (ServletException | IOException e) {
                log.info(e.getMessage());
            }
        } else {
            try{
                req.getRequestDispatcher("/view/login.jsp").forward(req, res);
            } catch (ServletException | IOException e) {
                log.info(e.getMessage());
            }
        }
    }
}
