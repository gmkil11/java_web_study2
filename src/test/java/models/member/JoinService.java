package models.member;

public class JoinService {
    public void join(Member member){
        String userId = member.getUserId();
        if (userId == null || userId.isBlank()){
            throw new BadRequestException("아이디를 입력하세요");
        }

        String userPw = member.getUserPw();
        if (userPw == null || userPw.isBlank()) {
            throw new BadRequestException("패스워드를 입력하세요");
        }
    }
}
