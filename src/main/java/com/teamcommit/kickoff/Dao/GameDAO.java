package com.teamcommit.kickoff.Dao;

import com.teamcommit.kickoff.Common.AbstractDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("gameDAO")
public class GameDAO extends AbstractDAO {

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
