package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.GameDO;
import com.teamcommit.kickoff.Do.TeamDO;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.List;

public interface GameService {

    List<GameDO> gameDetail() throws Exception;

    GameDO getGameScoreDetail(int gameSeqno) throws Exception;

    Map<String, Object> selectMemInfo(Map<String, Object> map) throws Exception;

    void insertGame(GameDO gameDO) throws Exception;

}