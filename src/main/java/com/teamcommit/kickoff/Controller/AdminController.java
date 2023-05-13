package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.UserDO;
import com.teamcommit.kickoff.Service.AdminService;
import com.teamcommit.kickoff.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    @Qualifier("AdminService")
    private AdminService adminService;

    // 게시판 목록
    @RequestMapping( "/userManagement")
    public String userlist(@ModelAttribute("userDO") UserDO userDO, HttpServletRequest request, Model model) throws Exception {

        String view = "/admin/userManagement";

        List<UserDO> userList = adminService.getList(userDO);
        model.addAttribute("userList", userList);

        return view;
    }

    // 신고 게시물 관리 페이지 이동
    @GetMapping("/boardManagement")
    public String boardList() {
        String view = "/admin/boardManagement";

        return view;
    }

}
