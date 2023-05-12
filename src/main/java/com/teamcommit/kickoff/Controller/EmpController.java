package com.teamcommit.kickoff.Controller;


import com.teamcommit.kickoff.Common.CommandMap;
import com.teamcommit.kickoff.Do.*;
import com.teamcommit.kickoff.Service.EmpService;
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

    @GetMapping("/empReservation")
    public String empReservation(Model model) {
        String result = "";

        try{
            List<ReservationDO> list = empService.getList();
                for (ReservationDO reservation : list) {
                    result += "<tr><td>" + reservation.getRESERVATION_DATE() + "</td><td>" + reservation.getRESERVATION_NUMBER() +
                            "</td><td>" + reservation.getRESERVATION_REG_DATE() + "</td><td>" + reservation.getRESERVATION_START_TIME() +
                            "</td><td>" + reservation.getRESERVATION_STATUS() + "</td><td>" + reservation.getRESERVATION_CANCEL() + "</td></tr>";
                }
                model.addAttribute("table", result);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            return "/emp/empReservation";

    }


    @RequestMapping(value = "/myBoard", method = RequestMethod.GET)
    public String Boardlist(@ModelAttribute("BoardDO") BoardDO BoardDO, HttpServletRequest request, Model model) {

        String view = "/emp/myBoard";

        List<BoardDO> boardList = empService.getList(BoardDO);
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


    /* 풋살장 목록 */
    @RequestMapping(value = "/empFutsalFix", method = RequestMethod.GET)
    public String Boardlist(@ModelAttribute("PlaceDO") PlaceDO PlaceDO, HttpServletRequest request, Model model) {

        String view = "/emp/empFutsalFix";

        List<PlaceDO> boardList = empService.getList(PlaceDO);
        model.addAttribute("boardList", boardList);

        return view;
    }

}
