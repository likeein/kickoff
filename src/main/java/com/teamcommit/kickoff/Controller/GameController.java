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
    public String game() {
        String view = "/game/game";

        return view;
    }

    @GetMapping("/gameUpdate")
    public String gameUpdate() {
        String view = "/game/gameUpdate";

        return view;
    }

    @GetMapping("/gameDetail")
    public String gameDetail() {
        String view = "/game/gameDetail";

        return view;
    }

    @GetMapping("/gameFix")
    public String gameFix() {
        String view = "/game/gameFix";

        return view;
    }

    @GetMapping("/gameScore")
    public String gameScore() {
        String view = "/game/gameScore";

        return view;
    }
}