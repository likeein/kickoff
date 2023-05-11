package com.teamcommit.kickoff.Controller;

import com.teamcommit.kickoff.Do.BoardDO;
import com.teamcommit.kickoff.Service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class BoardController {

    @Qualifier("BoardService")
    @Autowired
    private BoardService boardService;

    @RequestMapping(value = "/board", method = RequestMethod.GET)
    public String Boardlist(@ModelAttribute("boardDO") BoardDO boardDO, HttpServletRequest request, Model model) {

        String view = "/board/board";

        List<BoardDO> boardList = boardService.getList(boardDO);
        model.addAttribute("boardList", boardList);

        return view;
    }

    @RequestMapping(value = "/boardInsert", method =  RequestMethod.GET)
    public String insert(@ModelAttribute("boardDO") BoardDO boardDO, Model model) {
        String view = "/board/boardInsert";

        return view;
    }

    @RequestMapping(value = "/insert_action", method =  RequestMethod.POST)
    public String insert_action(@ModelAttribute("boardDO") BoardDO boardDO, HttpServletRequest request, RedirectAttributes redirect) {

        String view = "/board/boardDetailWritter";

        try{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

            Date time = new Date();

            String time1 = format.format(time);
            boardDO.setWriteRegDate(time1);

            boardService.insertBoard(boardDO);

            redirect.addFlashAttribute("redirect", boardDO.getBoardSeqno());
            redirect.addFlashAttribute("msg", "등록이 완료되었습니다.");
        } catch (Exception e) {
            redirect.addFlashAttribute("msg", "오류가 발생되었습니다.");
        }

        return "redirect:/board/insert_action";
    }

    @RequestMapping(value = "/boardDetailWritter", method = RequestMethod.GET)
    public String boardDetailWritter(@ModelAttribute("boardDO") BoardDO boardDO, HttpServletRequest request, Model model) {

        String view = "/board/boardDetailWritter";

        Map<String, ?> inputFlashMap = RequestContextUtils.getInputFlashMap(request);
        if (null != inputFlashMap){
            model.addAttribute("msg", (String) inputFlashMap.get("msg"));
        }

        return view;
    }

    @RequestMapping(value = "/boardDetail", method = RequestMethod.GET)
    public String boardDetail(@ModelAttribute("boardDO") BoardDO boardDO, @RequestParam("boardSeqno") int boardSeqno, Model model) {
        String view = "/board/boardDetail";

        BoardDO boardContents = boardService.getBoardContents(boardSeqno);
        model.addAttribute("boardContents", boardContents);

        return view;
    }

    @RequestMapping(value = "/boardUpdate", method = RequestMethod.GET)
    public String boardUpdate(@ModelAttribute("boardDO") BoardDO boardDO, @RequestParam("boardSeqno") int boardSeqno, Model model) {
        String view = "/board/boardUpdate";

        BoardDO boardContents = boardService.getBoardContents(boardSeqno);
        model.addAttribute("boardContents", boardContents);

        return view;
    }

    @RequestMapping(value = "/update_action", method = RequestMethod.POST)
    public String update_acttion(@ModelAttribute("boardDO") BoardDO boardDO, HttpServletRequest request, RedirectAttributes redirect, Model model) {

        try {
            boardService.updateBoard(boardDO);
            redirect.addFlashAttribute("redirect", boardDO.getBoardSeqno());

            redirect.addFlashAttribute("msg", "수정이 완료되었습니다.");
        } catch (Exception e) {
            redirect.addFlashAttribute("msg", "오류가 발생되었습니다.");
        }

        return "redirect:/boardDetailWritter?boardSeqno=" + boardDO.getBoardSeqno();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@ModelAttribute("boardDO") BoardDO boardDO, @RequestParam("boardSeqno") int boardSeqno, RedirectAttributes redirect, Model model) {

        try {
            boardService.getBoardDelete(boardSeqno);
            redirect.addFlashAttribute("msg", "삭제가 완료되었습니다.");
        } catch (Exception e) {
            redirect.addFlashAttribute("msg", "오류가 발생되었습니다.");
        }

        return "redirect:/board";
    }

    @RequestMapping(value = "/boardReport", method = RequestMethod.GET)
    public String boardReport() {
        String view = "/board/boardReport";

        return view;
    }

}
