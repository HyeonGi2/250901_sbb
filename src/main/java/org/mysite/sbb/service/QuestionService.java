package org.mysite.sbb.service;

import lombok.RequiredArgsConstructor;
import org.mysite.sbb.dao.QuestionRepository;
import org.mysite.sbb.domain.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getList() {
        return this.questionRepository.findAll();
    }

}
