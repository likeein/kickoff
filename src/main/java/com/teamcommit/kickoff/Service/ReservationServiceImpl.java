package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Dao.ReservationDAO;
import com.teamcommit.kickoff.Do.ReservationDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service("reservationService")
public class ReservationServiceImpl implements ReservationService {


/*    @Override
    public Map<String, Object> selectMemInfo(Map<String, Object> map) throws Exception {
        return reservationDAO.selectMemInfo(map);
    }*/

    @Resource(name = "reservationDAO")
    private ReservationDAO reservationDAO;

    @Autowired
    private ReservationMapper mapper;

    @Override
    public List<ReservationDO> selectReservationList(ReservationDO reservationDO) throws Exception {
        return mapper.selectReservationList(reservationDO);
    }

    @Override
    public void insertReservation(ReservationDO reservationDO) throws Exception {
        reservationDAO.insertReservation(reservationDO);
    }


}




