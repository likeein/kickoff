package com.teamcommit.kickoff.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class EmpController {

    @GetMapping("/empReservation")
    public String empReservation() {
        String view = "/emp/empReservation";

        return view;
    }

    @GetMapping("/fixInfo")
    public String fixInfo() {
        String view = "/emp/fixInfo";

        return view;
    }

    @GetMapping("/myBoard")
    public String myBoard() {
        String view = "/emp/myBoard";

        return view;
    }

    @GetMapping("/empFutsal")
    public String empFutsal() {
        String view = "/emp/empFutsal";

        return view;
    }

    @GetMapping("/empFutsalFix")
    public String empFutsalFix() {
        String view = "/emp/empFutsalFix";

        return view;
    }

}
