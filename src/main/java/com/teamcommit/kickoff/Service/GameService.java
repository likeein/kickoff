package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.GameDO;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.List;

public interface GameService {

    void gameDetail(Map<String, Object> map, HttpServletRequest request) throws Exception;

    List<GameDO> selectGameDetail() throws Exception;

    Map<String, Object> selectMemInfo(Map<String, Object> map) throws Exception;

}