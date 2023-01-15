package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //저장소에 저장됨
    Optional<Member> findById(Long id); //Optional은 null을 반환하는 방식
    Optional<Member> findByName(String name);
    List<Member> findAll(); //저장된 모든 회원 리스트 반환
}
