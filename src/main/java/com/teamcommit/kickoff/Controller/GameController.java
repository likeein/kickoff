package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Common.CommandMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller

public class GameController {

    @GetMapping("/game")
    public String reservationList() {
        String view = "/game/game";

        return view;
    }

    @GetMapping("/gameUpdate")
    public String reservationInsert() {
        String view = "/game/gameUpdate";

        return view;
    }
}