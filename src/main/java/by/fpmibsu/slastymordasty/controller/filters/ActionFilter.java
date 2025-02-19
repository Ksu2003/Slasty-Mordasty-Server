package by.fpmibsu.slastymordasty.controller.filters;

import by.fpmibsu.slastymordasty.controller.actions.*;
import by.fpmibsu.slastymordasty.entity.Cake;
import by.fpmibsu.slastymordasty.service.CakeService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ActionFilter implements Filter {

    private static final Logger log = Logger.getLogger(ActionFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {


        HttpServletRequest req;
        HttpServletResponse resp;

        if(servletRequest instanceof HttpServletRequest){
            req = (HttpServletRequest) servletRequest;
            resp = (HttpServletResponse) servletResponse;
        } else {
            return;
        }

        String url = req.getRequestURI();
        log.info("Catch url : " + url);

        if(url.endsWith("jpg")){
            ImageAction imageAction = new ImageAction(req,resp);
            req.setAttribute("action",imageAction);
        } else if(url.endsWith("info.jsp")) {
            InfoAction infoAction = new InfoAction(req, resp, Long.parseLong(url.substring("/Slasty-Mordasty/".length(), url.length() - "info.jsp".length())));
            req.setAttribute("action", infoAction);
        } else if(url.endsWith("toBasketJsp.jsp")){
                ToBasketAction toBasketActionction = new ToBasketAction(req,resp,Long.parseLong(url.substring("/Slasty-Mordasty/".length(), url.length() - "toBasketJsp.jsp".length())));
                req.setAttribute("action",toBasketActionction);
        } else if(url.startsWith("/Slasty-Mordasty/api/")){
            ApiAction apiAction = new ApiAction(req,resp);
            req.setAttribute("action",apiAction);
            req.setAttribute("apiPath",url.substring(url.indexOf("/Slasty-Mordasty/api/") + "/Slasty-Mordasty/api/".length()));
        }
        else {
            switch (url){
                case "/Slasty-Mordasty/basket.jsp":
                    ToBasketPageAction toBasketPageAction = new ToBasketPageAction(req,resp);
                    req.setAttribute("action",toBasketPageAction);
                    break;
                case "/Slasty-Mordasty/stat.jsp":
                    AdminAction adminAction = new AdminAction(req,resp);
                    req.setAttribute("action",adminAction);
                    break;
                case "/Slasty-Mordasty/":
                    StartAction startAction = new StartAction(req,resp);
                    req.setAttribute("action",startAction);
                    break;
                case "/Slasty-Mordasty/reg.jsp":
                    ToRegPageAction toRegPageAction = new ToRegPageAction(req,resp);
                    req.setAttribute("action",toRegPageAction);
                    break;
                case "/Slasty-Mordasty/login.jsp":

                    String email = req.getParameter("email");
                    String password = req.getParameter("password");

                    if(email != null && password != null){
                        LoginAction loginAction = new LoginAction(req,resp);
                        req.setAttribute("action",loginAction);
                    } else{
                        ToLoginPageAction toLoginPageAction = new ToLoginPageAction(req,resp);
                        req.setAttribute("action",toLoginPageAction);
                    }
                    break;

                case "/Slasty-Mordasty/logout.jsp":
                    LogoutAction logoutAction = new LogoutAction(req,resp);
                    req.setAttribute("action",logoutAction);
                    break;

                case "/Slasty-Mordasty/doReg.jsp":

                    RegistrateAction registrateAction = new RegistrateAction(req,resp);
                    req.setAttribute("action",registrateAction);

                    break;
                default:

                    NotFoundAction notFoundAction = new NotFoundAction(req,resp);
                    req.setAttribute("action",notFoundAction);

                    break;
            }
        }




        req.getRequestDispatcher("/MainServlet").forward(req,resp);





    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
