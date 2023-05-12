package com.teamcommit.kickoff.Dao;

import com.teamcommit.kickoff.Common.AbstractDAO;
import com.teamcommit.kickoff.Do.GameDO;
import com.teamcommit.kickoff.Do.HelperDO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("gameDAO")
public class GameDAO extends AbstractDAO {

    public List<GameDO> selectGameDetail() throws Exception {
        return (List<GameDO>) selectList("game.selectGameDetail");
    }

    @SuppressWarnings("unchecked")
    public Map<String, Object> selectMemInfo(Map<String, Object> map) throws Exception {
        return (Map<String, Object>) selectOne("game.selectMemInfo", map);
    }

    @SuppressWarnings("unchecked")
    public Map<String, Object> selectGameDetail(Map<String, Object> map) throws Exception {
        return (Map<String, Object>) selectOne("qna.selectBoardDetail", map);
    }


    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> selectFileList(Map<String, Object> map) throws Exception {
        return (List<Map<String, Object>>) selectList("qna.selectFileList", map);
    }

}
