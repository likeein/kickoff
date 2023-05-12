package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.EmployerDO;
import com.teamcommit.kickoff.Do.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    //개인 회원 로그인
    public UserDO member_login(UserDO userDO) {
        return this.loginMapper.member_login(userDO);
    }

    // 업체 회원 로그인
    public EmployerDO emp_login(EmployerDO empDO) {
        return this.loginMapper.emp_login(empDO);
    }

   // 개인 회원 아이디 찾기
    public String findUser_id(String userName, String userPhoneNumber) {

        return this.loginMapper.findUser_id(userName, userPhoneNumber);
    }

    // 업체 회원 아이디 찾기
    public String findEmp_id(String empName, String empNo) {
        return this.loginMapper.findEmp_id(empName, empNo);
    }
}
