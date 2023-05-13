package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.GameDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper

public interface GameMapper {
    List<GameDO> gameDetail(GameDO gameDO);
}
