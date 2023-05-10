package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Common.CommandMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class ReservationController {

    @GetMapping("/reservation")
    public String reservationList() {
        String view = "/reservation/reservation";

        return view;
    }

    @GetMapping("/reservationInsert")
    public String reservationInsert() {
        String view = "/reservation/reservationInsert";

        return view;
    }

/*
    @RequestMapping("/reservationDetail")
    public ModelAndView reservationDetail(CommandMap commandMap) throws Exception {
        ModelAndView mv = new ModelAndView("/reservation/reservationDetail");

        Map<String, Object> map = reservationService.selectReservationDetail(commandMap.getMap());

        mv.addObject("map", map.get("map"));
        mv.addObject("list", map.get("list"));

        return mv;
    }*/


}
