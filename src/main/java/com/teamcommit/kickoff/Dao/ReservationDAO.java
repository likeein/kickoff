package com.teamcommit.kickoff.Dao;

import com.teamcommit.kickoff.Common.AbstractDAO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("reservationDAO")
public class ReservationDAO extends AbstractDAO {

/*    @SuppressWarnings("unchecked")
    public Map<String, Object> selectMemInfo(Map<String, Object> map) throws Exception {
        return (Map<String, Object>) selectOne("reservation.selectMemInfo", map);
    }*/

    public void insertReservation(Map<String, Object> map) throws Exception {
        insert("com.teamcommit.kickoff.Dao.reservation.insertReservation", map);
    }

    @SuppressWarnings("unchecked")
    public Map<String, Object> selectReservationDetail(Map<String, Object> map) throws Exception {
        return (Map<String, Object>) selectOne("reservation.selectReservationDetail", map);
    }

    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> selectFileList(Map<String, Object> map) throws Exception {
        return (List<Map<String, Object>>) selectList("reservation.selectFileList", map);
    }


}
