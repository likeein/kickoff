package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.EmployerDO;
import com.teamcommit.kickoff.Do.UserDO;
import com.teamcommit.kickoff.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

//    @Autowired
//    private AccountService accountService;
//
//    @RequestMapping(value = "/account/register", method = RequestMethod.GET)
//    public String register() {
//
//        return "/account/register";
//    }
//
//    @RequestMapping(value = "/account/login", method = RequestMethod.GET)
//    public String login() {
//
//        return "/account/login";
//    }

    @Resource(name="loginService")
    private LoginService loginService;


    @GetMapping("/loginAll")
    public String loginAll() {
        String view = "/login/loginAll";

        return view;
    }

    // 로그인 요청
    @RequestMapping("/loginAll")
    public ModelAndView login(@RequestParam(value = "userId", required = false) String userId,
                              @RequestParam(value = "userPw", required = false) String userPw,
                              @RequestParam(value = "empId", required = false) String empId,
                              @RequestParam(value = "empPw", required = false) String empPw,
                              HttpSession session, Model model) throws Exception {
        if (userId != null && userPw != null) {
            // 회원 로그인 처리
            UserDO userDO = new UserDO();
            userDO.setUserId(userId);
            userDO.setUserPw(userPw);
            UserDO result = this.loginService.member_login(userDO);

            if (result != null) {
                ModelAndView mv = new ModelAndView("redirect:/main");
                session.setAttribute("login_info", result);
                return mv;
            }
        } else if (empId != null && empPw != null) {
            // 업체 로그인 처리
            EmployerDO empDO = new EmployerDO();
            empDO.setEmpId(empId);
            empDO.setEmpPw(empPw);
            EmployerDO result = this.loginService.emp_login(empDO);

            if (result != null) {
                ModelAndView mv = new ModelAndView("redirect:/main");
                session.setAttribute("login_info", result);
                return mv;
            }
        }

        // 로그인 실패 시 로그아웃 처리
        ModelAndView mv = new ModelAndView("redirect:/loginAll");
        session.removeAttribute("login_info");
        return mv;
    }


    // 로그아웃
    @GetMapping("/logout")
    public ModelAndView logout(HttpSession session) {
        session.removeAttribute("login_info");
        ModelAndView mv = new ModelAndView("redirect:/main");
        return mv;
    }

    @GetMapping("/loginAgree")
    public String loginAgree() {
        String view = "/login/loginAgree";

        return view;
    }

    @GetMapping("/loginAgreeEmp")
    public String loginAgreeEmp() {
        String view = "/login/loginAgreeEmp";

        return view;
    }

    @GetMapping("/Signup")
    public String Signup() {
        String view = "/login/Signup";

        return view;
    }

    @GetMapping("/SignupEmp")
    public String SignupEmp() {
        String view = "/login/SignupEmp";

        return view;
    }

    // 개인 회원 아이디,비밀번호 찾기 페이지 이동
    @GetMapping("/findUser")
    public String findUser() {
        String view = "/login/findUser";

        return view;
    }

    // 개인 회원 아이디 찾기
    @RequestMapping("/findUser")
    public String findUser_id(@RequestParam("userName") String userName,@RequestParam("userPhoneNumber") String userPhoneNumber) {

        String result = this.loginService.findUser_id(userName, userPhoneNumber);

        return result;
    }


    // 업체 회원 아이디,비밀번호 찾기 페이지 이동
    @GetMapping("/findEmp")
    public String findEmp() {
        String view = "/login/findEmp";

        return view;
    }

    // 찾은 아이디 보는 페이지 이동
    @GetMapping("/findId")
    public String findId() {
        String view = "/login/findId";

        return view;
    }

    // 찾은 아이디 보기
//    @RequestMapping("/findUser")
//    public String listUser_id(@RequestParam("userId") String userId) {
//
//        String result = this.loginService.listUser_id(userName, userPhoneNumber);
//
//        return result;
//    }

    // 찾은 비밀번호 보는 페이지 이동
    @GetMapping("/findPw")
    public String findPw() {
        String view = "/login/findPw";

        return view;
    }

}
