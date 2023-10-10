package exam01;


import lombok.*;

//@Getter @Setter @ToString
//@AllArgsConstructor // 매개변수로 추가하는 생성자
//@NoArgsConstructor(access = AccessLevel.PRIVATE) // 액세스 레벨을 PRIVATE 로 설정 가능
//@NoArgsConstructor // 기본 생성자
//@EqualsAndHashCode // 두 가지 메서드가 재정의된다.
@Data // @Getter, @Setter, @EqualsAndHashCode, @ToString
public class Member {
    private String userId;

//    @ToString.Exclude
//    @NonNull
    private String userPw;
    private String userNm;


}
