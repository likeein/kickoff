package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Common.CommandMap;
import com.teamcommit.kickoff.Do.HelperDO;
import com.teamcommit.kickoff.Do.ReservationDO;
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
    public String helperInsert(Model model, HttpSession session) {
        String view = "/helper/helperInsert";
            if(session.getAttribute("login_info") == null) {
                model.addAttribute("msg", "로그인 후 이용해주세요.");
            }
            else if(session.getAttribute("login_info") != null) {
                try {
                    List<ReservationDO> list = helperService.selectReservation((String) session.getAttribute("login_info"));
                    model.addAttribute("reservation", list);
                }
                catch (Exception e) {
                    model.addAttribute("msg", "예약 내역이 존재하지 않습니다.");
                }
            }
        return view;
    }

    @PostMapping("/helperInsert")
    public String helperInsert(@ModelAttribute("helperDO") HelperDO helperDO, Model model, HttpSession session) {
        String view = "/helper/helperInsert";

        if(session.getAttribute("login_info") == null) {
            model.addAttribute("script", "alert('로그인 후 이용이 가능합니다.');");
        }
        else if (session.getAttribute("login_info") != null) {
            try {
                helperService.insertHelper(helperDO);
                model.addAttribute("script", "alert('용병 모집을 등록했습니다!');");
            }
            catch (Exception e) {
                e.printStackTrace();
                model.addAttribute("script", "alert('중복된 값이거나 양식이 올바르지 않습니다.');");
            }
        }
        return view;
    }

}
