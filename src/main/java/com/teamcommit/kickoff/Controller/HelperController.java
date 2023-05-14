package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Do.HelperDO;
import com.teamcommit.kickoff.Do.MessageDO;
import com.teamcommit.kickoff.Do.ReservationDO;
import com.teamcommit.kickoff.Service.HelperService;
import com.teamcommit.kickoff.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
            helperService.updateStatus();
            List<HelperDO> list = helperService.selectHelper(helperDO);
            model.addAttribute("table", list);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }

    // insert 부분은 아직 미완성...! 예약 내역 완성되는대로 다시 츄라이
    @GetMapping("/helperInsert")
    public String helperInsert(Model model, HttpSession session) {
        String view = "/helper/helperInsert";

            if(session.getAttribute("userId") == null) {
                model.addAttribute("script", "alert('로그인 후 이용이 가능합니다.');");
                view = "login/loginAll";
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

    @GetMapping("/helperReservation")
    public String helperInsert(@RequestParam(value = "helperPlaceName") String helperPlaceName, @RequestParam(value = "helperAddress") String helperAddress,
                               @RequestParam(value = "helperTime") String helperTime, Model model) {
        String view = "forward:/helperInsert";
        model.addAttribute("placeName", helperPlaceName);
        model.addAttribute("address", helperAddress);
        model.addAttribute("date", helperTime);
        return view;
    }

    @PostMapping("/helperReservation")
    public String helperInsert(@ModelAttribute("helperDO") HelperDO helperDO, Model model, HttpSession session) {
        String view = "/helper/helperList";

            try {
                helperService.insertHelper(helperDO);
                model.addAttribute("script", "alert('용병 모집을 등록했습니다!');");
            }
            catch (Exception e) {
                e.printStackTrace();
                model.addAttribute("script", "alert('양식을 제대로 입력해주세요 :)');");
            }
        return view;
    }

    @RequestMapping("/helperDetail")
    public String helperDetail(@ModelAttribute("helperDO") HelperDO helperDO, @RequestParam(value = "helperSeqno") int helperSeqno, HttpSession session) {
        String view = "/helper/helperDetail";

        try {
            HelperDO detail = helperService.selectHelperDetail(helperSeqno);
            session.setAttribute("content", detail);
            session.setAttribute("helperSeqNo", helperSeqno);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return view;
    }

    @GetMapping("/helperMessage")
    public String helperMessage(Model model, HttpSession session) {
        String view = "/message/helperMessageInsert";

        if(session.getAttribute("userId") == null) {
            model.addAttribute("messageScript", "alert('로그인 후 이용해주세요');");
            view = "forward:/helperDetail?helperSeqno=" + (Integer)session.getAttribute("helperSeqNo");
        }
        else if(session.getAttribute("userId") != null) {
            try{
                HelperDO message = helperService.selectHelperDetail((Integer)session.getAttribute("helperSeqNo"));
                model.addAttribute("message", message);

                String userId = (String)session.getAttribute("userId");
                model.addAttribute("userId", userId);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

        return view;
    }

   @PostMapping("/helperMessage")
    public String helperMessage(@ModelAttribute("messageDO") MessageDO messageDO, Model model) {
        String view = "/message/helperMessageInsert";

            try {
                helperService.insertMessage(messageDO);
                model.addAttribute("msgScript", "alert('메시지를 보냈습니다!');");
            }
            catch (Exception e) {
                e.printStackTrace();
                model.addAttribute("msgScript", "alert('양식이 올바르지 않습니다.');");
            }
        return view;
    }

}
