package models.member;

import commons.Validator;

public class JoinValidator implements Validator<Member> {
    @Override
    public void check(Member member) {
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
