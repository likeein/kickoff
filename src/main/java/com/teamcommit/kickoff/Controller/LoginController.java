package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Do.UserDO;
import com.teamcommit.kickoff.Service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


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

    @Resource
    private LoginService loginService;

    @GetMapping("/loginAll")
    public String loginAll() {
        String view = "/login/loginAll";

        return view;
    }

    // 로그인 요청
    @ResponseBody
    @RequestMapping("/login")
    public String login(String userId, String userPw, HttpSession session) {
        //화면에서 입력한 아이디와 비밀번호가 일치하는 회원 정보가 DB에 있는지 확인하여
        Map<String, String> map = new HashMap<String, String>();

        map.put("id", userId);
        map.put("pw", userPw);
       UserDO userDO = loginService.member_login(map);

        //일치하는 회원 정보가 있다면 회원 정보를 세션에 담는다
        session.setAttribute("login_info", userDO);

        return userDO == null ? "false" : "true";
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
