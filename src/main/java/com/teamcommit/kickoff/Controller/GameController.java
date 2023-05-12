package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Common.CommandMap;
import com.teamcommit.kickoff.Do.GameDO;
import org.springframework.ui.Model;
import com.teamcommit.kickoff.Service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class GameController {

    @Resource(name = "gameService")
    private GameService gameService;

    @GetMapping("/game")
    public String gameList() {
        String view = "/game/game";

        return view;
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
}

