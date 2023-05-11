package com.teamcommit.kickoff.Dao;

import com.teamcommit.kickoff.Do.UserDO;
import com.teamcommit.kickoff.Service.LoginService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.HashMap;

@Repository
public class LoginDAO implements LoginService {
    @Resource
    private SqlSession sql;

    @Override
    public UserDO member_login(HashMap<String, String> map) {

        return sql.selectOne("login.member_login", map);
    }

}