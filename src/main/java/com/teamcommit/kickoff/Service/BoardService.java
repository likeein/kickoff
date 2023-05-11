package com.teamcommit.kickoff.service;

import com.teamcommit.kickoff.Do.BoardDO;

import java.util.List;

/*아인님 화이팅 */
public interface BoardService {

    List<BoardDO> getList(BoardDO boardDO);

    void insertBoard(BoardDO boardDO);

    BoardDO getBoardContents(int boardSeqno);

    void updateBoard(BoardDO boardDO);

    void getBoardDelete(int boardSeqno);
}
