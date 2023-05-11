package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;


@Service("loginService")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public UserDO member_login(HashMap<String, String> map) {
        return loginMapper.member_login(map);
    }

}
