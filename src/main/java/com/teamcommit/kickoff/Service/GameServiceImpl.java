package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Dao.GameDAO;
import com.teamcommit.kickoff.Do.GameDO;
import com.teamcommit.kickoff.Do.HelperDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Service("gameService")
public class GameServiceImpl implements GameService {

    @Resource(name="gameDAO")
    private GameDAO gameDAO;

    @Autowired
    private GameMapper gameMapper;

    @Override
    public List<GameDO> gameDetail(GameDO gameDO) throws Exception {
        return gameMapper.gameDetail(gameDO);
    }

    @Override
    public List<GameDO> selectGameDetail() throws Exception {
        return gameDAO.selectGameDetail();
    }


    @Override
    public Map<String, Object> selectMemInfo(Map<String, Object> map) throws Exception {
        return gameDAO.selectMemInfo(map);
    }


}
