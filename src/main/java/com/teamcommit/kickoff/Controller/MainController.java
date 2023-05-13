package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.GameDO;
import com.teamcommit.kickoff.Do.ReservationDO;
import com.teamcommit.kickoff.Service.BoardService;
import com.teamcommit.kickoff.Service.GameService;
import com.teamcommit.kickoff.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class MainController {

	@Autowired
	private BoardService boardService;

	@Autowired
	private GameService gameService;

	@Autowired
	private ReservationService reservationService;


	@GetMapping("/main")
	public String main(@ModelAttribute("boardDO") BoardDO boardDO, @ModelAttribute("reservationDO") ReservationDO reservationDO, @ModelAttribute("gameDO") GameDO gameDO, Model model) {
		String view = "/main";

		try {
			List<ReservationDO> reservationList = reservationService.selectReservationList(reservationDO);
			model.addAttribute("resList", reservationList);

			List<GameDO> gameList = gameService.gameDetail(gameDO);
			model.addAttribute("gameList", gameList);

			List<BoardDO> boardList = boardService.getList(boardDO);
			model.addAttribute("boardList", boardList);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return view;
	}
}
