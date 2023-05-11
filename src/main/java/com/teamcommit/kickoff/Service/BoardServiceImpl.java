package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.ReplyDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("BoardService")
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public List<BoardDO> getList(BoardDO boardDO){
        return boardMapper.getList(boardDO);
    }

    @Override
    public void insertBoard(BoardDO boardDO) throws Exception {
        boardMapper.insertBoard(boardDO);
    }

    @Override
    public BoardDO getBoardContents(int boardSeqno) {
        return boardMapper.getBoardContents(boardSeqno);
    }

    @Override
    public void updateBoard(BoardDO boardDO) throws Exception {
        boardMapper.updateBoard(boardDO);
    }

    @Override
    public void getBoardDelete(int boardSeqno) {
        boardMapper.getBoardDelete(boardSeqno);
    }

    /*@Override
    public void writeReply(Map<String, Object> map) throws Exception {
        ReplyDO.insertReply(map);
    }

    @Override
    public void deleteReply(Map<String, Object> map) throws Exception {
        ReplyDO.deleteReply(map);
    }

    @Override
    public void updateReply(Map<String, Object> map) throws Exception {
        ReplyDO.updateReply(map);
    }*/

}
