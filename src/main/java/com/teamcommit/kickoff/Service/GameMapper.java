package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.GameDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GameMapper {
    List<GameDO> gameDetail(GameDO gameDO);

    List<GameDO> selectGameDetail();

    Map<String, Object> selectMemInfo(Map<String, Object> map);
}
