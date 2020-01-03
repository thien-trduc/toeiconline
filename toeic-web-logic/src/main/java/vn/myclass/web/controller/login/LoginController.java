package vn.myclass.web.controller.login;

import org.apache.log4j.Logger;
import sun.rmi.runtime.Log;
import vn.myclass.core.dto.UserDTO;
import vn.myclass.core.service.UserService;
import vn.myclass.core.service.impl.UserServiceImpl;
import vn.myclass.core.web.common.WebConstants;
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
        UserCommand command = FormUtils.populate(UserCommand.class,req);
        UserDTO pojo = command.getPojo();
        UserService userService = new UserServiceImpl();
        try {
            if(userService.isUserExist(pojo) != null)
            {
                if(userService.findRoleByUser(pojo)!=null && userService.findRoleByUser(pojo).getRoleDTO()!=null)
                {
                    if(userService.findRoleByUser(pojo).getRoleDTO().getName().equals(WebConstants.ROLE_ADMIN))
                    {
                        resp.sendRedirect("/toeic_web_war_exploded/admin-home.html");
//                        req.setAttribute(WebConstants.ALERT,WebConstants.TYPE_SUCCESS);
//                        req.setAttribute(WebConstants.MESSAGE_RESPONSE,"ADMIN");
                    }else if(userService.findRoleByUser(pojo).getRoleDTO().getName().equals(WebConstants.ROLE_USER))
                    {
//                        req.setAttribute(WebConstants.ALERT,WebConstants.TYPE_SUCCESS);
//                        req.setAttribute(WebConstants.MESSAGE_RESPONSE,"USER");
                        resp.sendRedirect("/toeic_web_war_exploded/home.html");
                    }
                }
            }
        }catch(NullPointerException e)
        {
            log.error(e);
            req.setAttribute(WebConstants.ALERT,WebConstants.TYPE_ERROR);
            req.setAttribute(WebConstants.MESSAGE_RESPONSE,"Tên hoặc mật khẩu sai");
            RequestDispatcher rd = req.getRequestDispatcher("/view/web/login.jsp");
            rd.forward(req,resp);
        }

    }
}
