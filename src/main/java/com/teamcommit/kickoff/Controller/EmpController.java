package com.teamcommit.kickoff.Controller;


import com.teamcommit.kickoff.Common.CommandMap;
import com.teamcommit.kickoff.Do.*;
import com.teamcommit.kickoff.Service.BoardService;
import com.teamcommit.kickoff.Service.EmpService;
import com.teamcommit.kickoff.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class EmpController {

    @Qualifier("EmpService")
    @Autowired
    private EmpService empService;

    @Autowired
    private BoardService boardService;

    @Autowired
    private LoginService loginService;

    @GetMapping("/empReservation")
    public String empReservation(@ModelAttribute("reservationDO") ReservationDO reservationDO, Model model) {
        String view = "/emp/empReservation";

        try {
            List<ReservationDO> list = empService.selectReservation(reservationDO);
            model.addAttribute("table", list);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }


    @RequestMapping( "/myBoard")
    public String boardList(@ModelAttribute("boardDO") BoardDO BoardDO, HttpServletRequest request, Model model) throws Exception {

        String view = "/emp/myBoard";

        //로그인한 업체ID로 로그인 정보 가져오기
        String empId = (String) request.getSession().getAttribute("empId");

        List<BoardDO> boardList = boardService.getList(BoardDO);
        model.addAttribute("boardList", boardList);

        return view;
    }

    @RequestMapping("/fixInfo")
    public ModelAndView fixInfo(@ModelAttribute("empDO") EmployerDO employerDO, @RequestParam("empId") String empId, @RequestParam("empPw") String empPw, @RequestParam("empName") String empName, @RequestParam("empAddress") String empAddress, @RequestParam("empPhoneNumber") String empPhoneNumber, @RequestParam("empEmail") String empEmail, HttpSession session, Model model) throws Exception {

        // EmployerDO.setEmpId(empId);
        // EmployerDO.setEmpPw(empPw);

        EmployerDO result = this.empService.info_fix(employerDO);

        if (result != null) {
            ModelAndView mv = new ModelAndView("redirect:/fixInfo"); // 바뀐 회원정보 조회로 가고 싶음
            session.setAttribute("fixed_info", result);
            return mv;
        } else {
            ModelAndView mv = new ModelAndView("redirect:/fixInfo");
            session.removeAttribute("fixed_info");  // 로그인 실패 시 로그아웃 처리
            return mv;
        }
    }

    /* 풋살장 등록 */
    @GetMapping("/empFutsal")
    public String empFutsal() {
        String view = "/emp/empFutsal";

        return view;
    }

    @RequestMapping("/empFutsal")
    public ModelAndView empFutsal(CommandMap commandMap, HttpServletRequest request) throws Exception {

        ModelAndView mv = new ModelAndView("redirect:/empFutsalFix");

        empService.insertFutsal(commandMap.getMap(), request);

        return mv;
    }


    /* 풋살장 목록
    @RequestMapping(value = "/empFutsalFix", method = RequestMethod.GET)
    public String Boardlist(@ModelAttribute("PlaceDO") PlaceDO PlaceDO, HttpServletRequest request, Model model) {

        String view = "/emp/empFutsalFix";

        List<PlaceDO> boardList = empService.getList(PlaceDO);
        model.addAttribute("boardList", boardList);

        return view;
    } */

}
