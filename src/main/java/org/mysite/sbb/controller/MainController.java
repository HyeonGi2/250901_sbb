/*------------------------
250901 홍현기
8080 url 호출 시 404 오류페이지가 아닌 질문 목록 화면 출력을 위해 수정.
기본화면은 root라 칭하고 이 프로젝트는 질문 목록을 기본페이지로한다.

-------------------------*/
package org.mysite.sbb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "index";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }

}
