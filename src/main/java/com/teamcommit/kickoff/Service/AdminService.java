package com.teamcommit.kickoff.Service;

import javax.servlet.http.HttpSession;

import com.teamcommit.kickoff.Do.UserDO;

public interface AdminService {

    void admin_member_forced_evictionCheck(UserDO DO) throws Exception; //강제탈퇴 시킬때 해당 회원이 있는지 체크하는 메소드
}
