package vn.myclass.web.controller.admin;

import vn.myclass.core.dto.ListenGuidelineDTO;
import vn.myclass.core.web.common.WebConstants;
import vn.myclass.web.controller.command.ListenGuidelineCommand;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/admin-guideline-listen-list.html")
public class ListenGuidelineController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ListenGuidelineCommand command = new ListenGuidelineCommand();
        List<ListenGuidelineDTO> listenGuidelineDTOS = new ArrayList<ListenGuidelineDTO>();

        ListenGuidelineDTO dto1 = new ListenGuidelineDTO();
        dto1.setTiTle("bai hd nghe 1");
        dto1.setContent("Noi dung bai hd nghe 1");

        ListenGuidelineDTO dto2 = new ListenGuidelineDTO();
        dto2.setTiTle("bai hd nghe 2");
        dto2.setContent("Noi dung bai hd nghe 2");

        ListenGuidelineDTO dto3 = new ListenGuidelineDTO();
        dto3.setTiTle("bai hd nghe 3");
        dto3.setContent("Noi dung bai hd nghe 3");

        ListenGuidelineDTO dto4 = new ListenGuidelineDTO();
        dto4.setTiTle("bai hd nghe 4");
        dto4.setContent("Noi dung bai hd nghe 4");

        listenGuidelineDTOS.add(dto1);
        listenGuidelineDTOS.add(dto2);
        listenGuidelineDTOS.add(dto3);
        listenGuidelineDTOS.add(dto4);

        command.setListResult(listenGuidelineDTOS);
        command.setMaxPageItems(2);
        command.setTotalItems(listenGuidelineDTOS.size());
        req.setAttribute(WebConstants.LIST_ITEMS,command);

        RequestDispatcher rd = req.getRequestDispatcher("/view/admin/listenguideline/list.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
