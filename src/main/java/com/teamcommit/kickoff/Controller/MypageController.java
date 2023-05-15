package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Do.ReservationDO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class MypageController {

    @RequestMapping(value = "/myReservation")
    public String myReservationList() throws Exception {
        String view = "/mypage/myReservation";

        return view;
    }

    @RequestMapping(value = "/myBoardList")
    public String myBoardList() throws Exception {
        String view = "/mypage/myBoard";

        return view;
    }

    @RequestMapping(value = "/myInfo")
    public String myInfoList() throws Exception {
        String view = "/mypage/myInfo";

        return view;
    }

    @RequestMapping(value = "/myTeam")
    public String myTeamList() throws Exception {
        String view = "/mypage/myTeam";

        return view;
    }

    @RequestMapping(value = "/myMessage")
    public String myMessageList() throws Exception {
        String view = "/mypage/myMessage";

        return view;
    }

    @RequestMapping(value = "/myHelper")
    public String myHelperList() throws Exception {
        String view = "/mypage/myHelper";

        return view;
    }
}
