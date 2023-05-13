package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.MessageDO;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessageMapper {
    public void insertMessage(MessageDO messageDO);
}
