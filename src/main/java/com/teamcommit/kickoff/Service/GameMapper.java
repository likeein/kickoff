package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.GameDO;
import com.teamcommit.kickoff.Do.TeamDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GameMapper {
    public List<GameDO> gameDetail();

    public GameDO getGameScoreDetail(int gameSeqno);

    Map<String, Object> selectMemInfo(Map<String, Object> map);

    public void insertGame(GameDO gameDO);
}
