package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Member member = new Member();
        member.setUserId("user01");
        member.setUserPw("123456");
        member.setUserNm("user01");

        System.out.println(member);

        Member member1 = new Member("user02", "123456", "user02");
        System.out.println(member1);
    }
}
