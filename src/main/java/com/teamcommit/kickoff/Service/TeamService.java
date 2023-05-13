package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.TeamDO;

import java.util.List;

public interface TeamService {

    List<TeamDO> getList(TeamDO teamDO) throws Exception;

//    void insertTeam(TeamDO teamDO) throws Exception;

    TeamDO getTeamContents(String teamName) throws Exception;

//    void updateTeam(TeamDO teamDO) throws Exception;

}
