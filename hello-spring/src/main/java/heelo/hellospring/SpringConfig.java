package heelo.hellospring;

import heelo.hellospring.repository.MemberRepository;
import heelo.hellospring.repository.MemoryMemberRepository;
import heelo.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        // 생성자 주입
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
