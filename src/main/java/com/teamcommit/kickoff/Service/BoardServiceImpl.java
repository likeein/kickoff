package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.ReplyDO;
import com.teamcommit.kickoff.Do.ReportDO;
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
    public List<BoardDO> getList(BoardDO boardDO) throws Exception {
        return boardMapper.getList(boardDO);
    }

    @Override
    public void insertBoard(BoardDO boardDO) throws Exception {
        boardMapper.insertBoard(boardDO);
    }

    @Override
    public BoardDO getBoardContents(int boardSeqno) throws Exception {
        return boardMapper.getBoardContents(boardSeqno);
    }

    @Override
    public void updateBoard(BoardDO boardDO) throws Exception {
        boardMapper.updateBoard(boardDO);
    }

    @Override
    public void getBoardDelete(int boardSeqno) throws Exception {
        boardMapper.getBoardDelete(boardSeqno);
    }

    @Override
    public void  reportBoard(ReportDO reportDO) throws Exception {
        boardMapper.reportBoard(reportDO);
    }

    @Override
    public Integer procGetMaxSeqno() throws Exception {
        return boardMapper.procGetMaxSeqno();
    }

}
