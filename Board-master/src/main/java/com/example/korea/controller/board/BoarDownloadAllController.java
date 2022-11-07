package com.example.korea.controller.board;

import com.example.korea.controller.SubController;
import com.example.korea.dto.BoardDTO;
import com.example.korea.service.BoardService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BoarDownloadAllController implements SubController {

    BoardService service = BoardService.getInstance();

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) {

        //읽고 있는 게시물 꺼내기
        HttpSession session = req.getSession();
        BoardDTO dto = (BoardDTO)session.getAttribute("dto");

        //서비스 실행(ZIP압축 다운메서드)
        boolean result = service.downloadAllZIP(dto,resp);



    }

}
