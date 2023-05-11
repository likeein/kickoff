package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Common.CommandMap;
import com.teamcommit.kickoff.Do.HelperDO;
import com.teamcommit.kickoff.Service.HelperService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class HelperController {

    @Resource(name="helperService")
    private HelperService helperService;

    @GetMapping("/helperList")
    public String helperList(Model model) {
        String result = "";

        try {
            List<HelperDO> list = helperService.selectHelper();
            for (HelperDO helper : list) {
                result += "<tr><td>" + helper.getHelperMatch() + "</td><td>" + helper.getHelperPosition() +
                        "</td><td>" + helper.getHelperTeamLevel() + "</td><td>" + helper.getHelperGender() +
                        "</td><td>" + helper.getHelperPlace() + "</td><td>" + helper.getHelperTime() + "</td></tr>";
            }
            model.addAttribute("table", result);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return "/helper/helperList";
    }

    @GetMapping("/helperInsert")
    public String helperInsert() {
        String view = "/helper/helperInsert";

        return view;
    }


}
