package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.UserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface LoginMapper {
    public UserDO member_login(HashMap<String, String> map);
}
