package com.teamcommit.kickoff.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/userManagement")
    public String userList() {
        String view = "/admin/userManagement";

        return view;
    }

    @GetMapping("/boardManagement")
    public String boardList() {
        String view = "/admin/boardManagement";

        return view;
    }

}
