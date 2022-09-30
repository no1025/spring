package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //저장
    Optional<Member> findById(Long id); //찾기
    Optional<Member> findByName(String name);
    List<Member> findAll();//리스트반환
}
