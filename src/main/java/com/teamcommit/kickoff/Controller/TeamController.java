package com.teamcommit.kickoff.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {

    @GetMapping("/team")
    public String teamList() {
        String view = "/team/team";

        return view;
    }

    @GetMapping("/teamInsert")
    public String teamInsert() {
        String view = "/team/teamInsert";

        return view;
    }

    @GetMapping("/teamRank")
    public String teamRank() {
        String view = "/team/teamRank";

        return view;
    }
}
