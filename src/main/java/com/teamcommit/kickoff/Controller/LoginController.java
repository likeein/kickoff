package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.UserDO;
import com.teamcommit.kickoff.Service.LoginService;
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

    // 회원 로그인 요청
    @RequestMapping("/loginAll")
    public ModelAndView login(@ModelAttribute("userDO") UserDO userDO, @RequestParam("userId") String userId, @RequestParam("userPw") String userPw, HttpSession session, Model model) throws Exception {

        userDO.setUserId(userId);
        userDO.setUserPw(userPw);

        UserDO result = this.loginService.member_login(userDO);

        if (result != null) {
            ModelAndView mv = new ModelAndView("redirect:/main");
            return mv;
        } else {
            ModelAndView mv = new ModelAndView("redirect:/loginAll");
            session.removeAttribute("login_info");  // 로그인 실패 시 로그아웃 처리
            return mv;
        }
    }

//    // 업체 로그인 요청
//    @PostMapping({"/loginAll"})
//    public String login(String userId, String userPw, HttpSession session) {
//        UserDO userDO = new UserDO();
//        userDO.setUserId(userId);
//        userDO.setUserPw(userPw);
//        UserDO result = this.loginService.member_login(userDO);
//        if (result != null) {
//            session.setAttribute("login_info", result);
//            return "redirect:/main";
//        } else {
//            return "redirect:/login/loginAll";
//        }
//    }

    // 로그아웃
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("login_info");
        return "redirect:/main";
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

    @GetMapping("/findEmp")
    public String findEmp() {
        String view = "/login/findEmp";

        return view;
    }

    @GetMapping("/findId")
    public String findId() {
        String view = "/login/findId";

        return view;
    }

    @GetMapping("/findPw")
    public String findPw() {
        String view = "/login/findPw";

        return view;
    }

    @GetMapping("/findUser")
    public String findUser() {
        String view = "/login/findUser";

        return view;
    }
}
