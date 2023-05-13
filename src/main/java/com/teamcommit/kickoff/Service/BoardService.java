package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.ReportDO;

import java.util.List;
import java.util.Map;

public interface BoardService {

    List<BoardDO> getList(BoardDO boardDO) throws Exception;

    void insertBoard(BoardDO boardDO) throws Exception;

    BoardDO getBoardContents(int boardSeqno) throws Exception;

    void updateBoard(BoardDO boardDO) throws Exception;

    void getBoardDelete(int boardSeqno) throws Exception;

    void reportBoard(ReportDO reportDO) throws Exception;

    Integer procGetMaxSeqno() throws Exception;
}
