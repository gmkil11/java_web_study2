package models.member.tests;

import models.member.BadRequestException;
import models.member.JoinService;
import models.member.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("회원가입 기능 테스트")
public class JoinServiceTest {
    private JoinService service;
    private Member getMember(){
        Member member = new Member();
        member.setUserId("user" + System.currentTimeMillis());
        member.setUserNm("사용자");
        member.setUserPw("12345678");
        member.setConfirmUserPw(member.getUserPw());

        return member;
    }

    @BeforeEach
    void init(){
        service = new JoinService();

    }
    @Test
    @DisplayName("회원가입 성공 시 예외가 발생하지 않음")
    void joinSuccess(){
        assertDoesNotThrow(()-> {
            Member member = getMember();
            service.join(member);
        });
    }
    @Test
    @DisplayName("필수 항목(userID, userPw, userNm confirmUserPw) 검증, 실패 시 BadRequestException 발생")
    void requiredFields() {
        // userId가 null이거나 빈칸일 때 BadRequestException 을 발생시킨다.
        assertThrows(BadRequestException.class, () -> {
            Member member = getMember();
            member.setUserId(null);
            service.join(member);

            member.setUserId(" ");
            service.join(member);
        });
    }
}
