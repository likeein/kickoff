package com.teamcommit.kickoff.service;

import com.teamcommit.kickoff.Do.BoardDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("BoardService")
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public List<BoardDO> getList(BoardDO boardDO){
        return boardMapper.getList(boardDO);
    }

    @Override
    public void insertBoard(BoardDO boardDO) {
        boardMapper.insertBoard(boardDO);
    }

    @Override
    public BoardDO getBoardContents(int boardSeqno) {
        return boardMapper.getBoardContents(boardSeqno);
    }

    @Override
    public void updateBoard(BoardDO boardDO) {
        boardMapper.updateBoard(boardDO);
    }

    @Override
    public void getBoardDelete(int boardSeqno) {
        boardMapper.getBoardDelete(boardSeqno);
    }
}
