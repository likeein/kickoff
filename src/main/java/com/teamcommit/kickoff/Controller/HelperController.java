package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Common.CommandMap;
import com.teamcommit.kickoff.Do.HelperDO;
import com.teamcommit.kickoff.Service.HelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class HelperController {

    @Autowired
    private HelperService helperService;

    @GetMapping("/helperList")
    public String helperList(@ModelAttribute("helperDO") HelperDO helperDO, Model model) {
        String result = "";

        try {
            List<HelperDO> list = helperService.selectHelper(helperDO);
            model.addAttribute("table", list);
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

    @PostMapping("/helperInsert")
    public String helperInsert(@ModelAttribute("helperDO") HelperDO helperDO, Model model) {
        String view = "/helper/helperInsert";

        try {
            helperService.insertHelper(helperDO);
            model.addAttribute("script", "alert('용병 모집을 등록했습니다!');");
        }
        catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("script", "alert('중복된 값이거나 양식이 올바르지 않습니다.');");
        }

        return view;
    }

}
