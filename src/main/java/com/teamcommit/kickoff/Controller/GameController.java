package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Common.CommandMap;
import com.teamcommit.kickoff.Do.GameDO;
import com.teamcommit.kickoff.Do.TeamDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.teamcommit.kickoff.Service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/game")
    public String gameDetail(@ModelAttribute("gameDO") GameDO gameDO, Model model) {
        String view = "/game/game";

        try {
            List<GameDO> list = gameService.gameDetail(gameDO);
            model.addAttribute("table", list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }

    @GetMapping("/gameScore")
    public String gameScore() {
        String view = "/game/gameScore";
        return view;
    }

    @PostMapping("/gameScore")
    public ModelAndView gameScore(@ModelAttribute("gameDO") GameDO gameDO, @RequestParam("gameSeqno") int gameSeqno, Model model) throws Exception {
        ModelAndView mv = new ModelAndView("/game/gameScore");

        try {
            GameDO gameScoreDetail = gameService.getGameScoreDetail(gameSeqno);
            model.addAttribute("gameScoreDetail", gameScoreDetail);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return mv;
    }

    @RequestMapping("/gameUpdate")
    public String insert(@ModelAttribute("gameDO") GameDO gameDO, HttpServletRequest request, Model model) throws Exception {
        String view = "/game/gameUpdate";
        String teamName = (String) request.getSession().getAttribute("teamName");
        TeamDO teamDO = new TeamDO();
        teamDO.setTeamName(teamName);

        return view;
    }
}





    /*
    @RequestMapping("/gameDetail")
    public ModelAndView gameDetail(CommandMap commandMap, HttpSession session) throws Exception {

        ModelAndView mv = new ModelAndView();

        Map<String, Object> map = new HashMap<String, Object>();

        if (session.getAttribute("user_id") != null) {
            String id = (String) session.getAttribute("user_id");
            map.put("id", id);
        } else if (session.getAttribute("emp_id") != null) {
            String id = (String) session.getAttribute("emp_id");
            map.put("id", id);
        }

        Map<String, Object> mem = gameService.selectMemInfo(map);

        mv.addObject("mem", mem);
        mv.setViewName("/game/gameDeatail");

        return mv;
    }

    @RequestMapping(value = "/gameUpdate")
    public ModelAndView gameUpdate(CommandMap commandMap, HttpServletRequest request) throws Exception {

        ModelAndView mv = new ModelAndView("redirect:/game");

        gameService.gameDetail(commandMap.getMap(), request);

        return mv;
    }
     */
