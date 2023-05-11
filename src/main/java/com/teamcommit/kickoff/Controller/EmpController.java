package com.teamcommit.kickoff.Controller;


import com.teamcommit.kickoff.Service.EmpService;
import com.teamcommit.kickoff.Do.EmployerDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
public class EmpController {

    @GetMapping("/empReservation")
    public String empReservation() {
        String view = "/emp/empReservation";

        return view;
    }

    @Qualifier("EmpService")
    @Autowired
    private EmpService empService;

    @RequestMapping(value = "/myBoard", method = RequestMethod.GET)
    public String Boardlist(@ModelAttribute("EmployerDO") EmployerDO EmployerDO, HttpServletRequest request, Model model) {

        String view = "/emp/myBoard";

        List<EmployerDO> boardList = EmpService.getList(EmployerDO);
        model.addAttribute("boardList", boardList);

        return view;
    }

    @GetMapping("/empFutsal")
    public String empFutsal() {
        String view = "/emp/empFutsal";

        return view;
    }

    /* empFutsal이 등록이고 empFutsalFix가 목록임 */
    @GetMapping("/empFutsalFix")
    public String empFutsalFix() {
        String view = "/emp/empFutsalFix";

        return view;
    }

}
