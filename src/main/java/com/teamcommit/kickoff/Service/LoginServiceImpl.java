package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Dao.LoginDAO;
import com.teamcommit.kickoff.Do.UserDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginDAO loginDAO;

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
        return loginDAO.member_login(map);
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
