package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Common.CommandMap;
import com.teamcommit.kickoff.Do.HelperDO;
import com.teamcommit.kickoff.Do.ReservationDO;
import com.teamcommit.kickoff.Service.HelperService;
import com.teamcommit.kickoff.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class HelperController {

    @Autowired
    private HelperService helperService;
    @Autowired
    private LoginService loginService;

    @GetMapping("/helperList")
    public String helperList(@ModelAttribute("helperDO") HelperDO helperDO, Model model) {
        String view = "/helper/helperList";

        try {
            List<HelperDO> list = helperService.selectHelper(helperDO);
            model.addAttribute("table", list);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }

    @RequestMapping("/helperDetail")
    public String helperDetail(@ModelAttribute("helperDO") HelperDO helperDO, @RequestParam(value = "helperSeqno") int helperSeqno, Model model) {
        String view = "/helper/helperDetail";

        try {
            HelperDO detail = helperService.selectHelperDetail(helperSeqno);
            model.addAttribute("content", detail);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return view;
    }

    @GetMapping("/helperInsert")
    public String helperInsert(Model model, HttpSession session) {
        String view = "/helper/helperInsert";

            if(session.getAttribute("userId") == null) {
                model.addAttribute("msg", "로그인 후 이용해주세요.");
            }
            else if(session.getAttribute("userId") != null) {
                try {
                    List<ReservationDO> list = helperService.selectReservation((String) session.getAttribute("userId"));
                    String userId = (String) session.getAttribute("userId");
                    model.addAttribute("reservation", list);
                    model.addAttribute("userId", userId);
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

        if(session.getAttribute("userId") == null) {
            model.addAttribute("script", "alert('로그인 후 이용이 가능합니다.');");
            view = "login/loginAll";
        }
        else if (session.getAttribute("userId") != null) {
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

    @GetMapping("/helperMessage")
    public String helperMessage() {
        String view = "/message/messageInsert";



        return view;
    }


}
