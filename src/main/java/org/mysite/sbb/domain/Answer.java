/*-----------------------
250901 홍현기
domain 또는 답변 entity 작성
엔티티로 테이블 매핑
데이터베이스 테이블 생성
-------------------------*/

package org.mysite.sbb.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    //ManyToOne 추가하기 하나의 질문에 여러개의 답변이므로 ManyToOne 반대는 OneToMany
    @ManyToOne
    private Question question;
}