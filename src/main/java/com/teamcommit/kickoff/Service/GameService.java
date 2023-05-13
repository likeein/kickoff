package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.GameDO;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.List;

public interface GameService {

    List<GameDO> gameDetail(GameDO gameDO) throws Exception;

    List<GameDO> selectGameDetail() throws Exception;

    Map<String, Object> selectMemInfo(Map<String, Object> map) throws Exception;

}