package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Common.CommandMap;
import com.teamcommit.kickoff.Service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ReservationController {

    @Resource(name="reservationService")
    private ReservationService reservationService;

    @GetMapping("/reservation")
    public String reservationList() {
        String view = "/reservation/reservation";

        return view;
    }

    @RequestMapping("/reservationInsertForm")
    public ModelAndView reservationInsertForm(CommandMap commandMap, HttpSession session) throws Exception {

        ModelAndView mv = new ModelAndView();

/*        Map<String, Object> map = new HashMap<String, Object>();

        if(session.getAttribute("user_id") != null) {
            String id = (String)session.getAttribute("user_id");
            map.put("id", id);
        } else if(session.getAttribute("emp_id") != null) {
            String id = (String)session.getAttribute("emp_id");
            map.put("id", id);
        }

        Map<String, Object> mem = reservationService.selectMemInfo(map);

        mv.addObject("mem", mem);*/
        mv.setViewName("/reservation/reservationInsert");

        return mv;
    }

    @RequestMapping("/reservationInsert")
    public ModelAndView reservationInsert(CommandMap commandMap, HttpServletRequest request) throws Exception {

        ModelAndView mv = new ModelAndView("redirect:/reservation");

        reservationService.insertReservation(commandMap.getMap(), request);

        return mv;
    }

    @RequestMapping("/reservationDetail")
    public ModelAndView reservationDetail(CommandMap commandMap) throws Exception {
        ModelAndView mv = new ModelAndView("/reservation/reservationDetail");

        Map<String, Object> map = reservationService.selectReservationDetail(commandMap.getMap());

        mv.addObject("map", map.get("map"));
        mv.addObject("list", map.get("list"));

        return mv;
    }


}
