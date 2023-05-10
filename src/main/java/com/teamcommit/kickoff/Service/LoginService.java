package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.UserDO;

import java.util.Map;

public interface LoginService {
    //회원가입시 회원 정보 저장
//    boolean member_insert(UserDO userDO);
//
//    //마이페이지에서 회원 정보 확인
//    UserDO member_select(String userId);

    //로그인 처리
    //HashMap : 키와 밸류를 갖는 데이터 타입
    //Map : 사물함, Key : 열쇠, Value : 자료
    UserDO member_login(Map<String, String> map);

//    //아이디 중복 확인
//    boolean member_id_check(String userId);
//
//    //마이페이지에서 회원 정보 변경 저장
//    boolean member_update(UserDO userDO);
//
//    //회원 정보 탈퇴
//    boolean member_delete(String userId);
}
