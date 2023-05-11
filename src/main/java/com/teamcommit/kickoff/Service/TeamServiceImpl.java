package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.TeamDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service("TeamService")
    public class TeamServiceImpl implements TeamService{

        @Autowired
        private TeamMapper teamMapper;

        @Override
        public List<TeamDO> getList(TeamDO teamDO){
            return teamMapper.getList(teamDO);
        }

//        @Override
//        public void insertTeam(TeamDO teamDO) throws Exception {
//
//        }
//
//        @Override
//        public void updateTeam(TeamDO teamDO) throws Exception {
//
//        }

    }
