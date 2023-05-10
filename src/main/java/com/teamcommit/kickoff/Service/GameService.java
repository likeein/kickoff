package com.teamcommit.kickoff.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface GameService {

    void gameDetail(Map<String, Object> map, HttpServletRequest request) throws Exception;

    Map<String, Object> selectGameDetail(Map<String, Object> map) throws Exception;

    Map<String, Object> selectMemInfo(Map<String, Object> map) throws Exception;

}