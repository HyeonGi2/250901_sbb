/*-----------------------
250901 홍현기
리포지터리 생성
엔티티가 데이터베이스 테이블 생성,
리포지터리는 생성된 데이터베이스 테이블의 데이터들을 저장, 조회, 수정, 삭제 등을 위한 인터페이스.

public interface AnswerRepository {} => jpaRepository를 상속
-------------------------*/

package org.mysite.sbb.dao;

import org.mysite.sbb.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer,Integer> {

}
