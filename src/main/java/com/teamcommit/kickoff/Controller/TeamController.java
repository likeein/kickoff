package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.TeamDO;
import com.teamcommit.kickoff.Service.BoardService;
import com.teamcommit.kickoff.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TeamController {

    @Autowired
    @Qualifier("TeamService")
    private TeamService teamService;

    // 팀 목록
    @RequestMapping(value = "/team", method = RequestMethod.GET)
    public String TeamList(@ModelAttribute("teamDO") TeamDO teamDO, HttpServletRequest request, Model model) throws Exception {

        String view = "/team/team";

        List<TeamDO> teamList = teamService.getList(teamDO);
        model.addAttribute("teamList", teamList);

        return view;
    }

    // 팀 등록 페이지 이동
    @GetMapping("/teamInsert")
    public String teamInsert() {
        String view = "/team/teamInsert";

        return view;
    }

    // 팀 랭킹
    @GetMapping("/teamRank")
    public String teamRank() {
        String view = "/team/teamRank";

        return view;
    }
}
