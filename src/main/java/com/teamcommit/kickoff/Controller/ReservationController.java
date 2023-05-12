package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Do.ReservationDO;
import com.teamcommit.kickoff.Service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ReservationController {

    @Resource(name = "reservationService")
    private ReservationService reservationService;

/*    @GetMapping("/reservation")
    public String reservationList() {
        String view = "/reservation/reservation";

        return view;
    }*/

    @RequestMapping(value = "/reservation")
    public String reservationList(@ModelAttribute("reservationDO") ReservationDO reservationDO, Model model) throws Exception {

        List<ReservationDO> list = reservationService.selectReservationList(reservationDO);

        model.addAttribute("reservationList", list);

        return "/reservation/reservation";
    }

    @RequestMapping("/reservationInsertForm")
    public String reservationInsertForm(@ModelAttribute("reservationDO") ReservationDO reservationDO) {
        String view = "/reservation/reservationInsert";

        return view;
    }

    @RequestMapping("/reservationInsert")
    public ModelAndView reservationInsert(@ModelAttribute("reservationDO") ReservationDO reservationDO) throws Exception {

        ModelAndView mv = new ModelAndView("redirect:/reservation");

        reservationService.insertReservation(reservationDO);

        return mv;
    }
}






