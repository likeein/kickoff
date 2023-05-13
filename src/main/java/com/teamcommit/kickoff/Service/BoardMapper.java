package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.ReportDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    public List<BoardDO> getList(BoardDO boardDO);

    public  void insertBoard(BoardDO boardDO);

    public BoardDO getBoardContents(int boardSeqno);

    public void updateBoard(BoardDO boardDO);

    public void getBoardDelete(int boardSeqno);

    public void reportBoard(ReportDO reportDO);

    public Integer procGetMaxSeqno();

    //조회수 증가
    public void procAddViewCount(BoardDO boardDO);
}