package com.teamcommit.kickoff.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

    @GetMapping("/board")
    public String boardList() {
        String view = "/board/board";

        return view;
    }

    @GetMapping("/boardInsert")
    public String boardInsert() {
        String view = "/board/boardInsert";

        return view;
    }

    @GetMapping("/boardDetail")
    public String boardDetail() {
        String view = "/board/boardDetail";

        return view;
    }

    @GetMapping("/boardDetailWritter")
    public String boardDetailWritter() {
        String view = "/board/boardDetailWritter";

        return view;
    }

    @GetMapping("/boardReport")
    public String boardReport() {
        String view = "/board/boardReport";

        return view;
    }

    @GetMapping("/boardUpdate")
    public String boardUpdate() {
        String view = "/board/boardUpdate";

        return view;
    }
}
