package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Dao.ReservationDAO;
import com.teamcommit.kickoff.Do.EmployerDO;
import com.teamcommit.kickoff.Do.ReservationDO;
import com.teamcommit.kickoff.Do.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service("reservationService")
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationMapper reservationMapper;

    @Override
    public List<ReservationDO> selectReservationList(ReservationDO reservationDO) throws Exception {
        return reservationMapper.selectReservationList(reservationDO);
    }

    @Override
    public void insertReservation(ReservationDO reservationDO) throws Exception {
        reservationMapper.insertReservation(reservationDO);
    }

    @Override
    public ReservationDO selectReservationDetail(int reservationNo) throws Exception {
        return reservationMapper.selectReservationDetail(reservationNo);
    }

    @Override
    public EmployerDO procSetUserInfo(EmployerDO employerDO) {
        return reservationMapper.procSetUserInfo(employerDO);
    }

}




