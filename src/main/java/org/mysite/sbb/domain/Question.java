/*-----------------------
250901 홍현기
domain 또는 질문 entity 작성
엔티티로 테이블 매핑
데이터베이스 테이블 생성
-------------------------*/
package org.mysite.sbb.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
// 엔티티로 만들기 위해 @Entity 적용
@Entity
public class Question {

    // id 질문 고유번호, sub 질문 제목, content 질문 내용, createDate 질문 작성 일시
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //(고유번호, 순서대로 1씩증가)
    private Integer id;

    @Column(length = 200) //200자 제한
    private String subject;

    @Column(columnDefinition = "TEXT") //제한 x
    private String content;

    private LocalDateTime createDate;

    //질문에서 답변 참조, 질문 삭제시 답변도 모두 삭제되도록 cascade = CascadeType.REMOVE 사용. https://www.baeldung.com/jpa-cascade-types
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answersList;
}