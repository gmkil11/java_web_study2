package models.member.tests;

import models.member.JoinService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("회원가입 기능 테스트")
public class JoinServiceTest {
    @Test
    @DisplayName("회원가입 성공 시 예외가 발생하지 않음")
    void joinSuccess(){
        assertDoesNotThrow(()-> {
            JoinService service = new JoinService();
            service.join();
        });
    }
    @Test
    @DisplayName("필수 항목(userID, userPw, userNm confirmUserPw) 검증, 실패 시 BadRequestException 발생")
    void requiredFields() {

    }
}
