package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.UserDO;

import java.util.HashMap;

public interface LoginService {

    UserDO member_login(HashMap<String, String> map);

}
