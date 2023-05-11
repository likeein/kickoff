package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.BoardDO;

import java.util.List;

public interface BoardService {

    List<BoardDO> getList(BoardDO boardDO);

    void insertBoard(BoardDO boardDO) throws Exception;

    BoardDO getBoardContents(int boardSeqno);

    void updateBoard(BoardDO boardDO) throws Exception;

    void getBoardDelete(int boardSeqno) ;
}
