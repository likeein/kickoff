package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.UserDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface LoginMapper {
    UserDO member_login(UserDO userDO);
}
