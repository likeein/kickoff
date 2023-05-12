package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.EmployerDO;
import com.teamcommit.kickoff.Do.UserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface LoginMapper {

    // 개인 회원 로그인
    public UserDO member_login(UserDO userDO);

    // 업체 회원 로그인
    public EmployerDO emp_login(EmployerDO empDO);

    // 개인 회원 아이디 찾기
    public String findUser_id(String userName, String userPhoneNumber);

    // 업체 회원 아이디 찾기
    public String findEmp_id(String empName, String empNo);
}