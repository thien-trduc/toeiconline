package vn.myclass.web.controller.login;

import org.apache.log4j.Logger;
import sun.rmi.runtime.Log;
import vn.myclass.core.dto.UserDTO;
import vn.myclass.core.web.utils.FormUtils;
import vn.myclass.web.controller.command.UserCommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login.html")
public class LoginController extends HttpServlet {
    private final Logger log = Logger.getLogger(this.getClass());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/view/web/login.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //UserCommand command = FormUtils.populate(UserCommand.class,req);
        //UserDTO pojo = command.getPojo();
        RequestDispatcher rd = req.getRequestDispatcher("/view/web/login.jsp");
        rd.forward(req,resp);
    }
}
