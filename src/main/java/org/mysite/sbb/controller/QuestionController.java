/*------------------------
250901 홍현기
질문 컨트롤러 생성
엔티티가 데이터베이스 테이블 생성,
리포지터리는 생성된 데이터베이스 테이블의 데이터들을 저장, 조회, 수정, 삭제 등을 위한 인터페이스.
엔티티와 리포지터리 생성 후 발생한 404 오류 해결하려면 /question/list URL을 매핑하기 위한 컨트롤러가 필요하다.
타임리프를 이용한 템플릿 적용
빌드 그래들 타임리프 추가 및 템플릿 폴더에 html 파일 추가
질문 목록과 관련된 데이터 조회를 위해 repository 사용 및 컨트롤러에서 model 사용

-------------------------*/

package org.mysite.sbb.controller;

import lombok.RequiredArgsConstructor;
import org.mysite.sbb.dao.QuestionRepository;
import org.mysite.sbb.domain.Question;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

// 애너테이션 생성 방식, questionRepository 객체 주입 롬복이 제공
@RequiredArgsConstructor
@Controller
public class QuestionController {

    private final QuestionRepository questionRepository;

    @GetMapping("/question/list")
    public String list(Model model) {
        List<Question> questionList = this.questionRepository.findAll();
        model.addAttribute("questionList", questionList);
        return "question_list";
    }
}
