package com.teamcommit.kickoff.Dao;

import com.teamcommit.kickoff.Do.UserDO;
import com.teamcommit.kickoff.Service.LoginService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Map;

@Repository
public class LoginDAO implements LoginService {
    @Resource
    private SqlSession sql;

//    @Override
//    public boolean member_insert(UserDO userDO) {
//        // TODO Auto-generated method stub
//        return false;
//    }
//
//    @Override
//    public UserDO member_select(String userId) {
//        // TODO Auto-generated method stub
//        return null;
//    }

    @Override
    public UserDO member_login(Map<String, String> map) {
        return sql.selectOne("login.mapper.login", map);
    }

//    @Override
//    public boolean member_id_check(String userId) {
//        // TODO Auto-generated method stub
//        return false;
//    }
//
//    @Override
//    public boolean member_update(UserDO userDO) {
//        // TODO Auto-generated method stub
//        return false;
//    }
//
//    @Override
//    public boolean member_delete(String userId) {
//        // TODO Auto-generated method stub
//        return false;
//    }

}