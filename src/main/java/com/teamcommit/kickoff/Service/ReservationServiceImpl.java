package com.teamcommit.kickoff.Service;

import com.teamcommit.kickoff.Dao.ReservationDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("reservationService")
public class ReservationServiceImpl implements ReservationService {

    @Resource(name="reservationDAO")
    private ReservationDAO reservationDAO;

    @Override
    public Map<String, Object> selectMemInfo(Map<String, Object> map) throws Exception {
        return reservationDAO.selectMemInfo(map);
    }

    @Override
    public void insertReservation(Map<String, Object> map, HttpServletRequest request) throws Exception {
        reservationDAO.insertReservation(map);
    }

    @Override
    public Map<String, Object> selectReservationDetail(Map<String, Object> map) throws Exception {
        /* 조회수를 보여줘야할까? 고민해보자 */

        Map<String,Object> resultMap = new HashMap<String, Object>();
        Map<String,Object> tempMap = reservationDAO.selectBoardDetail(map);
        resultMap.put("map", tempMap);

        /* 사진 하나인데, List로 넘겨야할까? */
        List<Map<String,Object>> list = reservationDAO.selectFileList(map);
        resultMap.put("list", list);

        return resultMap;
    }


}
