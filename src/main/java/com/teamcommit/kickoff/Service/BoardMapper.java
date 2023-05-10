package com.teamcommit.kickoff.service;

import com.teamcommit.kickoff.Do.BoardDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    public List<BoardDO> getList(BoardDO boardDO);

    public  void insertBoard(BoardDO boardDO);

    public BoardDO getBoardContents(int boardSeqno);

    public void updateBoard(BoardDO boardDO);

    public void getBoardDelete(int boardSeqno);
}
