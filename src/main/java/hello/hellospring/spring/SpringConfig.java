package hello.hellospring.spring;

import hello.hellospring.spring.repository.MemberRepository;
import hello.hellospring.spring.repository.MemoryMemberRepository;
import hello.hellospring.spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
