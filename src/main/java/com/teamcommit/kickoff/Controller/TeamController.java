package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.HelperDO;
import com.teamcommit.kickoff.Do.TeamDO;
import com.teamcommit.kickoff.Do.UserDO;
import com.teamcommit.kickoff.Service.BoardService;
import com.teamcommit.kickoff.Service.LoginService;
import com.teamcommit.kickoff.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class TeamController {

    @Autowired
    @Qualifier("TeamService")
    private TeamService teamService;

    @Autowired
    private LoginService loginService;

    // 팀 목록
    @RequestMapping(value = "/team", method = RequestMethod.GET)
    public String TeamList(@ModelAttribute("teamDO") TeamDO teamDO, HttpServletRequest request, Model model) throws Exception {

        String view = "/team/team";

        List<TeamDO> teamList = teamService.getList(teamDO);
        model.addAttribute("teamList", teamList);

        return view;
    }

    // 팀 게시글 상세보기
    @RequestMapping( "/teamDetail")
    public String teamDetail(@ModelAttribute("teamDO") TeamDO teamDO, @RequestParam(value = "teamName") String teamName, Model model) throws Exception {
        String view = "/team/teamDetail";

        TeamDO teamContents = teamService.getTeamContents(teamName);
        model.addAttribute("teamContents", teamContents);

        return view;
    }

    // 팀 등록
    @RequestMapping("/teamInsert")
    public String teamInsert(@ModelAttribute("teamDO") TeamDO teamDO, Model model, HttpSession session) throws Exception {
        String view = "/team/teamInsert";

        if(session.getAttribute("userId") == null) {
            model.addAttribute("script", "alert('로그인 후 이용이 가능합니다.');");
            view = "login/loginAll";
        }
        else if (session.getAttribute("userId") != null) {
            try {
                teamService.insertTeam(teamDO);
                model.addAttribute("script", "alert('팀 등록을 완료하였습니다.');");
            }
            catch (Exception e) {
                e.printStackTrace();
                model.addAttribute("script", "alert('중복된 값이거나 양식이 올바르지 않습니다.');");
            }
        }
        return view;
    }

    // 팀 랭킹
    @GetMapping("/teamRank")
    public String teamRank() {
        String view = "/team/teamRank";

        return view;
    }
}
