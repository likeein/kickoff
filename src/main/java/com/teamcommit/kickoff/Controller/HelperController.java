package com.teamcommit.kickoff.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelperController {

    @GetMapping("/helperList")
    public String helperList() {
        String view = "/helperList";

        return view;
    }



}
