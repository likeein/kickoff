package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Dao.PlaceDAO;
import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Do.EmployerDO;
import com.teamcommit.kickoff.Do.PlaceDO;
import com.teamcommit.kickoff.Do.ReservationDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Service("EmpService")
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    public EmployerDO info_fix(EmployerDO employerDO) { return this.empMapper.info_fix(employerDO); }

    @Override
    public List<BoardDO> getList(BoardDO boardDO) {
        return empMapper.getList(boardDO);
    }

    @Override
    public List<PlaceDO> getList(PlaceDO placeDO) { return empMapper.getList(placeDO); }

    @Resource(name = "placeDAO")
    private PlaceDAO placeDAO;

    @Override
    public void insertFutsal(Map<String, Object> map, HttpServletRequest request) throws Exception {
        placeDAO.insertFutsal(map);
    }

    @Override
    public List<ReservationDO> getList() throws Exception {
        return null;
    }

}