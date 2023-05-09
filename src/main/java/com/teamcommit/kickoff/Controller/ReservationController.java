package com.teamcommit.kickoff.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ReservationController {

    @GetMapping("/reservation")
    public String reservationList() {
        String view = "/reservation/reservation";

        return view;
    }

}
