package com.gaesenak.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="maljjong/*") //maljjong 폴더의 views를 호출하려면 해당 컨트롤러 통해 호출
public class MaljjongController {
	
	@RequestMapping("maljjongBoard")
    private String getBoard() throws Exception {
        return "maljjong/maljjongBoard";
    }
	
	@RequestMapping("maljjongDetailViewer")
    private String getDetailViewer() throws Exception {
        return "maljjong/maljjongDetailViewer";
    }
}
